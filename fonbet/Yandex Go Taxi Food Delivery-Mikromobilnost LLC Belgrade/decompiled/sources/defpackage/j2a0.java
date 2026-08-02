package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class j2a0 extends ea91 {
    public final zp1 b;
    public final zp1 c;
    public final zp1 d;
    public final zp1 e;
    public final jk51 f;

    public j2a0(zp1 zp1Var, zp1 zp1Var2, zp1 zp1Var3, zp1 zp1Var4, jk51 jk51Var) {
        this.b = zp1Var;
        this.c = zp1Var2;
        this.d = zp1Var3;
        this.e = zp1Var4;
        this.f = jk51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j2a0) {
            j2a0 j2a0Var = (j2a0) obj;
            if (this.b == j2a0Var.b && jl40.l(this.c, j2a0Var.c) && jl40.l(this.d, j2a0Var.d) && jl40.l(this.e, j2a0Var.e) && jl40.l(this.f, j2a0Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        zp1 zp1Var = this.c;
        int hashCode2 = (hashCode + (zp1Var == null ? 0 : zp1Var.hashCode())) * 31;
        zp1 zp1Var2 = this.d;
        int hashCode3 = (hashCode2 + (zp1Var2 == null ? 0 : zp1Var2.hashCode())) * 31;
        zp1 zp1Var3 = this.e;
        int hashCode4 = (hashCode3 + (zp1Var3 == null ? 0 : zp1Var3.hashCode())) * 31;
        jk51 jk51Var = this.f;
        return hashCode4 + (jk51Var != null ? jk51Var.hashCode() : 0);
    }

    public final String toString() {
        return "RemotePaymentItem(title=" + this.b + ", subtitle=" + this.c + ", trailTitle=" + this.d + ", trailSubtitle=" + this.e + ", leadIcon=" + this.f + Extension.C_BRAKE;
    }
}
