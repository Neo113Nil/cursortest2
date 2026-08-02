package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/TechEvents$TechConfigStateUpdateReason", "", "Lcom/ybsdk/core/analytics/generated/delegates/TechEvents$TechConfigStateUpdateReason;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "LOGOUT", "SDK_STATE_CHANGE", "APP_LAUNCH", "APP_RETURN_FROM_BACKGROUND", "ACCOUNT_MANAGER_TOKEN_CHANGE", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TechEvents$TechConfigStateUpdateReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TechEvents$TechConfigStateUpdateReason[] $VALUES;
    private final String originalValue;
    public static final TechEvents$TechConfigStateUpdateReason LOGOUT = new TechEvents$TechConfigStateUpdateReason("LOGOUT", 0, "logout");
    public static final TechEvents$TechConfigStateUpdateReason SDK_STATE_CHANGE = new TechEvents$TechConfigStateUpdateReason("SDK_STATE_CHANGE", 1, "sdk_state_change");
    public static final TechEvents$TechConfigStateUpdateReason APP_LAUNCH = new TechEvents$TechConfigStateUpdateReason("APP_LAUNCH", 2, "app_launch");
    public static final TechEvents$TechConfigStateUpdateReason APP_RETURN_FROM_BACKGROUND = new TechEvents$TechConfigStateUpdateReason("APP_RETURN_FROM_BACKGROUND", 3, "app_return_from_background");
    public static final TechEvents$TechConfigStateUpdateReason ACCOUNT_MANAGER_TOKEN_CHANGE = new TechEvents$TechConfigStateUpdateReason("ACCOUNT_MANAGER_TOKEN_CHANGE", 4, "account_manager_token_change");

    private static final /* synthetic */ TechEvents$TechConfigStateUpdateReason[] $values() {
        return new TechEvents$TechConfigStateUpdateReason[]{LOGOUT, SDK_STATE_CHANGE, APP_LAUNCH, APP_RETURN_FROM_BACKGROUND, ACCOUNT_MANAGER_TOKEN_CHANGE};
    }

    static {
        TechEvents$TechConfigStateUpdateReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TechEvents$TechConfigStateUpdateReason(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TechEvents$TechConfigStateUpdateReason valueOf(String str) {
        return (TechEvents$TechConfigStateUpdateReason) Enum.valueOf(TechEvents$TechConfigStateUpdateReason.class, str);
    }

    public static TechEvents$TechConfigStateUpdateReason[] values() {
        return (TechEvents$TechConfigStateUpdateReason[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
