package com.yandex.plus.core.graphql.type;

import defpackage.k4o;
import defpackage.p4o;
import defpackage.qxj0;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/plus/core/graphql/type/RestrictionMode;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "qxj0", "AUTO", "RESTRICTED", "UNRESTRICTED", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RestrictionMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RestrictionMode[] $VALUES;
    public static final RestrictionMode AUTO;
    public static final qxj0 Companion;
    public static final RestrictionMode RESTRICTED;
    public static final RestrictionMode UNKNOWN__;
    public static final RestrictionMode UNRESTRICTED;
    private static final p4o type;
    private final String rawValue;

    static {
        RestrictionMode restrictionMode = new RestrictionMode("AUTO", 0, "AUTO");
        AUTO = restrictionMode;
        RestrictionMode restrictionMode2 = new RestrictionMode("RESTRICTED", 1, "RESTRICTED");
        RESTRICTED = restrictionMode2;
        RestrictionMode restrictionMode3 = new RestrictionMode("UNRESTRICTED", 2, "UNRESTRICTED");
        UNRESTRICTED = restrictionMode3;
        RestrictionMode restrictionMode4 = new RestrictionMode("UNKNOWN__", 3, "UNKNOWN__");
        UNKNOWN__ = restrictionMode4;
        RestrictionMode[] restrictionModeArr = {restrictionMode, restrictionMode2, restrictionMode3, restrictionMode4};
        $VALUES = restrictionModeArr;
        $ENTRIES = a.a(restrictionModeArr);
        Companion = new qxj0();
        scc.g("AUTO", "RESTRICTED", "UNRESTRICTED");
        type = new p4o("RestrictionMode");
    }

    public RestrictionMode(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static RestrictionMode valueOf(String str) {
        return (RestrictionMode) Enum.valueOf(RestrictionMode.class, str);
    }

    public static RestrictionMode[] values() {
        return (RestrictionMode[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
