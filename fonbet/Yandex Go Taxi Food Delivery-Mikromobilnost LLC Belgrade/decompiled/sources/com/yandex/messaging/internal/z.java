package com.yandex.messaging.internal;

import defpackage.in21;
import defpackage.myj0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class z implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ a0 b;
    public final /* synthetic */ String c;

    public z(vpr vprVar, a0 a0Var, String str) {
        this.a = vprVar;
        this.b = a0Var;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetUserInfoWithErrorUseCase$dbFlow$$inlined$map$1$2$1 getUserInfoWithErrorUseCase$dbFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GetUserInfoWithErrorUseCase$dbFlow$$inlined$map$1$2$1) {
            getUserInfoWithErrorUseCase$dbFlow$$inlined$map$1$2$1 = (GetUserInfoWithErrorUseCase$dbFlow$$inlined$map$1$2$1) continuation;
            int i2 = getUserInfoWithErrorUseCase$dbFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getUserInfoWithErrorUseCase$dbFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getUserInfoWithErrorUseCase$dbFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getUserInfoWithErrorUseCase$dbFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    in21 a = this.b.c.a().a(this.c);
                    myj0 myj0Var = a != null ? new myj0(a) : null;
                    getUserInfoWithErrorUseCase$dbFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(myj0Var, getUserInfoWithErrorUseCase$dbFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        getUserInfoWithErrorUseCase$dbFlow$$inlined$map$1$2$1 = new GetUserInfoWithErrorUseCase$dbFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getUserInfoWithErrorUseCase$dbFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getUserInfoWithErrorUseCase$dbFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
