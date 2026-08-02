package ru.ok.android.webrtc.utils;

import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import ru.ok.android.webrtc.RTCLog;

/* loaded from: classes9.dex */
public final class CodeBlockDurationLogger {
    public final RTCLog a;
    public long b;

    public CodeBlockDurationLogger(@NonNull RTCLog rTCLog) {
        this.a = rTCLog;
    }

    public void logTime(@NonNull String str) {
        logTime("CodeBlockDurationLogger", str);
    }

    public void startMeasure() {
        this.b = System.nanoTime();
    }

    public void logTime(@NonNull String str, @NonNull String str2) {
        long seconds = TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - this.b);
        float nanos = (r0 - TimeUnit.SECONDS.toNanos(seconds)) / TimeUnit.MILLISECONDS.toNanos(1L);
        String format = seconds == 0 ? String.format(Locale.ROOT, "%.1f ms", Float.valueOf(nanos)) : String.format(Locale.ROOT, "%d seconds and %.1f ms", Long.valueOf(seconds), Float.valueOf(nanos));
        this.a.log(str, str2 + " completed in " + format);
    }
}
