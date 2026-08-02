package com.ybsdk.core.utils.dto.common;

import defpackage.h13;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ybsdk/core/utils/dto/common/ApplicationType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "h13", "UNKNOWN", "REGISTRATION", "SIMPLIFIED_IDENTIFICATION", "DIGITAL_CARD_ISSUE", "PRODUCT", "CHANGE_PHONE", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ApplicationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ApplicationType[] $VALUES;
    public static final h13 Companion;
    public static final ApplicationType UNKNOWN = new ApplicationType("UNKNOWN", 0);
    public static final ApplicationType REGISTRATION = new ApplicationType("REGISTRATION", 1);
    public static final ApplicationType SIMPLIFIED_IDENTIFICATION = new ApplicationType("SIMPLIFIED_IDENTIFICATION", 2);
    public static final ApplicationType DIGITAL_CARD_ISSUE = new ApplicationType("DIGITAL_CARD_ISSUE", 3);
    public static final ApplicationType PRODUCT = new ApplicationType("PRODUCT", 4);
    public static final ApplicationType CHANGE_PHONE = new ApplicationType("CHANGE_PHONE", 5);

    private static final /* synthetic */ ApplicationType[] $values() {
        return new ApplicationType[]{UNKNOWN, REGISTRATION, SIMPLIFIED_IDENTIFICATION, DIGITAL_CARD_ISSUE, PRODUCT, CHANGE_PHONE};
    }

    static {
        ApplicationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new h13();
    }

    private ApplicationType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ApplicationType valueOf(String str) {
        return (ApplicationType) Enum.valueOf(ApplicationType.class, str);
    }

    public static ApplicationType[] values() {
        return (ApplicationType[]) $VALUES.clone();
    }
}
