package com.yandex.plus.core.graphql.type;

import defpackage.h97;
import defpackage.k4o;
import defpackage.p4o;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/plus/core/graphql/type/CORNER_SETTINGS;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "h97", "FIX", "HALF_HEIGHT", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CORNER_SETTINGS {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CORNER_SETTINGS[] $VALUES;
    public static final h97 Companion;
    public static final CORNER_SETTINGS FIX;
    public static final CORNER_SETTINGS HALF_HEIGHT;
    public static final CORNER_SETTINGS UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        CORNER_SETTINGS corner_settings = new CORNER_SETTINGS("FIX", 0, "FIX");
        FIX = corner_settings;
        CORNER_SETTINGS corner_settings2 = new CORNER_SETTINGS("HALF_HEIGHT", 1, "HALF_HEIGHT");
        HALF_HEIGHT = corner_settings2;
        CORNER_SETTINGS corner_settings3 = new CORNER_SETTINGS("UNKNOWN__", 2, "UNKNOWN__");
        UNKNOWN__ = corner_settings3;
        CORNER_SETTINGS[] corner_settingsArr = {corner_settings, corner_settings2, corner_settings3};
        $VALUES = corner_settingsArr;
        $ENTRIES = a.a(corner_settingsArr);
        Companion = new h97();
        scc.g("FIX", "HALF_HEIGHT");
        type = new p4o("CORNER_SETTINGS");
    }

    public CORNER_SETTINGS(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static CORNER_SETTINGS valueOf(String str) {
        return (CORNER_SETTINGS) Enum.valueOf(CORNER_SETTINGS.class, str);
    }

    public static CORNER_SETTINGS[] values() {
        return (CORNER_SETTINGS[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
