package xsna;

import com.vk.ecomm.orders.impl.order.presentation.mvi.OrderAction;
import com.vk.profile.community.impl.ui.events.a;
import com.vk.video.ui.discovery.minimizable.recycler.similar.SimilarVideoAction;
import xsna.d78;
import xsna.sjl0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class v78 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ v78(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(d78.b.b);
                break;
            case 1:
                this.c.invoke(a.C1564a.b);
                break;
            case 2:
                this.c.invoke(SimilarVideoAction.OpenVideo);
                break;
            case 3:
                this.c.invoke(OrderAction.d.b);
                break;
            case 4:
                this.c.invoke(rxe.a);
                break;
            default:
                this.c.invoke(sjl0.a.d.b);
                break;
        }
        return s3q0.a;
    }
}
