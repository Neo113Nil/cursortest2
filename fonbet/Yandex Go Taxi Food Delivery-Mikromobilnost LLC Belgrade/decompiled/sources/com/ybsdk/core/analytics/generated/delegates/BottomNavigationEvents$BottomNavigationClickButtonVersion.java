package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/BottomNavigationEvents$BottomNavigationClickButtonVersion", "", "Lcom/ybsdk/core/analytics/generated/delegates/BottomNavigationEvents$BottomNavigationClickButtonVersion;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "TSAR_BUTTON", "SCREEN_BUTTON", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BottomNavigationEvents$BottomNavigationClickButtonVersion {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BottomNavigationEvents$BottomNavigationClickButtonVersion[] $VALUES;
    private final String originalValue;
    public static final BottomNavigationEvents$BottomNavigationClickButtonVersion TSAR_BUTTON = new BottomNavigationEvents$BottomNavigationClickButtonVersion("TSAR_BUTTON", 0, "tsar_button");
    public static final BottomNavigationEvents$BottomNavigationClickButtonVersion SCREEN_BUTTON = new BottomNavigationEvents$BottomNavigationClickButtonVersion("SCREEN_BUTTON", 1, "screen_button");

    private static final /* synthetic */ BottomNavigationEvents$BottomNavigationClickButtonVersion[] $values() {
        return new BottomNavigationEvents$BottomNavigationClickButtonVersion[]{TSAR_BUTTON, SCREEN_BUTTON};
    }

    static {
        BottomNavigationEvents$BottomNavigationClickButtonVersion[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private BottomNavigationEvents$BottomNavigationClickButtonVersion(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static BottomNavigationEvents$BottomNavigationClickButtonVersion valueOf(String str) {
        return (BottomNavigationEvents$BottomNavigationClickButtonVersion) Enum.valueOf(BottomNavigationEvents$BottomNavigationClickButtonVersion.class, str);
    }

    public static BottomNavigationEvents$BottomNavigationClickButtonVersion[] values() {
        return (BottomNavigationEvents$BottomNavigationClickButtonVersion[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
