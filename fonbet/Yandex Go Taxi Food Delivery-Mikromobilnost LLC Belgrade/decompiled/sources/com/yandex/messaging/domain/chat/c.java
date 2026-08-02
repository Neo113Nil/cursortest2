package com.yandex.messaging.domain.chat;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.PrivateChatRequest;
import com.yandex.messaging.internal.entities.ChatId;
import defpackage.j3b;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.tpr;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class c {
    public final com.yandex.messaging.internal.e a;

    public c(com.yandex.messaging.internal.e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ChatRequest chatRequest, Continuation continuation) {
        GetChatAddresseeGuidUseCase$execute$1 getChatAddresseeGuidUseCase$execute$1;
        int i;
        oyj0 oyj0Var;
        j3b j3bVar;
        if (continuation instanceof GetChatAddresseeGuidUseCase$execute$1) {
            getChatAddresseeGuidUseCase$execute$1 = (GetChatAddresseeGuidUseCase$execute$1) continuation;
            int i2 = getChatAddresseeGuidUseCase$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getChatAddresseeGuidUseCase$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getChatAddresseeGuidUseCase$execute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getChatAddresseeGuidUseCase$execute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (chatRequest instanceof PrivateChatRequest ? true : chatRequest instanceof ExistingChatRequest ? ChatId.Companion.e(((ExistingChatRequest) chatRequest).id()) : false) {
                        if (chatRequest instanceof PrivateChatRequest) {
                            return ((PrivateChatRequest) chatRequest).addressee();
                        }
                        tpr a = this.a.a(chatRequest);
                        getChatAddresseeGuidUseCase$execute$1.label = 1;
                        obj = kotlinx.coroutines.flow.e.A(a, getChatAddresseeGuidUseCase$execute$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                oyj0Var = (oyj0) obj;
                if (oyj0Var != null && (j3bVar = (j3b) oyj0Var.b()) != null) {
                    return j3bVar.e;
                }
                return null;
            }
        }
        getChatAddresseeGuidUseCase$execute$1 = new GetChatAddresseeGuidUseCase$execute$1(this, (ContinuationImpl) continuation);
        Object obj2 = getChatAddresseeGuidUseCase$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getChatAddresseeGuidUseCase$execute$1.label;
        if (i != 0) {
        }
        oyj0Var = (oyj0) obj2;
        if (oyj0Var != null) {
            return j3bVar.e;
        }
        return null;
    }
}
