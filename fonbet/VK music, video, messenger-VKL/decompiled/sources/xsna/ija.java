package xsna;

import com.vk.ecomm.categories.api.MarketBridgeCategory;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.sja;
import xsna.z890;

/* compiled from: CategoriesBootstrapper.kt */
/* loaded from: classes18.dex */
public final class ija implements vj50<cka, on50, hn50<on50>, sja> {
    public final MarketBridgeCategory a;

    public ija(MarketBridgeCategory marketBridgeCategory) {
        this.a = marketBridgeCategory;
    }

    @Override // xsna.vj50
    public final cka a() {
        EmptyList emptyList = EmptyList.b;
        z890.a.getClass();
        return new cka(0, emptyList, z890.a.b);
    }

    @Override // xsna.vj50
    public final sja b() {
        MarketBridgeCategory marketBridgeCategory = this.a;
        if (marketBridgeCategory != null) {
            return new sja.b(marketBridgeCategory);
        }
        return null;
    }

    @Override // xsna.vj50
    public final /* bridge */ /* synthetic */ List<hn50<on50>> c(cka ckaVar) {
        return null;
    }
}
