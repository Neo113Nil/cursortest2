package ru.ok.android.webrtc.stat.utils;

import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes9.dex */
public final class LossCalc {
    public long a;
    public long b;
    public long c;
    public long d;

    public final long getLostDiff() {
        return this.c;
    }

    public final long getSentDiff() {
        return this.d;
    }

    public final void reset() {
        this.a = 0L;
        this.b = 0L;
    }

    public final double update(long j, long j2) {
        long j3 = j - this.a;
        if (j3 < 0) {
            j3 = 0;
        }
        this.c = j3;
        long j4 = j2 - this.b;
        if (j4 < 0) {
            j4 = 0;
        }
        this.d = j4;
        double d = (j4 == 0 && j3 == 0) ? ConnectivityTracker.DEFAULT_UPLINK_BITRATE : j3 / (j4 + j3);
        this.a = j;
        this.b = j2;
        return d;
    }
}
