package com.yandex.messaging.domain;

import com.yandex.messaging.ChatRequest;
import defpackage.kse;
import defpackage.rol0;
import defpackage.tpr;

/* loaded from: classes15.dex */
public final class d {
    public final com.yandex.messaging.internal.authorized.chat.b a;
    public final kse b;

    public d(kse kseVar, com.yandex.messaging.internal.authorized.chat.b bVar) {
        this.a = bVar;
        this.b = kseVar;
    }

    public final tpr a(ChatRequest chatRequest) {
        return new rol0(new GetChatAdminsUseCase$execute$1(this, chatRequest, null));
    }
}
