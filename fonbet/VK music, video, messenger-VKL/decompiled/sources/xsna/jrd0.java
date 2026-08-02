package xsna;

/* compiled from: CheckoutOrderProduct.kt */
/* loaded from: classes18.dex */
public final class jrd0 {
    public final String a;
    public final String b;

    public jrd0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrd0)) {
            return false;
        }
        jrd0 jrd0Var = (jrd0) obj;
        return epx.f(this.a, jrd0Var.a) && epx.f(this.b, jrd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductProperty(name=");
        sb.append(this.a);
        sb.append(", value=");
        return ho8.a(sb, this.b, ')');
    }
}
