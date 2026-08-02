package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jtb0 {
    public final ra90 a;
    public final ldc b;

    public jtb0(ra90 ra90Var, ldc ldcVar) {
        this.a = ra90Var;
        this.b = ldcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtb0)) {
            return false;
        }
        jtb0 jtb0Var = (jtb0) obj;
        return this.a.equals(jtb0Var.a) && jl40.l(this.b, jtb0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ldc ldcVar = this.b;
        return hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a));
    }

    public final String toString() {
        return "Bubble(image=" + this.a + ", backgroundColor=" + this.b + Extension.C_BRAKE;
    }
}
