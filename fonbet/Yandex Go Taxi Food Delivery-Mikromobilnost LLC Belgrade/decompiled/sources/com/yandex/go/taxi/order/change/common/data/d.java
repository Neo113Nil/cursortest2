package com.yandex.go.taxi.order.change.common.data;

import com.yandex.go.taxi.order.api.ChangeOrderApi;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Pending;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Success;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderPendingChanges;
import com.yandex.go.taxi.order.models.api.e;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import com.yandex.go.taxi.order.models.api.response.z0;
import com.yandex.go.taxi.order.y;
import defpackage.a3y0;
import defpackage.bvf0;
import defpackage.go70;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.hh5;
import defpackage.ho70;
import defpackage.hst;
import defpackage.io70;
import defpackage.ist;
import defpackage.jl40;
import defpackage.jo70;
import defpackage.jst;
import defpackage.ke00;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.pj;
import defpackage.r;
import defpackage.r1e0;
import defpackage.s8o;
import defpackage.tb9;
import defpackage.tt2;
import defpackage.v4r0;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes14.dex */
public final class d {
    public final h3y a;
    public final n20 b;
    public final h c;
    public final y d;
    public final hh5 e;
    public final hbp0 g;
    public final a3y0 f = new a3y0(TaxiOrderLogGroup.CHANGE_ORDER.getTag(), "OrderChangesPollRepository");
    public final r0 h = bvf0.c(EmptySet.a);
    public final LinkedHashMap i = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public d(h3y h3yVar, n20 n20Var, h hVar, y yVar, hh5 hh5Var, tt2 tt2Var) {
        this.a = h3yVar;
        this.b = n20Var;
        this.c = hVar;
        this.d = yVar;
        this.e = hh5Var;
        this.g = new hbp0(new OrderChangesPollRepository$scope$1(0, tt2Var, tt2.class, "io", "io()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, 0 == true ? 1 : 0, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e1 A[LOOP:2: B:56:0x00db->B:58:0x00e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, ContinuationImpl continuationImpl) {
        OrderChangesPollRepository$checkOutdatedPendingChanges$1 orderChangesPollRepository$checkOutdatedPendingChanges$1;
        int i;
        o2y0 o2y0Var;
        TaxiOrder b;
        List<e> e;
        ArrayList arrayList;
        Iterator it;
        Object value;
        TaxiOrder taxiOrder;
        ChangeOrderState$Source b2;
        dVar.getClass();
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof OrderChangesPollRepository$checkOutdatedPendingChanges$1) {
            orderChangesPollRepository$checkOutdatedPendingChanges$1 = (OrderChangesPollRepository$checkOutdatedPendingChanges$1) continuationImpl;
            int i2 = orderChangesPollRepository$checkOutdatedPendingChanges$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderChangesPollRepository$checkOutdatedPendingChanges$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderChangesPollRepository$checkOutdatedPendingChanges$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderChangesPollRepository$checkOutdatedPendingChanges$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n20 n20Var = dVar.b;
                    orderChangesPollRepository$checkOutdatedPendingChanges$1.label = 1;
                    obj = ((com.yandex.go.taxi.order.provider.a) n20Var).t(orderChangesPollRepository$checkOutdatedPendingChanges$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                o2y0Var = (o2y0) obj;
                if (o2y0Var != null && (b = o2y0Var.b()) != null && (e = b.i.e()) != null && dVar.i.isEmpty() && ((Set) dVar.h.getValue()).isEmpty()) {
                    arrayList = new ArrayList();
                    for (e eVar : e) {
                        String a = eVar.getA();
                        tb9 tb9Var = (a == null || (b2 = eVar.getB()) == null) ? null : new tb9(o2y0Var.b().a, a, b2);
                        if (tb9Var != null) {
                            arrayList.add(tb9Var);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        r0 r0Var = o2y0Var.a;
                        do {
                            value = r0Var.getValue();
                            taxiOrder = (TaxiOrder) value;
                            taxiOrder.getClass();
                            synchronized (taxiOrder) {
                                TaxiOrderPendingChanges taxiOrderPendingChanges = taxiOrder.i;
                                taxiOrderPendingChanges.getClass();
                                taxiOrder.i = TaxiOrderPendingChanges.b(taxiOrderPendingChanges, null, null, null, EmptyList.a, 7);
                            }
                        } while (!r0Var.k(value, taxiOrder));
                        o2y0Var.f();
                    }
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        dVar.h((tb9) it.next());
                    }
                }
                return zy11Var;
            }
        }
        orderChangesPollRepository$checkOutdatedPendingChanges$1 = new OrderChangesPollRepository$checkOutdatedPendingChanges$1(dVar, continuationImpl);
        Object obj2 = orderChangesPollRepository$checkOutdatedPendingChanges$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderChangesPollRepository$checkOutdatedPendingChanges$1.label;
        if (i != 0) {
        }
        o2y0Var = (o2y0) obj2;
        if (o2y0Var != null) {
            arrayList = new ArrayList();
            while (r1.hasNext()) {
            }
            if (arrayList.isEmpty()) {
            }
            it = arrayList.iterator();
            while (it.hasNext()) {
            }
        }
        return zy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(d dVar, io70 io70Var, ContinuationImpl continuationImpl) {
        OrderChangesPollRepository$handlePollResult$1 orderChangesPollRepository$handlePollResult$1;
        int i;
        tb9 payload;
        Object e;
        o2y0 o2y0Var;
        Object value;
        TaxiOrder taxiOrder;
        Object value2;
        TaxiOrder taxiOrder2;
        zy11 zy11Var = zy11.a;
        hh5 hh5Var = dVar.e;
        if (continuationImpl instanceof OrderChangesPollRepository$handlePollResult$1) {
            orderChangesPollRepository$handlePollResult$1 = (OrderChangesPollRepository$handlePollResult$1) continuationImpl;
            int i2 = orderChangesPollRepository$handlePollResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderChangesPollRepository$handlePollResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderChangesPollRepository$handlePollResult$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderChangesPollRepository$handlePollResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    payload = io70Var.getPayload();
                    pj pjVar = (pj) hh5Var.b;
                    String str = payload.a;
                    String str2 = payload.b;
                    String analyticName = payload.c.getAnalyticName();
                    pjVar.getClass();
                    HashMap hashMap = new HashMap();
                    if (str != null) {
                        hashMap.put("order_id", str);
                    }
                    if (str2 != null) {
                        hashMap.put("change_id", str2);
                    }
                    if (analyticName != null) {
                        hashMap.put("source", analyticName);
                    }
                    pjVar.a.a("ChangeOrderPolling.Stop", hashMap, 1, new HashMap());
                    orderChangesPollRepository$handlePollResult$1.L$0 = io70Var;
                    orderChangesPollRepository$handlePollResult$1.L$1 = payload;
                    orderChangesPollRepository$handlePollResult$1.label = 1;
                    e = dVar.e(payload, orderChangesPollRepository$handlePollResult$1);
                    if (e == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tb9 tb9Var = (tb9) orderChangesPollRepository$handlePollResult$1.L$1;
                    io70 io70Var2 = (io70) orderChangesPollRepository$handlePollResult$1.L$0;
                    kotlin.b.b(obj);
                    payload = tb9Var;
                    io70Var = io70Var2;
                    e = obj;
                }
                o2y0Var = (o2y0) e;
                if (o2y0Var != null) {
                    a3y0 a3y0Var = dVar.f;
                    String l = a3y0Var.l(new String[]{"handlePollResult"});
                    hst hstVar = jst.e;
                    String str3 = a3y0Var.a;
                    hstVar.getClass();
                    ist m = hstVar.m(l);
                    ke00 a = m.b.a();
                    if (a != null && a.b(15)) {
                        a.a(15, str3, null, "OrderHolder not found after polling processing completed", m.a);
                    }
                    return zy11Var;
                }
                r0 r0Var = o2y0Var.a;
                if (io70Var instanceof ho70) {
                    hh5Var.j(payload, true);
                    dVar.d.j(0L, payload.a);
                    do {
                        value2 = r0Var.getValue();
                        taxiOrder2 = (TaxiOrder) value2;
                        taxiOrder2.a(new ChangeOrderState$Success(payload.b, payload.c, ((ho70) io70Var).b.d));
                    } while (!r0Var.k(value2, taxiOrder2));
                    o2y0Var.f();
                    return zy11Var;
                }
                if (!(io70Var instanceof go70)) {
                    w511.b();
                    return null;
                }
                hh5Var.j(payload, false);
                do {
                    value = r0Var.getValue();
                    taxiOrder = (TaxiOrder) value;
                    String str4 = payload.b;
                    synchronized (taxiOrder) {
                        taxiOrder.i = taxiOrder.i.i(str4);
                    }
                } while (!r0Var.k(value, taxiOrder));
                o2y0Var.f();
                return zy11Var;
            }
        }
        orderChangesPollRepository$handlePollResult$1 = new OrderChangesPollRepository$handlePollResult$1(dVar, continuationImpl);
        Object obj3 = orderChangesPollRepository$handlePollResult$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderChangesPollRepository$handlePollResult$1.label;
        if (i != 0) {
        }
        o2y0Var = (o2y0) e;
        if (o2y0Var != null) {
        }
    }

    public final void c() {
        hbp0 hbp0Var = this.g;
        hbp0Var.a();
        hbp0.e(hbp0Var, null, null, new OrderChangesPollRepository$attach$1(this, null), 3);
    }

    public final Object d(String str, String str2, String str3, Continuation continuation) {
        z0 z0Var = OrderChangesDto.Companion;
        r rVar = new r(str2, str3, 19);
        z0Var.getClass();
        return ru.yandex.taxi.network.api.a.c(((ChangeOrderApi) this.a.get()).a(z0.a(rVar, str)), null, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(tb9 tb9Var, ContinuationImpl continuationImpl) {
        OrderChangesPollRepository$matchedOrderHolder$1 orderChangesPollRepository$matchedOrderHolder$1;
        int i;
        if (continuationImpl instanceof OrderChangesPollRepository$matchedOrderHolder$1) {
            orderChangesPollRepository$matchedOrderHolder$1 = (OrderChangesPollRepository$matchedOrderHolder$1) continuationImpl;
            int i2 = orderChangesPollRepository$matchedOrderHolder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderChangesPollRepository$matchedOrderHolder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderChangesPollRepository$matchedOrderHolder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderChangesPollRepository$matchedOrderHolder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    orderChangesPollRepository$matchedOrderHolder$1.L$0 = tb9Var;
                    orderChangesPollRepository$matchedOrderHolder$1.label = 1;
                    obj = ((com.yandex.go.taxi.order.provider.a) this.b).k(orderChangesPollRepository$matchedOrderHolder$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tb9Var = (tb9) orderChangesPollRepository$matchedOrderHolder$1.L$0;
                    kotlin.b.b(obj);
                }
                for (Object obj2 : (Iterable) obj) {
                    if (jl40.l(((o2y0) obj2).b().a, tb9Var.a)) {
                        return obj2;
                    }
                }
                return null;
            }
        }
        orderChangesPollRepository$matchedOrderHolder$1 = new OrderChangesPollRepository$matchedOrderHolder$1(this, continuationImpl);
        Object obj3 = orderChangesPollRepository$matchedOrderHolder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderChangesPollRepository$matchedOrderHolder$1.label;
        if (i != 0) {
        }
        while (r5.hasNext()) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0165, code lost:
    
        if (r0 == r8) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x018d, code lost:
    
        if (r0 == r8) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ae A[Catch: Exception -> 0x00d0, CancellationException -> 0x0199, TryCatch #0 {Exception -> 0x00d0, blocks: (B:18:0x00ec, B:71:0x00aa, B:73:0x00ae, B:74:0x00b0, B:78:0x00c9, B:13:0x00d8, B:68:0x009a), top: B:67:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.yandex.go.taxi.order.change.common.data.d] */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, tb9 tb9Var, int i, ContinuationImpl continuationImpl) {
        OrderChangesPollRepository$poll$1 orderChangesPollRepository$poll$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        ?? r4;
        tb9 tb9Var2;
        int i2;
        String str2;
        o2y0 o2y0Var;
        Object value;
        TaxiOrder taxiOrder;
        String str3;
        tb9 tb9Var3;
        int i3;
        Object obj2;
        String str4;
        String str5;
        Throwable a;
        OrderChangesDto.PendingChangeDto a2;
        String str6;
        int i4;
        tb9 tb9Var4 = tb9Var;
        ?? r3 = i;
        try {
            if (continuationImpl instanceof OrderChangesPollRepository$poll$1) {
                orderChangesPollRepository$poll$1 = (OrderChangesPollRepository$poll$1) continuationImpl;
                int i5 = orderChangesPollRepository$poll$1.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    orderChangesPollRepository$poll$1.label = i5 - Integer.MIN_VALUE;
                    OrderChangesPollRepository$poll$1 orderChangesPollRepository$poll$12 = orderChangesPollRepository$poll$1;
                    obj = orderChangesPollRepository$poll$12.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r4 = orderChangesPollRepository$poll$12.label;
                    if (r4 == 0) {
                        try {
                        } catch (Exception e) {
                            e = e;
                            tb9Var2 = tb9Var4;
                            tb9Var4 = r3;
                            str3 = r4;
                            Result.Failure failure = new Result.Failure(e);
                            tb9 tb9Var5 = tb9Var2;
                            tb9Var3 = tb9Var4;
                            i3 = tb9Var5;
                            obj2 = failure;
                            str5 = str3;
                            a = Result.a(obj2);
                            if (a == null) {
                            }
                            return coroutineSingletons;
                        }
                        if (r4 != 1) {
                            if (r4 != 2) {
                                if (r4 == 3) {
                                    kotlin.b.b(obj);
                                    return (io70) obj;
                                }
                                if (r4 != 4) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                kotlin.b.b(obj);
                                return (io70) obj;
                            }
                            int i6 = orderChangesPollRepository$poll$12.I$0;
                            tb9 tb9Var6 = (tb9) orderChangesPollRepository$poll$12.L$1;
                            String str7 = (String) orderChangesPollRepository$poll$12.L$0;
                            kotlin.b.b(obj);
                            r3 = i6;
                            tb9Var4 = tb9Var6;
                            str4 = str7;
                            obj2 = (r1e0) obj;
                            boolean z = r3;
                            tb9Var3 = tb9Var4;
                            i3 = z;
                            str5 = str4;
                            a = Result.a(obj2);
                            if (a == null) {
                                r1e0 r1e0Var = (r1e0) obj2;
                                orderChangesPollRepository$poll$12.L$0 = null;
                                orderChangesPollRepository$poll$12.L$1 = null;
                                orderChangesPollRepository$poll$12.L$2 = null;
                                orderChangesPollRepository$poll$12.I$0 = i3;
                                orderChangesPollRepository$poll$12.label = 3;
                                OrderChangesDto.ChangesPayload a3 = ((OrderChangesDto) r1e0Var.a).a(tb9Var3.a);
                                if (a3 == null || (a2 = a3.a(tb9Var3.b)) == null) {
                                    obj = new go70(tb9Var3);
                                } else {
                                    OrderChangesDto.Status status = a2.b;
                                    int i7 = status == null ? -1 : jo70.a[status.ordinal()];
                                    if (i7 != -1) {
                                        if (i7 == 1) {
                                            obj = new ho70(tb9Var3, a2);
                                        } else if (i7 != 2 && i7 != 3 && i7 != 4) {
                                            w511.b();
                                            return null;
                                        }
                                    }
                                    Long l = r1e0Var.b;
                                    obj = g(str5, tb9Var3, l != null ? l.longValue() : 4000L, i3, orderChangesPollRepository$poll$12);
                                }
                            } else {
                                int i8 = i3;
                                String str8 = str5;
                                if (s8o.C(a) || s8o.w(a)) {
                                    return new go70(tb9Var3);
                                }
                                orderChangesPollRepository$poll$12.L$0 = null;
                                orderChangesPollRepository$poll$12.L$1 = null;
                                orderChangesPollRepository$poll$12.L$2 = null;
                                orderChangesPollRepository$poll$12.I$0 = i8;
                                orderChangesPollRepository$poll$12.label = 4;
                                obj = g(str8, tb9Var3, 3000L, i8, orderChangesPollRepository$poll$12);
                            }
                            return coroutineSingletons;
                        }
                        int i9 = orderChangesPollRepository$poll$12.I$0;
                        tb9 tb9Var7 = (tb9) orderChangesPollRepository$poll$12.L$1;
                        String str9 = (String) orderChangesPollRepository$poll$12.L$0;
                        kotlin.b.b(obj);
                        i2 = i9;
                        tb9Var4 = tb9Var7;
                        str2 = str9;
                    } else {
                        kotlin.b.b(obj);
                        if (r3 != 0) {
                            str6 = str;
                            i4 = r3;
                            String str10 = tb9Var4.a;
                            String str11 = tb9Var4.b;
                            orderChangesPollRepository$poll$12.L$0 = str6;
                            orderChangesPollRepository$poll$12.L$1 = tb9Var4;
                            orderChangesPollRepository$poll$12.I$0 = i4;
                            orderChangesPollRepository$poll$12.label = 2;
                            obj = d(str6, str10, str11, orderChangesPollRepository$poll$12);
                            r3 = i4;
                            str4 = str6;
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            obj2 = (r1e0) obj;
                            boolean z2 = r3;
                            tb9Var3 = tb9Var4;
                            i3 = z2;
                            str5 = str4;
                            a = Result.a(obj2);
                            if (a == null) {
                            }
                            return coroutineSingletons;
                        }
                        try {
                            this.e.k(tb9Var4);
                            str4 = str;
                            try {
                                orderChangesPollRepository$poll$12.L$0 = str4;
                                orderChangesPollRepository$poll$12.L$1 = tb9Var4;
                                orderChangesPollRepository$poll$12.I$0 = r3;
                                orderChangesPollRepository$poll$12.label = 1;
                                obj = e(tb9Var4, orderChangesPollRepository$poll$12);
                                i2 = r3;
                                str2 = str4;
                            } catch (Exception e2) {
                                e = e2;
                                tb9Var2 = r3;
                                str3 = str4;
                                Result.Failure failure2 = new Result.Failure(e);
                                tb9 tb9Var52 = tb9Var2;
                                tb9Var3 = tb9Var4;
                                i3 = tb9Var52;
                                obj2 = failure2;
                                str5 = str3;
                                a = Result.a(obj2);
                                if (a == null) {
                                }
                                return coroutineSingletons;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            str3 = str;
                            tb9Var2 = r3;
                            Result.Failure failure22 = new Result.Failure(e);
                            tb9 tb9Var522 = tb9Var2;
                            tb9Var3 = tb9Var4;
                            i3 = tb9Var522;
                            obj2 = failure22;
                            str5 = str3;
                            a = Result.a(obj2);
                            if (a == null) {
                            }
                            return coroutineSingletons;
                        }
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    o2y0Var = (o2y0) obj;
                    i4 = i2;
                    str6 = str2;
                    if (o2y0Var != null) {
                        r0 r0Var = o2y0Var.a;
                        do {
                            value = r0Var.getValue();
                            taxiOrder = (TaxiOrder) value;
                            taxiOrder.a(new ChangeOrderState$Pending(tb9Var4.b, tb9Var4.c));
                        } while (!r0Var.k(value, taxiOrder));
                        o2y0Var.f();
                        i4 = i2;
                        str6 = str2;
                    }
                    String str102 = tb9Var4.a;
                    String str112 = tb9Var4.b;
                    orderChangesPollRepository$poll$12.L$0 = str6;
                    orderChangesPollRepository$poll$12.L$1 = tb9Var4;
                    orderChangesPollRepository$poll$12.I$0 = i4;
                    orderChangesPollRepository$poll$12.label = 2;
                    obj = d(str6, str102, str112, orderChangesPollRepository$poll$12);
                    r3 = i4;
                    str4 = str6;
                    if (obj == coroutineSingletons) {
                    }
                    obj2 = (r1e0) obj;
                    boolean z22 = r3;
                    tb9Var3 = tb9Var4;
                    i3 = z22;
                    str5 = str4;
                    a = Result.a(obj2);
                    if (a == null) {
                    }
                    return coroutineSingletons;
                }
            }
            if (r4 == 0) {
            }
            o2y0Var = (o2y0) obj;
            i4 = i2;
            str6 = str2;
            if (o2y0Var != null) {
            }
            String str1022 = tb9Var4.a;
            String str1122 = tb9Var4.b;
            orderChangesPollRepository$poll$12.L$0 = str6;
            orderChangesPollRepository$poll$12.L$1 = tb9Var4;
            orderChangesPollRepository$poll$12.I$0 = i4;
            orderChangesPollRepository$poll$12.label = 2;
            obj = d(str6, str1022, str1122, orderChangesPollRepository$poll$12);
            r3 = i4;
            str4 = str6;
            if (obj == coroutineSingletons) {
            }
            obj2 = (r1e0) obj;
            boolean z222 = r3;
            tb9Var3 = tb9Var4;
            i3 = z222;
            str5 = str4;
            a = Result.a(obj2);
            if (a == null) {
            }
            return coroutineSingletons;
        } catch (CancellationException e4) {
            throw e4;
        }
        orderChangesPollRepository$poll$1 = new OrderChangesPollRepository$poll$1(this, continuationImpl);
        OrderChangesPollRepository$poll$1 orderChangesPollRepository$poll$122 = orderChangesPollRepository$poll$1;
        obj = orderChangesPollRepository$poll$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        r4 = orderChangesPollRepository$poll$122.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (kotlinx.coroutines.a.i(r9, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, tb9 tb9Var, long j, int i, ContinuationImpl continuationImpl) {
        OrderChangesPollRepository$processFailure$1 orderChangesPollRepository$processFailure$1;
        int i2;
        int i3;
        if (continuationImpl instanceof OrderChangesPollRepository$processFailure$1) {
            orderChangesPollRepository$processFailure$1 = (OrderChangesPollRepository$processFailure$1) continuationImpl;
            int i4 = orderChangesPollRepository$processFailure$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                orderChangesPollRepository$processFailure$1.label = i4 - Integer.MIN_VALUE;
                Object obj = orderChangesPollRepository$processFailure$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = orderChangesPollRepository$processFailure$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    i3 = i + 1;
                    if (i3 >= 3) {
                        return new go70(tb9Var);
                    }
                    orderChangesPollRepository$processFailure$1.L$0 = str;
                    orderChangesPollRepository$processFailure$1.L$1 = tb9Var;
                    orderChangesPollRepository$processFailure$1.J$0 = j;
                    orderChangesPollRepository$processFailure$1.I$0 = i;
                    orderChangesPollRepository$processFailure$1.I$1 = i3;
                    orderChangesPollRepository$processFailure$1.label = 1;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    int i5 = orderChangesPollRepository$processFailure$1.I$1;
                    i = orderChangesPollRepository$processFailure$1.I$0;
                    j = orderChangesPollRepository$processFailure$1.J$0;
                    tb9Var = (tb9) orderChangesPollRepository$processFailure$1.L$1;
                    String str2 = (String) orderChangesPollRepository$processFailure$1.L$0;
                    kotlin.b.b(obj);
                    i3 = i5;
                    str = str2;
                }
                orderChangesPollRepository$processFailure$1.L$0 = null;
                orderChangesPollRepository$processFailure$1.L$1 = null;
                orderChangesPollRepository$processFailure$1.J$0 = j;
                orderChangesPollRepository$processFailure$1.I$0 = i;
                orderChangesPollRepository$processFailure$1.I$1 = i3;
                orderChangesPollRepository$processFailure$1.label = 2;
                Object f = f(str, tb9Var, i3, orderChangesPollRepository$processFailure$1);
                return f != obj2 ? obj2 : f;
            }
        }
        orderChangesPollRepository$processFailure$1 = new OrderChangesPollRepository$processFailure$1(this, continuationImpl);
        Object obj3 = orderChangesPollRepository$processFailure$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = orderChangesPollRepository$processFailure$1.label;
        if (i2 != 0) {
        }
        orderChangesPollRepository$processFailure$1.L$0 = null;
        orderChangesPollRepository$processFailure$1.L$1 = null;
        orderChangesPollRepository$processFailure$1.J$0 = j;
        orderChangesPollRepository$processFailure$1.I$0 = i;
        orderChangesPollRepository$processFailure$1.I$1 = i3;
        orderChangesPollRepository$processFailure$1.label = 2;
        Object f2 = f(str, tb9Var, i3, orderChangesPollRepository$processFailure$1);
        if (f2 != obj22) {
        }
    }

    public final void h(tb9 tb9Var) {
        r0 r0Var;
        Object value;
        if (tb9Var.b.length() != 0) {
            do {
                r0Var = this.h;
                value = r0Var.getValue();
            } while (!r0Var.k(value, v4r0.i((Set) value, tb9Var)));
            return;
        }
        a3y0 a3y0Var = this.f;
        String l = a3y0Var.l(new String[]{"startPolling"});
        hst hstVar = jst.e;
        String str = a3y0Var.a;
        hstVar.getClass();
        ist m = hstVar.m(l);
        ke00 a = m.b.a();
        if (a == null || !a.b(15)) {
            return;
        }
        a.a(15, str, null, "was called with and empty changeId", m.a);
    }
}
