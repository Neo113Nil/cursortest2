package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class hj20 {
    public final String a;
    public final v4v b;
    public final String c;

    public hj20(String str, ra90 ra90Var, String str2) {
        this.a = str;
        this.b = ra90Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj20)) {
            return false;
        }
        hj20 hj20Var = (hj20) obj;
        return jl40.l(this.a, hj20Var.a) && jl40.l(this.b, hj20Var.b) && jl40.l(this.c, hj20Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        v4v v4vVar = this.b;
        int hashCode2 = (hashCode + (v4vVar == null ? 0 : v4vVar.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MissionDescriptionItemState(content=");
        sb.append(this.a);
        sb.append(", leadIcon=");
        sb.append(this.b);
        sb.append(", deeplink=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
