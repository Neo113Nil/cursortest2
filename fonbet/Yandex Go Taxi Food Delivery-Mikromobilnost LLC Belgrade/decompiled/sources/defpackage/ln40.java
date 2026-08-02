package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ln40 {
    public final ziz0 a;
    public final w2v0 b;

    public ln40(ziz0 ziz0Var, w2v0 w2v0Var) {
        this.a = ziz0Var;
        this.b = w2v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln40)) {
            return false;
        }
        ln40 ln40Var = (ln40) obj;
        return this.a.equals(ln40Var.a) && jl40.l(this.b, ln40Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        w2v0 w2v0Var = this.b;
        return hashCode + (w2v0Var == null ? 0 : w2v0Var.hashCode());
    }

    public final String toString() {
        return "MultiTariffOptionBodyUiState(titleUiState=" + this.a + ", subtitleUiState=" + this.b + Extension.C_BRAKE;
    }
}
