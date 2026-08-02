package com.yandex.go.superapp.order.multi.old;

import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.ny61;
import defpackage.qc80;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ h b;

    public b(vpr vprVar, h hVar) {
        this.a = vprVar;
        this.b = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
    
        if (r9.emit(r10, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrdersListViewPresenter$onResume$$inlined$map$1$2$1 ordersListViewPresenter$onResume$$inlined$map$1$2$1;
        int i;
        qc80 qc80Var;
        vpr vprVar;
        vpr vprVar2;
        qc80 qc80Var2;
        if (continuation instanceof OrdersListViewPresenter$onResume$$inlined$map$1$2$1) {
            ordersListViewPresenter$onResume$$inlined$map$1$2$1 = (OrdersListViewPresenter$onResume$$inlined$map$1$2$1) continuation;
            int i2 = ordersListViewPresenter$onResume$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ordersListViewPresenter$onResume$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ordersListViewPresenter$onResume$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ordersListViewPresenter$onResume$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    qc80Var = (qc80) obj;
                    OrderScreen orderScreen = this.b.F;
                    vprVar = this.a;
                    if (orderScreen != null && qc80Var.c == OrderScreen.ORDER_LIST && orderScreen == OrderScreen.ORDER_TRACKING) {
                        ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$0 = null;
                        ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$1 = null;
                        ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$2 = null;
                        ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$3 = null;
                        ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$4 = vprVar;
                        ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$5 = null;
                        ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$6 = qc80Var;
                        ordersListViewPresenter$onResume$$inlined$map$1$2$1.label = 1;
                        if (kotlinx.coroutines.a.i(500L, ordersListViewPresenter$onResume$$inlined$map$1$2$1) != coroutineSingletons) {
                            vprVar2 = vprVar;
                            qc80Var2 = qc80Var;
                        }
                        return coroutineSingletons;
                    }
                    ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$0 = null;
                    ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$1 = null;
                    ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$2 = null;
                    ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$3 = null;
                    ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$4 = null;
                    ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$5 = null;
                    ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$6 = null;
                    ordersListViewPresenter$onResume$$inlined$map$1$2$1.label = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    qc80Var2 = (qc80) ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$6;
                    vprVar2 = (vpr) ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                vpr vprVar3 = vprVar2;
                qc80Var = qc80Var2;
                vprVar = vprVar3;
                ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$0 = null;
                ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$1 = null;
                ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$2 = null;
                ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$3 = null;
                ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$4 = null;
                ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$5 = null;
                ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$6 = null;
                ordersListViewPresenter$onResume$$inlined$map$1$2$1.label = 2;
            }
        }
        ordersListViewPresenter$onResume$$inlined$map$1$2$1 = new OrdersListViewPresenter$onResume$$inlined$map$1$2$1(this, continuation);
        Object obj22 = ordersListViewPresenter$onResume$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ordersListViewPresenter$onResume$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        vpr vprVar32 = vprVar2;
        qc80Var = qc80Var2;
        vprVar = vprVar32;
        ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$0 = null;
        ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$1 = null;
        ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$2 = null;
        ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$3 = null;
        ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$4 = null;
        ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$5 = null;
        ordersListViewPresenter$onResume$$inlined$map$1$2$1.L$6 = null;
        ordersListViewPresenter$onResume$$inlined$map$1$2$1.label = 2;
    }
}
