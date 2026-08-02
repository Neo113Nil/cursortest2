package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class nn30 extends on30 {
    public final List a;
    public final f4a0 b;

    public nn30(List list, f4a0 f4a0Var) {
        this.a = list;
        this.b = f4a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn30)) {
            return false;
        }
        nn30 nn30Var = (nn30) obj;
        return jl40.l(this.a, nn30Var.a) && jl40.l(this.b, nn30Var.b);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        f4a0 f4a0Var = this.b;
        return hashCode + (f4a0Var != null ? f4a0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Success(paymentMethods=" + this.a + ", selectedPaymentMethod=" + this.b + Extension.C_BRAKE;
    }

    public nn30() {
        this(EmptyList.a, null);
    }
}
