package com.yandex.go.taxi.order.cancel.v2.navigation;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.jp70;
import defpackage.o2y0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.order.f;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class OrderCancelFeatureRouterImpl$onLaunch$orderCancelNavigator$1$cancelOrderRequested$1 extends FunctionReferenceImpl implements tls {
    public static final OrderCancelFeatureRouterImpl$onLaunch$orderCancelNavigator$1$cancelOrderRequested$1 b = new OrderCancelFeatureRouterImpl$onLaunch$orderCancelNavigator$1$cancelOrderRequested$1(1, 0, jp70.class, "onCancelOrder", "onCancelOrder()V");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        jp70 jp70Var = (jp70) obj;
        TaxiOrder taxiOrder = jp70Var.c;
        synchronized (taxiOrder) {
            taxiOrder.l = taxiOrder.l.B(true);
        }
        f fVar = jp70Var.a;
        o2y0 o2y0Var = jp70Var.b;
        fVar.W(o2y0Var, o2y0Var.b().h.b, null);
        return zy11.a;
    }
}
