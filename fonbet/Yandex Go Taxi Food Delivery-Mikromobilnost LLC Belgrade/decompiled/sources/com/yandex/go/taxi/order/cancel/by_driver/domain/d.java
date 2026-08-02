package com.yandex.go.taxi.order.cancel.by_driver.domain;

import defpackage.ab00;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;

/* loaded from: classes14.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr[] a;

    public d(tpr[] tprVarArr) {
        this.a = tprVarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OrderNotProcessedInteractor$cancelledOrderHoldersFlow$$inlined$combine$1$1 orderNotProcessedInteractor$cancelledOrderHoldersFlow$$inlined$combine$1$1;
        int i;
        if (continuation instanceof OrderNotProcessedInteractor$cancelledOrderHoldersFlow$$inlined$combine$1$1) {
            orderNotProcessedInteractor$cancelledOrderHoldersFlow$$inlined$combine$1$1 = (OrderNotProcessedInteractor$cancelledOrderHoldersFlow$$inlined$combine$1$1) continuation;
            int i2 = orderNotProcessedInteractor$cancelledOrderHoldersFlow$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderNotProcessedInteractor$cancelledOrderHoldersFlow$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderNotProcessedInteractor$cancelledOrderHoldersFlow$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderNotProcessedInteractor$cancelledOrderHoldersFlow$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    ab00 ab00Var = new ab00(tprVarArr, 7);
                    OrderNotProcessedInteractor$cancelledOrderHoldersFlow$$inlined$combine$1$3 orderNotProcessedInteractor$cancelledOrderHoldersFlow$$inlined$combine$1$3 = new OrderNotProcessedInteractor$cancelledOrderHoldersFlow$$inlined$combine$1$3(3, null);
                    orderNotProcessedInteractor$cancelledOrderHoldersFlow$$inlined$combine$1$1.L$0 = null;
                    orderNotProcessedInteractor$cancelledOrderHoldersFlow$$inlined$combine$1$1.L$1 = null;
                    orderNotProcessedInteractor$cancelledOrderHoldersFlow$$inlined$combine$1$1.L$2 = null;
                    orderNotProcessedInteractor$cancelledOrderHoldersFlow$$inlined$combine$1$1.label = 1;
                    if (j.a(vprVar, ab00Var, orderNotProcessedInteractor$cancelledOrderHoldersFlow$$inlined$combine$1$3, orderNotProcessedInteractor$cancelledOrderHoldersFlow$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        orderNotProcessedInteractor$cancelledOrderHoldersFlow$$inlined$combine$1$1 = new OrderNotProcessedInteractor$cancelledOrderHoldersFlow$$inlined$combine$1$1(this, continuation);
        Object obj2 = orderNotProcessedInteractor$cancelledOrderHoldersFlow$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderNotProcessedInteractor$cancelledOrderHoldersFlow$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
