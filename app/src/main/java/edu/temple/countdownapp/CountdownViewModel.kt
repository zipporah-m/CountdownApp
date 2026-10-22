package edu.temple.countdownapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.milliseconds

class CountdownViewModel : ViewModel() {
    var counter by mutableIntStateOf(100)

    fun startCountdown (){
        viewModelScope.launch {
            repeat(100) {
                counter = 100 - it
                delay(1000.milliseconds)
            }
        }
    }
}