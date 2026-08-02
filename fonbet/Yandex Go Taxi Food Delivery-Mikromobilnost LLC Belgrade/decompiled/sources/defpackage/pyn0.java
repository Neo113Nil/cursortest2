package defpackage;

import com.yandex.go.scooters.api.domain.model.ScootersVehicleType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class pyn0 {
    public final ScootersVehicleType a;

    public final boolean equals(Object obj) {
        if (obj instanceof pyn0) {
            return this.a == ((pyn0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ScootersMobilityHubRouteStopDialogPayload(scootersVehicleType=" + this.a + Extension.C_BRAKE;
    }
}
