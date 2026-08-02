package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkComponent;
import com.vk.profile.community.address.api.di.CommunityAddressComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class g7f implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ g7f(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (ClipsUploadUiVkComponent) this.c.mo408a(fpf0.a(ClipsUploadUiVkComponent.class));
            case 1:
                return ((BridgeComponent) this.c.a(fpf0.a(BridgeComponent.class))).s();
            case 2:
                return ((CommunityAddressComponent) this.c.a(fpf0.a(CommunityAddressComponent.class))).a();
            default:
                return (ClipsEntryPointsComponent) this.c.mo408a(fpf0.a(ClipsEntryPointsComponent.class));
        }
    }
}
