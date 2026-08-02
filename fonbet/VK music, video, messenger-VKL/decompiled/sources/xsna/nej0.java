package xsna;

/* compiled from: ShoppableAdItem.kt */
/* loaded from: classes8.dex */
public final class nej0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public nej0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nej0)) {
            return false;
        }
        nej0 nej0Var = (nej0) obj;
        return epx.f(this.a, nej0Var.a) && epx.f(this.b, nej0Var.b) && epx.f(this.c, nej0Var.c) && epx.f(this.d, nej0Var.d) && epx.f(this.e, nej0Var.e) && epx.f(this.f, nej0Var.f) && epx.f(this.g, nej0Var.g);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = xe9.a("ShoppableAdItem(id=", this.a, ", url=", this.b, ", picture=");
        n6j.b(a, this.c, ", text=", this.d, ", deeplink=");
        n6j.b(a, this.e, ", oldPrice=", this.f, ", price=");
        return i5s.a(a, this.g, ")");
    }
}
