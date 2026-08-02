package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.impl.di.VideoAdvertisementsComponentImpl;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.subscription.impl.di.SubscriptionComponentImpl;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.ui.whiteboard.presentation.main.ui.WhiteboardFragment;
import kotlinx.serialization.KSerializer;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class sqf0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ sqf0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.d(SchemeStatSak$EventScreen.REGISTRATION_EMAIL_PASSWORD, null, null, 12);
                return s3q0.a;
            case 1:
                return s3q0.a;
            case 2:
                return "Can't set Session.isVisible when player is null!";
            case 3:
                return o25.a().c();
            case 4:
                return k840.a.g().b();
            case 5:
                qcy<Object>[] qcyVarArr = SubscriptionComponentImpl.d;
                return new j4h();
            case 6:
                int i = SuperAppFragment.o0;
                return s3q0.a;
            case 7:
                return new Rect();
            case 8:
                return new Handler(Looper.getMainLooper());
            case 9:
                return new e1i();
            case 10:
                qcy<Object>[] qcyVarArr2 = VideoAdvertisementsComponentImpl.g;
                bpn0 bpn0Var = fxc0.a;
                return (g7s0) (bpn0Var != null ? bpn0Var : null).getValue();
            case 11:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_UPCOMING_LIVE_NOTIFY;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 12:
                qcy<Object>[] qcyVarArr3 = VideoView.T0;
                return new a390();
            case 13:
                return s3q0.a;
            case 14:
                return new rpj(fpf0.a(Size.class), null, new KSerializer[0]);
            case 15:
                iyk0 iyk0Var = rrv0.a;
                return ojv0.a;
            case 16:
                return s3q0.a;
            case 17:
                Context context = e43.a;
                return (AudioManager) (context != null ? context : null).getSystemService("audio");
            default:
                int i2 = WhiteboardFragment.R;
                return com.vk.voip.ui.c.b;
        }
    }
}
