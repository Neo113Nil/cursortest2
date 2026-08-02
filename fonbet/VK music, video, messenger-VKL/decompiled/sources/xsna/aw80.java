package xsna;

import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.OrdersListItem;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class aw80 implements izs<Integer, Object> {
    public final /* synthetic */ wow b;

    public aw80(wow wowVar) {
        this.b = wowVar;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        return qjg.a((OrdersListItem) this.b.b.get(num.intValue()));
    }
}
