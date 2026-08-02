package com.ybsdk.common.entities;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/common/entities/ApplicationTypeEntity;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "REGISTRATION", "SIMPLIFIED_IDENTIFICATION", "DIGITAL_CARD_ISSUE", "PRODUCT", "CHANGE_PHONE", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ApplicationTypeEntity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ApplicationTypeEntity[] $VALUES;
    public static final ApplicationTypeEntity UNKNOWN = new ApplicationTypeEntity("UNKNOWN", 0);
    public static final ApplicationTypeEntity REGISTRATION = new ApplicationTypeEntity("REGISTRATION", 1);
    public static final ApplicationTypeEntity SIMPLIFIED_IDENTIFICATION = new ApplicationTypeEntity("SIMPLIFIED_IDENTIFICATION", 2);
    public static final ApplicationTypeEntity DIGITAL_CARD_ISSUE = new ApplicationTypeEntity("DIGITAL_CARD_ISSUE", 3);
    public static final ApplicationTypeEntity PRODUCT = new ApplicationTypeEntity("PRODUCT", 4);
    public static final ApplicationTypeEntity CHANGE_PHONE = new ApplicationTypeEntity("CHANGE_PHONE", 5);

    private static final /* synthetic */ ApplicationTypeEntity[] $values() {
        return new ApplicationTypeEntity[]{UNKNOWN, REGISTRATION, SIMPLIFIED_IDENTIFICATION, DIGITAL_CARD_ISSUE, PRODUCT, CHANGE_PHONE};
    }

    static {
        ApplicationTypeEntity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ApplicationTypeEntity(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ApplicationTypeEntity valueOf(String str) {
        return (ApplicationTypeEntity) Enum.valueOf(ApplicationTypeEntity.class, str);
    }

    public static ApplicationTypeEntity[] values() {
        return (ApplicationTypeEntity[]) $VALUES.clone();
    }
}
