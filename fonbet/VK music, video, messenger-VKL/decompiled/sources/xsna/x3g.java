package xsna;

/* compiled from: CollapsableHeaderViewState.kt */
/* loaded from: classes6.dex */
public final class x3g {
    public final keb0 a;
    public final w7b0 b;

    public x3g(keb0 keb0Var, w7b0 w7b0Var) {
        this.a = keb0Var;
        this.b = w7b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3g)) {
            return false;
        }
        x3g x3gVar = (x3g) obj;
        return epx.f(this.a, x3gVar.a) && epx.f(this.b, x3gVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        w7b0 w7b0Var = this.b;
        return hashCode + (w7b0Var == null ? 0 : w7b0Var.hashCode());
    }

    public final String toString() {
        return "CollapsableHeaderViewState(toolbarState=" + this.a + ", buttonsViewState=" + this.b + ')';
    }
}
