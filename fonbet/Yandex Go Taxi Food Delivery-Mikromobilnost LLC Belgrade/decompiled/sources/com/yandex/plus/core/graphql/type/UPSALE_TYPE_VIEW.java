package com.yandex.plus.core.graphql.type;

import defpackage.k4o;
import defpackage.lr11;
import defpackage.p4o;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/plus/core/graphql/type/UPSALE_TYPE_VIEW;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "lr11", "ADDITION", "REPLACE", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UPSALE_TYPE_VIEW {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UPSALE_TYPE_VIEW[] $VALUES;
    public static final UPSALE_TYPE_VIEW ADDITION;
    public static final lr11 Companion;
    public static final UPSALE_TYPE_VIEW REPLACE;
    public static final UPSALE_TYPE_VIEW UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        UPSALE_TYPE_VIEW upsale_type_view = new UPSALE_TYPE_VIEW("ADDITION", 0, "ADDITION");
        ADDITION = upsale_type_view;
        UPSALE_TYPE_VIEW upsale_type_view2 = new UPSALE_TYPE_VIEW("REPLACE", 1, "REPLACE");
        REPLACE = upsale_type_view2;
        UPSALE_TYPE_VIEW upsale_type_view3 = new UPSALE_TYPE_VIEW("UNKNOWN__", 2, "UNKNOWN__");
        UNKNOWN__ = upsale_type_view3;
        UPSALE_TYPE_VIEW[] upsale_type_viewArr = {upsale_type_view, upsale_type_view2, upsale_type_view3};
        $VALUES = upsale_type_viewArr;
        $ENTRIES = a.a(upsale_type_viewArr);
        Companion = new lr11();
        scc.g("ADDITION", "REPLACE");
        type = new p4o("UPSALE_TYPE_VIEW");
    }

    public UPSALE_TYPE_VIEW(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static UPSALE_TYPE_VIEW valueOf(String str) {
        return (UPSALE_TYPE_VIEW) Enum.valueOf(UPSALE_TYPE_VIEW.class, str);
    }

    public static UPSALE_TYPE_VIEW[] values() {
        return (UPSALE_TYPE_VIEW[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
