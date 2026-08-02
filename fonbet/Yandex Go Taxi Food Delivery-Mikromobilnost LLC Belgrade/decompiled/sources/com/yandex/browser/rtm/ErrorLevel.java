package com.yandex.browser.rtm;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/browser/rtm/ErrorLevel;", "", "", "tag", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "INFO", "DEBUG", "WARN", "ERROR", "FATAL", "lib-redir-log"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ErrorLevel {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ErrorLevel[] $VALUES;
    public static final ErrorLevel DEBUG;
    public static final ErrorLevel ERROR;
    public static final ErrorLevel FATAL;
    public static final ErrorLevel INFO;
    public static final ErrorLevel WARN;
    private final String tag;

    static {
        ErrorLevel errorLevel = new ErrorLevel("INFO", 0, "info");
        INFO = errorLevel;
        ErrorLevel errorLevel2 = new ErrorLevel("DEBUG", 1, "debug");
        DEBUG = errorLevel2;
        ErrorLevel errorLevel3 = new ErrorLevel("WARN", 2, "warn");
        WARN = errorLevel3;
        ErrorLevel errorLevel4 = new ErrorLevel("ERROR", 3, "error");
        ERROR = errorLevel4;
        ErrorLevel errorLevel5 = new ErrorLevel("FATAL", 4, "fatal");
        FATAL = errorLevel5;
        ErrorLevel[] errorLevelArr = {errorLevel, errorLevel2, errorLevel3, errorLevel4, errorLevel5};
        $VALUES = errorLevelArr;
        $ENTRIES = a.a(errorLevelArr);
    }

    public ErrorLevel(String str, int i, String str2) {
        this.tag = str2;
    }

    public static ErrorLevel valueOf(String str) {
        return (ErrorLevel) Enum.valueOf(ErrorLevel.class, str);
    }

    public static ErrorLevel[] values() {
        return (ErrorLevel[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getTag() {
        return this.tag;
    }
}
