package defpackage;

import com.yandex.go.taxi.order.details.common.TaxiCardAppearanceMode;
import com.yandex.go.taxi.order.details.v2.core.availability.RideCardAvailability$Fallback$Reason;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class bck0 implements cck0 {
    public final RideCardAvailability$Fallback$Reason a;
    public final TaxiCardAppearanceMode b = TaxiCardAppearanceMode.LEGACY;

    public bck0(RideCardAvailability$Fallback$Reason rideCardAvailability$Fallback$Reason) {
        this.a = rideCardAvailability$Fallback$Reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bck0) && this.a == ((bck0) obj).a;
    }

    @Override // defpackage.cck0
    public final TaxiCardAppearanceMode getMode() {
        return this.b;
    }

    public final int hashCode() {
        RideCardAvailability$Fallback$Reason rideCardAvailability$Fallback$Reason = this.a;
        if (rideCardAvailability$Fallback$Reason == null) {
            return 0;
        }
        return rideCardAvailability$Fallback$Reason.hashCode();
    }

    public final String toString() {
        return "Fallback(reason=" + this.a + Extension.C_BRAKE;
    }
}
