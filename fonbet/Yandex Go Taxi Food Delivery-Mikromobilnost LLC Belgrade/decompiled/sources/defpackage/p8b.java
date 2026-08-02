package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.internal.ExistingChat;
import com.yandex.messaging.internal.InviteChat;
import com.yandex.messaging.internal.InviteThread;
import com.yandex.messaging.internal.ThreadChat;
import com.yandex.messaging.internal.entities.ChatId;

/* loaded from: classes15.dex */
public abstract class p8b {
    public static final ExistingChatRequest a(String str) {
        return ChatId.Companion.f(str) ? new ThreadChat(str) : new ExistingChat(str);
    }

    public static final ChatRequest b(String str, String str2) {
        ChatId a = ChatId.Companion.a(str);
        return str2 == null ? a(a.a) : a instanceof ChatId.ThreadId ? new InviteThread(str2, ((ChatId.ThreadId) a).d) : new InviteChat(str2);
    }
}
