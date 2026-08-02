package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ott0 {
    public final String a;
    public final uda0 b;
    public final h5a0 c;

    public ott0(String str, uda0 uda0Var, h5a0 h5a0Var) {
        this.a = str;
        this.b = uda0Var;
        this.c = h5a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ott0)) {
            return false;
        }
        ott0 ott0Var = (ott0) obj;
        return jl40.l(this.a, ott0Var.a) && this.b.equals(ott0Var.b) && jl40.l(this.c, ott0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        h5a0 h5a0Var = this.c;
        return hashCode + (h5a0Var == null ? 0 : h5a0Var.hashCode());
    }

    public final String toString() {
        return "PaymentMethodsBottomSheet(title=" + this.a + ", paymentMethods=" + this.b + ", selectedPaymentMethod=" + this.c + Extension.C_BRAKE;
    }
}
