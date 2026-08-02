package com.yandex.messaging.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class BackendCompatibilityStatus {
    private static final /* synthetic */ BackendCompatibilityStatus[] $VALUES;
    public static final BackendCompatibilityStatus FULL_OUTDATED;
    public static final BackendCompatibilityStatus OK;
    public static final BackendCompatibilityStatus PARTIALLY_OUTDATED;

    static {
        BackendCompatibilityStatus backendCompatibilityStatus = new BackendCompatibilityStatus("OK", 0);
        OK = backendCompatibilityStatus;
        BackendCompatibilityStatus backendCompatibilityStatus2 = new BackendCompatibilityStatus("PARTIALLY_OUTDATED", 1);
        PARTIALLY_OUTDATED = backendCompatibilityStatus2;
        BackendCompatibilityStatus backendCompatibilityStatus3 = new BackendCompatibilityStatus("FULL_OUTDATED", 2);
        FULL_OUTDATED = backendCompatibilityStatus3;
        $VALUES = new BackendCompatibilityStatus[]{backendCompatibilityStatus, backendCompatibilityStatus2, backendCompatibilityStatus3};
    }

    public static BackendCompatibilityStatus valueOf(String str) {
        return (BackendCompatibilityStatus) Enum.valueOf(BackendCompatibilityStatus.class, str);
    }

    public static BackendCompatibilityStatus[] values() {
        return (BackendCompatibilityStatus[]) $VALUES.clone();
    }
}
