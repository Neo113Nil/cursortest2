package xsna;

import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.photos.root.di.PhotosComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class eff implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ eff(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (ClipEditComponent) this.c.a(fpf0.a(ClipEditComponent.class));
            case 1:
                return ((PhotosComponent) this.c.a(fpf0.a(PhotosComponent.class))).r4();
            case 2:
                return ((ClipsEntryPointsComponent) this.c.mo408a(fpf0.a(ClipsEntryPointsComponent.class))).e();
            case 3:
                return (NewsFeedComponent) this.c.a(fpf0.a(NewsFeedComponent.class));
            default:
                return ((ClipsViewerComponent) this.c.a(fpf0.a(ClipsViewerComponent.class))).n6();
        }
    }
}
