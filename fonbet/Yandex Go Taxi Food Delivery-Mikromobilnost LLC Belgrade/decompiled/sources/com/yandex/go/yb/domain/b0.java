package com.yandex.go.yb.domain;

import defpackage.iw51;
import defpackage.nw51;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class b0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f0 b;

    public b0(vpr vprVar, f0 f0Var) {
        this.a = vprVar;
        this.b = f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (defpackage.py51.a(r7) != null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        YbWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$2$1 ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof YbWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$2$1) {
            ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$2$1 = (YbWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
            int i2 = ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    nw51 nw51Var = (nw51) obj;
                    if (!(nw51Var instanceof iw51)) {
                        this.b.h.getClass();
                    }
                    ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$2$1.L$0 = null;
                    ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$2$1.L$1 = null;
                    ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$2$1.L$2 = null;
                    ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$2$1.L$3 = null;
                    ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                    if (this.a.emit(obj, ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$2$1 = new YbWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
