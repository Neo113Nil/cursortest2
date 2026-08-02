package defpackage;

/* loaded from: classes5.dex */
public final class hg30 {
    public final su30 a;
    public final su30 b;
    public final fay0 c;
    public final kf30 d;
    public final mz30 e;
    public final boolean f;
    public final q6s0 g;
    public final tpr h;
    public final boolean i;
    public final boolean j;
    public final xi40 k;

    public hg30(su30 su30Var, su30 su30Var2, fay0 fay0Var, kf30 kf30Var, mz30 mz30Var, boolean z, q6s0 q6s0Var, tpr tprVar, boolean z2, boolean z3, xi40 xi40Var, int i) {
        su30Var2 = (i & 2) != 0 ? null : su30Var2;
        q6s0Var = (i & 64) != 0 ? new q6s0(true, true) : q6s0Var;
        z2 = (i & 256) != 0 ? false : z2;
        z3 = (i & 512) != 0 ? true : z3;
        xi40Var = (i & 1024) != 0 ? wfz.B : xi40Var;
        this.a = su30Var;
        this.b = su30Var2;
        this.c = fay0Var;
        this.d = kf30Var;
        this.e = mz30Var;
        this.f = z;
        this.g = q6s0Var;
        this.h = tprVar;
        this.i = z2;
        this.j = z3;
        this.k = xi40Var;
    }
}
