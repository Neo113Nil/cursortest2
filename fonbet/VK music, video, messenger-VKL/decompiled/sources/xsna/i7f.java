package xsna;

import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.clips.blacklists.api.di.ClipsBlacklistsComponent;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.photos.root.di.PhotosComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class i7f implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ i7f(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (ClipsBlacklistsComponent) this.c.a(fpf0.a(ClipsBlacklistsComponent.class));
            case 1:
                return ((CameraClipsComponent) this.c.a(fpf0.a(CameraClipsComponent.class))).p9();
            case 2:
                return ((PhotosComponent) this.c.a(fpf0.a(PhotosComponent.class))).p7();
            default:
                return (MarketComponent) this.c.a(fpf0.a(MarketComponent.class));
        }
    }
}
