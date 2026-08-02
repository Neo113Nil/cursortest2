package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class oea0 {
    public static final oea0 e;
    public final List a;
    public final List b;
    public final lea0 c;
    public final pea0 d;

    static {
        EmptyList emptyList = EmptyList.a;
        e = new oea0(emptyList, emptyList, null, null);
    }

    public oea0(List list, List list2, lea0 lea0Var, pea0 pea0Var) {
        this.a = list;
        this.b = list2;
        this.c = lea0Var;
        this.d = pea0Var;
    }

    public final boolean a() {
        return this.a.isEmpty() && this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oea0)) {
            return false;
        }
        oea0 oea0Var = (oea0) obj;
        return jl40.l(this.a, oea0Var.a) && jl40.l(this.b, oea0Var.b) && jl40.l(this.c, oea0Var.c) && jl40.l(this.d, oea0Var.d);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        lea0 lea0Var = this.c;
        int hashCode = (c + (lea0Var == null ? 0 : lea0Var.hashCode())) * 31;
        pea0 pea0Var = this.d;
        return hashCode + (pea0Var != null ? pea0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = qv10.v("PaymentModels(paymentModels=", this.a, ", addPaymentModels=", this.b, ", lastUsedPayment=");
        v.append(this.c);
        v.append(", additionalParams=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
