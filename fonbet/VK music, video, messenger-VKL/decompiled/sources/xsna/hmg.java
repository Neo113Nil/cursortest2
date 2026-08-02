package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CommonSectionBlockActionCatalogTransformer.kt */
/* loaded from: classes16.dex */
public final class hmg implements r1i0 {
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0071, code lost:
    
        if ((r1 != null ? r1.H : null) == com.vk.catalog2.common.dto.api.banner.CatalogBannerImageMode.SQUARE_BIG) goto L39;
     */
    @Override // xsna.r1i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gzs c(CatalogBlock catalogBlock, List list, ArrayList arrayList, bi20 bi20Var) {
        CatalogDataType catalogDataType = catalogBlock.c;
        CatalogLayout catalogLayout = catalogBlock.i;
        CatalogViewType catalogViewType = catalogLayout.b;
        if (catalogViewType.j() && !list.isEmpty()) {
            return new lza(arrayList, bi20Var, list, 2);
        }
        if (catalogViewType.n()) {
            return new com.vk.movika.sdk.base.flow.binding.g(7, arrayList, list);
        }
        if (catalogViewType == CatalogViewType.FEATURED_LIST && catalogDataType == CatalogDataType.DATA_TYPE_LINKS && !list.isEmpty()) {
            return new l49(arrayList, bi20Var, list, 1);
        }
        CatalogViewType catalogViewType2 = catalogLayout.b;
        List list2 = list;
        if (!list2.isEmpty()) {
            CatalogViewType catalogViewType3 = CatalogViewType.BANNER;
            if ((catalogViewType2 != catalogViewType3 || catalogDataType != CatalogDataType.DATA_TYPE_LINKS) && catalogDataType != CatalogDataType.DATA_TYPE_STICKERS_BANNERS) {
                if (catalogDataType == CatalogDataType.DATA_TYPE_CATALOG_BANNERS && catalogViewType2 == catalogViewType3) {
                    Object Y = j5g.Y(list);
                    UIBlockPlaceholder uIBlockPlaceholder = Y instanceof UIBlockPlaceholder ? (UIBlockPlaceholder) Y : null;
                }
            }
            return new defpackage.a0(arrayList, bi20Var, list, 2);
        }
        if (catalogDataType != CatalogDataType.DATA_TYPE_STICKERS_INFO || list2.isEmpty()) {
            return (catalogDataType == CatalogDataType.DATA_TYPE_GROUPS_ITEMS && catalogLayout.b == CatalogViewType.MAP_PREVIEW) ? new ge0(arrayList, this, list) : new com.vk.movika.sdk.base.flow.binding.g(7, arrayList, list);
        }
        return new defpackage.c0(arrayList, bi20Var, list, 1);
    }
}
