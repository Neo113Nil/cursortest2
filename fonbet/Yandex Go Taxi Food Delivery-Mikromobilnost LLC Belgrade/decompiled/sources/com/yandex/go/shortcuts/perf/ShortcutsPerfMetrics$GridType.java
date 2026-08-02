package com.yandex.go.shortcuts.perf;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/shortcuts/perf/ShortcutsPerfMetrics$GridType", "", "Lcom/yandex/go/shortcuts/perf/ShortcutsPerfMetrics$GridType;", "NavigationShortcuts", "TaxiShortcuts", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ShortcutsPerfMetrics$GridType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ShortcutsPerfMetrics$GridType[] $VALUES;
    public static final ShortcutsPerfMetrics$GridType NavigationShortcuts;
    public static final ShortcutsPerfMetrics$GridType TaxiShortcuts;

    static {
        ShortcutsPerfMetrics$GridType shortcutsPerfMetrics$GridType = new ShortcutsPerfMetrics$GridType("NavigationShortcuts", 0);
        NavigationShortcuts = shortcutsPerfMetrics$GridType;
        ShortcutsPerfMetrics$GridType shortcutsPerfMetrics$GridType2 = new ShortcutsPerfMetrics$GridType("TaxiShortcuts", 1);
        TaxiShortcuts = shortcutsPerfMetrics$GridType2;
        ShortcutsPerfMetrics$GridType[] shortcutsPerfMetrics$GridTypeArr = {shortcutsPerfMetrics$GridType, shortcutsPerfMetrics$GridType2};
        $VALUES = shortcutsPerfMetrics$GridTypeArr;
        $ENTRIES = a.a(shortcutsPerfMetrics$GridTypeArr);
    }

    public static ShortcutsPerfMetrics$GridType valueOf(String str) {
        return (ShortcutsPerfMetrics$GridType) Enum.valueOf(ShortcutsPerfMetrics$GridType.class, str);
    }

    public static ShortcutsPerfMetrics$GridType[] values() {
        return (ShortcutsPerfMetrics$GridType[]) $VALUES.clone();
    }
}
