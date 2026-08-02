package com.ybsdk.api.pro;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/api/pro/RegistrationCallback$RegistrationResult", "", "Lcom/ybsdk/api/pro/RegistrationCallback$RegistrationResult;", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "FAIL", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RegistrationCallback$RegistrationResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RegistrationCallback$RegistrationResult[] $VALUES;
    public static final RegistrationCallback$RegistrationResult SUCCESS = new RegistrationCallback$RegistrationResult("SUCCESS", 0);
    public static final RegistrationCallback$RegistrationResult FAIL = new RegistrationCallback$RegistrationResult("FAIL", 1);

    private static final /* synthetic */ RegistrationCallback$RegistrationResult[] $values() {
        return new RegistrationCallback$RegistrationResult[]{SUCCESS, FAIL};
    }

    static {
        RegistrationCallback$RegistrationResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private RegistrationCallback$RegistrationResult(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static RegistrationCallback$RegistrationResult valueOf(String str) {
        return (RegistrationCallback$RegistrationResult) Enum.valueOf(RegistrationCallback$RegistrationResult.class, str);
    }

    public static RegistrationCallback$RegistrationResult[] values() {
        return (RegistrationCallback$RegistrationResult[]) $VALUES.clone();
    }
}
