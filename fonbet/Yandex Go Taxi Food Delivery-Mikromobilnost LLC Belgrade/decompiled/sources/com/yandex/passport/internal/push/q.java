package com.yandex.passport.internal.push;

import com.yandex.passport.common.core.Uid;
import defpackage.kgx;
import defpackage.ny61;
import defpackage.uo2;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class q implements r {
    public final c a;
    public final com.yandex.passport.internal.storage.i b;
    public final Uid c;

    public q(c cVar, com.yandex.passport.internal.storage.i iVar, Uid uid) {
        this.a = cVar;
        this.b = iVar;
        this.c = uid;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:18|19))(4:20|21|(1:23)(1:26)|(1:25))|12|(1:14)|16))|31|6|7|(0)(0)|12|(0)|16) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0032, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        if ((r7 instanceof java.util.concurrent.CancellationException) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        throw r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[Catch: Exception -> 0x0032, TRY_LEAVE, TryCatch #0 {Exception -> 0x0032, blocks: (B:11:0x002e, B:12:0x0050, B:14:0x0065, B:21:0x003d), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // com.yandex.passport.internal.push.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        PassportPushRegistrationService$InvalidateSubscriptionHandler$handleJob$1 passportPushRegistrationService$InvalidateSubscriptionHandler$handleJob$1;
        int i;
        com.yandex.passport.internal.storage.i iVar;
        uo2 uo2Var;
        kgx[] kgxVarArr;
        if (continuation instanceof PassportPushRegistrationService$InvalidateSubscriptionHandler$handleJob$1) {
            passportPushRegistrationService$InvalidateSubscriptionHandler$handleJob$1 = (PassportPushRegistrationService$InvalidateSubscriptionHandler$handleJob$1) continuation;
            int i2 = passportPushRegistrationService$InvalidateSubscriptionHandler$handleJob$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportPushRegistrationService$InvalidateSubscriptionHandler$handleJob$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportPushRegistrationService$InvalidateSubscriptionHandler$handleJob$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportPushRegistrationService$InvalidateSubscriptionHandler$handleJob$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = this.a;
                    Uid uid = this.c;
                    passportPushRegistrationService$InvalidateSubscriptionHandler$handleJob$1.L$0 = this;
                    passportPushRegistrationService$InvalidateSubscriptionHandler$handleJob$1.label = 1;
                    Object h = cVar.h(null, uid, passportPushRegistrationService$InvalidateSubscriptionHandler$handleJob$1);
                    if (h != coroutineSingletons) {
                        h = zy11Var;
                    }
                    if (h == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (q) passportPushRegistrationService$InvalidateSubscriptionHandler$handleJob$1.L$0;
                    kotlin.b.b(obj);
                }
                iVar = this.b;
                uo2Var = iVar.b;
                kgxVarArr = com.yandex.passport.internal.storage.i.m;
                if (!"7.55.1".equals((String) uo2Var.getValue(iVar, kgxVarArr[0]))) {
                    com.yandex.passport.internal.storage.i iVar2 = this.b;
                    iVar2.b.setValue(iVar2, kgxVarArr[0], "7.55.1");
                }
                return zy11Var;
            }
        }
        passportPushRegistrationService$InvalidateSubscriptionHandler$handleJob$1 = new PassportPushRegistrationService$InvalidateSubscriptionHandler$handleJob$1(this, (ContinuationImpl) continuation);
        Object obj2 = passportPushRegistrationService$InvalidateSubscriptionHandler$handleJob$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportPushRegistrationService$InvalidateSubscriptionHandler$handleJob$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        iVar = this.b;
        uo2Var = iVar.b;
        kgxVarArr = com.yandex.passport.internal.storage.i.m;
        if (!"7.55.1".equals((String) uo2Var.getValue(iVar, kgxVarArr[0]))) {
        }
        return zy11Var2;
    }
}
