package xsna;

import com.vk.libvideo.api.di.VideoPlaylistVideosComponent$Companion$STUB$1;
import com.vk.toggle.Features;
import com.vk.toggle.features.VideoFeatures;
import com.vk.toggle.features.VoipFeatures;
import com.vk.video.polls.di.UxPollsComponentImpl;
import com.vk.voip.stereo.stub.selectspeaker.di.VoipStereoSelectSpeakersRouterComponentStub;
import xsna.scn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class jzm0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ jzm0(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r3.a(r0) != false) goto L30;
     */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z = true;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                return new n7n0();
            case 2:
                return new scn0.a();
            case 3:
                f9w f9wVar = c0q0.h;
                return "canceling active %s";
            case 4:
                d6q0 d6q0Var = d6q0.a;
                return "UnstableNetworkDetector: hiding modal";
            case 5:
                qcy<Object>[] qcyVarArr = UxPollsComponentImpl.i;
                return new o4r0();
            case 6:
                return new VideoPlaylistVideosComponent$Companion$STUB$1.a();
            case 7:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_NEW_SEEKBAR;
                videoFeatures.getClass();
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                if (bVar.a(videoFeatures)) {
                    VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_NEW_SEEK_PREVIEW;
                    videoFeatures2.getClass();
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
            case 8:
                return s3q0.a;
            case 9:
                return s3q0.a;
            case 10:
                com.vk.voip.ui.c.b.getClass();
                return com.vk.voip.ui.c.Y.d();
            case 11:
                com.vk.voip.ui.c.b.getClass();
                if (!com.vk.voip.ui.c.q0()) {
                    com.vk.toggle.b bVar2 = com.vk.toggle.b.A;
                    if (!bVar2.a(Features.Type.FEATURE_VOIP_NOISE_SUPPRESSION) && !bVar2.a(VoipFeatures.ENABLE_NS_DF_TINY)) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 12:
                qcy<Object>[] qcyVarArr2 = VoipStereoSelectSpeakersRouterComponentStub.a;
                return new VoipStereoSelectSpeakersRouterComponentStub.b();
            default:
                com.vk.voip.ui.c.b.getClass();
                return Boolean.valueOf(((com.vk.voip.call_effects.a) com.vk.voip.ui.c.Q()).d.d());
        }
    }
}
