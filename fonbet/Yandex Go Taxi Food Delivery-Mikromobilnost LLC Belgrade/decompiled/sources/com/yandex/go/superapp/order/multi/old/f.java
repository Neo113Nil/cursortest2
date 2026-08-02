package com.yandex.go.superapp.order.multi.old;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ List b;

    public f(vpr vprVar, List list) {
        this.a = vprVar;
        this.b = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrdersListViewPresenter$onResume$lambda$2$$inlined$map$1$2$1 ordersListViewPresenter$onResume$lambda$2$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof OrdersListViewPresenter$onResume$lambda$2$$inlined$map$1$2$1) {
            ordersListViewPresenter$onResume$lambda$2$$inlined$map$1$2$1 = (OrdersListViewPresenter$onResume$lambda$2$$inlined$map$1$2$1) continuation;
            int i2 = ordersListViewPresenter$onResume$lambda$2$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ordersListViewPresenter$onResume$lambda$2$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ordersListViewPresenter$onResume$lambda$2$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ordersListViewPresenter$onResume$lambda$2$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = new Pair(this.b, (List) obj);
                    ordersListViewPresenter$onResume$lambda$2$$inlined$map$1$2$1.L$0 = null;
                    ordersListViewPresenter$onResume$lambda$2$$inlined$map$1$2$1.L$1 = null;
                    ordersListViewPresenter$onResume$lambda$2$$inlined$map$1$2$1.L$2 = null;
                    ordersListViewPresenter$onResume$lambda$2$$inlined$map$1$2$1.L$3 = null;
                    ordersListViewPresenter$onResume$lambda$2$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pair, ordersListViewPresenter$onResume$lambda$2$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        ordersListViewPresenter$onResume$lambda$2$$inlined$map$1$2$1 = new OrdersListViewPresenter$onResume$lambda$2$$inlined$map$1$2$1(this, continuation);
        Object obj22 = ordersListViewPresenter$onResume$lambda$2$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ordersListViewPresenter$onResume$lambda$2$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
