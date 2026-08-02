package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jps0 {
    public final v4v a;
    public final v4v b;
    public final ldc c;

    public jps0(lvi0 lvi0Var, lvi0 lvi0Var2, ldc ldcVar) {
        this.a = lvi0Var;
        this.b = lvi0Var2;
        this.c = ldcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jps0)) {
            return false;
        }
        jps0 jps0Var = (jps0) obj;
        return jl40.l(this.a, jps0Var.a) && jl40.l(this.b, jps0Var.b) && jl40.l(this.c, jps0Var.c);
    }

    public final int hashCode() {
        v4v v4vVar = this.a;
        int hashCode = (v4vVar == null ? 0 : v4vVar.hashCode()) * 31;
        v4v v4vVar2 = this.b;
        int hashCode2 = (hashCode + (v4vVar2 == null ? 0 : v4vVar2.hashCode())) * 31;
        ldc ldcVar = this.c;
        return hashCode2 + (ldcVar != null ? Long.hashCode(ldcVar.a) : 0);
    }

    public final String toString() {
        return "SliderHandlerState(activeImage=" + this.a + ", completeImage=" + this.b + ", backgroundColor=" + this.c + Extension.C_BRAKE;
    }
}
