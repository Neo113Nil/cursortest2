package com.yandex.plus.core.graphql.type;

import defpackage.k4o;
import defpackage.p4o;
import defpackage.py21;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/plus/core/graphql/type/VERTICAL_RULE;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "py21", "BOTTOM", "CENTER", "TOP", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VERTICAL_RULE {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VERTICAL_RULE[] $VALUES;
    public static final VERTICAL_RULE BOTTOM;
    public static final VERTICAL_RULE CENTER;
    public static final py21 Companion;
    public static final VERTICAL_RULE TOP;
    public static final VERTICAL_RULE UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        VERTICAL_RULE vertical_rule = new VERTICAL_RULE("BOTTOM", 0, "BOTTOM");
        BOTTOM = vertical_rule;
        VERTICAL_RULE vertical_rule2 = new VERTICAL_RULE("CENTER", 1, "CENTER");
        CENTER = vertical_rule2;
        VERTICAL_RULE vertical_rule3 = new VERTICAL_RULE("TOP", 2, "TOP");
        TOP = vertical_rule3;
        VERTICAL_RULE vertical_rule4 = new VERTICAL_RULE("UNKNOWN__", 3, "UNKNOWN__");
        UNKNOWN__ = vertical_rule4;
        VERTICAL_RULE[] vertical_ruleArr = {vertical_rule, vertical_rule2, vertical_rule3, vertical_rule4};
        $VALUES = vertical_ruleArr;
        $ENTRIES = a.a(vertical_ruleArr);
        Companion = new py21();
        scc.g("BOTTOM", "CENTER", "TOP");
        type = new p4o("VERTICAL_RULE");
    }

    public VERTICAL_RULE(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static VERTICAL_RULE valueOf(String str) {
        return (VERTICAL_RULE) Enum.valueOf(VERTICAL_RULE.class, str);
    }

    public static VERTICAL_RULE[] values() {
        return (VERTICAL_RULE[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
