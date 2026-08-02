package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class m2b {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final long g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;
    public final String l;
    public final boolean m;

    public m2b(long j, String str, String str2, long j2, long j3, String str3, long j4, String str4, String str5, String str6, boolean z, String str7, boolean z2) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = j3;
        this.f = str3;
        this.g = j4;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = z;
        this.l = str7;
        this.m = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2b)) {
            return false;
        }
        m2b m2bVar = (m2b) obj;
        return this.a == m2bVar.a && jl40.l(this.b, m2bVar.b) && jl40.l(this.c, m2bVar.c) && this.d == m2bVar.d && this.e == m2bVar.e && jl40.l(this.f, m2bVar.f) && this.g == m2bVar.g && jl40.l(this.h, m2bVar.h) && jl40.l(this.i, m2bVar.i) && jl40.l(this.j, m2bVar.j) && this.k == m2bVar.k && jl40.l(this.l, m2bVar.l) && this.m == m2bVar.m;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int c = qv10.c(qv10.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e);
        String str3 = this.f;
        int c2 = qv10.c((c + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.g);
        String str4 = this.h;
        int hashCode3 = (c2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int e = unr0.e((hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.k);
        String str7 = this.l;
        return Boolean.hashCode(this.m) + ((e + (str7 != null ? str7.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder k = x4e.k("ChatUpdateInfo(internalId=", this.a, ", name=", this.b);
        x4e.C(k, ", avatarId=", this.c, ", version=");
        k.append(this.d);
        x4e.A(this.e, ", fullInfoVersion=", ", inviteHash=", k);
        ly3.y(this.g, this.f, ", flags=", k);
        g8e.D(k, ", description=", this.h, ", alias=", this.i);
        uw51.x(", currentProfileId=", this.j, ", isTransient=", k, this.k);
        uw51.x(", partnerId=", this.l, ", hasGuests=", k, this.m);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
