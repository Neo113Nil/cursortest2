package xsna;

import com.vk.dto.stories.model.ideas.StoryIdea;
import com.vk.story.viewer.impl.presentation.ideas.ui.IdeasTeaserEvent;
import com.vk.story.viewer.impl.presentation.stories.view.SourceTransitionStory;

/* compiled from: IdeasStorySideEffect.kt */
/* loaded from: classes6.dex */
public interface iuv {

    /* compiled from: IdeasStorySideEffect.kt */
    public static final class a implements iuv {
        public final SourceTransitionStory a;

        public a(SourceTransitionStory sourceTransitionStory) {
            this.a = sourceTransitionStory;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "FinishContainer(source=" + this.a + ')';
        }
    }

    /* compiled from: IdeasStorySideEffect.kt */
    public static final class b implements iuv {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1968021492;
        }

        public final String toString() {
            return "HideIdeasError";
        }
    }

    /* compiled from: IdeasStorySideEffect.kt */
    public static final class c implements iuv {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1843586029;
        }

        public final String toString() {
            return "OpenSettings";
        }
    }

    /* compiled from: IdeasStorySideEffect.kt */
    public static final class d implements iuv {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1897129084;
        }

        public final String toString() {
            return "PreviousContainer";
        }
    }

    /* compiled from: IdeasStorySideEffect.kt */
    public static final class e implements iuv {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 2145704623;
        }

        public final String toString() {
            return "RemoveIdeasContainer";
        }
    }

    /* compiled from: IdeasStorySideEffect.kt */
    public static final class f implements iuv {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1305105760;
        }

        public final String toString() {
            return "TrackPostingRecommendationHidden";
        }
    }

    /* compiled from: IdeasStorySideEffect.kt */
    public static final class g implements iuv {
        public final IdeasTeaserEvent a;
        public final StoryIdea b;

        public g(IdeasTeaserEvent ideasTeaserEvent, StoryIdea storyIdea) {
            this.a = ideasTeaserEvent;
            this.b = storyIdea;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && epx.f(this.b, gVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TrackTeaserEvent(event=" + this.a + ", idea=" + this.b + ')';
        }
    }
}
