package xsna;

import com.vk.dto.stories.model.StoryEntry;

/* compiled from: StoryForHighlight.kt */
/* loaded from: classes3.dex */
public final class z2m0 {
    public final StoryEntry a;
    public final boolean b;

    public z2m0(StoryEntry storyEntry, boolean z) {
        this.a = storyEntry;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2m0)) {
            return false;
        }
        z2m0 z2m0Var = (z2m0) obj;
        return epx.f(this.a, z2m0Var.a) && this.b == z2m0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryForHighlight(story=");
        sb.append(this.a);
        sb.append(", isSelected=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
