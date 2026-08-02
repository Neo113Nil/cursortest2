package yads;

import android.os.SystemClock;

/* loaded from: classes10.dex */
public final class n43 implements al1 {
    public final xv b;
    public boolean c;
    public long d;
    public long e;
    public ff2 f = ff2.e;

    public n43(j63 j63Var) {
        this.b = j63Var;
    }

    @Override // yads.al1
    public final long a() {
        long j = this.d;
        if (!this.c) {
            return j;
        }
        ((j63) this.b).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.e;
        return (this.f.b == 1.0f ? mc3.a(elapsedRealtime) : elapsedRealtime * r4.d) + j;
    }

    @Override // yads.al1
    public final ff2 getPlaybackParameters() {
        return this.f;
    }

    public final void a(long j) {
        this.d = j;
        if (this.c) {
            ((j63) this.b).getClass();
            this.e = SystemClock.elapsedRealtime();
        }
    }

    @Override // yads.al1
    public final void a(ff2 ff2Var) {
        if (this.c) {
            a(a());
        }
        this.f = ff2Var;
    }
}
