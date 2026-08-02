package com.yandex.go.quark.ai_assistant.api.chat;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/go/quark/ai_assistant/api/chat/ChatViewNavigationEntry$Type", "", "Lcom/yandex/go/quark/ai_assistant/api/chat/ChatViewNavigationEntry$Type;", "UNKNOWN", "CHAT", "CHAT_LIST", "SKILL", "CHAT_FOLDER", "go-client-android.features.quark.ai_assistant:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ChatViewNavigationEntry$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChatViewNavigationEntry$Type[] $VALUES;
    public static final ChatViewNavigationEntry$Type CHAT;
    public static final ChatViewNavigationEntry$Type CHAT_FOLDER;
    public static final ChatViewNavigationEntry$Type CHAT_LIST;
    public static final ChatViewNavigationEntry$Type SKILL;
    public static final ChatViewNavigationEntry$Type UNKNOWN;

    static {
        ChatViewNavigationEntry$Type chatViewNavigationEntry$Type = new ChatViewNavigationEntry$Type("UNKNOWN", 0);
        UNKNOWN = chatViewNavigationEntry$Type;
        ChatViewNavigationEntry$Type chatViewNavigationEntry$Type2 = new ChatViewNavigationEntry$Type("CHAT", 1);
        CHAT = chatViewNavigationEntry$Type2;
        ChatViewNavigationEntry$Type chatViewNavigationEntry$Type3 = new ChatViewNavigationEntry$Type("CHAT_LIST", 2);
        CHAT_LIST = chatViewNavigationEntry$Type3;
        ChatViewNavigationEntry$Type chatViewNavigationEntry$Type4 = new ChatViewNavigationEntry$Type("SKILL", 3);
        SKILL = chatViewNavigationEntry$Type4;
        ChatViewNavigationEntry$Type chatViewNavigationEntry$Type5 = new ChatViewNavigationEntry$Type("CHAT_FOLDER", 4);
        CHAT_FOLDER = chatViewNavigationEntry$Type5;
        ChatViewNavigationEntry$Type[] chatViewNavigationEntry$TypeArr = {chatViewNavigationEntry$Type, chatViewNavigationEntry$Type2, chatViewNavigationEntry$Type3, chatViewNavigationEntry$Type4, chatViewNavigationEntry$Type5};
        $VALUES = chatViewNavigationEntry$TypeArr;
        $ENTRIES = a.a(chatViewNavigationEntry$TypeArr);
    }

    public static ChatViewNavigationEntry$Type valueOf(String str) {
        return (ChatViewNavigationEntry$Type) Enum.valueOf(ChatViewNavigationEntry$Type.class, str);
    }

    public static ChatViewNavigationEntry$Type[] values() {
        return (ChatViewNavigationEntry$Type[]) $VALUES.clone();
    }
}
