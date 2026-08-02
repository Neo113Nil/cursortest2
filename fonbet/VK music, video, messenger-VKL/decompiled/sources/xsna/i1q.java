package xsna;

import com.vk.fullscreen.promo.core.FullscreenPromoComponent;
import com.vk.queue.di.QueueSyncComponent;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.VKApplication;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i1q implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i1q(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return Long.valueOf(((k1q) obj).a().compileStatement("INSERT INTO sessions(session_id) VALUES(NULL)").executeInsert());
            case 1:
                return ((QueueSyncComponent) ((axw) obj).c().a(fpf0.a(QueueSyncComponent.class))).o1();
            case 2:
                return ((FullscreenPromoComponent) m7m.a(((nx50) obj).b).a(fpf0.a(FullscreenPromoComponent.class))).n();
            case 3:
                StoriesComponentImpl storiesComponentImpl = (StoriesComponentImpl) obj;
                return new dvl0(storiesComponentImpl.c.yc(), storiesComponentImpl.a.J2(), storiesComponentImpl.bf(), storiesComponentImpl.eb(), storiesComponentImpl.o7(), storiesComponentImpl.e.B7());
            case 4:
                VKApplication vKApplication = (VKApplication) obj;
                VKApplication.a aVar = VKApplication.c;
                return new ph20(vKApplication, new rq6(vKApplication, 13), new VKApplication.h0(0, vKApplication, VKApplication.class, "getNetworkFeaturesHelper", "getNetworkFeaturesHelper()Lcom/vk/toggle/NetworkFeaturesHelper;", 0));
            default:
                if (((qks0) obj).a) {
                    VideoFeatures videoFeatures = VideoFeatures.RESTRICTIONS_REDESIGN;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
        }
    }
}
