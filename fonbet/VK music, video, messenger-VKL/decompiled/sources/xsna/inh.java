package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.ecomm.moderation.api.di.ModerationComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class inh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ inh(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((ModerationComponent) this.c.mo408a(fpf0.a(ModerationComponent.class))).pa();
            default:
                return (BridgeComponent) this.c.a(fpf0.a(BridgeComponent.class));
        }
    }
}
