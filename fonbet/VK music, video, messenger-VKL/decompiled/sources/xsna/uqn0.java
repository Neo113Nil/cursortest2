package xsna;

import android.os.SystemClock;

/* compiled from: Measurement.kt */
/* loaded from: classes17.dex */
public final class uqn0 {
    public Long a;
    public Long b;

    public final long a() {
        Long l = this.a;
        if (l != null) {
            long longValue = l.longValue();
            Long l2 = this.b;
            if (l2 != null) {
                return l2.longValue() - longValue;
            }
        }
        return -1L;
    }

    public final void b() {
        this.a = null;
        this.b = null;
        this.a = Long.valueOf(SystemClock.elapsedRealtime());
    }

    public final void c() {
        if (this.a != null) {
            this.b = Long.valueOf(SystemClock.elapsedRealtime());
        }
    }
}
