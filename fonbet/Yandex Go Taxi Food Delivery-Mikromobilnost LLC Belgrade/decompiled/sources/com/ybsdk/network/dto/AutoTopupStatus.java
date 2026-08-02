package com.ybsdk.network.dto;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/network/dto/AutoTopupStatus;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLED", "DISABLED", "AVAILABLE_AFTER_UPGRADE", "UNAVAILABLE", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AutoTopupStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AutoTopupStatus[] $VALUES;
    public static final AutoTopupStatus ENABLED = new AutoTopupStatus("ENABLED", 0);
    public static final AutoTopupStatus DISABLED = new AutoTopupStatus("DISABLED", 1);
    public static final AutoTopupStatus AVAILABLE_AFTER_UPGRADE = new AutoTopupStatus("AVAILABLE_AFTER_UPGRADE", 2);
    public static final AutoTopupStatus UNAVAILABLE = new AutoTopupStatus("UNAVAILABLE", 3);

    private static final /* synthetic */ AutoTopupStatus[] $values() {
        return new AutoTopupStatus[]{ENABLED, DISABLED, AVAILABLE_AFTER_UPGRADE, UNAVAILABLE};
    }

    static {
        AutoTopupStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AutoTopupStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static AutoTopupStatus valueOf(String str) {
        return (AutoTopupStatus) Enum.valueOf(AutoTopupStatus.class, str);
    }

    public static AutoTopupStatus[] values() {
        return (AutoTopupStatus[]) $VALUES.clone();
    }
}
