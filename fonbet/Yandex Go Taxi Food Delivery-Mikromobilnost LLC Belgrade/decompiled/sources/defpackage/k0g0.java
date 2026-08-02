package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class k0g0 {
    public final ns5 a;
    public final List b;

    public k0g0(ns5 ns5Var, List list) {
        this.a = ns5Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0g0)) {
            return false;
        }
        k0g0 k0g0Var = (k0g0) obj;
        return jl40.l(this.a, k0g0Var.a) && jl40.l(this.b, k0g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PurchasesResult(billingResult=");
        sb.append(this.a);
        sb.append(", purchasesList=");
        return unr0.t(sb, this.b, ')');
    }
}
