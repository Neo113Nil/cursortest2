package xsna;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.VkMixViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.UIBlockSeparator;
import java.util.WeakHashMap;
import xsna.iut0;

/* compiled from: MusicCatalogVerticalDecorator.kt */
/* loaded from: classes16.dex */
public class be40 extends yog0 {

    /* compiled from: MusicCatalogVerticalDecorator.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.MUSIC_CHART_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_BANNERS_CENTER_ALIGNED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_PLACEHOLDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_PODCAST_EPISODES.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_MUSIC_TRACKS.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // xsna.sca, androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        super.getItemOffsets(rect, view, recyclerView, a0Var);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        this.b.getClass();
        lca a2 = b4a.a(adapter);
        if (a2 == null) {
            throw new RuntimeException();
        }
        uuk uukVar = a2.c;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        UIBlock uIBlock = (UIBlock) uukVar.c(childAdapterPosition + 1);
        UIBlock uIBlock2 = (UIBlock) uukVar.c(childAdapterPosition);
        if (uIBlock2 == null) {
            return;
        }
        CatalogDataType catalogDataType = uIBlock2.e;
        CatalogViewType catalogViewType = uIBlock2.d;
        CatalogDataType catalogDataType2 = CatalogDataType.DATA_TYPE_CATALOG_MARKET_ITEMS;
        int i = sca.j;
        if (catalogDataType == catalogDataType2 && catalogViewType == CatalogViewType.DOUBLE_STACKED_LIST) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            GridLayoutManager.b bVar = layoutParams instanceof GridLayoutManager.b ? (GridLayoutManager.b) layoutParams : null;
            if (bVar != null) {
                int i2 = ((GridLayoutManager) recyclerView.getLayoutManager()).s;
                int i3 = bVar.g;
                if (i3 < i2) {
                    int i4 = bVar.f;
                    boolean z = i4 == 0;
                    boolean z2 = i4 + i3 == i2;
                    rect.left = z ? i : 0;
                    rect.right = z2 ? i : 0;
                }
                rect.top = sca.f;
                rect.bottom = 0;
            }
        }
        switch (a.$EnumSwitchMapping$1[catalogDataType.ordinal()]) {
            case 1:
                if (catalogViewType == CatalogViewType.LARGE_LIST && yog0.m(uIBlock)) {
                    rect.bottom += i;
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    if ((marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) > 0) {
                        f4m.q(0, view);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (catalogViewType == CatalogViewType.BUTTONS_HORIZONTAL && yog0.m(uIBlock)) {
                    rect.bottom += i;
                    return;
                }
                return;
            case 3:
                if (yog0.m(uIBlock)) {
                    rect.bottom += i;
                    return;
                }
                return;
            case 4:
                if (!(uIBlock2 instanceof UIBlockPlaceholder) || ((UIBlockPlaceholder) uIBlock2).I == null) {
                    return;
                }
                rect.top += sca.l;
                return;
            case 5:
                if (catalogViewType == CatalogViewType.LISTENED_LIST && yog0.m(uIBlock)) {
                    rect.bottom += i;
                    return;
                }
                return;
            case 6:
                int i5 = a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if ((i5 == 1 || i5 == 2) && yog0.m(uIBlock)) {
                    rect.bottom += i;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // xsna.yog0, androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        super.onDrawOver(canvas, recyclerView, a0Var);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        this.b.getClass();
        lca a2 = b4a.a(adapter);
        if (a2 == null) {
            throw new RuntimeException();
        }
        uuk uukVar = a2.c;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            UIBlock uIBlock = (UIBlock) uukVar.c(childAdapterPosition - 1);
            UIBlock uIBlock2 = (UIBlock) uukVar.c(childAdapterPosition - 2);
            boolean z = uIBlock instanceof UIBlockSeparator;
            if (z && ((UIBlockSeparator) uIBlock).d == CatalogViewType.SYNTHETIC_SEPARATOR_OVERLAP && uIBlock2.d == CatalogViewType.AUDIO_STREAM_MIX_INTERACTIVE) {
                View rootView = recyclerView.getRootView();
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                bqx0 a3 = iut0.e.a(rootView);
                h4x j = a3 != null ? a3.a.j(1) : null;
                f4m.t(iah0.a(10) + (-(j != null ? j.b : 0)), childAt);
                childAt.setTag("view_tag_after_mix_interactive");
            } else if (epx.f(childAt.getTag(), "view_tag_after_mix_interactive")) {
                f4m.t(0, childAt);
                childAt.setTag(null);
            }
            CatalogViewStyle catalogViewStyle = uIBlock2 != null ? uIBlock2.l : null;
            VkMixViewStyle vkMixViewStyle = catalogViewStyle instanceof VkMixViewStyle ? (VkMixViewStyle) catalogViewStyle : null;
            VkMixViewStyle.Style style = vkMixViewStyle != null ? vkMixViewStyle.b : null;
            if (z && ((UIBlockSeparator) uIBlock).d == CatalogViewType.SYNTHETIC_SEPARATOR_OVERLAP && style == VkMixViewStyle.Style.Small) {
                f4m.t(cn70.b(-21), childAt);
                f4m.q(cn70.b(-4), childAt);
                childAt.setTag("view_tag_after_mix_small");
            } else if (epx.f(childAt.getTag(), "view_tag_after_mix_small")) {
                f4m.t(0, childAt);
                f4m.q(0, childAt);
                childAt.setTag(null);
            }
        }
    }
}
