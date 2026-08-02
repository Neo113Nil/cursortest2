package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/TechEvents$TechDeviceIdSelectedDeviceIdType", "", "Lcom/ybsdk/core/analytics/generated/delegates/TechEvents$TechDeviceIdSelectedDeviceIdType;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "APPMETRICA_DEVICE_ID", "APPMETRICA_UUID", "IDFV", "SAVED_IDFV", "DEBUG_MENU", "FALLBACK_UUID", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TechEvents$TechDeviceIdSelectedDeviceIdType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TechEvents$TechDeviceIdSelectedDeviceIdType[] $VALUES;
    private final String originalValue;
    public static final TechEvents$TechDeviceIdSelectedDeviceIdType APPMETRICA_DEVICE_ID = new TechEvents$TechDeviceIdSelectedDeviceIdType("APPMETRICA_DEVICE_ID", 0, "appMetrica_device_id");
    public static final TechEvents$TechDeviceIdSelectedDeviceIdType APPMETRICA_UUID = new TechEvents$TechDeviceIdSelectedDeviceIdType("APPMETRICA_UUID", 1, "appMetrica_uuid");
    public static final TechEvents$TechDeviceIdSelectedDeviceIdType IDFV = new TechEvents$TechDeviceIdSelectedDeviceIdType("IDFV", 2, "idfv");
    public static final TechEvents$TechDeviceIdSelectedDeviceIdType SAVED_IDFV = new TechEvents$TechDeviceIdSelectedDeviceIdType("SAVED_IDFV", 3, "saved_idfv");
    public static final TechEvents$TechDeviceIdSelectedDeviceIdType DEBUG_MENU = new TechEvents$TechDeviceIdSelectedDeviceIdType("DEBUG_MENU", 4, "debug_menu");
    public static final TechEvents$TechDeviceIdSelectedDeviceIdType FALLBACK_UUID = new TechEvents$TechDeviceIdSelectedDeviceIdType("FALLBACK_UUID", 5, "fallback_uuid");

    private static final /* synthetic */ TechEvents$TechDeviceIdSelectedDeviceIdType[] $values() {
        return new TechEvents$TechDeviceIdSelectedDeviceIdType[]{APPMETRICA_DEVICE_ID, APPMETRICA_UUID, IDFV, SAVED_IDFV, DEBUG_MENU, FALLBACK_UUID};
    }

    static {
        TechEvents$TechDeviceIdSelectedDeviceIdType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TechEvents$TechDeviceIdSelectedDeviceIdType(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TechEvents$TechDeviceIdSelectedDeviceIdType valueOf(String str) {
        return (TechEvents$TechDeviceIdSelectedDeviceIdType) Enum.valueOf(TechEvents$TechDeviceIdSelectedDeviceIdType.class, str);
    }

    public static TechEvents$TechDeviceIdSelectedDeviceIdType[] values() {
        return (TechEvents$TechDeviceIdSelectedDeviceIdType[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
