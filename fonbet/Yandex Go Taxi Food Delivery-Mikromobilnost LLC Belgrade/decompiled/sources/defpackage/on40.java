package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class on40 {
    public final b1f0 a;
    public final xq80 b;
    public final v49 c;

    public on40(b1f0 b1f0Var, xq80 xq80Var, v49 v49Var) {
        this.a = b1f0Var;
        this.b = xq80Var;
        this.c = v49Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on40)) {
            return false;
        }
        on40 on40Var = (on40) obj;
        return this.a.equals(on40Var.a) && jl40.l(this.b, on40Var.b) && jl40.l(this.c, on40Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        xq80 xq80Var = this.b;
        int hashCode2 = (hashCode + (xq80Var == null ? 0 : xq80Var.hashCode())) * 31;
        v49 v49Var = this.c;
        return hashCode2 + (v49Var != null ? v49Var.hashCode() : 0);
    }

    public final String toString() {
        return "MultiTariffOptionTrail2UiState(priceUiState=" + this.a + ", originalPriceUiState=" + this.b + ", cashbackUiState=" + this.c + Extension.C_BRAKE;
    }
}
