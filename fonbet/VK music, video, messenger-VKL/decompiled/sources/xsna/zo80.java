package xsna;

import android.view.View;
import com.vk.core.preference.Preference;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.stereo.stub.room.di.VoipStereoComponentStub;
import xsna.aof0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class zo80 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ zo80(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                OnlineBookingInternalComponent.a aVar = OnlineBookingInternalComponent.n;
                return new jsi0();
            case 1:
                return "adminGroups" + hd60.a().a().y();
            case 2:
                return Integer.valueOf(View.generateViewId());
            case 3:
                aof0.a.getClass();
                return (aof0) aof0.a.b.getValue();
            case 4:
                return s3q0.a;
            case 5:
                return new ntu();
            case 6:
                return new xi30();
            case 7:
                return androidx.compose.runtime.k.b(0);
            case 8:
                return new kto0();
            case 9:
                return Preference.j();
            case 10:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_INLINE_STANDALONE_RUSTORE_INSTALL;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 11:
                return s3q0.a;
            case 12:
                return new hgl0();
            case 13:
                return tlo0.Companion.serializer();
            case 14:
                return s3q0.a;
            case 15:
                sdi.f = null;
                return s3q0.a;
            case 16:
                i0w0.f = null;
                return s3q0.a;
            case 17:
                return Boolean.valueOf(com.vk.voip.ui.actions.feature.b.b());
            default:
                qcy<Object>[] qcyVarArr = VoipStereoComponentStub.b;
                return new VoipStereoComponentStub.c();
        }
    }

    public /* synthetic */ zo80(mcw0 mcw0Var) {
        this.b = 17;
    }
}
