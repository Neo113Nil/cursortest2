package com.yandex.messaging.domain.chat;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.net.entities.MessengerSupportContext;
import com.yandex.messaging.core.net.entities.proto.message.ChatOpenType;
import defpackage.i720;
import defpackage.m8g;
import defpackage.n5t0;
import defpackage.ny61;
import defpackage.p1b;
import defpackage.q6b;
import defpackage.s020;
import defpackage.t6b;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class a {
    public final q6b a;
    public final com.yandex.messaging.internal.authorized.chat.b b;
    public final Moshi c;

    public a(q6b q6bVar, com.yandex.messaging.internal.authorized.chat.b bVar, Moshi moshi) {
        this.a = q6bVar;
        this.b = bVar;
        this.c = moshi;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ChatOpenType chatOpenType, ContinuationImpl continuationImpl) {
        ChatOpenClientMessageUseCase$execute$1 chatOpenClientMessageUseCase$execute$1;
        int i;
        MessengerSupportContext messengerSupportContext;
        if (continuationImpl instanceof ChatOpenClientMessageUseCase$execute$1) {
            chatOpenClientMessageUseCase$execute$1 = (ChatOpenClientMessageUseCase$execute$1) continuationImpl;
            int i2 = chatOpenClientMessageUseCase$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatOpenClientMessageUseCase$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chatOpenClientMessageUseCase$execute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatOpenClientMessageUseCase$execute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    JsonAdapter adapter = this.c.adapter(MessengerSupportContext.class);
                    q6b q6bVar = this.a;
                    String str = q6bVar.q;
                    MessengerSupportContext messengerSupportContext2 = str != null ? (MessengerSupportContext) adapter.fromJson(str) : null;
                    ChatRequest chatRequest = q6bVar.b;
                    chatOpenClientMessageUseCase$execute$1.L$0 = chatOpenType;
                    chatOpenClientMessageUseCase$execute$1.L$1 = messengerSupportContext2;
                    chatOpenClientMessageUseCase$execute$1.label = 1;
                    obj = this.b.a(chatRequest, chatOpenClientMessageUseCase$execute$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    messengerSupportContext = messengerSupportContext2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    messengerSupportContext = (MessengerSupportContext) chatOpenClientMessageUseCase$execute$1.L$1;
                    chatOpenType = (ChatOpenType) chatOpenClientMessageUseCase$execute$1.L$0;
                    kotlin.b.b(obj);
                }
                m8g m8gVar = (m8g) ((s020) obj);
                n5t0 e = m8gVar.d.e();
                e.f(new t6b(0, new p1b(e, m8gVar.a, (i720) m8gVar.c.R1.get()), chatOpenType, messengerSupportContext));
                return zy11.a;
            }
        }
        chatOpenClientMessageUseCase$execute$1 = new ChatOpenClientMessageUseCase$execute$1(this, continuationImpl);
        Object obj2 = chatOpenClientMessageUseCase$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatOpenClientMessageUseCase$execute$1.label;
        if (i != 0) {
        }
        m8g m8gVar2 = (m8g) ((s020) obj2);
        n5t0 e2 = m8gVar2.d.e();
        e2.f(new t6b(0, new p1b(e2, m8gVar2.a, (i720) m8gVar2.c.R1.get()), chatOpenType, messengerSupportContext));
        return zy11.a;
    }
}
