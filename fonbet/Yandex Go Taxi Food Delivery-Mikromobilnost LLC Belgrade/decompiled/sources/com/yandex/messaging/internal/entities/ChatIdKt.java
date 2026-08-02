package com.yandex.messaging.internal.entities;

import com.yandex.messaging.internal.entities.ChatId;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"messaging-core-entities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChatIdKt {
    public static final boolean a(ChatId chatId) {
        if ((chatId instanceof ChatId.PrivateChatId ? (ChatId.PrivateChatId) chatId : null) == null) {
            return false;
        }
        ChatId.PrivateChatId privateChatId = (ChatId.PrivateChatId) chatId;
        String c = privateChatId.c();
        String str = privateChatId.a;
        return c.equals(ChatId.Companion.e(str) ? str.substring(37, 73) : "");
    }
}
