package com.yandex.go.taxi.order;

import android.os.PowerManager;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.RouteInfo;
import defpackage.a3y0;
import defpackage.a880;
import defpackage.bpt0;
import defpackage.bvf0;
import defpackage.c680;
import defpackage.d1t;
import defpackage.fag;
import defpackage.ffx;
import defpackage.h6r;
import defpackage.h780;
import defpackage.hst;
import defpackage.j76;
import defpackage.jst;
import defpackage.jtq0;
import defpackage.jx81;
import defpackage.kz60;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.q280;
import defpackage.q780;
import defpackage.r8x;
import defpackage.s59;
import defpackage.tje;
import defpackage.tka1;
import defpackage.tse;
import defpackage.w980;
import defpackage.y180;
import defpackage.ysg;
import defpackage.yvi0;
import defpackage.zob1;
import defpackage.zy11;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.order.OrderNotification$OrderNotificationType;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;

/* loaded from: classes8.dex */
public final class y {
    public final tse a;
    public final h6r b;
    public final ru.yandex.taxi.order.l c;
    public final ru.yandex.taxi.order.k d;
    public final com.yandex.go.taxi.order.analytics.a e;
    public final jtq0 f;
    public final ysg g;
    public final ru.yandex.taxi.jobs.b h;
    public final PowerManager i;
    public final com.yandex.go.taxi.order.provider.a j;
    public final d1t k;
    public final MainUiAvailabilityMonitor l;
    public final a880 m;
    public final com.yandex.go.xiva.domain.f n;
    public final com.yandex.go.taxi.order.net.xiva.d o;
    public final a3y0 p = new a3y0(TaxiOrderLogGroup.CORE.getTag(), "OrderStatusController");
    public final Object q = new Object();
    public final HashMap r = new HashMap();
    public final n0 s = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    public q780 t = new yvi0(this);

    public y(tse tseVar, h6r h6rVar, ru.yandex.taxi.order.l lVar, ru.yandex.taxi.order.k kVar, com.yandex.go.taxi.order.analytics.a aVar, jtq0 jtq0Var, ysg ysgVar, ru.yandex.taxi.jobs.b bVar, PowerManager powerManager, com.yandex.go.taxi.order.provider.a aVar2, d1t d1tVar, MainUiAvailabilityMonitor mainUiAvailabilityMonitor, a880 a880Var, com.yandex.go.xiva.domain.f fVar, com.yandex.go.taxi.order.net.xiva.d dVar) {
        this.a = tseVar;
        this.b = h6rVar;
        this.c = lVar;
        this.d = kVar;
        this.e = aVar;
        this.f = jtq0Var;
        this.g = ysgVar;
        this.h = bVar;
        this.i = powerManager;
        this.j = aVar2;
        this.k = d1tVar;
        this.l = mainUiAvailabilityMonitor;
        this.m = a880Var;
        this.n = fVar;
        this.o = dVar;
        s59 s59Var = new s59(this);
        lVar.getClass();
        w980 w980Var = new w980(s59Var);
        w980Var.a(lVar.b(true));
        lVar.g.add(w980Var);
    }

    public final void a(String str) {
        this.d.b.a(str, new OrderNotification$OrderNotificationType[0]);
    }

    public final void b() {
        HashSet hashSet;
        synchronized (this.q) {
            this.j.e(EmptySet.a);
            hashSet = new HashSet(this.r.keySet());
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            n(0L, (String) it.next(), "deactivateAllOrders");
        }
    }

    public final void c(String str) {
        synchronized (this.q) {
            if (!this.r.containsKey(str)) {
                HashMap hashMap = new HashMap(this.r);
                fag j = j76.j(this.b, str, this);
                hashMap.put(str, j);
                this.p.getClass();
                a3y0.h(new String[]{"enableMonitoring"});
                hst hstVar = jst.e;
                this.r.clear();
                this.r.putAll(hashMap);
                this.s.g(j);
                if (this.g.a(str) == null) {
                    a3y0.d(this.p, "enableMonitoring", new IllegalStateException("enable monitoring for order which not stored in db"), null, 4);
                }
            }
        }
    }

    public final void d(HashSet hashSet, long j) {
        if (hashSet.isEmpty()) {
            this.d.e();
            return;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (this.g.a(str) == null) {
                this.p.b("ensureForeground", new IllegalStateException("Leaked component"), new kz60(22));
            } else {
                TaxiOrder e = e(str);
                if (e != null) {
                    this.d.a(e, e.h.getB() != e.l.getH(), j);
                }
            }
        }
    }

    public final TaxiOrder e(String str) {
        bpt0 i = i(str);
        h780 a = i != null ? ((fag) i).a() : null;
        if (a != null) {
            return a.a();
        }
        this.e.c();
        return null;
    }

    public final HashSet f() {
        HashSet H0;
        synchronized (this.q) {
            H0 = kotlin.collections.a.H0(this.r.keySet());
        }
        return H0;
    }

    public final void g() {
        ru.yandex.taxi.order.l lVar = this.c;
        lVar.getClass();
        jst.e.getClass();
        lVar.c = true;
        lVar.a();
        ((com.yandex.go.geosharing.controller.e) this.k).i();
        this.o.c();
    }

    public final void h() {
        ru.yandex.taxi.order.l lVar = this.c;
        lVar.c = false;
        jst.e.getClass();
        lVar.a();
        com.yandex.go.geosharing.controller.e eVar = (com.yandex.go.geosharing.controller.e) this.k;
        pzt0 pzt0Var = eVar.o;
        if (pzt0Var != null && pzt0Var.isActive() && (!eVar.b.c().b || !eVar.j.j())) {
            eVar.j();
        }
        this.o.e();
    }

    public final bpt0 i(String str) {
        bpt0 bpt0Var;
        synchronized (this.q) {
            bpt0Var = (bpt0) this.r.get(str);
        }
        return bpt0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(long j, String str) {
        boolean a;
        a3y0 a3y0Var = this.p;
        a3y0Var.getClass();
        a3y0.h(new String[]{"resumeMonitoring"});
        hst hstVar = jst.e;
        if (this.c.b(true)) {
            OrderStatusController$resumeMonitoring$2 orderStatusController$resumeMonitoring$2 = OrderStatusController$resumeMonitoring$2.b;
            bpt0 i = i(str);
            if (i != null) {
                orderStatusController$resumeMonitoring$2.invoke(((fag) i).b());
                return true;
            }
            this.e.c();
            return true;
        }
        TaxiOrder e = e(str);
        if (e != null) {
            try {
                a = this.d.a(e, e.h.getB() != e.l.getH(), j);
            } catch (Exception e2) {
                a3y0Var.b("ensureForeground", e2, new c680(7));
            }
            if (a) {
                l(j);
                return false;
            }
            OrderStatusController$resumeMonitoring$3 orderStatusController$resumeMonitoring$3 = OrderStatusController$resumeMonitoring$3.b;
            bpt0 i2 = i(str);
            if (i2 != null) {
                orderStatusController$resumeMonitoring$3.invoke(((fag) i2).b());
            } else {
                this.e.c();
            }
            return true;
        }
        a = false;
        if (a) {
        }
    }

    public final void k(long j, long j2, String str) {
        if (j < 0) {
            l(j2);
            return;
        }
        r8x r8xVar = new r8x();
        r8xVar.e("expiration_interval", Long.valueOf(j2));
        this.h.e(tka1.e(str, j, r8xVar));
    }

    public final void l(long j) {
        long longValue;
        boolean isPowerSaveMode = this.i.isPowerSaveMode();
        a880 a880Var = this.m;
        a3y0 a3y0Var = this.p;
        if (isPowerSaveMode) {
            a3y0Var.getClass();
            a3y0.h(new String[]{"scheduleUpdateJob"});
            hst hstVar = jst.e;
            a880Var.getClass();
            longValue = MapiClientImpl.RETRIES_TIME_MILLIS;
        } else {
            Long l = a880Var.b;
            longValue = l != null ? l.longValue() : 60000L;
        }
        a3y0Var.getClass();
        a3y0.h(new String[]{"scheduleUpdateJob"});
        hst hstVar2 = jst.e;
        r8x r8xVar = new r8x();
        r8xVar.e("expiration_interval", Long.valueOf(j));
        this.h.e(tka1.e("pull_order_status", longValue, r8xVar));
    }

    public final boolean m(long j, String str) {
        c(str);
        this.n.d();
        TaxiOrder e = e(str);
        if (e == null || !zob1.e(e)) {
            this.o.d(str);
            com.yandex.go.geosharing.controller.e eVar = (com.yandex.go.geosharing.controller.e) this.k;
            eVar.n = eVar.b.c().a && eVar.e() && !((com.yandex.go.taxi.order.domain.repositories.e0) ((com.yandex.go.taxi.order.provider.a) eVar.k).o()).u();
        }
        return j(j, str);
    }

    public final void n(long j, String str, String str2) {
        bpt0 bpt0Var;
        synchronized (this.q) {
            HashMap hashMap = new HashMap(this.r);
            bpt0Var = (bpt0) hashMap.remove(str);
            this.p.getClass();
            a3y0.h(new String[]{"untrackOrderComponent"});
            hst hstVar = jst.e;
            this.r.clear();
            this.r.putAll(hashMap);
        }
        if (bpt0Var == null) {
            if (this.c.b(true)) {
                return;
            }
            d(f(), j);
            return;
        }
        this.n.e();
        this.o.f(str);
        this.e.e(str, str2);
        ((e0) ((fag) bpt0Var).b()).d();
        q280 q280Var = this.d.b.a;
        q280Var.a(y180.f(str, OrderNotification$OrderNotificationType.ORDER_SEARCH));
        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType = OrderNotification$OrderNotificationType.ORDER_DRIVING;
        q280Var.a(orderNotification$OrderNotificationType.getId() + str.hashCode());
        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType2 = OrderNotification$OrderNotificationType.ORDER_WAITING;
        q280Var.a(orderNotification$OrderNotificationType2.getId() + str.hashCode());
        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType3 = OrderNotification$OrderNotificationType.ORDER_UPDATE_BY_PUSH;
        q280Var.a(orderNotification$OrderNotificationType3.getId() + str.hashCode());
        com.yandex.go.geosharing.controller.e eVar = (com.yandex.go.geosharing.controller.e) this.k;
        eVar.n = false;
        eVar.b.q = false;
        eVar.r = null;
        eVar.j();
        HashSet f = f();
        this.p.getClass();
        a3y0.h(new String[]{"stopMonitoring"});
        this.d.d.c.d(str);
        this.e.f(str);
        if (f.isEmpty()) {
            tje.N(this.a, null, null, new OrderStatusController$stopMonitoring$2(this, null), 3);
        } else {
            if (this.c.b(true)) {
                return;
            }
            d(f, j);
        }
    }

    public final long o(TaxiOrder taxiOrder) {
        RouteInfo routeInfo = taxiOrder.V().r;
        if (routeInfo != null) {
            return TimeUnit.SECONDS.toMillis((long) routeInfo.getB());
        }
        Calendar n = taxiOrder.n();
        if (n != null) {
            return n.getTimeInMillis() - this.f.d();
        }
        a3y0.d(this.p, "timeToArrival", new IllegalStateException("Missing due in order on assumed state"), null, 4);
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d6, code lost:
    
        if (r1.q(r13, r4, r5, r6) == r0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(TaxiOrder taxiOrder, long j, ContinuationImpl continuationImpl) {
        OrderStatusController$updateFromPush$1 orderStatusController$updateFromPush$1;
        Object obj;
        int i;
        String str;
        y yVar;
        String str2;
        if (continuationImpl instanceof OrderStatusController$updateFromPush$1) {
            orderStatusController$updateFromPush$1 = (OrderStatusController$updateFromPush$1) continuationImpl;
            int i2 = orderStatusController$updateFromPush$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderStatusController$updateFromPush$1.label = i2 - Integer.MIN_VALUE;
                OrderStatusController$updateFromPush$1 orderStatusController$updateFromPush$12 = orderStatusController$updateFromPush$1;
                obj = orderStatusController$updateFromPush$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderStatusController$updateFromPush$12.label;
                ru.yandex.taxi.order.k kVar = this.d;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            j = orderStatusController$updateFromPush$12.J$0;
                            String str3 = (String) orderStatusController$updateFromPush$12.L$2;
                            String str4 = (String) orderStatusController$updateFromPush$12.L$1;
                            kotlin.b.b(obj);
                            yVar = this;
                            str2 = str4;
                            str = str3;
                        } else {
                            if (i == 3) {
                                str2 = (String) orderStatusController$updateFromPush$12.L$1;
                                kotlin.b.b(obj);
                                kVar.d.c.d(str2);
                                return zy11.a;
                            }
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        }
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                kotlin.b.b(obj);
                String str5 = taxiOrder.a;
                str = "PushNotification";
                if (m(j, str5)) {
                    List singletonList = Collections.singletonList(str5);
                    orderStatusController$updateFromPush$12.L$0 = null;
                    orderStatusController$updateFromPush$12.L$1 = null;
                    orderStatusController$updateFromPush$12.L$2 = null;
                    orderStatusController$updateFromPush$12.J$0 = j;
                    orderStatusController$updateFromPush$12.label = 1;
                    Object q = q(j, "PushNotification", singletonList, orderStatusController$updateFromPush$12);
                    if (q != coroutineSingletons) {
                        return q;
                    }
                } else {
                    yVar = this;
                    if (jx81.e()) {
                        kVar.d.c.c(taxiOrder.a);
                        return zy11.a;
                    }
                    orderStatusController$updateFromPush$12.L$0 = null;
                    orderStatusController$updateFromPush$12.L$1 = str5;
                    orderStatusController$updateFromPush$12.L$2 = "PushNotification";
                    orderStatusController$updateFromPush$12.J$0 = j;
                    orderStatusController$updateFromPush$12.label = 2;
                    Object d = kVar.d(taxiOrder, j, orderStatusController$updateFromPush$12);
                    if (d != coroutineSingletons) {
                        obj = d;
                        str2 = str5;
                    }
                }
                return coroutineSingletons;
                if (((Boolean) obj).booleanValue()) {
                    long j2 = j;
                    List singletonList2 = Collections.singletonList(str2);
                    orderStatusController$updateFromPush$12.L$0 = null;
                    orderStatusController$updateFromPush$12.L$1 = null;
                    orderStatusController$updateFromPush$12.L$2 = null;
                    orderStatusController$updateFromPush$12.J$0 = j2;
                    orderStatusController$updateFromPush$12.label = 4;
                    Object q2 = yVar.q(j2, str, singletonList2, orderStatusController$updateFromPush$12);
                    if (q2 != coroutineSingletons) {
                        return q2;
                    }
                } else {
                    List singletonList3 = Collections.singletonList(str2);
                    orderStatusController$updateFromPush$12.L$0 = null;
                    orderStatusController$updateFromPush$12.L$1 = str2;
                    orderStatusController$updateFromPush$12.L$2 = null;
                    orderStatusController$updateFromPush$12.J$0 = j;
                    orderStatusController$updateFromPush$12.label = 3;
                }
                return coroutineSingletons;
            }
        }
        orderStatusController$updateFromPush$1 = new OrderStatusController$updateFromPush$1(this, continuationImpl);
        OrderStatusController$updateFromPush$1 orderStatusController$updateFromPush$122 = orderStatusController$updateFromPush$1;
        obj = orderStatusController$updateFromPush$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderStatusController$updateFromPush$122.label;
        ru.yandex.taxi.order.k kVar2 = this.d;
        if (i == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return coroutineSingletons2;
    }

    public final Object q(long j, String str, List list, ContinuationImpl continuationImpl) {
        Object n = bvf0.n(new OrderStatusController$updateSync$2(list, this, str, j, null), continuationImpl);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }
}
