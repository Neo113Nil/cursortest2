package com.yandex.go.taxi.order.cancel;

import defpackage.ny61;
import defpackage.qw7;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c implements tpr {
    public final /* synthetic */ rol0 a;
    public final /* synthetic */ qw7 b;

    public c(rol0 rol0Var, qw7 qw7Var) {
        this.a = rol0Var;
        this.b = qw7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        CancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$1 cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof CancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$1) {
            cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$1 = (CancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$1) continuation;
            int i2 = cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b);
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$1.L$0 = null;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$1.L$1 = null;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$1.L$2 = null;
                    cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
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
        cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$1 = new CancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
