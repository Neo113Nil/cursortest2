package yads;

import xsna.epx;
import xsna.n6j;

/* loaded from: classes10.dex */
public final class y00 {
    public final h10 a;
    public final a10 b;
    public final a10 c;
    public final a10 d;
    public final o10 e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final Float k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final boolean p;

    public y00(h10 h10Var, a10 a10Var, a10 a10Var2, a10 a10Var3, o10 o10Var, String str, String str2, String str3, String str4, String str5, Float f, String str6, String str7, String str8, String str9, boolean z) {
        this.a = h10Var;
        this.b = a10Var;
        this.c = a10Var2;
        this.d = a10Var3;
        this.e = o10Var;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = f;
        this.l = str6;
        this.m = str7;
        this.n = str8;
        this.o = str9;
        this.p = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y00)) {
            return false;
        }
        y00 y00Var = (y00) obj;
        return epx.f(this.a, y00Var.a) && epx.f(this.b, y00Var.b) && epx.f(this.c, y00Var.c) && epx.f(this.d, y00Var.d) && epx.f(this.e, y00Var.e) && epx.f(this.f, y00Var.f) && epx.f(this.g, y00Var.g) && epx.f(this.h, y00Var.h) && epx.f(this.i, y00Var.i) && epx.f(this.j, y00Var.j) && epx.f(this.k, y00Var.k) && epx.f(this.l, y00Var.l) && epx.f(this.m, y00Var.m) && epx.f(this.n, y00Var.n) && epx.f(this.o, y00Var.o) && this.p == y00Var.p;
    }

    public final int hashCode() {
        h10 h10Var = this.a;
        int hashCode = (h10Var == null ? 0 : Float.hashCode(h10Var.a)) * 31;
        a10 a10Var = this.b;
        int hashCode2 = (hashCode + (a10Var == null ? 0 : a10Var.hashCode())) * 31;
        a10 a10Var2 = this.c;
        int hashCode3 = (hashCode2 + (a10Var2 == null ? 0 : a10Var2.hashCode())) * 31;
        a10 a10Var3 = this.d;
        int hashCode4 = (hashCode3 + (a10Var3 == null ? 0 : a10Var3.hashCode())) * 31;
        o10 o10Var = this.e;
        int hashCode5 = (hashCode4 + (o10Var == null ? 0 : o10Var.hashCode())) * 31;
        String str = this.f;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f = this.k;
        int hashCode11 = (hashCode10 + (f == null ? 0 : f.hashCode())) * 31;
        String str6 = this.l;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.m;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.n;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.o;
        return Boolean.hashCode(this.p) + ((hashCode14 + (str9 != null ? str9.hashCode() : 0)) * 31);
    }

    public final String toString() {
        h10 h10Var = this.a;
        a10 a10Var = this.b;
        a10 a10Var2 = this.c;
        a10 a10Var3 = this.d;
        o10 o10Var = this.e;
        String str = this.f;
        String str2 = this.g;
        String str3 = this.h;
        String str4 = this.i;
        String str5 = this.j;
        Float f = this.k;
        String str6 = this.l;
        String str7 = this.m;
        String str8 = this.n;
        String str9 = this.o;
        boolean z = this.p;
        StringBuilder sb = new StringBuilder("CoreNativeAdAssets(media=");
        sb.append(h10Var);
        sb.append(", favicon=");
        sb.append(a10Var);
        sb.append(", icon=");
        sb.append(a10Var2);
        sb.append(", image=");
        sb.append(a10Var3);
        sb.append(", closeButton=");
        sb.append(o10Var);
        sb.append(", age=");
        sb.append(str);
        sb.append(", body=");
        n6j.b(sb, str2, ", callToAction=", str3, ", domain=");
        n6j.b(sb, str4, ", price=", str5, ", rating=");
        sb.append(f);
        sb.append(", reviewCount=");
        sb.append(str6);
        sb.append(", sponsored=");
        n6j.b(sb, str7, ", title=", str8, ", warning=");
        sb.append(str9);
        sb.append(", feedbackAvailable=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
