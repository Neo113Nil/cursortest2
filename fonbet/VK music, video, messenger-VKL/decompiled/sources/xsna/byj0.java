package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import xsna.bwy;

/* compiled from: SkeletonBlockHeaderHolder.kt */
/* loaded from: classes4.dex */
public final class byj0 extends rp6<cyj0, NewsEntry> {
    public final ShimmerFrameLayout E;

    public byj0(ViewGroup viewGroup) {
        super(R.layout.skeleton_news_block_header, viewGroup);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) this.itemView.findViewById(R.id.skeleton);
        this.E = shimmerFrameLayout;
        Context context = this.itemView.getContext();
        int f = e3m.f(R.attr.vk_ui_skeleton_from, context);
        int f2 = e3m.f(R.attr.vk_ui_skeleton_to, context);
        Shimmer.c cVar = (Shimmer.c) ((Shimmer.c) zn.a(true)).i();
        cVar.k(f);
        cVar.a.d = f2;
        shimmerFrameLayout.b(((Shimmer.c) cVar.d()).a());
    }

    @Override // xsna.rp6
    public final void R6(cyj0 cyj0Var) {
        if (epx.f(cyj0Var.i, bwy.a.a)) {
            return;
        }
        this.E.d();
    }
}
