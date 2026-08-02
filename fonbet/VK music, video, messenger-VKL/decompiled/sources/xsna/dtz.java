package xsna;

import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;

/* compiled from: LoadingImageEntity.kt */
/* loaded from: classes6.dex */
public final class dtz implements otz {
    public Integer a;

    @Override // xsna.otz
    public final void a(Integer num) {
        this.a = num;
    }

    @Override // xsna.otz
    public final Integer b() {
        return this.a;
    }

    @Override // xsna.otz
    public final StoryEntry c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtz)) {
            return false;
        }
        dtz dtzVar = (dtz) obj;
        dtzVar.getClass();
        return epx.f(this.a, dtzVar.a);
    }

    @Override // xsna.otz
    public final StoriesContainer getStoriesContainer() {
        return null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return uqi.b(new StringBuilder("LoadingImageEntity(vkImageView=null, url=null, imageSize=null, storyEntry=null, storiesContainer=null, priorityLoading="), this.a, ')');
    }
}
