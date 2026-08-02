package com.ybsdk.feature.pin.internal.screens.biometry;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/ybsdk/feature/pin/internal/screens/biometry/BiometricViewModel$PinSkipableResult", "", "Lcom/ybsdk/feature/pin/internal/screens/biometry/BiometricViewModel$PinSkipableResult;", "OK", "SKIP", "ERROR", "feature-pin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class BiometricViewModel$PinSkipableResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BiometricViewModel$PinSkipableResult[] $VALUES;
    public static final BiometricViewModel$PinSkipableResult ERROR;
    public static final BiometricViewModel$PinSkipableResult OK;
    public static final BiometricViewModel$PinSkipableResult SKIP;

    static {
        BiometricViewModel$PinSkipableResult biometricViewModel$PinSkipableResult = new BiometricViewModel$PinSkipableResult("OK", 0);
        OK = biometricViewModel$PinSkipableResult;
        BiometricViewModel$PinSkipableResult biometricViewModel$PinSkipableResult2 = new BiometricViewModel$PinSkipableResult("SKIP", 1);
        SKIP = biometricViewModel$PinSkipableResult2;
        BiometricViewModel$PinSkipableResult biometricViewModel$PinSkipableResult3 = new BiometricViewModel$PinSkipableResult("ERROR", 2);
        ERROR = biometricViewModel$PinSkipableResult3;
        BiometricViewModel$PinSkipableResult[] biometricViewModel$PinSkipableResultArr = {biometricViewModel$PinSkipableResult, biometricViewModel$PinSkipableResult2, biometricViewModel$PinSkipableResult3};
        $VALUES = biometricViewModel$PinSkipableResultArr;
        $ENTRIES = kotlin.enums.a.a(biometricViewModel$PinSkipableResultArr);
    }

    public static BiometricViewModel$PinSkipableResult valueOf(String str) {
        return (BiometricViewModel$PinSkipableResult) Enum.valueOf(BiometricViewModel$PinSkipableResult.class, str);
    }

    public static BiometricViewModel$PinSkipableResult[] values() {
        return (BiometricViewModel$PinSkipableResult[]) $VALUES.clone();
    }
}
