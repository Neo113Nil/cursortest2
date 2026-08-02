package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class nz3 {
    public final List a;
    public final oz3 b;
    public final nsz0 c;

    public nz3(List list, oz3 oz3Var, nsz0 nsz0Var) {
        this.a = list;
        this.b = oz3Var;
        this.c = nsz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz3)) {
            return false;
        }
        nz3 nz3Var = (nz3) obj;
        return jl40.l(this.a, nz3Var.a) && this.b.equals(nz3Var.b) && jl40.l(this.c, nz3Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        nsz0 nsz0Var = this.c;
        return hashCode + (nsz0Var == null ? 0 : nsz0Var.hashCode());
    }

    public final String toString() {
        return "BindingPaymentData(boundPaymentMethodIds=" + this.a + ", bindingPaymentInstructions=" + this.b + ", toolbarButton=" + this.c + Extension.C_BRAKE;
    }
}
