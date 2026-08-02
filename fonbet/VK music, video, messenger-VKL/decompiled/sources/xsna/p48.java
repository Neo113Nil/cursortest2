package xsna;

/* compiled from: BottomBarViewState.kt */
/* loaded from: classes7.dex */
public final class p48 {
    public final b48 a;
    public final b48 b;

    public p48(b48 b48Var, b48 b48Var2) {
        this.a = b48Var;
        this.b = b48Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p48)) {
            return false;
        }
        p48 p48Var = (p48) obj;
        return epx.f(this.a, p48Var.a) && epx.f(this.b, p48Var.b);
    }

    public final int hashCode() {
        b48 b48Var = this.a;
        return this.b.hashCode() + ((b48Var == null ? 0 : b48Var.hashCode()) * 31);
    }

    public final String toString() {
        return "BottomBarViewState(leftButtonVs=" + this.a + ", rightButtonVs=" + this.b + ')';
    }
}
