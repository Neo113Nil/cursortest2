package xsna;

import com.vk.api.generated.goodsOrders.dto.GoodsOrdersOrderItemDto;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class wom implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ wom(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
                vjm vjmVar = bVar.e;
                return com.vk.im.engine.models.dialogs.b.a(bVar, null, vjmVar != null ? vjm.e(vjmVar, 0, this.c, 1) : null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -9, 2097151);
            case 1:
                cvk.u(this.c, false);
                return s3q0.a;
            case 2:
                return Integer.valueOf((((Integer) obj).intValue() / 2) - this.c);
            default:
                return new boa0((GoodsOrdersOrderItemDto) obj, this.c);
        }
    }
}
