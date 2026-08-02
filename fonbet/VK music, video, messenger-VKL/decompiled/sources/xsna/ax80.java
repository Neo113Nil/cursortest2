package xsna;

/* compiled from: Order.kt */
/* loaded from: classes18.dex */
public final class ax80 {
    public final String a;
    public final String b;

    public ax80(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax80)) {
            return false;
        }
        ax80 ax80Var = (ax80) obj;
        return epx.f(this.a, ax80Var.a) && epx.f(this.b, ax80Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderRecipient(name=");
        sb.append(this.a);
        sb.append(", phone=");
        return ho8.a(sb, this.b, ')');
    }
}
