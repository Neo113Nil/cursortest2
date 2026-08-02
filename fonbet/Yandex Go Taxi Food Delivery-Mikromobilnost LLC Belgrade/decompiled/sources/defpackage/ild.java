package defpackage;

/* loaded from: classes2.dex */
public final class ild {
    public final String a;
    public final String b;

    public ild(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ild)) {
            return false;
        }
        ild ildVar = (ild) obj;
        return this.a.equals(ildVar.a) && this.b.equals(ildVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentText(firstPaymentText=");
        sb.append(this.a);
        sb.append(", nextPaymentsText=");
        return b64.p(sb, this.b, ')');
    }
}
