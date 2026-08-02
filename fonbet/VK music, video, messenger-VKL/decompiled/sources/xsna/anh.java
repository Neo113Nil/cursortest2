package xsna;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.narratives.api.di.NarrativeComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class anh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ anh(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((NarrativeComponent) this.c.a(fpf0.a(NarrativeComponent.class))).V7();
            case 1:
                return (ReviewsComponent) this.c.a(fpf0.a(ReviewsComponent.class));
            default:
                return ((AuthBridgeComponent) this.c.a(fpf0.a(AuthBridgeComponent.class))).s();
        }
    }
}
