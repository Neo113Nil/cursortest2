package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;

/* compiled from: ArtistConfigurationOffsetDecorator.kt */
/* loaded from: classes16.dex */
public final class tq3 extends sca {
    @Override // xsna.sca, androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        super.getItemOffsets(rect, view, recyclerView, a0Var);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        pd90 pd90Var = adapter instanceof pd90 ? (pd90) adapter : null;
        Object obj = pd90Var != null ? pd90Var.c : null;
        lca lcaVar = obj instanceof lca ? (lca) obj : null;
        UIBlock uIBlock = lcaVar != null ? (UIBlock) lcaVar.c.c(recyclerView.getChildAdapterPosition(view)) : null;
        if (uIBlock != null && uIBlock.e == CatalogDataType.DATA_TYPE_CATALOG_MARKET_ITEMS && uIBlock.d == CatalogViewType.DOUBLE_STACKED_LIST) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            GridLayoutManager.b bVar = layoutParams instanceof GridLayoutManager.b ? (GridLayoutManager.b) layoutParams : null;
            if (bVar == null) {
                return;
            }
            int i = ((GridLayoutManager) recyclerView.getLayoutManager()).s;
            int i2 = bVar.g;
            if (i2 < i) {
                int i3 = bVar.f;
                boolean z = i3 == 0;
                boolean z2 = i3 + i2 == i;
                int i4 = sca.j;
                rect.left = z ? i4 : 0;
                if (!z2) {
                    i4 = 0;
                }
                rect.right = i4;
            }
            rect.top = sca.f;
            rect.bottom = 0;
        }
    }
}
