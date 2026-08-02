package xsna;

import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.stat.scheme.MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;
import java.util.List;
import kotlin.Pair;

/* compiled from: StoryOpeningStateImpl.kt */
/* loaded from: classes6.dex */
public final class q7m0 {
    public String a;
    public com.vk.story.viewer.impl.presentation.stories.b b;
    public StoryEntry c;
    public t170 d;
    public rme0 e;
    public wt30 f;
    public StoriesContainer g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;

    public q7m0(String str) {
        this.a = str;
    }

    public final Integer a(StoriesContainer storiesContainer) {
        List<StoriesContainer> storiesContainer2;
        Pair i;
        com.vk.story.viewer.impl.presentation.stories.b bVar = this.b;
        if (bVar == null || (storiesContainer2 = bVar.getStoriesContainer()) == null || (i = p4g.i(storiesContainer2, new nq1(storiesContainer, 13))) == null) {
            return null;
        }
        return (Integer) i.i();
    }

    public final StoryEntry b() {
        StoryEntry storyEntry;
        t170 t170Var = this.d;
        return (t170Var == null || (storyEntry = t170Var.a) == null) ? this.c : storyEntry;
    }

    public final void c(StoriesContainer storiesContainer, StoryEntry storyEntry, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.TypeNextStory typeNextStory) {
        this.g = storiesContainer;
        this.j = false;
        this.i = false;
        this.h = false;
        this.d = new t170(storyEntry, typeNextStory);
    }

    public final void d() {
        this.k = true;
        this.j = false;
        this.i = false;
        this.h = false;
        this.d = null;
        rme0 rme0Var = this.e;
        if (rme0Var != null) {
            rme0Var.invoke();
        }
    }
}
