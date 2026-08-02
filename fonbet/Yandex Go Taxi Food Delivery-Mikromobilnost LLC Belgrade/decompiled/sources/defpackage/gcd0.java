package defpackage;

/* loaded from: classes8.dex */
public final class gcd0 {
    public final Object a;
    public final hcd0 b;

    public gcd0(Object obj, hcd0 hcd0Var) {
        this.a = obj;
        this.b = hcd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcd0)) {
            return false;
        }
        gcd0 gcd0Var = (gcd0) obj;
        return jl40.l(this.a, gcd0Var.a) && this.b.equals(gcd0Var.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "PlusPayGoogleBillingOperationResult(data=" + this.a + ", response=" + this.b + ')';
    }
}
