package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.tipssuggest.experiment.TipsSuggestModalExperiment;

/* loaded from: classes14.dex */
public final class ohz0 {
    public static TipsSuggestModalExperiment a(TaxiOrder taxiOrder) {
        OrderStatusInfo V = taxiOrder.V();
        TipsSuggestModalExperiment.Companion.getClass();
        TipsSuggestModalExperiment tipsSuggestModalExperiment = TipsSuggestModalExperiment.h;
        qn11 b = V.b(TipsSuggestModalExperiment.class);
        if (b == null) {
            b = tipsSuggestModalExperiment;
        }
        TipsSuggestModalExperiment tipsSuggestModalExperiment2 = (TipsSuggestModalExperiment) b;
        return tipsSuggestModalExperiment2.b ? tipsSuggestModalExperiment2 : tipsSuggestModalExperiment;
    }
}
