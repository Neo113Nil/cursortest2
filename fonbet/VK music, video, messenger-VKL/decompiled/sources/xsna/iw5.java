package xsna;

/* compiled from: Background.kt */
/* loaded from: classes11.dex */
final class iw5 extends d730<dx5> {
    public final long a;
    public final yk8 b;
    public final float c;
    public final r5j0 d;
    public final izs<z5x, s3q0> e;

    public iw5() {
        throw null;
    }

    public iw5(long j, yk8 yk8Var, float f, r5j0 r5j0Var, izs izsVar, int i) {
        j = (i & 1) != 0 ? l5g.k : j;
        yk8Var = (i & 2) != 0 ? null : yk8Var;
        this.a = j;
        this.b = yk8Var;
        this.c = f;
        this.d = r5j0Var;
        this.e = izsVar;
    }

    public final boolean equals(Object obj) {
        iw5 iw5Var = obj instanceof iw5 ? (iw5) obj : null;
        return iw5Var != null && l5g.d(this.a, iw5Var.a) && epx.f(this.b, iw5Var.b) && this.c == iw5Var.c && epx.f(this.d, iw5Var.d);
    }

    public final int hashCode() {
        int i = l5g.l;
        int hashCode = Long.hashCode(this.a) * 31;
        yk8 yk8Var = this.b;
        return this.d.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.c, (hashCode + (yk8Var != null ? yk8Var.hashCode() : 0)) * 31, 31);
    }

    @Override // xsna.d730
    public final dx5 r() {
        dx5 dx5Var = new dx5();
        dx5Var.p = this.a;
        dx5Var.q = this.b;
        dx5Var.r = this.c;
        dx5Var.s = this.d;
        dx5Var.t = 9205357640488583168L;
        return dx5Var;
    }

    @Override // xsna.d730
    public final void s(dx5 dx5Var) {
        dx5 dx5Var2 = dx5Var;
        dx5Var2.p = this.a;
        dx5Var2.q = this.b;
        dx5Var2.r = this.c;
        r5j0 r5j0Var = dx5Var2.s;
        r5j0 r5j0Var2 = this.d;
        if (!epx.f(r5j0Var, r5j0Var2)) {
            dx5Var2.s = r5j0Var2;
            itl.f(dx5Var2).R();
        }
        mio.a(dx5Var2);
    }
}
