package xsna;

import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.OrdersListItem;
import com.vk.newsfeed.posting.impl.presentation.model.ui.PrivacyViewState;
import xsna.dt1;
import xsna.it0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class hj implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hj(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((jj) this.d).d((String) this.e, (frv0) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                o00 o00Var = (o00) this.d;
                lg90 lg90Var = (lg90) this.e;
                q630 q630Var = (q630) this.f;
                ((Integer) obj2).getClass();
                o00Var.b(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, q630Var, lg90Var);
                break;
            case 2:
                ((Integer) obj2).getClass();
                bt0.f((it0.a) this.d, (izs) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                i0n.b((r970) this.d, (izs) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                ((kgq) this.d).c((q630) this.e, (Cell$Middle.Size) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                bf30.a((se30) this.d, (izs) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                cw80.d((OrdersListItem.Order) this.d, (izs) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ced0.a((PrivacyViewState) this.d, (izs) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((e6p0) this.d).h((dt1) this.e, (dt1.b) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }
}
