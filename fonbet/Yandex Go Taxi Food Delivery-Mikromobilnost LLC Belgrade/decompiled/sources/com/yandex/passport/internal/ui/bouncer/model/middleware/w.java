package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.api.exception.PassportAccountNotAuthorizedException;
import com.yandex.passport.internal.ModernAccount;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class w implements com.yandex.passport.common.mvi.e {
    public final com.yandex.passport.internal.core.accounts.d a;
    public final com.yandex.passport.internal.usecase.ui.r b;

    public w(com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.usecase.ui.r rVar) {
        this.a = dVar;
        this.b = rVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(2:24|(1:26))(2:27|28))|11|12|(2:14|15)(2:17|18)))|36|6|7|(0)(0)|11|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        r5 = new kotlin.Result.Failure(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005f, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0056, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        r5 = new kotlin.Result.Failure(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(w wVar, com.yandex.passport.internal.ui.bouncer.model.n nVar, ContinuationImpl continuationImpl) {
        DeleteBlockedMiddleware$deleteBlocked$1 deleteBlockedMiddleware$deleteBlocked$1;
        int i;
        Throwable a;
        wVar.getClass();
        if (continuationImpl instanceof DeleteBlockedMiddleware$deleteBlocked$1) {
            deleteBlockedMiddleware$deleteBlocked$1 = (DeleteBlockedMiddleware$deleteBlocked$1) continuationImpl;
            int i2 = deleteBlockedMiddleware$deleteBlocked$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deleteBlockedMiddleware$deleteBlocked$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deleteBlockedMiddleware$deleteBlocked$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deleteBlockedMiddleware$deleteBlocked$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ModernAccount e = wVar.a.a().e(nVar.a);
                    if (e == null) {
                        throw new PassportAccountNotAuthorizedException();
                    }
                    com.yandex.passport.internal.usecase.ui.r rVar = wVar.b;
                    deleteBlockedMiddleware$deleteBlocked$1.label = 1;
                    if (rVar.a(e, deleteBlockedMiddleware$deleteBlocked$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Object obj2 = zy11.a;
                a = Result.a(obj2);
                if (a == null) {
                    return new com.yandex.passport.internal.ui.bouncer.model.s(new com.yandex.passport.internal.ui.bouncer.model.m1(a));
                }
                return new com.yandex.passport.internal.ui.bouncer.model.s(com.yandex.passport.internal.ui.bouncer.model.n1.a);
            }
        }
        deleteBlockedMiddleware$deleteBlocked$1 = new DeleteBlockedMiddleware$deleteBlocked$1(wVar, continuationImpl);
        Object obj3 = deleteBlockedMiddleware$deleteBlocked$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deleteBlockedMiddleware$deleteBlocked$1.label;
        if (i != 0) {
        }
        Object obj22 = zy11.a;
        a = Result.a(obj22);
        if (a == null) {
        }
    }

    @Override // com.yandex.passport.common.mvi.e
    public final tpr a(kotlinx.coroutines.flow.n0 n0Var) {
        return new com.yandex.passport.common.mvi.c(new com.yandex.passport.internal.impl.d(n0Var, 6), this, 5);
    }
}
