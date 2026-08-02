package xsna;

import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MarketProductTileComposeContent.kt */
/* loaded from: classes18.dex */
public final class oc10 implements izs<MarketProductTileConfig.f, s3q0> {
    public final /* synthetic */ wh50<wow<jtk0>> b;

    public oc10(wh50<wow<jtk0>> wh50Var) {
        this.b = wh50Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(MarketProductTileConfig.f fVar) {
        String str = fVar.a;
        wh50<wow<jtk0>> wh50Var = this.b;
        List<jtk0> list = wh50Var.getValue().b;
        ArrayList arrayList = new ArrayList(c5g.u(new wow(list), 10));
        for (jtk0 jtk0Var : list) {
            if (epx.f(jtk0Var.b.a, str)) {
                MarketProductTileConfig marketProductTileConfig = jtk0Var.b;
                if (marketProductTileConfig.l instanceof MarketProductTileConfig.i.b) {
                    jtk0Var = new jtk0(jtk0Var.a, MarketProductTileConfig.a(marketProductTileConfig, null, null, null, null, false, null, null, false, null, null, new MarketProductTileConfig.i.b(!((MarketProductTileConfig.i.b) r6).a), null, null, null, null, 129023));
                }
            }
            arrayList.add(jtk0Var);
        }
        wh50Var.setValue(new wow<>(arrayList));
        return s3q0.a;
    }
}
