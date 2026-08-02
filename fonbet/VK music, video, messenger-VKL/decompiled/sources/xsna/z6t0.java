package xsna;

import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh;

/* compiled from: VideoProfileCatalogConfiguration.kt */
/* loaded from: classes6.dex */
public final class z6t0 implements PaginatedGridListVh.d {

    /* compiled from: VideoProfileCatalogConfiguration.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.DOUBLE_STACKED_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.SHORT_VIDEO_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh.d
    public final int a(UIBlock uIBlock, int i, boolean z) {
        int i2 = a.$EnumSwitchMapping$0[uIBlock.d.ordinal()];
        if (i2 == 1) {
            return 3;
        }
        if (i2 != 2) {
            return i;
        }
        return 2;
    }
}
