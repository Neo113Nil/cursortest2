package xsna;

import android.content.Context;
import com.vk.catalog.mvi.block.impl.di.CatalogViewComponentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.core.performance.network.NetworkPerformanceMeasurer;
import com.vk.core.preference.Preference;
import com.vk.ecomm.contentproducts.di.ContentProductsComponentImpl;
import com.vk.im.chat.onlines.impl.di.ChatOnlineMembersFeatureComponentImpl;
import com.vk.im.engine.di.ImConfigurationScopedComponentImpl;
import com.vk.im.engine.reporters.performance.events.VkmSuccessRateEventBuilder;
import com.vk.onboarding.impl.di.VkOnboardingComponentImpl;
import com.vk.registration.funnels.di.SakAnalyticsComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.bugreport.impl.di.VideoTechBugreportComponentImpl;
import com.vk.voip.stereo.stub.selectspeaker.di.VoipStereoSelectSpeakersRouterComponentStub;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.BridgeComponentImpl;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class mb8 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ mb8(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z = false;
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = BridgeComponentImpl.I;
                return bng.b;
            case 1:
                t6g0 t6g0Var = t6g0.b;
                return Long.valueOf(t6g0.d().u());
            case 2:
                return new ImConfigurationScopedComponentImpl.a();
            case 3:
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                return Preference.h(context, 0, "keyboard");
            case 4:
                String str = MainActivity.P;
                o2l.a.getClass();
                if (o2l.b("__dbg_shake_to_debug", BuildInfo.e == 99999 && BuildInfo.h())) {
                    z = true;
                } else {
                    VKApplication vKApplication = com.vk.core.apps.a.a;
                }
                return Boolean.valueOf(z);
            case 5:
                return m4s.b;
            case 6:
                return new CatalogViewComponentImpl.a();
            case 7:
                return new s74();
            case 8:
                qcy<Object>[] qcyVarArr2 = SakAnalyticsComponentImpl.f;
                return new udk();
            case 9:
                return new ContentProductsComponentImpl.a();
            case 10:
                return new l2n0(VkmSuccessRateEventBuilder.EventName.CHAT_HISTORY_PAGING);
            case 11:
                VKApplication.a aVar = VKApplication.c;
                NetworkPerformanceMeasurer.a.getClass();
                NetworkPerformanceMeasurer.b = true;
                return s3q0.a;
            case 12:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_START_MUSIC_PL_FROM_ZERO;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 13:
                return new ChatOnlineMembersFeatureComponentImpl.a();
            case 14:
                return new VideoTechBugreportComponentImpl.a();
            case 15:
                return new VkOnboardingComponentImpl.a();
            case 16:
                asu0.a.getClass();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) asu0.l0.getValue();
                io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
                return new io.reactivex.rxjava3.internal.schedulers.d(scheduledExecutorService, true);
            default:
                return new VoipStereoSelectSpeakersRouterComponentStub.a();
        }
    }
}
