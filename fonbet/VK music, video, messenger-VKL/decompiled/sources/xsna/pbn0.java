package xsna;

import android.view.View;
import android.widget.ImageView;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;

/* compiled from: SuperAppShowcaseMenuStubHolder.kt */
/* loaded from: classes6.dex */
public final class pbn0 extends ucn0<qbn0> {
    public final ShimmerFrameLayout p;
    public final ImageView q;

    public pbn0(View view) {
        super(view, null);
        this.p = (ShimmerFrameLayout) view.findViewById(R.id.shimmer_layout);
        this.q = (ImageView) view.findViewById(R.id.icon_background);
    }

    @Override // xsna.hf6
    public final void W5(zif0 zif0Var) {
        int Y = dhr0.Y(((qbn0) zif0Var).b, this.itemView.getContext());
        Shimmer a = bmf0.a(Y, 22, this.itemView.getContext());
        ShimmerFrameLayout shimmerFrameLayout = this.p;
        shimmerFrameLayout.b(a);
        this.q.setImageDrawable(new enk0(3.9d, Y));
        bmf0.b(shimmerFrameLayout);
    }
}
