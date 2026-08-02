package defpackage;

/* loaded from: classes12.dex */
public final class c311 implements o4q0 {
    public final eg01 a;
    public final b311 b;

    public c311(eg01 eg01Var, b311 b311Var) {
        this.a = eg01Var;
        this.b = b311Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c311) {
            c311 c311Var = (c311) obj;
            return jl40.l(this.a, c311Var.a) && this.b == c311Var.b;
        }
        return false;
    }

    public final int hashCode() {
        eg01 eg01Var = this.a;
        return (this.b.hashCode() + ((eg01Var == null ? 0 : eg01Var.hashCode()) * 31)) * 31;
    }

    public final String toString() {
        return "TransportInfoUiState(lead=" + this.a + ", body=" + this.b + ", trail=null)";
    }
}
