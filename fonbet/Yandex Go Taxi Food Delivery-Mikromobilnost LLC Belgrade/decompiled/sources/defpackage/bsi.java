package defpackage;

import com.yandex.delivery.mapper.model.Expansion;
import com.yandex.go.superapp.tracking.api.domain.models.LogisticsOrderTracking$Details$State;
import com.yandex.go.superapp.tracking.api.domain.models.LogisticsOrderTracking$Status;
import java.util.Map;
import java.util.UUID;
import ru.yandex.taxi.logistics.delivery_state.DeliveryStateBaseParams;

/* loaded from: classes9.dex */
public final class bsi {
    public static DeliveryStateBaseParams a(bjz bjzVar, LogisticsOrderTracking$Details$State logisticsOrderTracking$Details$State) {
        Expansion expansion;
        String str = bjzVar.b;
        String str2 = bjzVar.d;
        if (str == null && str2 == null) {
            return null;
        }
        diz dizVar = bjzVar.q;
        Map a = dizVar != null ? dizVar.a() : null;
        if (logisticsOrderTracking$Details$State == null) {
            logisticsOrderTracking$Details$State = bjzVar.l.a();
        }
        int i = asi.a[logisticsOrderTracking$Details$State.ordinal()];
        if (i == 1) {
            expansion = Expansion.EXPANDED;
        } else if (i == 2) {
            expansion = Expansion.ANCHORED;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            expansion = Expansion.COLLAPSED;
        }
        return new DeliveryStateBaseParams(str, a, expansion, str2 != null ? UUID.fromString(str2) : null, bjzVar.h == LogisticsOrderTracking$Status.Completed);
    }
}
