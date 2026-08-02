package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class ivt extends lea0 {
    public final zut a;

    public ivt(zut zutVar) {
        this.a = zutVar;
    }

    @Override // defpackage.lea0
    public final String b() {
        return null;
    }

    @Override // defpackage.lea0
    public final PaymentMethod$Type c() {
        return PaymentMethod$Type.GOOGLE_PAY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ivt) && jl40.l(this.a, ((ivt) obj).a);
    }

    @Override // defpackage.lea0, defpackage.f731
    public final String getId() {
        return null;
    }

    public final int hashCode() {
        zut zutVar = this.a;
        if (zutVar == null) {
            return 0;
        }
        return zutVar.hashCode();
    }

    public final String toString() {
        return "GooglePayPayment(googlePayBindTokenParams=" + this.a + Extension.C_BRAKE;
    }

    public ivt() {
        this(null);
    }
}
