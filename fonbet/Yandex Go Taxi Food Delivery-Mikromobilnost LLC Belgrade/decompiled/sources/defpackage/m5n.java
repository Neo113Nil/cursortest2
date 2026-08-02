package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class m5n extends n351 {
    public final cyu0 c;
    public final cyu0 d;
    public final ldc e;
    public final gv90 f;
    public final String g;

    public m5n(cyu0 cyu0Var, cyu0 cyu0Var2, ldc ldcVar, gv90 gv90Var, String str) {
        super("dynamic-content-action-button-key", false, 14);
        this.c = cyu0Var;
        this.d = cyu0Var2;
        this.e = ldcVar;
        this.f = gv90Var;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5n)) {
            return false;
        }
        m5n m5nVar = (m5n) obj;
        return this.c.equals(m5nVar.c) && jl40.l(this.d, m5nVar.d) && jl40.l(this.e, m5nVar.e) && jl40.l(this.f, m5nVar.f) && jl40.l(this.g, m5nVar.g);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        cyu0 cyu0Var = this.d;
        int hashCode2 = (hashCode + (cyu0Var == null ? 0 : cyu0Var.hashCode())) * 31;
        ldc ldcVar = this.e;
        int hashCode3 = (hashCode2 + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31;
        gv90 gv90Var = this.f;
        int hashCode4 = (hashCode3 + (gv90Var == null ? 0 : gv90Var.hashCode())) * 31;
        String str = this.g;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DynamicContentActionButtonModel(title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", backgroundColor=");
        sb.append(this.e);
        sb.append(", payload=");
        sb.append(this.f);
        sb.append(", metricaLabel=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
