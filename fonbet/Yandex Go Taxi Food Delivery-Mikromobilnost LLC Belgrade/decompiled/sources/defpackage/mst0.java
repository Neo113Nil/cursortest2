package defpackage;

import java.math.BigDecimal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class mst0 {
    public final String a;
    public final BigDecimal b;

    public mst0(String str, BigDecimal bigDecimal) {
        this.a = str;
        this.b = bigDecimal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mst0)) {
            return false;
        }
        mst0 mst0Var = (mst0) obj;
        return this.a.equals(mst0Var.a) && this.b.equals(mst0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SplitContractCartItem(title=" + this.a + ", amount=" + this.b + Extension.C_BRAKE;
    }
}
