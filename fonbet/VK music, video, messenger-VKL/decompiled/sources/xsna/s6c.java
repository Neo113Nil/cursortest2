package xsna;

import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import xsna.r2c;

/* compiled from: CheckoutOrderList.kt */
/* loaded from: classes18.dex */
public final class s6c implements izs<MarketProductTileConfig.f, s3q0> {
    public final /* synthetic */ izs<r2c, s3q0> b;
    public final /* synthetic */ b7c c;

    /* JADX WARN: Multi-variable type inference failed */
    public s6c(izs<? super r2c, s3q0> izsVar, b7c b7cVar) {
        this.b = izsVar;
        this.c = b7cVar;
    }

    @Override // xsna.izs
    public final s3q0 invoke(MarketProductTileConfig.f fVar) {
        String str = fVar.a;
        b7c b7cVar = this.c;
        this.b.invoke(new r2c.s.a(b7cVar.b, b7cVar.c.a));
        return s3q0.a;
    }
}
