package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.profile.community.subscription.api.di.CommunitySubscriptionComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ymh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ ymh(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((CommunitySubscriptionComponent) this.c.mo408a(fpf0.a(CommunitySubscriptionComponent.class))).E5();
            case 1:
                return ((BridgeComponent) this.c.a(fpf0.a(BridgeComponent.class))).cb();
            default:
                return (BridgeComponent) this.c.a(fpf0.a(BridgeComponent.class));
        }
    }
}
