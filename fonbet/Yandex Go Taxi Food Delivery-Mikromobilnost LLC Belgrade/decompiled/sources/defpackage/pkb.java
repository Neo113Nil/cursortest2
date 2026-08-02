package defpackage;

/* loaded from: classes2.dex */
public final class pkb {
    public final yf70 a;

    public pkb(yf70 yf70Var) {
        this.a = yf70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pkb) && jl40.l(this.a, ((pkb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CheckoutInvoiceAdditionalOffersInput(offers=" + this.a + ')';
    }

    public pkb() {
        this(vf70.a);
    }
}
