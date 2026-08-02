package com.yandex.go.beginners.safety.name.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/beginners/safety/name/domain/model/SafetyNameInputScreenState$Type", "", "Lcom/yandex/go/beginners/safety/name/domain/model/SafetyNameInputScreenState$Type;", "INPUT_STATE", "SENDING_STATE", "VALIDATION_ERROR_STATE", "NETWORK_ERROR_STATE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SafetyNameInputScreenState$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SafetyNameInputScreenState$Type[] $VALUES;
    public static final SafetyNameInputScreenState$Type INPUT_STATE;
    public static final SafetyNameInputScreenState$Type NETWORK_ERROR_STATE;
    public static final SafetyNameInputScreenState$Type SENDING_STATE;
    public static final SafetyNameInputScreenState$Type VALIDATION_ERROR_STATE;

    static {
        SafetyNameInputScreenState$Type safetyNameInputScreenState$Type = new SafetyNameInputScreenState$Type("INPUT_STATE", 0);
        INPUT_STATE = safetyNameInputScreenState$Type;
        SafetyNameInputScreenState$Type safetyNameInputScreenState$Type2 = new SafetyNameInputScreenState$Type("SENDING_STATE", 1);
        SENDING_STATE = safetyNameInputScreenState$Type2;
        SafetyNameInputScreenState$Type safetyNameInputScreenState$Type3 = new SafetyNameInputScreenState$Type("VALIDATION_ERROR_STATE", 2);
        VALIDATION_ERROR_STATE = safetyNameInputScreenState$Type3;
        SafetyNameInputScreenState$Type safetyNameInputScreenState$Type4 = new SafetyNameInputScreenState$Type("NETWORK_ERROR_STATE", 3);
        NETWORK_ERROR_STATE = safetyNameInputScreenState$Type4;
        SafetyNameInputScreenState$Type[] safetyNameInputScreenState$TypeArr = {safetyNameInputScreenState$Type, safetyNameInputScreenState$Type2, safetyNameInputScreenState$Type3, safetyNameInputScreenState$Type4};
        $VALUES = safetyNameInputScreenState$TypeArr;
        $ENTRIES = a.a(safetyNameInputScreenState$TypeArr);
    }

    public static SafetyNameInputScreenState$Type valueOf(String str) {
        return (SafetyNameInputScreenState$Type) Enum.valueOf(SafetyNameInputScreenState$Type.class, str);
    }

    public static SafetyNameInputScreenState$Type[] values() {
        return (SafetyNameInputScreenState$Type[]) $VALUES.clone();
    }
}
