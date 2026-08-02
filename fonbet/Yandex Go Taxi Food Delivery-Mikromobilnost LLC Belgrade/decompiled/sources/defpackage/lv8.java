package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class lv8 {
    public final ldc a;
    public final int b;

    public lv8(ldc ldcVar, int i) {
        this.a = ldcVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv8)) {
            return false;
        }
        lv8 lv8Var = (lv8) obj;
        return jl40.l(this.a, lv8Var.a) && this.b == lv8Var.b;
    }

    public final int hashCode() {
        ldc ldcVar = this.a;
        return Integer.hashCode(this.b) + ((ldcVar == null ? 0 : Long.hashCode(ldcVar.a)) * 31);
    }

    public final String toString() {
        return "CargoFormContentStyle(backgroundColor=" + this.a + ", spacingHeight=" + this.b + Extension.C_BRAKE;
    }
}
