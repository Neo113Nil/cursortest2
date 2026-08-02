package com.yandex.messaging.internal.view.timeline.common;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/messaging/internal/view/timeline/common/MessageSendStatus;", "", CA20Status.STATUS_REQUEST_DESCRIPTION_P, "Sent", "Seen", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessageSendStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MessageSendStatus[] $VALUES;
    public static final MessageSendStatus Pending;
    public static final MessageSendStatus Seen;
    public static final MessageSendStatus Sent;

    static {
        MessageSendStatus messageSendStatus = new MessageSendStatus(CA20Status.STATUS_REQUEST_DESCRIPTION_P, 0);
        Pending = messageSendStatus;
        MessageSendStatus messageSendStatus2 = new MessageSendStatus("Sent", 1);
        Sent = messageSendStatus2;
        MessageSendStatus messageSendStatus3 = new MessageSendStatus("Seen", 2);
        Seen = messageSendStatus3;
        MessageSendStatus[] messageSendStatusArr = {messageSendStatus, messageSendStatus2, messageSendStatus3};
        $VALUES = messageSendStatusArr;
        $ENTRIES = kotlin.enums.a.a(messageSendStatusArr);
    }

    public static MessageSendStatus valueOf(String str) {
        return (MessageSendStatus) Enum.valueOf(MessageSendStatus.class, str);
    }

    public static MessageSendStatus[] values() {
        return (MessageSendStatus[]) $VALUES.clone();
    }
}
