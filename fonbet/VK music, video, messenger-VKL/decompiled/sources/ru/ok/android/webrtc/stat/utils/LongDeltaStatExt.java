package ru.ok.android.webrtc.stat.utils;

/* loaded from: classes9.dex */
public final class LongDeltaStatExt {
    public Long a;

    public final void reset() {
        this.a = null;
    }

    public final Long update(Long l) {
        if (l == null) {
            reset();
            return null;
        }
        if (l.longValue() < 0) {
            reset();
            return null;
        }
        Long l2 = this.a;
        this.a = l;
        if (l2 != null && l.longValue() >= l2.longValue()) {
            return Long.valueOf(l.longValue() - l2.longValue());
        }
        return null;
    }
}
