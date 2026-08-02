package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class hri extends uri {
    public final zp1 a;
    public final zp1 b;
    public final String c;
    public final gv90 d;
    public final String e;

    public hri(zp1 zp1Var, zp1 zp1Var2, String str, gv90 gv90Var, String str2) {
        this.a = zp1Var;
        this.b = zp1Var2;
        this.c = str;
        this.d = gv90Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hri) {
            hri hriVar = (hri) obj;
            if (this.a == hriVar.a && jl40.l(this.b, hriVar.b) && jl40.l(this.c, hriVar.c) && jl40.l(this.d, hriVar.d) && jl40.l(this.e, hriVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zp1 zp1Var = this.b;
        int hashCode2 = (hashCode + (zp1Var == null ? 0 : zp1Var.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        gv90 gv90Var = this.d;
        int hashCode4 = (hashCode3 + (gv90Var == null ? 0 : gv90Var.hashCode())) * 31;
        String str2 = this.e;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionButton(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        sb.append(this.c);
        sb.append(", payload=");
        sb.append(this.d);
        sb.append(", metricaLabel=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
