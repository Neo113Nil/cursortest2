package xsna;

/* compiled from: ChildParentSemantics.kt */
/* loaded from: classes11.dex */
public final class ri90 extends d730<qi90> {
    public final jh3 a;

    public ri90(jh3 jh3Var) {
        this.a = jh3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ri90) {
            return this.a == ((ri90) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final qi90 r() {
        return new qi90(this.a);
    }

    @Override // xsna.d730
    public final void s(qi90 qi90Var) {
        qi90 qi90Var2 = qi90Var;
        qi90Var2.p = this.a;
        itl.f(qi90Var2).R();
    }
}
