package defpackage;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.taxi.order.api.change.destination.RouteChangeType;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.order.OrderFragment;
import ru.yandex.taxi.order.f;

/* loaded from: classes14.dex */
public final /* synthetic */ class m2y0 implements jms {
    public final /* synthetic */ x980 a;

    public m2y0(x980 x980Var) {
        this.a = x980Var;
    }

    public final void a(o2y0 o2y0Var, List list, int i, RouteChangeType routeChangeType, Consumer consumer) {
        f fVar = (f) this.a;
        OrderFragment orderFragment = fVar.p1;
        if (orderFragment == null || !fVar.getLifecycle().w.a(Lifecycle.State.STARTED)) {
            return;
        }
        orderFragment.showDestinationPicker(o2y0Var, list, i, routeChangeType, consumer);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m2y0) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(5, this.a, x980.class, "showAddressPicker", "showAddressPicker(Lcom/yandex/go/taxi/order/models/api/TaxiOrderHolder;Ljava/util/List;ILcom/yandex/go/taxi/order/api/change/destination/RouteChangeType;Ljava/util/function/Consumer;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
