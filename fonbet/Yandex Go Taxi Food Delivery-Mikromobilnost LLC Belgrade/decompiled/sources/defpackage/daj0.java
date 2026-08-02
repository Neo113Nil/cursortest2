package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class daj0 {
    public final kdc a;
    public final kdc b;
    public final String c;

    public daj0(kdc kdcVar, kdc kdcVar2, String str) {
        this.a = kdcVar;
        this.b = kdcVar2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof daj0)) {
            return false;
        }
        daj0 daj0Var = (daj0) obj;
        return jl40.l(this.a, daj0Var.a) && jl40.l(this.b, daj0Var.b) && jl40.l(this.c, daj0Var.c);
    }

    public final int hashCode() {
        kdc kdcVar = this.a;
        int hashCode = (kdcVar == null ? 0 : kdcVar.hashCode()) * 31;
        kdc kdcVar2 = this.b;
        int hashCode2 = (hashCode + (kdcVar2 == null ? 0 : kdcVar2.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequiredAltChoiceOptionBadgeUiState(bgColor=");
        sb.append(this.a);
        sb.append(", textColor=");
        sb.append(this.b);
        sb.append(", text=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
