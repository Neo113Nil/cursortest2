package xsna;

import android.content.Context;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.ecomm.design.view.tile.MarketProductTileView;
import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class zwl implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;

    public zwl(MarketProductTileConfig marketProductTileConfig) {
        this.c = marketProductTileConfig;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return null;
            default:
                MarketProductTileView marketProductTileView = new MarketProductTileView((Context) obj, null);
                marketProductTileView.P4((MarketProductTileConfig) this.c);
                return marketProductTileView;
        }
    }

    public zwl(d40 d40Var, List list) {
        this.c = list;
    }
}
