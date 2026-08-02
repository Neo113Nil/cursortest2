package com.yandex.go.flex.main_screen.data.widgets.orders;

import defpackage.i601;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ i601 b;
    public final /* synthetic */ e c;

    public d(tpr tprVar, i601 i601Var, e eVar) {
        this.a = tprVar;
        this.b = i601Var;
        this.c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OrdersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$1 ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof OrdersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$1) {
            ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$1 = (OrdersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b, this.c);
                    ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$1 = new OrdersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
