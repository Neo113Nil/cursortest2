package ru.ok.call_effects.internal;

import android.os.SystemClock;

/* compiled from: TimeIntervalValidator.kt */
/* loaded from: classes9.dex */
public final class TimeIntervalValidator {
    private final long delayInMills;
    private long lastReactionTimeStamp;

    public TimeIntervalValidator(long j) {
        this.delayInMills = j;
    }

    public final boolean checkIsTimeIntervalPassed() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.lastReactionTimeStamp;
        boolean z = j == 0 || elapsedRealtime - j > this.delayInMills;
        if (z) {
            this.lastReactionTimeStamp = elapsedRealtime;
        }
        return z;
    }
}
