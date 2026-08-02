package com.yandex.messaging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class MessagingFlags$AttachmentsChooserMode {
    private static final /* synthetic */ MessagingFlags$AttachmentsChooserMode[] $VALUES;
    public static final MessagingFlags$AttachmentsChooserMode CHOOSER_WITH_VIDEO_TRIM;
    public static final MessagingFlags$AttachmentsChooserMode MINI_CHOOSER;

    static {
        MessagingFlags$AttachmentsChooserMode messagingFlags$AttachmentsChooserMode = new MessagingFlags$AttachmentsChooserMode("MINI_CHOOSER", 0);
        MINI_CHOOSER = messagingFlags$AttachmentsChooserMode;
        MessagingFlags$AttachmentsChooserMode messagingFlags$AttachmentsChooserMode2 = new MessagingFlags$AttachmentsChooserMode("CHOOSER_WITH_VIDEO_TRIM", 1);
        CHOOSER_WITH_VIDEO_TRIM = messagingFlags$AttachmentsChooserMode2;
        $VALUES = new MessagingFlags$AttachmentsChooserMode[]{messagingFlags$AttachmentsChooserMode, messagingFlags$AttachmentsChooserMode2};
    }

    public static MessagingFlags$AttachmentsChooserMode valueOf(String str) {
        return (MessagingFlags$AttachmentsChooserMode) Enum.valueOf(MessagingFlags$AttachmentsChooserMode.class, str);
    }

    public static MessagingFlags$AttachmentsChooserMode[] values() {
        return (MessagingFlags$AttachmentsChooserMode[]) $VALUES.clone();
    }
}
