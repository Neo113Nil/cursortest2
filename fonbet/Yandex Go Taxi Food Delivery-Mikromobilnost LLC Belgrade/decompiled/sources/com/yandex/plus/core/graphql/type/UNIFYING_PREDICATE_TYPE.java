package com.yandex.plus.core.graphql.type;

import defpackage.dr11;
import defpackage.k4o;
import defpackage.p4o;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/plus/core/graphql/type/UNIFYING_PREDICATE_TYPE;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "dr11", "ALL_OF", "ANY_OF", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UNIFYING_PREDICATE_TYPE {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UNIFYING_PREDICATE_TYPE[] $VALUES;
    public static final UNIFYING_PREDICATE_TYPE ALL_OF;
    public static final UNIFYING_PREDICATE_TYPE ANY_OF;
    public static final dr11 Companion;
    public static final UNIFYING_PREDICATE_TYPE UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        UNIFYING_PREDICATE_TYPE unifying_predicate_type = new UNIFYING_PREDICATE_TYPE("ALL_OF", 0, "ALL_OF");
        ALL_OF = unifying_predicate_type;
        UNIFYING_PREDICATE_TYPE unifying_predicate_type2 = new UNIFYING_PREDICATE_TYPE("ANY_OF", 1, "ANY_OF");
        ANY_OF = unifying_predicate_type2;
        UNIFYING_PREDICATE_TYPE unifying_predicate_type3 = new UNIFYING_PREDICATE_TYPE("UNKNOWN__", 2, "UNKNOWN__");
        UNKNOWN__ = unifying_predicate_type3;
        UNIFYING_PREDICATE_TYPE[] unifying_predicate_typeArr = {unifying_predicate_type, unifying_predicate_type2, unifying_predicate_type3};
        $VALUES = unifying_predicate_typeArr;
        $ENTRIES = a.a(unifying_predicate_typeArr);
        Companion = new dr11();
        scc.g("ALL_OF", "ANY_OF");
        type = new p4o("UNIFYING_PREDICATE_TYPE");
    }

    public UNIFYING_PREDICATE_TYPE(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static UNIFYING_PREDICATE_TYPE valueOf(String str) {
        return (UNIFYING_PREDICATE_TYPE) Enum.valueOf(UNIFYING_PREDICATE_TYPE.class, str);
    }

    public static UNIFYING_PREDICATE_TYPE[] values() {
        return (UNIFYING_PREDICATE_TYPE[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
