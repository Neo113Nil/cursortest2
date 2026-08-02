package xsna;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.clips.design.view.component.description.ClipDescription;
import com.vk.clips.design.view.component.user.ClipUserView;
import com.vk.clips.sdk.shared.viewer.experiments.models.ClipsMarketAdHeaderClickConfig;
import com.vk.core.view.tools.VkViewStub;
import com.vkontakte.android.R;

/* compiled from: MarketAdsItemOverlayContainerRedesign.kt */
/* loaded from: classes17.dex */
public final class dq00 implements aq00 {
    public final yof a;
    public final dg1 b;
    public final FrameLayout c;
    public final nx0 d;
    public final View e;

    public dq00(View view, int i, bcr0<? extends ImageView> bcr0Var, yof yofVar, dg1 dg1Var) {
        this.a = yofVar;
        this.b = dg1Var;
        this.c = (FrameLayout) view.findViewById(R.id.fullscreen_market_ads_container);
        this.d = new nx0(view, i, false, bcr0Var);
        this.e = view.findViewById(R.id.fullscreen_market_ads_unfocused_blackout);
    }

    @Override // xsna.aq00
    public final void a() {
        nx0 nx0Var = this.d;
        VkViewStub vkViewStub = nx0Var.m;
        vkViewStub.setViewFactory(new zv(12, vkViewStub, this));
        jjc.g(nx0Var.d, new cvh(this, 20));
        ClipUserView clipUserView = nx0Var.e;
        ClipsMarketAdHeaderClickConfig b0 = this.a.b0();
        if (b0.b != ClipsMarketAdHeaderClickConfig.HeaderType.DEFAULT && b0.a) {
            clipUserView.setEnabled(false);
        } else {
            clipUserView.setEnabled(true);
            clipUserView.setOnClickListener(new u01(this, 6));
        }
    }

    @Override // xsna.aq00
    public final ClipUserView b() {
        return this.d.e;
    }

    @Override // xsna.aq00
    public final ImageView c() {
        return this.d.d;
    }

    @Override // xsna.aq00
    public final View g() {
        return this.d.m.getView();
    }

    @Override // xsna.aq00
    public final ClipDescription getDescriptionView() {
        return this.d.i;
    }
}
