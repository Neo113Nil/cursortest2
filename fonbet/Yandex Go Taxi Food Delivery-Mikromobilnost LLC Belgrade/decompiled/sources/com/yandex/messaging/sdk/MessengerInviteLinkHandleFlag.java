package com.yandex.messaging.sdk;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/messaging/sdk/MessengerInviteLinkHandleFlag;", "", "NOT_HANDLE", "HANDLE_CURRENT_ENVIRONMENT", "HANDLE_ALL", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MessengerInviteLinkHandleFlag {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MessengerInviteLinkHandleFlag[] $VALUES;
    public static final MessengerInviteLinkHandleFlag HANDLE_ALL;
    public static final MessengerInviteLinkHandleFlag HANDLE_CURRENT_ENVIRONMENT;
    public static final MessengerInviteLinkHandleFlag NOT_HANDLE;

    static {
        MessengerInviteLinkHandleFlag messengerInviteLinkHandleFlag = new MessengerInviteLinkHandleFlag("NOT_HANDLE", 0);
        NOT_HANDLE = messengerInviteLinkHandleFlag;
        MessengerInviteLinkHandleFlag messengerInviteLinkHandleFlag2 = new MessengerInviteLinkHandleFlag("HANDLE_CURRENT_ENVIRONMENT", 1);
        HANDLE_CURRENT_ENVIRONMENT = messengerInviteLinkHandleFlag2;
        MessengerInviteLinkHandleFlag messengerInviteLinkHandleFlag3 = new MessengerInviteLinkHandleFlag("HANDLE_ALL", 2);
        HANDLE_ALL = messengerInviteLinkHandleFlag3;
        MessengerInviteLinkHandleFlag[] messengerInviteLinkHandleFlagArr = {messengerInviteLinkHandleFlag, messengerInviteLinkHandleFlag2, messengerInviteLinkHandleFlag3};
        $VALUES = messengerInviteLinkHandleFlagArr;
        $ENTRIES = kotlin.enums.a.a(messengerInviteLinkHandleFlagArr);
    }

    public static MessengerInviteLinkHandleFlag valueOf(String str) {
        return (MessengerInviteLinkHandleFlag) Enum.valueOf(MessengerInviteLinkHandleFlag.class, str);
    }

    public static MessengerInviteLinkHandleFlag[] values() {
        return (MessengerInviteLinkHandleFlag[]) $VALUES.clone();
    }
}
