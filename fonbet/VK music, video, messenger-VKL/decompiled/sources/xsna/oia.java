package xsna;

import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.libvideo.api.di.VideoApiHelperComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class oia implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ oia(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (VideoApiHelperComponent) this.c.a(fpf0.a(VideoApiHelperComponent.class));
            default:
                return (MarketComponent) this.c.a(fpf0.a(MarketComponent.class));
        }
    }
}
