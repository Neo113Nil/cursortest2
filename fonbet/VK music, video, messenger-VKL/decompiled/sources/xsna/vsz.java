package xsna;

import android.view.View;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;

/* compiled from: LoadingCommentsHolder.kt */
/* loaded from: classes16.dex */
public final class vsz extends vfz<wsz> {
    public final ShimmerFrameLayout l;

    public vsz(View view) {
        super(view);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) view;
        this.l = shimmerFrameLayout;
        Shimmer.c e = ((Shimmer.c) ((Shimmer.c) zn.a(true)).i()).e(1200L);
        abg0 abg0Var = dhr0.t;
        e.k(abg0Var.c(R.attr.vk_ui_skeleton_from));
        e.a.d = abg0Var.c(R.attr.vk_ui_skeleton_to);
        shimmerFrameLayout.b(e.a());
    }

    @Override // xsna.vfz
    public final void V5() {
        this.l.d();
    }

    @Override // xsna.vfz
    public final /* bridge */ /* synthetic */ void W5(wsz wszVar) {
    }

    @Override // xsna.vfz
    public final void a6() {
        this.l.e();
    }
}
