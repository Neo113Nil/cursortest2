package com.yandex.messaging;

import defpackage.k8b;
import defpackage.l8b;
import defpackage.m8b;
import defpackage.n8b;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/yandex/messaging/PrivateChatRequest;", "Lcom/yandex/messaging/ChatRequest;", "addressee", "", "onetimeUserToken", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PrivateChatRequest extends ChatRequest {
    String addressee();

    @Override // com.yandex.messaging.ChatRequest
    /* synthetic */ int handle(n8b n8bVar);

    @Override // com.yandex.messaging.ChatRequest
    /* synthetic */ Object handle(k8b k8bVar);

    @Override // com.yandex.messaging.ChatRequest
    /* synthetic */ void handle(m8b m8bVar) throws IOException;

    @Override // com.yandex.messaging.ChatRequest
    /* synthetic */ boolean handle(l8b l8bVar);

    String onetimeUserToken();

    @Override // com.yandex.messaging.ChatRequest
    /* synthetic */ String uniqueRequestId();
}
