package com.yandex.messaging.core.net.entities.proto.message;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/ChatOpenType;", "", "CHAT_OPEN_TYPE_UNKNOWN", "CHAT_OPEN_TYPE_OPEN", "CHAT_OPEN_TYPE_SYNC", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChatOpenType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChatOpenType[] $VALUES;
    public static final ChatOpenType CHAT_OPEN_TYPE_OPEN;
    public static final ChatOpenType CHAT_OPEN_TYPE_SYNC;
    public static final ChatOpenType CHAT_OPEN_TYPE_UNKNOWN;

    static {
        ChatOpenType chatOpenType = new ChatOpenType("CHAT_OPEN_TYPE_UNKNOWN", 0);
        CHAT_OPEN_TYPE_UNKNOWN = chatOpenType;
        ChatOpenType chatOpenType2 = new ChatOpenType("CHAT_OPEN_TYPE_OPEN", 1);
        CHAT_OPEN_TYPE_OPEN = chatOpenType2;
        ChatOpenType chatOpenType3 = new ChatOpenType("CHAT_OPEN_TYPE_SYNC", 2);
        CHAT_OPEN_TYPE_SYNC = chatOpenType3;
        ChatOpenType[] chatOpenTypeArr = {chatOpenType, chatOpenType2, chatOpenType3};
        $VALUES = chatOpenTypeArr;
        $ENTRIES = a.a(chatOpenTypeArr);
    }

    public static ChatOpenType valueOf(String str) {
        return (ChatOpenType) Enum.valueOf(ChatOpenType.class, str);
    }

    public static ChatOpenType[] values() {
        return (ChatOpenType[]) $VALUES.clone();
    }
}
