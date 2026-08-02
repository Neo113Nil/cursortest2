package com.yandex.messaging.domain.chat;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.PrivateChatRequest;
import com.yandex.messaging.SavedMessagesRequest;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.entities.ChatIdKt;
import defpackage.g92;
import defpackage.kse;
import defpackage.n1f;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vds0;

/* loaded from: classes15.dex */
public final class g extends vds0 {
    public final com.yandex.messaging.domain.personal.a b;

    public g(kse kseVar, com.yandex.messaging.domain.personal.a aVar) {
        super(kseVar.b);
        this.b = aVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        ChatRequest chatRequest = (ChatRequest) obj;
        if (chatRequest instanceof SavedMessagesRequest) {
            return new g92(2, Boolean.TRUE);
        }
        if (chatRequest instanceof PrivateChatRequest) {
            return new n1f(29, new rol0(new IsSavedMessagesUseCase$run$1(this, null)), chatRequest);
        }
        return chatRequest instanceof ExistingChatRequest ? new g92(2, Boolean.valueOf(ChatIdKt.a(ChatId.Companion.a(((ExistingChatRequest) chatRequest).id())))) : new g92(2, Boolean.FALSE);
    }
}
