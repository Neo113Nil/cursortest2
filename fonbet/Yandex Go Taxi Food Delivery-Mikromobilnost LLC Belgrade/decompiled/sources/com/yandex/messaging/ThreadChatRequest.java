package com.yandex.messaging;

import com.yandex.messaging.internal.ServerMessageRef;
import defpackage.k8b;
import defpackage.l8b;
import defpackage.m8b;
import defpackage.n8b;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0001H&J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/yandex/messaging/ThreadChatRequest;", "Lcom/yandex/messaging/ExistingChatRequest;", "threadId", "", "getThreadId", "()Ljava/lang/String;", "parentChatId", "parentMessageTimestamp", "", "parent", "parentServerMessageRef", "Lcom/yandex/messaging/internal/ServerMessageRef;", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ThreadChatRequest extends ExistingChatRequest {
    String getThreadId();

    @Override // com.yandex.messaging.ExistingChatRequest, com.yandex.messaging.ChatRequest
    /* synthetic */ int handle(n8b n8bVar);

    @Override // com.yandex.messaging.ExistingChatRequest, com.yandex.messaging.ChatRequest
    /* synthetic */ Object handle(k8b k8bVar);

    @Override // com.yandex.messaging.ExistingChatRequest, com.yandex.messaging.ChatRequest
    /* synthetic */ void handle(m8b m8bVar) throws IOException;

    @Override // com.yandex.messaging.ExistingChatRequest, com.yandex.messaging.ChatRequest
    /* synthetic */ boolean handle(l8b l8bVar);

    @Override // com.yandex.messaging.ExistingChatRequest
    /* synthetic */ String id();

    ExistingChatRequest parent();

    String parentChatId();

    long parentMessageTimestamp();

    default ServerMessageRef parentServerMessageRef() {
        return new ServerMessageRef(parentChatId(), parentMessageTimestamp());
    }

    @Override // com.yandex.messaging.ExistingChatRequest, com.yandex.messaging.ChatRequest
    /* synthetic */ String uniqueRequestId();
}
