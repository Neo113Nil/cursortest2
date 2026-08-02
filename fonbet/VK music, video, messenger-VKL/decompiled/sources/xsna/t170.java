package xsna;

import com.vk.dto.stories.model.StoryEntry;
import com.vk.stat.scheme.MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;

/* compiled from: NextOpenStory.kt */
/* loaded from: classes6.dex */
public final class t170 {
    public final StoryEntry a;
    public final MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.TypeNextStory b;

    public t170(StoryEntry storyEntry, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.TypeNextStory typeNextStory) {
        this.a = storyEntry;
        this.b = typeNextStory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t170)) {
            return false;
        }
        t170 t170Var = (t170) obj;
        return epx.f(this.a, t170Var.a) && this.b == t170Var.b;
    }

    public final int hashCode() {
        StoryEntry storyEntry = this.a;
        return this.b.hashCode() + ((storyEntry == null ? 0 : storyEntry.hashCode()) * 31);
    }

    public final String toString() {
        return "NextOpenStory(nextOpenStory=" + this.a + ", typeNextStory=" + this.b + ')';
    }
}
