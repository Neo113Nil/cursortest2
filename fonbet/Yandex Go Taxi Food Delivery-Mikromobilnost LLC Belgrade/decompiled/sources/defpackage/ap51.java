package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ap51 implements mo51 {
    public final String a;
    public final ief b;
    public final String c;

    public ap51(String str, ief iefVar, String str2) {
        this.a = str;
        this.b = iefVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap51)) {
            return false;
        }
        ap51 ap51Var = (ap51) obj;
        return jl40.l(this.a, ap51Var.a) && jl40.l(this.b, ap51Var.b) && jl40.l(this.c, ap51Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YangoPayWalletPaymentInfoWrapper(paymentMethodId=");
        sb.append(this.a);
        sb.append(", currencyRules=");
        sb.append(this.b);
        sb.append(", currencyPlaceholder=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
