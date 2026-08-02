package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ez80 {
    public final jfa0 a;
    public final pl21 b;

    public ez80(jfa0 jfa0Var, pl21 pl21Var) {
        this.a = jfa0Var;
        this.b = pl21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez80)) {
            return false;
        }
        ez80 ez80Var = (ez80) obj;
        return this.a.equals(ez80Var.a) && jl40.l(this.b, ez80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OverdraftPaymentDomainState(availablePaymentOptions=" + this.a + ", debtState=" + this.b + Extension.C_BRAKE;
    }
}
