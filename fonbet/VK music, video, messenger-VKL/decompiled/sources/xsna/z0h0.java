package xsna;

import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.view.StaticMapView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$PermissionAccessStatus;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.growth.impl.di.VideoGrowthComponentImpl;
import com.vkontakte.android.task.di.components.VkAppMusicFragmentComponentImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class z0h0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ z0h0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        GetCacheDirectory initialize$lambda$220$lambda$69;
        FlattenerRulesUseCase initialize$lambda$220$lambda$165;
        switch (this.b) {
            case 0:
                return new ix4();
            case 1:
                return s3q0.a;
            case 2:
                initialize$lambda$220$lambda$69 = ServiceProvider.initialize$lambda$220$lambda$69();
                return initialize$lambda$220$lambda$69;
            case 3:
                initialize$lambda$220$lambda$165 = ServiceProvider.initialize$lambda$220$lambda$165();
                return initialize$lambda$220$lambda$165;
            case 4:
                my90 my90Var = new my90();
                MobileOfficialAppsStoriesStat$PermissionAccessStatus mobileOfficialAppsStoriesStat$PermissionAccessStatus = MobileOfficialAppsStoriesStat$PermissionAccessStatus.NOT_DETERMINED;
                my90Var.a = new ky90(mobileOfficialAppsStoriesStat$PermissionAccessStatus, mobileOfficialAppsStoriesStat$PermissionAccessStatus);
                return my90Var;
            case 5:
                return -1;
            case 6:
                int i = StaticMapView.n;
                CoreFeatures coreFeatures = CoreFeatures.STATIC_MAP_VIEW_CACHE_MAP_INSTANCE;
                coreFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(coreFeatures));
            case 7:
                return dgn0.b().h.a();
            case 8:
                return ((BridgeComponent) ((k7m) m7m.f(w1s0.b)).a(fpf0.a(BridgeComponent.class))).C1();
            case 9:
                qcy<Object>[] qcyVarArr = VideoGrowthComponentImpl.k;
                return new vos0();
            case 10:
                return Boolean.valueOf(fxc0.B().J().t0());
            case 11:
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                return (n1s0) b.C1208b.a().l.getValue();
            case 12:
                qcy<Object>[] qcyVarArr2 = VideoView.T0;
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_PTZ_REDESIGN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 13:
                return new gst0();
            case 14:
                bpn0 bpn0Var2 = com.vk.libvideo.autoplay.b.B;
                return (xov) b.C1208b.a().b.getValue();
            case 15:
                qcy<Object>[] qcyVarArr3 = VkAppMusicFragmentComponentImpl.e;
                return new pk40();
            case 16:
                return VkCell.Right.a.Companion.serializer();
            default:
                mjw0.r(false);
                return s3q0.a;
        }
    }

    public /* synthetic */ z0h0(Object obj, int i) {
        this.b = i;
    }
}
