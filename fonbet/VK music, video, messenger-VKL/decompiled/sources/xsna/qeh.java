package xsna;

import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.profile.core.avatar.StoryBorderMode;

/* compiled from: CommunityProfileAvatarViewDelegate.kt */
/* loaded from: classes5.dex */
public interface qeh extends ts5 {

    /* compiled from: CommunityProfileAvatarViewDelegate.kt */
    public static final class a {
        public final StoryBorderMode a;
        public final cq5 b;
        public final AvatarBorderType c;

        public a(StoryBorderMode storyBorderMode, cq5 cq5Var, AvatarBorderType avatarBorderType) {
            this.a = storyBorderMode;
            this.b = cq5Var;
            this.c = avatarBorderType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "AvatarBorderParams(avatarStoryBorderMode=" + this.a + ", avatarBorderState=" + this.b + ", avatarBorderType=" + this.c + ')';
        }
    }

    void setSolidFillColor(int i);

    void u(a aVar, String str, boolean z, boolean z2, StoriesContainer storiesContainer, String str2);

    default void E() {
    }

    default void e() {
    }

    default void n(int i) {
    }

    default void w(o9r0 o9r0Var) {
    }
}
