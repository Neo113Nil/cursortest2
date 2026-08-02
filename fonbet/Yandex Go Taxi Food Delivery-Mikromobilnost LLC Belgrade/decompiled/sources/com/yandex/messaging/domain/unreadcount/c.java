package com.yandex.messaging.domain.unreadcount;

import com.yandex.messaging.ChatRequest;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.x221;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ d b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ ChatRequest w;

    public c(vpr vprVar, d dVar, Long l, ChatRequest chatRequest) {
        this.a = vprVar;
        this.b = dVar;
        this.c = l;
        this.w = chatRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetUnreadCountUseCase$unseenCounterFlow$1$invokeSuspend$$inlined$map$1$2$1 getUnreadCountUseCase$unseenCounterFlow$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GetUnreadCountUseCase$unseenCounterFlow$1$invokeSuspend$$inlined$map$1$2$1) {
            getUnreadCountUseCase$unseenCounterFlow$1$invokeSuspend$$inlined$map$1$2$1 = (GetUnreadCountUseCase$unseenCounterFlow$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = getUnreadCountUseCase$unseenCounterFlow$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getUnreadCountUseCase$unseenCounterFlow$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getUnreadCountUseCase$unseenCounterFlow$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getUnreadCountUseCase$unseenCounterFlow$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    x221 g = this.b.b.g(this.c, this.w);
                    getUnreadCountUseCase$unseenCounterFlow$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(g, getUnreadCountUseCase$unseenCounterFlow$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        getUnreadCountUseCase$unseenCounterFlow$1$invokeSuspend$$inlined$map$1$2$1 = new GetUnreadCountUseCase$unseenCounterFlow$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getUnreadCountUseCase$unseenCounterFlow$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getUnreadCountUseCase$unseenCounterFlow$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
