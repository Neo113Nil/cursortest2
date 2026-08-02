package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MusicSectionBlockActionCatalogTransformer.kt */
/* loaded from: classes16.dex */
public final class k550 implements r1i0 {
    @Override // xsna.r1i0
    public final gzs c(CatalogBlock catalogBlock, List list, ArrayList arrayList, bi20 bi20Var) {
        CatalogViewType catalogViewType = catalogBlock.i.b;
        CatalogDataType catalogDataType = catalogBlock.c;
        if (catalogDataType == CatalogDataType.DATA_TYPE_CATALOG_BANNERS && catalogViewType == CatalogViewType.SNIPPETS_BANNER && !list.isEmpty()) {
            return new com.vk.newsfeed.common.recycler.holders.attachments.a(20, arrayList, list);
        }
        if (catalogDataType == CatalogDataType.DATA_TYPE_AUDIO_STREAM_MIXES && catalogViewType == CatalogViewType.AUDIO_STREAM_MIX && !list.isEmpty()) {
            return new com.vk.newsfeed.common.recycler.holders.attachments.a(20, arrayList, list);
        }
        if (catalogDataType == CatalogDataType.DATA_TYPE_LINKS && catalogViewType == CatalogViewType.PLAYLIST_SMALL && !list.isEmpty()) {
            return new j550(arrayList);
        }
        return null;
    }
}
