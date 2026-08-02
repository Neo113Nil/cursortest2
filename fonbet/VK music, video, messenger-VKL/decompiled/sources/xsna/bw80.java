package xsna;

import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.OrdersListItem;
import xsna.q630;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class bw80 implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wow b;
    public final /* synthetic */ izs c;

    public bw80(wow wowVar, izs izsVar) {
        this.b = wowVar;
        this.c = izsVar;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i;
        ksy ksyVar2 = ksyVar;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= aVar2.o(intValue) ? 32 : 16;
        }
        if (aVar2.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            OrdersListItem ordersListItem = (OrdersListItem) this.b.b.get(intValue);
            aVar2.K(1455652563);
            if (ordersListItem instanceof OrdersListItem.Order) {
                aVar2.K(1455702224);
                OrdersListItem.Order order = (OrdersListItem.Order) ordersListItem;
                cw80.b(order, intValue, this.c, ahn.E(q630.a.a, "order_item_" + order.b), aVar2, i & 112);
                aVar2.j();
            } else if (ordersListItem instanceof OrdersListItem.b) {
                aVar2.K(1456104232);
                kv80.b(null, aVar2, 0);
                aVar2.j();
            } else {
                if (!(ordersListItem instanceof OrdersListItem.a)) {
                    throw alb0.c(1986619184, aVar2);
                }
                aVar2.K(1456233409);
                kv80.a(0, aVar2, this.c, null);
                aVar2.j();
            }
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
