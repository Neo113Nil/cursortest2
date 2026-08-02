package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import java.util.function.UnaryOperator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class p5a implements UnaryOperator {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        CatalogBlock catalogBlock = (CatalogBlock) obj;
        CatalogLayout catalogLayout = catalogBlock.i;
        return (catalogBlock.c == CatalogDataType.DATA_TYPE_CATALOG_USERS && catalogLayout.b == CatalogViewType.LIST) ? CatalogBlock.zb(catalogBlock, null, new CatalogLayout(CatalogViewType.SYNTHETIC_SEARCH_LIST, catalogLayout.c, catalogLayout.d, catalogLayout.e, catalogLayout.f, catalogLayout.g, catalogLayout.h, null, null, 384, null), null, 2097023) : catalogBlock;
    }
}
