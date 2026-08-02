package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ncu {
    public final x91 a;
    public final yex0 b;

    public ncu(x91 x91Var, yex0 yex0Var) {
        this.a = x91Var;
        this.b = yex0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncu)) {
            return false;
        }
        ncu ncuVar = (ncu) obj;
        return this.a.equals(ncuVar.a) && jl40.l(this.b, ncuVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        yex0 yex0Var = this.b;
        return hashCode + (yex0Var == null ? 0 : yex0Var.hashCode());
    }

    public final String toString() {
        return "HeaderToolbarUiState(addressesUiState=" + this.a + ", tariffDetailsButtonUiState=" + this.b + Extension.C_BRAKE;
    }
}
