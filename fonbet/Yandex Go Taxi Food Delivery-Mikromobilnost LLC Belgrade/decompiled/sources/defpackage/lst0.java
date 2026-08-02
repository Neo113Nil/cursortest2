package defpackage;

import java.math.BigDecimal;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class lst0 {
    public final List a;
    public final BigDecimal b;

    public lst0(List list, BigDecimal bigDecimal) {
        this.a = list;
        this.b = bigDecimal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lst0)) {
            return false;
        }
        lst0 lst0Var = (lst0) obj;
        return this.a.equals(lst0Var.a) && this.b.equals(lst0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SplitContractCart(items=" + this.a + ", totalAmount=" + this.b + Extension.C_BRAKE;
    }
}
