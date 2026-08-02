package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;

/* compiled from: CatalogRecyclerTopBottomOffsetDecorator.kt */
/* loaded from: classes18.dex */
public final class rca extends yog0 {
    public static void n(RecyclerView recyclerView, View view, Rect rect, n9g n9gVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        GridLayoutManager.b bVar = layoutParams instanceof GridLayoutManager.b ? (GridLayoutManager.b) layoutParams : null;
        if (bVar == null) {
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        pd90 pd90Var = adapter instanceof pd90 ? (pd90) adapter : null;
        if (pd90Var == null) {
            return;
        }
        T t = pd90Var.c;
        lca lcaVar = t instanceof lca ? (lca) t : null;
        if (lcaVar == null) {
            return;
        }
        int i = ((GridLayoutManager) recyclerView.getLayoutManager()).s;
        int i2 = n9gVar.b;
        int i3 = bVar.g;
        if (i3 < i) {
            int i4 = bVar.f;
            boolean z = i4 == 0;
            boolean z2 = i4 + i3 == i;
            rect.left = z ? i2 : n9gVar.c;
            if (!z2) {
                i2 = 0;
            }
            rect.right = i2;
        }
        UIBlock uIBlock = (UIBlock) lcaVar.c.c((recyclerView.getChildAdapterPosition(view) - (bVar.f / bVar.g)) - 1);
        if ((uIBlock != null && uIBlock.e == CatalogDataType.DATA_TYPE_NONE && uIBlock.d == CatalogViewType.HEADER) || (uIBlock != null && uIBlock.e == CatalogDataType.DATA_TYPE_CATALOG_NAVIGATION_TABS && uIBlock.d == CatalogViewType.BUTTONS_HORIZONTAL)) {
            rect.top = 0;
        } else {
            rect.top = n9gVar.a;
        }
        rect.bottom = 0;
    }

    public static boolean o(UIBlock uIBlock, CatalogDataType catalogDataType, CatalogViewType catalogViewType) {
        UIBlock uIBlock2;
        return (uIBlock instanceof UIBlockList) && (uIBlock2 = (UIBlock) j5g.a0(((UIBlockList) uIBlock).y)) != null && uIBlock2.e == catalogDataType && uIBlock2.d == catalogViewType;
    }

    @Override // xsna.sca, androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        super.getItemOffsets(rect, view, recyclerView, a0Var);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        pd90 pd90Var = adapter instanceof pd90 ? (pd90) adapter : null;
        Object obj = pd90Var != null ? pd90Var.c : null;
        lca lcaVar = obj instanceof lca ? (lca) obj : null;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        UIBlock uIBlock = lcaVar != null ? (UIBlock) lcaVar.c.c(childAdapterPosition + 1) : null;
        UIBlock uIBlock2 = lcaVar != null ? (UIBlock) lcaVar.c.c(childAdapterPosition) : null;
        UIBlock uIBlock3 = lcaVar != null ? (UIBlock) lcaVar.c.c(childAdapterPosition - 1) : null;
        if (uIBlock2 == null) {
            return;
        }
        CatalogViewType catalogViewType = uIBlock2.d;
        CatalogDataType catalogDataType = uIBlock2.e;
        CatalogDataType catalogDataType2 = CatalogDataType.DATA_TYPE_NONE;
        int i = sca.f;
        if (catalogDataType == catalogDataType2 && catalogViewType == CatalogViewType.HEADER) {
            rect.set(0, i, 0, 0);
        }
        CatalogDataType catalogDataType3 = CatalogDataType.DATA_TYPE_CATALOG_MARKET_ITEMS;
        CatalogViewType catalogViewType2 = CatalogViewType.SLIDER;
        boolean o = o(uIBlock2, catalogDataType3, catalogViewType2);
        int i2 = sca.h;
        if (o) {
            rect.set(0, 0, 0, (uIBlock == null || !yog0.m(uIBlock)) ? 0 : i2);
        }
        CatalogDataType catalogDataType4 = CatalogDataType.DATA_TYPE_CATALOG_GROUPS_INFO_ITEMS;
        boolean o2 = o(uIBlock2, catalogDataType4, catalogViewType2);
        int i3 = sca.i;
        if (o2) {
            rect.set(0, -i3, 0, -sca.k);
        }
        int i4 = sca.m;
        if (catalogDataType == catalogDataType4 && catalogViewType == CatalogViewType.LARGE_LIST) {
            boolean z = uIBlock3 == null;
            boolean z2 = uIBlock == null;
            int i5 = z ? i4 : i2;
            if (z2) {
                i2 = i4;
            }
            rect.set(i4, i5, i4, i2);
        }
        if (catalogDataType == catalogDataType3 && catalogViewType == CatalogViewType.LIST) {
            n(recyclerView, view, rect, new n9g(i, sca.j, 0));
        }
        if (catalogDataType == CatalogDataType.DATA_TYPE_GROUPS_ITEMS && catalogViewType == CatalogViewType.DOUBLE_STACKED_LIST_MINIMALISTIC_CARD) {
            n(recyclerView, view, rect, new n9g(i3, i4, i3));
        }
        if (catalogDataType == CatalogDataType.DATA_SYNTHETIC_SECTION && catalogViewType == CatalogViewType.LARGE_SLIDER_INFINITE) {
            int i6 = sca.d;
            if (uIBlock == null || !yog0.m(uIBlock)) {
                i = i6;
            }
            rect.set(0, -i6, 0, i);
        }
        if (catalogDataType == CatalogDataType.DATA_TYPE_ACTION && catalogViewType == CatalogViewType.BUTTONS_HORIZONTAL) {
            int i7 = sca.e;
            rect.set(0, i7, 0, i7);
        }
    }
}
