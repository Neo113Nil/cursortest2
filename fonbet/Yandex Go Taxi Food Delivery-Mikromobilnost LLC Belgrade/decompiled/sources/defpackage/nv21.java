package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class nv21 {
    public final String a;
    public final long b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;

    public nv21(String str, long j, String str2, boolean z, boolean z2, String str3, boolean z3) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = str3;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv21)) {
            return false;
        }
        nv21 nv21Var = (nv21) obj;
        return jl40.l(this.a, nv21Var.a) && this.b == nv21Var.b && jl40.l(this.c, nv21Var.c) && this.d == nv21Var.d && this.e == nv21Var.e && jl40.l(this.f, nv21Var.f) && this.g == nv21Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + unr0.b(unr0.e(unr0.e(unr0.b(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder l = x4e.l("UsersToTalkEntity(userId=", this.a, ", orgId=", this.b);
        uw51.x(", shownName=", this.c, ", hasPrivateChat=", l, this.d);
        l.append(", hasContact=");
        l.append(this.e);
        l.append(", userSearchKey=");
        l.append(this.f);
        return xra1.a(l, ", deleted=", this.g, Extension.C_BRAKE);
    }
}
