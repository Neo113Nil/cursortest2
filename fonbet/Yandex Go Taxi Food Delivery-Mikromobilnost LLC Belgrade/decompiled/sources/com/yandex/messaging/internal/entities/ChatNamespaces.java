package com.yandex.messaging.internal.entities;

import com.yandex.messaging.internal.entities.ChatId;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/internal/entities/ChatNamespaces;", "", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChatNamespaces {
    public static boolean a(String str) {
        return ChatId.Companion.d(str) == 2;
    }

    public static final boolean b(String str) {
        return ChatId.Companion.d(str) == 1;
    }
}
