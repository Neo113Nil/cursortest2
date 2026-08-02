package defpackage;

import java.math.BigDecimal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ah51 extends sg51 {
    public final BigDecimal b;

    public ah51(BigDecimal bigDecimal) {
        super(null);
        this.b = bigDecimal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ah51) && jl40.l(this.b, ((ah51) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Success(amount=" + this.b + Extension.C_BRAKE;
    }
}
