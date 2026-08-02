package xsna;

import com.vk.bridges.di.VoipBridgeComponent;
import com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class vef implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ vef(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (ClipsUploadVkComponent) this.c.a(fpf0.a(ClipsUploadVkComponent.class));
            default:
                return ((VoipBridgeComponent) this.c.a(fpf0.a(VoipBridgeComponent.class))).j1();
        }
    }
}
