package defpackage;

import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.PaymentProviderEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class itw implements qas0 {
    public final PaymentProviderEntity a;
    public final String b;

    public itw(PaymentProviderEntity paymentProviderEntity, String str) {
        this.a = paymentProviderEntity;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final PaymentProviderEntity b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itw)) {
            return false;
        }
        itw itwVar = (itw) obj;
        return jl40.l(this.a, itwVar.a) && this.b.equals(itwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProviderSelected(provider=" + this.a + ", accountNumber=" + this.b + Extension.C_BRAKE;
    }
}
