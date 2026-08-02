package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;

/* compiled from: CatalogStickyRecyclerPaginatedView.kt */
/* loaded from: classes16.dex */
public final class qel0 extends lca implements vel0 {
    @Override // xsna.vel0
    public final boolean V(int i) {
        return this.f.Q((UIBlock) this.c.c(i));
    }

    @Override // xsna.vel0
    public final void b0(int i, View view) {
        RecyclerView.e0 findViewHolderForAdapterPosition = this.d.findViewHolderForAdapterPosition(i);
        if (findViewHolderForAdapterPosition instanceof tca) {
            CatalogViewHolder catalogViewHolder = ((tca) findViewHolderForAdapterPosition).l;
            if (catalogViewHolder instanceof eha) {
                ((eha) catalogViewHolder).b(view);
            }
        }
    }

    @Override // xsna.vel0
    public final void o(int i, View view) {
        RecyclerView.e0 findViewHolderForAdapterPosition = this.d.findViewHolderForAdapterPosition(i);
        if (findViewHolderForAdapterPosition instanceof tca) {
            CatalogViewHolder catalogViewHolder = ((tca) findViewHolderForAdapterPosition).l;
            if (catalogViewHolder instanceof eha) {
                ((eha) catalogViewHolder).e(view);
            }
        }
    }

    @Override // xsna.vel0
    public final void l(View view) {
    }
}
