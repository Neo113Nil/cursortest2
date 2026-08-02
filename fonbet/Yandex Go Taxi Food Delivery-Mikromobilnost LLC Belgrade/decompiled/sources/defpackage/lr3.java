package defpackage;

import java.math.BigDecimal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class lr3 {
    public final boolean a;
    public final BigDecimal b;

    public lr3(boolean z, BigDecimal bigDecimal) {
        this.a = z;
        this.b = bigDecimal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr3)) {
            return false;
        }
        lr3 lr3Var = (lr3) obj;
        return this.a == lr3Var.a && jl40.l(this.b, lr3Var.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        BigDecimal bigDecimal = this.b;
        return hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }

    public final String toString() {
        return "AutoFundParams(enabled=" + this.a + ", fundAmountLimit=" + this.b + Extension.C_BRAKE;
    }
}
