package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.community.strikes.api.di.CommunityStrikesComponent;
import com.vk.profile.community.subscription.api.di.CommunitySubscriptionComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class uef implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ uef(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((BridgeComponent) this.c.a(fpf0.a(BridgeComponent.class))).O();
            case 1:
                return ((CommunitySubscriptionComponent) this.c.mo408a(fpf0.a(CommunitySubscriptionComponent.class))).a();
            default:
                return ((CommunityStrikesComponent) this.c.a(fpf0.a(CommunityStrikesComponent.class))).ge();
        }
    }
}
