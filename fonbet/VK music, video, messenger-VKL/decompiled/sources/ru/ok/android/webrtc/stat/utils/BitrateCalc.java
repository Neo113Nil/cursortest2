package ru.ok.android.webrtc.stat.utils;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class BitrateCalc {
    public long a;
    public long b;

    public static /* synthetic */ double update$default(BitrateCalc bitrateCalc, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = SystemClock.elapsedRealtime();
        }
        return bitrateCalc.update(j, j2);
    }

    public final void reset() {
        this.a = 0L;
        this.b = 0L;
    }

    public final double update(long j, long j2) {
        double millis;
        long j3 = j - this.a;
        if (j3 < 0) {
            j3 = 0;
        }
        long j4 = this.b;
        if (j4 == 0) {
            millis = Double.NaN;
        } else {
            long j5 = j2 - j4;
            if (j5 < 1) {
                j5 = 1;
            }
            millis = (TimeUnit.SECONDS.toMillis(1L) * j3) / j5;
        }
        this.a = j;
        this.b = j2;
        return millis * 8;
    }
}
