package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class iaa0 {
    public final pz3 a;
    public final uda0 b;

    public iaa0(pz3 pz3Var, uda0 uda0Var) {
        this.a = pz3Var;
        this.b = uda0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iaa0)) {
            return false;
        }
        iaa0 iaa0Var = (iaa0) obj;
        return jl40.l(this.a, iaa0Var.a) && this.b.equals(iaa0Var.b);
    }

    public final int hashCode() {
        pz3 pz3Var = this.a;
        return this.b.hashCode() + ((pz3Var == null ? 0 : pz3Var.hashCode()) * 31);
    }

    public final String toString() {
        return "PaymentMethodsEntity(savingNotice=" + this.a + ", paymentMethodList=" + this.b + Extension.C_BRAKE;
    }
}
