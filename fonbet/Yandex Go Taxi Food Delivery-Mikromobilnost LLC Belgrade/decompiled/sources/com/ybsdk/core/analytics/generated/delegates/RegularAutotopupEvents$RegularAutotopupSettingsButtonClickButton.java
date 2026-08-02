package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton", "", "Lcom/ybsdk/core/analytics/generated/delegates/RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "SOURCE_BUTTON", "PERIOD_BUTTON", "WHEN_BUTTON", "ACTIVATE_BUTTON", "BACK_BUTTON", "INFORMATION", "DEACTIVATE_BUTTON", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton[] $VALUES;
    private final String originalValue;
    public static final RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton SOURCE_BUTTON = new RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton("SOURCE_BUTTON", 0, "source_button");
    public static final RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton PERIOD_BUTTON = new RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton("PERIOD_BUTTON", 1, "period_button");
    public static final RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton WHEN_BUTTON = new RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton("WHEN_BUTTON", 2, "when_button");
    public static final RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton ACTIVATE_BUTTON = new RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton("ACTIVATE_BUTTON", 3, "activate_button");
    public static final RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton BACK_BUTTON = new RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton("BACK_BUTTON", 4, "back_button");
    public static final RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton INFORMATION = new RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton("INFORMATION", 5, "information");
    public static final RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton DEACTIVATE_BUTTON = new RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton("DEACTIVATE_BUTTON", 6, "deactivate_button");

    private static final /* synthetic */ RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton[] $values() {
        return new RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton[]{SOURCE_BUTTON, PERIOD_BUTTON, WHEN_BUTTON, ACTIVATE_BUTTON, BACK_BUTTON, INFORMATION, DEACTIVATE_BUTTON};
    }

    static {
        RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton valueOf(String str) {
        return (RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton) Enum.valueOf(RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton.class, str);
    }

    public static RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton[] values() {
        return (RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
