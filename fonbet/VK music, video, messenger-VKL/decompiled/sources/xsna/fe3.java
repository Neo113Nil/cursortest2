package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.superapp.ui.shimmer.Shimmer;
import com.vk.superapp.ui.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;

/* compiled from: AppsCarouselSkeletonHolder.kt */
/* loaded from: classes4.dex */
public final class fe3 extends vif0<s3q0> {
    public fe3(ViewGroup viewGroup) {
        super(viewGroup, R.layout.discover_carousel_app_skeleton_holder, 0);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) this.itemView.findViewById(R.id.shimmer_layout);
        Context context = this.itemView.getContext();
        int f = e3m.f(R.attr.vk_ui_skeleton_from, context);
        int f2 = e3m.f(R.attr.vk_ui_skeleton_to, context);
        Shimmer.c cVar = (Shimmer.c) new Shimmer.c().c(true).j();
        cVar.k(f);
        cVar.a.d = f2;
        shimmerFrameLayout.b(cVar.d(1.0f).a());
        shimmerFrameLayout.c();
    }

    @Override // xsna.vif0
    public final /* bridge */ /* synthetic */ void i6(s3q0 s3q0Var) {
    }
}
