package defpackage;

import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.PaymentProviderEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class iu20 implements qas0 {
    public final PaymentProviderEntity a;
    public final String b;

    public iu20(PaymentProviderEntity paymentProviderEntity, String str) {
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
        if (!(obj instanceof iu20)) {
            return false;
        }
        iu20 iu20Var = (iu20) obj;
        return jl40.l(this.a, iu20Var.a) && jl40.l(this.b, iu20Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "MobileProviderSelected(provider=" + this.a + ", phone=" + this.b + Extension.C_BRAKE;
    }
}
