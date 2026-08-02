package com.yandex.go.taxi.order.cancel;

import com.yandex.go.taxi.order.api.OrderApi;
import com.yandex.go.taxi.order.models.api.request.OrderStatusParam;
import defpackage.cmt;
import defpackage.ep21;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.qw7;
import defpackage.v780;
import defpackage.vng;
import defpackage.vpr;
import defpackage.ym91;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ qw7 b;

    public b(vpr vprVar, qw7 qw7Var) {
        this.a = vprVar;
        this.b = qw7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00df, code lost:
    
        if (r8.emit(r10, r0) != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1 cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1;
        Object obj2;
        CoroutineSingletons coroutineSingletons;
        int i;
        OrderStatusParam orderStatusParam;
        vpr vprVar;
        OrderApi orderApi;
        vpr vprVar2;
        if (continuation instanceof CancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1) {
            cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1 = (CancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                obj2 = cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    orderStatusParam = (OrderStatusParam) obj;
                    qw7 qw7Var = this.b;
                    OrderApi orderApi2 = qw7Var.b;
                    po21 po21Var = qw7Var.e;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar3 = this.a;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$4 = vprVar3;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$5 = null;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$6 = orderStatusParam;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$7 = orderApi2;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.label = 1;
                    obj2 = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).m(cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1);
                    if (obj2 != coroutineSingletons) {
                        vprVar = vprVar3;
                        orderApi = orderApi2;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    orderApi = (OrderApi) cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$7;
                    orderStatusParam = (OrderStatusParam) cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$6;
                    vprVar = (vpr) cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar2 = (vpr) cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$4 = null;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$5 = null;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$6 = null;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.label = 3;
                }
                mo21 A = vng.A((ep21) obj2);
                cmt<v780> a = orderApi.a(A == null ? vng.e(A) : null, orderStatusParam, ym91.a);
                cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$0 = null;
                cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$1 = null;
                cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$2 = null;
                cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$3 = null;
                cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$4 = vprVar;
                cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$5 = null;
                cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$6 = null;
                cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$7 = null;
                cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.label = 2;
                obj2 = ru.yandex.taxi.network.api.a.c(a, null, cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1);
                if (obj2 != coroutineSingletons) {
                    vprVar2 = vprVar;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$4 = null;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$5 = null;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$6 = null;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.label = 3;
                }
                return coroutineSingletons;
            }
        }
        cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1 = new CancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1(this, continuation);
        obj2 = cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        mo21 A2 = vng.A((ep21) obj2);
        cmt<v780> a2 = orderApi.a(A2 == null ? vng.e(A2) : null, orderStatusParam, ym91.a);
        cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$0 = null;
        cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$1 = null;
        cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$2 = null;
        cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$3 = null;
        cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$4 = vprVar;
        cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$5 = null;
        cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$6 = null;
        cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.L$7 = null;
        cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1.label = 2;
        obj2 = ru.yandex.taxi.network.api.a.c(a2, null, cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$2$1);
        if (obj2 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
