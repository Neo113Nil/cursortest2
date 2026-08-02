package xsna;

import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;

/* compiled from: StoryEditorRouter.kt */
/* loaded from: classes16.dex */
public final class hed0 {
    public final StoryPrivacyType a;
    public final StoryPrivacyType b;
    public final q9m0 c;

    public hed0(StoryPrivacyType storyPrivacyType, StoryPrivacyType storyPrivacyType2, q9m0 q9m0Var) {
        this.a = storyPrivacyType;
        this.b = storyPrivacyType2;
        this.c = q9m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hed0)) {
            return false;
        }
        hed0 hed0Var = (hed0) obj;
        return this.a == hed0Var.a && this.b == hed0Var.b && epx.f(this.c, hed0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        StoryPrivacyType storyPrivacyType = this.b;
        return this.c.hashCode() + ((hashCode + (storyPrivacyType == null ? 0 : storyPrivacyType.hashCode())) * 31);
    }

    public final String toString() {
        return "PrivacyParams(storyPrivacyType=" + this.a + ", oldPrivacyType=" + this.b + ", privacyGroups=" + this.c + ')';
    }
}
