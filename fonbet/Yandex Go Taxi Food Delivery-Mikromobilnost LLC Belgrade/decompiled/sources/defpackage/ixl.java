package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class ixl extends nxl {
    public final d3q0 a;
    public final wbe0 b;

    public ixl(d3q0 d3q0Var, wbe0 wbe0Var) {
        this.a = d3q0Var;
        this.b = wbe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixl)) {
            return false;
        }
        ixl ixlVar = (ixl) obj;
        return jl40.l(this.a, ixlVar.a) && jl40.l(this.b, ixlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LoadPortion(patchParams=" + this.a + ", queryParams=" + this.b + Extension.C_BRAKE;
    }
}
