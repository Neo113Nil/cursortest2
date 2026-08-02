package xsna;

/* compiled from: CheckoutFields.kt */
/* loaded from: classes18.dex */
public final class o6d0 extends b7r {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public o6d0(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
    }

    @Override // xsna.b7r
    public final boolean b() {
        return false;
    }

    @Override // xsna.b7r
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6d0)) {
            return false;
        }
        o6d0 o6d0Var = (o6d0) obj;
        return epx.f(this.a, o6d0Var.a) && epx.f(this.b, o6d0Var.b) && epx.f(this.c, o6d0Var.c) && epx.f(this.d, o6d0Var.d) && this.e == o6d0Var.e && this.f == o6d0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b(urd0.a(urd0.a(urd0.a(qoy.b(this.a.hashCode() * 31, 31, false), 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PriceInfoField(id=");
        sb.append(this.a);
        sb.append(", affectsPrice=false, title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", price=");
        sb.append(this.d);
        sb.append(", isDiscount=");
        sb.append(this.e);
        sb.append(", isAccent=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
