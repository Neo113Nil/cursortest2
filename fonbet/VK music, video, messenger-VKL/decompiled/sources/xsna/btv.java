package xsna;

import com.vk.story.viewer.impl.presentation.stories.view.SourceTransitionStory;

/* compiled from: IdeasStoryAction.kt */
/* loaded from: classes6.dex */
public final class btv implements rsv {
    public final SourceTransitionStory b;

    public btv() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof btv) && this.b == ((btv) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "NextPage(source=" + this.b + ')';
    }

    public /* synthetic */ btv(int i) {
        this(SourceTransitionStory.CLICK);
    }

    public btv(SourceTransitionStory sourceTransitionStory) {
        this.b = sourceTransitionStory;
    }
}
