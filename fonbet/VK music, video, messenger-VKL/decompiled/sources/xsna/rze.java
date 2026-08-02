package xsna;

import com.vk.clips.attachments.api.di.ClipsAttachmentsComponent;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class rze implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ rze(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (ClipsViewerComponent) this.c.a(fpf0.a(ClipsViewerComponent.class));
            case 1:
                return ((ClipsAttachmentsComponent) this.c.a(fpf0.a(ClipsAttachmentsComponent.class))).Hd();
            case 2:
                return ((SearchUiComponent) this.c.a(fpf0.a(SearchUiComponent.class))).Ga();
            default:
                return ((StoryViewerComponent) this.c.a(fpf0.a(StoryViewerComponent.class))).tb();
        }
    }
}
