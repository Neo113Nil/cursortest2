package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh;

/* compiled from: VideoProfileCatalogConfiguration.kt */
/* loaded from: classes6.dex */
public final class a7t0 implements PaginatedGridListVh.d {

    /* compiled from: VideoProfileCatalogConfiguration.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogDataType.values().length];
            try {
                iArr[CatalogDataType.DATA_TYPE_VIDEO_VIDEOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogViewType.values().length];
            try {
                iArr2[CatalogViewType.STACKED_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[CatalogViewType.DOUBLE_STACKED_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CatalogViewType.SHORT_VIDEO_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh.d
    public final int a(UIBlock uIBlock, int i, boolean z) {
        CatalogViewType catalogViewType = uIBlock.d;
        CatalogDataType catalogDataType = uIBlock.e;
        int i2 = a.$EnumSwitchMapping$1[catalogViewType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return i2 != 3 ? 60 : 20;
            }
            return 30;
        }
        if (a.$EnumSwitchMapping$0[catalogDataType.ordinal()] == 1) {
            return z ? 20 : 30;
        }
        return 60;
    }
}
