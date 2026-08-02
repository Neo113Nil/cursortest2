package xsna;

import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;

/* compiled from: LoadingImageEntity.kt */
/* loaded from: classes6.dex */
public final class x1d0 implements otz {
    public final StoryEntry a;
    public final Boolean b;
    public final StoryEntry c;
    public final StoriesContainer d;
    public Integer e = null;

    public x1d0(StoryEntry storyEntry, Boolean bool, StoryEntry storyEntry2, StoriesContainer storiesContainer) {
        this.a = storyEntry;
        this.b = bool;
        this.c = storyEntry2;
        this.d = storiesContainer;
    }

    @Override // xsna.otz
    public final void a(Integer num) {
        this.e = num;
    }

    @Override // xsna.otz
    public final Integer b() {
        return this.e;
    }

    @Override // xsna.otz
    public final StoryEntry c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1d0)) {
            return false;
        }
        x1d0 x1d0Var = (x1d0) obj;
        return epx.f(this.a, x1d0Var.a) && epx.f(this.b, x1d0Var.b) && epx.f(this.c, x1d0Var.c) && epx.f(this.d, x1d0Var.d) && epx.f(this.e, x1d0Var.e);
    }

    @Override // xsna.otz
    public final StoriesContainer getStoriesContainer() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        StoryEntry storyEntry = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (storyEntry == null ? 0 : storyEntry.hashCode())) * 31)) * 31;
        Integer num = this.e;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreloadingStoryEntity(preloadingStoryEntry=");
        sb.append(this.a);
        sb.append(", stubInstance=");
        sb.append(this.b);
        sb.append(", storyEntry=");
        sb.append(this.c);
        sb.append(", storiesContainer=");
        sb.append(this.d);
        sb.append(", priorityLoading=");
        return uqi.b(sb, this.e, ')');
    }
}
