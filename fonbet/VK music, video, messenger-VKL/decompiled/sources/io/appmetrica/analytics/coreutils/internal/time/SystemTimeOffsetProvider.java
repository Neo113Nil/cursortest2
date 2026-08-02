package io.appmetrica.analytics.coreutils.internal.time;

import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class SystemTimeOffsetProvider {
    private final SystemTimeProvider a;

    public SystemTimeOffsetProvider(SystemTimeProvider systemTimeProvider) {
        this.a = systemTimeProvider;
    }

    public final long elapsedRealtimeOffset(long j, TimeUnit timeUnit) {
        return this.a.elapsedRealtime() - timeUnit.toMillis(j);
    }

    public final long elapsedRealtimeOffsetInSeconds(long j, TimeUnit timeUnit) {
        return TimeUnit.MILLISECONDS.toSeconds(elapsedRealtimeOffset(j, timeUnit));
    }

    public final long offsetInSecondsIfNotZero(long j, TimeUnit timeUnit) {
        if (j == 0) {
            return 0L;
        }
        return this.a.currentTimeSeconds() - timeUnit.toSeconds(j);
    }

    public final long systemNanoTimeOffsetInNanos(long j, TimeUnit timeUnit) {
        return this.a.systemNanoTime() - timeUnit.toNanos(j);
    }

    public final long systemNanoTimeOffsetInSeconds(long j, TimeUnit timeUnit) {
        return TimeUnit.NANOSECONDS.toSeconds(systemNanoTimeOffsetInNanos(j, timeUnit));
    }

    public SystemTimeOffsetProvider() {
        this(new SystemTimeProvider());
    }
}
