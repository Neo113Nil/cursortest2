package com.yandex.plus.core.graphql.type;

import defpackage.j041;
import defpackage.k4o;
import defpackage.p4o;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/plus/core/graphql/type/WIDTH_TYPE;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "j041", "FILL", "FIT", "FIX", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WIDTH_TYPE {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WIDTH_TYPE[] $VALUES;
    public static final j041 Companion;
    public static final WIDTH_TYPE FILL;
    public static final WIDTH_TYPE FIT;
    public static final WIDTH_TYPE FIX;
    public static final WIDTH_TYPE UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        WIDTH_TYPE width_type = new WIDTH_TYPE("FILL", 0, "FILL");
        FILL = width_type;
        WIDTH_TYPE width_type2 = new WIDTH_TYPE("FIT", 1, "FIT");
        FIT = width_type2;
        WIDTH_TYPE width_type3 = new WIDTH_TYPE("FIX", 2, "FIX");
        FIX = width_type3;
        WIDTH_TYPE width_type4 = new WIDTH_TYPE("UNKNOWN__", 3, "UNKNOWN__");
        UNKNOWN__ = width_type4;
        WIDTH_TYPE[] width_typeArr = {width_type, width_type2, width_type3, width_type4};
        $VALUES = width_typeArr;
        $ENTRIES = a.a(width_typeArr);
        Companion = new j041();
        scc.g("FILL", "FIT", "FIX");
        type = new p4o("WIDTH_TYPE");
    }

    public WIDTH_TYPE(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static WIDTH_TYPE valueOf(String str) {
        return (WIDTH_TYPE) Enum.valueOf(WIDTH_TYPE.class, str);
    }

    public static WIDTH_TYPE[] values() {
        return (WIDTH_TYPE[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
