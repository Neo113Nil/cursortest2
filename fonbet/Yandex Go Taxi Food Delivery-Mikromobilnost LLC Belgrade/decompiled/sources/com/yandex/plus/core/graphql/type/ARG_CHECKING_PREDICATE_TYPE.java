package com.yandex.plus.core.graphql.type;

import defpackage.k4o;
import defpackage.m1;
import defpackage.p4o;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/plus/core/graphql/type/ARG_CHECKING_PREDICATE_TYPE;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "m1", "BOOL", "IS_NULL", "NOT_NULL", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ARG_CHECKING_PREDICATE_TYPE {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ARG_CHECKING_PREDICATE_TYPE[] $VALUES;
    public static final ARG_CHECKING_PREDICATE_TYPE BOOL;
    public static final m1 Companion;
    public static final ARG_CHECKING_PREDICATE_TYPE IS_NULL;
    public static final ARG_CHECKING_PREDICATE_TYPE NOT_NULL;
    public static final ARG_CHECKING_PREDICATE_TYPE UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        ARG_CHECKING_PREDICATE_TYPE arg_checking_predicate_type = new ARG_CHECKING_PREDICATE_TYPE("BOOL", 0, "BOOL");
        BOOL = arg_checking_predicate_type;
        ARG_CHECKING_PREDICATE_TYPE arg_checking_predicate_type2 = new ARG_CHECKING_PREDICATE_TYPE("IS_NULL", 1, "IS_NULL");
        IS_NULL = arg_checking_predicate_type2;
        ARG_CHECKING_PREDICATE_TYPE arg_checking_predicate_type3 = new ARG_CHECKING_PREDICATE_TYPE("NOT_NULL", 2, "NOT_NULL");
        NOT_NULL = arg_checking_predicate_type3;
        ARG_CHECKING_PREDICATE_TYPE arg_checking_predicate_type4 = new ARG_CHECKING_PREDICATE_TYPE("UNKNOWN__", 3, "UNKNOWN__");
        UNKNOWN__ = arg_checking_predicate_type4;
        ARG_CHECKING_PREDICATE_TYPE[] arg_checking_predicate_typeArr = {arg_checking_predicate_type, arg_checking_predicate_type2, arg_checking_predicate_type3, arg_checking_predicate_type4};
        $VALUES = arg_checking_predicate_typeArr;
        $ENTRIES = a.a(arg_checking_predicate_typeArr);
        Companion = new m1();
        scc.g("BOOL", "IS_NULL", "NOT_NULL");
        type = new p4o("ARG_CHECKING_PREDICATE_TYPE");
    }

    public ARG_CHECKING_PREDICATE_TYPE(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static ARG_CHECKING_PREDICATE_TYPE valueOf(String str) {
        return (ARG_CHECKING_PREDICATE_TYPE) Enum.valueOf(ARG_CHECKING_PREDICATE_TYPE.class, str);
    }

    public static ARG_CHECKING_PREDICATE_TYPE[] values() {
        return (ARG_CHECKING_PREDICATE_TYPE[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
