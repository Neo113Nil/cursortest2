package xsna;

import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;

/* compiled from: PrimaryBlockServicesTileContentImpl.kt */
/* loaded from: classes17.dex */
public final class b9d0 implements izs<MarketProductTileConfig.f, s3q0> {
    public final /* synthetic */ f9d0 b;
    public final /* synthetic */ ua10 c;
    public final /* synthetic */ int d;

    public b9d0(f9d0 f9d0Var, ua10 ua10Var, int i) {
        this.b = f9d0Var;
        this.c = ua10Var;
        this.d = i;
    }

    @Override // xsna.izs
    public final s3q0 invoke(MarketProductTileConfig.f fVar) {
        String str = fVar.a;
        wzs wzsVar = (wzs) ((zak0) this.b.g).getValue();
        if (wzsVar != null) {
            wzsVar.invoke(new MarketProductTileConfig.f(this.c.a.a), Integer.valueOf(this.d));
        }
        return s3q0.a;
    }
}
