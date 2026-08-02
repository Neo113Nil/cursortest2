package xsna;

/* compiled from: ProductPrice.kt */
/* loaded from: classes18.dex */
public final class grd0 {
    public final String a;
    public final String b;
    public final String c;

    public grd0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grd0)) {
            return false;
        }
        grd0 grd0Var = (grd0) obj;
        return epx.f(this.a, grd0Var.a) && epx.f(this.b, grd0Var.b) && epx.f(this.c, grd0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductPrice(amount=");
        sb.append(this.a);
        sb.append(", oldAmount=");
        sb.append(this.b);
        sb.append(", loyaltyAmount=");
        return ho8.a(sb, this.c, ')');
    }
}
