package com.yandex.passport.internal.push;

import defpackage.h3y;
import defpackage.kgx;
import defpackage.ny61;
import defpackage.uo2;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class y extends com.yandex.passport.common.domain.d {
    public final com.yandex.passport.internal.storage.i b;
    public final h3y c;

    public y(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.storage.i iVar, h3y h3yVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = iVar;
        this.c = h3yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(x xVar, ContinuationImpl continuationImpl) {
        PassportPushRegistrationUseCase$run$1 passportPushRegistrationUseCase$run$1;
        int i;
        com.yandex.passport.internal.storage.i iVar;
        uo2 uo2Var;
        kgx[] kgxVarArr;
        if (continuationImpl instanceof PassportPushRegistrationUseCase$run$1) {
            passportPushRegistrationUseCase$run$1 = (PassportPushRegistrationUseCase$run$1) continuationImpl;
            int i2 = passportPushRegistrationUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportPushRegistrationUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportPushRegistrationUseCase$run$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportPushRegistrationUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = (c) this.c.get();
                    passportPushRegistrationUseCase$run$1.L$0 = this;
                    passportPushRegistrationUseCase$run$1.label = 1;
                    if (xVar.a(cVar, passportPushRegistrationUseCase$run$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (y) passportPushRegistrationUseCase$run$1.L$0;
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
        passportPushRegistrationUseCase$run$1 = new PassportPushRegistrationUseCase$run$1(this, continuationImpl);
        Object obj3 = passportPushRegistrationUseCase$run$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportPushRegistrationUseCase$run$1.label;
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
