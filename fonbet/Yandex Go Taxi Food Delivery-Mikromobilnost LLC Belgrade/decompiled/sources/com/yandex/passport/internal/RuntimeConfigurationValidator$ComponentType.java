package com.yandex.passport.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
final class RuntimeConfigurationValidator$ComponentType {
    private static final /* synthetic */ RuntimeConfigurationValidator$ComponentType[] $VALUES;
    public static final RuntimeConfigurationValidator$ComponentType ACTIVITY;
    public static final RuntimeConfigurationValidator$ComponentType RECEIVER;
    public static final RuntimeConfigurationValidator$ComponentType SERVICE;

    static {
        RuntimeConfigurationValidator$ComponentType runtimeConfigurationValidator$ComponentType = new RuntimeConfigurationValidator$ComponentType("ACTIVITY", 0);
        ACTIVITY = runtimeConfigurationValidator$ComponentType;
        RuntimeConfigurationValidator$ComponentType runtimeConfigurationValidator$ComponentType2 = new RuntimeConfigurationValidator$ComponentType("SERVICE", 1);
        SERVICE = runtimeConfigurationValidator$ComponentType2;
        RuntimeConfigurationValidator$ComponentType runtimeConfigurationValidator$ComponentType3 = new RuntimeConfigurationValidator$ComponentType("RECEIVER", 2);
        RECEIVER = runtimeConfigurationValidator$ComponentType3;
        $VALUES = new RuntimeConfigurationValidator$ComponentType[]{runtimeConfigurationValidator$ComponentType, runtimeConfigurationValidator$ComponentType2, runtimeConfigurationValidator$ComponentType3};
    }

    public static RuntimeConfigurationValidator$ComponentType valueOf(String str) {
        return (RuntimeConfigurationValidator$ComponentType) Enum.valueOf(RuntimeConfigurationValidator$ComponentType.class, str);
    }

    public static RuntimeConfigurationValidator$ComponentType[] values() {
        return (RuntimeConfigurationValidator$ComponentType[]) $VALUES.clone();
    }
}
