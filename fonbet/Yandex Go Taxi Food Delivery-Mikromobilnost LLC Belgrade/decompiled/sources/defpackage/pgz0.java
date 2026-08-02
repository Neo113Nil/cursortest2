package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pgz0 {
    public final List a;

    public pgz0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pgz0) && jl40.l(this.a, ((pgz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("TipsPaymentData(availablePaymentTypes=", Extension.C_BRAKE, this.a);
    }
}
