package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class c2l0 {
    public final String A;
    public final String B;
    public final String C;
    public final Uri a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Double h;
    public final Double i;
    public final String j;
    public final Double k;
    public final Double l;
    public final Integer m;
    public final Boolean n;
    public final Boolean o;
    public final Boolean p;
    public final String q;
    public final Boolean r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    public c2l0(Uri uri, String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, String str7, Double d3, Double d4, Integer num, Boolean bool, Boolean bool2, Boolean bool3, String str8, Boolean bool4, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
        this.a = uri;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = d;
        this.i = d2;
        this.j = str7;
        this.k = d3;
        this.l = d4;
        this.m = num;
        this.n = bool;
        this.o = bool2;
        this.p = bool3;
        this.q = str8;
        this.r = bool4;
        this.s = str9;
        this.t = str10;
        this.u = str11;
        this.v = str12;
        this.w = str13;
        this.x = str14;
        this.y = str15;
        this.z = str16;
        this.A = str17;
        this.B = str18;
        this.C = str19;
    }

    public final Double a() {
        return this.h;
    }

    public final Double b() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2l0)) {
            return false;
        }
        c2l0 c2l0Var = (c2l0) obj;
        return jl40.l(this.a, c2l0Var.a) && jl40.l(this.b, c2l0Var.b) && jl40.l(this.c, c2l0Var.c) && jl40.l(this.d, c2l0Var.d) && jl40.l(this.e, c2l0Var.e) && jl40.l(this.f, c2l0Var.f) && jl40.l(this.g, c2l0Var.g) && jl40.l(this.h, c2l0Var.h) && jl40.l(this.i, c2l0Var.i) && jl40.l(this.j, c2l0Var.j) && jl40.l(this.k, c2l0Var.k) && jl40.l(this.l, c2l0Var.l) && jl40.l(this.m, c2l0Var.m) && jl40.l(this.n, c2l0Var.n) && jl40.l(this.o, c2l0Var.o) && jl40.l(this.p, c2l0Var.p) && jl40.l(this.q, c2l0Var.q) && jl40.l(this.r, c2l0Var.r) && jl40.l(this.s, c2l0Var.s) && jl40.l(this.t, c2l0Var.t) && jl40.l(this.u, c2l0Var.u) && jl40.l(this.v, c2l0Var.v) && jl40.l(this.w, c2l0Var.w) && jl40.l(this.x, c2l0Var.x) && jl40.l(this.y, c2l0Var.y) && jl40.l(this.z, c2l0Var.z) && jl40.l(this.A, c2l0Var.A) && jl40.l(this.B, c2l0Var.B) && jl40.l(this.C, c2l0Var.C);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d = this.h;
        int hashCode8 = (hashCode7 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.i;
        int hashCode9 = (hashCode8 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str7 = this.j;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d3 = this.k;
        int hashCode11 = (hashCode10 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.l;
        int hashCode12 = (hashCode11 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Integer num = this.m;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.n;
        int hashCode14 = (hashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.o;
        int hashCode15 = (hashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.p;
        int hashCode16 = (hashCode15 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str8 = this.q;
        int hashCode17 = (hashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool4 = this.r;
        int hashCode18 = (hashCode17 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str9 = this.s;
        int hashCode19 = (hashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.t;
        int hashCode20 = (hashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.u;
        int hashCode21 = (hashCode20 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.v;
        int hashCode22 = (hashCode21 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.w;
        int hashCode23 = (hashCode22 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.x;
        int hashCode24 = (hashCode23 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.y;
        int hashCode25 = (hashCode24 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.z;
        int hashCode26 = (hashCode25 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.A;
        int hashCode27 = (hashCode26 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.B;
        int hashCode28 = (hashCode27 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.C;
        return hashCode28 + (str19 != null ? str19.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteDeeplink(deeplinkUri=");
        sb.append(this.a);
        sb.append(", tariffClass=");
        sb.append(this.b);
        sb.append(", alternative=");
        g8e.D(sb, this.c, ", vertical=", this.d, ", expandingState=");
        g8e.D(sb, this.e, ", selectedClasses=", this.f, ", start=");
        sb.append(this.g);
        sb.append(", startLat=");
        sb.append(this.h);
        sb.append(", startLon=");
        sb.append(this.i);
        sb.append(", end=");
        sb.append(this.j);
        sb.append(", endLat=");
        sb.append(this.k);
        sb.append(", endLon=");
        sb.append(this.l);
        sb.append(", level=");
        sb.append(this.m);
        sb.append(", sticky=");
        sb.append(this.n);
        sb.append(", multiclass=");
        sb.append(this.o);
        sb.append(", waitPrices=");
        sb.append(this.p);
        sb.append(", requirements=");
        tse0.A(sb, this.q, ", trapMode=", this.r, ", courierComment=");
        g8e.D(sb, this.s, ", srcPhoneNumber=", this.t, ", destPhoneNumber=");
        g8e.D(sb, this.u, ", extraContactPhone=", this.v, ", continuation=");
        g8e.D(sb, this.w, ", marketplaceChatId=", this.x, ", originDeeplink=");
        g8e.D(sb, this.y, ", requirementAlternativeKey=", this.z, ", analyticsEvent=");
        g8e.D(sb, this.A, ", endId=", this.B, ", endType=");
        return oyr.t(sb, this.C, Extension.C_BRAKE);
    }
}
