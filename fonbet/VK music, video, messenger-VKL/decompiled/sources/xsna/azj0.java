package xsna;

import android.content.Context;
import android.widget.FrameLayout;
import com.vk.superapp.ui.shimmer.Shimmer;
import com.vk.superapp.ui.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;

/* compiled from: SkeletonView.kt */
/* loaded from: classes13.dex */
public final class azj0 extends au9 implements pmv {
    public final FrameLayout e;
    public final ShimmerFrameLayout f;

    public azj0(Context context) {
        super(context, R.layout.item_skelet_discover_card);
        setClickable(true);
        setBackgroundResource(R.drawable.bg_under_skeleton_discover_card_rounded_tint);
        this.e = (FrameLayout) findViewById(R.id.skeleton_root);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) findViewById(R.id.shimmer_layout);
        this.f = shimmerFrameLayout;
        a aVar = (a) new a().c(false).j();
        abg0 abg0Var = dhr0.t;
        int c = abg0Var.c(R.attr.vk_ui_background);
        Shimmer shimmer = aVar.a;
        shimmer.e = (c & 16777215) | (shimmer.e & (-16777216));
        shimmer.d = abg0Var.c(R.attr.vk_ui_text_muted);
        shimmerFrameLayout.b(aVar.d(1.0f).h(0.08f).g(iah0.a(360)).a());
    }

    @Override // xsna.pmv
    public final void a() {
        this.e.setVisibility(0);
        this.f.c();
    }

    /* compiled from: SkeletonView.kt */
    public static final class a extends Shimmer.b<a> {
        public a() {
            this.a.l = true;
        }

        @Override // com.vk.superapp.ui.shimmer.Shimmer.b
        public final a b() {
            return this;
        }
    }
}
