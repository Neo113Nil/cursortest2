package com.yandex.plus.log.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/plus/log/api/LogPriority;", "", "", "priorityInt", CA20Status.STATUS_USER_I, "getPriorityInt", "()I", "VERBOSE", "DEBUG", "INFO", "WARNING", "ERROR", "ASSERT", "homeless-core-log-api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LogPriority {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LogPriority[] $VALUES;
    public static final LogPriority ASSERT;
    public static final LogPriority DEBUG;
    public static final LogPriority ERROR;
    public static final LogPriority INFO;
    public static final LogPriority VERBOSE;
    public static final LogPriority WARNING;
    private final int priorityInt;

    static {
        LogPriority logPriority = new LogPriority("VERBOSE", 0, 1);
        VERBOSE = logPriority;
        LogPriority logPriority2 = new LogPriority("DEBUG", 1, 2);
        DEBUG = logPriority2;
        LogPriority logPriority3 = new LogPriority("INFO", 2, 3);
        INFO = logPriority3;
        LogPriority logPriority4 = new LogPriority("WARNING", 3, 4);
        WARNING = logPriority4;
        LogPriority logPriority5 = new LogPriority("ERROR", 4, 5);
        ERROR = logPriority5;
        LogPriority logPriority6 = new LogPriority("ASSERT", 5, 6);
        ASSERT = logPriority6;
        LogPriority[] logPriorityArr = {logPriority, logPriority2, logPriority3, logPriority4, logPriority5, logPriority6};
        $VALUES = logPriorityArr;
        $ENTRIES = a.a(logPriorityArr);
    }

    public LogPriority(String str, int i, int i2) {
        this.priorityInt = i2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static LogPriority valueOf(String str) {
        return (LogPriority) Enum.valueOf(LogPriority.class, str);
    }

    public static LogPriority[] values() {
        return (LogPriority[]) $VALUES.clone();
    }
}
