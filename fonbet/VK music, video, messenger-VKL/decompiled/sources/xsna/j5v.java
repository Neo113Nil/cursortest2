package xsna;

import com.vk.dto.stories.model.StoryEntry;
import com.vkontakte.android.R;

/* compiled from: HighlightStoryCoverItem.kt */
/* loaded from: classes3.dex */
public final class j5v extends zif0 {
    public final StoryEntry a;
    public final boolean b;

    public j5v(StoryEntry storyEntry, boolean z) {
        this.a = storyEntry;
        this.b = z;
    }

    @Override // xsna.zif0
    public final long a() {
        return this.a.c;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.item_story_archive;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5v)) {
            return false;
        }
        j5v j5vVar = (j5v) obj;
        return epx.f(this.a, j5vVar.a) && this.b == j5vVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HighlightStoryCoverItem(story=");
        sb.append(this.a);
        sb.append(", isSelected=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
