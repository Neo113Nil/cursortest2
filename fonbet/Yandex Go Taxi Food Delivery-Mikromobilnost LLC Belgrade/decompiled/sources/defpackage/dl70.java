package defpackage;

import com.yandex.go.taxi.order.cancel.v2.mvp.OrderCancelModalView;

/* loaded from: classes14.dex */
public final class dl70 implements vk70 {
    public final /* synthetic */ OrderCancelModalView a;

    public dl70(OrderCancelModalView orderCancelModalView) {
        this.a = orderCancelModalView;
    }

    @Override // defpackage.vk70
    public final void mc(vl70 vl70Var) {
        fl70 binding;
        OrderCancelModalView orderCancelModalView = this.a;
        binding = orderCancelModalView.getBinding();
        orderCancelModalView.renderImage(binding, vl70Var.a);
        orderCancelModalView.renderTitle(binding, vl70Var.b);
        orderCancelModalView.renderText(binding, vl70Var.c);
        orderCancelModalView.renderActions(binding, vl70Var.d);
        orderCancelModalView.renderButtons(binding, vl70Var.e);
    }
}
