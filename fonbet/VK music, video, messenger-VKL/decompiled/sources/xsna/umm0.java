package xsna;

import android.os.Looper;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.stories.design.view.StoryProgressView;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: StoryViewProgressDelegate.kt */
/* loaded from: classes6.dex */
public final class umm0 {
    public final a a;
    public final StoryProgressView b;
    public o3e0 c;
    public boolean d;
    public boolean e;
    public final ryc f = new ryc(this, 11);
    public final q44 g = new q44(this, 10);
    public final CopyOnWriteArrayList<m8m0> h = new CopyOnWriteArrayList<>();
    public final vmm0 i = new vmm0(this, Looper.getMainLooper());

    /* compiled from: StoryViewProgressDelegate.kt */
    public interface a {
        void Y();

        void g();

        StoryEntry getCurrentStory();

        default int getSectionsCount() {
            return getStoriesContainer().g.size();
        }

        StoriesContainer getStoriesContainer();

        void j();

        void n0();

        boolean o();

        void setCurrentStorySeekMs(long j);

        void v();

        void x();

        void y();
    }

    public umm0(mkm0 mkm0Var, StoryProgressView storyProgressView) {
        this.a = mkm0Var;
        this.b = storyProgressView;
    }

    public final int a() {
        o3e0 o3e0Var = this.c;
        return bn10.c((int) ((o3e0Var != null ? o3e0Var.b() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * 100), 0, 100);
    }

    public final void b(o3e0 o3e0Var) {
        this.c = o3e0Var;
        StoryProgressView storyProgressView = this.b;
        o3e0Var.d(storyProgressView);
        o3e0Var.g(this.a.getStoriesContainer().Kb(), storyProgressView);
    }

    public final void c(boolean z) {
        a aVar = this.a;
        if (aVar.o()) {
            aVar.Y();
            vmm0 vmm0Var = this.i;
            vmm0Var.removeCallbacksAndMessages(null);
            vmm0Var.postDelayed(this.f, 0L);
            if (!z) {
                aVar.y();
            }
            CopyOnWriteArrayList<m8m0> copyOnWriteArrayList = this.h;
            int size = copyOnWriteArrayList.size();
            for (int i = 0; i < size; i++) {
                copyOnWriteArrayList.get(i).a();
            }
        }
    }
}
