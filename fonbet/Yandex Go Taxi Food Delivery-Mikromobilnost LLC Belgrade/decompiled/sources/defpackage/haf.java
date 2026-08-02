package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class haf extends ptb1 {
    public final pdq0 a;

    public haf(pdq0 pdq0Var) {
        this.a = pdq0Var;
    }

    public final pdq0 d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof haf) && this.a.equals(((haf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PaymentMethodsBottomSheet(selectPaymentMethodViewState=" + this.a + Extension.C_BRAKE;
    }
}
