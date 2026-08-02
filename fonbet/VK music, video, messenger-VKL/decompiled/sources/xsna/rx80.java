package xsna;

/* compiled from: Order.kt */
/* loaded from: classes18.dex */
public final class rx80 {
    public final String a;
    public final String b;

    public rx80(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx80)) {
            return false;
        }
        rx80 rx80Var = (rx80) obj;
        return epx.f(this.a, rx80Var.a) && epx.f(this.b, rx80Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderTrackNumber(trackNumber=");
        sb.append(this.a);
        sb.append(", trackLink=");
        return ho8.a(sb, this.b, ')');
    }
}
