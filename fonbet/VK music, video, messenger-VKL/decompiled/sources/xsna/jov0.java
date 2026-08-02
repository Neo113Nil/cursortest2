package xsna;

import com.vk.api.generated.orders.dto.OrdersSubscriptionDto;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VkSubscriptionViewDelegate.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class jov0 extends FunctionReferenceImpl implements izs<OrdersSubscriptionDto, bzm0> {
    public static final jov0 b = new jov0(1, bzm0.class, "<init>", "<init>(Lcom/vk/api/generated/orders/dto/OrdersSubscriptionDto;)V", 0);

    @Override // xsna.izs
    public final bzm0 invoke(OrdersSubscriptionDto ordersSubscriptionDto) {
        return new bzm0(ordersSubscriptionDto);
    }
}
