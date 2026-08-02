package defpackage;

import com.yandex.go.superapp.order.multi.old.view.OrderViewContainer;
import com.yandex.go.taxi.order.state.OrderStateView;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes14.dex */
public final /* synthetic */ class la80 implements OrderStateView.a, jms {
    public final /* synthetic */ OrderViewContainer a;

    public la80(OrderViewContainer orderViewContainer) {
        this.a = orderViewContainer;
    }

    @Override // com.yandex.go.taxi.order.state.OrderStateView.a
    public final void canBeExpandedFromAnchoredChanged() {
        this.a.updateCanBeExpandedFromAnchoredState();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof OrderStateView.a) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.a, OrderViewContainer.class, "updateCanBeExpandedFromAnchoredState", "updateCanBeExpandedFromAnchoredState()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
