package xsna;

import android.view.ViewGroup;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;

/* compiled from: DiscoverStoriesSkeletonHolder.kt */
/* loaded from: classes6.dex */
public final class o9n extends vfz<gvl0> {
    public final ShimmerFrameLayout l;

    public o9n(ViewGroup viewGroup) {
        super(R.layout.stories_discover_skeleton, viewGroup);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) this.itemView.findViewById(R.id.stories_discover_skeleton_shimmer);
        this.l = shimmerFrameLayout;
        Shimmer.c cVar = (Shimmer.c) ((Shimmer.c) zn.a(false)).i();
        cVar.k(viewGroup.getContext().getColor(R.color.vk_gray_50));
        cVar.a.d = viewGroup.getContext().getColor(R.color.vk_gray_800);
        shimmerFrameLayout.b(((Shimmer.c) ((Shimmer.c) cVar.d()).g(0.08f).h()).e(800L).a());
    }

    @Override // xsna.vfz
    public final void W5(gvl0 gvl0Var) {
        this.l.d();
    }
}
