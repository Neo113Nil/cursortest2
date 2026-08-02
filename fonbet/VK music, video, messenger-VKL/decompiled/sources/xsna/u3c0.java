package xsna;

import com.vk.queuesync.di.SuperAppQueueComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.stereo.stub.join.di.VoipStereoJoinRouterComponentStub;
import xsna.b9s0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class u3c0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ u3c0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_AVATAR_LIVE_BADGE;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 1:
                return s3q0.a;
            case 2:
                qcy<Object>[] qcyVarArr = SuperAppQueueComponentImpl.b;
                return new uan0(new c2c0(11));
            case 3:
                f9w f9wVar = c0q0.h;
                return "shut down";
            case 4:
                hhd0 hhd0Var = znk0.o;
                if (hhd0Var == null) {
                    hhd0Var = null;
                }
                return new d5r0(((u6g0) hhd0Var.b).a());
            case 5:
                return new b9s0.j();
            case 6:
                return Boolean.valueOf(fxc0.B().J().L1());
            case 7:
                return androidx.compose.runtime.k.b(Boolean.FALSE);
            case 8:
                return s3q0.a;
            default:
                qcy<Object>[] qcyVarArr2 = VoipStereoJoinRouterComponentStub.a;
                return new VoipStereoJoinRouterComponentStub.b();
        }
    }
}
