package xsna;

import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.bridges.di.AuthBridgeComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ub60 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ ub60(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (AudienceResearchComponent) this.c.a(fpf0.a(AudienceResearchComponent.class));
            default:
                return ((AuthBridgeComponent) this.c.a(fpf0.a(AuthBridgeComponent.class))).s();
        }
    }
}
