package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.video.kidsprofile.restricteduseractions.VideoRestrictedUserActionsComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class dba implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ dba(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (BridgeComponent) this.c.a(fpf0.a(BridgeComponent.class));
            case 1:
                return (VideoRestrictedUserActionsComponent) this.c.a(fpf0.a(VideoRestrictedUserActionsComponent.class));
            default:
                return (PhotosComponent) this.c.a(fpf0.a(PhotosComponent.class));
        }
    }
}
