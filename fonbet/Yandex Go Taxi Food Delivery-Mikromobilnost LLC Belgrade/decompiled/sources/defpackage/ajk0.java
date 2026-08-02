package defpackage;

/* loaded from: classes14.dex */
public final class ajk0 {
    public static final ajk0 e;
    public final xss0 a;
    public final boolean b;
    public final kdc c;
    public final wrs0 d;

    static {
        xss0 xss0Var = xss0.f;
        wrs0.a.getClass();
        e = new ajk0(xss0Var, false, null, vrs0.b);
    }

    public ajk0(xss0 xss0Var, boolean z, kdc kdcVar, wrs0 wrs0Var) {
        this.a = xss0Var;
        this.b = z;
        this.c = kdcVar;
        this.d = wrs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajk0)) {
            return false;
        }
        ajk0 ajk0Var = (ajk0) obj;
        return jl40.l(this.a, ajk0Var.a) && this.b == ajk0Var.b && jl40.l(this.c, ajk0Var.c) && jl40.l(this.d, ajk0Var.d);
    }

    public final int hashCode() {
        int e2 = unr0.e(this.a.hashCode() * 31, 31, this.b);
        kdc kdcVar = this.c;
        return Boolean.hashCode(false) + ((this.d.hashCode() + ((e2 + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "ComposeUiState(uiState=" + this.a + ", isLoading=" + this.b + ", backgroundColor=" + this.c + ", analytics=" + this.d + ", showBadge=false)";
    }
}
