package ru.ok.android.webrtc.stat.call.time;

import android.os.SystemClock;

/* loaded from: classes9.dex */
public final class TimeDelta {
    public Long a;

    public final Long getTimeDeltaMs() {
        Long l = this.a;
        Long valueOf = l == null ? null : Long.valueOf(SystemClock.elapsedRealtime() - l.longValue());
        this.a = Long.valueOf(SystemClock.elapsedRealtime());
        return valueOf;
    }

    public final void reset() {
        this.a = null;
    }
}
