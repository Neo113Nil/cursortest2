package defpackage;

import com.yandex.go.superapp.discovery.map.impl.domain.entities.main.SuperAppOpenServiceActionType;
import java.util.Locale;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes14.dex */
public final class f5w0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        if (r2.equals("") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        if (r2.equals("places") == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SuperAppOpenServiceActionType a(String str) {
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : null;
        if (lowerCase != null) {
            switch (lowerCase.hashCode()) {
                case -985774004:
                    break;
                case -487820126:
                    if (lowerCase.equals("scooters")) {
                        return SuperAppOpenServiceActionType.SCOOTERS;
                    }
                    return null;
                case 0:
                    break;
                case 3552798:
                    if (lowerCase.equals(TariffOrderFlow.ORDER_FLOW_TAXI_KEY)) {
                        return SuperAppOpenServiceActionType.TAXI;
                    }
                    return null;
                case 586052842:
                    if (lowerCase.equals("favourites")) {
                        return SuperAppOpenServiceActionType.FAVORITES;
                    }
                    return null;
                case 1052964649:
                    if (lowerCase.equals("transport")) {
                        return SuperAppOpenServiceActionType.TRANSPORT;
                    }
                    return null;
                case 1436111861:
                    if (lowerCase.equals("chargers")) {
                        return SuperAppOpenServiceActionType.CHARGERS;
                    }
                    return null;
                default:
                    return null;
            }
        }
        return SuperAppOpenServiceActionType.PLACES;
    }
}
