package xsna;

import com.vk.libvideo.ui.ad.AdvertBannerView;
import xsna.b4;
import xsna.e31;

/* compiled from: AdvertBannerDelegate.kt */
/* loaded from: classes2.dex */
public final class d31 implements AdvertBannerView.b {
    public final /* synthetic */ e31.a a;

    public d31(e31.a aVar) {
        this.a = aVar;
    }

    @Override // com.vk.libvideo.ui.ad.AdvertBannerView.b
    public final void a() {
        e31.a aVar = this.a;
        aVar.m = null;
        aVar.l.d(b4.n.a);
    }

    @Override // com.vk.libvideo.ui.ad.AdvertBannerView.b
    public final void b() {
        this.a.l.d(b4.m.a);
    }

    @Override // com.vk.libvideo.ui.ad.AdvertBannerView.b
    public final void c() {
        this.a.l.d(b4.m.a);
    }

    @Override // com.vk.libvideo.ui.ad.AdvertBannerView.b
    public final void d() {
        this.a.l.d(b4.o.a);
    }

    @Override // com.vk.libvideo.ui.ad.AdvertBannerView.b
    public final void onBannerClick() {
        this.a.l.d(b4.m.a);
    }
}
