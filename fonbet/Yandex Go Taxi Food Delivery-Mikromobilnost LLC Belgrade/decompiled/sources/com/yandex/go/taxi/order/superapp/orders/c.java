package com.yandex.go.taxi.order.superapp.orders;

import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.ab00;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ h b;
    public final /* synthetic */ OrderScreen c;

    public c(tpr[] tprVarArr, h hVar, OrderScreen orderScreen) {
        this.a = tprVarArr;
        this.b = hVar;
        this.c = orderScreen;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OrderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$1 orderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$1;
        int i;
        if (continuation instanceof OrderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$1) {
            orderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$1 = (OrderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$1) continuation;
            int i2 = orderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    ab00 ab00Var = new ab00(tprVarArr, 6);
                    OrderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$3 orderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$3 = new OrderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$3(null, this.b, this.c);
                    orderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$1.L$0 = null;
                    orderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$1.L$1 = null;
                    orderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$1.L$2 = null;
                    orderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$1.label = 1;
                    if (kotlinx.coroutines.flow.internal.j.a(vprVar, ab00Var, orderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$3, orderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        orderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$1 = new OrderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$1(this, continuation);
        Object obj2 = orderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderActionButtonsProvider$orderActionsFlow$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
