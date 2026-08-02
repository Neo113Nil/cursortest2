package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class phx0 {
    public final au2 a;
    public final t0s b;
    public final ohx0 c;
    public final String d;
    public final String e;

    public phx0(au2 au2Var, t0s t0sVar, ohx0 ohx0Var, String str, String str2) {
        this.a = au2Var;
        this.b = t0sVar;
        this.c = ohx0Var;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof phx0) {
            phx0 phx0Var = (phx0) obj;
            if (this.a == phx0Var.a && this.b.equals(phx0Var.b) && jl40.l(this.c, phx0Var.c) && jl40.l(this.d, phx0Var.d) && jl40.l(this.e, phx0Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ohx0 ohx0Var = this.c;
        int b = unr0.b((hashCode + (ohx0Var == null ? 0 : ohx0Var.a.hashCode())) * 31, 31, this.d);
        String str = this.e;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TariffOptionsButtonUiState(appIcon=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", badgeUiState=");
        sb.append(this.c);
        sb.append(", contentDescription=");
        sb.append(this.d);
        sb.append(", clickActionLabel=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
