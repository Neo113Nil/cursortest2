package com.yandex.passport.internal.push;

import com.yandex.passport.api.PushPlatform;
import defpackage.kgx;
import defpackage.ny61;
import defpackage.uo2;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class t implements r {
    public final c a;
    public final com.yandex.passport.internal.storage.i b;
    public final PushPlatform c;
    public final String d;

    public t(c cVar, com.yandex.passport.internal.storage.i iVar, PushPlatform pushPlatform, String str) {
        this.a = cVar;
        this.b = iVar;
        this.c = pushPlatform;
        this.d = str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24))|12|(1:14)|16|17))|26|6|7|(0)(0)|12|(0)|16|17) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[Catch: Exception -> 0x0068, TRY_LEAVE, TryCatch #0 {Exception -> 0x0068, blocks: (B:11:0x002b, B:12:0x004a, B:14:0x005f, B:22:0x0039), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.yandex.passport.internal.push.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        PassportPushRegistrationService$UpdateSubscriptionTokenHandler$handleJob$1 passportPushRegistrationService$UpdateSubscriptionTokenHandler$handleJob$1;
        int i;
        com.yandex.passport.internal.storage.i iVar;
        uo2 uo2Var;
        kgx[] kgxVarArr;
        if (continuation instanceof PassportPushRegistrationService$UpdateSubscriptionTokenHandler$handleJob$1) {
            passportPushRegistrationService$UpdateSubscriptionTokenHandler$handleJob$1 = (PassportPushRegistrationService$UpdateSubscriptionTokenHandler$handleJob$1) continuation;
            int i2 = passportPushRegistrationService$UpdateSubscriptionTokenHandler$handleJob$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportPushRegistrationService$UpdateSubscriptionTokenHandler$handleJob$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportPushRegistrationService$UpdateSubscriptionTokenHandler$handleJob$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportPushRegistrationService$UpdateSubscriptionTokenHandler$handleJob$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = this.a;
                    PushPlatform pushPlatform = this.c;
                    String str = this.d;
                    passportPushRegistrationService$UpdateSubscriptionTokenHandler$handleJob$1.L$0 = this;
                    passportPushRegistrationService$UpdateSubscriptionTokenHandler$handleJob$1.label = 1;
                    if (cVar.f(pushPlatform, str, passportPushRegistrationService$UpdateSubscriptionTokenHandler$handleJob$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (t) passportPushRegistrationService$UpdateSubscriptionTokenHandler$handleJob$1.L$0;
                    kotlin.b.b(obj);
                }
                iVar = this.b;
                uo2Var = iVar.b;
                kgxVarArr = com.yandex.passport.internal.storage.i.m;
                if (!"7.55.1".equals((String) uo2Var.getValue(iVar, kgxVarArr[0]))) {
                    com.yandex.passport.internal.storage.i iVar2 = this.b;
                    iVar2.b.setValue(iVar2, kgxVarArr[0], "7.55.1");
                }
                return zy11.a;
            }
        }
        passportPushRegistrationService$UpdateSubscriptionTokenHandler$handleJob$1 = new PassportPushRegistrationService$UpdateSubscriptionTokenHandler$handleJob$1(this, (ContinuationImpl) continuation);
        Object obj2 = passportPushRegistrationService$UpdateSubscriptionTokenHandler$handleJob$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportPushRegistrationService$UpdateSubscriptionTokenHandler$handleJob$1.label;
        if (i != 0) {
        }
        iVar = this.b;
        uo2Var = iVar.b;
        kgxVarArr = com.yandex.passport.internal.storage.i.m;
        if (!"7.55.1".equals((String) uo2Var.getValue(iVar, kgxVarArr[0]))) {
        }
        return zy11.a;
    }
}
