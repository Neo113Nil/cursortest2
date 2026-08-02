package defpackage;

import com.yandex.go.masstransit.sdk.order.impl.orders.network.OrdersStatus;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class dd80 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = OrdersStatus.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
