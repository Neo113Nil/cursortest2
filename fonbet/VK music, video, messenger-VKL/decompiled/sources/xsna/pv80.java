package xsna;

import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.OrderListAction;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.OrdersListItem;

/* compiled from: OrderListProductsPreview.kt */
/* loaded from: classes18.dex */
public final class pv80 implements gzs<s3q0> {
    public final /* synthetic */ izs<OrderListAction, s3q0> b;
    public final /* synthetic */ OrdersListItem.Order.a c;

    /* JADX WARN: Multi-variable type inference failed */
    public pv80(izs<? super OrderListAction, s3q0> izsVar, OrdersListItem.Order.a aVar) {
        this.b = izsVar;
        this.c = aVar;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        OrdersListItem.Order.a aVar = this.c;
        this.b.invoke(new OrderListAction.f(aVar.a, aVar.b));
        return s3q0.a;
    }
}
