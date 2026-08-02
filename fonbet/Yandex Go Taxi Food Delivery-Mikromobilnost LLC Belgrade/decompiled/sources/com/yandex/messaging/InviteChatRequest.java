package com.yandex.messaging;

import defpackage.k8b;
import defpackage.l8b;
import defpackage.m8b;
import defpackage.n8b;
import java.io.IOException;

/* loaded from: classes15.dex */
public interface InviteChatRequest extends ChatRequest {
    @Override // com.yandex.messaging.ChatRequest
    /* synthetic */ int handle(n8b n8bVar);

    @Override // com.yandex.messaging.ChatRequest
    /* synthetic */ Object handle(k8b k8bVar);

    @Override // com.yandex.messaging.ChatRequest
    /* synthetic */ void handle(m8b m8bVar) throws IOException;

    @Override // com.yandex.messaging.ChatRequest
    /* synthetic */ boolean handle(l8b l8bVar);

    String inviteHash();

    @Override // com.yandex.messaging.ChatRequest
    /* synthetic */ String uniqueRequestId();
}
