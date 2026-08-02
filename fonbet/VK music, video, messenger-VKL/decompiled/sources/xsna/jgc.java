package xsna;

import android.os.Bundle;
import com.vk.catalog2.common.dto.api.search.CatalogGetMarketSearchRequestFactory;
import com.vk.dto.market.catalog.CatalogMarketDeliveryTypeDto;
import com.vk.search.params.api.VkMarketSearchParams;
import com.vk.search.params.api.domain.model.MarketSearchDeliveryType;

/* compiled from: ClassifiedsCatalogSearchGetSearchMarketRequestFactory.kt */
/* loaded from: classes18.dex */
public final class jgc extends lgc {
    public final VkMarketSearchParams t;
    public final CatalogGetMarketSearchRequestFactory u;

    public jgc(wba wbaVar, Bundle bundle) {
        super(wbaVar, null, bundle);
        VkMarketSearchParams vkMarketSearchParams = new VkMarketSearchParams();
        this.t = vkMarketSearchParams;
        CatalogGetMarketSearchRequestFactory catalogGetMarketSearchRequestFactory = new CatalogGetMarketSearchRequestFactory(wbaVar, CatalogGetMarketSearchRequestFactory.SearchMarketEntrypoint.SearchInService, 4);
        catalogGetMarketSearchRequestFactory.g = vkMarketSearchParams;
        this.u = catalogGetMarketSearchRequestFactory;
    }

    @Override // xsna.lgc
    public final io.reactivex.rxjava3.core.x s(Bundle bundle, String str) {
        String string = bundle.getString("key_category_ids");
        VkMarketSearchParams vkMarketSearchParams = this.t;
        vkMarketSearchParams.e = string;
        vkMarketSearchParams.f = bundle.getString("key_catalog_context");
        Long e = bo8.e(bundle, "key_filter_price_from");
        MarketSearchDeliveryType marketSearchDeliveryType = null;
        vkMarketSearchParams.g = e != null ? Integer.valueOf((int) e.longValue()) : null;
        Long e2 = bo8.e(bundle, "key_filter_price_to");
        vkMarketSearchParams.h = e2 != null ? Integer.valueOf((int) e2.longValue()) : null;
        Double c = bo8.c(bundle, "key_latitude");
        vkMarketSearchParams.i = c != null ? Float.valueOf((float) c.doubleValue()) : null;
        Double c2 = bo8.c(bundle, "key_longitude");
        vkMarketSearchParams.j = c2 != null ? Float.valueOf((float) c2.doubleValue()) : null;
        vkMarketSearchParams.k = bundle.containsKey("key_save_geo") ? Boolean.valueOf(bundle.getBoolean("key_save_geo")) : null;
        vkMarketSearchParams.m = bundle.getString("key_location_name");
        vkMarketSearchParams.l = bo8.d(bundle, "key_filter_distance");
        vkMarketSearchParams.c = bundle.getString("key_sorting_option_id");
        vkMarketSearchParams.n = bo8.b(bundle, "online_payment_enabled");
        vkMarketSearchParams.o = bo8.b(bundle, "discount_enabled");
        vkMarketSearchParams.p = bo8.b(bundle, "seller_high_rating_enabled");
        vkMarketSearchParams.q = bo8.b(bundle, "friends_reviews_enabled");
        vkMarketSearchParams.r = bo8.b(bundle, "friends_wishlist_enabled");
        String string2 = bundle.getString("delivery_type");
        if (string2 != null) {
            CatalogMarketDeliveryTypeDto.Companion.getClass();
            CatalogMarketDeliveryTypeDto a = CatalogMarketDeliveryTypeDto.a.a(string2);
            int i = a == null ? -1 : y8a.$EnumSwitchMapping$1[a.ordinal()];
            marketSearchDeliveryType = i != 1 ? i != 2 ? i != 3 ? MarketSearchDeliveryType.ANY : MarketSearchDeliveryType.PICKUP : MarketSearchDeliveryType.COURIER : MarketSearchDeliveryType.ANY;
        }
        vkMarketSearchParams.s = marketSearchDeliveryType;
        if (str == null) {
            str = "";
        }
        CatalogGetMarketSearchRequestFactory catalogGetMarketSearchRequestFactory = this.u;
        return catalogGetMarketSearchRequestFactory.h(str, vkMarketSearchParams, catalogGetMarketSearchRequestFactory.d, false).K();
    }

    @Override // xsna.lgc
    public final void r(String str) {
    }
}
