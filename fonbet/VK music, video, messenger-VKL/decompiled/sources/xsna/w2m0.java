package xsna;

import android.net.Uri;
import android.util.Size;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.features.StoriesFeatures;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: StoryFirstFrameWarmerImpl.kt */
/* loaded from: classes6.dex */
public final class w2m0 implements v2m0 {
    public final ConcurrentHashMap<String, zuk<Void>> a = new ConcurrentHashMap<>();

    /* compiled from: StoryFirstFrameWarmerImpl.kt */
    public static final class a extends ic6<Void> {
        public final /* synthetic */ String b;

        public a(String str) {
            this.b = str;
        }

        @Override // xsna.ic6
        public final void e(zuk<Void> zukVar) {
            ConcurrentHashMap<String, zuk<Void>> concurrentHashMap = w2m0.this.a;
            String str = this.b;
            concurrentHashMap.remove(str);
            Throwable b = zukVar.b();
            if (b != null) {
                L.C("StoryFirstFrameWarmer", b);
            } else {
                L.G("StoryFirstFrameWarmer", zr.a("warm failed ", str, " (no cause)"));
            }
        }

        @Override // xsna.ic6
        public final void f(zuk<Void> zukVar) {
            ConcurrentHashMap<String, zuk<Void>> concurrentHashMap = w2m0.this.a;
            String str = this.b;
            concurrentHashMap.remove(str);
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.d, new Object[]{"StoryFirstFrameWarmer", go9.b("warm done ", str)});
        }
    }

    @Override // xsna.v2m0
    public final void a(StoriesContainer storiesContainer) {
        VideoFile videoFile;
        String d;
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_FIRST_FRAME_WARMUP;
        storiesFeatures.getClass();
        if (com.vk.toggle.b.A.a(storiesFeatures)) {
            StoryEntry Lb = storiesContainer.Lb();
            if (Lb == null || (!Lb.Sb() && ((videoFile = Lb.n) == null || videoFile.getWidth() == 0 || (videoFile.getWidth() < videoFile.getHeight() && !Lb.Lb())))) {
                Lb = null;
            }
            if (Lb == null || (d = wlb0.d(Lb, storiesContainer.Qb(), iah0.v(), iah0.u())) == null || d.length() == 0) {
                return;
            }
            String Ob = storiesContainer.Ob();
            ConcurrentHashMap<String, zuk<Void>> concurrentHashMap = this.a;
            if (concurrentHashMap.containsKey(Ob)) {
                L l = L.a;
                l.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                    return;
                }
                L.u(l, L.LogType.d, new Object[]{"StoryFirstFrameWarmer", go9.b("warm skip-already-processing ", Ob)});
                return;
            }
            if (mcr0.p(d)) {
                L l2 = L.a;
                l2.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                    return;
                }
                L.u(l2, L.LogType.d, new Object[]{"StoryFirstFrameWarmer", go9.b("warm skip-cached ", Ob)});
                return;
            }
            q0v0 q0v0Var = new q0v0(liw.a(), new Size(iah0.v(), iah0.u()), null);
            ImageRequestBuilder h = ImageRequestBuilder.h(Uri.parse(d));
            h.f = q0v0Var;
            ImageRequest a2 = h.a();
            L l3 = L.a;
            l3.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l3, L.LogType.d, new Object[]{"StoryFirstFrameWarmer", y57.a("warm start ", Ob, " url=", d)});
            }
            ae g = rhs.b().g(a2);
            concurrentHashMap.put(Ob, g);
            g.d(new a(Ob), ac9.b);
        }
    }
}
