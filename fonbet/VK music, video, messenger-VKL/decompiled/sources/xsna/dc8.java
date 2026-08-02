package xsna;

import com.vk.im.sync.api.di.ImSynchronizationHelpersComponent;
import com.vk.music.podcast.api.di.PodcastComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class dc8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ dc8(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (ImSynchronizationHelpersComponent) this.c.a(fpf0.a(ImSynchronizationHelpersComponent.class));
            default:
                return (PodcastComponent) this.c.a(fpf0.a(PodcastComponent.class));
        }
    }
}
