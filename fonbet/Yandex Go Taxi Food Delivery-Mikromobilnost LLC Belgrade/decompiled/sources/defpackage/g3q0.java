package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class g3q0 {
    public final List a;
    public final ldc b;

    public g3q0(List list, ldc ldcVar) {
        this.a = list;
        this.b = ldcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3q0)) {
            return false;
        }
        g3q0 g3q0Var = (g3q0) obj;
        return this.a.equals(g3q0Var.a) && jl40.l(this.b, g3q0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ldc ldcVar = this.b;
        return hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a));
    }

    public final String toString() {
        return "SectionPromo(widgets=" + this.a + ", backgroundColor=" + this.b + Extension.C_BRAKE;
    }
}
