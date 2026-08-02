package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class l000 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public l000(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.g;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l000)) {
            return false;
        }
        l000 l000Var = (l000) obj;
        return this.a.equals(l000Var.a) && jl40.l(this.b, l000Var.b) && jl40.l(this.c, l000Var.c) && jl40.l(this.d, l000Var.d) && jl40.l(this.e, l000Var.e) && jl40.l(this.f, l000Var.f) && jl40.l(this.g, l000Var.g) && jl40.l(this.h, l000Var.h);
    }

    public final String f() {
        return this.a;
    }

    public final String g() {
        return this.d;
    }

    public final String h() {
        return this.c;
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
        String str7 = this.h;
        return hashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("MaasDeeplink(mode=", this.a, ", coupon=", this.b, ", verticalId=");
        g8e.D(v, this.c, ", openReason=", this.d, ", latA=");
        g8e.D(v, this.e, ", lonA=", this.f, ", latB=");
        return g8e.r(v, this.g, ", lonB=", this.h, Extension.C_BRAKE);
    }
}
