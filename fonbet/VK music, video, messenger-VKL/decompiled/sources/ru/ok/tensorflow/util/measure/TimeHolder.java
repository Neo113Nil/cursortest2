package ru.ok.tensorflow.util.measure;

import android.util.Pair;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import ru.ok.tensorflow.util.measure.Timer;
import xsna.fw3;

/* loaded from: classes9.dex */
public class TimeHolder {
    private static Map<Pair<Object, String>, Timer> timerMap = new HashMap();

    public static Timer getAndStartTimer(Object obj, String str) {
        StringBuilder e = fw3.e(str);
        e.append(Thread.currentThread().getId());
        Pair<Object, String> pair = new Pair<>(obj, e.toString());
        if (!timerMap.containsKey(pair)) {
            timerMap.put(pair, new Timer());
        }
        Timer timer = timerMap.get(pair);
        timer.start();
        return timer;
    }

    public static Timer.Result measureTime(Object obj, String str, @NonNull Runnable runnable) {
        Pair<Object, String> pair = new Pair<>(obj, str);
        if (!timerMap.containsKey(pair)) {
            timerMap.put(pair, new Timer());
        }
        return timerMap.get(pair).measureTime(runnable);
    }
}
