package xsna;

import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;

/* compiled from: SuperAppWidgetTileStubHolder.kt */
/* loaded from: classes6.dex */
public final class oen0 extends ucn0<pen0> {
    public final ShimmerFrameLayout p;
    public final ShimmerFrameLayout q;
    public final FrameLayout r;
    public final FrameLayout s;

    public oen0(View view) {
        super(view, null);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) view.findViewById(R.id.shimmer_layout);
        this.p = shimmerFrameLayout;
        ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) view.findViewById(R.id.bottom_shimmer);
        this.q = shimmerFrameLayout2;
        ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) view.findViewById(R.id.shimmer_layout_grid);
        this.r = (FrameLayout) view.findViewById(R.id.default_container);
        this.s = (FrameLayout) view.findViewById(R.id.grid_container);
        shimmerFrameLayout.b(bmf0.a(0, 30, this.itemView.getContext()));
        shimmerFrameLayout2.b(bmf0.a(0, 30, this.itemView.getContext()));
        shimmerFrameLayout3.b(bmf0.a(0, 30, this.itemView.getContext()));
    }

    @Override // xsna.hf6
    public final void W5(zif0 zif0Var) {
        this.r.setVisibility(0);
        f4m.j(this.s);
        ShimmerFrameLayout shimmerFrameLayout = this.p;
        if (!shimmerFrameLayout.isLaidOut() || shimmerFrameLayout.isLayoutRequested()) {
            shimmerFrameLayout.addOnLayoutChangeListener(new amf0(shimmerFrameLayout));
        } else {
            shimmerFrameLayout.a();
        }
        ShimmerFrameLayout shimmerFrameLayout2 = this.q;
        if (!shimmerFrameLayout2.isLaidOut() || shimmerFrameLayout2.isLayoutRequested()) {
            shimmerFrameLayout2.addOnLayoutChangeListener(new amf0(shimmerFrameLayout2));
        } else {
            shimmerFrameLayout2.a();
        }
    }
}
