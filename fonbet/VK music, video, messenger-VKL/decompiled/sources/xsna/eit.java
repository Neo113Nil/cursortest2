package xsna;

import com.vk.api.generated.orders.dto.OrdersOrderDto;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class eit implements izs {
    public final /* synthetic */ int b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        OrdersOrderDto.StatusDto d;
        Iterator it = ((List) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (epx.f(((OrdersOrderDto) obj2).getId(), String.valueOf(this.b))) {
                break;
            }
        }
        OrdersOrderDto ordersOrderDto = (OrdersOrderDto) obj2;
        return (ordersOrderDto == null || (d = ordersOrderDto.d()) == null) ? OrdersOrderDto.StatusDto.CANCELLED : d;
    }
}
