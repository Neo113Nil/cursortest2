package xsna;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.core.view.tools.VkViewStub;
import com.vkontakte.android.R;

/* compiled from: StaticAdsItemOverlayContainerRedesign.kt */
/* loaded from: classes17.dex */
public final class awk0 implements yvk0 {
    public final l340 a;
    public final FrameLayout b;
    public final nx0 c;
    public final View d;

    public awk0(View view, int i, bcr0<? extends ImageView> bcr0Var, l340 l340Var) {
        this.a = l340Var;
        this.b = (FrameLayout) view.findViewById(R.id.fullscreen_static_ads_container);
        this.c = new nx0(view, i, true, bcr0Var);
        this.d = view.findViewById(R.id.fullscreen_static_ads_unfocused_blackout);
    }

    @Override // xsna.yvk0
    public final void a() {
        nx0 nx0Var = this.c;
        nx0Var.f.setOnClickListener(new og(this, 7));
        nx0Var.g.setOnClickListener(new oyt(this, 4));
        VkViewStub vkViewStub = nx0Var.m;
        vkViewStub.setViewFactory(new kg(26, vkViewStub, this));
        nx0Var.d.setOnClickListener(new cnw(this, 6));
        nx0Var.e.setOnClickListener(new q3(this, 12));
    }
}
