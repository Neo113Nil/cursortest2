package com.yandex.messaging.domain.statuses;

import defpackage.e3n;
import defpackage.hlf;
import defpackage.it21;
import defpackage.ny61;
import defpackage.o430;
import defpackage.vpr;
import defpackage.yt21;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class k implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ yt21 b;

    public k(vpr vprVar, yt21 yt21Var) {
        this.a = vprVar;
        this.b = yt21Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UserStatusRepository$emitUserStatusFlow$$inlined$map$1$2$1 userStatusRepository$emitUserStatusFlow$$inlined$map$1$2$1;
        int i;
        long j;
        if (continuation instanceof UserStatusRepository$emitUserStatusFlow$$inlined$map$1$2$1) {
            userStatusRepository$emitUserStatusFlow$$inlined$map$1$2$1 = (UserStatusRepository$emitUserStatusFlow$$inlined$map$1$2$1) continuation;
            int i2 = userStatusRepository$emitUserStatusFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userStatusRepository$emitUserStatusFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = userStatusRepository$emitUserStatusFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userStatusRepository$emitUserStatusFlow$$inlined$map$1$2$1.label;
                it21 it21Var = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    it21 it21Var2 = (it21) obj;
                    if (((hlf) this.b.f.get()).w) {
                        it21Var = it21Var2;
                    } else if (it21Var2 != null) {
                        StatusAvailability statusAvailability = it21Var2.c;
                        if (statusAvailability == StatusAvailability.Default) {
                            o430 o430Var = e3n.b;
                            j = 0;
                        } else {
                            j = it21Var2.e;
                        }
                        it21Var = new it21(it21Var2.a, it21Var2.b, statusAvailability, it21Var2.d, j, null);
                    }
                    userStatusRepository$emitUserStatusFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(it21Var, userStatusRepository$emitUserStatusFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        userStatusRepository$emitUserStatusFlow$$inlined$map$1$2$1 = new UserStatusRepository$emitUserStatusFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = userStatusRepository$emitUserStatusFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userStatusRepository$emitUserStatusFlow$$inlined$map$1$2$1.label;
        it21 it21Var3 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
