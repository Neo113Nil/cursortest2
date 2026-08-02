package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.ecomm.configureitemlist.api.di.ConfigureItemListComponent;
import com.vk.media.playback.di.MediaPlaybackComponent;
import com.vk.sharing.api.di.SharingComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class nze implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ nze(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (MediaPlaybackComponent) this.c.mo408a(fpf0.a(MediaPlaybackComponent.class));
            case 1:
                return ((ConfigureItemListComponent) this.c.mo408a(fpf0.a(ConfigureItemListComponent.class))).a();
            case 2:
                return ((SharingComponent) this.c.a(fpf0.a(SharingComponent.class))).F2();
            default:
                return ((BridgeComponent) this.c.a(fpf0.a(BridgeComponent.class))).p().e();
        }
    }
}
