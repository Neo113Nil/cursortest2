package xsna;

/* compiled from: WindowInsetsPadding.kt */
/* loaded from: classes11.dex */
final class o4x extends d730<q4x> {
    public final zpx0 a;
    public final izs<z5x, s3q0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public o4x(zpx0 zpx0Var, izs<? super z5x, s3q0> izsVar) {
        this.a = zpx0Var;
        this.b = izsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o4x) {
            return epx.f(((o4x) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final q4x r() {
        return new q4x(this.a);
    }

    @Override // xsna.d730
    public final void s(q4x q4xVar) {
        q4x q4xVar2 = q4xVar;
        zpx0 zpx0Var = q4xVar2.r;
        zpx0 zpx0Var2 = this.a;
        if (epx.f(zpx0Var2, zpx0Var)) {
            return;
        }
        q4xVar2.r = zpx0Var2;
        q4xVar2.j2();
    }
}
