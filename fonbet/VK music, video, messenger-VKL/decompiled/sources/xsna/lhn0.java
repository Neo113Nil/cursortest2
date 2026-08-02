package xsna;

/* compiled from: SuperappPurchasesBridge.kt */
/* loaded from: classes6.dex */
public final class lhn0 {
    public final String a;
    public final String b;
    public final double c;
    public final boolean d;
    public final String e;
    public final String f;

    public lhn0(double d, String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = d;
        this.d = z;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhn0)) {
            return false;
        }
        lhn0 lhn0Var = (lhn0) obj;
        return epx.f(this.a, lhn0Var.a) && epx.f(this.b, lhn0Var.b) && Double.compare(this.c, lhn0Var.c) == 0 && this.d == lhn0Var.d && epx.f(this.e, lhn0Var.e) && epx.f(this.f, lhn0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + urd0.a(qoy.b(zjh0.b(this.c, urd0.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductInfo(currency=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", productPrice=");
        sb.append(this.c);
        sb.append(", isSubscription=");
        sb.append(this.d);
        sb.append(", merchantProductId=");
        sb.append(this.e);
        sb.append(", subscriptionPeriod=");
        return ho8.a(sb, this.f, ')');
    }
}
