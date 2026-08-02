package xsna;

import android.view.View;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;

/* compiled from: SnippetSectionShimmerVh.kt */
/* loaded from: classes3.dex */
public final class uck0 extends vfz<rck0> {
    public static final /* synthetic */ int o = 0;
    public final View l;
    public final ShimmerFrameLayout m;
    public final ShimmerFrameLayout n;

    public uck0(View view) {
        super(view);
        this.l = view;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) view.findViewById(R.id.shimmer_tracks);
        this.m = shimmerFrameLayout;
        ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) view.findViewById(R.id.shimmer_info);
        this.n = shimmerFrameLayout2;
        Shimmer a = new Shimmer.c().a();
        shimmerFrameLayout.b(a);
        shimmerFrameLayout2.b(a);
    }

    @Override // xsna.vfz
    public final void W5(rck0 rck0Var) {
        this.m.c();
        this.n.c();
    }
}
