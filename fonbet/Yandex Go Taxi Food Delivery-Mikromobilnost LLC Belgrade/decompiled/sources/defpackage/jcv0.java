package defpackage;

import java.math.BigDecimal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class jcv0 {
    public final BigDecimal a;
    public final String b;

    public jcv0(BigDecimal bigDecimal, String str) {
        this.a = bigDecimal;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcv0)) {
            return false;
        }
        jcv0 jcv0Var = (jcv0) obj;
        return this.a.equals(jcv0Var.a) && this.b.equals(jcv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SumToTopUp(amount=" + this.a + ", formatted=" + this.b + Extension.C_BRAKE;
    }
}
