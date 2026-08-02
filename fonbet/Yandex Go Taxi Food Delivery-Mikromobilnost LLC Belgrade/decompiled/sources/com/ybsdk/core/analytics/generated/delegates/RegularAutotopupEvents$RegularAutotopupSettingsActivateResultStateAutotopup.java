package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/RegularAutotopupEvents$RegularAutotopupSettingsActivateResultStateAutotopup", "", "Lcom/ybsdk/core/analytics/generated/delegates/RegularAutotopupEvents$RegularAutotopupSettingsActivateResultStateAutotopup;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "NEW", "CHANGE", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RegularAutotopupEvents$RegularAutotopupSettingsActivateResultStateAutotopup {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RegularAutotopupEvents$RegularAutotopupSettingsActivateResultStateAutotopup[] $VALUES;
    private final String originalValue;
    public static final RegularAutotopupEvents$RegularAutotopupSettingsActivateResultStateAutotopup NEW = new RegularAutotopupEvents$RegularAutotopupSettingsActivateResultStateAutotopup("NEW", 0, "new");
    public static final RegularAutotopupEvents$RegularAutotopupSettingsActivateResultStateAutotopup CHANGE = new RegularAutotopupEvents$RegularAutotopupSettingsActivateResultStateAutotopup("CHANGE", 1, "change");

    private static final /* synthetic */ RegularAutotopupEvents$RegularAutotopupSettingsActivateResultStateAutotopup[] $values() {
        return new RegularAutotopupEvents$RegularAutotopupSettingsActivateResultStateAutotopup[]{NEW, CHANGE};
    }

    static {
        RegularAutotopupEvents$RegularAutotopupSettingsActivateResultStateAutotopup[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private RegularAutotopupEvents$RegularAutotopupSettingsActivateResultStateAutotopup(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static RegularAutotopupEvents$RegularAutotopupSettingsActivateResultStateAutotopup valueOf(String str) {
        return (RegularAutotopupEvents$RegularAutotopupSettingsActivateResultStateAutotopup) Enum.valueOf(RegularAutotopupEvents$RegularAutotopupSettingsActivateResultStateAutotopup.class, str);
    }

    public static RegularAutotopupEvents$RegularAutotopupSettingsActivateResultStateAutotopup[] values() {
        return (RegularAutotopupEvents$RegularAutotopupSettingsActivateResultStateAutotopup[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
