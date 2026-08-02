package xsna;

import android.content.Context;
import android.os.Trace;
import com.vk.donut.video.subscription.impl.DonutSubscriptionManagerImpl;
import com.vk.donut.video.subscription.impl.di.DonutSubscriptionVideoComponentImpl;
import com.vk.libvideo.api.di.OnboardingComponent;
import com.vk.story.api.di.StoriesComponent;
import com.vk.toggle.features.VideoFeatures;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class mu2 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mu2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        switch (this.b) {
            case 0:
                return new lvq(new nu2((Context) this.c, 0));
            case 1:
                DonutSubscriptionVideoComponentImpl donutSubscriptionVideoComponentImpl = (DonutSubscriptionVideoComponentImpl) this.c;
                nwy nwyVar = donutSubscriptionVideoComponentImpl.e;
                qcy<Object> qcyVar = DonutSubscriptionVideoComponentImpl.f[2];
                return new DonutSubscriptionManagerImpl(new a3o((yxm0) nwyVar.c(), new hy6(donutSubscriptionVideoComponentImpl, 2)), new e3o(new dy2()));
            case 2:
                return new xw1((r7v) this.c, 6);
            case 3:
                return (StoriesComponent) ((g8m) this.c).a(fpf0.a(StoriesComponent.class));
            case 4:
                return ((OnboardingComponent) m7m.a(((nx50) this.c).b).a(fpf0.a(OnboardingComponent.class))).Yd();
            case 5:
                return ((com.vk.toggle.e) this.c).a.a();
            case 6:
                return ((fsk0) this.c).k.invoke("VKStatsActionThread");
            case 7:
                bhl0 bhl0Var = (bhl0) this.c;
                Trace.beginSection(ndp0.f("lazy StorageManager.dialogsManager"));
                try {
                    yvm yvmVar = new yvm(bhl0Var.B(), bhl0Var.h);
                    bhl0Var.z(yvmVar);
                    return yvmVar;
                } finally {
                    Trace.endSection();
                }
            default:
                if (((qks0) this.c).a) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_CLIP_DEEPLINK_BACKPRESS;
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
