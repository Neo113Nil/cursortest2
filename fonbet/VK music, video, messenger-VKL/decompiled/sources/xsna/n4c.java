package xsna;

/* compiled from: CheckoutDeliveryAreaItem.kt */
/* loaded from: classes18.dex */
public final class n4c {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public n4c(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4c)) {
            return false;
        }
        n4c n4cVar = (n4c) obj;
        return epx.f(this.a, n4cVar.a) && epx.f(this.b, n4cVar.b) && epx.f(this.c, n4cVar.c) && this.d == n4cVar.d;
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckoutDeliveryAreaItem(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", isSelected=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
