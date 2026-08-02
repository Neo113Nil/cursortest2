package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.order.feedback.FeedbackStrategy;
import ru.yandex.taxi.order.feedback.a;

/* loaded from: classes8.dex */
public final class hvq implements j580 {
    public final a a;
    public final nwf0 b;
    public final n0 c;

    public hvq(zuj0 zuj0Var) {
        this.a = new a(zuj0Var);
        nwf0 b = pwf0.b(FeedbackStrategy.class);
        this.b = b;
        this.c = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        b.a(tt1.a);
    }

    @Override // defpackage.j580
    public final void a(TaxiOrder taxiOrder, boolean z) {
        b(taxiOrder.V());
    }

    public final void b(OrderStatusInfo orderStatusInfo) {
        FeedbackStrategy feedbackStrategy = orderStatusInfo.A.b.isEmpty() ? this.a : tt1.a;
        nwf0 nwf0Var = this.b;
        if (((FeedbackStrategy) nwf0Var.b).getRatingType() != feedbackStrategy.getRatingType()) {
            nwf0Var.a(feedbackStrategy);
            this.c.g(feedbackStrategy.getRatingType());
        }
    }
}
