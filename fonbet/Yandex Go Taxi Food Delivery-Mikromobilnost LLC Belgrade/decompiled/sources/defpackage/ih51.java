package defpackage;

import java.math.BigDecimal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ih51 implements jh51 {
    public final BigDecimal a;

    public ih51(BigDecimal bigDecimal) {
        this.a = bigDecimal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ih51) && jl40.l(this.a, ((ih51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(amount=" + this.a + Extension.C_BRAKE;
    }
}
