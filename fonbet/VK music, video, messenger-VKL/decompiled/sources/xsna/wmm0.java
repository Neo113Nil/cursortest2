package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.DiscoverStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import xsna.o3e0;

/* compiled from: StoryViewProgressStrategyFactory.kt */
/* loaded from: classes6.dex */
public final class wmm0 {
    public final b25 a;

    public wmm0(b25 b25Var) {
        this.a = b25Var;
    }

    public final o3e0 a(mkm0 mkm0Var, xaj0 xaj0Var) {
        UserId userId;
        StoriesContainer storiesContainer = mkm0Var.getStoriesContainer();
        StoryEntry currentStory = mkm0Var.getCurrentStory();
        boolean z = false;
        boolean z2 = (currentStory != null && currentStory.Sb()) || (currentStory != null && currentStory.Qb()) || mkm0Var.getCurrentIndex() >= storiesContainer.g.size();
        boolean a = (currentStory == null || (userId = currentStory.d) == null) ? false : this.a.a(userId);
        if (currentStory != null && currentStory.i0) {
            z = true;
        }
        return storiesContainer instanceof DiscoverStoriesContainer ? o3e0.b.b : (z2 || xaj0Var == null) ? new o3e0.a.C3439a(mkm0Var, z, a) : new o3e0.a.b(mkm0Var, xaj0Var, z, a);
    }
}
