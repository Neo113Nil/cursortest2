package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.domain.InternetProviderWithPersonalAccountEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class euw implements ury {
    public final InternetProviderWithPersonalAccountEntity a;

    public euw(InternetProviderWithPersonalAccountEntity internetProviderWithPersonalAccountEntity) {
        this.a = internetProviderWithPersonalAccountEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof euw) && jl40.l(this.a, ((euw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InternetProvidersListItemData(provider=" + this.a + Extension.C_BRAKE;
    }
}
