package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class nn40 {
    public final xfv a;
    public final mco b;

    public nn40(xfv xfvVar, mco mcoVar) {
        this.a = xfvVar;
        this.b = mcoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn40)) {
            return false;
        }
        nn40 nn40Var = (nn40) obj;
        return this.a.equals(nn40Var.a) && jl40.l(this.b, nn40Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mco mcoVar = this.b;
        return hashCode + (mcoVar == null ? 0 : mcoVar.hashCode());
    }

    public final String toString() {
        return "MultiTariffOptionLeadUiState(imageUiState=" + this.a + ", etaUiState=" + this.b + Extension.C_BRAKE;
    }
}
