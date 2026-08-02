package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class lri extends uri {
    public final jk51 a;
    public final zp1 b;
    public final zp1 c;
    public final gv90 d;
    public final zp1 e;
    public final zp1 f;
    public final jk51 g;
    public final gv90 h;
    public final boolean i;
    public final String j;

    public lri(jk51 jk51Var, zp1 zp1Var, zp1 zp1Var2, gv90 gv90Var, zp1 zp1Var3, zp1 zp1Var4, jk51 jk51Var2, gv90 gv90Var2, boolean z, String str) {
        this.a = jk51Var;
        this.b = zp1Var;
        this.c = zp1Var2;
        this.d = gv90Var;
        this.e = zp1Var3;
        this.f = zp1Var4;
        this.g = jk51Var2;
        this.h = gv90Var2;
        this.i = z;
        this.j = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lri) {
            lri lriVar = (lri) obj;
            if (jl40.l(this.a, lriVar.a) && this.b == lriVar.b && jl40.l(this.c, lriVar.c) && jl40.l(this.d, lriVar.d) && jl40.l(this.e, lriVar.e) && jl40.l(this.f, lriVar.f) && jl40.l(this.g, lriVar.g) && jl40.l(this.h, lriVar.h) && this.i == lriVar.i && jl40.l(this.j, lriVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        jk51 jk51Var = this.a;
        int hashCode = (this.b.hashCode() + ((jk51Var == null ? 0 : jk51Var.hashCode()) * 31)) * 31;
        zp1 zp1Var = this.c;
        int hashCode2 = (hashCode + (zp1Var == null ? 0 : zp1Var.hashCode())) * 31;
        gv90 gv90Var = this.d;
        int hashCode3 = (hashCode2 + (gv90Var == null ? 0 : gv90Var.hashCode())) * 31;
        zp1 zp1Var2 = this.e;
        int hashCode4 = (hashCode3 + (zp1Var2 == null ? 0 : zp1Var2.hashCode())) * 31;
        zp1 zp1Var3 = this.f;
        int hashCode5 = (hashCode4 + (zp1Var3 == null ? 0 : zp1Var3.hashCode())) * 31;
        jk51 jk51Var2 = this.g;
        int hashCode6 = (hashCode5 + (jk51Var2 == null ? 0 : jk51Var2.hashCode())) * 31;
        gv90 gv90Var2 = this.h;
        int e = unr0.e((hashCode6 + (gv90Var2 == null ? 0 : gv90Var2.hashCode())) * 31, 31, this.i);
        String str = this.j;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListItem(leadIcon=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", generalPayload=");
        sb.append(this.d);
        sb.append(", trailTitle=");
        sb.append(this.e);
        sb.append(", trailSubtitle=");
        sb.append(this.f);
        sb.append(", trailIcon=");
        sb.append(this.g);
        sb.append(", trailPayload=");
        sb.append(this.h);
        sb.append(", isShimmering=");
        return n.m(", metricaLabel=", this.j, Extension.C_BRAKE, sb, this.i);
    }
}
