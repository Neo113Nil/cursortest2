package defpackage;

/* loaded from: classes.dex */
public final class iwc0 {
    public final dwc0 a;
    public final tvc0 b;

    public iwc0(boolean z) {
        this(null, new tvc0(z));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwc0)) {
            return false;
        }
        iwc0 iwc0Var = (iwc0) obj;
        return jl40.l(this.b, iwc0Var.b) && jl40.l(this.a, iwc0Var.a);
    }

    public final int hashCode() {
        dwc0 dwc0Var = this.a;
        int hashCode = (dwc0Var != null ? dwc0Var.hashCode() : 0) * 31;
        tvc0 tvc0Var = this.b;
        return hashCode + (tvc0Var != null ? tvc0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }

    public iwc0(dwc0 dwc0Var, tvc0 tvc0Var) {
        this.a = dwc0Var;
        this.b = tvc0Var;
    }
}
