package xsna;

/* compiled from: AuthSilentTokenModel.kt */
/* loaded from: classes6.dex */
public final class j65 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final Integer f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final Integer n;
    public final Integer o;
    public final String p;

    public j65(String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num3, Integer num4, String str12) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = num;
        this.f = num2;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
        this.m = str11;
        this.n = num3;
        this.o = num4;
        this.p = str12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j65)) {
            return false;
        }
        j65 j65Var = (j65) obj;
        return epx.f(this.a, j65Var.a) && epx.f(this.b, j65Var.b) && epx.f(this.c, j65Var.c) && epx.f(this.d, j65Var.d) && epx.f(this.e, j65Var.e) && epx.f(this.f, j65Var.f) && epx.f(this.g, j65Var.g) && epx.f(this.h, j65Var.h) && epx.f(this.i, j65Var.i) && epx.f(this.j, j65Var.j) && epx.f(this.k, j65Var.k) && epx.f(this.l, j65Var.l) && epx.f(this.m, j65Var.m) && epx.f(this.n, j65Var.n) && epx.f(this.o, j65Var.o) && epx.f(this.p, j65Var.p);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.g;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.l;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.m;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num3 = this.n;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.o;
        int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str9 = this.p;
        return hashCode12 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthSilentTokenModel(token=");
        sb.append(this.a);
        sb.append(", firstName=");
        sb.append(this.b);
        sb.append(", lastName=");
        sb.append(this.c);
        sb.append(", uuid=");
        sb.append(this.d);
        sb.append(", ttl=");
        sb.append(this.e);
        sb.append(", expires=");
        sb.append(this.f);
        sb.append(", photo50=");
        sb.append(this.g);
        sb.append(", photo100=");
        sb.append(this.h);
        sb.append(", photo200=");
        sb.append(this.i);
        sb.append(", photoBase=");
        sb.append(this.j);
        sb.append(", phone=");
        sb.append(this.k);
        sb.append(", email=");
        sb.append(this.l);
        sb.append(", userHash=");
        sb.append(this.m);
        sb.append(", appServiceId=");
        sb.append(this.n);
        sb.append(", weight=");
        sb.append(this.o);
        sb.append(", phoneToActualize=");
        return ho8.a(sb, this.p, ')');
    }
}
