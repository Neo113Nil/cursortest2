package com.yandex.go.beginners.safety.photo.upload.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/go/beginners/safety/photo/upload/domain/model/SafetyPhotoUploadScreenState$Type", "", "Lcom/yandex/go/beginners/safety/photo/upload/domain/model/SafetyPhotoUploadScreenState$Type;", "LOADING", "SUCCESS", "NETWORK_ERROR", "VALIDATION_FAIL_INTERMEDIATE", "VALIDATION_FAIL", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SafetyPhotoUploadScreenState$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SafetyPhotoUploadScreenState$Type[] $VALUES;
    public static final SafetyPhotoUploadScreenState$Type LOADING;
    public static final SafetyPhotoUploadScreenState$Type NETWORK_ERROR;
    public static final SafetyPhotoUploadScreenState$Type SUCCESS;
    public static final SafetyPhotoUploadScreenState$Type VALIDATION_FAIL;
    public static final SafetyPhotoUploadScreenState$Type VALIDATION_FAIL_INTERMEDIATE;

    static {
        SafetyPhotoUploadScreenState$Type safetyPhotoUploadScreenState$Type = new SafetyPhotoUploadScreenState$Type("LOADING", 0);
        LOADING = safetyPhotoUploadScreenState$Type;
        SafetyPhotoUploadScreenState$Type safetyPhotoUploadScreenState$Type2 = new SafetyPhotoUploadScreenState$Type("SUCCESS", 1);
        SUCCESS = safetyPhotoUploadScreenState$Type2;
        SafetyPhotoUploadScreenState$Type safetyPhotoUploadScreenState$Type3 = new SafetyPhotoUploadScreenState$Type("NETWORK_ERROR", 2);
        NETWORK_ERROR = safetyPhotoUploadScreenState$Type3;
        SafetyPhotoUploadScreenState$Type safetyPhotoUploadScreenState$Type4 = new SafetyPhotoUploadScreenState$Type("VALIDATION_FAIL_INTERMEDIATE", 3);
        VALIDATION_FAIL_INTERMEDIATE = safetyPhotoUploadScreenState$Type4;
        SafetyPhotoUploadScreenState$Type safetyPhotoUploadScreenState$Type5 = new SafetyPhotoUploadScreenState$Type("VALIDATION_FAIL", 4);
        VALIDATION_FAIL = safetyPhotoUploadScreenState$Type5;
        SafetyPhotoUploadScreenState$Type[] safetyPhotoUploadScreenState$TypeArr = {safetyPhotoUploadScreenState$Type, safetyPhotoUploadScreenState$Type2, safetyPhotoUploadScreenState$Type3, safetyPhotoUploadScreenState$Type4, safetyPhotoUploadScreenState$Type5};
        $VALUES = safetyPhotoUploadScreenState$TypeArr;
        $ENTRIES = a.a(safetyPhotoUploadScreenState$TypeArr);
    }

    public static SafetyPhotoUploadScreenState$Type valueOf(String str) {
        return (SafetyPhotoUploadScreenState$Type) Enum.valueOf(SafetyPhotoUploadScreenState$Type.class, str);
    }

    public static SafetyPhotoUploadScreenState$Type[] values() {
        return (SafetyPhotoUploadScreenState$Type[]) $VALUES.clone();
    }
}
