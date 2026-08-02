package xsna;

import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;

/* compiled from: StoryPositionInfo.kt */
/* loaded from: classes6.dex */
public final class u8m0 {
    public final long a;
    public final int b;
    public final int c;
    public final Long d;
    public final boolean e;

    /* compiled from: StoryPositionInfo.kt */
    public static final class a {
    }

    public u8m0(long j, int i, int i2, Long l, boolean z) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = l;
        this.e = z;
    }

    public static final u8m0 a(long j, StoriesContainer storiesContainer, Long l, StoryEntry storyEntry) {
        if (storiesContainer == null) {
            return null;
        }
        int indexOf = storiesContainer.g.indexOf(storyEntry);
        return new u8m0(j, indexOf, (storiesContainer.g.size() - 1) - indexOf, l, false);
    }
}
