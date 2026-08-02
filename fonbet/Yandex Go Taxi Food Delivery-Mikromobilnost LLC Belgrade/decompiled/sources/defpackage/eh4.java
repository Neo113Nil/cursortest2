package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class eh4 {
    public final fxy0 a;
    public final fxy0 b;
    public final dyt c;

    public eh4(fxy0 fxy0Var, fxy0 fxy0Var2, dyt dytVar) {
        this.a = fxy0Var;
        this.b = fxy0Var2;
        this.c = dytVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh4)) {
            return false;
        }
        eh4 eh4Var = (eh4) obj;
        return jl40.l(this.a, eh4Var.a) && jl40.l(this.b, eh4Var.b) && jl40.l(this.c, eh4Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        fxy0 fxy0Var = this.b;
        int hashCode2 = (hashCode + (fxy0Var == null ? 0 : fxy0Var.hashCode())) * 31;
        dyt dytVar = this.c;
        return hashCode2 + (dytVar != null ? dytVar.hashCode() : 0);
    }

    public final String toString() {
        return "BackgroundEntity(color=" + this.a + ", image=" + this.b + ", gradient=" + this.c + Extension.C_BRAKE;
    }
}
