package com.yandex.go.yb.domain;

import defpackage.gl3;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class z implements vpr {
    public final /* synthetic */ vpr a;

    public z(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        YbWalletOpenedUpdateStateInteractor$observeAuthStatus$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 ybWalletOpenedUpdateStateInteractor$observeAuthStatus$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i;
        if (continuation instanceof YbWalletOpenedUpdateStateInteractor$observeAuthStatus$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
            ybWalletOpenedUpdateStateInteractor$observeAuthStatus$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (YbWalletOpenedUpdateStateInteractor$observeAuthStatus$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
            int i2 = ybWalletOpenedUpdateStateInteractor$observeAuthStatus$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybWalletOpenedUpdateStateInteractor$observeAuthStatus$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ybWalletOpenedUpdateStateInteractor$observeAuthStatus$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybWalletOpenedUpdateStateInteractor$observeAuthStatus$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (obj instanceof gl3) {
                        ybWalletOpenedUpdateStateInteractor$observeAuthStatus$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.L$0 = null;
                        ybWalletOpenedUpdateStateInteractor$observeAuthStatus$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.L$1 = null;
                        ybWalletOpenedUpdateStateInteractor$observeAuthStatus$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.L$2 = null;
                        ybWalletOpenedUpdateStateInteractor$observeAuthStatus$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.L$3 = null;
                        ybWalletOpenedUpdateStateInteractor$observeAuthStatus$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                        if (this.a.emit(obj, ybWalletOpenedUpdateStateInteractor$observeAuthStatus$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        ybWalletOpenedUpdateStateInteractor$observeAuthStatus$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new YbWalletOpenedUpdateStateInteractor$observeAuthStatus$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
        Object obj22 = ybWalletOpenedUpdateStateInteractor$observeAuthStatus$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybWalletOpenedUpdateStateInteractor$observeAuthStatus$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
