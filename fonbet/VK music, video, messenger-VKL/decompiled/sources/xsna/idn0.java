package xsna;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;

/* compiled from: SuperAppWidgetSectionStubHolder.kt */
/* loaded from: classes6.dex */
public final class idn0 extends ucn0<jdn0> {
    public final ShimmerFrameLayout p;
    public final ShimmerFrameLayout q;
    public final ShimmerFrameLayout r;
    public final VkImage s;
    public final VkImage t;
    public final VkImage u;
    public final VkImage v;
    public final ShimmerFrameLayout w;

    public idn0(View view) {
        super(view, null);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) view.findViewById(R.id.shimmer_layout);
        this.p = shimmerFrameLayout;
        ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) view.findViewById(R.id.bottom_shimmer);
        this.q = shimmerFrameLayout2;
        ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) view.findViewById(R.id.shimmer_layout_grid);
        this.r = shimmerFrameLayout3;
        this.s = (VkImage) view.findViewById(R.id.first_image_view);
        this.t = (VkImage) view.findViewById(R.id.second_image_view);
        this.u = (VkImage) view.findViewById(R.id.third_image_view);
        this.v = (VkImage) view.findViewById(R.id.fourth_image_view);
        ShimmerFrameLayout shimmerFrameLayout4 = (ShimmerFrameLayout) view.findViewById(R.id.shimmer_section_layout);
        this.w = shimmerFrameLayout4;
        shimmerFrameLayout.b(bmf0.a(0, 30, this.itemView.getContext()));
        shimmerFrameLayout2.b(bmf0.a(0, 30, this.itemView.getContext()));
        shimmerFrameLayout3.b(bmf0.a(0, 30, this.itemView.getContext()));
        shimmerFrameLayout4.b(bmf0.a(0, 30, this.itemView.getContext()));
    }

    @Override // xsna.hf6
    public final void W5(zif0 zif0Var) {
        for (VkImage vkImage : e43.l(this.s, this.t, this.u, this.v)) {
            vkImage.q0(R.drawable.vk_bg_skeleton_image_8dp);
            zq70.E(vkImage, 8.0d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        }
        bmf0.b(this.r);
        bmf0.b(this.p);
        bmf0.b(this.q);
        bmf0.b(this.w);
    }
}
