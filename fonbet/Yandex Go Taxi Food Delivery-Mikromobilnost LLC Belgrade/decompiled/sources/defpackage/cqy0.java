package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class cqy0 {
    public final ldc a;
    public final ma6 b;

    public cqy0(ldc ldcVar, ma6 ma6Var) {
        this.a = ldcVar;
        this.b = ma6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqy0)) {
            return false;
        }
        cqy0 cqy0Var = (cqy0) obj;
        return jl40.l(this.a, cqy0Var.a) && jl40.l(this.b, cqy0Var.b);
    }

    public final int hashCode() {
        ldc ldcVar = this.a;
        int hashCode = (ldcVar == null ? 0 : Long.hashCode(ldcVar.a)) * 31;
        ma6 ma6Var = this.b;
        return hashCode + (ma6Var != null ? ma6Var.hashCode() : 0);
    }

    public final String toString() {
        return "TextInputStyle(backgroundColor=" + this.a + ", border=" + this.b + Extension.C_BRAKE;
    }
}
