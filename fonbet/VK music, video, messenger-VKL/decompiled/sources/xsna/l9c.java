package xsna;

/* compiled from: CheckoutStickItem.kt */
/* loaded from: classes18.dex */
public final class l9c implements y8c {
    public final String a;
    public final String b;

    public l9c(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9c)) {
            return false;
        }
        l9c l9cVar = (l9c) obj;
        return epx.f(this.a, l9cVar.a) && epx.f(this.b, l9cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckoutTotalPriceStickItem(title=");
        sb.append(this.a);
        sb.append(", price=");
        return ho8.a(sb, this.b, ')');
    }
}
