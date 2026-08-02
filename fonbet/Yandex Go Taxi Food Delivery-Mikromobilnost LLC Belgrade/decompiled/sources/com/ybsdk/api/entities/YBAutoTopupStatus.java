package com.ybsdk.api.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/api/entities/YBAutoTopupStatus;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLED", "DISABLED", "AVAILABLE_AFTER_UPGRADE", "UNAVAILABLE", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class YBAutoTopupStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YBAutoTopupStatus[] $VALUES;
    public static final YBAutoTopupStatus ENABLED = new YBAutoTopupStatus("ENABLED", 0);
    public static final YBAutoTopupStatus DISABLED = new YBAutoTopupStatus("DISABLED", 1);
    public static final YBAutoTopupStatus AVAILABLE_AFTER_UPGRADE = new YBAutoTopupStatus("AVAILABLE_AFTER_UPGRADE", 2);
    public static final YBAutoTopupStatus UNAVAILABLE = new YBAutoTopupStatus("UNAVAILABLE", 3);

    private static final /* synthetic */ YBAutoTopupStatus[] $values() {
        return new YBAutoTopupStatus[]{ENABLED, DISABLED, AVAILABLE_AFTER_UPGRADE, UNAVAILABLE};
    }

    static {
        YBAutoTopupStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private YBAutoTopupStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static YBAutoTopupStatus valueOf(String str) {
        return (YBAutoTopupStatus) Enum.valueOf(YBAutoTopupStatus.class, str);
    }

    public static YBAutoTopupStatus[] values() {
        return (YBAutoTopupStatus[]) $VALUES.clone();
    }
}
