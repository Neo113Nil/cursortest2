package defpackage;

import com.yandex.go.taxi.order.details.v1.elements.support.experiment.SupportOnCompleteExperiment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class ckw0 {
    public static SupportOnCompleteExperiment a(TaxiOrder taxiOrder) {
        if (taxiOrder.h.b != DriveState.COMPLETE) {
            SupportOnCompleteExperiment.Companion.getClass();
            return SupportOnCompleteExperiment.f;
        }
        OrderStatusInfo V = taxiOrder.V();
        SupportOnCompleteExperiment.Companion.getClass();
        SupportOnCompleteExperiment supportOnCompleteExperiment = SupportOnCompleteExperiment.f;
        qn11 b = V.b(SupportOnCompleteExperiment.class);
        if (b == null) {
            b = supportOnCompleteExperiment;
        }
        SupportOnCompleteExperiment supportOnCompleteExperiment2 = (SupportOnCompleteExperiment) b;
        if (!supportOnCompleteExperiment2.b) {
            supportOnCompleteExperiment2 = null;
        }
        return supportOnCompleteExperiment2 == null ? supportOnCompleteExperiment : supportOnCompleteExperiment2;
    }
}
