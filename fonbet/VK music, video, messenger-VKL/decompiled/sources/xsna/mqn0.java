package xsna;

/* compiled from: WindowInsetsPadding.android.kt */
/* loaded from: classes11.dex */
final class mqn0 extends d730<nqn0> {
    public final izs<z5x, s3q0> a;
    public final izs<yqx0, zpx0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public mqn0(izs<? super z5x, s3q0> izsVar, izs<? super yqx0, ? extends zpx0> izsVar2) {
        this.a = izsVar;
        this.b = izsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mqn0) {
            return this.b == ((mqn0) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.d730
    public final nqn0 r() {
        nqn0 nqn0Var = new nqn0(ao8.e);
        nqn0Var.s = this.b;
        return nqn0Var;
    }

    @Override // xsna.d730
    public final void s(nqn0 nqn0Var) {
        nqn0 nqn0Var2 = nqn0Var;
        izs<? super yqx0, ? extends zpx0> izsVar = nqn0Var2.s;
        izs<yqx0, zpx0> izsVar2 = this.b;
        if (izsVar != izsVar2) {
            nqn0Var2.s = izsVar2;
            yqx0 yqx0Var = nqn0Var2.t;
            if (yqx0Var != null) {
                zpx0 invoke = izsVar2.invoke(yqx0Var);
                if (epx.f(invoke, nqn0Var2.r)) {
                    return;
                }
                nqn0Var2.r = invoke;
                nqn0Var2.j2();
            }
        }
    }
}
