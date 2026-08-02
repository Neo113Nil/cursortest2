package xsna;

import com.vk.ecomm.orders.api.di.MarketOrdersComponent;
import com.vk.im.engine.lifecycle.di.ImEngineLifecycleComponent;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class k25 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ k25(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (ImEngineLifecycleComponent) this.c.a(fpf0.a(ImEngineLifecycleComponent.class));
            case 1:
                return (VideoBottomSheetComponent) this.c.a(fpf0.a(VideoBottomSheetComponent.class));
            default:
                return (MarketOrdersComponent) this.c.a(fpf0.a(MarketOrdersComponent.class));
        }
    }
}
