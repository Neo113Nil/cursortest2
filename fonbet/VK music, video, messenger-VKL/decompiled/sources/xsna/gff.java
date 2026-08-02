package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.ecomm.storefrontservices.api.StorefrontServicesComponent;
import com.vk.photos.root.di.PhotosComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class gff implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ gff(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((ClipsPlaylistsComponent) this.c.mo408a(fpf0.a(ClipsPlaylistsComponent.class))).e();
            case 1:
                return ((StorefrontServicesComponent) this.c.a(fpf0.a(StorefrontServicesComponent.class))).a();
            case 2:
                return ((BridgeComponent) this.c.a(fpf0.a(BridgeComponent.class))).x().a();
            default:
                return (PhotosComponent) this.c.a(fpf0.a(PhotosComponent.class));
        }
    }
}
