package xsna;

import android.graphics.RectF;
import android.util.LruCache;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.log.L;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vk.pushes.PushOpenActivity;
import com.vk.queuesync.di.SuperAppQueueComponentImpl;
import com.vk.toggle.features.SoccomFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.stereo.stub.roomlist.di.VoipStereoRoomListRouterComponentStub;
import kotlin.coroutines.d;
import xsna.b9s0;
import xsna.zbd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class c2c0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ c2c0(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.gzs
    public final Object invoke() {
        GetByteStringId initialize$lambda$220$lambda$85;
        int i = 25;
        switch (this.b) {
            case 0:
                return new h170();
            case 1:
                int i2 = y1z.a;
                LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
                return Boolean.FALSE;
            case 2:
                int i3 = PostingFragment.s0;
                return new uac0();
            case 3:
                return new cll(new l63(i), new xbd0(zbd0.a.b), true);
            case 4:
                SoccomFeatures soccomFeatures = SoccomFeatures.MULTI_INTEGRATION;
                soccomFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(soccomFeatures));
            case 5:
                int i4 = PushOpenActivity.f;
                L.p("Account switched at PushOpenActivity");
                return s3q0.a;
            case 6:
                return new xf3();
            case 7:
                return new aha0();
            case 8:
                return s3q0.a;
            case 9:
                initialize$lambda$220$lambda$85 = ServiceProvider.initialize$lambda$220$lambda$85();
                return initialize$lambda$220$lambda$85;
            case 10:
                return zvj.a(d.a.a(whn0.a(), om50.a));
            case 11:
                qcy<Object>[] qcyVarArr = SuperAppQueueComponentImpl.b;
                vx2.a.getClass();
                return vx2.b();
            case 12:
                float f = iah0.f().heightPixels;
                return new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, iah0.f().widthPixels, f);
            case 13:
                f9w f9wVar = c0q0.h;
                return "executing %s";
            case 14:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_SEND_TECH_EVENT_QOS;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 15:
                return new LruCache(25);
            case 16:
                return new b9s0.i();
            case 17:
                VideoFeatures videoFeatures2 = VideoFeatures.PLAYER_TECH_BUGREPORT;
                videoFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures2));
            case 18:
                qcy<Object>[] qcyVarArr2 = VoipStereoRoomListRouterComponentStub.a;
                return new VoipStereoRoomListRouterComponentStub.b();
            default:
                return new b2i0();
        }
    }
}
