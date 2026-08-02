package com.yandex.delivery.libs.imageupload.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/delivery/libs/imageupload/api/UploadImageType;", "", "PHOTOCOMMENT", "imageupload"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UploadImageType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UploadImageType[] $VALUES;
    public static final UploadImageType PHOTOCOMMENT;

    static {
        UploadImageType uploadImageType = new UploadImageType("PHOTOCOMMENT", 0);
        PHOTOCOMMENT = uploadImageType;
        UploadImageType[] uploadImageTypeArr = {uploadImageType};
        $VALUES = uploadImageTypeArr;
        $ENTRIES = a.a(uploadImageTypeArr);
    }

    public static UploadImageType valueOf(String str) {
        return (UploadImageType) Enum.valueOf(UploadImageType.class, str);
    }

    public static UploadImageType[] values() {
        return (UploadImageType[]) $VALUES.clone();
    }
}
