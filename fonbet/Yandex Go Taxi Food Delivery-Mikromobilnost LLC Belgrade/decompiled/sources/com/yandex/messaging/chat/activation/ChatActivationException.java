package com.yandex.messaging.chat.activation;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/messaging/chat/activation/ChatActivationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "isUnrecoverableActivationError", "Z", "a", "()Z", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChatActivationException extends Exception {
    private final boolean isUnrecoverableActivationError;

    public ChatActivationException(boolean z) {
        super("Cannot activate chat. Is unrecoverable error: " + z);
        this.isUnrecoverableActivationError = z;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getIsUnrecoverableActivationError() {
        return this.isUnrecoverableActivationError;
    }
}
