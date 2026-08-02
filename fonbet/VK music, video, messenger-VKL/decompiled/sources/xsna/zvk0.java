package xsna;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.core.view.tools.VkViewStub;
import com.vkontakte.android.R;

/* compiled from: StaticAdsItemOverlayContainerDefault.kt */
/* loaded from: classes17.dex */
public final class zvk0 implements yvk0 {
    public final fvk0 a;
    public final l340 b;
    public final FrameLayout c;
    public final hx0 d;
    public final View e;

    public zvk0(View view, int i, bcr0<? extends ImageView> bcr0Var, fvk0 fvk0Var, l340 l340Var) {
        this.a = fvk0Var;
        this.b = l340Var;
        this.c = (FrameLayout) view.findViewById(R.id.fullscreen_static_ads_container);
        this.d = new hx0(view, i, true, bcr0Var);
        this.e = view.findViewById(R.id.fullscreen_static_ads_unfocused_blackout);
    }

    @Override // xsna.yvk0
    public final void a() {
        hx0 hx0Var = this.d;
        hx0Var.f.setOnClickListener(new gsg(3, hx0Var, this));
        hx0Var.g.setOnClickListener(new qp4(this, 10));
        VkViewStub vkViewStub = hx0Var.m;
        vkViewStub.setViewFactory(new oe5(22, vkViewStub, this));
        hx0Var.d.setOnClickListener(new ep6(this, 7));
        hx0Var.e.setOnClickListener(new bg0(this, 14));
    }
}
