package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class cl2 implements ot2 {
    public final int b;
    public final /* synthetic */ fl2 c;

    public cl2(fl2 fl2Var, int i) {
        this.c = fl2Var;
        this.b = i;
    }

    @Override // yads.ot2
    public final void a() {
        fl2 fl2Var = this.c;
        nt2 nt2Var = fl2Var.t[this.b];
        nk0 nk0Var = nt2Var.h;
        if (nk0Var == null || nk0Var.getState() != 1) {
            fl2Var.l.a(fl2Var.e.a(fl2Var.C));
        } else {
            mk0 c = nt2Var.h.c();
            c.getClass();
            throw c;
        }
    }

    @Override // yads.ot2
    public final boolean isReady() {
        fl2 fl2Var = this.c;
        return !fl2Var.E && fl2Var.I == C.TIME_UNSET && fl2Var.t[this.b].a(fl2Var.L);
    }

    @Override // yads.ot2
    public final int a(ox0 ox0Var, sa0 sa0Var, int i) {
        fl2 fl2Var = this.c;
        int i2 = this.b;
        if (fl2Var.E || fl2Var.I != C.TIME_UNSET) {
            return -3;
        }
        fl2Var.c();
        el2 el2Var = fl2Var.y;
        boolean[] zArr = el2Var.d;
        if (!zArr[i2]) {
            nx0 nx0Var = el2Var.a.a(i2).e[0];
            co1 co1Var = fl2Var.f;
            co1Var.a(new in1(1, iu1.d(nx0Var.m), nx0Var, 0, null, co1Var.a(fl2Var.H), C.TIME_UNSET));
            zArr[i2] = true;
        }
        int a = fl2Var.t[i2].a(ox0Var, sa0Var, i, fl2Var.L);
        if (a == -3) {
            fl2Var.a(i2);
        }
        return a;
    }

    @Override // yads.ot2
    public final int a(long j) {
        fl2 fl2Var = this.c;
        int i = this.b;
        if (fl2Var.E || fl2Var.I != C.TIME_UNSET) {
            return 0;
        }
        fl2Var.c();
        el2 el2Var = fl2Var.y;
        boolean[] zArr = el2Var.d;
        if (!zArr[i]) {
            nx0 nx0Var = el2Var.a.a(i).e[0];
            co1 co1Var = fl2Var.f;
            co1Var.a(new in1(1, iu1.d(nx0Var.m), nx0Var, 0, null, co1Var.a(fl2Var.H), C.TIME_UNSET));
            zArr[i] = true;
        }
        nt2 nt2Var = fl2Var.t[i];
        int a = nt2Var.a(j, fl2Var.L);
        synchronized (nt2Var) {
            if (a >= 0) {
                int i2 = nt2Var.s + a;
                if (i2 <= nt2Var.p) {
                    nt2Var.s = i2;
                }
            }
            throw new IllegalArgumentException();
        }
        if (a == 0) {
            fl2Var.a(i);
        }
        return a;
    }
}
