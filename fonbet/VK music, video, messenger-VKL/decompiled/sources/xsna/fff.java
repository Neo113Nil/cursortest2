package xsna;

import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.profile.community.newsfeed.api.di.CommunityNewsfeedComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.topics.api.di.TopicsComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class fff implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ fff(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((ClipsConfigAuthorsComponent) this.c.a(fpf0.a(ClipsConfigAuthorsComponent.class))).getExperiments();
            case 1:
                return ((TopicsComponent) this.c.a(fpf0.a(TopicsComponent.class))).n8();
            case 2:
                return ((StoryViewerComponent) this.c.a(fpf0.a(StoryViewerComponent.class))).l9();
            default:
                return ((CommunityNewsfeedComponent) this.c.mo408a(fpf0.a(CommunityNewsfeedComponent.class))).ba();
        }
    }
}
