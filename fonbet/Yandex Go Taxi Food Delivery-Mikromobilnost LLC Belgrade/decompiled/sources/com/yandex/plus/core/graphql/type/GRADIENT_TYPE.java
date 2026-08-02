package com.yandex.plus.core.graphql.type;

import defpackage.jrs;
import defpackage.k4o;
import defpackage.p4o;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/plus/core/graphql/type/GRADIENT_TYPE;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "jrs", "LINEAR", "RADIAL", "TRANSPARENT", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GRADIENT_TYPE {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GRADIENT_TYPE[] $VALUES;
    public static final jrs Companion;
    public static final GRADIENT_TYPE LINEAR;
    public static final GRADIENT_TYPE RADIAL;
    public static final GRADIENT_TYPE TRANSPARENT;
    public static final GRADIENT_TYPE UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        GRADIENT_TYPE gradient_type = new GRADIENT_TYPE("LINEAR", 0, "LINEAR");
        LINEAR = gradient_type;
        GRADIENT_TYPE gradient_type2 = new GRADIENT_TYPE("RADIAL", 1, "RADIAL");
        RADIAL = gradient_type2;
        GRADIENT_TYPE gradient_type3 = new GRADIENT_TYPE("TRANSPARENT", 2, "TRANSPARENT");
        TRANSPARENT = gradient_type3;
        GRADIENT_TYPE gradient_type4 = new GRADIENT_TYPE("UNKNOWN__", 3, "UNKNOWN__");
        UNKNOWN__ = gradient_type4;
        GRADIENT_TYPE[] gradient_typeArr = {gradient_type, gradient_type2, gradient_type3, gradient_type4};
        $VALUES = gradient_typeArr;
        $ENTRIES = a.a(gradient_typeArr);
        Companion = new jrs();
        scc.g("LINEAR", "RADIAL", "TRANSPARENT");
        type = new p4o("GRADIENT_TYPE");
    }

    public GRADIENT_TYPE(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static GRADIENT_TYPE valueOf(String str) {
        return (GRADIENT_TYPE) Enum.valueOf(GRADIENT_TYPE.class, str);
    }

    public static GRADIENT_TYPE[] values() {
        return (GRADIENT_TYPE[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
