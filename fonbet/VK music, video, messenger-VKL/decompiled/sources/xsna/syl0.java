package xsna;

import com.vk.dto.stories.entities.stat.StoryBackgroundType;

/* compiled from: StoryBackgroundTypeItem.kt */
/* loaded from: classes16.dex */
public final class syl0 {
    public final StoryBackgroundType a;

    public syl0(StoryBackgroundType storyBackgroundType) {
        this.a = storyBackgroundType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof syl0) && this.a == ((syl0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StoryBackgroundTypeItem(type=" + this.a + ')';
    }
}
