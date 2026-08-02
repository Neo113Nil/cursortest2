package xsna;

import com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent;
import com.vk.libvideo.adfree.api.di.VideoAdFreeSubscriptionComponent;
import com.vk.queue.di.QueueSyncComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class i25 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ i25(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (QueueSyncComponent) this.c.a(fpf0.a(QueueSyncComponent.class));
            case 1:
                return (VideoAdFreeSubscriptionComponent) this.c.a(fpf0.a(VideoAdFreeSubscriptionComponent.class));
            case 2:
                return (ClipsUploadSdkUploaderComponent) this.c.a(fpf0.a(ClipsUploadSdkUploaderComponent.class));
            default:
                return (StoryViewerComponent) this.c.a(fpf0.a(StoryViewerComponent.class));
        }
    }
}
