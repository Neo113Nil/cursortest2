package defpackage;

import java.math.BigDecimal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class is01 implements js01 {
    public final BigDecimal a;

    public is01(BigDecimal bigDecimal) {
        this.a = bigDecimal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof is01) && jl40.l(this.a, ((is01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(amount=" + this.a + Extension.C_BRAKE;
    }
}
