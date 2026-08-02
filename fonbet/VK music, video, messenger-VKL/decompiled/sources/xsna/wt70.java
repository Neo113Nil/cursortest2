package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: OfflineDownloadsBlocksFactoryImpl.kt */
/* loaded from: classes16.dex */
public final class wt70 implements ot70 {
    public final CatalogDataType a;

    public wt70(CatalogDataType catalogDataType) {
        this.a = catalogDataType;
    }

    @Override // xsna.ot70
    public final ArrayList a(mt70 mt70Var) {
        List<String> list;
        Map<CatalogDataType, List<String>> map = mt70Var.c.get("synthetic_offline_downloads_block_id");
        if (map == null || (list = map.get(this.a)) == null) {
            list = EmptyList.b;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS;
        return e43.o(new CatalogBlock("synthetic_offline_downloads_block_id", catalogDataType, null, null, null, null, null, new CatalogLayout(CatalogViewType.SYNTHETIC_MUSIC_DOWNLOADS_LIST, null, null, null, null, false, null, null, null, 510, null), null, null, null, new CatalogBlockItemsData(catalogDataType, new ArrayList(list), null, null, null, null, null, null, null, null, null, null, 4092, null), null, null, null, null, null, null, null, null, null, 2094972, null));
    }
}
