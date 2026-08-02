package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class ngy0 implements ig5 {
    public static final mgy0 Companion = new mgy0();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ ngy0(int i, String str, String str2, String str3) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, lgy0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngy0)) {
            return false;
        }
        ngy0 ngy0Var = (ngy0) obj;
        return jl40.l(this.a, ngy0Var.a) && jl40.l(this.b, ngy0Var.b) && jl40.l(this.c, ngy0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("TerminalStateAction(result=", this.a, ", description=", this.b, ", reasonCode="), this.c, Extension.C_BRAKE);
    }
}
