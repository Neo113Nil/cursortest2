package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class dty0 {
    public final sty0 a;
    public final lzr b;
    public final ldc c;

    public dty0(sty0 sty0Var, lzr lzrVar, ldc ldcVar) {
        this.a = sty0Var;
        this.b = lzrVar;
        this.c = ldcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dty0)) {
            return false;
        }
        dty0 dty0Var = (dty0) obj;
        return jl40.l(this.a, dty0Var.a) && jl40.l(this.b, dty0Var.b) && jl40.l(this.c, dty0Var.c);
    }

    public final int hashCode() {
        sty0 sty0Var = this.a;
        int hashCode = (sty0Var == null ? 0 : Long.hashCode(sty0Var.a)) * 31;
        lzr lzrVar = this.b;
        int i = (hashCode + (lzrVar == null ? 0 : lzrVar.a)) * 31;
        ldc ldcVar = this.c;
        return i + (ldcVar != null ? Long.hashCode(ldcVar.a) : 0);
    }

    public final String toString() {
        return "TextStyle(size=" + this.a + ", weight=" + this.b + ", color=" + this.c + Extension.C_BRAKE;
    }
}
