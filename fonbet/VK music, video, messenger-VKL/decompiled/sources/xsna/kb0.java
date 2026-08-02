package xsna;

import com.vk.libvideo.adfree.impl.di.VideoAdFreeSubscriptionComponentImpl;
import com.vk.silentauthbylogin.di.SilentAuthByLoginComponentImpl;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeMultiaccountsItem;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.textformat.di.MsgTextFormatComponentImpl;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.stereo.stub.notifications.di.VoipStereoNotificationsComponentStub;
import com.vkontakte.android.VKApplication;
import java.net.InetAddress;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Result;
import kotlin.random.Random;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class kb0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ kb0(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        if (com.vk.toggle.b.A.a(r0) != false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Method] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Result.Failure failure;
        boolean z = true;
        switch (this.b) {
            case 0:
                Random.b.getClass();
                return Integer.valueOf(Random.c.k(2147418112) + 65536);
            case 1:
                try {
                    ?? declaredMethod = InetAddress.class.getDeclaredMethod("clearDnsCache", null);
                    declaredMethod.setAccessible(true);
                    failure = declaredMethod;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                return new Result(failure);
            case 2:
                return k840.a.g().b();
            case 3:
                return Boolean.valueOf(o25.b(o25.a()));
            case 4:
                return jlg.a;
            case 5:
                return e43.l(SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH, SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH_FROM_SWITCHER, SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH_ADD_AUTH);
            case 6:
                if (com.vk.toggle.d.L()) {
                    CoreFeatures coreFeatures = CoreFeatures.NETWORK_TRACE_OTEL;
                    coreFeatures.getClass();
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
            case 7:
                return new tq20();
            case 8:
                qcy<Object>[] qcyVarArr = SilentAuthByLoginComponentImpl.e;
                return new zmj0();
            case 9:
                VKApplication.a aVar = VKApplication.c;
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                if (superappUiRouterBridge != null) {
                    return superappUiRouterBridge;
                }
                return null;
            case 10:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_CATALOG_BOTTOM_SHEET_REDESIGN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 11:
                return new VideoAdFreeSubscriptionComponentImpl.a();
            case 12:
                return new MsgTextFormatComponentImpl.a();
            case 13:
                asu0.a.getClass();
                ScheduledExecutorService v = asu0.v();
                io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
                return new io.reactivex.rxjava3.internal.schedulers.d(v, true);
            default:
                return new VoipStereoNotificationsComponentStub.a();
        }
    }
}
