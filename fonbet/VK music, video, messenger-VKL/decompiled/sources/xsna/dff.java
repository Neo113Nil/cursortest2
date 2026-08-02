package xsna;

import com.vk.clips.attachments.api.di.ClipsAttachmentsComponent;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.sharing.api.di.SharingComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class dff implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ dff(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((ClipsAttachmentsComponent) this.c.a(fpf0.a(ClipsAttachmentsComponent.class))).C8();
            case 1:
                return ((ClipsViewerComponent) this.c.a(fpf0.a(ClipsViewerComponent.class))).n6();
            case 2:
                return (SharingComponent) this.c.a(fpf0.a(SharingComponent.class));
            default:
                return (NewsFeedComponent) this.c.a(fpf0.a(NewsFeedComponent.class));
        }
    }
}
