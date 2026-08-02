package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.dto.common.DzenArticleBlockItem;
import com.vkontakte.android.R;

/* compiled from: DzenArticlesCardAdapter.kt */
/* loaded from: classes4.dex */
public final class ito extends androidx.recyclerview.widget.x<DzenArticleBlockItem, vif0<?>> {
    public final wmg c;
    public final wa5 d;
    public boolean e;

    /* compiled from: DzenArticlesCardAdapter.kt */
    public static final class a extends m.e<DzenArticleBlockItem> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(DzenArticleBlockItem dzenArticleBlockItem, DzenArticleBlockItem dzenArticleBlockItem2) {
            return dzenArticleBlockItem.equals(dzenArticleBlockItem2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(DzenArticleBlockItem dzenArticleBlockItem, DzenArticleBlockItem dzenArticleBlockItem2) {
            return epx.f(dzenArticleBlockItem.b, dzenArticleBlockItem2.b);
        }
    }

    public ito(wmg wmgVar, wa5 wa5Var) {
        super(new a());
        this.c = wmgVar;
        this.d = wa5Var;
        this.e = true;
    }

    @Override // androidx.recyclerview.widget.x, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        if (this.e) {
            return 5;
        }
        return super.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.e ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        vif0 vif0Var = (vif0) e0Var;
        if (!(vif0Var instanceof kro) || i < 0 || i >= getItemCount()) {
            return;
        }
        ((kro) vif0Var).V5(getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new kro(viewGroup, this.c, this.d);
        }
        aso asoVar = new aso(viewGroup, R.layout.holder_dzen_article_skeleton, 0);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) asoVar.itemView.findViewById(R.id.shimmer_dzen_article_skeleton);
        Shimmer.c cVar = new Shimmer.c();
        abg0 abg0Var = dhr0.t;
        cVar.k(abg0Var.c(R.attr.vk_ui_skeleton_from));
        cVar.a.d = abg0Var.c(R.attr.vk_ui_skeleton_to);
        shimmerFrameLayout.b(cVar.a());
        bwt0.d(shimmerFrameLayout, iah0.b(12.0f), (r4 & 2) != 0, (r4 & 4) != 0);
        return asoVar;
    }
}
