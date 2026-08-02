package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockSticker;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPack;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPackPreview;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPreview;
import com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh;

/* compiled from: StickerCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class q2l0 implements PaginatedGridListVh.d {
    @Override // com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh.d
    public final int a(UIBlock uIBlock, int i, boolean z) {
        if ((uIBlock instanceof UIBlockStickerPack) || (uIBlock instanceof UIBlockSticker) || (uIBlock instanceof UIBlockStickerPackPreview) || (uIBlock instanceof UIBlockStickerPreview)) {
            return 1;
        }
        return i;
    }
}
