package xsna;

import android.app.Activity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.api.models.AuthResult;
import com.vk.bridges.di.BridgeComponent;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.api.VideoRef;
import com.vk.libvideo.design.view.panel.VideoBottomPanelView;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeEventSource;
import com.vk.video.music.dialog.api.domain.entity.PlaylistOnboardingButton;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoverySideEffect;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.voip.ui.history.friends.ui.a;
import com.vkontakte.android.NetworkStateReceiver;
import com.vungle.ads.internal.protos.Sdk;
import xsna.bqw0;
import xsna.ext;
import xsna.xn50;
import xsna.y050;
import xsna.y5j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class v0s0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v0s0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Activity activity = (Activity) this.c;
                VideoAlbum videoAlbum = (VideoAlbum) this.d;
                ikv0 ikv0Var = (ikv0) obj;
                ydt0 Y = fxc0.B().Y();
                int i = videoAlbum.b;
                Integer valueOf = Integer.valueOf(i);
                if (i > 0) {
                    valueOf = null;
                }
                ydt0.e(Y, activity, videoAlbum, valueOf != null ? VideoRef.CREATE_NEW_ALBUM.h() : null, null, 24);
                ikv0Var.a();
                break;
            case 1:
                VideoBottomPanelView videoBottomPanelView = (VideoBottomPanelView) this.c;
                VideoFile videoFile = (VideoFile) this.d;
                int i2 = VideoBottomPanelView.Q;
                kbj0.u(nr4.b(), videoBottomPanelView.getContext(), videoFile, false, false, null, MobileOfficialAppsSharingStat$TypeEventSource.BUTTON, 28);
                break;
            case 2:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) this.c;
                VideoMinimizableDiscoverySideEffect.s.a aVar = (VideoMinimizableDiscoverySideEffect.s.a) this.d;
                int i3 = VideoMinimizableDiscoveryFragment.p1;
                int i4 = VideoMinimizableDiscoveryFragment.c.$EnumSwitchMapping$3[((PlaylistOnboardingButton) obj).ordinal()];
                if (i4 == 1) {
                    c.r0.f fVar = c.r0.f.b;
                    videoMinimizableDiscoveryFragment.getClass();
                    xn50.a.c(videoMinimizableDiscoveryFragment, fVar);
                    ((BridgeComponent) videoMinimizableDiscoveryFragment.ko().g.getValue()).Le().U().a(videoMinimizableDiscoveryFragment.requireContext(), new y050.b.C4065b(new UserId(aVar.a), aVar.b, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE));
                } else if (i4 == 2) {
                    c.r0.a aVar2 = c.r0.a.b;
                    videoMinimizableDiscoveryFragment.getClass();
                    xn50.a.c(videoMinimizableDiscoveryFragment, aVar2);
                }
                break;
            case 3:
                ext.b bVar = (ext.b) obj;
                ((pcu0) this.c).q((AuthResult) this.d, bVar);
                NetworkStateReceiver.c(bVar, true);
                NetworkStateReceiver a = NetworkStateReceiver.a();
                a.c = 0;
                a.b = false;
                NetworkStateReceiver.h.dispose();
                if (!NetworkStateReceiver.a().b) {
                    NetworkStateReceiver.d(true);
                }
                break;
            case 4:
                y5j.b bVar2 = (y5j.b) this.c;
                y5j.a aVar3 = (y5j.a) this.d;
                q5j q5jVar = (q5j) obj;
                jor0.a(q5jVar.d, q5jVar.c.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                jor0.a(q5jVar.f, bVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                jcv.b(q5jVar.g, aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                break;
            default:
                ((opw0) this.c).l.a(new a.b.C2058a((bqw0.b) this.d));
                break;
        }
        return s3q0.a;
    }
}
