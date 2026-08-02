package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class mcx0 {
    public final m8u0 a;
    public final bpl0 b;

    public mcx0(m8u0 m8u0Var, bpl0 bpl0Var) {
        this.a = m8u0Var;
        this.b = bpl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcx0)) {
            return false;
        }
        mcx0 mcx0Var = (mcx0) obj;
        return jl40.l(this.a, mcx0Var.a) && this.b.equals(mcx0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "TariffCardInfo(statusBarUiState=" + this.a + ", itemsUiState=" + this.b + Extension.C_BRAKE;
    }
}
