package xsna;

import android.content.Context;
import com.vk.auth.ui.fastlogin.VkFastLoginView;
import com.vk.catalog2.common.ui.mvp.clip.VideoCatalogSearchFragment;
import com.vk.catalog2.common.ui.mvp.video.VideoPlaylistPlaceHolder;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.libvideo.api.di.VideoAutologinComponent;
import com.vk.libvideo.api.di.VideoNotificationsPermissionComponent;
import com.vk.libvideo.api.di.VideoSubscriptionComponent;
import com.vk.libvideo.screen.VideoActivity;
import com.vk.profile.user.impl.ui.f;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryInternalComponent;
import java.lang.ref.WeakReference;
import xsna.phw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class srq0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ srq0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                vrq0 vrq0Var = (vrq0) obj;
                vrq0Var.p.B(new f.k.d(new WeakReference(vrq0Var.y)));
                return s3q0.a;
            case 1:
                return ((VKEnhancedImageView) obj).u;
            case 2:
                VKSuperAppBrowserFragment vKSuperAppBrowserFragment = (VKSuperAppBrowserFragment) obj;
                int i2 = VKSuperAppBrowserFragment.Y;
                WebApiApplication go = vKSuperAppBrowserFragment.go();
                return new hp20(go != null ? go.b : vKSuperAppBrowserFragment.ho());
            case 3:
                int i3 = VideoActivity.I;
                return ((VideoNotificationsPermissionComponent) m7m.a((VideoActivity) obj).a(fpf0.a(VideoNotificationsPermissionComponent.class))).V();
            case 4:
                return Integer.valueOf(((com.vk.video.ui.discovery.minimizable.announce.a) obj).a.e.getWidth());
            case 5:
                int i4 = VideoCatalogSearchFragment.X;
                return ((VideoAutologinComponent) m7m.d((VideoCatalogSearchFragment) obj).a(fpf0.a(VideoAutologinComponent.class))).S6();
            case 6:
                VideoMinimizableDiscoveryInternalComponent videoMinimizableDiscoveryInternalComponent = (VideoMinimizableDiscoveryInternalComponent) obj;
                VideoMinimizableDiscoveryInternalComponent.a aVar = VideoMinimizableDiscoveryInternalComponent.N;
                return gsi0.b().g ? new jrk(new bpn0(new rns0(videoMinimizableDiscoveryInternalComponent, 3))) : new krk();
            case 7:
                nda ndaVar = ((VideoPlaylistPlaceHolder) obj).u;
                if (ndaVar != null) {
                    ndaVar.c(false);
                }
                return s3q0.a;
            case 8:
                int i5 = VideoProfileFragmentOld.p0;
                return ((VideoSubscriptionComponent) ((k7m) m7m.f((VideoProfileFragmentOld) obj)).mo408a(fpf0.a(VideoSubscriptionComponent.class))).g0();
            case 9:
                return ((ggu0) obj).b;
            case 10:
                ihu0 ihu0Var = (ihu0) obj;
                VkUiView.a.a(ihu0Var.a, ihu0Var.e.getAppId(), true, null, null, false, 44);
                return s3q0.a;
            case 11:
                VkFastLoginView vkFastLoginView = (VkFastLoginView) obj;
                int i6 = VkFastLoginView.v;
                vkFastLoginView.getClass();
                mhy.d(vkFastLoginView);
                return s3q0.a;
            case 12:
                ((ybv0) obj).t.A();
                return s3q0.a;
            case 13:
                phw0.a aVar2 = (phw0.a) obj;
                Context context = aVar2.a.get();
                if (context == null) {
                    return s3q0.a;
                }
                a2 a2Var = new a2();
                a2Var.y(aVar2.c);
                a2Var.z(aVar2.b);
                a2Var.k(context);
                return s3q0.a;
            default:
                ((i5x0) obj).g.getClass();
                return (unw0) com.vk.voip.ui.c.h0().g.getValue();
        }
    }
}
