package com.yandex.passport.common.logger;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/passport/common/logger/LogLevel;", "", "", "value", CA20Status.STATUS_USER_I, "getValue", "()I", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "ASSERT", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LogLevel {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LogLevel[] $VALUES;
    public static final LogLevel ASSERT;
    public static final LogLevel DEBUG;
    public static final LogLevel ERROR;
    public static final LogLevel INFO;
    public static final LogLevel VERBOSE;
    public static final LogLevel WARN;
    private final int value;

    static {
        LogLevel logLevel = new LogLevel("VERBOSE", 0, 2);
        VERBOSE = logLevel;
        LogLevel logLevel2 = new LogLevel("DEBUG", 1, 3);
        DEBUG = logLevel2;
        LogLevel logLevel3 = new LogLevel("INFO", 2, 4);
        INFO = logLevel3;
        LogLevel logLevel4 = new LogLevel("WARN", 3, 5);
        WARN = logLevel4;
        LogLevel logLevel5 = new LogLevel("ERROR", 4, 6);
        ERROR = logLevel5;
        LogLevel logLevel6 = new LogLevel("ASSERT", 5, 7);
        ASSERT = logLevel6;
        LogLevel[] logLevelArr = {logLevel, logLevel2, logLevel3, logLevel4, logLevel5, logLevel6};
        $VALUES = logLevelArr;
        $ENTRIES = kotlin.enums.a.a(logLevelArr);
    }

    public LogLevel(String str, int i, int i2) {
        this.value = i2;
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) $VALUES.clone();
    }
}
