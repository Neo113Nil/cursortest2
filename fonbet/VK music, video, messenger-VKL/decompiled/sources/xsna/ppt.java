package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;

/* compiled from: GetArchiveResponse.kt */
/* loaded from: classes18.dex */
public final class ppt {
    public final VKList<StoryEntry> a;
    public final StoryOwner b;

    public ppt(VKList<StoryEntry> vKList, StoryOwner storyOwner) {
        this.a = vKList;
        this.b = storyOwner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppt)) {
            return false;
        }
        ppt pptVar = (ppt) obj;
        return epx.f(this.a, pptVar.a) && epx.f(this.b, pptVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GetArchiveResponse(stories=" + this.a + ", storyOwner=" + this.b + ')';
    }
}
