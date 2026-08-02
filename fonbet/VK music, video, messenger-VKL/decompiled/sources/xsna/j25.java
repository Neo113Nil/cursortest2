package xsna;

import com.vk.di.component.app.AppContextDiComponent;
import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.pushes.PushComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class j25 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ j25(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (PushComponent) this.c.a(fpf0.a(PushComponent.class));
            case 1:
                return (AppContextDiComponent) this.c.a(fpf0.a(AppContextDiComponent.class));
            default:
                return (ReviewsComponent) this.c.a(fpf0.a(ReviewsComponent.class));
        }
    }
}
