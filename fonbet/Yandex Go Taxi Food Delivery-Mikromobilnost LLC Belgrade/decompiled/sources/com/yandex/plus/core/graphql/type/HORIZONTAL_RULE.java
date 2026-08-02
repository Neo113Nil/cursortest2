package com.yandex.plus.core.graphql.type;

import defpackage.f5u;
import defpackage.k4o;
import defpackage.p4o;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/plus/core/graphql/type/HORIZONTAL_RULE;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "f5u", "CENTER", "LEFT", "RIGHT", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HORIZONTAL_RULE {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HORIZONTAL_RULE[] $VALUES;
    public static final HORIZONTAL_RULE CENTER;
    public static final f5u Companion;
    public static final HORIZONTAL_RULE LEFT;
    public static final HORIZONTAL_RULE RIGHT;
    public static final HORIZONTAL_RULE UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        HORIZONTAL_RULE horizontal_rule = new HORIZONTAL_RULE("CENTER", 0, "CENTER");
        CENTER = horizontal_rule;
        HORIZONTAL_RULE horizontal_rule2 = new HORIZONTAL_RULE("LEFT", 1, "LEFT");
        LEFT = horizontal_rule2;
        HORIZONTAL_RULE horizontal_rule3 = new HORIZONTAL_RULE("RIGHT", 2, "RIGHT");
        RIGHT = horizontal_rule3;
        HORIZONTAL_RULE horizontal_rule4 = new HORIZONTAL_RULE("UNKNOWN__", 3, "UNKNOWN__");
        UNKNOWN__ = horizontal_rule4;
        HORIZONTAL_RULE[] horizontal_ruleArr = {horizontal_rule, horizontal_rule2, horizontal_rule3, horizontal_rule4};
        $VALUES = horizontal_ruleArr;
        $ENTRIES = a.a(horizontal_ruleArr);
        Companion = new f5u();
        scc.g("CENTER", "LEFT", "RIGHT");
        type = new p4o("HORIZONTAL_RULE");
    }

    public HORIZONTAL_RULE(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static HORIZONTAL_RULE valueOf(String str) {
        return (HORIZONTAL_RULE) Enum.valueOf(HORIZONTAL_RULE.class, str);
    }

    public static HORIZONTAL_RULE[] values() {
        return (HORIZONTAL_RULE[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
