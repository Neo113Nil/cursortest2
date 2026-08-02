package com.yandex.go.taxi.order.cancel.v2.navigation;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.taxi.order.change.route.RouteChangeWarning;
import defpackage.jp70;
import defpackage.o2y0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.order.OrderFragment;
import ru.yandex.taxi.order.f;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class OrderCancelFeatureRouterImpl$onLaunch$orderCancelNavigator$1$changeDestinationRequested$1 extends FunctionReferenceImpl implements tls {
    public static final OrderCancelFeatureRouterImpl$onLaunch$orderCancelNavigator$1$changeDestinationRequested$1 b = new OrderCancelFeatureRouterImpl$onLaunch$orderCancelNavigator$1$changeDestinationRequested$1(1, 0, jp70.class, "onChangeDestination", "onChangeDestination()V");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        jp70 jp70Var = (jp70) obj;
        f fVar = jp70Var.a;
        o2y0 o2y0Var = jp70Var.b;
        OrderFragment orderFragment = fVar.p1;
        if (orderFragment != null && fVar.getLifecycle().w.a(Lifecycle.State.STARTED)) {
            orderFragment.openRouteChange(o2y0Var, RouteChangeWarning.CHANGE_DESTINATION);
        }
        return zy11.a;
    }
}
