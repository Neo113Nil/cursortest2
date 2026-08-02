package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class n5b0 {
    public final long a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final boolean g;

    public n5b0(long j, long j2, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = j2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5b0)) {
            return false;
        }
        n5b0 n5b0Var = (n5b0) obj;
        return this.a == n5b0Var.a && jl40.l(this.b, n5b0Var.b) && jl40.l(this.c, n5b0Var.c) && this.d == n5b0Var.d && this.e == n5b0Var.e && this.f == n5b0Var.f && this.g == n5b0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + qv10.c(unr0.e(unr0.e(unr0.b(unr0.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder k = x4e.k("PersonalOrganizationEntity(organizationId=", this.a, ", organizationName=", this.b);
        uw51.x(", registrationStatus=", this.c, ", isPublic=", k, this.d);
        k.append(", isGuest=");
        k.append(this.e);
        k.append(", organizationRights=");
        k.append(this.f);
        k.append(", disabled=");
        k.append(this.g);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
