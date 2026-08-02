package xsna;

import com.vk.im.chat.clips.decoration.impl.di.DialogClipsContextImpl;
import com.vk.libvideo.adfree.impl.di.VideoAdFreeSubscriptionComponentImpl;
import com.vk.superapp.qr.web2app.QrWebToAppComponent;
import com.vk.tabbar.settings.impl.di.TabbarSettingsComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.whitelabelauth.di.WhiteLabelAuthComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class hbl implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hbl(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        switch (this.b) {
            case 0:
                return ((WhiteLabelAuthComponent) m7m.a(((com.vk.auth.b) this.c).a).a(fpf0.a(WhiteLabelAuthComponent.class))).m4();
            case 1:
                DialogClipsContextImpl dialogClipsContextImpl = (DialogClipsContextImpl) this.c;
                return new dcm(dialogClipsContextImpl.a.getExperiments(), dialogClipsContextImpl.b.b0(), dialogClipsContextImpl.c.l(), dialogClipsContextImpl.d.g(), dialogClipsContextImpl.e.g());
            case 2:
                return ((QrWebToAppComponent) ((vop) this.c).k0().a(fpf0.a(QrWebToAppComponent.class))).getHandler();
            case 3:
                TabbarSettingsComponentImpl tabbarSettingsComponentImpl = (TabbarSettingsComponentImpl) this.c;
                return new qvn0(tabbarSettingsComponentImpl.c.o6(), tabbarSettingsComponentImpl.d.D(), tabbarSettingsComponentImpl.tf(), tabbarSettingsComponentImpl.f.t().b(), tabbarSettingsComponentImpl.e.s());
            case 4:
                nwy nwyVar = ((VideoAdFreeSubscriptionComponentImpl) this.c).e;
                qcy<Object> qcyVar = VideoAdFreeSubscriptionComponentImpl.g[3];
                return new wyr0((czr0) nwyVar.c());
            default:
                if (((qks0) this.c).b) {
                    VideoFeatures videoFeatures = VideoFeatures.VK_VIDEO_BOTTOM_PROMO_FULLSCREEN;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
        }
    }
}
