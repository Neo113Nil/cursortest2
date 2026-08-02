package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mx00 {
    public final String a;
    public final ldc b;
    public final w3b1 c;
    public final cuj0 d;
    public final sls e;

    public mx00(String str, ldc ldcVar, xhc xhcVar, cuj0 cuj0Var, sls slsVar) {
        this.a = str;
        this.b = ldcVar;
        this.c = xhcVar;
        this.d = cuj0Var;
        this.e = slsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx00)) {
            return false;
        }
        mx00 mx00Var = (mx00) obj;
        return jl40.l(this.a, mx00Var.a) && jl40.l(this.b, mx00Var.b) && jl40.l(this.c, mx00Var.c) && this.d.equals(mx00Var.d) && jl40.l(this.e, mx00Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ldc ldcVar = this.b;
        int hashCode2 = (hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31;
        w3b1 w3b1Var = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (w3b1Var != null ? w3b1Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdvertisementTag(text=");
        sb.append(this.a);
        sb.append(", textColor=");
        sb.append(this.b);
        sb.append(", background=");
        sb.append(this.c);
        sb.append(", icon=");
        sb.append(this.d);
        sb.append(", onClick=");
        return ly3.r(sb, this.e, Extension.C_BRAKE);
    }
}
