package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class hip {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Boolean i;

    public hip(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = bool;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.h;
    }

    public final String c() {
        return this.g;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hip)) {
            return false;
        }
        hip hipVar = (hip) obj;
        return jl40.l(this.a, hipVar.a) && jl40.l(this.b, hipVar.b) && jl40.l(this.c, hipVar.c) && jl40.l(this.d, hipVar.d) && jl40.l(this.e, hipVar.e) && jl40.l(this.f, hipVar.f) && jl40.l(this.g, hipVar.g) && jl40.l(this.h, hipVar.h) && jl40.l(this.i, hipVar.i);
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.e;
    }

    public final String h() {
        return this.d;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.i;
        return hashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean i() {
        return this.i;
    }

    public final String toString() {
        StringBuilder v = b64.v("FavoritesDeeplink(lat=", this.a, ", lon=", this.b, ", apt=");
        g8e.D(v, this.c, ", type=", this.d, ", title=");
        g8e.D(v, this.e, ", porch=", this.f, ", floor=");
        g8e.D(v, this.g, ", doorphone=", this.h, ", isFromProfile=");
        return nzs.d(v, this.i, Extension.C_BRAKE);
    }

    public hip() {
        this(null, null, null, null, null, null, null, null, null);
    }
}
