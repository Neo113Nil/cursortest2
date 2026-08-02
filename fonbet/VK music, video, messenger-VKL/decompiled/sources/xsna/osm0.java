package xsna;

import android.view.View;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.attaches.AttachChannelStub;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vkontakte.android.R;

/* compiled from: StubViewHolder.kt */
/* loaded from: classes2.dex */
public final class osm0 extends wr6 {
    public final VKEnhancedImageView d;
    public final ShimmerFrameLayout e;
    public final wng0 f;

    public osm0(View view) {
        super(view, 5);
        VKEnhancedImageView vKEnhancedImageView = (VKEnhancedImageView) view.findViewById(R.id.stub_image);
        this.d = vKEnhancedImageView;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) view.findViewById(R.id.stub_container);
        this.e = shimmerFrameLayout;
        int d = e3m.d(R.attr.im_msg_part_corner_radius_small, shimmerFrameLayout.getContext());
        wng0 wng0Var = new wng0(-1, d);
        this.f = wng0Var;
        vKEnhancedImageView.setImageDrawable(wng0Var);
        vKEnhancedImageView.setCornerRadius(d);
    }

    @Override // xsna.wr6
    public final void b(Msg msg, NestedMsg nestedMsg, Attach attach, pk30 pk30Var) {
        if ((attach instanceof AttachChannelStub ? (AttachChannelStub) attach : null) == null) {
            return;
        }
        Shimmer.c cVar = (Shimmer.c) ((Shimmer.c) zn.a(true)).i();
        abg0 abg0Var = dhr0.t;
        cVar.k(abg0Var.c(R.attr.vk_ui_skeleton_from));
        cVar.a.d = abg0Var.c(R.attr.vk_ui_skeleton_to);
        Shimmer a = ((Shimmer.c) cVar.d()).a();
        ShimmerFrameLayout shimmerFrameLayout = this.e;
        shimmerFrameLayout.b(a);
        shimmerFrameLayout.d();
    }

    @Override // xsna.wr6
    public final void f(xuj xujVar) {
        this.d.z0(xujVar.a, xujVar.b, xujVar.d, xujVar.c);
        this.f.d(xujVar);
    }

    @Override // xsna.wr6
    public final void c(int i) {
    }

    @Override // xsna.wr6
    public final void d(int i) {
    }

    @Override // xsna.wr6
    public final void e(int i, int i2, int i3) {
    }
}
