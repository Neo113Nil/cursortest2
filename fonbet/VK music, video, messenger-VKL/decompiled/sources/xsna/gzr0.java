package xsna;

import com.vk.core.preference.Preference;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.stereo.stub.create.di.VoipStereoCreateRoomComponentStub;
import java.lang.annotation.Annotation;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class gzr0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ gzr0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return Preference.j();
            case 1:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_AUTHORS_LIST_REDESIGN_VH;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 2:
                return s3q0.a;
            case 3:
                VideoFeatures videoFeatures2 = VideoFeatures.NEW_FULLSCREEN_REDESIGN_DISCOVERY;
                videoFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures2));
            case 4:
                return new tub0(fpf0.a(izs.class), new Annotation[0]);
            case 5:
                VideoFeatures videoFeatures3 = VideoFeatures.VK_VIDEO_RIGHT_PROMO_FULLSCREEN;
                videoFeatures3.getClass();
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                if (bVar.a(videoFeatures3)) {
                    return com.vk.toggle.d.V.b();
                }
                VideoFeatures videoFeatures4 = VideoFeatures.VK_VIDEO_BOTTOM_PROMO_FULLSCREEN;
                videoFeatures4.getClass();
                if (bVar.a(videoFeatures4)) {
                    return com.vk.toggle.d.U.b();
                }
                return null;
            default:
                qcy<Object>[] qcyVarArr = VoipStereoCreateRoomComponentStub.a;
                return new VoipStereoCreateRoomComponentStub.b();
        }
    }
}
