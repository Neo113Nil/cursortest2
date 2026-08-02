package xsna;

import com.vk.dto.stories.model.ideas.StoryIdea;
import java.util.List;

/* compiled from: IdeasStoryAction.kt */
/* loaded from: classes6.dex */
public final class tsv implements rsv {
    public final List<StoryIdea> b;

    public tsv(List<StoryIdea> list) {
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tsv) && epx.f(this.b, ((tsv) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("InitialContent(ideas="), this.b);
    }
}
