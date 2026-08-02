package com.yandex.plus.core.analytics.logging;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/core/analytics/logging/PlusLogLevel;", "", "DEBUG", "VERBOSE", "INFO", "WARNING", "ERROR", "ASSERT", "plus-core-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlusLogLevel {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusLogLevel[] $VALUES;
    public static final PlusLogLevel ASSERT;
    public static final PlusLogLevel DEBUG;
    public static final PlusLogLevel ERROR;
    public static final PlusLogLevel INFO;
    public static final PlusLogLevel VERBOSE;
    public static final PlusLogLevel WARNING;

    static {
        PlusLogLevel plusLogLevel = new PlusLogLevel("DEBUG", 0);
        DEBUG = plusLogLevel;
        PlusLogLevel plusLogLevel2 = new PlusLogLevel("VERBOSE", 1);
        VERBOSE = plusLogLevel2;
        PlusLogLevel plusLogLevel3 = new PlusLogLevel("INFO", 2);
        INFO = plusLogLevel3;
        PlusLogLevel plusLogLevel4 = new PlusLogLevel("WARNING", 3);
        WARNING = plusLogLevel4;
        PlusLogLevel plusLogLevel5 = new PlusLogLevel("ERROR", 4);
        ERROR = plusLogLevel5;
        PlusLogLevel plusLogLevel6 = new PlusLogLevel("ASSERT", 5);
        ASSERT = plusLogLevel6;
        PlusLogLevel[] plusLogLevelArr = {plusLogLevel, plusLogLevel2, plusLogLevel3, plusLogLevel4, plusLogLevel5, plusLogLevel6};
        $VALUES = plusLogLevelArr;
        $ENTRIES = a.a(plusLogLevelArr);
    }

    public static PlusLogLevel valueOf(String str) {
        return (PlusLogLevel) Enum.valueOf(PlusLogLevel.class, str);
    }

    public static PlusLogLevel[] values() {
        return (PlusLogLevel[]) $VALUES.clone();
    }
}
