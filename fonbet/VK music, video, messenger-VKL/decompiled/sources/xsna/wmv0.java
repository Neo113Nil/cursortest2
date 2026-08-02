package xsna;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.superapp.ui.shimmer.Shimmer;
import com.vk.superapp.ui.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;

/* compiled from: VkStepsStabViewProvider.kt */
/* loaded from: classes6.dex */
public final class wmv0 {
    public static Shimmer a() {
        int l = krv0.l(R.attr.vk_ui_skeleton_from);
        int l2 = krv0.l(R.attr.vk_ui_vkontakte_stories_skeleton_loader_background);
        Shimmer.c cVar = (Shimmer.c) new Shimmer.c().c(false).j();
        cVar.k(l);
        cVar.a.d = l2;
        return cVar.d(1.0f).g(iah0.a(360)).a();
    }

    public static ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup, qjo0 qjo0Var) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.vk_steps_app_skeleton, viewGroup, false);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) viewGroup2.findViewById(R.id.header_content_shimmer);
        ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) viewGroup2.findViewById(R.id.footer_content_shimmer);
        ((ImageView) viewGroup2.findViewById(R.id.back_button)).setOnClickListener(new c98(qjo0Var, 19));
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.b(a());
        }
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.c();
        }
        if (shimmerFrameLayout2 != null) {
            shimmerFrameLayout2.b(a());
        }
        shimmerFrameLayout2.c();
        return viewGroup2;
    }
}
