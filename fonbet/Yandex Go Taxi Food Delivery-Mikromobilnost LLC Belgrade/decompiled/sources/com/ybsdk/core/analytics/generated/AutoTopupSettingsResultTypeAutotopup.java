package com.ybsdk.core.analytics.generated;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ybsdk/core/analytics/generated/AutoTopupSettingsResultTypeAutotopup;", "", "originalValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getOriginalValue", "()Ljava/lang/String;", "ROUNDING", "REGULAR_AUTOTOPUP", "AUTOFUND", "AUTOTOPUP", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupSettingsResultTypeAutotopup {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AutoTopupSettingsResultTypeAutotopup[] $VALUES;
    private final String originalValue;
    public static final AutoTopupSettingsResultTypeAutotopup ROUNDING = new AutoTopupSettingsResultTypeAutotopup("ROUNDING", 0, "rounding");
    public static final AutoTopupSettingsResultTypeAutotopup REGULAR_AUTOTOPUP = new AutoTopupSettingsResultTypeAutotopup("REGULAR_AUTOTOPUP", 1, "regular_autotopup");
    public static final AutoTopupSettingsResultTypeAutotopup AUTOFUND = new AutoTopupSettingsResultTypeAutotopup("AUTOFUND", 2, "autofund");
    public static final AutoTopupSettingsResultTypeAutotopup AUTOTOPUP = new AutoTopupSettingsResultTypeAutotopup("AUTOTOPUP", 3, "autotopup");

    private static final /* synthetic */ AutoTopupSettingsResultTypeAutotopup[] $values() {
        return new AutoTopupSettingsResultTypeAutotopup[]{ROUNDING, REGULAR_AUTOTOPUP, AUTOFUND, AUTOTOPUP};
    }

    static {
        AutoTopupSettingsResultTypeAutotopup[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private AutoTopupSettingsResultTypeAutotopup(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static AutoTopupSettingsResultTypeAutotopup valueOf(String str) {
        return (AutoTopupSettingsResultTypeAutotopup) Enum.valueOf(AutoTopupSettingsResultTypeAutotopup.class, str);
    }

    public static AutoTopupSettingsResultTypeAutotopup[] values() {
        return (AutoTopupSettingsResultTypeAutotopup[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
