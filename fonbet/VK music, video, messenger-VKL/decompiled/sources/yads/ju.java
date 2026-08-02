package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class ju implements ot2 {
    public final lu b;
    public final nt2 c;
    public final int d;
    public boolean e;
    public final /* synthetic */ lu f;

    public ju(lu luVar, lu luVar2, nt2 nt2Var, int i) {
        this.f = luVar;
        this.b = luVar2;
        this.c = nt2Var;
        this.d = i;
    }

    @Override // yads.ot2
    public final void a() {
    }

    @Override // yads.ot2
    public final boolean isReady() {
        return !this.f.c() && this.c.a(this.f.x);
    }

    @Override // yads.ot2
    public final int a(ox0 ox0Var, sa0 sa0Var, int i) {
        if (this.f.c()) {
            return -3;
        }
        jo joVar = this.f.w;
        if (joVar != null) {
            int a = joVar.a(this.d + 1);
            nt2 nt2Var = this.c;
            if (a <= nt2Var.q + nt2Var.s) {
                return -3;
            }
        }
        if (!this.e) {
            lu luVar = this.f;
            co1 co1Var = luVar.h;
            int[] iArr = luVar.c;
            int i2 = this.d;
            co1Var.a(new in1(1, iArr[i2], luVar.d[i2], 0, null, co1Var.a(luVar.u), C.TIME_UNSET));
            this.e = true;
        }
        return this.c.a(ox0Var, sa0Var, i, this.f.x);
    }

    @Override // yads.ot2
    public final int a(long j) {
        if (this.f.c()) {
            return 0;
        }
        int a = this.c.a(j, this.f.x);
        jo joVar = this.f.w;
        if (joVar != null) {
            int a2 = joVar.a(this.d + 1);
            nt2 nt2Var = this.c;
            a = Math.min(a, a2 - (nt2Var.q + nt2Var.s));
        }
        nt2 nt2Var2 = this.c;
        synchronized (nt2Var2) {
            if (a >= 0) {
                int i = nt2Var2.s + a;
                if (i <= nt2Var2.p) {
                    nt2Var2.s = i;
                }
            }
            throw new IllegalArgumentException();
        }
        if (a > 0 && !this.e) {
            lu luVar = this.f;
            co1 co1Var = luVar.h;
            int[] iArr = luVar.c;
            int i2 = this.d;
            co1Var.a(new in1(1, iArr[i2], luVar.d[i2], 0, null, co1Var.a(luVar.u), C.TIME_UNSET));
            this.e = true;
        }
        return a;
    }
}
