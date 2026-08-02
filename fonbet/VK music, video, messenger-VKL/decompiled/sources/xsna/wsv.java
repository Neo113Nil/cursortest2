package xsna;

import com.vk.dto.stories.model.web.StoryBoxPrepared;

/* compiled from: IdeasStoryAction.kt */
/* loaded from: classes6.dex */
public final class wsv implements rsv {
    public final StoryBoxPrepared b;

    public wsv(StoryBoxPrepared storyBoxPrepared) {
        this.b = storyBoxPrepared;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wsv) && epx.f(this.b, ((wsv) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "PageRenderFailed(prepared=" + this.b + ')';
    }
}
