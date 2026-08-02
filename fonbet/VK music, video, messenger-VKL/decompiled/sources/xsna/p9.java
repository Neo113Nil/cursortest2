package xsna;

import android.net.Uri;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.OrderListAction;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.OrdersListItem;
import com.vk.libvideo.bottomsheet.about.delegate.x;
import com.vk.profile.community.impl.ui.trust_mark.CommunityTrustMarksArgs;
import xsna.gnd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class p9 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p9(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                x.b bVar = (x.b) this.c;
                String str = (String) this.d;
                Uri uri = (Uri) obj;
                if (((Throwable) obj2) == null) {
                    bVar.x.load(uri.toString());
                    break;
                } else {
                    bVar.x.load(str);
                    break;
                }
            case 1:
                ((by8) this.c).c((cy8) this.d, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                break;
            case 2:
                ((Integer) obj2).getClass();
                com.vk.profile.community.impl.ui.trust_mark.e.c((CommunityTrustMarksArgs) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 3:
                izs izsVar = (izs) this.c;
                wh50 wh50Var = (wh50) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1215566652, intValue, -1, "com.vk.ecomm.cart.impl.courier_map.ui.compose.CourierMapScreen.<anonymous>.<anonymous> (CourierMapScreen.kt:83)");
                    }
                    bt0.e((it0) wh50Var.getValue(), izsVar, null, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                de00.b((gnd.a.b) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((lo50) this.c).g((znj) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                df80.a((hh80) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 7:
                String str2 = (String) obj;
                ((izs) this.d).invoke(str2 != null ? new OrderListAction.ClickSpan(str2, obj2) : new OrderListAction.d(((OrdersListItem.Order) this.c).b));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((hkg0) this.c).a((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((nwm0) this.c).e((mtk0) this.d, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ p9(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
