package xsna;

/* compiled from: AdLayoutProduct.kt */
/* loaded from: classes2.dex */
public final class fg0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final String g;
    public final String h;
    public final String i;

    public fg0(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = num;
        this.g = str6;
        this.h = str7;
        this.i = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg0)) {
            return false;
        }
        fg0 fg0Var = (fg0) obj;
        return epx.f(this.a, fg0Var.a) && epx.f(this.b, fg0Var.b) && epx.f(this.c, fg0Var.c) && epx.f(this.d, fg0Var.d) && epx.f(this.e, fg0Var.e) && epx.f(this.f, fg0Var.f) && epx.f(this.g, fg0Var.g) && epx.f(this.h, fg0Var.h) && epx.f(this.i, fg0Var.i);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f;
        int a2 = urd0.a((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.g);
        String str3 = this.h;
        int hashCode3 = (a2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdLayoutProduct(id=");
        sb.append(this.a);
        sb.append(", link=");
        sb.append(this.b);
        sb.append(", pictureUrl=");
        sb.append(this.c);
        sb.append(", price=");
        sb.append(this.d);
        sb.append(", label=");
        sb.append(this.e);
        sb.append(", labelColorRes=");
        sb.append(this.f);
        sb.append(", title=");
        sb.append(this.g);
        sb.append(", deeplink=");
        sb.append(this.h);
        sb.append(", oldPrice=");
        return ho8.a(sb, this.i, ')');
    }
}
