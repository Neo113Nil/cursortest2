package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.am.GoAccountType;

/* loaded from: classes9.dex */
public final class kj {
    public final long a;
    public final String b;
    public final GoAccountType c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;

    public kj(long j, String str, GoAccountType goAccountType, boolean z, String str2, String str3, String str4, String str5, boolean z2, boolean z3, String str6, boolean z4) {
        this.a = j;
        this.b = str;
        this.c = goAccountType;
        this.d = z;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = z2;
        this.j = z3;
        this.k = str6;
        this.l = z4;
        this.m = goAccountType == GoAccountType.Phonish;
        this.n = goAccountType == GoAccountType.Yandex;
        this.o = goAccountType == GoAccountType.Social;
        this.p = goAccountType == GoAccountType.Lite;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj)) {
            return false;
        }
        kj kjVar = (kj) obj;
        return this.a == kjVar.a && jl40.l(this.b, kjVar.b) && this.c == kjVar.c && this.d == kjVar.d && jl40.l(this.e, kjVar.e) && jl40.l(this.f, kjVar.f) && jl40.l(this.g, kjVar.g) && jl40.l(this.h, kjVar.h) && this.i == kjVar.i && this.j == kjVar.j && jl40.l(this.k, kjVar.k) && this.l == kjVar.l;
    }

    public final int hashCode() {
        int e = unr0.e((this.c.hashCode() + unr0.b(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d);
        String str = this.e;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int e2 = unr0.e(unr0.e((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.i), 31, this.j);
        String str5 = this.k;
        return Boolean.hashCode(this.l) + ((e2 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder k = x4e.k("Account(uid=", this.a, ", primaryName=", this.b);
        k.append(", type=");
        k.append(this.c);
        k.append(", hasPlus=");
        k.append(this.d);
        g8e.D(k, ", firstName=", this.e, ", lastName=", this.f);
        g8e.D(k, ", email=", this.g, ", avatarUrl=", this.h);
        n.z(", isAvatarEmpty=", ", isYandex=", k, this.i, this.j);
        uw51.x(", yandexoidLogin=", this.k, ", isBetaTester=", k, this.l);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
