package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class u61 extends cu {
    public final fu j;
    public eu k;
    public long l;
    public volatile boolean m;

    public u61(p30 p30Var, u30 u30Var, nx0 nx0Var, int i, Object obj, fu fuVar) {
        super(p30Var, u30Var, 2, nx0Var, i, obj, C.TIME_UNSET, C.TIME_UNSET);
        this.j = fuVar;
    }

    @Override // yads.ch1
    public final void a() {
        if (this.l == 0) {
            ((ar) this.j).a(this.k, C.TIME_UNSET, C.TIME_UNSET);
        }
        try {
            u30 u30Var = this.b;
            long j = this.l;
            long j2 = u30Var.g;
            long j3 = -1;
            if (j2 != -1) {
                j3 = j2 - j;
            }
            u30 a = u30Var.a(j, j3);
            v43 v43Var = this.i;
            ld0 ld0Var = new ld0(v43Var, a.f, v43Var.a(a));
            while (!this.m) {
                try {
                    int a2 = ((ar) this.j).b.a(ld0Var, ar.l);
                    if (a2 == 1) {
                        throw new IllegalStateException();
                    }
                    if (a2 != 0) {
                        break;
                    }
                } finally {
                    this.l = ld0Var.d - this.b.f;
                }
            }
        } finally {
            s30.a(this.i);
        }
    }

    @Override // yads.ch1
    public final void b() {
        this.m = true;
    }
}
