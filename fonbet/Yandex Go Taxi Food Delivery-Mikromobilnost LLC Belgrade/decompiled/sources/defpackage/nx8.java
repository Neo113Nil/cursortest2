package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class nx8 {
    public final ldc a;
    public final ldc b;

    public nx8(ldc ldcVar, ldc ldcVar2) {
        this.a = ldcVar;
        this.b = ldcVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx8)) {
            return false;
        }
        nx8 nx8Var = (nx8) obj;
        return jl40.l(this.a, nx8Var.a) && jl40.l(this.b, nx8Var.b);
    }

    public final int hashCode() {
        ldc ldcVar = this.a;
        int hashCode = (ldcVar == null ? 0 : Long.hashCode(ldcVar.a)) * 31;
        ldc ldcVar2 = this.b;
        return hashCode + (ldcVar2 != null ? Long.hashCode(ldcVar2.a) : 0);
    }

    public final String toString() {
        return "CarouselIndicatorsStyleModel(selectedColor=" + this.a + ", unselectedColor=" + this.b + Extension.C_BRAKE;
    }
}
