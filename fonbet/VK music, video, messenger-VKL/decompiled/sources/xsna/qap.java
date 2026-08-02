package xsna;

import android.os.SystemClock;

/* compiled from: ElapsedTimeCounter.java */
/* loaded from: classes17.dex */
public final class qap {
    public long a = 0;
    public long b = 0;
    public long c = 0;
    public boolean d = false;

    public final long a() {
        if (!this.d) {
            return this.b;
        }
        return (SystemClock.elapsedRealtime() - this.c) + this.b;
    }

    public final void b() {
        if (this.d) {
            this.d = false;
            this.b = (SystemClock.elapsedRealtime() - this.c) + this.b;
            this.c = 0L;
        }
    }
}
