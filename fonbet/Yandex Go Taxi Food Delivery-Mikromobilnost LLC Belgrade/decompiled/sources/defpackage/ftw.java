package defpackage;

import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.PaymentProviderEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ftw {
    public final PaymentProviderEntity a;
    public final cuw b;
    public final PageHeaderEntity c;

    public ftw(PaymentProviderEntity paymentProviderEntity, cuw cuwVar, PageHeaderEntity pageHeaderEntity) {
        this.a = paymentProviderEntity;
        this.b = cuwVar;
        this.c = pageHeaderEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftw)) {
            return false;
        }
        ftw ftwVar = (ftw) obj;
        return this.a.equals(ftwVar.a) && this.b.equals(ftwVar.b) && this.c.equals(ftwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "InternetPaymentFormInputSuccessState(provider=" + this.a + ", inputField=" + this.b + ", header=" + this.c + Extension.C_BRAKE;
    }
}
