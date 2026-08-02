package xsna;

import com.vk.dto.stories.model.DiscoverStoriesContainer;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.viewer.api.StoryViewerRouter;
import java.util.Collections;

/* compiled from: StoriesDiscoverHandler.kt */
/* loaded from: classes7.dex */
public final class url0 implements fhd0, lao0 {
    public final StoryViewerRouter a;

    public url0(StoryViewerRouter storyViewerRouter) {
        this.a = storyViewerRouter;
    }

    @Override // xsna.g9l
    public final void a(fgx fgxVar) {
        StoryViewerRouter.d(this.a, fgxVar.e, Collections.singletonList(new DiscoverStoriesContainer("", "", false, null, 12, null)), null, MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER_LINK, null, null, null, null, null, 4084);
        blk.P(fgxVar).onSuccess();
    }
}
