package com.yandex.messaging.attachments;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/messaging/attachments/SystemAttachmentsController$ChooserType", "", "Lcom/yandex/messaging/attachments/SystemAttachmentsController$ChooserType;", "PHOTO", "VIDEO", "GALLERY", "NOTHING", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final class SystemAttachmentsController$ChooserType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SystemAttachmentsController$ChooserType[] $VALUES;
    public static final SystemAttachmentsController$ChooserType GALLERY;
    public static final SystemAttachmentsController$ChooserType NOTHING;
    public static final SystemAttachmentsController$ChooserType PHOTO;
    public static final SystemAttachmentsController$ChooserType VIDEO;

    static {
        SystemAttachmentsController$ChooserType systemAttachmentsController$ChooserType = new SystemAttachmentsController$ChooserType("PHOTO", 0);
        PHOTO = systemAttachmentsController$ChooserType;
        SystemAttachmentsController$ChooserType systemAttachmentsController$ChooserType2 = new SystemAttachmentsController$ChooserType("VIDEO", 1);
        VIDEO = systemAttachmentsController$ChooserType2;
        SystemAttachmentsController$ChooserType systemAttachmentsController$ChooserType3 = new SystemAttachmentsController$ChooserType("GALLERY", 2);
        GALLERY = systemAttachmentsController$ChooserType3;
        SystemAttachmentsController$ChooserType systemAttachmentsController$ChooserType4 = new SystemAttachmentsController$ChooserType("NOTHING", 3);
        NOTHING = systemAttachmentsController$ChooserType4;
        SystemAttachmentsController$ChooserType[] systemAttachmentsController$ChooserTypeArr = {systemAttachmentsController$ChooserType, systemAttachmentsController$ChooserType2, systemAttachmentsController$ChooserType3, systemAttachmentsController$ChooserType4};
        $VALUES = systemAttachmentsController$ChooserTypeArr;
        $ENTRIES = kotlin.enums.a.a(systemAttachmentsController$ChooserTypeArr);
    }

    public static SystemAttachmentsController$ChooserType valueOf(String str) {
        return (SystemAttachmentsController$ChooserType) Enum.valueOf(SystemAttachmentsController$ChooserType.class, str);
    }

    public static SystemAttachmentsController$ChooserType[] values() {
        return (SystemAttachmentsController$ChooserType[]) $VALUES.clone();
    }
}
