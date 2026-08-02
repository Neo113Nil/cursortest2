package com.yandex.go.taxi.order.details.v1.elements.buttons;

import com.yandex.go.taxi.order.experiments.orderdetails.OrderDetailsDriverExperiment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.g92;
import defpackage.gs70;
import defpackage.jqr;
import defpackage.q4j;
import defpackage.q8j;
import defpackage.tpr;
import defpackage.u4j;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class j implements q8j {
    public final o a;
    public final q4j b;

    public j(o oVar, q4j q4jVar) {
        this.a = oVar;
        this.b = q4jVar;
    }

    @Override // defpackage.q8j
    public final Object a(TaxiOrder taxiOrder, Continuation continuation) {
        tpr g92Var;
        if (taxiOrder.J()) {
            return zy11.a;
        }
        OrderDetailsDriverExperiment a = gs70.a(taxiOrder);
        if (a.b) {
            o oVar = this.a;
            n nVar = new n(new l(new jqr(((com.yandex.go.taxi.order.superapp.orders.h) oVar.a).d(oVar.i, OrderScreen.ORDER_DETAILS), new DetailsCardTopButtonsStateMapper$map$1(oVar, null), 3), oVar, taxiOrder, a), a, taxiOrder);
            oVar.h.getClass();
            g92Var = kotlinx.coroutines.flow.e.F(nVar, uyj.a);
        } else {
            g92Var = new g92(2, u4j.a);
        }
        return kotlinx.coroutines.flow.e.k(g92Var, new DetailsCardTopButtonsInteractor$onOrderUpdated$2(this, null), continuation);
    }
}
