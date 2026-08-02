package xsna;

import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.ecomm.catalog.api.di.ClassifiedsComponent;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class cba implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ cba(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (AppContextDiComponent) this.c.a(fpf0.a(AppContextDiComponent.class));
            case 1:
                return (InfoBridgeComponent) this.c.a(fpf0.a(InfoBridgeComponent.class));
            case 2:
                return (ClassifiedsComponent) this.c.a(fpf0.a(ClassifiedsComponent.class));
            default:
                return (VideoMinimizablePlayerComponent) this.c.a(fpf0.a(VideoMinimizablePlayerComponent.class));
        }
    }
}
