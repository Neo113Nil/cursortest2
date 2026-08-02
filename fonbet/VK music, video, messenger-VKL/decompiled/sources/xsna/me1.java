package xsna;

import com.vk.clips.attachments.impl.publish.geolocation.presentation.a;
import com.vk.ecomm.cart.impl.checkout.feature.state.ActionField;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.OrderListAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import xsna.cd1;
import xsna.r2c;
import xsna.vmd;
import xsna.z7k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class me1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ me1(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(cd1.g.b);
                break;
            case 1:
                this.c.invoke(new r2c.n(ActionField.Type.DO_ORDER));
                break;
            case 2:
                this.c.invoke(z7k.k.b);
                break;
            case 3:
                this.c.invoke(com.vk.profile.design.compose.header.sink.f.a);
                break;
            case 4:
                this.c.invoke(a.f.b);
                break;
            case 5:
                this.c.invoke(OrderListAction.j.b);
                break;
            case 6:
                this.c.invoke(new PostingAction.Editing.PrivacySelectedPrivacyTypeChanged(PrivacyPostType.AllUsers.b));
                break;
            default:
                this.c.invoke(vmd.b.b);
                break;
        }
        return s3q0.a;
    }
}
