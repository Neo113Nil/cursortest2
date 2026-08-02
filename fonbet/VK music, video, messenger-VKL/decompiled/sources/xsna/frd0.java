package xsna;

/* compiled from: ProductCardMainInfoState.kt */
/* loaded from: classes18.dex */
public final class frd0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;

    public frd0(int i, String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frd0)) {
            return false;
        }
        frd0 frd0Var = (frd0) obj;
        return epx.f(this.a, frd0Var.a) && epx.f(this.b, frd0Var.b) && epx.f(this.c, frd0Var.c) && this.d == frd0Var.d && epx.f(this.e, frd0Var.e) && epx.f(this.f, frd0Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int a = urd0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int a2 = shy.a(this.d, (a + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.e;
        int hashCode = (a2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return hashCode + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductPrice(loyaltyTextAmount=");
        sb.append(this.a);
        sb.append(", amountText=");
        sb.append(this.b);
        sb.append(", oldAmountText=");
        sb.append(this.c);
        sb.append(", discountRate=");
        sb.append(this.d);
        sb.append(", loyaltyHintText=");
        sb.append(this.e);
        sb.append(", loyaltyTextColor=");
        return ho8.a(sb, this.f, ')');
    }
}
