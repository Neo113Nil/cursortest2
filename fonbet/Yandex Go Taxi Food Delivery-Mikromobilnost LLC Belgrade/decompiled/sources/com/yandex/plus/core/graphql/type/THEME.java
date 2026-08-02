package com.yandex.plus.core.graphql.type;

import defpackage.i4x0;
import defpackage.k4o;
import defpackage.p4o;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/plus/core/graphql/type/THEME;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "i4x0", "DARK", "LIGHT", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class THEME {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ THEME[] $VALUES;
    public static final i4x0 Companion;
    public static final THEME DARK;
    public static final THEME LIGHT;
    public static final THEME UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        THEME theme = new THEME("DARK", 0, "DARK");
        DARK = theme;
        THEME theme2 = new THEME("LIGHT", 1, "LIGHT");
        LIGHT = theme2;
        THEME theme3 = new THEME("UNKNOWN__", 2, "UNKNOWN__");
        UNKNOWN__ = theme3;
        THEME[] themeArr = {theme, theme2, theme3};
        $VALUES = themeArr;
        $ENTRIES = a.a(themeArr);
        Companion = new i4x0();
        scc.g("DARK", "LIGHT");
        type = new p4o("THEME");
    }

    public THEME(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static THEME valueOf(String str) {
        return (THEME) Enum.valueOf(THEME.class, str);
    }

    public static THEME[] values() {
        return (THEME[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
