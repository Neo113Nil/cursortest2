package xsna;

import android.os.Bundle;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.HeaderClearBlocksVh;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vkontakte.android.R;
import xsna.u4a;

/* compiled from: GlobalSearchClipsCatalogConfiguration.kt */
/* loaded from: classes5.dex */
public final class z1u extends vbd {
    public final HeaderClearBlocksVh.a H;
    public final k140 I;

    /* compiled from: GlobalSearchClipsCatalogConfiguration.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SYNTHETIC_HEADER_CLEAR_RECENTS_COMPACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public z1u(Bundle bundle) {
        super(bundle);
        this.H = new HeaderClearBlocksVh.a(true, null);
        this.I = new k140(null);
    }

    @Override // xsna.vbd, com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final vha A(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        return this.I.d(catalogConfiguration$Companion$ContainerType, u4aVar);
    }

    @Override // xsna.vbd, com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        HeaderClearBlocksVh headerClearBlocksVh = null;
        if (a.$EnumSwitchMapping$1[catalogDataType.ordinal()] == 1 && a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 1) {
            u4a.a aVar = u4aVar.b;
            headerClearBlocksVh = new HeaderClearBlocksVh(aVar.e, aVar.f, R.layout.catalog_clip_global_search_header_clear_compact, this.H);
        }
        return headerClearBlocksVh == null ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : headerClearBlocksVh;
    }
}
