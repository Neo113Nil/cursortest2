package xsna;

import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.photos.root.di.PhotosComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class h7f implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ h7f(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((ClipsConfigAuthorsComponent) this.c.a(fpf0.a(ClipsConfigAuthorsComponent.class))).getExperiments();
            case 1:
                return (ClipsUploadSdkUploaderComponent) this.c.a(fpf0.a(ClipsUploadSdkUploaderComponent.class));
            case 2:
                return ((PhotosComponent) this.c.a(fpf0.a(PhotosComponent.class))).r4();
            default:
                return ((ModerationComponent) this.c.mo408a(fpf0.a(ModerationComponent.class))).pa();
        }
    }
}
