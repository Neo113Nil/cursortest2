package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import defpackage.ny61;
import defpackage.tpr;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class z0 implements com.yandex.passport.common.mvi.e {
    public final com.yandex.passport.internal.usecase.j1 a;

    public z0(com.yandex.passport.internal.usecase.j1 j1Var) {
        this.a = j1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(z0 z0Var, ModernAccount modernAccount, ContinuationImpl continuationImpl) {
        SetCurrentAccountMiddleware$setCurrentAccount$1 setCurrentAccountMiddleware$setCurrentAccount$1;
        int i;
        z0Var.getClass();
        if (continuationImpl instanceof SetCurrentAccountMiddleware$setCurrentAccount$1) {
            setCurrentAccountMiddleware$setCurrentAccount$1 = (SetCurrentAccountMiddleware$setCurrentAccount$1) continuationImpl;
            int i2 = setCurrentAccountMiddleware$setCurrentAccount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                setCurrentAccountMiddleware$setCurrentAccount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = setCurrentAccountMiddleware$setCurrentAccount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setCurrentAccountMiddleware$setCurrentAccount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.usecase.j1 j1Var = z0Var.a;
                    Uid uid = modernAccount.getUid();
                    setCurrentAccountMiddleware$setCurrentAccount$1.label = 1;
                    obj = j1Var.a(uid, setCurrentAccountMiddleware$setCurrentAccount$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        setCurrentAccountMiddleware$setCurrentAccount$1 = new SetCurrentAccountMiddleware$setCurrentAccount$1(z0Var, continuationImpl);
        Object obj2 = setCurrentAccountMiddleware$setCurrentAccount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setCurrentAccountMiddleware$setCurrentAccount$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    @Override // com.yandex.passport.common.mvi.e
    public final tpr a(kotlinx.coroutines.flow.n0 n0Var) {
        return new com.yandex.passport.common.mvi.c(new com.yandex.passport.internal.impl.d(n0Var, 17), this, 9);
    }
}
