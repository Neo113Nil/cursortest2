package com.yandex.go.quark.ai_assistant.api.chat;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/go/quark/ai_assistant/api/chat/ChatViewController$Mode", "", "Lcom/yandex/go/quark/ai_assistant/api/chat/ChatViewController$Mode;", "Go", "Eats", "Grocery", "Market", "Delivery", "go-client-android.features.quark.ai_assistant:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ChatViewController$Mode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChatViewController$Mode[] $VALUES;
    public static final ChatViewController$Mode Delivery;
    public static final ChatViewController$Mode Eats;
    public static final ChatViewController$Mode Go;
    public static final ChatViewController$Mode Grocery;
    public static final ChatViewController$Mode Market;

    static {
        ChatViewController$Mode chatViewController$Mode = new ChatViewController$Mode("Go", 0);
        Go = chatViewController$Mode;
        ChatViewController$Mode chatViewController$Mode2 = new ChatViewController$Mode("Eats", 1);
        Eats = chatViewController$Mode2;
        ChatViewController$Mode chatViewController$Mode3 = new ChatViewController$Mode("Grocery", 2);
        Grocery = chatViewController$Mode3;
        ChatViewController$Mode chatViewController$Mode4 = new ChatViewController$Mode("Market", 3);
        Market = chatViewController$Mode4;
        ChatViewController$Mode chatViewController$Mode5 = new ChatViewController$Mode("Delivery", 4);
        Delivery = chatViewController$Mode5;
        ChatViewController$Mode[] chatViewController$ModeArr = {chatViewController$Mode, chatViewController$Mode2, chatViewController$Mode3, chatViewController$Mode4, chatViewController$Mode5};
        $VALUES = chatViewController$ModeArr;
        $ENTRIES = a.a(chatViewController$ModeArr);
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static ChatViewController$Mode valueOf(String str) {
        return (ChatViewController$Mode) Enum.valueOf(ChatViewController$Mode.class, str);
    }

    public static ChatViewController$Mode[] values() {
        return (ChatViewController$Mode[]) $VALUES.clone();
    }
}
