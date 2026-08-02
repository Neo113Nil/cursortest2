package xsna;

/* compiled from: AndroidTextStyle.android.kt */
/* loaded from: classes11.dex */
public final class rua0 {
    public final hua0 a;
    public final yta0 b;

    public rua0(hua0 hua0Var, yta0 yta0Var) {
        this.a = hua0Var;
        this.b = yta0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rua0)) {
            return false;
        }
        rua0 rua0Var = (rua0) obj;
        return epx.f(this.b, rua0Var.b) && epx.f(this.a, rua0Var.a);
    }

    public final int hashCode() {
        hua0 hua0Var = this.a;
        int hashCode = (hua0Var != null ? hua0Var.hashCode() : 0) * 31;
        yta0 yta0Var = this.b;
        return hashCode + (yta0Var != null ? yta0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }

    public rua0() {
        this(null, new yta0(0));
    }
}
