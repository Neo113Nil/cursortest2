package xsna;

import com.vk.dto.stories.model.StoryEntry;

/* compiled from: CreationOnboardingTasksEvent.kt */
/* loaded from: classes5.dex */
public final class sck implements tck {
    public final StoryEntry a;

    public sck(StoryEntry storyEntry) {
        this.a = storyEntry;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sck) && epx.f(this.a, ((sck) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenStory(storyEntry=" + this.a + ')';
    }
}
