package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/TechEvents$TechBiometryGetCodeFailedReason", "", "Lcom/ybsdk/core/analytics/generated/delegates/TechEvents$TechBiometryGetCodeFailedReason;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "KEY_FAILED", "NOT_ALLOWED", "SETTINGS_CHANGED", "CORRUPTED", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TechEvents$TechBiometryGetCodeFailedReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TechEvents$TechBiometryGetCodeFailedReason[] $VALUES;
    private final String originalValue;
    public static final TechEvents$TechBiometryGetCodeFailedReason KEY_FAILED = new TechEvents$TechBiometryGetCodeFailedReason("KEY_FAILED", 0, "key_failed");
    public static final TechEvents$TechBiometryGetCodeFailedReason NOT_ALLOWED = new TechEvents$TechBiometryGetCodeFailedReason("NOT_ALLOWED", 1, "not_allowed");
    public static final TechEvents$TechBiometryGetCodeFailedReason SETTINGS_CHANGED = new TechEvents$TechBiometryGetCodeFailedReason("SETTINGS_CHANGED", 2, "settings_changed");
    public static final TechEvents$TechBiometryGetCodeFailedReason CORRUPTED = new TechEvents$TechBiometryGetCodeFailedReason("CORRUPTED", 3, "corrupted");

    private static final /* synthetic */ TechEvents$TechBiometryGetCodeFailedReason[] $values() {
        return new TechEvents$TechBiometryGetCodeFailedReason[]{KEY_FAILED, NOT_ALLOWED, SETTINGS_CHANGED, CORRUPTED};
    }

    static {
        TechEvents$TechBiometryGetCodeFailedReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TechEvents$TechBiometryGetCodeFailedReason(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TechEvents$TechBiometryGetCodeFailedReason valueOf(String str) {
        return (TechEvents$TechBiometryGetCodeFailedReason) Enum.valueOf(TechEvents$TechBiometryGetCodeFailedReason.class, str);
    }

    public static TechEvents$TechBiometryGetCodeFailedReason[] values() {
        return (TechEvents$TechBiometryGetCodeFailedReason[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
