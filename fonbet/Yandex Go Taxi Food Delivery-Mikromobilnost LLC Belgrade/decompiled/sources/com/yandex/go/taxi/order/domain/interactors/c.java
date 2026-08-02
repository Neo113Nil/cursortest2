package com.yandex.go.taxi.order.domain.interactors;

import defpackage.jl40;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class c {
    public final n20 a;

    public c(n20 n20Var) {
        this.a = n20Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[EDGE_INSN: B:24:0x0065->B:17:0x0065 BREAK  A[LOOP:0: B:11:0x004b->B:23:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        OrderHolderUpdateInteractor$notifyOrderUpdated$1 orderHolderUpdateInteractor$notifyOrderUpdated$1;
        int i;
        Iterator it;
        o2y0 o2y0Var;
        if (continuationImpl instanceof OrderHolderUpdateInteractor$notifyOrderUpdated$1) {
            orderHolderUpdateInteractor$notifyOrderUpdated$1 = (OrderHolderUpdateInteractor$notifyOrderUpdated$1) continuationImpl;
            int i2 = orderHolderUpdateInteractor$notifyOrderUpdated$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderHolderUpdateInteractor$notifyOrderUpdated$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderHolderUpdateInteractor$notifyOrderUpdated$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderHolderUpdateInteractor$notifyOrderUpdated$1.label;
                Object obj2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    orderHolderUpdateInteractor$notifyOrderUpdated$1.L$0 = str;
                    orderHolderUpdateInteractor$notifyOrderUpdated$1.label = 1;
                    obj = ((com.yandex.go.taxi.order.provider.a) this.a).k(orderHolderUpdateInteractor$notifyOrderUpdated$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) orderHolderUpdateInteractor$notifyOrderUpdated$1.L$0;
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
                    o2y0Var.f();
                }
                return zy11.a;
            }
        }
        orderHolderUpdateInteractor$notifyOrderUpdated$1 = new OrderHolderUpdateInteractor$notifyOrderUpdated$1(this, continuationImpl);
        Object obj3 = orderHolderUpdateInteractor$notifyOrderUpdated$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderHolderUpdateInteractor$notifyOrderUpdated$1.label;
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
