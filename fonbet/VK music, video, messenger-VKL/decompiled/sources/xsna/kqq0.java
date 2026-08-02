package xsna;

import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: UserProfileInterestingStoriesFactoryDelegate.kt */
/* loaded from: classes5.dex */
public final class kqq0 {
    public static UserProfileAdapterItem.s a(sdx sdxVar) {
        if (sdxVar == null || !sdxVar.a) {
            return null;
        }
        List<StoriesContainer> list = sdxVar.b.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (StoriesContainer storiesContainer : list) {
            StringBuilder sb = new StringBuilder();
            sb.append(storiesContainer.zb());
            StoryOwner storyOwner = storiesContainer.b;
            String Gb = storyOwner != null ? storyOwner.Gb() : null;
            if (Gb != null) {
                sb.append('\n');
                sb.append(Gb);
            }
            String sb2 = sb.toString();
            String Ob = storiesContainer.Ob();
            StoryEntry storyEntry = (StoryEntry) j5g.a0(storiesContainer.g);
            String Ib = storyEntry != null ? storyEntry.Ib(iah0.a(100)) : null;
            if (Ib == null) {
                Ib = "";
            }
            StoryEntry storyEntry2 = (StoryEntry) j5g.a0(storiesContainer.g);
            arrayList.add(new dfx(Ob, sb2, Ib, storyEntry2 != null ? storyEntry2.B0 : null));
        }
        return new UserProfileAdapterItem.s(arrayList);
    }
}
