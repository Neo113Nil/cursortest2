package xsna;

/* compiled from: Padding.kt */
/* loaded from: classes11.dex */
final class t890 extends d730<w890> {
    public final s890 a;

    public t890(s890 s890Var, qi00 qi00Var) {
        this.a = s890Var;
    }

    public final boolean equals(Object obj) {
        t890 t890Var = obj instanceof t890 ? (t890) obj : null;
        if (t890Var == null) {
            return false;
        }
        return epx.f(this.a, t890Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final w890 r() {
        w890 w890Var = new w890();
        w890Var.p = this.a;
        return w890Var;
    }

    @Override // xsna.d730
    public final void s(w890 w890Var) {
        w890Var.p = this.a;
    }
}
