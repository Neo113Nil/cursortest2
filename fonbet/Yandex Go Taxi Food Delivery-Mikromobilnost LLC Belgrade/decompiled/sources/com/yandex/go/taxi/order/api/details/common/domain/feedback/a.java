package com.yandex.go.taxi.order.api.details.common.domain.feedback;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.o2y0;
import defpackage.tje;
import defpackage.tse;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class a {
    public final tse a;
    public final com.yandex.go.taxi.order.details.v2.domain.feedback.sending.a b;

    public a(tse tseVar, com.yandex.go.taxi.order.details.v2.domain.feedback.sending.a aVar) {
        this.a = tseVar;
        this.b = aVar;
    }

    public final void a(o2y0 o2y0Var, String str) {
        Object value;
        TaxiOrder taxiOrder;
        r0 r0Var = o2y0Var.a;
        do {
            value = r0Var.getValue();
            taxiOrder = (TaxiOrder) value;
            taxiOrder.getClass();
            synchronized (taxiOrder) {
                taxiOrder.l = taxiOrder.l.H(str);
            }
        } while (!r0Var.k(value, taxiOrder));
        o2y0Var.f();
        if (o2y0Var.b().h.b == DriveState.COMPLETE) {
            return;
        }
        tje.N(this.a, null, null, new FeedbackCommentBridgeInteractor$updateComment$2(this, o2y0Var, null), 3);
    }
}
