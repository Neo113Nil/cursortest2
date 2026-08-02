package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class jz extends jo {
    public final int o;
    public final long p;
    public final fu q;
    public long r;
    public volatile boolean s;
    public boolean t;

    public jz(p30 p30Var, u30 u30Var, nx0 nx0Var, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, fu fuVar) {
        super(p30Var, u30Var, nx0Var, i, obj, j, j2, j3, j4, j5);
        this.o = i2;
        this.p = j6;
        this.q = fuVar;
    }

    @Override // yads.ch1
    public final void a() {
        int a;
        if (this.r == 0) {
            lo loVar = this.m;
            if (loVar == null) {
                throw new IllegalStateException();
            }
            long j = this.p;
            for (nt2 nt2Var : loVar.b) {
                if (nt2Var.E != j) {
                    nt2Var.E = j;
                    nt2Var.z = true;
                }
            }
            fu fuVar = this.q;
            long j2 = this.k;
            long j3 = C.TIME_UNSET;
            long j4 = j2 == C.TIME_UNSET ? -9223372036854775807L : j2 - this.p;
            long j5 = this.l;
            if (j5 != C.TIME_UNSET) {
                j3 = j5 - this.p;
            }
            ((ar) fuVar).a(loVar, j4, j3);
        }
        try {
            u30 u30Var = this.b;
            long j6 = this.r;
            long j7 = u30Var.g;
            long j8 = -1;
            if (j7 != -1) {
                j8 = j7 - j6;
            }
            u30 a2 = u30Var.a(j6, j8);
            v43 v43Var = this.i;
            ld0 ld0Var = new ld0(v43Var, a2.f, v43Var.a(a2));
            do {
                try {
                    if (this.s) {
                        break;
                    }
                    a = ((ar) this.q).b.a(ld0Var, ar.l);
                    if (a == 1) {
                        throw new IllegalStateException();
                    }
                } finally {
                    this.r = ld0Var.d - this.b.f;
                }
            } while (a == 0);
            s30.a(this.i);
            this.t = !this.s;
        } catch (Throwable th) {
            s30.a(this.i);
            throw th;
        }
    }

    @Override // yads.ch1
    public final void b() {
        this.s = true;
    }

    @Override // yads.jo
    public final long c() {
        return this.j + this.o;
    }

    @Override // yads.jo
    public final boolean d() {
        return this.t;
    }
}
