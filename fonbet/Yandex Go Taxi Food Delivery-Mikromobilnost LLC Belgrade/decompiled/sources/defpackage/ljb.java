package defpackage;

/* loaded from: classes2.dex */
public final class ljb {
    public final int a;
    public final String b;

    public ljb(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljb)) {
            return false;
        }
        ljb ljbVar = (ljb) obj;
        return this.a == ljbVar.a && this.b.equals(ljbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentVia(logoRes=");
        sb.append(this.a);
        sb.append(", text=");
        return b64.p(sb, this.b, ')');
    }
}
