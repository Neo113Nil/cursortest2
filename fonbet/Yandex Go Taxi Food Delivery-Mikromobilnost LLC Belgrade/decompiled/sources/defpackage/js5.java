package defpackage;

/* loaded from: classes2.dex */
public final class js5 {
    public final ns5 a;
    public final hs5 b;

    public js5(ns5 ns5Var, hs5 hs5Var) {
        this.a = ns5Var;
        this.b = hs5Var;
    }

    public final hs5 a() {
        return this.b;
    }

    public final ns5 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js5)) {
            return false;
        }
        js5 js5Var = (js5) obj;
        return jl40.l(this.a, js5Var.a) && jl40.l(this.b, js5Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hs5 hs5Var = this.b;
        return hashCode + (hs5Var == null ? 0 : hs5Var.hashCode());
    }

    public final String toString() {
        return "BillingConfigResult(billingResult=" + this.a + ", billingConfig=" + this.b + ')';
    }
}
