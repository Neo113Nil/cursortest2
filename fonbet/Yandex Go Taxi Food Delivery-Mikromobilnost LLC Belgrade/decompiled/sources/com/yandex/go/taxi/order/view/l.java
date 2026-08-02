package com.yandex.go.taxi.order.view;

import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.multi.TaxiOrderPresentationType;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.a3y0;
import defpackage.bvf0;
import defpackage.ffx;
import defpackage.hc00;
import defpackage.ic00;
import defpackage.jc00;
import defpackage.jqr;
import defpackage.kc00;
import defpackage.mhf;
import defpackage.mw40;
import defpackage.my30;
import defpackage.ny61;
import defpackage.op70;
import defpackage.pzt0;
import defpackage.qa80;
import defpackage.ra80;
import defpackage.sa80;
import defpackage.sdc;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.u4y0;
import defpackage.ur70;
import defpackage.vng;
import defpackage.wl40;
import defpackage.y4k0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.appdelegates.SupportedOrderType;

/* loaded from: classes14.dex */
public final class l {
    public final tse a;
    public final com.yandex.go.superapp.order.multi.old.provider.g b;
    public final mhf c;
    public final com.yandex.go.taxi.order.multi.feed.domain.a d;
    public final jc00 e;
    public final mw40 f;
    public final sa80 g;
    public final y4k0 h;
    public final a3y0 i = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "OrderViewStateRepository");
    public final r0 j;
    public final n0 k;
    public pzt0 l;

    public l(tse tseVar, com.yandex.go.superapp.order.multi.old.provider.g gVar, mhf mhfVar, com.yandex.go.taxi.order.multi.feed.domain.a aVar, jc00 jc00Var, mw40 mw40Var, sa80 sa80Var, y4k0 y4k0Var) {
        ra80 ra80Var;
        this.a = tseVar;
        this.b = gVar;
        this.c = mhfVar;
        this.d = aVar;
        this.e = jc00Var;
        this.f = mw40Var;
        this.g = sa80Var;
        this.h = y4k0Var;
        u4y0 a = aVar.a();
        qa80 qa80Var = null;
        String str = a != null ? a.a : null;
        ra80 ra80Var2 = (ra80) sa80Var.a.get(str);
        if (ra80Var2 == null || ra80Var2.a == OrderScreen.DELEGATE_TO_NAV_COMMAND) {
            String str2 = a != null ? a.b : null;
            boolean z = a != null && a.c;
            boolean z2 = a != null && a.d;
            TaxiOrderPresentationType c = aVar.c(a);
            if (mw40Var.b != null) {
                ra80Var = new ra80(OrderScreen.DELEGATE_TO_NAV_COMMAND, qa80Var, 14);
            } else {
                int i = 10;
                if (c.a()) {
                    ra80Var = new ra80(OrderScreen.ORDER_TRACKING, new qa80(z, z2, str, str2), i);
                } else if (f()) {
                    ra80Var = new ra80(OrderScreen.ORDER_LIST, new qa80(z, z2, str, str2), i);
                } else {
                    gVar.getClass();
                    SupportedOrderType supportedOrderType = SupportedOrderType.TAXI;
                    ra80Var = gVar.b.r() ? new ra80(OrderScreen.ORDER_DETAILS, 6, new qa80(z, z2, str, str2), DetailsOpenReason.SINGLE_ORDER) : new ra80(OrderScreen.ORDER_LIST, new qa80(z, z2, str, str2), i);
                }
            }
            ra80Var2 = ra80Var;
            sa80Var.a.put(str, ra80Var2);
        }
        this.j = bvf0.c(ra80Var2);
        this.k = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Enum a(l lVar, List list, ContinuationImpl continuationImpl) {
        OrderViewStateRepository$toOrderScreen$1 orderViewStateRepository$toOrderScreen$1;
        Object obj;
        int i;
        lVar.getClass();
        if (continuationImpl instanceof OrderViewStateRepository$toOrderScreen$1) {
            orderViewStateRepository$toOrderScreen$1 = (OrderViewStateRepository$toOrderScreen$1) continuationImpl;
            int i2 = orderViewStateRepository$toOrderScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderViewStateRepository$toOrderScreen$1.label = i2 - Integer.MIN_VALUE;
                obj = orderViewStateRepository$toOrderScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderViewStateRepository$toOrderScreen$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    orderViewStateRepository$toOrderScreen$1.L$0 = list;
                    orderViewStateRepository$toOrderScreen$1.label = 1;
                    obj = lVar.d(list, orderViewStateRepository$toOrderScreen$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) orderViewStateRepository$toOrderScreen$1.L$0;
                    kotlin.b.b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return OrderScreen.ORDER_TRACKING;
                }
                r0 r0Var = lVar.j;
                OrderScreen orderScreen = ((ra80) r0Var.getValue()).a;
                OrderScreen orderScreen2 = OrderScreen.ORDER_LIST;
                boolean z = orderScreen == orderScreen2;
                boolean z2 = ((ra80) r0Var.getValue()).a == OrderScreen.BUNDLED_ORDER_DETAILS;
                boolean c = lVar.c(list);
                boolean z3 = lVar.b.a().j() > 1;
                if (!z2 && !z && !c && z3) {
                    ic00 ic00Var = ((kc00) lVar.e).a;
                    ic00Var.getClass();
                    if (!(ic00Var instanceof hc00)) {
                        return orderScreen2;
                    }
                }
                return null;
            }
        }
        orderViewStateRepository$toOrderScreen$1 = new OrderViewStateRepository$toOrderScreen$1(lVar, continuationImpl);
        obj = orderViewStateRepository$toOrderScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderViewStateRepository$toOrderScreen$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public final OrderScreen b() {
        return ((ra80) this.j.getValue()).a;
    }

    public final boolean c(List list) {
        String str;
        ra80 ra80Var = (ra80) this.j.getValue();
        OrderScreen orderScreen = ra80Var.a;
        qa80 qa80Var = ra80Var.c;
        if (orderScreen == OrderScreen.ORDER_DETAILS && (str = qa80Var.a) != null && str.length() != 0 && list.size() == 2) {
            String str2 = qa80Var.a;
            List list2 = ((wl40) list.get(0)).a;
            List list3 = ((wl40) list.get(1)).a;
            boolean anyMatch = list2.stream().anyMatch(new sdc(17, new my30(str2, 12)));
            if (list3.stream().anyMatch(new sdc(18, new my30(str2, 13))) && !anyMatch) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(List list, ContinuationImpl continuationImpl) {
        OrderViewStateRepository$isOrderTrackingStateNeeded$1 orderViewStateRepository$isOrderTrackingStateNeeded$1;
        int i;
        boolean z;
        int i2;
        Object obj;
        boolean z2;
        List list2;
        Iterator it;
        boolean z3;
        if (continuationImpl instanceof OrderViewStateRepository$isOrderTrackingStateNeeded$1) {
            orderViewStateRepository$isOrderTrackingStateNeeded$1 = (OrderViewStateRepository$isOrderTrackingStateNeeded$1) continuationImpl;
            int i3 = orderViewStateRepository$isOrderTrackingStateNeeded$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                orderViewStateRepository$isOrderTrackingStateNeeded$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = orderViewStateRepository$isOrderTrackingStateNeeded$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderViewStateRepository$isOrderTrackingStateNeeded$1.label;
                z = false;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    i2 = ((ra80) this.j.getValue()).a == OrderScreen.ORDER_TRACKING ? 1 : 0;
                    boolean c = c(list);
                    orderViewStateRepository$isOrderTrackingStateNeeded$1.L$0 = list;
                    orderViewStateRepository$isOrderTrackingStateNeeded$1.I$0 = i2;
                    orderViewStateRepository$isOrderTrackingStateNeeded$1.Z$0 = c;
                    orderViewStateRepository$isOrderTrackingStateNeeded$1.label = 1;
                    Enum b = this.d.b(orderViewStateRepository$isOrderTrackingStateNeeded$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = b;
                    z2 = c;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = orderViewStateRepository$isOrderTrackingStateNeeded$1.Z$0;
                    int i4 = orderViewStateRepository$isOrderTrackingStateNeeded$1.I$0;
                    List list3 = (List) orderViewStateRepository$isOrderTrackingStateNeeded$1.L$0;
                    kotlin.b.b(obj2);
                    i2 = i4;
                    list = list3;
                    obj = obj2;
                }
                TaxiOrderPresentationType taxiOrderPresentationType = (TaxiOrderPresentationType) obj;
                list2 = list;
                if ((list2 instanceof Collection) || !list2.isEmpty()) {
                    it = list2.iterator();
                    while (it.hasNext()) {
                        if (((wl40) it.next()).a.stream().anyMatch(new sdc(19, new ur70(18)))) {
                            z3 = true;
                            break;
                        }
                    }
                }
                z3 = false;
                if (i2 == 0 && !z2 && taxiOrderPresentationType.a() && !z3) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        orderViewStateRepository$isOrderTrackingStateNeeded$1 = new OrderViewStateRepository$isOrderTrackingStateNeeded$1(this, continuationImpl);
        Object obj22 = orderViewStateRepository$isOrderTrackingStateNeeded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderViewStateRepository$isOrderTrackingStateNeeded$1.label;
        z = false;
        if (i != 0) {
        }
        TaxiOrderPresentationType taxiOrderPresentationType2 = (TaxiOrderPresentationType) obj;
        list2 = list;
        if (list2 instanceof Collection) {
        }
        it = list2.iterator();
        while (it.hasNext()) {
        }
        z3 = false;
        if (i2 == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final void e() {
        pzt0 pzt0Var = this.l;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.l = tje.N(this.a, null, null, new OrderViewStateRepository$onResume$$inlined$safeCollectIn$1(new g(new jqr(new e0(new o(vng.l(this.b.h(), OrderViewStateRepository$onResume$1.b, vng.c), new OrderViewStateRepository$onResume$2(this, null))), new OrderViewStateRepository$onResume$3(2, null), 3), this), null, this), 3);
    }

    public final boolean f() {
        this.h.getClass();
        com.yandex.go.superapp.order.multi.old.provider.g gVar = this.b;
        if (gVar.e()) {
            if (!com.yandex.go.superapp.order.multi.old.provider.g.g(gVar.a()) && gVar.a().j() <= 1) {
                return false;
            }
            ic00 ic00Var = ((kc00) this.e).a;
            ic00Var.getClass();
            if (ic00Var instanceof hc00) {
                return false;
            }
        }
        return true;
    }

    public final tpr g(op70 op70Var, op70 op70Var2) {
        return kotlinx.coroutines.flow.e.t(new k(new jqr(this.j, new OrderViewStateRepository$refreshMapOverlayFlow$1(op70Var, this, op70Var2, null), 3)));
    }

    public final void h(OrderScreen orderScreen, boolean z, qa80 qa80Var, DetailsOpenReason detailsOpenReason, Object obj) {
        if (orderScreen != OrderScreen.ORDER_LIST || f()) {
            TaxiOrderPresentationType c = this.d.c(qa80Var == null ? null : new u4y0(qa80Var.c, qa80Var.d, qa80Var.a, qa80Var.b));
            if (orderScreen != OrderScreen.ORDER_TRACKING || c.a()) {
                OrderScreen b = b();
                int i = z ? 3 : 6;
                if (qa80Var == null) {
                    qa80Var = new qa80(0);
                }
                ra80 ra80Var = new ra80(orderScreen, i, qa80Var, detailsOpenReason);
                ra80Var.e = obj;
                this.g.a.put(qa80Var.a, ra80Var);
                r0 r0Var = this.j;
                r0Var.getClass();
                r0Var.m(null, ra80Var);
                if (b != orderScreen) {
                    this.c.c();
                }
            }
        }
    }
}
