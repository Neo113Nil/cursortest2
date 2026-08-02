package xsna;

import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.OrderListAction;
import xsna.an50;

/* compiled from: OrderListStore.kt */
/* loaded from: classes18.dex */
public final class hw80 implements ew80, mm50<dw80, OrderListAction, com.vk.ecomm.orders.impl.orderlist.presentation.mvi.c> {
    public final /* synthetic */ mm50<dw80, OrderListAction, com.vk.ecomm.orders.impl.orderlist.presentation.mvi.c> b;

    public hw80(final dw80 dw80Var, kw00 kw00Var) {
        this.b = new ql50((aqw) null, 7).a(an50.a.a(new j18() { // from class: xsna.fw80
            @Override // xsna.gzs
            public final Object invoke() {
                return new com.vk.ecomm.orders.impl.orderlist.presentation.mvi.b(dw80.this);
            }
        }, new kh5(kw00Var, 1), iw80.b, new gw80()));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super dw80, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super com.vk.ecomm.orders.impl.orderlist.presentation.mvi.c, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(OrderListAction orderListAction) {
        this.b.b(orderListAction);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.mm50
    public final dw80 getCurrentState() {
        return this.b.getCurrentState();
    }
}
