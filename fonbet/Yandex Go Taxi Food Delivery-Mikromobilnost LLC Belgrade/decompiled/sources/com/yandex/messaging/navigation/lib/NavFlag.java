package com.yandex.messaging.navigation.lib;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/messaging/navigation/lib/NavFlag;", "", "DEFAULT", "SINGLE_TOP", "CLEAR_TOP", "REPLACE", "CLEAR_TASK", "navigation-lib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NavFlag {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NavFlag[] $VALUES;
    public static final NavFlag CLEAR_TASK;
    public static final NavFlag CLEAR_TOP;
    public static final NavFlag DEFAULT;
    public static final NavFlag REPLACE;
    public static final NavFlag SINGLE_TOP;

    static {
        NavFlag navFlag = new NavFlag("DEFAULT", 0);
        DEFAULT = navFlag;
        NavFlag navFlag2 = new NavFlag("SINGLE_TOP", 1);
        SINGLE_TOP = navFlag2;
        NavFlag navFlag3 = new NavFlag("CLEAR_TOP", 2);
        CLEAR_TOP = navFlag3;
        NavFlag navFlag4 = new NavFlag("REPLACE", 3);
        REPLACE = navFlag4;
        NavFlag navFlag5 = new NavFlag("CLEAR_TASK", 4);
        CLEAR_TASK = navFlag5;
        NavFlag[] navFlagArr = {navFlag, navFlag2, navFlag3, navFlag4, navFlag5};
        $VALUES = navFlagArr;
        $ENTRIES = a.a(navFlagArr);
    }

    public static NavFlag valueOf(String str) {
        return (NavFlag) Enum.valueOf(NavFlag.class, str);
    }

    public static NavFlag[] values() {
        return (NavFlag[]) $VALUES.clone();
    }
}
