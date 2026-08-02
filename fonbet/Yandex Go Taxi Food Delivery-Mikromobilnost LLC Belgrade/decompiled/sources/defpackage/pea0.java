package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class pea0 {
    public final String a;
    public final Integer b;
    public final tx90 c;
    public final String d;

    public pea0(String str, Integer num, tx90 tx90Var, String str2) {
        this.a = str;
        this.b = num;
        this.c = tx90Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pea0)) {
            return false;
        }
        pea0 pea0Var = (pea0) obj;
        return jl40.l(this.a, pea0Var.a) && jl40.l(this.b, pea0Var.b) && jl40.l(this.c, pea0Var.c) && jl40.l(this.d, pea0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        tx90 tx90Var = this.c;
        int hashCode3 = (hashCode2 + (tx90Var == null ? 0 : tx90Var.a.hashCode())) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder q = n.q("PaymentModelsAdditionalParams(serviceToken=", this.b, this.a, ", regionId=", ", paymentCardProfile=");
        q.append(this.c);
        q.append(", currencyCode=");
        q.append(this.d);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }
}
