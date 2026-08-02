package com.yandex.messaging.internal;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/messaging/internal/MessageStatus;", "", "OTHER", "SENDING", "SENT", "READ", "DETAINED", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessageStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MessageStatus[] $VALUES;
    public static final MessageStatus DETAINED;
    public static final MessageStatus OTHER;
    public static final MessageStatus READ;
    public static final MessageStatus SENDING;
    public static final MessageStatus SENT;

    static {
        MessageStatus messageStatus = new MessageStatus("OTHER", 0);
        OTHER = messageStatus;
        MessageStatus messageStatus2 = new MessageStatus("SENDING", 1);
        SENDING = messageStatus2;
        MessageStatus messageStatus3 = new MessageStatus("SENT", 2);
        SENT = messageStatus3;
        MessageStatus messageStatus4 = new MessageStatus("READ", 3);
        READ = messageStatus4;
        MessageStatus messageStatus5 = new MessageStatus("DETAINED", 4);
        DETAINED = messageStatus5;
        MessageStatus[] messageStatusArr = {messageStatus, messageStatus2, messageStatus3, messageStatus4, messageStatus5};
        $VALUES = messageStatusArr;
        $ENTRIES = kotlin.enums.a.a(messageStatusArr);
    }

    public static MessageStatus valueOf(String str) {
        return (MessageStatus) Enum.valueOf(MessageStatus.class, str);
    }

    public static MessageStatus[] values() {
        return (MessageStatus[]) $VALUES.clone();
    }
}
