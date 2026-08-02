package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkComponent;
import com.vk.profile.community.subscription.api.di.CommunitySubscriptionComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class tef implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ tef(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((ClipsUploadUiVkComponent) this.c.mo408a(fpf0.a(ClipsUploadUiVkComponent.class))).V0();
            case 1:
                return ((CommunitySubscriptionComponent) this.c.mo408a(fpf0.a(CommunitySubscriptionComponent.class))).c7();
            default:
                return ((BridgeComponent) this.c.a(fpf0.a(BridgeComponent.class))).F();
        }
    }
}
