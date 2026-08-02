package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh;

/* compiled from: VideoVkLiveCategoryCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class ist0 implements PaginatedGridListVh.d {

    /* compiled from: VideoVkLiveCategoryCatalogConfiguration.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogDataType.values().length];
            try {
                iArr[CatalogDataType.DATA_TYPE_VIDEO_VIDEOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh.d
    public final int a(UIBlock uIBlock, int i, boolean z) {
        if (a.$EnumSwitchMapping$0[uIBlock.e.ordinal()] == 1) {
            return z ? 20 : 30;
        }
        return 60;
    }
}
