package com.yandex.messaging.chat;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.domain.k;
import defpackage.kse;
import defpackage.m8g;
import defpackage.ny61;
import defpackage.s020;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class b extends k {
    public final com.yandex.messaging.internal.authorized.chat.b b;

    public b(kse kseVar, com.yandex.messaging.internal.authorized.chat.b bVar) {
        super(kseVar.b);
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.messaging.domain.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ChatRequest chatRequest, ContinuationImpl continuationImpl) {
        GetChatIdUseCase$run$1 getChatIdUseCase$run$1;
        int i;
        if (continuationImpl instanceof GetChatIdUseCase$run$1) {
            getChatIdUseCase$run$1 = (GetChatIdUseCase$run$1) continuationImpl;
            int i2 = getChatIdUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getChatIdUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getChatIdUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getChatIdUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (chatRequest instanceof ExistingChatRequest) {
                        return ((ExistingChatRequest) chatRequest).id();
                    }
                    getChatIdUseCase$run$1.label = 1;
                    obj = this.b.a(chatRequest, getChatIdUseCase$run$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((m8g) ((s020) obj)).a.b;
            }
        }
        getChatIdUseCase$run$1 = new GetChatIdUseCase$run$1(this, continuationImpl);
        Object obj2 = getChatIdUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getChatIdUseCase$run$1.label;
        if (i != 0) {
        }
        return ((m8g) ((s020) obj2)).a.b;
    }
}
