package xsna;

import android.app.Application;
import android.app.NotificationManager;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.vk.catalog.mvi.block.music.impl.di.CatalogMusicViewComponentImpl;
import com.vk.ecomm.clipproductattaches.di.ClipProductAttachesComponentImpl;
import com.vk.im.chat.clips.decoration.impl.di.DialogClipsContextScopedImpl;
import com.vk.im.engine.di.lifecycle.ImEngineLifecycleComponentImpl;
import com.vk.im.engine.reporters.performance.events.VkmSuccessRateEventBuilder;
import com.vk.local.storage.impl.di.LocalStorageComponentImpl;
import com.vk.registration.funnels.di.SakAnalyticsComponentImpl;
import com.vk.story.viewer.impl.di.StoryViewerComponentImpl;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.stability.impl.di.VideoAppStabilityComponentImpl;
import com.vk.voip.stereo.stub.selectspeaker.di.VoipStereoSelectSpeakersComponentStub;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.BridgeComponentImpl;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asu0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class nb8 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ nb8(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = BridgeComponentImpl.I;
                return rjg.a;
            case 1:
                return new SparseArray(20);
            case 2:
                gzs<Boolean> gzsVar = q5m.a;
                return Boolean.FALSE;
            case 3:
                return new ruo();
            case 4:
                return m7m.e();
            case 5:
                qcy<Object>[] qcyVarArr2 = ImEngineLifecycleComponentImpl.b;
                a1w a1wVar = q1w.a;
                return new s1w(a1wVar != null ? a1wVar : null);
            case 6:
                return "#ImEnvironment: init() start...";
            case 7:
                return new DialogClipsContextScopedImpl.a();
            case 8:
                return "thumbhash".getBytes(emb.b);
            case 9:
                return new Handler(Looper.getMainLooper());
            case 10:
                return ((SessionManagementComponent) ((k7m) m7m.f(new w7m())).a(fpf0.a(SessionManagementComponent.class))).J2();
            case 11:
                return new CatalogMusicViewComponentImpl.a();
            case 12:
                o2l.a.getClass();
                List c0 = drm0.c0(o2l.c("__dbg_test_xowner_disable_allowed_methods", ""), new String[]{StringUtils.COMMA}, 0, 6);
                ArrayList arrayList = new ArrayList(c5g.u(c0, 10));
                Iterator it = c0.iterator();
                while (it.hasNext()) {
                    arrayList.add(drm0.p0((String) it.next()).toString());
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    String str = (String) next;
                    if (str != null && !drm0.N(str)) {
                        arrayList2.add(next);
                    }
                }
                return j5g.S0(arrayList2);
            case 13:
                return new vfw();
            case 14:
                qcy<Object>[] qcyVarArr3 = SakAnalyticsComponentImpl.f;
                return new nr2();
            case 15:
                return new ClipProductAttachesComponentImpl.a();
            case 16:
                qcy<Object>[] qcyVarArr4 = StoryViewerComponentImpl.s;
                return new mnm0();
            case 17:
                return new l2n0(VkmSuccessRateEventBuilder.EventName.CHANNEL_HISTORY_PAGING);
            case 18:
                Application application = zqn0.b;
                return (NotificationManager) (application != null ? application : null).getApplicationContext().getSystemService("notification");
            case 19:
                VKApplication.a aVar = VKApplication.c;
                return m7m.e();
            case 20:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_UMA_VIDEOS_OWNER;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 21:
                return Boolean.valueOf(fxc0.B().J().T1());
            case 22:
                return new LocalStorageComponentImpl.a();
            case 23:
                return new VideoAppStabilityComponentImpl.a();
            case 24:
                return new iau0();
            case 25:
                asu0 asu0Var = asu0.a;
                asu0.a invoke = asu0.z.invoke();
                asu0Var.getClass();
                return asu0.E(invoke, "vk-video-prefetch-pool-thread-");
            default:
                return new VoipStereoSelectSpeakersComponentStub.a();
        }
    }

    public /* synthetic */ nb8(VKApplication vKApplication, int i) {
        this.b = i;
    }
}
