package ru.ok.android.webrtc.protocol.screenshare.recv.stat;

import ru.ok.android.webrtc.utils.time.TimeProvider;

/* loaded from: classes9.dex */
public final class FreezeStatEstimator {
    public final TimeProvider a;
    public final long b;
    public Long c;
    public volatile FreezeStat d = new FreezeStat(0, 0);

    public FreezeStatEstimator(TimeProvider timeProvider, long j) {
        this.a = timeProvider;
        this.b = j;
    }

    public final FreezeStat getFreezeStat() {
        return this.d;
    }

    public final void onFrameStart() {
        long msSinceBoot = this.a.getMsSinceBoot();
        Long l = this.c;
        if (l != null) {
            long longValue = msSinceBoot - l.longValue();
            if (longValue > this.b) {
                FreezeStat freezeStat = this.d;
                this.d = new FreezeStat(freezeStat.getFreezeCount() + 1, freezeStat.getTotalFreezeDuration() + longValue);
            }
        }
        this.c = Long.valueOf(msSinceBoot);
    }
}
