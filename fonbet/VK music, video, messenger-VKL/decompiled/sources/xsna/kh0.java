package xsna;

/* compiled from: AdProductDTO.kt */
/* loaded from: classes18.dex */
public final class kh0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public kh0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
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
        if (!(obj instanceof kh0)) {
            return false;
        }
        kh0 kh0Var = (kh0) obj;
        return epx.f(this.a, kh0Var.a) && epx.f(this.b, kh0Var.b) && epx.f(this.c, kh0Var.c) && epx.f(this.d, kh0Var.d) && epx.f(this.e, kh0Var.e) && epx.f(this.f, kh0Var.f) && epx.f(this.g, kh0Var.g);
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
        StringBuilder sb = new StringBuilder("AdProductDTO(id=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", pictureUrl=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", price=");
        sb.append(this.e);
        sb.append(", oldPrice=");
        sb.append(this.f);
        sb.append(", deeplink=");
        return ho8.a(sb, this.g, ')');
    }
}
