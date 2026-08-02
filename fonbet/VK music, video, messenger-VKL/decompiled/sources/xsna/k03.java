package xsna;

import com.vk.donut.price.impl.di.DonutPriceComponentImpl;
import com.vk.ecomm.configureitemlist.di.ConfigureItemListComponentImpl;
import com.vk.im.engine.di.experiments.ImExperimentsScopedComponentImpl;
import com.vk.im.engine.reporters.performance.events.VkmSuccessRateEventBuilder;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.photos.root.di.PhotosComponentImpl;
import com.vk.story.viewer.impl.di.StoryViewerComponentImpl;
import com.vk.superapp.vkworkout.widget.impl.di.VkWorkoutWidgetBridgeComponentImpl;
import com.vk.toggle.Features;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.music.impl.di.MusicInVideoComponentImpl;
import com.vk.video.ui.upload.impl.di.UploadComponentImpl;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.BridgeComponentImpl;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class k03 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ k03(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                a1w a1wVar = q1w.a;
                if (a1wVar != null) {
                    return a1wVar;
                }
                return null;
            case 1:
                qcy<Object>[] qcyVarArr = BridgeComponentImpl.I;
                return tkg.a;
            case 2:
                bpn0 bpn0Var = c7r0.a;
                c7r0.a();
                return s3q0.a;
            case 3:
                qcy<Object>[] qcyVarArr2 = DonutPriceComponentImpl.b;
                return new b2o();
            case 4:
                return new ImExperimentsScopedComponentImpl.a();
            case 5:
                return mng.a;
            case 6:
                String str = MainActivity.P;
                boolean a = com.vk.toggle.b.A.a(Features.Type.FEATURE_CORE_THREAD_COUNT_METRICS);
                pqo0 b = com.vk.toggle.d.n0.b();
                if (b == null) {
                    pqo0.b.getClass();
                    b = pqo0.d;
                }
                return new oqo0(a, b.a);
            case 7:
                CoreFeatures coreFeatures = CoreFeatures.SKIP_IGNORED_REQUESTS;
                coreFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(coreFeatures));
            case 8:
                FeedFeatures feedFeatures = FeedFeatures.CLEAR_STACK_INACTIVE;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 9:
                qcy<Object>[] qcyVarArr3 = PhotosComponentImpl.u;
                return new ej1();
            case 10:
                return new nqu();
            case 11:
                return new ConfigureItemListComponentImpl.a();
            case 12:
                qcy<Object>[] qcyVarArr4 = StoryViewerComponentImpl.s;
                return m9n.b;
            case 13:
                return new t2n0(VkmSuccessRateEventBuilder.EventName.DEFERRED_SYNC);
            case 14:
                qcy<Object>[] qcyVarArr5 = UploadComponentImpl.b;
                return new kcq0();
            case 15:
                return EmptyList.b;
            case 16:
                VKApplication.a aVar = VKApplication.c;
                return (VkClientMultiAccountComponent) m7m.e().a(fpf0.a(VkClientMultiAccountComponent.class));
            case 17:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_MUSIC_AI_MUSIC_CHAT_OPEN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 18:
                return new MusicInVideoComponentImpl.a();
            case 19:
                return new VkWorkoutWidgetBridgeComponentImpl.a();
            case 20:
                asu0.a.getClass();
                return asu0.y() ? asu0.n() : asu0.E(asu0.A.invoke(), "vk-fresco-io-pool-thread-");
            case 21:
                return new w7k0();
            case 22:
                return new p0t0();
            default:
                return pgr0.a;
        }
    }

    public /* synthetic */ k03(VKApplication vKApplication) {
        this.b = 16;
    }
}
