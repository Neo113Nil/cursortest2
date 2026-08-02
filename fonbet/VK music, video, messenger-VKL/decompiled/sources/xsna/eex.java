package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Iterator;
import xsna.aex;

/* compiled from: InterestingStoriesBlockItem.kt */
/* loaded from: classes18.dex */
public final class eex {
    public static final aex.a a(StoriesContainer storiesContainer) {
        StoryEntry storyEntry;
        Photo photo;
        Iterator<StoryEntry> it = storiesContainer.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                storyEntry = null;
                break;
            }
            storyEntry = it.next();
            if (!storyEntry.h) {
                break;
            }
        }
        StoryEntry storyEntry2 = storyEntry;
        if (storyEntry2 == null) {
            storyEntry2 = (StoryEntry) j5g.a0(storiesContainer.g);
        }
        if (storyEntry2 != null && storyEntry2.Tb()) {
            return b(storyEntry2);
        }
        if (storyEntry2 == null || !storyEntry2.Sb() || (photo = storyEntry2.m) == null) {
            return null;
        }
        return new aex.a.C2538a(storyEntry2.c, storyEntry2, photo.y.Fb());
    }

    public static final aex.a.b b(StoryEntry storyEntry) {
        VideoFile videoFile = storyEntry.n;
        if (videoFile == null) {
            return null;
        }
        aex.a.b bVar = new aex.a.b(storyEntry.c, storyEntry, new VideoAttachment(videoFile));
        bVar.a = 0L;
        bVar.b = Long.valueOf(videoFile.getDuration() * 1000);
        return bVar;
    }
}
