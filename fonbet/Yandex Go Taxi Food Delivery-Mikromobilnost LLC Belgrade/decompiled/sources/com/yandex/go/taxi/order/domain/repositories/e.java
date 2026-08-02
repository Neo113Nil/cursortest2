package com.yandex.go.taxi.order.domain.repositories;

import com.yandex.go.taxi.order.models.api.ChangeOrderState$Pending;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.ffx;
import defpackage.jl40;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class e {
    public final n20 a;
    public final n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public e(n20 n20Var) {
        this.a = n20Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[EDGE_INSN: B:29:0x006c->B:17:0x006c BREAK  A[LOOP:0: B:11:0x0052->B:28:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        OrderPaymentMethodUpdateRepository$addPendingChange$1 orderPaymentMethodUpdateRepository$addPendingChange$1;
        int i;
        Iterator it;
        o2y0 o2y0Var;
        Object value;
        TaxiOrder taxiOrder;
        if (continuationImpl instanceof OrderPaymentMethodUpdateRepository$addPendingChange$1) {
            orderPaymentMethodUpdateRepository$addPendingChange$1 = (OrderPaymentMethodUpdateRepository$addPendingChange$1) continuationImpl;
            int i2 = orderPaymentMethodUpdateRepository$addPendingChange$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderPaymentMethodUpdateRepository$addPendingChange$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderPaymentMethodUpdateRepository$addPendingChange$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderPaymentMethodUpdateRepository$addPendingChange$1.label;
                Object obj2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    orderPaymentMethodUpdateRepository$addPendingChange$1.L$0 = str;
                    orderPaymentMethodUpdateRepository$addPendingChange$1.L$1 = str2;
                    orderPaymentMethodUpdateRepository$addPendingChange$1.label = 1;
                    obj = ((com.yandex.go.taxi.order.provider.a) this.a).k(orderPaymentMethodUpdateRepository$addPendingChange$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) orderPaymentMethodUpdateRepository$addPendingChange$1.L$1;
                    str = (String) orderPaymentMethodUpdateRepository$addPendingChange$1.L$0;
                    kotlin.b.b(obj);
                }
                it = ((Iterable) obj).iterator();
                while (true) {
                    if (it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (jl40.l(((o2y0) next).b().a, str)) {
                        obj2 = next;
                        break;
                    }
                }
                o2y0Var = (o2y0) obj2;
                if (o2y0Var != null) {
                    r0 r0Var = o2y0Var.a;
                    do {
                        value = r0Var.getValue();
                        taxiOrder = (TaxiOrder) value;
                        taxiOrder.a(new ChangeOrderState$Pending(str2, ChangeOrderState$Source.PAYMENT));
                    } while (!r0Var.k(value, taxiOrder));
                    o2y0Var.f();
                }
                return zy11.a;
            }
        }
        orderPaymentMethodUpdateRepository$addPendingChange$1 = new OrderPaymentMethodUpdateRepository$addPendingChange$1(this, continuationImpl);
        Object obj3 = orderPaymentMethodUpdateRepository$addPendingChange$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderPaymentMethodUpdateRepository$addPendingChange$1.label;
        Object obj22 = null;
        if (i != 0) {
        }
        it = ((Iterable) obj3).iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        o2y0Var = (o2y0) obj22;
        if (o2y0Var != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064 A[EDGE_INSN: B:33:0x0064->B:17:0x0064 BREAK  A[LOOP:0: B:11:0x004a->B:32:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        OrderPaymentMethodUpdateRepository$notifyOrderUpdated$1 orderPaymentMethodUpdateRepository$notifyOrderUpdated$1;
        int i;
        Iterator it;
        o2y0 o2y0Var;
        TaxiOrder b;
        if (continuationImpl instanceof OrderPaymentMethodUpdateRepository$notifyOrderUpdated$1) {
            orderPaymentMethodUpdateRepository$notifyOrderUpdated$1 = (OrderPaymentMethodUpdateRepository$notifyOrderUpdated$1) continuationImpl;
            int i2 = orderPaymentMethodUpdateRepository$notifyOrderUpdated$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderPaymentMethodUpdateRepository$notifyOrderUpdated$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderPaymentMethodUpdateRepository$notifyOrderUpdated$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderPaymentMethodUpdateRepository$notifyOrderUpdated$1.label;
                Object obj2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n20 n20Var = this.a;
                    orderPaymentMethodUpdateRepository$notifyOrderUpdated$1.L$0 = str;
                    orderPaymentMethodUpdateRepository$notifyOrderUpdated$1.label = 1;
                    obj = ((com.yandex.go.taxi.order.provider.a) n20Var).k(orderPaymentMethodUpdateRepository$notifyOrderUpdated$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) orderPaymentMethodUpdateRepository$notifyOrderUpdated$1.L$0;
                    kotlin.b.b(obj);
                }
                it = ((Iterable) obj).iterator();
                while (true) {
                    if (it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (jl40.l(((o2y0) next).b().a, str)) {
                        obj2 = next;
                        break;
                    }
                }
                o2y0Var = (o2y0) obj2;
                if (o2y0Var != null && (b = o2y0Var.b()) != null) {
                    synchronized (b) {
                        b.l = b.l.O(true);
                    }
                }
                this.b.g(str);
                return zy11.a;
            }
        }
        orderPaymentMethodUpdateRepository$notifyOrderUpdated$1 = new OrderPaymentMethodUpdateRepository$notifyOrderUpdated$1(this, continuationImpl);
        Object obj3 = orderPaymentMethodUpdateRepository$notifyOrderUpdated$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderPaymentMethodUpdateRepository$notifyOrderUpdated$1.label;
        Object obj22 = null;
        if (i != 0) {
        }
        it = ((Iterable) obj3).iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        o2y0Var = (o2y0) obj22;
        if (o2y0Var != null) {
            synchronized (b) {
            }
        }
        this.b.g(str);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c A[EDGE_INSN: B:38:0x006c->B:17:0x006c BREAK  A[LOOP:0: B:11:0x0052->B:37:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, ContinuationImpl continuationImpl) {
        OrderPaymentMethodUpdateRepository$removePendingChange$1 orderPaymentMethodUpdateRepository$removePendingChange$1;
        int i;
        Iterator it;
        o2y0 o2y0Var;
        Object value;
        TaxiOrder taxiOrder;
        if (continuationImpl instanceof OrderPaymentMethodUpdateRepository$removePendingChange$1) {
            orderPaymentMethodUpdateRepository$removePendingChange$1 = (OrderPaymentMethodUpdateRepository$removePendingChange$1) continuationImpl;
            int i2 = orderPaymentMethodUpdateRepository$removePendingChange$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderPaymentMethodUpdateRepository$removePendingChange$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderPaymentMethodUpdateRepository$removePendingChange$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderPaymentMethodUpdateRepository$removePendingChange$1.label;
                Object obj2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n20 n20Var = this.a;
                    orderPaymentMethodUpdateRepository$removePendingChange$1.L$0 = str;
                    orderPaymentMethodUpdateRepository$removePendingChange$1.L$1 = str2;
                    orderPaymentMethodUpdateRepository$removePendingChange$1.label = 1;
                    obj = ((com.yandex.go.taxi.order.provider.a) n20Var).k(orderPaymentMethodUpdateRepository$removePendingChange$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) orderPaymentMethodUpdateRepository$removePendingChange$1.L$1;
                    str = (String) orderPaymentMethodUpdateRepository$removePendingChange$1.L$0;
                    kotlin.b.b(obj);
                }
                it = ((Iterable) obj).iterator();
                while (true) {
                    if (it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (jl40.l(((o2y0) next).b().a, str)) {
                        obj2 = next;
                        break;
                    }
                }
                o2y0Var = (o2y0) obj2;
                if (o2y0Var != null) {
                    r0 r0Var = o2y0Var.a;
                    do {
                        value = r0Var.getValue();
                        taxiOrder = (TaxiOrder) value;
                        synchronized (taxiOrder) {
                            taxiOrder.i = taxiOrder.i.i(str2);
                        }
                    } while (!r0Var.k(value, taxiOrder));
                    o2y0Var.f();
                }
                return zy11.a;
            }
        }
        orderPaymentMethodUpdateRepository$removePendingChange$1 = new OrderPaymentMethodUpdateRepository$removePendingChange$1(this, continuationImpl);
        Object obj3 = orderPaymentMethodUpdateRepository$removePendingChange$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderPaymentMethodUpdateRepository$removePendingChange$1.label;
        Object obj22 = null;
        if (i != 0) {
        }
        it = ((Iterable) obj3).iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        o2y0Var = (o2y0) obj22;
        if (o2y0Var != null) {
        }
        return zy11.a;
    }
}
