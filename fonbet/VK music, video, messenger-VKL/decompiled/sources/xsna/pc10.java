package xsna;

import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MarketProductTileComposeContent.kt */
/* loaded from: classes18.dex */
public final class pc10 implements izs<MarketProductTileConfig.f, s3q0> {
    public final /* synthetic */ wh50<wow<jtk0>> b;

    public pc10(wh50<wow<jtk0>> wh50Var) {
        this.b = wh50Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(MarketProductTileConfig.f fVar) {
        MarketProductTileConfig marketProductTileConfig;
        MarketProductTileConfig.b bVar;
        String str = fVar.a;
        wh50<wow<jtk0>> wh50Var = this.b;
        List<jtk0> list = wh50Var.getValue().b;
        ArrayList arrayList = new ArrayList(c5g.u(new wow(list), 10));
        for (jtk0 jtk0Var : list) {
            if (epx.f(jtk0Var.b.a, str) && (bVar = (marketProductTileConfig = jtk0Var.b).p) != null) {
                jtk0Var = new jtk0(jtk0Var.a, MarketProductTileConfig.a(marketProductTileConfig, null, null, null, null, false, null, null, false, null, null, null, null, null, null, MarketProductTileConfig.b.a(bVar, null, null, 3), 98303));
            }
            arrayList.add(jtk0Var);
        }
        wh50Var.setValue(new wow<>(arrayList));
        return s3q0.a;
    }
}
