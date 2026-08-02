package xsna;

import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;

/* compiled from: VhChannelSearchCellSkeleton.kt */
/* loaded from: classes2.dex */
public final class qqr0 extends vfz<pbb> {
    public static final /* synthetic */ int m = 0;
    public final ShimmerFrameLayout l;

    public qqr0(ShimmerFrameLayout shimmerFrameLayout) {
        super(shimmerFrameLayout);
        this.l = shimmerFrameLayout;
        Shimmer.c e = ((Shimmer.c) ((Shimmer.c) zn.a(true)).i()).e(1200L);
        e.k(b6g.a(R.attr.vk_ui_skeleton_from, this.itemView.getContext()));
        e.a.d = b6g.a(R.attr.vk_ui_skeleton_to, this.itemView.getContext());
        shimmerFrameLayout.b(e.a());
    }

    @Override // xsna.vfz
    public final void V5() {
        this.l.d();
    }

    @Override // xsna.vfz
    public final /* bridge */ /* synthetic */ void W5(pbb pbbVar) {
    }

    @Override // xsna.vfz
    public final void a6() {
        this.l.e();
    }
}
