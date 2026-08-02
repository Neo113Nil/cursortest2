package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.catalog2.common.dto.api.market.CatalogMarketCategory;
import com.vk.catalog2.common.dto.api.market.CatalogNavigationTab;
import com.vk.catalog2.common.dto.ui.market.UIBlockNavigationTab;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import java.util.Iterator;
import kotlin.collections.builders.ListBuilder;

/* compiled from: ClassifiedsNavigationTabDelegates.kt */
/* loaded from: classes16.dex */
public final class ahc implements kz50, fkd {
    public final Object a;
    public final Object b;
    public final Object c;

    public /* synthetic */ ahc(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // xsna.kz50
    public void a(UIBlockNavigationTab uIBlockNavigationTab) {
        CatalogMarketCategory catalogMarketCategory;
        CatalogMarketCategory zb;
        MarketAnalyticsParams marketAnalyticsParams = (MarketAnalyticsParams) this.c;
        CatalogNavigationTab catalogNavigationTab = uIBlockNavigationTab.y;
        Integer num = catalogNavigationTab.i;
        Integer num2 = catalogNavigationTab.j;
        if (num == null || (catalogMarketCategory = uIBlockNavigationTab.z.get(num)) == null) {
            return;
        }
        if (num2 != null && (zb = catalogMarketCategory.zb(num2.intValue())) != null) {
            catalogMarketCategory = zb;
        }
        MarketBridgeCategory a = bhc.a(catalogMarketCategory);
        String str = catalogMarketCategory.c;
        if (str.length() == 0) {
            str = catalogNavigationTab.c;
        }
        i3a.a(marketAnalyticsParams, num2);
        ((com.vk.ecomm.categories.api.a) this.b).a((Context) this.a, str, a, marketAnalyticsParams);
    }

    @Override // xsna.fkd
    public void b(Activity activity, int i) {
        Object obj;
        Iterator<E> it = ((ListBuilder) this.a).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((g0i) obj).a == i) {
                    break;
                }
            }
        }
        g0i g0iVar = (g0i) obj;
        if (g0iVar != null) {
            g0iVar.b(activity, (j0i) this.b, (com.vk.profile.core.scheduled_clips.a) this.c);
        }
    }
}
