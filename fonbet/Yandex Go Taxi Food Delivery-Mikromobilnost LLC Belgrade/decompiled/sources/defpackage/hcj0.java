package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class hcj0 {
    public final mcj0 a;

    public hcj0(mcj0 mcj0Var) {
        this.a = mcj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hcj0) && jl40.l(this.a, ((hcj0) obj).a);
    }

    public final int hashCode() {
        mcj0 mcj0Var = this.a;
        if (mcj0Var == null) {
            return 0;
        }
        return mcj0Var.hashCode();
    }

    public final String toString() {
        return "RequirementAddressInput(promoBlock=" + this.a + Extension.C_BRAKE;
    }
}
