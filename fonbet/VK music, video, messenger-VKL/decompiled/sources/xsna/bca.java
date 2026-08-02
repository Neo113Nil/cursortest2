package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.news.model.UIBlockFeed;

/* compiled from: CatalogPostDisplayItemsOffsetDecoration.kt */
/* loaded from: classes16.dex */
public final class bca extends l2c0 {
    @Override // xsna.l2c0, androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        super.getItemOffsets(rect, view, recyclerView, a0Var);
        rect.bottom = 0;
    }

    @Override // xsna.l2c0
    public final u1c0 l(RecyclerView recyclerView, View view) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        pd90 pd90Var = adapter instanceof pd90 ? (pd90) adapter : null;
        Object obj = pd90Var != null ? pd90Var.c : null;
        lca lcaVar = obj instanceof lca ? (lca) obj : null;
        UIBlock uIBlock = lcaVar != null ? (UIBlock) lcaVar.c.c(childAdapterPosition) : null;
        UIBlockFeed uIBlockFeed = uIBlock instanceof UIBlockFeed ? (UIBlockFeed) uIBlock : null;
        if (uIBlockFeed != null) {
            return uIBlockFeed.y;
        }
        return null;
    }
}
