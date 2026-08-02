package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class jfa0 {
    public final List a;
    public final rhq0 b;
    public final boolean c;

    public jfa0(List list, rhq0 rhq0Var, boolean z) {
        this.a = list;
        this.b = rhq0Var;
        this.c = z;
    }

    public static jfa0 a(jfa0 jfa0Var, List list, rhq0 rhq0Var, int i) {
        if ((i & 1) != 0) {
            list = jfa0Var.a;
        }
        if ((i & 2) != 0) {
            rhq0Var = jfa0Var.b;
        }
        boolean z = (i & 4) != 0 ? jfa0Var.c : true;
        jfa0Var.getClass();
        return new jfa0(list, rhq0Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfa0)) {
            return false;
        }
        jfa0 jfa0Var = (jfa0) obj;
        return jl40.l(this.a, jfa0Var.a) && jl40.l(this.b, jfa0Var.b) && this.c == jfa0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rhq0 rhq0Var = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (rhq0Var == null ? 0 : rhq0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentOptionsForPmlScreen(paymentModels=");
        sb.append(this.a);
        sb.append(", selectedPayment=");
        sb.append(this.b);
        sb.append(", isLoading=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
