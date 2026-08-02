package defpackage;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.taxi.order.change.route.RouteChangeWarning;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.order.OrderFragment;
import ru.yandex.taxi.order.f;

/* loaded from: classes14.dex */
public final /* synthetic */ class b2y0 implements jms {
    public final /* synthetic */ x980 a;

    public b2y0(x980 x980Var) {
        this.a = x980Var;
    }

    public final void a(o2y0 o2y0Var, RouteChangeWarning routeChangeWarning) {
        f fVar = (f) this.a;
        OrderFragment orderFragment = fVar.p1;
        if (orderFragment == null || !fVar.getLifecycle().w.a(Lifecycle.State.STARTED)) {
            return;
        }
        orderFragment.openRouteChange(o2y0Var, routeChangeWarning);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b2y0) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(2, this.a, x980.class, "openRouteChange", "openRouteChange(Lcom/yandex/go/taxi/order/models/api/TaxiOrderHolder;Lcom/yandex/go/taxi/order/change/route/RouteChangeWarning;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
