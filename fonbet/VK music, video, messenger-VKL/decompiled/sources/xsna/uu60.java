package xsna;

import com.vk.dto.market.order.OrderPaymentParameters;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.c;
import com.vk.friends.discover.UsersDiscoverPresenter;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.voip.ui.broadcast.fragments.info.StreamInfoFragment;
import xsna.kkl0;
import xsna.mha0;
import xsna.qr60;
import xsna.xjl0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class uu60 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uu60(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((wlw) obj2).invoke(obj);
                break;
            case 1:
                ((qv60) obj2).getClass();
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                break;
            case 2:
                ((lp80) obj2).invoke(obj);
                break;
            case 3:
                ((eqq) obj2).invoke(obj);
                break;
            case 4:
                ((com.vk.ecomm.orders.impl.orderlist.presentation.mvi.h) obj2).c(new c.h((OrderPaymentParameters) obj));
                break;
            case 5:
                ((mha0.b) obj2).invoke(obj);
                break;
            case 6:
                ((wlw) obj2).invoke(obj);
                break;
            case 7:
                ((ab6) obj2).invoke(obj);
                break;
            case 8:
                ((i0b0) obj2).invoke(obj);
                break;
            case 9:
                ((i0b0) obj2).invoke(obj);
                break;
            case 10:
                ((isc0) obj2).e(new ksc0(new qr60.a.e(ListLoadingState.ERROR)));
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                break;
            case 11:
                ((d0k) obj2).invoke(obj);
                break;
            case 12:
                ((ym1) obj2).invoke(obj);
                break;
            case 13:
                ((b7) obj2).invoke(obj);
                break;
            case 14:
                ((b7) obj2).invoke(obj);
                break;
            case 15:
                ((i0b0) obj2).invoke(obj);
                break;
            case 16:
                ((vx3) obj2).invoke(obj);
                break;
            case 17:
                ((b7) obj2).invoke(obj);
                break;
            case 18:
                ((b7) obj2).invoke(obj);
                break;
            case 19:
                ((ab6) obj2).invoke(obj);
                break;
            case 20:
                gpl0 gpl0Var = (gpl0) obj2;
                gpl0Var.e(kkl0.c.a);
                gpl0Var.c(new xjl0.a((Throwable) obj));
                break;
            case 21:
                ((r2m0) obj2).invoke(obj);
                break;
            case 22:
                int i2 = StreamInfoFragment.S;
                ((i0b0) obj2).invoke(obj);
                break;
            case 23:
                ((i0b0) obj2).invoke(obj);
                break;
            case 24:
                ((i0b0) obj2).invoke(obj);
                break;
            case 25:
                ((g2h0) obj2).invoke(obj);
                break;
            case 26:
                ((h57) obj2).invoke(obj);
                break;
            case 27:
                ((i0b0) obj2).invoke(obj);
                break;
            case 28:
                ((UsersDiscoverPresenter.b) obj2).invoke(obj);
                break;
            default:
                ((sdh) obj2).invoke(obj);
                break;
        }
    }
}
