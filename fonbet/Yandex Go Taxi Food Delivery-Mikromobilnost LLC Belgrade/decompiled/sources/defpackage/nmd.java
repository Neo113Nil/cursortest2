package defpackage;

/* loaded from: classes2.dex */
public final class nmd {
    public final String a;
    public final c4a0 b;

    public nmd(String str, c4a0 c4a0Var) {
        this.a = str;
        this.b = c4a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmd)) {
            return false;
        }
        nmd nmdVar = (nmd) obj;
        return this.a.equals(nmdVar.a) && this.b.equals(nmdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnNewSbpPaymentButton(__typename=" + this.a + ", paymentMethod=" + this.b + ')';
    }
}
