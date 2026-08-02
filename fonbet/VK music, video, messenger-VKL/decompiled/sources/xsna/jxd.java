package xsna;

import com.vk.fave.di.FaveComponent;
import com.vk.media.pipeline.di.MediaPipelineComponent;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vk.profile.community.chats.api.di.CommunityChatsComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class jxd implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ jxd(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (MediaPipelineComponent) this.c.a(fpf0.a(MediaPipelineComponent.class));
            case 1:
                return (MediaPipelineComponent) this.c.a(fpf0.a(MediaPipelineComponent.class));
            case 2:
                return (CommunityChatsComponent) this.c.a(fpf0.a(CommunityChatsComponent.class));
            case 3:
                return (FaveComponent) this.c.mo408a(fpf0.a(FaveComponent.class));
            default:
                return ((NarrativeComponent) this.c.a(fpf0.a(NarrativeComponent.class))).V7();
        }
    }
}
