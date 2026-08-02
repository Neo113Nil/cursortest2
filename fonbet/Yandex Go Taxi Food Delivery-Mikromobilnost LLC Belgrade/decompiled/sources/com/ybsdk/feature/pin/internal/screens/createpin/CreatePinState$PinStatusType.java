package com.ybsdk.feature.pin.internal.screens.createpin;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/ybsdk/feature/pin/internal/screens/createpin/CreatePinState$PinStatusType", "", "Lcom/ybsdk/feature/pin/internal/screens/createpin/CreatePinState$PinStatusType;", "<init>", "(Ljava/lang/String;I)V", "IssuePinError", "TooManyAttempts", "PinSetup", "None", "feature-pin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreatePinState$PinStatusType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CreatePinState$PinStatusType[] $VALUES;
    public static final CreatePinState$PinStatusType IssuePinError = new CreatePinState$PinStatusType("IssuePinError", 0);
    public static final CreatePinState$PinStatusType TooManyAttempts = new CreatePinState$PinStatusType("TooManyAttempts", 1);
    public static final CreatePinState$PinStatusType PinSetup = new CreatePinState$PinStatusType("PinSetup", 2);
    public static final CreatePinState$PinStatusType None = new CreatePinState$PinStatusType("None", 3);

    private static final /* synthetic */ CreatePinState$PinStatusType[] $values() {
        return new CreatePinState$PinStatusType[]{IssuePinError, TooManyAttempts, PinSetup, None};
    }

    static {
        CreatePinState$PinStatusType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CreatePinState$PinStatusType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CreatePinState$PinStatusType valueOf(String str) {
        return (CreatePinState$PinStatusType) Enum.valueOf(CreatePinState$PinStatusType.class, str);
    }

    public static CreatePinState$PinStatusType[] values() {
        return (CreatePinState$PinStatusType[]) $VALUES.clone();
    }
}
