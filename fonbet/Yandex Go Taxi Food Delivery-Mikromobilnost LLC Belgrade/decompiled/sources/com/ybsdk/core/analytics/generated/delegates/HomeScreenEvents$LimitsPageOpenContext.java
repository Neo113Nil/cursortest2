package com.ybsdk.core.analytics.generated.delegates;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/HomeScreenEvents$LimitsPageOpenContext", "", "Lcom/ybsdk/core/analytics/generated/delegates/HomeScreenEvents$LimitsPageOpenContext;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "MENU", "HOME_SCREEN_NOTIFICATION", "TRANSFER_SHUTTER", "TOPUP_SHUTTER", "SETTINGS", "DEEPLINK", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HomeScreenEvents$LimitsPageOpenContext {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HomeScreenEvents$LimitsPageOpenContext[] $VALUES;
    private final String originalValue;
    public static final HomeScreenEvents$LimitsPageOpenContext MENU = new HomeScreenEvents$LimitsPageOpenContext("MENU", 0, "menu");
    public static final HomeScreenEvents$LimitsPageOpenContext HOME_SCREEN_NOTIFICATION = new HomeScreenEvents$LimitsPageOpenContext("HOME_SCREEN_NOTIFICATION", 1, "home_screen_notification");
    public static final HomeScreenEvents$LimitsPageOpenContext TRANSFER_SHUTTER = new HomeScreenEvents$LimitsPageOpenContext("TRANSFER_SHUTTER", 2, "transfer_shutter");
    public static final HomeScreenEvents$LimitsPageOpenContext TOPUP_SHUTTER = new HomeScreenEvents$LimitsPageOpenContext("TOPUP_SHUTTER", 3, "topup_shutter");
    public static final HomeScreenEvents$LimitsPageOpenContext SETTINGS = new HomeScreenEvents$LimitsPageOpenContext("SETTINGS", 4, "settings");
    public static final HomeScreenEvents$LimitsPageOpenContext DEEPLINK = new HomeScreenEvents$LimitsPageOpenContext("DEEPLINK", 5, Constants.DEEPLINK);

    private static final /* synthetic */ HomeScreenEvents$LimitsPageOpenContext[] $values() {
        return new HomeScreenEvents$LimitsPageOpenContext[]{MENU, HOME_SCREEN_NOTIFICATION, TRANSFER_SHUTTER, TOPUP_SHUTTER, SETTINGS, DEEPLINK};
    }

    static {
        HomeScreenEvents$LimitsPageOpenContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private HomeScreenEvents$LimitsPageOpenContext(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static HomeScreenEvents$LimitsPageOpenContext valueOf(String str) {
        return (HomeScreenEvents$LimitsPageOpenContext) Enum.valueOf(HomeScreenEvents$LimitsPageOpenContext.class, str);
    }

    public static HomeScreenEvents$LimitsPageOpenContext[] values() {
        return (HomeScreenEvents$LimitsPageOpenContext[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
