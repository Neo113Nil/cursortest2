package com.yandex.go.taxi.order.network;

import com.yandex.go.net.taxi.dto.response.CanMakeMoreOrders;
import com.yandex.go.taxi.order.f0;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.f;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.models.api.response.OrderCommitResponse;
import com.yandex.go.taxi.order.network.exception.ErrorDuringCommitButOrderCreatedException;
import com.yandex.go.taxi.order.network.exception.MissingOrderIdException;
import com.yandex.go.taxi.order.network.exception.NoNewOrderFoundException;
import com.yandex.go.taxi.order.network.exception.NotAllowedParallelRequestsException;
import defpackage.a3y0;
import defpackage.b700;
import defpackage.bd80;
import defpackage.fs70;
import defpackage.h3y;
import defpackage.ku4;
import defpackage.ny61;
import defpackage.pq70;
import defpackage.pu70;
import defpackage.pzt0;
import defpackage.tb;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.xc80;
import defpackage.y580;
import defpackage.z580;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;
import java.util.function.Supplier;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.provider.OrdersProviderImpl$CreateOrderWithoutAuthorizedUserException;

/* loaded from: classes14.dex */
public final class b {
    public final tse a;
    public final tt2 b;
    public final h3y c;
    public final h3y d;
    public final h3y e;
    public final h3y f;
    public final h3y g;
    public final h3y h;
    public pzt0 j;
    public final a3y0 i = new a3y0(TaxiOrderLogGroup.CORE.getTag(), "OrderSender");
    public final Object k = new Object();

    public b(tse tseVar, tt2 tt2Var, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, h3y h3yVar5, h3y h3yVar6) {
        this.a = tseVar;
        this.b = tt2Var;
        this.c = h3yVar;
        this.d = h3yVar2;
        this.e = h3yVar3;
        this.f = h3yVar4;
        this.g = h3yVar5;
        this.h = h3yVar6;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, TaxiOrder taxiOrder, String str, y580 y580Var, boolean z, ContinuationImpl continuationImpl) {
        OrderSenderImpl$order$1 orderSenderImpl$order$1;
        int i;
        bVar.getClass();
        try {
            if (continuationImpl instanceof OrderSenderImpl$order$1) {
                orderSenderImpl$order$1 = (OrderSenderImpl$order$1) continuationImpl;
                int i2 = orderSenderImpl$order$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    orderSenderImpl$order$1.label = i2 - Integer.MIN_VALUE;
                    OrderSenderImpl$order$1 orderSenderImpl$order$12 = orderSenderImpl$order$1;
                    Object obj = orderSenderImpl$order$12.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = orderSenderImpl$order$12.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        orderSenderImpl$order$12.L$0 = taxiOrder;
                        orderSenderImpl$order$12.L$1 = null;
                        orderSenderImpl$order$12.L$2 = null;
                        orderSenderImpl$order$12.Z$0 = z;
                        orderSenderImpl$order$12.label = 1;
                        obj = bVar.f(taxiOrder, str, y580Var, z, orderSenderImpl$order$12);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        taxiOrder = (TaxiOrder) orderSenderImpl$order$12.L$0;
                        kotlin.b.b(obj);
                    }
                    return bVar.c(taxiOrder, (OrderCommitResponse) obj);
                }
            }
            if (i != 0) {
            }
            return bVar.c(taxiOrder, (OrderCommitResponse) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            if (th instanceof ErrorDuringCommitButOrderCreatedException) {
                return th.getOrder();
            }
            throw th;
        }
        orderSenderImpl$order$1 = new OrderSenderImpl$order$1(bVar, continuationImpl);
        OrderSenderImpl$order$1 orderSenderImpl$order$122 = orderSenderImpl$order$1;
        Object obj3 = orderSenderImpl$order$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderSenderImpl$order$122.label;
    }

    public final void b(TaxiOrder taxiOrder, Consumer consumer, Consumer consumer2) {
        synchronized (this.k) {
            if (d()) {
                this.j = tje.N(this.a, null, null, new OrderSenderImpl$checkPendingOrders$1$1(this, consumer, taxiOrder, consumer2, null), 3);
            } else {
                consumer2.accept(new NotAllowedParallelRequestsException());
            }
        }
    }

    public final TaxiOrder c(final TaxiOrder taxiOrder, final OrderCommitResponse orderCommitResponse) {
        String str = orderCommitResponse.a;
        if (str == null || str.length() == 0) {
            throw new MissingOrderIdException();
        }
        h3y h3yVar = this.c;
        final bd80 bd80Var = (bd80) ((z580) h3yVar.get()).h;
        bd80Var.getClass();
        DriveState driveState = orderCommitResponse.c;
        if (driveState == null) {
            driveState = DriveState.SEARCH;
        }
        final DriveState driveState2 = driveState;
        final String str2 = orderCommitResponse.a;
        if (str2 == null) {
            ny61.g("Required value was null.");
            return null;
        }
        TaxiOrder c = bd80Var.a.c(str2, new Supplier() { // from class: zc80
            @Override // java.util.function.Supplier
            public final Object get() {
                if (!bd80.this.b.Kg()) {
                    throw new OrdersProviderImpl$CreateOrderWithoutAuthorizedUserException("Try to compose order object without authorization");
                }
                f fVar = TaxiOrder.Companion;
                TaxiOrder taxiOrder2 = taxiOrder;
                Preorder W = taxiOrder2.W();
                long j = taxiOrder2.c;
                String str3 = orderCommitResponse.b;
                fVar.getClass();
                return f.a(W, str2, driveState2, j, str3);
            }
        }, new ku4(taxiOrder, bd80Var, orderCommitResponse, driveState2, 1));
        CanMakeMoreOrders canMakeMoreOrders = orderCommitResponse.d;
        if (canMakeMoreOrders != null) {
            ((z580) h3yVar.get()).j.e(canMakeMoreOrders);
            return c;
        }
        ((z580) h3yVar.get()).j.e(CanMakeMoreOrders.DISALLOWED);
        return c;
    }

    public final boolean d() {
        boolean z;
        synchronized (this.k) {
            pzt0 pzt0Var = this.j;
            boolean z2 = false;
            if (pzt0Var != null) {
                if (pzt0Var.isActive()) {
                    z2 = true;
                }
            }
            z = !z2;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(TaxiOrder taxiOrder, List list, ContinuationImpl continuationImpl) {
        OrderSenderImpl$orderFromPendingOrders$2 orderSenderImpl$orderFromPendingOrders$2;
        int i;
        TaxiOrder taxiOrder2;
        if (continuationImpl instanceof OrderSenderImpl$orderFromPendingOrders$2) {
            orderSenderImpl$orderFromPendingOrders$2 = (OrderSenderImpl$orderFromPendingOrders$2) continuationImpl;
            int i2 = orderSenderImpl$orderFromPendingOrders$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderSenderImpl$orderFromPendingOrders$2.label = i2 - Integer.MIN_VALUE;
                Object obj = orderSenderImpl$orderFromPendingOrders$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderSenderImpl$orderFromPendingOrders$2.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f0 f0Var = (f0) this.h.get();
                    b700 b700Var = new b700(16, this, taxiOrder, list);
                    orderSenderImpl$orderFromPendingOrders$2.L$0 = null;
                    orderSenderImpl$orderFromPendingOrders$2.L$1 = null;
                    orderSenderImpl$orderFromPendingOrders$2.label = 1;
                    obj = f0Var.a(b700Var, orderSenderImpl$orderFromPendingOrders$2);
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
                taxiOrder2 = (TaxiOrder) obj;
                if (taxiOrder2 == null) {
                    return taxiOrder2;
                }
                throw new NoNewOrderFoundException();
            }
        }
        orderSenderImpl$orderFromPendingOrders$2 = new OrderSenderImpl$orderFromPendingOrders$2(this, continuationImpl);
        Object obj2 = orderSenderImpl$orderFromPendingOrders$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderSenderImpl$orderFromPendingOrders$2.label;
        if (i != 0) {
        }
        taxiOrder2 = (TaxiOrder) obj2;
        if (taxiOrder2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(TaxiOrder taxiOrder, String str, y580 y580Var, boolean z, ContinuationImpl continuationImpl) {
        OrderSenderImpl$orderResponse$1 orderSenderImpl$orderResponse$1;
        int i;
        String str2;
        boolean z2;
        Preorder preorder;
        y580 y580Var2;
        OrderCommitResponse orderCommitResponse;
        TaxiOrder taxiOrder2;
        boolean z3;
        TaxiOrder taxiOrder3 = taxiOrder;
        if (continuationImpl instanceof OrderSenderImpl$orderResponse$1) {
            orderSenderImpl$orderResponse$1 = (OrderSenderImpl$orderResponse$1) continuationImpl;
            int i2 = orderSenderImpl$orderResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderSenderImpl$orderResponse$1.label = i2 - Integer.MIN_VALUE;
                OrderSenderImpl$orderResponse$1 orderSenderImpl$orderResponse$12 = orderSenderImpl$orderResponse$1;
                Object obj = orderSenderImpl$orderResponse$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderSenderImpl$orderResponse$12.label;
                int i3 = 6;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (taxiOrder3.K()) {
                        Preorder W = taxiOrder3.W();
                        ((z580) this.c.get()).e.a.clear();
                        e eVar = (e) this.g.get();
                        orderSenderImpl$orderResponse$12.L$0 = taxiOrder3;
                        orderSenderImpl$orderResponse$12.L$1 = str;
                        orderSenderImpl$orderResponse$12.L$2 = y580Var;
                        orderSenderImpl$orderResponse$12.L$3 = W;
                        orderSenderImpl$orderResponse$12.Z$0 = z;
                        orderSenderImpl$orderResponse$12.label = 2;
                        Object a = eVar.a(W, str, orderSenderImpl$orderResponse$12);
                        if (a != coroutineSingletons) {
                            str2 = str;
                            z2 = z;
                            preorder = W;
                            obj = a;
                            y580Var2 = y580Var;
                        }
                    } else {
                        c cVar = (c) this.e.get();
                        String str3 = taxiOrder3.a;
                        orderSenderImpl$orderResponse$12.L$0 = null;
                        orderSenderImpl$orderResponse$12.L$1 = null;
                        orderSenderImpl$orderResponse$12.L$2 = null;
                        orderSenderImpl$orderResponse$12.Z$0 = z;
                        orderSenderImpl$orderResponse$12.label = 1;
                        Object a2 = cVar.a(str3, orderSenderImpl$orderResponse$12, false);
                        if (a2 != coroutineSingletons) {
                            return a2;
                        }
                    }
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    z3 = orderSenderImpl$orderResponse$12.Z$0;
                    preorder = (Preorder) orderSenderImpl$orderResponse$12.L$3;
                    y580Var2 = (y580) orderSenderImpl$orderResponse$12.L$2;
                    taxiOrder2 = (TaxiOrder) orderSenderImpl$orderResponse$12.L$0;
                    kotlin.b.b(obj);
                    final Preorder preorder2 = preorder;
                    pu70 pu70Var = (pu70) obj;
                    xc80 xc80Var = ((z580) this.c.get()).h;
                    final String str4 = pu70Var.a;
                    final long j = taxiOrder2.c;
                    final bd80 bd80Var = (bd80) xc80Var;
                    ((pq70) y580Var2).a.c.g(bd80Var.a.c(str4, new Supplier() { // from class: ad80
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            if (!bd80.this.b.Kg()) {
                                throw new OrdersProviderImpl$CreateOrderWithoutAuthorizedUserException("Try to compose order draft without authorization");
                            }
                            TaxiOrder b = f.b(TaxiOrder.Companion, preorder2, str4, DriveState.PREORDER, j, 16);
                            b.O(true);
                            return b;
                        }
                    }, new tb(i3, bd80Var, str4)));
                    c cVar2 = (c) this.e.get();
                    String str5 = pu70Var.a;
                    orderSenderImpl$orderResponse$12.L$0 = null;
                    orderSenderImpl$orderResponse$12.L$1 = null;
                    orderSenderImpl$orderResponse$12.L$2 = null;
                    orderSenderImpl$orderResponse$12.L$3 = null;
                    orderSenderImpl$orderResponse$12.L$4 = null;
                    orderSenderImpl$orderResponse$12.L$5 = null;
                    orderSenderImpl$orderResponse$12.L$6 = null;
                    orderSenderImpl$orderResponse$12.Z$0 = z3;
                    orderSenderImpl$orderResponse$12.label = 4;
                    Object a3 = cVar2.a(str5, orderSenderImpl$orderResponse$12, z3);
                    return a3 != coroutineSingletons ? coroutineSingletons : a3;
                }
                boolean z4 = orderSenderImpl$orderResponse$12.Z$0;
                preorder = (Preorder) orderSenderImpl$orderResponse$12.L$3;
                y580Var2 = (y580) orderSenderImpl$orderResponse$12.L$2;
                String str6 = (String) orderSenderImpl$orderResponse$12.L$1;
                TaxiOrder taxiOrder4 = (TaxiOrder) orderSenderImpl$orderResponse$12.L$0;
                kotlin.b.b(obj);
                z2 = z4;
                taxiOrder3 = taxiOrder4;
                str2 = str6;
                orderCommitResponse = (OrderCommitResponse) obj;
                if (orderCommitResponse == null) {
                    final String str7 = orderCommitResponse.a;
                    if (str7 == null || str7.length() == 0) {
                        throw new MissingOrderIdException();
                    }
                    xc80 xc80Var2 = ((z580) this.c.get()).h;
                    final long j2 = taxiOrder3.c;
                    final bd80 bd80Var2 = (bd80) xc80Var2;
                    final Preorder preorder3 = preorder;
                    ((pq70) y580Var2).a.c.g(bd80Var2.a.c(str7, new Supplier() { // from class: ad80
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            if (!bd80.this.b.Kg()) {
                                throw new OrdersProviderImpl$CreateOrderWithoutAuthorizedUserException("Try to compose order draft without authorization");
                            }
                            TaxiOrder b = f.b(TaxiOrder.Companion, preorder3, str7, DriveState.PREORDER, j2, 16);
                            b.O(true);
                            return b;
                        }
                    }, new tb(i3, bd80Var2, str7)));
                    return orderCommitResponse;
                }
                d dVar = (d) this.d.get();
                String str8 = taxiOrder3.l.F;
                orderSenderImpl$orderResponse$12.L$0 = taxiOrder3;
                orderSenderImpl$orderResponse$12.L$1 = null;
                orderSenderImpl$orderResponse$12.L$2 = y580Var2;
                orderSenderImpl$orderResponse$12.L$3 = preorder;
                orderSenderImpl$orderResponse$12.L$4 = null;
                orderSenderImpl$orderResponse$12.Z$0 = z2;
                orderSenderImpl$orderResponse$12.label = 3;
                obj = dVar.a(preorder, str2, str8, z2, orderSenderImpl$orderResponse$12);
                if (obj != coroutineSingletons) {
                    taxiOrder2 = taxiOrder3;
                    z3 = z2;
                    final Preorder preorder22 = preorder;
                    pu70 pu70Var2 = (pu70) obj;
                    xc80 xc80Var3 = ((z580) this.c.get()).h;
                    final String str42 = pu70Var2.a;
                    final long j3 = taxiOrder2.c;
                    final bd80 bd80Var3 = (bd80) xc80Var3;
                    ((pq70) y580Var2).a.c.g(bd80Var3.a.c(str42, new Supplier() { // from class: ad80
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            if (!bd80.this.b.Kg()) {
                                throw new OrdersProviderImpl$CreateOrderWithoutAuthorizedUserException("Try to compose order draft without authorization");
                            }
                            TaxiOrder b = f.b(TaxiOrder.Companion, preorder22, str42, DriveState.PREORDER, j3, 16);
                            b.O(true);
                            return b;
                        }
                    }, new tb(i3, bd80Var3, str42)));
                    c cVar22 = (c) this.e.get();
                    String str52 = pu70Var2.a;
                    orderSenderImpl$orderResponse$12.L$0 = null;
                    orderSenderImpl$orderResponse$12.L$1 = null;
                    orderSenderImpl$orderResponse$12.L$2 = null;
                    orderSenderImpl$orderResponse$12.L$3 = null;
                    orderSenderImpl$orderResponse$12.L$4 = null;
                    orderSenderImpl$orderResponse$12.L$5 = null;
                    orderSenderImpl$orderResponse$12.L$6 = null;
                    orderSenderImpl$orderResponse$12.Z$0 = z3;
                    orderSenderImpl$orderResponse$12.label = 4;
                    Object a32 = cVar22.a(str52, orderSenderImpl$orderResponse$12, z3);
                    if (a32 != coroutineSingletons) {
                    }
                }
            }
        }
        orderSenderImpl$orderResponse$1 = new OrderSenderImpl$orderResponse$1(this, continuationImpl);
        OrderSenderImpl$orderResponse$1 orderSenderImpl$orderResponse$122 = orderSenderImpl$orderResponse$1;
        Object obj2 = orderSenderImpl$orderResponse$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderSenderImpl$orderResponse$122.label;
        int i32 = 6;
        if (i != 0) {
        }
        orderCommitResponse = (OrderCommitResponse) obj2;
        if (orderCommitResponse == null) {
        }
    }

    public final void g(TaxiOrder taxiOrder, String str, pq70 pq70Var) {
        synchronized (this.k) {
            if (!d()) {
                pq70Var.b(new NotAllowedParallelRequestsException());
            } else {
                this.i.f(new fs70(28), "send");
                this.j = tje.N(this.a, null, null, new OrderSenderImpl$send$1$2(this, taxiOrder, str, pq70Var, null), 3);
            }
        }
    }
}
