package com.yandex.messaging.internal;

import defpackage.m8g;
import defpackage.ny61;
import defpackage.s020;
import defpackage.t4t;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ t4t b;
    public final /* synthetic */ s020 c;

    public f(vpr vprVar, t4t t4tVar, s020 s020Var) {
        this.a = vprVar;
        this.b = t4tVar;
        this.c = s020Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetChatMessageCountUseCase$messagesCountFlow$$inlined$map$1$2$1 getChatMessageCountUseCase$messagesCountFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GetChatMessageCountUseCase$messagesCountFlow$$inlined$map$1$2$1) {
            getChatMessageCountUseCase$messagesCountFlow$$inlined$map$1$2$1 = (GetChatMessageCountUseCase$messagesCountFlow$$inlined$map$1$2$1) continuation;
            int i2 = getChatMessageCountUseCase$messagesCountFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getChatMessageCountUseCase$messagesCountFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getChatMessageCountUseCase$messagesCountFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getChatMessageCountUseCase$messagesCountFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Long x = this.b.c.B().x(((m8g) this.c).a.a);
                    Long l = new Long(x != null ? x.longValue() : 0L);
                    getChatMessageCountUseCase$messagesCountFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(l, getChatMessageCountUseCase$messagesCountFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        getChatMessageCountUseCase$messagesCountFlow$$inlined$map$1$2$1 = new GetChatMessageCountUseCase$messagesCountFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getChatMessageCountUseCase$messagesCountFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getChatMessageCountUseCase$messagesCountFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
