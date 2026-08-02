package xsna;

import com.vk.api.generated.orders.dto.OrdersSubscriptionDto;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: PingableOrder.kt */
/* loaded from: classes6.dex */
public final class bzm0 implements hu80 {
    public final OrdersSubscriptionDto a;
    public final int b;
    public final boolean c;

    public bzm0(OrdersSubscriptionDto ordersSubscriptionDto) {
        this.a = ordersSubscriptionDto;
        this.b = ordersSubscriptionDto.getId();
        this.c = epx.f(ordersSubscriptionDto.u(), SignalingProtocol.KEY_ACTIVE);
    }

    @Override // xsna.hu80
    public final int a() {
        return this.b;
    }

    @Override // xsna.hu80
    public final boolean isReady() {
        return this.c;
    }
}
