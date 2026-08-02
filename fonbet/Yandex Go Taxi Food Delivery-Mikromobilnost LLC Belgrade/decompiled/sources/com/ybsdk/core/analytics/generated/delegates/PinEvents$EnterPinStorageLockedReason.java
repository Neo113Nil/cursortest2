package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/PinEvents$EnterPinStorageLockedReason", "", "Lcom/ybsdk/core/analytics/generated/delegates/PinEvents$EnterPinStorageLockedReason;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "APP_EXCEED_BACKGROUND_TIME", "SIGNIFICANT_TIME_CHANGED", "PIN_TOKEN_RETRY", "LOGOUT", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PinEvents$EnterPinStorageLockedReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PinEvents$EnterPinStorageLockedReason[] $VALUES;
    private final String originalValue;
    public static final PinEvents$EnterPinStorageLockedReason APP_EXCEED_BACKGROUND_TIME = new PinEvents$EnterPinStorageLockedReason("APP_EXCEED_BACKGROUND_TIME", 0, "app_exceed_background_time");
    public static final PinEvents$EnterPinStorageLockedReason SIGNIFICANT_TIME_CHANGED = new PinEvents$EnterPinStorageLockedReason("SIGNIFICANT_TIME_CHANGED", 1, "significant_time_changed");
    public static final PinEvents$EnterPinStorageLockedReason PIN_TOKEN_RETRY = new PinEvents$EnterPinStorageLockedReason("PIN_TOKEN_RETRY", 2, "pin_token_retry");
    public static final PinEvents$EnterPinStorageLockedReason LOGOUT = new PinEvents$EnterPinStorageLockedReason("LOGOUT", 3, "logout");

    private static final /* synthetic */ PinEvents$EnterPinStorageLockedReason[] $values() {
        return new PinEvents$EnterPinStorageLockedReason[]{APP_EXCEED_BACKGROUND_TIME, SIGNIFICANT_TIME_CHANGED, PIN_TOKEN_RETRY, LOGOUT};
    }

    static {
        PinEvents$EnterPinStorageLockedReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PinEvents$EnterPinStorageLockedReason(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PinEvents$EnterPinStorageLockedReason valueOf(String str) {
        return (PinEvents$EnterPinStorageLockedReason) Enum.valueOf(PinEvents$EnterPinStorageLockedReason.class, str);
    }

    public static PinEvents$EnterPinStorageLockedReason[] values() {
        return (PinEvents$EnterPinStorageLockedReason[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
