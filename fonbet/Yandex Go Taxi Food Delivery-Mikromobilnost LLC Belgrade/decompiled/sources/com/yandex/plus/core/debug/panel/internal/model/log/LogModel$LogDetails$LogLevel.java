package com.yandex.plus.core.debug.panel.internal.model.log;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/yandex/plus/core/debug/panel/internal/model/log/LogModel$LogDetails$LogLevel", "", "Lcom/yandex/plus/core/debug/panel/internal/model/log/LogModel$LogDetails$LogLevel;", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "UNSPECIFIED", "homeless-core-debug-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LogModel$LogDetails$LogLevel {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LogModel$LogDetails$LogLevel[] $VALUES;
    public static final LogModel$LogDetails$LogLevel DEBUG;
    public static final LogModel$LogDetails$LogLevel ERROR;
    public static final LogModel$LogDetails$LogLevel INFO;
    public static final LogModel$LogDetails$LogLevel UNSPECIFIED;
    public static final LogModel$LogDetails$LogLevel VERBOSE;
    public static final LogModel$LogDetails$LogLevel WARN;

    static {
        LogModel$LogDetails$LogLevel logModel$LogDetails$LogLevel = new LogModel$LogDetails$LogLevel("VERBOSE", 0);
        VERBOSE = logModel$LogDetails$LogLevel;
        LogModel$LogDetails$LogLevel logModel$LogDetails$LogLevel2 = new LogModel$LogDetails$LogLevel("DEBUG", 1);
        DEBUG = logModel$LogDetails$LogLevel2;
        LogModel$LogDetails$LogLevel logModel$LogDetails$LogLevel3 = new LogModel$LogDetails$LogLevel("INFO", 2);
        INFO = logModel$LogDetails$LogLevel3;
        LogModel$LogDetails$LogLevel logModel$LogDetails$LogLevel4 = new LogModel$LogDetails$LogLevel("WARN", 3);
        WARN = logModel$LogDetails$LogLevel4;
        LogModel$LogDetails$LogLevel logModel$LogDetails$LogLevel5 = new LogModel$LogDetails$LogLevel("ERROR", 4);
        ERROR = logModel$LogDetails$LogLevel5;
        LogModel$LogDetails$LogLevel logModel$LogDetails$LogLevel6 = new LogModel$LogDetails$LogLevel("UNSPECIFIED", 5);
        UNSPECIFIED = logModel$LogDetails$LogLevel6;
        LogModel$LogDetails$LogLevel[] logModel$LogDetails$LogLevelArr = {logModel$LogDetails$LogLevel, logModel$LogDetails$LogLevel2, logModel$LogDetails$LogLevel3, logModel$LogDetails$LogLevel4, logModel$LogDetails$LogLevel5, logModel$LogDetails$LogLevel6};
        $VALUES = logModel$LogDetails$LogLevelArr;
        $ENTRIES = a.a(logModel$LogDetails$LogLevelArr);
    }

    public static LogModel$LogDetails$LogLevel valueOf(String str) {
        return (LogModel$LogDetails$LogLevel) Enum.valueOf(LogModel$LogDetails$LogLevel.class, str);
    }

    public static LogModel$LogDetails$LogLevel[] values() {
        return (LogModel$LogDetails$LogLevel[]) $VALUES.clone();
    }
}
