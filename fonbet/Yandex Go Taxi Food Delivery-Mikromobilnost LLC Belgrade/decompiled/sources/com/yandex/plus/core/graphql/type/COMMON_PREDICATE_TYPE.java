package com.yandex.plus.core.graphql.type;

import defpackage.c97;
import defpackage.k4o;
import defpackage.p4o;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/plus/core/graphql/type/COMMON_PREDICATE_TYPE;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "c97", "ARG_CHECKING", "BOOLEAN", "COMPARISON", "CONTAINS", "IN_SET", "NOT", "UNIFYING", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class COMMON_PREDICATE_TYPE {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ COMMON_PREDICATE_TYPE[] $VALUES;
    public static final COMMON_PREDICATE_TYPE ARG_CHECKING;
    public static final COMMON_PREDICATE_TYPE BOOLEAN;
    public static final COMMON_PREDICATE_TYPE COMPARISON;
    public static final COMMON_PREDICATE_TYPE CONTAINS;
    public static final c97 Companion;
    public static final COMMON_PREDICATE_TYPE IN_SET;
    public static final COMMON_PREDICATE_TYPE NOT;
    public static final COMMON_PREDICATE_TYPE UNIFYING;
    public static final COMMON_PREDICATE_TYPE UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        COMMON_PREDICATE_TYPE common_predicate_type = new COMMON_PREDICATE_TYPE("ARG_CHECKING", 0, "ARG_CHECKING");
        ARG_CHECKING = common_predicate_type;
        COMMON_PREDICATE_TYPE common_predicate_type2 = new COMMON_PREDICATE_TYPE("BOOLEAN", 1, "BOOLEAN");
        BOOLEAN = common_predicate_type2;
        COMMON_PREDICATE_TYPE common_predicate_type3 = new COMMON_PREDICATE_TYPE("COMPARISON", 2, "COMPARISON");
        COMPARISON = common_predicate_type3;
        COMMON_PREDICATE_TYPE common_predicate_type4 = new COMMON_PREDICATE_TYPE("CONTAINS", 3, "CONTAINS");
        CONTAINS = common_predicate_type4;
        COMMON_PREDICATE_TYPE common_predicate_type5 = new COMMON_PREDICATE_TYPE("IN_SET", 4, "IN_SET");
        IN_SET = common_predicate_type5;
        COMMON_PREDICATE_TYPE common_predicate_type6 = new COMMON_PREDICATE_TYPE("NOT", 5, "NOT");
        NOT = common_predicate_type6;
        COMMON_PREDICATE_TYPE common_predicate_type7 = new COMMON_PREDICATE_TYPE("UNIFYING", 6, "UNIFYING");
        UNIFYING = common_predicate_type7;
        COMMON_PREDICATE_TYPE common_predicate_type8 = new COMMON_PREDICATE_TYPE("UNKNOWN__", 7, "UNKNOWN__");
        UNKNOWN__ = common_predicate_type8;
        COMMON_PREDICATE_TYPE[] common_predicate_typeArr = {common_predicate_type, common_predicate_type2, common_predicate_type3, common_predicate_type4, common_predicate_type5, common_predicate_type6, common_predicate_type7, common_predicate_type8};
        $VALUES = common_predicate_typeArr;
        $ENTRIES = a.a(common_predicate_typeArr);
        Companion = new c97();
        scc.g("ARG_CHECKING", "BOOLEAN", "COMPARISON", "CONTAINS", "IN_SET", "NOT", "UNIFYING");
        type = new p4o("COMMON_PREDICATE_TYPE");
    }

    public COMMON_PREDICATE_TYPE(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static COMMON_PREDICATE_TYPE valueOf(String str) {
        return (COMMON_PREDICATE_TYPE) Enum.valueOf(COMMON_PREDICATE_TYPE.class, str);
    }

    public static COMMON_PREDICATE_TYPE[] values() {
        return (COMMON_PREDICATE_TYPE[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
