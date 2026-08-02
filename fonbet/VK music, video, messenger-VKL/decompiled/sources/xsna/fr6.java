package xsna;

import android.os.Process;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.utils.newtork.NetworkType;
import com.vk.ecomm.cart.impl.di.CartComponentImpl;
import com.vk.ecomm.market.impl.di.MarketComponentImpl;
import com.vk.folders.impl.di.FoldersComponentImpl;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.music.bottomsheets.onboarding.di.RecommendationOnboardingComponentImpl;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.superapp.location.js.bridge.api.di.JsLocationDelegateComponent;
import com.vk.superapp.location.js.bridge.impl.di.JsLocationDelegateComponentImpl;
import com.vk.superapp.statinteractor.api.di.StatInteractorComponent;
import com.vk.toggle.features.ImFeatures;
import com.vk.toggle.features.SmbAdFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.BridgeComponentImpl;
import com.vkontakte.android.task.di.components.ImBridgeComponentImpl;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Result;
import kotlin.collections.EmptySet;
import xsna.k840;
import xsna.lq40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class fr6 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ fr6(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Object failure;
        gzs<List<pvw0>> b;
        switch (this.b) {
            case 0:
                return new ids0();
            case 1:
                qcy<Object>[] qcyVarArr = CartComponentImpl.f;
                return new gy9();
            case 2:
                return new xiy();
            case 3:
                qcy<Object>[] qcyVarArr2 = FoldersComponentImpl.e;
                a1w a1wVar = q1w.a;
                return new sxr(a1wVar != null ? a1wVar : null);
            case 4:
                f9w f9wVar = n3w.z;
                return "#initializeServices";
            case 5:
                return zlv0.a;
            case 6:
                qcy<Object>[] qcyVarArr3 = MarketComponentImpl.l;
                return new oz00();
            case 7:
                if (!k840.a.i()) {
                    return lq40.a.a;
                }
                lq40 Ja = ((OfflineAudioComponent) k840.a.b().a(fpf0.a(OfflineAudioComponent.class))).Ja();
                k840.a.l.b(Ja);
                return Ja;
            case 8:
                return new RecommendationOnboardingComponentImpl.a();
            case 9:
                NetworkType.a aVar = NetworkType.Companion;
                return EmptySet.b;
            case 10:
                SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_VIDEO_AD_DYNAMIC_BUTTON;
                smbAdFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(smbAdFeatures));
            case 11:
                return new jmy();
            case 12:
                return Integer.valueOf(Process.myPid());
            case 13:
                ImFeatures imFeatures = ImFeatures.HUAWEI_PUSH_VENDOR_CHOICE_FIX;
                imFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(imFeatures));
            case 14:
                try {
                    failure = new JsLocationDelegateComponentImpl.a();
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                JsLocationDelegateComponent.Companion.getClass();
                Object b2 = JsLocationDelegateComponent.Companion.b();
                if (failure instanceof Result.Failure) {
                    failure = b2;
                }
                return (c8m) failure;
            case 15:
                r99 r99Var = r99.a;
                x19.z(new t6c0(5));
                return s3q0.a;
            case 16:
                UiTracker uiTracker = UiTracker.a;
                return UiTracker.e();
            case 17:
                return ((VideoMinimizablePlayerComponent) m7m.e().a(fpf0.a(VideoMinimizablePlayerComponent.class))).b3();
            case 18:
                VKApplication.a aVar2 = VKApplication.c;
                return ((StatInteractorComponent) m7m.e().a(fpf0.a(StatInteractorComponent.class))).ie();
            case 19:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_EXPANDED_SEASONS_PLAYLIST;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 20:
                return new BridgeComponentImpl.a();
            case 21:
                return new ImBridgeComponentImpl.a();
            case 22:
                asu0.a.getClass();
                ScheduledExecutorService o = asu0.o();
                io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
                return new io.reactivex.rxjava3.internal.schedulers.d(o, true);
            case 23:
                return new io.reactivex.rxjava3.subjects.f();
            case 24:
                u2x0 u2x0Var = com.vk.voip.ui.c.s0;
                if (u2x0Var == null || (b = u2x0Var.b()) == null) {
                    return null;
                }
                return (List) ((k0m0) b).invoke();
            case 25:
                return Preference.j().getString("oauthHost", "api.".concat(a0a.d) + "/oauth");
            default:
                return x1o0.f();
        }
    }
}
