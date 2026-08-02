package xsna;

/* compiled from: CheckoutOrderProduct.kt */
/* loaded from: classes18.dex */
public final class k6d0 {
    public final int a;
    public final String b;
    public final String c;

    public k6d0(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6d0)) {
            return false;
        }
        k6d0 k6d0Var = (k6d0) obj;
        return this.a == k6d0Var.a && epx.f(this.b, k6d0Var.b) && epx.f(this.c, k6d0Var.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Price(discountRate=");
        sb.append(this.a);
        sb.append(", oldAmount=");
        sb.append(this.b);
        sb.append(", amount=");
        return ho8.a(sb, this.c, ')');
    }
}
