package xsna;

import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh;

/* compiled from: VideoVkLiveCategoryCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class gst0 implements PaginatedGridListVh.d {
    @Override // com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh.d
    public final int a(UIBlock uIBlock, int i, boolean z) {
        if (uIBlock.d == CatalogViewType.DOUBLE_STACKED_LIST) {
            return 1;
        }
        return i;
    }
}
