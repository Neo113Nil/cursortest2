package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes10.dex */
public final class ijx0 {
    public static TariffOrderFlow a(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1354719203:
                if (str.equals(TariffOrderFlow.ORDER_FLOW_COPTER_KEY)) {
                    return TariffOrderFlow.COPTER_FLOW;
                }
                return null;
            case -768438518:
                if (str.equals(TariffOrderFlow.ORDER_FLOW_COPTER_CITY_TOUR_KEY)) {
                    return TariffOrderFlow.COPTER_CITY_TOUR_FLOW;
                }
                return null;
            case 3552798:
                if (str.equals(TariffOrderFlow.ORDER_FLOW_TAXI_KEY)) {
                    return TariffOrderFlow.TAXI_FLOW;
                }
                return null;
            case 95852938:
                if (str.equals(TariffOrderFlow.ORDER_FLOW_DRIVE_KEY)) {
                    return TariffOrderFlow.DRIVE_FLOW;
                }
                return null;
            case 823466996:
                if (str.equals(TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY)) {
                    return TariffOrderFlow.DELIVERY_FLOW;
                }
                return null;
            case 2072762553:
                if (str.equals(TariffOrderFlow.ORDER_FLOW_SHUTTLE_KEY)) {
                    return TariffOrderFlow.SHUTTLE_FLOW;
                }
                return null;
            default:
                return null;
        }
    }

    public static String b(TariffOrderFlow tariffOrderFlow) {
        int i = tariffOrderFlow == null ? -1 : hjx0.a[tariffOrderFlow.ordinal()];
        if (i == 1) {
            return TariffOrderFlow.ORDER_FLOW_DRIVE_KEY;
        }
        if (i == 2) {
            return TariffOrderFlow.ORDER_FLOW_TAXI_KEY;
        }
        if (i == 3) {
            return TariffOrderFlow.ORDER_FLOW_SHUTTLE_KEY;
        }
        if (i != 4) {
            return null;
        }
        return TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY;
    }

    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TariffOrderFlow.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
