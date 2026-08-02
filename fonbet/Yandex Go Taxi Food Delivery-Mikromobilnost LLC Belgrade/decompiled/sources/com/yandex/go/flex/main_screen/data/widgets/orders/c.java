package com.yandex.go.flex.main_screen.data.widgets.orders;

import android.graphics.RectF;
import defpackage.hzx;
import defpackage.i601;
import defpackage.lkn;
import defpackage.ny61;
import defpackage.pfs0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ i601 b;
    public final /* synthetic */ e c;

    public c(vpr vprVar, i601 i601Var, e eVar) {
        this.a = vprVar;
        this.b = i601Var;
        this.c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrdersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$2$1 ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        RectF rectF;
        lkn lknVar;
        if (continuation instanceof OrdersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$2$1) {
            ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$2$1 = (OrdersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pfs0 pfs0Var = (pfs0) obj;
                    hzx hzxVar = this.b.b;
                    if (hzxVar == null || (lknVar = hzxVar.a) == null) {
                        rectF = null;
                    } else {
                        this.c.getClass();
                        rectF = new RectF(lknVar.c(), lknVar.d(), lknVar.b(), lknVar.a());
                    }
                    pfs0 pfs0Var2 = new pfs0(pfs0Var.a, pfs0Var.b, pfs0Var.c, pfs0Var.d, pfs0Var.e, pfs0Var.f, pfs0Var.g, pfs0Var.h, pfs0Var.i, pfs0Var.j, rectF);
                    ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pfs0Var2, ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$2$1 = new OrdersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ordersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
