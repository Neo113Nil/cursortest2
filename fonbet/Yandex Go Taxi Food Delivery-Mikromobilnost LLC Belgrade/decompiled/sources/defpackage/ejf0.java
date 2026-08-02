package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ejf0 {
    public final double a;
    public final ldc b;
    public final ldc c;

    public ejf0(double d, ldc ldcVar, ldc ldcVar2) {
        this.a = d;
        this.b = ldcVar;
        this.c = ldcVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejf0)) {
            return false;
        }
        ejf0 ejf0Var = (ejf0) obj;
        return Double.compare(this.a, ejf0Var.a) == 0 && jl40.l(this.b, ejf0Var.b) && jl40.l(this.c, ejf0Var.c);
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.a) * 31;
        ldc ldcVar = this.b;
        int hashCode2 = (hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31;
        ldc ldcVar2 = this.c;
        return hashCode2 + (ldcVar2 != null ? Long.hashCode(ldcVar2.a) : 0);
    }

    public final String toString() {
        return "ProgressIndicatorState(progress=" + this.a + ", fillColor=" + this.b + ", trackColor=" + this.c + Extension.C_BRAKE;
    }
}
