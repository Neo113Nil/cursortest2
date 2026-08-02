package defpackage;

/* loaded from: classes2.dex */
public final class mmd {
    public final String a;
    public final c4a0 b;

    public mmd(String str, c4a0 c4a0Var) {
        this.a = str;
        this.b = c4a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmd)) {
            return false;
        }
        mmd mmdVar = (mmd) obj;
        return this.a.equals(mmdVar.a) && this.b.equals(mmdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnNewCardPaymentButton(__typename=" + this.a + ", paymentMethod=" + this.b + ')';
    }
}
