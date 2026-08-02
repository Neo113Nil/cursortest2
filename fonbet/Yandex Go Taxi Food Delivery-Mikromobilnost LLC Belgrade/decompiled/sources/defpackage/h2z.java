package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class h2z {
    public final String a;
    public final long b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final boolean h;
    public final boolean i;
    public final String j;

    public h2z(String str, long j, boolean z, String str2, String str3, String str4, long j2, boolean z2, boolean z3, String str5) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = j2;
        this.h = z2;
        this.i = z3;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2z)) {
            return false;
        }
        h2z h2zVar = (h2z) obj;
        return jl40.l(this.a, h2zVar.a) && this.b == h2zVar.b && this.c == h2zVar.c && jl40.l(this.d, h2zVar.d) && jl40.l(this.e, h2zVar.e) && jl40.l(this.f, h2zVar.f) && this.g == h2zVar.g && this.h == h2zVar.h && this.i == h2zVar.i && jl40.l(this.j, h2zVar.j);
    }

    public final int hashCode() {
        int e = unr0.e(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int b = unr0.b((e + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        String str2 = this.f;
        return this.j.hashCode() + unr0.e(unr0.e(qv10.c((b + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder l = x4e.l("LocalContactEntity(uploadId=", this.a, ", systemId=", this.b);
        l.append(", uploaded=");
        l.append(this.c);
        l.append(", displayName=");
        l.append(this.d);
        g8e.D(l, ", phone=", this.e, ", phoneId=", this.f);
        x4e.A(this.g, ", lastTimeContacted=", ", dirty=", l);
        nnm.v(", deleted=", ", lookupId=", l, this.h, this.i);
        return oyr.t(l, this.j, Extension.C_BRAKE);
    }
}
