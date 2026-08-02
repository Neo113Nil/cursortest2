package defpackage;

/* loaded from: classes2.dex */
public final class pmd {
    public final String a;
    public final c4a0 b;

    public pmd(String str, c4a0 c4a0Var) {
        this.a = str;
        this.b = c4a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmd)) {
            return false;
        }
        pmd pmdVar = (pmd) obj;
        return this.a.equals(pmdVar.a) && this.b.equals(pmdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnSbpPaymentButton(__typename=" + this.a + ", paymentMethod=" + this.b + ')';
    }
}
