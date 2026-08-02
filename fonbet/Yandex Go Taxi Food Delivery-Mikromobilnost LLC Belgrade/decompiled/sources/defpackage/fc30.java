package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class fc30 {
    public final obm a;
    public final obm b;
    public final String c;

    public fc30(obm obmVar, obm obmVar2, String str) {
        this.a = obmVar;
        this.b = obmVar2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc30)) {
            return false;
        }
        fc30 fc30Var = (fc30) obj;
        return jl40.l(this.a, fc30Var.a) && jl40.l(this.b, fc30Var.b) && jl40.l(this.c, fc30Var.c);
    }

    public final int hashCode() {
        obm obmVar = this.a;
        int hashCode = (obmVar == null ? 0 : obmVar.a.hashCode()) * 31;
        obm obmVar2 = this.b;
        int hashCode2 = (hashCode + (obmVar2 == null ? 0 : obmVar2.a.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MtAddressIcons(source=");
        sb.append(this.a);
        sb.append(", destination=");
        sb.append(this.b);
        sb.append(", avatarUrl=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
