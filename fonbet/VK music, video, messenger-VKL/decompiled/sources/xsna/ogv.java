package xsna;

/* compiled from: Hoverable.kt */
/* loaded from: classes11.dex */
final class ogv extends d730<sgv> {
    public final sg50 a;

    public ogv(sg50 sg50Var) {
        this.a = sg50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ogv) && epx.f(((ogv) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // xsna.d730
    public final sgv r() {
        sgv sgvVar = new sgv();
        sgvVar.p = this.a;
        return sgvVar;
    }

    @Override // xsna.d730
    public final void s(sgv sgvVar) {
        sgv sgvVar2 = sgvVar;
        sg50 sg50Var = sgvVar2.p;
        sg50 sg50Var2 = this.a;
        if (epx.f(sg50Var, sg50Var2)) {
            return;
        }
        sgvVar2.k2();
        sgvVar2.p = sg50Var2;
    }
}
