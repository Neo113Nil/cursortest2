package defpackage;

import com.yandex.go.taxi.order.details.v2.analytics.evgen.RideCardAnalytics$fallback;
import com.yandex.go.taxi.order.details.v2.analytics.evgen.RideCardAnalytics$screen;
import com.yandex.go.taxi.order.details.v2.core.availability.RideCardAvailability$Fallback$Reason;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import java.util.HashMap;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes14.dex */
public final class eck0 {
    public final tbk0 a;

    public eck0(tbk0 tbk0Var) {
        this.a = tbk0Var;
    }

    public final void a(OrderScreen orderScreen, bck0 bck0Var) {
        RideCardAnalytics$fallback rideCardAnalytics$fallback;
        RideCardAnalytics$screen rideCardAnalytics$screen = null;
        RideCardAvailability$Fallback$Reason rideCardAvailability$Fallback$Reason = bck0Var != null ? bck0Var.a : null;
        switch (rideCardAvailability$Fallback$Reason == null ? -1 : dck0.a[rideCardAvailability$Fallback$Reason.ordinal()]) {
            case 1:
                rideCardAnalytics$fallback = RideCardAnalytics$fallback.NoStatusInfo;
                break;
            case 2:
                rideCardAnalytics$fallback = RideCardAnalytics$fallback.NoRideCardInfo;
                break;
            case 3:
                rideCardAnalytics$fallback = RideCardAnalytics$fallback.EmptyItems;
                break;
            case 4:
                rideCardAnalytics$fallback = RideCardAnalytics$fallback.EmptyPresentationDetails;
                break;
            case 5:
                rideCardAnalytics$fallback = RideCardAnalytics$fallback.EmptyPresentationCompact;
                break;
            case 6:
                rideCardAnalytics$fallback = RideCardAnalytics$fallback.CheckIn;
                break;
            case 7:
                rideCardAnalytics$fallback = RideCardAnalytics$fallback.A11y;
                break;
            default:
                rideCardAnalytics$fallback = null;
                break;
        }
        int i = orderScreen != null ? dck0.b[orderScreen.ordinal()] : -1;
        if (i == 1) {
            rideCardAnalytics$screen = RideCardAnalytics$screen.OrderList;
        } else if (i == 2) {
            rideCardAnalytics$screen = RideCardAnalytics$screen.OrderDetails;
        } else if (i == 3) {
            rideCardAnalytics$screen = RideCardAnalytics$screen.OrderDetailsCompact;
        }
        tbk0 tbk0Var = this.a;
        tbk0Var.getClass();
        HashMap hashMap = new HashMap();
        if (rideCardAnalytics$fallback != null) {
            hashMap.put(CRLReasonCodeExtension.REASON, rideCardAnalytics$fallback.getEventValue());
        }
        if (rideCardAnalytics$screen != null) {
            hashMap.put("order_screen", rideCardAnalytics$screen.getEventValue());
        }
        tbk0Var.a.a("RideCard.Fallback", hashMap, 1, new HashMap());
    }
}
