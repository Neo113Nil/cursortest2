package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh;

/* compiled from: ClipSearchRootVh.kt */
/* loaded from: classes16.dex */
public final class ybd implements PaginatedGridListVh.d {
    @Override // com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh.d
    public final int a(UIBlock uIBlock, int i, boolean z) {
        return uIBlock instanceof UIBlockVideo ? 1 : 2;
    }
}
