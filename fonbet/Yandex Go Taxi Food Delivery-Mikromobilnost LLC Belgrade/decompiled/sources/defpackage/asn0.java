package defpackage;

import com.yandex.go.scooters.ignition.domain.model.ScootersIgnitionOption;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class asn0 {
    public final ScootersIgnitionOption a;

    public final boolean equals(Object obj) {
        if (obj instanceof asn0) {
            return this.a == ((asn0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ScootersIgnitionPermissionInfoPayload(scootersIgnitionOption=" + this.a + Extension.C_BRAKE;
    }
}
