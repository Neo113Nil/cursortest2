package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class nox0 extends t4z0 {
    public final v4v a;
    public final v4v b;

    public nox0(ra90 ra90Var, ra90 ra90Var2) {
        this.a = ra90Var;
        this.b = ra90Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nox0)) {
            return false;
        }
        nox0 nox0Var = (nox0) obj;
        return jl40.l(this.a, nox0Var.a) && jl40.l(this.b, nox0Var.b);
    }

    public final int hashCode() {
        v4v v4vVar = this.a;
        int hashCode = (v4vVar == null ? 0 : v4vVar.hashCode()) * 31;
        v4v v4vVar2 = this.b;
        return hashCode + (v4vVar2 != null ? v4vVar2.hashCode() : 0);
    }

    public final String toString() {
        return "TariffTileFooterState(tariffIcon=" + this.a + ", optionIcon=" + this.b + Extension.C_BRAKE;
    }

    public nox0() {
        this(null, null);
    }
}
