package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class m081 {
    public final wt81 a;
    public final e781 b;
    public final e781 c;
    public final e781 d;
    public final ez61 e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final Float k;
    public final String l;
    public final String m;
    public final String n;
    public final ig61 o;
    public final boolean p;

    public m081(wt81 wt81Var, e781 e781Var, e781 e781Var2, e781 e781Var3, ez61 ez61Var, String str, String str2, String str3, String str4, String str5, Float f, String str6, String str7, String str8, ig61 ig61Var, boolean z) {
        this.a = wt81Var;
        this.b = e781Var;
        this.c = e781Var2;
        this.d = e781Var3;
        this.e = ez61Var;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = f;
        this.l = str6;
        this.m = str7;
        this.n = str8;
        this.o = ig61Var;
        this.p = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m081)) {
            return false;
        }
        m081 m081Var = (m081) obj;
        return jl40.l(this.a, m081Var.a) && jl40.l(this.b, m081Var.b) && jl40.l(this.c, m081Var.c) && jl40.l(this.d, m081Var.d) && jl40.l(this.e, m081Var.e) && jl40.l(this.f, m081Var.f) && jl40.l(this.g, m081Var.g) && jl40.l(this.h, m081Var.h) && jl40.l(this.i, m081Var.i) && jl40.l(this.j, m081Var.j) && jl40.l(this.k, m081Var.k) && jl40.l(this.l, m081Var.l) && jl40.l(this.m, m081Var.m) && jl40.l(this.n, m081Var.n) && jl40.l(this.o, m081Var.o) && this.p == m081Var.p;
    }

    public final int hashCode() {
        wt81 wt81Var = this.a;
        int hashCode = (wt81Var == null ? 0 : wt81Var.hashCode()) * 31;
        e781 e781Var = this.b;
        int hashCode2 = (hashCode + (e781Var == null ? 0 : e781Var.hashCode())) * 31;
        e781 e781Var2 = this.c;
        int hashCode3 = (hashCode2 + (e781Var2 == null ? 0 : e781Var2.hashCode())) * 31;
        e781 e781Var3 = this.d;
        int hashCode4 = (hashCode3 + (e781Var3 == null ? 0 : e781Var3.hashCode())) * 31;
        ez61 ez61Var = this.e;
        int hashCode5 = (hashCode4 + (ez61Var == null ? 0 : ez61Var.hashCode())) * 31;
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
        ig61 ig61Var = this.o;
        return Boolean.hashCode(this.p) + ((hashCode14 + (ig61Var != null ? ig61Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoreNativeAdAssets(media=");
        sb.append(this.a);
        sb.append(", favicon=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", image=");
        sb.append(this.d);
        sb.append(", closeButton=");
        sb.append(this.e);
        sb.append(", age=");
        sb.append(this.f);
        sb.append(", body=");
        g8e.D(sb, this.g, ", callToAction=", this.h, ", domain=");
        g8e.D(sb, this.i, ", price=", this.j, ", rating=");
        sb.append(this.k);
        sb.append(", reviewCount=");
        sb.append(this.l);
        sb.append(", sponsored=");
        g8e.D(sb, this.m, ", title=", this.n, ", warning=");
        sb.append(this.o);
        sb.append(", feedbackAvailable=");
        sb.append(this.p);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
