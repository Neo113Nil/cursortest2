package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes5.dex */
public final class f0t {
    public static final e0t Companion = new e0t();
    public final double a;
    public final double b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;

    public /* synthetic */ f0t(int i, double d, double d2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, d0t.a.getDescriptor());
            throw null;
        }
        this.a = d;
        this.b = d2;
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str6;
        }
        if ((i & 256) == 0) {
            this.i = "";
        } else {
            this.i = str7;
        }
        if ((i & 512) == 0) {
            this.j = "";
        } else {
            this.j = str8;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str9;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str10;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0t)) {
            return false;
        }
        f0t f0tVar = (f0t) obj;
        return Double.compare(this.a, f0tVar.a) == 0 && Double.compare(this.b, f0tVar.b) == 0 && jl40.l(this.c, f0tVar.c) && jl40.l(this.d, f0tVar.d) && jl40.l(this.e, f0tVar.e) && jl40.l(this.f, f0tVar.f) && jl40.l(this.g, f0tVar.g) && jl40.l(this.h, f0tVar.h) && jl40.l(this.i, f0tVar.i) && jl40.l(this.j, f0tVar.j) && jl40.l(this.k, f0tVar.k) && jl40.l(this.l, f0tVar.l) && jl40.l(this.m, f0tVar.m);
    }

    public final int hashCode() {
        int a = unr0.a(Double.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.j;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.k;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.l;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.m;
        return hashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "GeoPosition(lat=", ", lon=");
        u.append(this.b);
        u.append(", fullAddress=");
        u.append(this.c);
        g8e.D(u, ", title=", this.d, ", uri=", this.e);
        g8e.D(u, ", entrance=", this.f, ", doorcode=", this.g);
        g8e.D(u, ", floor=", this.h, ", office=", this.i);
        g8e.D(u, ", comment=", this.j, ", datumId=", this.k);
        g8e.D(u, ", datumType=", this.l, ", log=", this.m);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    public f0t(double d, double d2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.a = d;
        this.b = d2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
        this.m = str11;
    }
}
