package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.eatskit.dto.ExternalServiceData;

/* loaded from: classes14.dex */
public final class n3p implements k3p {
    public final ExternalServiceData a;

    public n3p(ExternalServiceData externalServiceData) {
        this.a = externalServiceData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n3p) && this.a == ((n3p) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ServiceDataAction(serviceData=" + this.a + Extension.C_BRAKE;
    }
}
