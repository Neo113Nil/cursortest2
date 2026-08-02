package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class f9x0 implements r9x0 {
    public final List a;

    public f9x0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f9x0) && jl40.l(this.a, ((f9x0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("OpenPaymentMethodsAction(availablePaymentTypes=", Extension.C_BRAKE, this.a);
    }
}
