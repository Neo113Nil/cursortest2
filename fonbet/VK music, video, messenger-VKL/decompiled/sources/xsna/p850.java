package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.ShowAllListVh;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.u4a;

/* compiled from: MusicStoriesConfiguration.kt */
/* loaded from: classes3.dex */
public abstract class p850 extends com.vk.catalog2.common.ui.mvp.configuration.a {

    /* compiled from: MusicStoriesConfiguration.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogDataType.values().length];
            try {
                iArr[CatalogDataType.DATA_SYNTHETIC_SHOW_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final CatalogPaginatedListViewHolder f0(UIBlock uIBlock, u4a u4aVar, tba<hda> tbaVar, boolean z) {
        return super.f0(uIBlock, u4aVar, tbaVar, false);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        String str;
        u4a.a aVar = u4aVar.b;
        if (a.$EnumSwitchMapping$0[catalogDataType.ordinal()] != 1) {
            return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
        }
        nda ndaVar = aVar.b;
        eda b0 = b0(u4aVar);
        q3a q3aVar = aVar.e;
        dhr0.a.getClass();
        ToolbarVh toolbarVh = new ToolbarVh(ndaVar, q3aVar, null, 0, false, bwt0.u(dhr0.E()), b0, null, null, null, null, 4063004);
        if (uIBlock == null || (str = uIBlock.b) == null) {
            str = "";
        }
        uba ubaVar = new uba(h0(null, str, u4aVar));
        ShowAllListVh showAllListVh = new ShowAllListVh(u4aVar, toolbarVh, com.vk.catalog2.common.ui.mvp.configuration.a.g0(this, uIBlock, u4aVar, ubaVar, 8), false, false, false, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
        ubaVar.h = showAllListVh;
        return showAllListVh;
    }
}
