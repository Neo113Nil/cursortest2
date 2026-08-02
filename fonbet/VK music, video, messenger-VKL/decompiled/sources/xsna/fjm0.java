package xsna;

import com.vk.dto.stories.model.web.StoryBoxPrepared;

/* compiled from: StoryTemplateNavigationEvent.kt */
/* loaded from: classes6.dex */
public interface fjm0 {

    /* compiled from: StoryTemplateNavigationEvent.kt */
    public static final class a implements fjm0 {
        public final StoryBoxPrepared a;

        public a(StoryBoxPrepared storyBoxPrepared) {
            this.a = storyBoxPrepared;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenCreateStoryWithTemplate(storyBoxPrepared=" + this.a + ')';
        }
    }
}
