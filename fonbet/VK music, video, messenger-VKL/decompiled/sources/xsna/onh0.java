package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItem;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;

/* compiled from: SearchCatalogAnalyticsDataExtractor.kt */
/* loaded from: classes16.dex */
public final class onh0 extends s1v {
    @Override // xsna.s1v
    public final String e(UIBlock uIBlock) {
        return uIBlock instanceof UIBlockProfile ? ((UIBlockProfile) uIBlock).y.d : uIBlock instanceof UIBlockMarketItem ? ((UIBlockMarketItem) uIBlock).y.d0 : super.e(uIBlock);
    }
}
