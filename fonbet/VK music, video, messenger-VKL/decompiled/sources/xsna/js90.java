package xsna;

/* compiled from: PinReviewManageServiceState.kt */
/* loaded from: classes18.dex */
public final class js90 {
    public final l6d0 a;
    public final ks90 b;
    public final at9 c;

    public js90(l6d0 l6d0Var, ks90 ks90Var, at9 at9Var) {
        this.a = l6d0Var;
        this.b = ks90Var;
        this.c = at9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js90)) {
            return false;
        }
        js90 js90Var = (js90) obj;
        return epx.f(this.a, js90Var.a) && epx.f(this.b, js90Var.b) && epx.f(this.c, js90Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        at9 at9Var = this.c;
        return hashCode + (at9Var == null ? 0 : at9Var.hashCode());
    }

    public final String toString() {
        return "PaymentData(price=" + this.a + ", nextPaymentDate=" + this.b + ", card=" + this.c + ')';
    }
}
