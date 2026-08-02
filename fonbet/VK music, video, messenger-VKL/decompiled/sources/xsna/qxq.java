package xsna;

import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.SearchFeedCatalogViewStyle;
import com.vk.catalog2.feature.news.holders.FeedVh;
import kotlin.LazyThreadSafetyMode;

/* compiled from: FeedCatalogViewHolderFactory.kt */
/* loaded from: classes16.dex */
public final class qxq {
    public final y1c0 a = new y1c0(null, msy.a(LazyThreadSafetyMode.NONE, new fc(13)), new pxq(), 1);

    /* compiled from: FeedCatalogViewHolderFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final FeedVh a(CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, dha dhaVar) {
        SearchFeedCatalogViewStyle searchFeedCatalogViewStyle = catalogViewStyle instanceof SearchFeedCatalogViewStyle ? (SearchFeedCatalogViewStyle) catalogViewStyle : null;
        if (searchFeedCatalogViewStyle != null) {
            int i = searchFeedCatalogViewStyle.b;
            if (a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 1) {
                return new FeedVh(i, this.a, dhaVar);
            }
        }
        return null;
    }
}
