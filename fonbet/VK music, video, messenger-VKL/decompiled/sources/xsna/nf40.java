package xsna;

import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import java.util.function.UnaryOperator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class nf40 implements UnaryOperator {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        CatalogBlock catalogBlock = (CatalogBlock) obj;
        CatalogLayout catalogLayout = catalogBlock.i;
        return catalogLayout.b == CatalogViewType.BUTTONS_HORIZONTAL ? CatalogBlock.zb(catalogBlock, null, new CatalogLayout(CatalogViewType.DOUBLE_STACKED_SLIDER, catalogLayout.c, catalogLayout.d, catalogLayout.e, catalogLayout.f, catalogLayout.g, catalogLayout.h, catalogLayout.i, null, 256, null), null, 2097023) : catalogBlock;
    }
}
