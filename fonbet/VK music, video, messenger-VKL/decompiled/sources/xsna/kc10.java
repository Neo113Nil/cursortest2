package xsna;

import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: MarketProductTileComposeConfigConverter.kt */
/* loaded from: classes18.dex */
public final class kc10 {
    public static MarketProductTileConfig a(dc10 dc10Var, boolean z, wfq0 wfq0Var) {
        MarketProductTileConfig.ProductStatusType productStatusType;
        MarketProductTileConfig.ViewerType viewerType = dc10Var.d() ? MarketProductTileConfig.ViewerType.Seller : MarketProductTileConfig.ViewerType.Bayer;
        MarketProductTileConfig.e eVar = new MarketProductTileConfig.e(dc10Var.getPrice().a, dc10Var.getPrice().b, dc10Var.getPrice().c);
        if (dc10Var.b()) {
            productStatusType = MarketProductTileConfig.ProductStatusType.HardBlock;
        } else {
            Boolean g = dc10Var.g();
            Boolean bool = Boolean.TRUE;
            productStatusType = epx.f(g, bool) ? MarketProductTileConfig.ProductStatusType.Moderation : epx.f(dc10Var.f(), bool) ? MarketProductTileConfig.ProductStatusType.SoftBlock : !dc10Var.a() ? MarketProductTileConfig.ProductStatusType.OutOfStock : MarketProductTileConfig.ProductStatusType.Normal;
        }
        MarketProductTileConfig marketProductTileConfig = new MarketProductTileConfig(String.valueOf(dc10Var.getItemId()), viewerType, productStatusType, null, null, MarketProductTileConfig.h.a.a, z, eVar, dc10Var.h(), null, new MarketProductTileConfig.i.b(dc10Var.X()), null, null, null, null, 106520);
        tc10 tc10Var = new tc10(dc10Var);
        LinkedHashSet linkedHashSet = (LinkedHashSet) tc10Var.d;
        for (hom0 hom0Var : wfq0Var.a()) {
            List<Class<? extends hom0>> b = hom0Var.b();
            if (!(b instanceof Collection) || !b.isEmpty()) {
                Iterator<T> it = b.iterator();
                while (it.hasNext()) {
                    if (linkedHashSet.contains((Class) it.next())) {
                        break;
                    }
                }
            }
            MarketProductTileConfig a = hom0Var.a(tc10Var, marketProductTileConfig);
            if (!a.equals(marketProductTileConfig)) {
                linkedHashSet.add(hom0Var.getClass());
                marketProductTileConfig = a;
            }
        }
        return marketProductTileConfig;
    }
}
