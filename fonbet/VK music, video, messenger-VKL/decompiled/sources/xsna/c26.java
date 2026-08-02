package xsna;

/* compiled from: CheckoutFields.kt */
/* loaded from: classes18.dex */
public final class c26 extends b7r {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public c26(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public static c26 d(c26 c26Var) {
        return new c26(c26Var.a, c26Var.b, c26Var.c, false);
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
        if (!(obj instanceof c26)) {
            return false;
        }
        c26 c26Var = (c26) obj;
        return epx.f(this.a, c26Var.a) && epx.f(this.b, c26Var.b) && epx.f(this.c, c26Var.c) && this.d == c26Var.d;
    }

    public final int hashCode() {
        int b = qoy.b(this.a.hashCode() * 31, 31, false);
        String str = this.b;
        return Boolean.hashCode(this.d) + urd0.a((b + (str != null ? str.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BannerField(id=");
        sb.append(this.a);
        sb.append(", affectsPrice=false, secondaryText=");
        sb.append(this.b);
        sb.append(", foldablePrimaryText=");
        sb.append(this.c);
        sb.append(", isFolded=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
