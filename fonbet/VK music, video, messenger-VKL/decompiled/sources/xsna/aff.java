package xsna;

import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent;
import com.vk.ecomm.checklist.api.di.MarketChecklistComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class aff implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ aff(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((InfoBridgeComponent) this.c.a(fpf0.a(InfoBridgeComponent.class))).t().b();
            case 1:
                return ((MarketChecklistComponent) this.c.mo408a(fpf0.a(MarketChecklistComponent.class))).I6();
            default:
                return ((ClipsUploadVkComponent) this.c.a(fpf0.a(ClipsUploadVkComponent.class))).Uc();
        }
    }
}
