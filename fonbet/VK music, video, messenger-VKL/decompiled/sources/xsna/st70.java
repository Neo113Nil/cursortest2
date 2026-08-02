package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog2.common.dto.api.CatalogButtonSwitchSection;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.feature.music.offline.content.OfflineCatalogCategories;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: OfflineCatalogSearchAllPodcastsBlocksFactoryImpl.kt */
/* loaded from: classes16.dex */
public final class st70 implements ot70 {
    @Override // xsna.ot70
    public final ArrayList a(mt70 mt70Var) {
        OfflineCatalogCategories offlineCatalogCategories = OfflineCatalogCategories.Podcasts;
        List x = rdi.x(mt70Var.c(offlineCatalogCategories));
        if (x == null) {
            return new ArrayList();
        }
        CatalogBlock catalogBlock = new CatalogBlock("synthetic_offline_podcast_header", CatalogDataType.DATA_TYPE_NONE, null, null, null, null, null, new CatalogLayout(CatalogViewType.HEADER_COMPACT, null, mt70Var.d.getString(R.string.music_catalog_offline_podcasts), null, null, false, null, null, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, null), e43.a(new CatalogButtonSwitchSection("switch_section", null, "", offlineCatalogCategories.n(), null, null, null, null, null, null, null, "chevron_right_circle_28", 1008, null)), null, null, null, null, null, null, null, null, null, null, null, null, 2096764, null);
        CatalogDataType i = offlineCatalogCategories.i();
        return e43.o(catalogBlock, new CatalogBlock("synthetic_offline_podcasts", i, null, null, null, null, null, new CatalogLayout(CatalogViewType.LARGE_SLIDER, null, null, null, null, false, null, null, null, 510, null), null, null, null, new CatalogBlockItemsData(i, new ArrayList(x), null, null, null, null, null, null, null, null, null, null, 4092, null), null, null, null, null, null, null, null, null, null, 2094972, null));
    }
}
