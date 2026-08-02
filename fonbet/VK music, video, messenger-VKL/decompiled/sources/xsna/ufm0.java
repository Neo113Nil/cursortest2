package xsna;

import android.content.Context;
import android.os.Vibrator;
import com.vk.log.L;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.VideoFeatures;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ufm0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ufm0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new avl0();
            case 1:
                return new com.vk.superapp.c();
            case 2:
                return s3q0.a;
            case 3:
                ComFeatures comFeatures = ComFeatures.COM_DEFAULT_AUTHOR;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 4:
                f9w f9wVar = c0q0.h;
                return "cancelAll";
            case 5:
                return new kfa0();
            case 6:
                Context context = e43.a;
                return (Vibrator) (context != null ? context : null).getSystemService("vibrator");
            case 7:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_SUBSCRIPTIONS_CONTROLS_REDESIGN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 8:
                VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_ERROR_RESOLVER;
                videoFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures2));
            case 9:
                bpn0 bpn0Var = jfv0.d;
                if (bpn0Var != null) {
                    return (okhttp3.o) bpn0Var.getValue();
                }
                return null;
            case 10:
                L.e("VoipCallAuthDataProviderImpl", "Account switched by incoming call");
                return s3q0.a;
            case 11:
                com.vk.voip.ui.c.b.j(true);
                return s3q0.a;
            case 12:
                o2l.a.getClass();
                return o2l.c("__dbg_voip_v2_ns_meta_override", "");
            default:
                hhd0 hhd0Var = znk0.o;
                return new hqt(((u6g0) (hhd0Var != null ? hhd0Var : null).b).a());
        }
    }
}
