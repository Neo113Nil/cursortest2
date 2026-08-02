package com.yandex.plus.core.debug.panel.api.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/yandex/plus/core/debug/panel/api/data/DebugPanelInfoItem$LogDetails$DebugPanelLogLevel", "", "Lcom/yandex/plus/core/debug/panel/api/data/DebugPanelInfoItem$LogDetails$DebugPanelLogLevel;", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "UNSPECIFIED", "homeless-core-debug-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebugPanelInfoItem$LogDetails$DebugPanelLogLevel {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DebugPanelInfoItem$LogDetails$DebugPanelLogLevel[] $VALUES;
    public static final DebugPanelInfoItem$LogDetails$DebugPanelLogLevel DEBUG;
    public static final DebugPanelInfoItem$LogDetails$DebugPanelLogLevel ERROR;
    public static final DebugPanelInfoItem$LogDetails$DebugPanelLogLevel INFO;
    public static final DebugPanelInfoItem$LogDetails$DebugPanelLogLevel UNSPECIFIED;
    public static final DebugPanelInfoItem$LogDetails$DebugPanelLogLevel VERBOSE;
    public static final DebugPanelInfoItem$LogDetails$DebugPanelLogLevel WARN;

    static {
        DebugPanelInfoItem$LogDetails$DebugPanelLogLevel debugPanelInfoItem$LogDetails$DebugPanelLogLevel = new DebugPanelInfoItem$LogDetails$DebugPanelLogLevel("VERBOSE", 0);
        VERBOSE = debugPanelInfoItem$LogDetails$DebugPanelLogLevel;
        DebugPanelInfoItem$LogDetails$DebugPanelLogLevel debugPanelInfoItem$LogDetails$DebugPanelLogLevel2 = new DebugPanelInfoItem$LogDetails$DebugPanelLogLevel("DEBUG", 1);
        DEBUG = debugPanelInfoItem$LogDetails$DebugPanelLogLevel2;
        DebugPanelInfoItem$LogDetails$DebugPanelLogLevel debugPanelInfoItem$LogDetails$DebugPanelLogLevel3 = new DebugPanelInfoItem$LogDetails$DebugPanelLogLevel("INFO", 2);
        INFO = debugPanelInfoItem$LogDetails$DebugPanelLogLevel3;
        DebugPanelInfoItem$LogDetails$DebugPanelLogLevel debugPanelInfoItem$LogDetails$DebugPanelLogLevel4 = new DebugPanelInfoItem$LogDetails$DebugPanelLogLevel("WARN", 3);
        WARN = debugPanelInfoItem$LogDetails$DebugPanelLogLevel4;
        DebugPanelInfoItem$LogDetails$DebugPanelLogLevel debugPanelInfoItem$LogDetails$DebugPanelLogLevel5 = new DebugPanelInfoItem$LogDetails$DebugPanelLogLevel("ERROR", 4);
        ERROR = debugPanelInfoItem$LogDetails$DebugPanelLogLevel5;
        DebugPanelInfoItem$LogDetails$DebugPanelLogLevel debugPanelInfoItem$LogDetails$DebugPanelLogLevel6 = new DebugPanelInfoItem$LogDetails$DebugPanelLogLevel("UNSPECIFIED", 5);
        UNSPECIFIED = debugPanelInfoItem$LogDetails$DebugPanelLogLevel6;
        DebugPanelInfoItem$LogDetails$DebugPanelLogLevel[] debugPanelInfoItem$LogDetails$DebugPanelLogLevelArr = {debugPanelInfoItem$LogDetails$DebugPanelLogLevel, debugPanelInfoItem$LogDetails$DebugPanelLogLevel2, debugPanelInfoItem$LogDetails$DebugPanelLogLevel3, debugPanelInfoItem$LogDetails$DebugPanelLogLevel4, debugPanelInfoItem$LogDetails$DebugPanelLogLevel5, debugPanelInfoItem$LogDetails$DebugPanelLogLevel6};
        $VALUES = debugPanelInfoItem$LogDetails$DebugPanelLogLevelArr;
        $ENTRIES = a.a(debugPanelInfoItem$LogDetails$DebugPanelLogLevelArr);
    }

    public static DebugPanelInfoItem$LogDetails$DebugPanelLogLevel valueOf(String str) {
        return (DebugPanelInfoItem$LogDetails$DebugPanelLogLevel) Enum.valueOf(DebugPanelInfoItem$LogDetails$DebugPanelLogLevel.class, str);
    }

    public static DebugPanelInfoItem$LogDetails$DebugPanelLogLevel[] values() {
        return (DebugPanelInfoItem$LogDetails$DebugPanelLogLevel[]) $VALUES.clone();
    }
}
