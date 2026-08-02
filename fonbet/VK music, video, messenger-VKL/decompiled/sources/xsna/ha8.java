package xsna;

/* compiled from: Box.kt */
/* loaded from: classes11.dex */
final class ha8 extends d730<ia8> {
    public final dt1 a;
    public final boolean b;
    public final izs<z5x, s3q0> c;

    /* JADX WARN: Multi-variable type inference failed */
    public ha8(dt1 dt1Var, boolean z, izs<? super z5x, s3q0> izsVar) {
        this.a = dt1Var;
        this.b = z;
        this.c = izsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ha8 ha8Var = obj instanceof ha8 ? (ha8) obj : null;
        return ha8Var != null && epx.f(this.a, ha8Var.a) && this.b == ha8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // xsna.d730
    public final ia8 r() {
        ia8 ia8Var = new ia8();
        ia8Var.p = this.a;
        ia8Var.q = this.b;
        return ia8Var;
    }

    @Override // xsna.d730
    public final void s(ia8 ia8Var) {
        ia8 ia8Var2 = ia8Var;
        ia8Var2.p = this.a;
        ia8Var2.q = this.b;
    }
}
