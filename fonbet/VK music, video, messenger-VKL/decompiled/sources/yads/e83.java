package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class e83 {
    public final String a;
    public final nu2 b;

    public e83(String str, nu2 nu2Var) {
        this.a = str;
        this.b = nu2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e83)) {
            return false;
        }
        e83 e83Var = (e83) obj;
        return epx.f(this.a, e83Var.a) && this.b == e83Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        nu2 nu2Var = this.b;
        return hashCode + (nu2Var != null ? nu2Var.hashCode() : 0);
    }

    public final String toString() {
        return "TokenResult(bidderToken=" + this.a + ", stubReason=" + this.b + ")";
    }
}
