package com.yandex.messaging.internal;

import defpackage.m8g;
import defpackage.ny61;
import defpackage.p8t;
import defpackage.r3z;
import defpackage.s020;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class l implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ s020 b;

    public l(vpr vprVar, s020 s020Var) {
        this.a = vprVar;
        this.b = s020Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetLastMessageUseCase$lastMessageFlow$1$invokeSuspend$lambda$3$$inlined$map$1$2$1 getLastMessageUseCase$lastMessageFlow$1$invokeSuspend$lambda$3$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GetLastMessageUseCase$lastMessageFlow$1$invokeSuspend$lambda$3$$inlined$map$1$2$1) {
            getLastMessageUseCase$lastMessageFlow$1$invokeSuspend$lambda$3$$inlined$map$1$2$1 = (GetLastMessageUseCase$lastMessageFlow$1$invokeSuspend$lambda$3$$inlined$map$1$2$1) continuation;
            int i2 = getLastMessageUseCase$lastMessageFlow$1$invokeSuspend$lambda$3$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getLastMessageUseCase$lastMessageFlow$1$invokeSuspend$lambda$3$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getLastMessageUseCase$lastMessageFlow$1$invokeSuspend$lambda$3$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getLastMessageUseCase$lastMessageFlow$1$invokeSuspend$lambda$3$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    p8t p8tVar = new p8t(((m8g) this.b).a, (r3z) obj);
                    getLastMessageUseCase$lastMessageFlow$1$invokeSuspend$lambda$3$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(p8tVar, getLastMessageUseCase$lastMessageFlow$1$invokeSuspend$lambda$3$$inlined$map$1$2$1) == coroutineSingletons) {
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
        getLastMessageUseCase$lastMessageFlow$1$invokeSuspend$lambda$3$$inlined$map$1$2$1 = new GetLastMessageUseCase$lastMessageFlow$1$invokeSuspend$lambda$3$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getLastMessageUseCase$lastMessageFlow$1$invokeSuspend$lambda$3$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getLastMessageUseCase$lastMessageFlow$1$invokeSuspend$lambda$3$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
