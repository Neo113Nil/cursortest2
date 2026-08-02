package io.appmetrica.analytics.coreutils.internal.time;

/* loaded from: classes8.dex */
public final class TimePassedChecker {
    private final TimeProvider a;

    public TimePassedChecker(TimeProvider timeProvider) {
        this.a = timeProvider;
    }

    public final boolean didTimePassMillis(long j, long j2, String str) {
        long currentTimeMillis = this.a.currentTimeMillis();
        return currentTimeMillis < j || currentTimeMillis - j >= j2;
    }

    public final boolean didTimePassSeconds(long j, long j2, String str) {
        long currentTimeSeconds = this.a.currentTimeSeconds();
        return currentTimeSeconds < j || currentTimeSeconds - j >= j2;
    }

    public TimePassedChecker() {
        this(new SystemTimeProvider());
    }
}
