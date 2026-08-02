package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class lat {
    public final long a;
    public final String b;
    public final boolean c;
    public final int d;
    public final boolean e;

    public lat(long j, String str, boolean z, int i, boolean z2) {
        this.a = j;
        this.b = str;
        this.c = z;
        this.d = i;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lat)) {
            return false;
        }
        lat latVar = (lat) obj;
        return this.a == latVar.a && jl40.l(this.b, latVar.b) && this.c == latVar.c && this.d == latVar.d && this.e == latVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + oyr.b(this.d, unr0.e(unr0.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder k = x4e.k("Organization(organizationId=", this.a, ", organizationName=", this.b);
        k.append(", isGuest=");
        k.append(this.c);
        k.append(", unreadCount=");
        k.append(this.d);
        return xra1.a(k, ", hasMentions=", this.e, Extension.C_BRAKE);
    }

    public /* synthetic */ lat(String str, long j, boolean z) {
        this(j, str, z, 0, false);
    }
}
