package ru.mail.libverify.platform.core;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ServiceType.kt */
/* loaded from: classes11.dex */
public final class ServiceType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ServiceType[] $VALUES;
    public static final ServiceType Huawei = new ServiceType("Huawei", 0);
    public static final ServiceType Firebase = new ServiceType("Firebase", 1);

    private static final /* synthetic */ ServiceType[] $values() {
        return new ServiceType[]{Huawei, Firebase};
    }

    static {
        ServiceType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private ServiceType(String str, int i) {
    }

    public static zrp<ServiceType> getEntries() {
        return $ENTRIES;
    }

    public static ServiceType valueOf(String str) {
        return (ServiceType) Enum.valueOf(ServiceType.class, str);
    }

    public static ServiceType[] values() {
        return (ServiceType[]) $VALUES.clone();
    }
}
