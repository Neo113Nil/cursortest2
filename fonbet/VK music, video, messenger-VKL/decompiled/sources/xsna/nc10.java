package xsna;

import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MarketProductTileComposeContent.kt */
/* loaded from: classes18.dex */
public final class nc10 implements izs<MarketProductTileConfig.f, s3q0> {
    public final /* synthetic */ wh50<wow<jtk0>> b;

    public nc10(wh50<wow<jtk0>> wh50Var) {
        this.b = wh50Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(MarketProductTileConfig.f fVar) {
        jtk0 jtk0Var;
        String str = fVar.a;
        wh50<wow<jtk0>> wh50Var = this.b;
        List<jtk0> list = wh50Var.getValue().b;
        ArrayList arrayList = new ArrayList(c5g.u(new wow(list), 10));
        for (jtk0 jtk0Var2 : list) {
            MarketProductTileConfig marketProductTileConfig = jtk0Var2.b;
            jqi jqiVar = jtk0Var2.a;
            if (epx.f(marketProductTileConfig.a, str)) {
                MarketProductTileConfig marketProductTileConfig2 = jtk0Var2.b;
                if (marketProductTileConfig2.h) {
                    jtk0Var = new jtk0(jqiVar, MarketProductTileConfig.a(marketProductTileConfig2, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, 130943));
                } else {
                    if (marketProductTileConfig2.l instanceof MarketProductTileConfig.i.c) {
                        jtk0Var = new jtk0(jqiVar, MarketProductTileConfig.a(marketProductTileConfig2, null, null, null, null, false, null, null, false, null, null, new MarketProductTileConfig.i.c(!((MarketProductTileConfig.i.c) r6).a), null, null, null, null, 129023));
                    }
                }
                jtk0Var2 = jtk0Var;
            }
            arrayList.add(jtk0Var2);
        }
        wh50Var.setValue(new wow<>(arrayList));
        return s3q0.a;
    }
}
