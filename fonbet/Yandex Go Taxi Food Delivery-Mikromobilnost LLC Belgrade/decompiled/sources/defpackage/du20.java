package defpackage;

import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.PaymentProviderEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class du20 implements fu20 {
    public final PaymentProviderEntity a;

    public du20(PaymentProviderEntity paymentProviderEntity) {
        this.a = paymentProviderEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof du20) && jl40.l(this.a, ((du20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Provider(mobileProvider=" + this.a + Extension.C_BRAKE;
    }
}
