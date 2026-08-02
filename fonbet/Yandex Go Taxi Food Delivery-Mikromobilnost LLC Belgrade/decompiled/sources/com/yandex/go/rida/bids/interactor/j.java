package com.yandex.go.rida.bids.interactor;

import com.yandex.go.rida.bids.controller.BidsControllerAction;
import com.yandex.go.taxi.order.models.api.cancel.OrderCancelNotification;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.a3v;
import defpackage.ewz0;
import defpackage.ir5;
import defpackage.jl40;
import defpackage.lr5;
import defpackage.mej;
import defpackage.mp5;
import defpackage.mr5;
import defpackage.np5;
import defpackage.nr5;
import defpackage.or5;
import defpackage.pp5;
import defpackage.pr5;
import defpackage.qr5;
import defpackage.rr5;
import defpackage.sr5;
import defpackage.tr5;
import defpackage.ur5;
import defpackage.vr5;
import defpackage.w511;
import defpackage.wr5;
import defpackage.xh60;
import defpackage.xq5;
import defpackage.xr5;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.Orientation;

/* loaded from: classes13.dex */
public final class j {
    public static final Object j = new Object();
    public static final Object k = new Object();
    public final pp5 a;
    public final a3v b;
    public final xr5 c;
    public final a d;
    public final u e;
    public final np5 f;
    public final n g;
    public final b h;
    public final ir5 i;

    public j(pp5 pp5Var, a3v a3vVar, xr5 xr5Var, a aVar, u uVar, np5 np5Var, n nVar, b bVar, ir5 ir5Var) {
        this.a = pp5Var;
        this.b = a3vVar;
        this.c = xr5Var;
        this.d = aVar;
        this.e = uVar;
        this.f = np5Var;
        this.g = nVar;
        this.h = bVar;
        this.i = ir5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ur5 ur5Var, xq5 xq5Var, Continuation continuation) {
        Object value;
        int i;
        OrderStatusInfo.RidaSearchInfo.IncreasePriceInfo increasePriceInfo;
        OrderStatusInfo.RidaSearchInfo.IncreasePriceInfo.Modal modal;
        String str;
        String str2;
        String str3;
        OrderCancelNotification.Buttons buttons;
        List<OrderCancelNotification.Button> list;
        if (!jl40.l(ur5Var, lr5.b)) {
            if (ur5Var instanceof nr5) {
                return this.h.a(((nr5) ur5Var).a, (ContinuationImpl) continuation);
            }
            if (jl40.l(ur5Var, lr5.e)) {
                np5 np5Var = this.f;
                xh60 b = np5Var.b.b().V().P.b("order_cancel_notification");
                OrderCancelNotification orderCancelNotification = b != null ? (OrderCancelNotification) b.b : null;
                if (orderCancelNotification != null && (buttons = orderCancelNotification.g) != null) {
                    if (buttons.a != Orientation.HORIZONTAL) {
                        buttons = null;
                    }
                    if (buttons != null && (list = buttons.b) != null) {
                        str = null;
                        str2 = null;
                        for (OrderCancelNotification.Button button : list) {
                            com.yandex.go.taxi.order.models.api.cancel.n nVar = button.f;
                            if (jl40.l(nVar, com.yandex.go.taxi.order.models.api.cancel.h.INSTANCE)) {
                                str = button.a;
                            } else if (jl40.l(nVar, com.yandex.go.taxi.order.models.api.cancel.a.INSTANCE)) {
                                str2 = button.a;
                            }
                        }
                        if (orderCancelNotification != null || (str3 = orderCancelNotification.d) == null) {
                            int i2 = mp5.a[np5Var.b.b().h.b.ordinal()];
                            str3 = (i2 != 1 || i2 == 2) ? (String) np5Var.g.getValue() : i2 != 3 ? (String) np5Var.i.getValue() : (String) np5Var.h.getValue();
                        }
                        String str4 = orderCancelNotification == null ? orderCancelNotification.e : null;
                        if (str == null) {
                            str = (String) np5Var.e.getValue();
                        }
                        if (str2 == null) {
                            str2 = (String) np5Var.f.getValue();
                        }
                        ((com.yandex.go.rida.bids.router.d) xq5Var).b(new mej(str3, str4, str, str2), new BidsCancelOrderInteractor$onCancelOrderClick$3(1, null), new BidsCancelOrderInteractor$onCancelOrderClick$4(np5Var, xq5Var, null));
                    }
                }
                str = null;
                str2 = null;
                if (orderCancelNotification != null) {
                }
                int i22 = mp5.a[np5Var.b.b().h.b.ordinal()];
                if (i22 != 1) {
                }
                if (orderCancelNotification == null) {
                }
                if (str == null) {
                }
                if (str2 == null) {
                }
                ((com.yandex.go.rida.bids.router.d) xq5Var).b(new mej(str3, str4, str, str2), new BidsCancelOrderInteractor$onCancelOrderClick$3(1, null), new BidsCancelOrderInteractor$onCancelOrderClick$4(np5Var, xq5Var, null));
            } else {
                if (jl40.l(ur5Var, lr5.d)) {
                    return this.c.a.emit(vr5.a, (SuspendLambda) continuation);
                }
                if (jl40.l(ur5Var, lr5.c)) {
                    return this.c.a.emit(wr5.a, (SuspendLambda) continuation);
                }
                if (jl40.l(ur5Var, lr5.a)) {
                    n nVar2 = this.g;
                    OrderStatusInfo.RidaSearchInfo ridaSearchInfo = nVar2.b.b().V().u0;
                    if (ridaSearchInfo != null && (increasePriceInfo = ridaSearchInfo.f) != null && (modal = increasePriceInfo.d) != null) {
                        ((com.yandex.go.rida.bids.router.d) xq5Var).b(new mej(modal.a, modal.b, modal.d, modal.c), new BoostButtonClickInteractor$onBoostButtonClick$1(1, null), new BoostButtonClickInteractor$onBoostButtonClick$2(nVar2, null));
                    }
                } else if (ur5Var instanceof mr5) {
                    ir5 ir5Var = this.i;
                    int i3 = ((mr5) ur5Var).a;
                    r0 r0Var = ir5Var.a;
                    do {
                        value = r0Var.getValue();
                        ewz0 ewz0Var = (ewz0) value;
                        i = ewz0Var.a;
                        ewz0Var.getClass();
                    } while (!r0Var.k(value, new ewz0(i, i3)));
                } else if (ur5Var instanceof rr5) {
                    this.a.b(((rr5) ur5Var).a, BidsControllerAction.OnTimerExpired);
                } else {
                    if (ur5Var instanceof or5) {
                        return this.d.a(((or5) ur5Var).a, xq5Var, (ContinuationImpl) continuation);
                    }
                    if (ur5Var instanceof qr5) {
                        return this.e.a(((qr5) ur5Var).a, (ContinuationImpl) continuation);
                    }
                    if (ur5Var instanceof pr5) {
                        this.a.b(((pr5) ur5Var).a, BidsControllerAction.OnItemRemovedFromUi);
                    } else if (ur5Var instanceof sr5) {
                        this.b.Td(((sr5) ur5Var).a, j);
                    } else {
                        if (!(ur5Var instanceof tr5)) {
                            w511.b();
                            return null;
                        }
                        this.b.F8(((tr5) ur5Var).a, 0, k);
                    }
                }
            }
        }
        return zy11.a;
    }
}
