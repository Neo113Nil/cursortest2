package com.yandex.messaging.internal.storage;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/messaging/internal/storage/MessagesRange$LoadingType", "", "Lcom/yandex/messaging/internal/storage/MessagesRange$LoadingType;", "FromOldest", "FromNewest", "AroundNewest", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessagesRange$LoadingType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MessagesRange$LoadingType[] $VALUES;
    public static final MessagesRange$LoadingType AroundNewest;
    public static final MessagesRange$LoadingType FromNewest;
    public static final MessagesRange$LoadingType FromOldest;

    static {
        MessagesRange$LoadingType messagesRange$LoadingType = new MessagesRange$LoadingType("FromOldest", 0);
        FromOldest = messagesRange$LoadingType;
        MessagesRange$LoadingType messagesRange$LoadingType2 = new MessagesRange$LoadingType("FromNewest", 1);
        FromNewest = messagesRange$LoadingType2;
        MessagesRange$LoadingType messagesRange$LoadingType3 = new MessagesRange$LoadingType("AroundNewest", 2);
        AroundNewest = messagesRange$LoadingType3;
        MessagesRange$LoadingType[] messagesRange$LoadingTypeArr = {messagesRange$LoadingType, messagesRange$LoadingType2, messagesRange$LoadingType3};
        $VALUES = messagesRange$LoadingTypeArr;
        $ENTRIES = kotlin.enums.a.a(messagesRange$LoadingTypeArr);
    }

    public static MessagesRange$LoadingType valueOf(String str) {
        return (MessagesRange$LoadingType) Enum.valueOf(MessagesRange$LoadingType.class, str);
    }

    public static MessagesRange$LoadingType[] values() {
        return (MessagesRange$LoadingType[]) $VALUES.clone();
    }
}
