package com.yandex.messaging.attachments;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/messaging/attachments/AttachmentsFileTypes;", "", "", "filter", "Ljava/lang/String;", "getFilter", "()Ljava/lang/String;", "IMAGES", "ALL", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AttachmentsFileTypes {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AttachmentsFileTypes[] $VALUES;
    public static final AttachmentsFileTypes ALL;
    public static final AttachmentsFileTypes IMAGES;
    private final String filter;

    static {
        AttachmentsFileTypes attachmentsFileTypes = new AttachmentsFileTypes("IMAGES", 0, "image/*");
        IMAGES = attachmentsFileTypes;
        AttachmentsFileTypes attachmentsFileTypes2 = new AttachmentsFileTypes("ALL", 1, "*/*");
        ALL = attachmentsFileTypes2;
        AttachmentsFileTypes[] attachmentsFileTypesArr = {attachmentsFileTypes, attachmentsFileTypes2};
        $VALUES = attachmentsFileTypesArr;
        $ENTRIES = kotlin.enums.a.a(attachmentsFileTypesArr);
    }

    public AttachmentsFileTypes(String str, int i, String str2) {
        this.filter = str2;
    }

    public static AttachmentsFileTypes valueOf(String str) {
        return (AttachmentsFileTypes) Enum.valueOf(AttachmentsFileTypes.class, str);
    }

    public static AttachmentsFileTypes[] values() {
        return (AttachmentsFileTypes[]) $VALUES.clone();
    }
}
