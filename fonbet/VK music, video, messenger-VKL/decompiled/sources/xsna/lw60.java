package xsna;

import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.video.ui.share.api.VideoShareComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class lw60 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ lw60(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (MarketComponent) this.c.a(fpf0.a(MarketComponent.class));
            default:
                return (VideoShareComponent) this.c.a(fpf0.a(VideoShareComponent.class));
        }
    }
}
