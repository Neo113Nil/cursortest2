package xsna;

import android.view.ViewGroup;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;

/* compiled from: SkeletonRecommendedPlaylistsHolder.kt */
/* loaded from: classes4.dex */
public final class uyj0 extends vif0<s3q0> {
    public final ShimmerFrameLayout n;

    public uyj0(ViewGroup viewGroup) {
        super(viewGroup, R.layout.playlist_recomm_skeleton_item_holder, 0);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) this.itemView.findViewById(R.id.shimmer);
        this.n = shimmerFrameLayout;
        abg0 abg0Var = dhr0.t;
        int c = abg0Var.c(R.attr.vk_ui_skeleton_from);
        int c2 = abg0Var.c(R.attr.vk_ui_skeleton_to);
        Shimmer.c cVar = (Shimmer.c) ((Shimmer.c) zn.a(true)).i();
        cVar.k(c);
        cVar.a.d = c2;
        shimmerFrameLayout.b(((Shimmer.c) cVar.d()).a());
    }

    @Override // xsna.vif0
    public final void i6(s3q0 s3q0Var) {
        this.n.d();
    }
}
