package xsna;

import com.vk.libvideo.design.view.live.LiveView;
import com.vk.libvideo.ui.ad.AdvertBannerView;
import com.vk.stat.scheme.CommonVideoAdsStat$TypeOverlayAdClose;

/* compiled from: LiveView.java */
/* loaded from: classes2.dex */
public final class vnz implements AdvertBannerView.b {
    public final /* synthetic */ LiveView a;

    public vnz(LiveView liveView) {
        this.a = liveView;
    }

    @Override // com.vk.libvideo.ui.ad.AdvertBannerView.b
    public final void a() {
        LiveView liveView = this.a;
        liveView.o0.d(CommonVideoAdsStat$TypeOverlayAdClose.CloseSource.USER, CommonVideoAdsStat$TypeOverlayAdClose.CloseReason.CROSS_BUTTON);
        liveView.Q.B1();
        AdvertBannerView advertBannerView = liveView.v;
        if (advertBannerView != null) {
            advertBannerView.a();
        }
        mg0 mg0Var = liveView.c0;
        if (mg0Var != null) {
            dw20 dw20Var = mg0Var.e;
            if (dw20Var != null) {
                dw20Var.dismiss();
            }
            mg0Var.e = null;
            liveView.c0 = null;
        }
    }

    @Override // com.vk.libvideo.ui.ad.AdvertBannerView.b
    public final void b() {
        LiveView.a(this.a);
    }

    @Override // com.vk.libvideo.ui.ad.AdvertBannerView.b
    public final void c() {
        LiveView.a(this.a);
    }

    @Override // com.vk.libvideo.ui.ad.AdvertBannerView.b
    public final void d() {
        LiveView liveView = this.a;
        if (liveView.b0 != null && liveView.c0 == null) {
            new ng0();
            mg0 mg0Var = new mg0(liveView.getContext(), ng0.a(liveView.b0.c), new wnz(liveView), liveView.o0);
            liveView.c0 = mg0Var;
            mg0Var.a();
        }
    }

    @Override // com.vk.libvideo.ui.ad.AdvertBannerView.b
    public final void onBannerClick() {
        LiveView.a(this.a);
    }
}
