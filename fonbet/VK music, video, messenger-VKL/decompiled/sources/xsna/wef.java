package xsna;

import com.vk.ads.easypromote.api.di.EasyPromoteComponent;
import com.vk.bridges.di.BridgeComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class wef implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ wef(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((EasyPromoteComponent) this.c.mo408a(fpf0.a(EasyPromoteComponent.class))).X();
            default:
                return ((BridgeComponent) this.c.a(fpf0.a(BridgeComponent.class))).ob();
        }
    }
}
