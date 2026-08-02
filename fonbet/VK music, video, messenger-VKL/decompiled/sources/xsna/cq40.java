package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.feature.music.offline.content.OfflineCatalogCategories;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: MusicOfflineContentCategoriesBlocksFactoryImpl.kt */
/* loaded from: classes16.dex */
public final class cq40 implements ot70 {
    @Override // xsna.ot70
    public final ArrayList a(mt70 mt70Var) {
        ArrayList arrayList = new ArrayList();
        Map<CatalogDataType, List<String>> map = mt70Var.b;
        CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_LINKS;
        List<String> list = map.get(catalogDataType);
        CatalogLayout catalogLayout = new CatalogLayout(CatalogViewType.CATEGORIES_GRID, null, null, null, null, false, null, null, null, 510, null);
        ArrayList o = e43.o(OfflineCatalogCategories.AutoDownload.o(), OfflineCatalogCategories.Playlists.o(), OfflineCatalogCategories.Albums.o(), OfflineCatalogCategories.Podcasts.o(), OfflineCatalogCategories.Audiobooks.o());
        if (list != null) {
            o.addAll(list);
        }
        s3q0 s3q0Var = s3q0.a;
        arrayList.add(new CatalogBlock("synthetic_offline_categories", catalogDataType, null, null, null, null, null, catalogLayout, null, null, null, new CatalogBlockItemsData(catalogDataType, o, null, null, null, null, null, null, null, null, null, null, 4092, null), null, null, null, null, null, null, null, null, null, 2094972, null));
        return arrayList;
    }
}
