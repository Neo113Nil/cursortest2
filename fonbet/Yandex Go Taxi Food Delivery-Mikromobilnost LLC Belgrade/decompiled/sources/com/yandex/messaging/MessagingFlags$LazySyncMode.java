package com.yandex.messaging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class MessagingFlags$LazySyncMode {
    private static final /* synthetic */ MessagingFlags$LazySyncMode[] $VALUES;
    public static final MessagingFlags$LazySyncMode FULL;
    public static final MessagingFlags$LazySyncMode IF_REQUIRED;
    public static final MessagingFlags$LazySyncMode OFF;

    static {
        MessagingFlags$LazySyncMode messagingFlags$LazySyncMode = new MessagingFlags$LazySyncMode("OFF", 0);
        OFF = messagingFlags$LazySyncMode;
        MessagingFlags$LazySyncMode messagingFlags$LazySyncMode2 = new MessagingFlags$LazySyncMode("IF_REQUIRED", 1);
        IF_REQUIRED = messagingFlags$LazySyncMode2;
        MessagingFlags$LazySyncMode messagingFlags$LazySyncMode3 = new MessagingFlags$LazySyncMode("FULL", 2);
        FULL = messagingFlags$LazySyncMode3;
        $VALUES = new MessagingFlags$LazySyncMode[]{messagingFlags$LazySyncMode, messagingFlags$LazySyncMode2, messagingFlags$LazySyncMode3};
    }

    public static MessagingFlags$LazySyncMode valueOf(String str) {
        return (MessagingFlags$LazySyncMode) Enum.valueOf(MessagingFlags$LazySyncMode.class, str);
    }

    public static MessagingFlags$LazySyncMode[] values() {
        return (MessagingFlags$LazySyncMode[]) $VALUES.clone();
    }
}
