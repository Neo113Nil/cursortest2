package ru.ok.tracer.base.time;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* compiled from: PrecisionClock.kt */
/* loaded from: classes9.dex */
public final class PrecisionClock {
    public static final PrecisionClock INSTANCE = new PrecisionClock();
    private static final long epochNanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    private static final long nanoTime = SystemClock.elapsedRealtimeNanos();

    private PrecisionClock() {
    }

    public static final long currentTimeNanos() {
        return (SystemClock.elapsedRealtimeNanos() + epochNanos) - nanoTime;
    }
}
