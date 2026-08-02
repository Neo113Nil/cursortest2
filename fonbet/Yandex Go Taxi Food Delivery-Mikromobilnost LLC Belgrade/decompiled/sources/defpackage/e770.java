package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class e770 implements b151 {
    public final List a;
    public final x2s b;

    public e770(List list, x2s x2sVar) {
        this.a = list;
        this.b = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e770)) {
            return false;
        }
        e770 e770Var = (e770) obj;
        return jl40.l(this.a, e770Var.a) && this.b.equals(e770Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenPaymentMethodWidgetAction(availablePaymentTypes=" + this.a + ", analyticsData=" + this.b + Extension.C_BRAKE;
    }
}
