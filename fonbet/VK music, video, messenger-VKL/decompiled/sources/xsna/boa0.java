package xsna;

import com.vk.api.generated.goodsOrders.dto.GoodsOrdersOrderItemDto;

/* compiled from: PingableOrder.kt */
/* loaded from: classes6.dex */
public final class boa0 implements hu80 {
    public final GoodsOrdersOrderItemDto a;
    public final int b;
    public final boolean c;

    public boa0(GoodsOrdersOrderItemDto goodsOrdersOrderItemDto, int i) {
        Integer e;
        this.a = goodsOrdersOrderItemDto;
        this.b = i;
        Integer d = goodsOrdersOrderItemDto.d();
        boolean z = false;
        int intValue = d != null ? d.intValue() : 0;
        if ((1 <= intValue && intValue < 4) || ((e = goodsOrdersOrderItemDto.e()) != null && e.intValue() == 0)) {
            z = true;
        }
        this.c = z;
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
