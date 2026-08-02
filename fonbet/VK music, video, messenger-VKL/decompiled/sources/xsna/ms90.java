package xsna;

/* compiled from: Order.kt */
/* loaded from: classes18.dex */
public final class ms90 {
    public final String a;
    public final String b;

    public ms90(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms90)) {
            return false;
        }
        ms90 ms90Var = (ms90) obj;
        return epx.f(this.a, ms90Var.a) && epx.f(this.b, ms90Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentInfo(status=");
        sb.append(this.a);
        sb.append(", receiptLink=");
        return ho8.a(sb, this.b, ')');
    }
}
