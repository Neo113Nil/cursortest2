package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import com.vk.ecomm.categories.impl.presentation.CategoriesFragment;

/* compiled from: MarketCategoriesRouterImpl.kt */
/* loaded from: classes18.dex */
public final class tv00 implements com.vk.ecomm.categories.api.a {
    @Override // com.vk.ecomm.categories.api.a
    public final void a(Context context, String str, MarketBridgeCategory marketBridgeCategory, MarketAnalyticsParams marketAnalyticsParams) {
        CategoriesFragment.a aVar = new CategoriesFragment.a(CategoriesFragment.class, null, null);
        Bundle bundle = aVar.j;
        bundle.putString("title", str);
        bundle.putParcelable("categories_tree", marketBridgeCategory);
        if (marketAnalyticsParams != null) {
            bundle.putParcelable("tracking_data", marketAnalyticsParams);
        }
        aVar.k(context);
    }
}
