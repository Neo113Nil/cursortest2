package xsna;

import com.vk.api.generated.orders.dto.OrdersOrderDto;

/* compiled from: PingableOrder.kt */
/* loaded from: classes6.dex */
public final class txm0 implements hu80 {
    public final OrdersOrderDto.StatusDto a;
    public final int b;
    public final boolean c;

    public txm0(OrdersOrderDto.StatusDto statusDto, int i) {
        this.a = statusDto;
        this.b = i;
        this.c = (statusDto == OrdersOrderDto.StatusDto.CREATED || statusDto == OrdersOrderDto.StatusDto.CHARGEABLE) ? false : true;
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
