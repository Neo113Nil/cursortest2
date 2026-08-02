package com.yandex.plus.core.graphql.type;

import defpackage.k4o;
import defpackage.p4o;
import defpackage.qan;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/plus/core/graphql/type/ELEMENT_LEVEL_TYPE;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "qan", "WIDGET", "WIDGET_GROUP", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ELEMENT_LEVEL_TYPE {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ELEMENT_LEVEL_TYPE[] $VALUES;
    public static final qan Companion;
    public static final ELEMENT_LEVEL_TYPE UNKNOWN__;
    public static final ELEMENT_LEVEL_TYPE WIDGET;
    public static final ELEMENT_LEVEL_TYPE WIDGET_GROUP;
    private static final p4o type;
    private final String rawValue;

    static {
        ELEMENT_LEVEL_TYPE element_level_type = new ELEMENT_LEVEL_TYPE("WIDGET", 0, "WIDGET");
        WIDGET = element_level_type;
        ELEMENT_LEVEL_TYPE element_level_type2 = new ELEMENT_LEVEL_TYPE("WIDGET_GROUP", 1, "WIDGET_GROUP");
        WIDGET_GROUP = element_level_type2;
        ELEMENT_LEVEL_TYPE element_level_type3 = new ELEMENT_LEVEL_TYPE("UNKNOWN__", 2, "UNKNOWN__");
        UNKNOWN__ = element_level_type3;
        ELEMENT_LEVEL_TYPE[] element_level_typeArr = {element_level_type, element_level_type2, element_level_type3};
        $VALUES = element_level_typeArr;
        $ENTRIES = a.a(element_level_typeArr);
        Companion = new qan();
        scc.g("WIDGET", "WIDGET_GROUP");
        type = new p4o("ELEMENT_LEVEL_TYPE");
    }

    public ELEMENT_LEVEL_TYPE(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static ELEMENT_LEVEL_TYPE valueOf(String str) {
        return (ELEMENT_LEVEL_TYPE) Enum.valueOf(ELEMENT_LEVEL_TYPE.class, str);
    }

    public static ELEMENT_LEVEL_TYPE[] values() {
        return (ELEMENT_LEVEL_TYPE[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
