package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class gj20 {
    public final String a;
    public final w4v b;
    public final String c;

    public gj20(String str, w4v w4vVar, String str2) {
        this.a = str;
        this.b = w4vVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj20)) {
            return false;
        }
        gj20 gj20Var = (gj20) obj;
        return jl40.l(this.a, gj20Var.a) && jl40.l(this.b, gj20Var.b) && jl40.l(this.c, gj20Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        w4v w4vVar = this.b;
        int hashCode2 = (hashCode + (w4vVar == null ? 0 : w4vVar.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MissionDescriptionItemModel(content=");
        sb.append(this.a);
        sb.append(", leadIcon=");
        sb.append(this.b);
        sb.append(", deeplink=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
