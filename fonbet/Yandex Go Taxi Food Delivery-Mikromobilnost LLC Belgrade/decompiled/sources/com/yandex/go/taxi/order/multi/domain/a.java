package com.yandex.go.taxi.order.multi.domain;

import com.yandex.go.taxi.order.api.multi.TaxiOrderPresentationType;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderHolder$liveUpdates$$inlined$flatMapLatest$1;
import defpackage.gci0;
import defpackage.h3y;
import defpackage.js70;
import defpackage.ks70;
import defpackage.ls70;
import defpackage.ms70;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.os70;
import defpackage.p2y0;
import defpackage.ws70;
import defpackage.xs70;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.orders.g;

/* loaded from: classes8.dex */
public final class a {
    public final com.yandex.go.taxi.order.cache.data.a a;
    public final h3y b;
    public final os70 c;
    public final com.yandex.go.taxi.order.multi.feed.domain.a d;
    public final g e;
    public final ru.yandex.taxi.am.g f;

    public a(com.yandex.go.taxi.order.cache.data.a aVar, h3y h3yVar, os70 os70Var, com.yandex.go.taxi.order.multi.feed.domain.a aVar2, g gVar, ru.yandex.taxi.am.g gVar2) {
        this.a = aVar;
        this.b = h3yVar;
        this.c = os70Var;
        this.d = aVar2;
        this.e = gVar;
        this.f = gVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x005c, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(ContinuationImpl continuationImpl) {
        OrderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1 orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1;
        int i;
        xs70 xs70Var;
        List list;
        Object k;
        TaxiOrderPresentationType taxiOrderPresentationType;
        List list2;
        if (continuationImpl instanceof OrderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1) {
            orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1 = (OrderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1) continuationImpl;
            int i2 = orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1.label;
                if (i != 0) {
                    b.b(obj);
                    orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1.label = 1;
                    obj = this.a.d(orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            taxiOrderPresentationType = (TaxiOrderPresentationType) orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1.L$2;
                            xs70Var = (xs70) orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1.L$1;
                            list2 = (List) orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1.L$0;
                            b.b(obj);
                            o2y0 o2y0Var = (o2y0) kotlin.collections.a.R((List) obj);
                            return ((xs70Var instanceof ws70) || !taxiOrderPresentationType.a()) ? new Pair(this.c.a(list2), o2y0Var) : o2y0Var != null ? new Pair(new ks70(), o2y0Var) : new Pair(new ls70(xs70Var), null);
                        }
                        xs70Var = (xs70) orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1.L$1;
                        list = (List) orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1.L$0;
                        b.b(obj);
                        TaxiOrderPresentationType taxiOrderPresentationType2 = (TaxiOrderPresentationType) obj;
                        p2y0 p2y0Var = (p2y0) this.b.get();
                        orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1.L$0 = list;
                        orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1.L$1 = xs70Var;
                        orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1.L$2 = taxiOrderPresentationType2;
                        orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1.label = 3;
                        k = ((e0) p2y0Var).k(orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1);
                        if (k != coroutineSingletons) {
                            taxiOrderPresentationType = taxiOrderPresentationType2;
                            obj = k;
                            list2 = list;
                            o2y0 o2y0Var2 = (o2y0) kotlin.collections.a.R((List) obj);
                            if (xs70Var instanceof ws70) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    b.b(obj);
                }
                List list3 = (List) obj;
                xs70Var = (xs70) kotlin.collections.a.R(list3);
                if (xs70Var != null) {
                    return new Pair(js70.a, null);
                }
                orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1.L$0 = list3;
                orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1.L$1 = xs70Var;
                orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1.label = 2;
                Enum b = this.d.b(orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1);
                if (b != coroutineSingletons) {
                    list = list3;
                    obj = b;
                    TaxiOrderPresentationType taxiOrderPresentationType22 = (TaxiOrderPresentationType) obj;
                    p2y0 p2y0Var2 = (p2y0) this.b.get();
                    orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1.L$0 = list;
                    orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1.L$1 = xs70Var;
                    orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1.L$2 = taxiOrderPresentationType22;
                    orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1.label = 3;
                    k = ((e0) p2y0Var2).k(orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1);
                    if (k != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1 = new OrderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1(this, continuationImpl);
        Object obj2 = orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1.label;
        if (i != 0) {
        }
        List list32 = (List) obj2;
        xs70Var = (xs70) kotlin.collections.a.R(list32);
        if (xs70Var != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0093, code lost:
    
        if (r11 != r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007f, code lost:
    
        if (kotlinx.coroutines.flow.e.x(r11, r3, r1) == r2) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(ContinuationImpl continuationImpl) {
        OrderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1 orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1;
        int i;
        o2y0 o2y0Var;
        TaxiOrder taxiOrder;
        ws70 ws70Var;
        o2y0 o2y0Var2;
        ms70 ms70Var = ms70.a;
        if (continuationImpl instanceof OrderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1) {
            orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1 = (OrderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1) continuationImpl;
            int i2 = orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (!this.f.g()) {
                        return new Pair(ms70Var, null);
                    }
                    gci0 gci0Var = this.e.j;
                    OrderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$2 orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$2 = new OrderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$2();
                    orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                ws70Var = (ws70) orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1.L$3;
                                o2y0Var2 = (o2y0) orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1.L$1;
                                b.b(obj);
                                return !((TaxiOrderPresentationType) obj).a() ? new Pair(new ks70(), o2y0Var2) : new Pair(this.c.a(Collections.singletonList(ws70Var)), o2y0Var2);
                            }
                            o2y0Var = (o2y0) orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1.L$1;
                            b.b(obj);
                            taxiOrder = (TaxiOrder) obj;
                            if (taxiOrder == null && !taxiOrder.l.getZ()) {
                                ws70Var = new ws70(taxiOrder.a, 0L);
                                com.yandex.go.taxi.order.multi.feed.domain.a aVar = this.d;
                                orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1.L$0 = null;
                                orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1.L$1 = o2y0Var;
                                orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1.L$2 = null;
                                orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1.L$3 = ws70Var;
                                orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1.label = 4;
                                obj = aVar.b(orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1);
                                if (obj != coroutineSingletons) {
                                    o2y0Var2 = o2y0Var;
                                    if (!((TaxiOrderPresentationType) obj).a()) {
                                    }
                                }
                                return coroutineSingletons;
                            }
                            return new Pair(ms70Var, null);
                        }
                        b.b(obj);
                        List list = (List) obj;
                        if (list.size() != 1) {
                            return new Pair(ms70Var, null);
                        }
                        o2y0 o2y0Var3 = (o2y0) kotlin.collections.a.P(list);
                        if (o2y0Var3.b().h.getB() == DriveState.COMPLETE && !o2y0Var3.b().l.getZ()) {
                            String str = o2y0Var3.b().a;
                            return new Pair(new ks70(), o2y0Var3);
                        }
                        kotlinx.coroutines.flow.internal.g X = e.X(o2y0Var3.b, new TaxiOrderHolder$liveUpdates$$inlined$flatMapLatest$1(o2y0Var3, null));
                        orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1.L$0 = null;
                        orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1.L$1 = o2y0Var3;
                        orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1.label = 3;
                        Object A = e.A(X, orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1);
                        if (A != coroutineSingletons) {
                            o2y0Var = o2y0Var3;
                            obj = A;
                            taxiOrder = (TaxiOrder) obj;
                            if (taxiOrder == null) {
                                return new Pair(ms70Var, null);
                            }
                            ws70Var = new ws70(taxiOrder.a, 0L);
                            com.yandex.go.taxi.order.multi.feed.domain.a aVar2 = this.d;
                            orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1.L$0 = null;
                            orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1.L$1 = o2y0Var;
                            orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1.L$2 = null;
                            orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1.L$3 = ws70Var;
                            orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1.label = 4;
                            obj = aVar2.b(orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1);
                            if (obj != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    b.b(obj);
                }
                p2y0 p2y0Var = (p2y0) this.b.get();
                orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1.label = 2;
                obj = ((e0) p2y0Var).k(orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1);
            }
        }
        orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1 = new OrderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1(this, continuationImpl);
        Object obj2 = orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1.label;
        if (i != 0) {
        }
        p2y0 p2y0Var2 = (p2y0) this.b.get();
        orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1.label = 2;
        obj2 = ((e0) p2y0Var2).k(orderStartupBehaviourInteractorImpl$resolveStartupBehaviourByPendingOrders$1);
    }
}
