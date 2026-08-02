package com.ybsdk.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/api/YBDebugMessage$Level", "", "Lcom/ybsdk/api/YBDebugMessage$Level;", "<init>", "(Ljava/lang/String;I)V", "INFO", "WARNING", "ERROR", "yb-sdk-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class YBDebugMessage$Level {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YBDebugMessage$Level[] $VALUES;
    public static final YBDebugMessage$Level INFO = new YBDebugMessage$Level("INFO", 0);
    public static final YBDebugMessage$Level WARNING = new YBDebugMessage$Level("WARNING", 1);
    public static final YBDebugMessage$Level ERROR = new YBDebugMessage$Level("ERROR", 2);

    private static final /* synthetic */ YBDebugMessage$Level[] $values() {
        return new YBDebugMessage$Level[]{INFO, WARNING, ERROR};
    }

    static {
        YBDebugMessage$Level[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private YBDebugMessage$Level(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static YBDebugMessage$Level valueOf(String str) {
        return (YBDebugMessage$Level) Enum.valueOf(YBDebugMessage$Level.class, str);
    }

    public static YBDebugMessage$Level[] values() {
        return (YBDebugMessage$Level[]) $VALUES.clone();
    }
}
