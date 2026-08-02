package com.yandex.go.yb.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class c0 implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ f0 b;

    public c0(r0 r0Var, f0 f0Var) {
        this.a = r0Var;
        this.b = f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        YbWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$1 ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$1;
        int i;
        if (continuation instanceof YbWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$1) {
            ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$1 = (YbWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$1) continuation;
            int i2 = ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b0 b0Var = new b0(vprVar, this.b);
                    ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$1.L$0 = null;
                    ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$1.L$1 = null;
                    ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$1.L$2 = null;
                    ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(b0Var, ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$1) == coroutineSingletons) {
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
        ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$1 = new YbWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$1(this, continuation);
        Object obj2 = ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
