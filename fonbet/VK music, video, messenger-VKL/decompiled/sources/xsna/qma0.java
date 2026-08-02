package xsna;

/* compiled from: PinReviewInfoForSubscription.kt */
/* loaded from: classes18.dex */
public final class qma0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;

    public qma0(String str, String str2, String str3, String str4, String str5, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = i / 100;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qma0)) {
            return false;
        }
        qma0 qma0Var = (qma0) obj;
        return epx.f(this.a, qma0Var.a) && epx.f(this.b, qma0Var.b) && epx.f(this.c, qma0Var.c) && epx.f(this.d, qma0Var.d) && epx.f(this.e, qma0Var.e) && this.f == qma0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + urd0.a(urd0.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PinReviewInfoForSubscription(actionText=");
        sb.append(this.a);
        sb.append(", termsAndConditionsText=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", priceId=");
        sb.append(this.e);
        sb.append(", price=");
        return vu5.b(sb, this.f, ')');
    }
}
