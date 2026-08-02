package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.media.playback.di.MediaPlaybackComponent;
import com.vk.profile.community.api.component.CommunityComponent;
import com.vk.story.api.di.StoriesComponent;
import com.vk.topics.api.di.TopicsComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class c53 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ c53(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((BridgeComponent) this.c.a(fpf0.a(BridgeComponent.class))).H2();
            case 1:
                return (MediaPlaybackComponent) this.c.mo408a(fpf0.a(MediaPlaybackComponent.class));
            case 2:
                return ((TopicsComponent) this.c.a(fpf0.a(TopicsComponent.class))).n8();
            case 3:
                return (CommunityComponent) this.c.a(fpf0.a(CommunityComponent.class));
            default:
                return (StoriesComponent) this.c.a(fpf0.a(StoriesComponent.class));
        }
    }
}
