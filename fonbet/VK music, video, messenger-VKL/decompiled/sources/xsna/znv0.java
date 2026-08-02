package xsna;

import com.vk.api.generated.goodsOrders.dto.GoodsOrdersGoodItemDto;
import com.vk.core.apps.BuildInfo;
import xsna.eav0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class znv0 implements izs {
    public final /* synthetic */ mov0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ vu80 d;

    public /* synthetic */ znv0(mov0 mov0Var, long j, vu80 vu80Var) {
        this.b = mov0Var;
        this.c = j;
        this.d = vu80Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        final GoodsOrdersGoodItemDto goodsOrdersGoodItemDto = (GoodsOrdersGoodItemDto) obj;
        final mov0 mov0Var = this.b;
        final long j = this.c;
        final vu80 vu80Var = this.d;
        i0q0.f(new gzs() { // from class: xsna.cov0
            @Override // xsna.gzs
            public final Object invoke() {
                String str = vu80Var.b;
                BuildInfo.Client client = BuildInfo.a;
                BuildInfo.Client client2 = BuildInfo.Client.VK_DATING;
                mov0 mov0Var2 = mov0.this;
                long j2 = j;
                if (client == client2) {
                    mov0Var2.j(j2, str);
                } else {
                    eav0 eav0Var = new eav0(((ggu0) mov0Var2.f.c).b, new pov0(mov0Var2, j2, str));
                    GoodsOrdersGoodItemDto goodsOrdersGoodItemDto2 = goodsOrdersGoodItemDto;
                    eav0Var.a(new eav0.c(goodsOrdersGoodItemDto2.getTitle(), goodsOrdersGoodItemDto2.getDescription(), goodsOrdersGoodItemDto2.d(), null));
                }
                return s3q0.a;
            }
        });
        return s3q0.a;
    }
}
