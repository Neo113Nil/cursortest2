package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class f770 extends mr {
    public final List a;
    public final tls b;

    public f770(List list, tls tlsVar) {
        this.a = list;
        this.b = tlsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f770)) {
            return false;
        }
        f770 f770Var = (f770) obj;
        return jl40.l(this.a, f770Var.a) && this.b.equals(f770Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenPaymentMethods(availablePaymentTypes=" + this.a + ", onCloseAction=" + this.b + Extension.C_BRAKE;
    }
}
