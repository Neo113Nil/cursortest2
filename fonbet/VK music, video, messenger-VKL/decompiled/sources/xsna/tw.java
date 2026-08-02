package xsna;

import com.vk.ecomm.orders.impl.order.presentation.mvi.OrderAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$Navigation$Picker$OpenPostponeDatePicker;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import xsna.cd1;
import xsna.lze;
import xsna.nw;
import xsna.r2c;
import xsna.t6j0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class tw implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ tw(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(nw.a.b);
                break;
            case 1:
                this.c.invoke(cd1.a.b);
                break;
            case 2:
                this.c.invoke(PostingAction$Navigation$Picker$OpenPostponeDatePicker.b);
                break;
            case 3:
                this.c.invoke(r2c.s.c.b);
                break;
            case 4:
                this.c.invoke(CommunityProfileAction.n.a.b.b);
                break;
            case 5:
                this.c.invoke(OrderAction.g.b);
                break;
            case 6:
                this.c.invoke(lze.j.b);
                break;
            case 7:
                this.c.invoke(t6j0.a.b);
                break;
            default:
                this.c.invoke(Boolean.FALSE);
                break;
        }
        return s3q0.a;
    }
}
