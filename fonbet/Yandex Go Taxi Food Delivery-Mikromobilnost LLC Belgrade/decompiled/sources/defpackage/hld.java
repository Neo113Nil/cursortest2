package defpackage;

/* loaded from: classes2.dex */
public final class hld {
    public final String a;
    public final String b;

    public hld(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hld)) {
            return false;
        }
        hld hldVar = (hld) obj;
        return this.a.equals(hldVar.a) && this.b.equals(hldVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentText(firstPaymentText=");
        sb.append(this.a);
        sb.append(", nextPaymentText=");
        return b64.p(sb, this.b, ')');
    }
}
