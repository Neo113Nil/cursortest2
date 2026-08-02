package com.yandex.messaging.domain.chat;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.PrivateChatRequest;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ChatRequest b;

    public f(vpr vprVar, ChatRequest chatRequest) {
        this.a = vprVar;
        this.b = chatRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        IsSavedMessagesUseCase$run$$inlined$map$1$2$1 isSavedMessagesUseCase$run$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof IsSavedMessagesUseCase$run$$inlined$map$1$2$1) {
            isSavedMessagesUseCase$run$$inlined$map$1$2$1 = (IsSavedMessagesUseCase$run$$inlined$map$1$2$1) continuation;
            int i2 = isSavedMessagesUseCase$run$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                isSavedMessagesUseCase$run$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = isSavedMessagesUseCase$run$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = isSavedMessagesUseCase$run$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(jl40.l(((PrivateChatRequest) this.b).addressee(), (String) obj));
                    isSavedMessagesUseCase$run$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, isSavedMessagesUseCase$run$$inlined$map$1$2$1) == coroutineSingletons) {
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
        isSavedMessagesUseCase$run$$inlined$map$1$2$1 = new IsSavedMessagesUseCase$run$$inlined$map$1$2$1(this, continuation);
        Object obj22 = isSavedMessagesUseCase$run$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = isSavedMessagesUseCase$run$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
