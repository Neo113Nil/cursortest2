package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class aoe extends trb1 {
    public final c0k0 a;
    public final vu0 b;

    public aoe(c0k0 c0k0Var, vu0 vu0Var) {
        this.a = c0k0Var;
        this.b = vu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoe)) {
            return false;
        }
        aoe aoeVar = (aoe) obj;
        return this.a.equals(aoeVar.a) && jl40.l(this.b, aoeVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        vu0 vu0Var = this.b;
        return hashCode + (vu0Var == null ? 0 : vu0Var.hashCode());
    }

    public final String toString() {
        return "AddressCoordinateSourceModel(resultPosition=" + this.a + ", addressFlow=" + this.b + Extension.C_BRAKE;
    }
}
