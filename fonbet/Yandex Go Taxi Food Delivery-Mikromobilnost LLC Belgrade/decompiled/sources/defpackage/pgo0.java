package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersPaymentMethodsSection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class pgo0 {
    public final ScootersPaymentMethodsSection a;

    public pgo0(ScootersPaymentMethodsSection scootersPaymentMethodsSection) {
        this.a = scootersPaymentMethodsSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pgo0) && this.a == ((pgo0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ScootersPaymentMethodsDeeplink(section=" + this.a + Extension.C_BRAKE;
    }
}
