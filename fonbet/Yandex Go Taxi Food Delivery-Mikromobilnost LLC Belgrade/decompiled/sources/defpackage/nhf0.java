package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class nhf0 {
    public final ldc a;
    public final ldc b;
    public final String c;

    public nhf0(ldc ldcVar, ldc ldcVar2, String str) {
        this.a = ldcVar;
        this.b = ldcVar2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhf0)) {
            return false;
        }
        nhf0 nhf0Var = (nhf0) obj;
        return jl40.l(this.a, nhf0Var.a) && jl40.l(this.b, nhf0Var.b) && jl40.l(this.c, nhf0Var.c);
    }

    public final int hashCode() {
        ldc ldcVar = this.a;
        int hashCode = (ldcVar == null ? 0 : Long.hashCode(ldcVar.a)) * 31;
        ldc ldcVar2 = this.b;
        return this.c.hashCode() + ((hashCode + (ldcVar2 != null ? Long.hashCode(ldcVar2.a) : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBadgeState(backgroundColor=");
        sb.append(this.a);
        sb.append(", textColor=");
        sb.append(this.b);
        sb.append(", text=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
