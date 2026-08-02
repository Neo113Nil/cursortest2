package xsna;

import com.unity3d.ads.core.data.datasource.FIdExistenceDataSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.toggle.features.SmbAdFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.voip.stereo.stub.selectspeaker.di.VoipStereoSelectSpeakersComponentStub;
import xsna.vnj0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class uh80 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ uh80(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        FIdExistenceDataSource initialize$lambda$220$lambda$206;
        HandleInvocationsFromAdViewer initialize$lambda$220$lambda$184;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                return new pto();
            case 2:
                return new t3c0(null);
            case 3:
                return new ots();
            case 4:
                qcy<Object>[] qcyVarArr = ReactionsFeedFragment.q0;
                return Boolean.valueOf(com.vk.toggle.b.A.a(SmbAdFeatures.FEATURE_SMB_LEAD_ADS));
            case 5:
                initialize$lambda$220$lambda$206 = ServiceProvider.initialize$lambda$220$lambda$206();
                return initialize$lambda$220$lambda$206;
            case 6:
                initialize$lambda$220$lambda$184 = ServiceProvider.initialize$lambda$220$lambda$184();
                return initialize$lambda$220$lambda$184;
            case 7:
                return new kgu(iah0.a(8));
            case 8:
                return new nst0();
            case 9:
                f9w f9wVar = c0q0.h;
                return "canceling %s";
            case 10:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_TOOLBAR_VH_REDESIGN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 11:
                int i = VideoCatalogRootVh.M0;
                return Boolean.valueOf(com.vk.toggle.d.N());
            case 12:
                return Boolean.valueOf(fxc0.B().J().A0());
            case 13:
                vnj0 vnj0Var = new vnj0(new vnj0.a());
                vnj0Var.y0(new hoj0());
                return vnj0Var;
            case 14:
                int i2 = VideoMinimizableDiscoveryFragment.p1;
                return Boolean.valueOf(fxc0.B().J().w1());
            case 15:
                VideoFeatures videoFeatures2 = VideoFeatures.FAST_SPEED;
                videoFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures2));
            case 16:
                o2l.a.getClass();
                return Boolean.valueOf(o2l.b("__dbg_voip_call_fail_load_jingle_lib", false));
            default:
                qcy<Object>[] qcyVarArr2 = VoipStereoSelectSpeakersComponentStub.a;
                return new VoipStereoSelectSpeakersComponentStub.b();
        }
    }
}
