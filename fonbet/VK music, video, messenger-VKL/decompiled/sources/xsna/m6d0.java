package xsna;

/* compiled from: CartState.kt */
/* loaded from: classes18.dex */
public final class m6d0 {
    public final int a;
    public final String b;
    public final String c;

    public m6d0(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6d0)) {
            return false;
        }
        m6d0 m6d0Var = (m6d0) obj;
        return this.a == m6d0Var.a && epx.f(this.b, m6d0Var.b) && epx.f(this.c, m6d0Var.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Price(discountRate=");
        sb.append(this.a);
        sb.append(", oldAmountText=");
        sb.append(this.b);
        sb.append(", text=");
        return ho8.a(sb, this.c, ')');
    }
}
