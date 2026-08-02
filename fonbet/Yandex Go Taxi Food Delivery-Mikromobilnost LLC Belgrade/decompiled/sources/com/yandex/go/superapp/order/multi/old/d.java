package com.yandex.go.superapp.order.multi.old;

import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.q6y0;
import defpackage.qc80;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ h b;

    public d(vpr vprVar, h hVar) {
        this.a = vprVar;
        this.b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrdersListViewPresenter$onResume$$inlined$map$2$2$1 ordersListViewPresenter$onResume$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof OrdersListViewPresenter$onResume$$inlined$map$2$2$1) {
            ordersListViewPresenter$onResume$$inlined$map$2$2$1 = (OrdersListViewPresenter$onResume$$inlined$map$2$2$1) continuation;
            int i2 = ordersListViewPresenter$onResume$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ordersListViewPresenter$onResume$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ordersListViewPresenter$onResume$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ordersListViewPresenter$onResume$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    qc80 qc80Var = (qc80) obj;
                    OrderScreen orderScreen = qc80Var.c;
                    List list = qc80Var.b;
                    this.b.F = orderScreen;
                    if (orderScreen == OrderScreen.ORDER_TRACKING && list.size() > 1) {
                        o2y0 o2y0Var = qc80Var.a;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            if (obj3 instanceof q6y0) {
                                arrayList.add(obj3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (jl40.l(((q6y0) next).c, o2y0Var)) {
                                arrayList2.add(next);
                            }
                        }
                        list = kotlin.collections.a.J0(arrayList2);
                    }
                    ordersListViewPresenter$onResume$$inlined$map$2$2$1.L$0 = null;
                    ordersListViewPresenter$onResume$$inlined$map$2$2$1.L$1 = null;
                    ordersListViewPresenter$onResume$$inlined$map$2$2$1.L$2 = null;
                    ordersListViewPresenter$onResume$$inlined$map$2$2$1.L$3 = null;
                    ordersListViewPresenter$onResume$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(list, ordersListViewPresenter$onResume$$inlined$map$2$2$1) == coroutineSingletons) {
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
        ordersListViewPresenter$onResume$$inlined$map$2$2$1 = new OrdersListViewPresenter$onResume$$inlined$map$2$2$1(this, continuation);
        Object obj22 = ordersListViewPresenter$onResume$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ordersListViewPresenter$onResume$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
