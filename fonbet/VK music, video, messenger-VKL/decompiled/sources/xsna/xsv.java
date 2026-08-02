package xsna;

import com.vk.dto.stories.model.web.StoryBoxPrepared;

/* compiled from: IdeasStoryAction.kt */
/* loaded from: classes6.dex */
public final class xsv implements rsv {
    public final StoryBoxPrepared b;

    public xsv(StoryBoxPrepared storyBoxPrepared) {
        this.b = storyBoxPrepared;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xsv) && epx.f(this.b, ((xsv) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "PageRendered(prepared=" + this.b + ')';
    }
}
