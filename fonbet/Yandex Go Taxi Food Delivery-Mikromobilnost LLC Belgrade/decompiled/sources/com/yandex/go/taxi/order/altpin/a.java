package com.yandex.go.taxi.order.altpin;

import defpackage.d2y0;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.order.f;

/* loaded from: classes14.dex */
public final class a {
    public final n20 a;
    public final d2y0 b;

    public a(n20 n20Var, d2y0 d2y0Var) {
        this.a = n20Var;
        this.b = d2y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        OrdersWalkingRouteInteractor$checkWalkingRouteActivity$1 ordersWalkingRouteInteractor$checkWalkingRouteActivity$1;
        int i;
        if (continuationImpl instanceof OrdersWalkingRouteInteractor$checkWalkingRouteActivity$1) {
            ordersWalkingRouteInteractor$checkWalkingRouteActivity$1 = (OrdersWalkingRouteInteractor$checkWalkingRouteActivity$1) continuationImpl;
            int i2 = ordersWalkingRouteInteractor$checkWalkingRouteActivity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ordersWalkingRouteInteractor$checkWalkingRouteActivity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ordersWalkingRouteInteractor$checkWalkingRouteActivity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ordersWalkingRouteInteractor$checkWalkingRouteActivity$1.label;
                if (i != 0) {
                    b.b(obj);
                    n20 n20Var = this.a;
                    ordersWalkingRouteInteractor$checkWalkingRouteActivity$1.label = 1;
                    obj = ((com.yandex.go.taxi.order.provider.a) n20Var).k(ordersWalkingRouteInteractor$checkWalkingRouteActivity$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                for (o2y0 o2y0Var : (Iterable) obj) {
                    if (o2y0Var.b().l.y && !o2y0Var.b().l.A) {
                        ((f) this.b.a).a0(o2y0Var);
                    }
                }
                return zy11.a;
            }
        }
        ordersWalkingRouteInteractor$checkWalkingRouteActivity$1 = new OrdersWalkingRouteInteractor$checkWalkingRouteActivity$1(this, continuationImpl);
        Object obj2 = ordersWalkingRouteInteractor$checkWalkingRouteActivity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ordersWalkingRouteInteractor$checkWalkingRouteActivity$1.label;
        if (i != 0) {
        }
        while (r5.hasNext()) {
        }
        return zy11.a;
    }
}
