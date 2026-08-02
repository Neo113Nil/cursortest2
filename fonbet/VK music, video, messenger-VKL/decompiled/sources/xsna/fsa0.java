package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogButtonFilters;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogStateInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.banner.CatalogBannerImageMode;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.style.PlaceholderCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockButtons;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: PlaceholderBlockTransformer.kt */
/* loaded from: classes16.dex */
public final class fsa0 {

    /* compiled from: PlaceholderBlockTransformer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogBannerImageMode.values().length];
            try {
                iArr[CatalogBannerImageMode.SQUARE_BIG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogBannerImageMode.ROUND_BIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogBannerImageMode.SQUARE_SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogBannerImageMode.ROUND_SMALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogBannerImageMode.FULL_BACKGROUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogBannerImageMode.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogBannerImageMode.ROUNDED_SMALL_IMAGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogViewType.values().length];
            try {
                iArr2[CatalogViewType.NOTIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CatalogViewType.PLACEHOLDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CatalogViewType.PLACEHOLDER_BIG.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CatalogViewType.PLACEHOLDER_SMALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CatalogViewType.PLACEHOLDER_IMAGE_WARNING.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CatalogViewType.PLACEHOLDER_ILLEGAL_QUERY.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[CatalogViewType.BANNER.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[CatalogViewType.PLACEHOLDER_VIDEO_EMPTY_SHORT_VIDEO.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void a(CatalogBlock catalogBlock, ArrayList arrayList, bi20 bi20Var) {
        Object a0 = j5g.a0(catalogBlock.j);
        CatalogButtonFilters catalogButtonFilters = a0 instanceof CatalogButtonFilters ? (CatalogButtonFilters) a0 : null;
        if (catalogButtonFilters == null || !epx.f(catalogButtonFilters.c, "groups_my_groups_tabs")) {
            return;
        }
        List list = catalogButtonFilters.g;
        if (list == null) {
            list = EmptyList.b;
        }
        ArrayList arrayList2 = new ArrayList(hu.b(CatalogViewType.FILTER_BUTTON, catalogButtonFilters.i, catalogBlock.b, catalogButtonFilters.c, list, bi20Var));
        arrayList.add(0, new UIBlockButtons(bi20Var.a, arrayList2.size() >= 3 ? CatalogViewType.BUTTONS_HORIZONTAL_WITH_SCROLL : CatalogViewType.BUTTONS_HORIZONTAL, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, arrayList2, null));
    }

    public static final CatalogDataType b(CatalogStateInfo catalogStateInfo) {
        CatalogBannerImageMode catalogBannerImageMode = catalogStateInfo.i;
        switch (catalogBannerImageMode == null ? -1 : a.$EnumSwitchMapping$0[catalogBannerImageMode.ordinal()]) {
            case -1:
            case 5:
            case 6:
                return CatalogDataType.DATA_TYPE_CATALOG_BANNERS_CENTER_ALIGNED;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return CatalogDataType.DATA_TYPE_CATALOG_BANNERS_ALIGNED_TO_IMAGE;
            case 2:
            case 3:
            case 4:
                return CatalogDataType.DATA_TYPE_CATALOG_BANNERS_TOP_ALIGNED;
            case 7:
                return CatalogDataType.DATA_TYPE_CATALOG_BANNERS_ROUNDED_SMALL_IMAGE;
        }
    }

    public static UIBlockPlaceholder c(bi20 bi20Var, CatalogStateInfo catalogStateInfo, CatalogExtendedData catalogExtendedData, nq8 nq8Var) {
        CatalogViewType catalogViewType = bi20Var.d;
        PlaceholderCatalogViewStyle placeholderCatalogViewStyle = new PlaceholderCatalogViewStyle(bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h()));
        ArrayList a2 = nq8Var.a(catalogExtendedData, catalogStateInfo.g, bi20Var);
        CatalogButton catalogButton = catalogStateInfo.h;
        return new UIBlockPlaceholder(bi20Var.a, catalogViewType, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, catalogStateInfo.b, catalogStateInfo.c, catalogStateInfo.d, catalogStateInfo.e, catalogStateInfo.f, catalogStateInfo.m, catalogButton != null ? (UIBlockAction) j5g.a0(nq8Var.a(catalogExtendedData, Collections.singletonList(catalogButton), bi20Var)) : null, a2, catalogStateInfo.i, catalogStateInfo.l, catalogStateInfo.n, catalogStateInfo.o, catalogStateInfo.p, catalogStateInfo.q, placeholderCatalogViewStyle, bi20Var.u, null, catalogStateInfo.r, C.DEFAULT_MUXED_BUFFER_SIZE, null);
    }
}
