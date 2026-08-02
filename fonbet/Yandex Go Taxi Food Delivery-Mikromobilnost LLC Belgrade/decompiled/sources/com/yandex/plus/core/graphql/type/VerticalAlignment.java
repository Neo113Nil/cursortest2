package com.yandex.plus.core.graphql.type;

import defpackage.k4o;
import defpackage.p4o;
import defpackage.ra31;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/plus/core/graphql/type/VerticalAlignment;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "ra31", "BOTTOM", "CENTER", "TOP", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VerticalAlignment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VerticalAlignment[] $VALUES;
    public static final VerticalAlignment BOTTOM;
    public static final VerticalAlignment CENTER;
    public static final ra31 Companion;
    public static final VerticalAlignment TOP;
    public static final VerticalAlignment UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        VerticalAlignment verticalAlignment = new VerticalAlignment("BOTTOM", 0, "BOTTOM");
        BOTTOM = verticalAlignment;
        VerticalAlignment verticalAlignment2 = new VerticalAlignment("CENTER", 1, "CENTER");
        CENTER = verticalAlignment2;
        VerticalAlignment verticalAlignment3 = new VerticalAlignment("TOP", 2, "TOP");
        TOP = verticalAlignment3;
        VerticalAlignment verticalAlignment4 = new VerticalAlignment("UNKNOWN__", 3, "UNKNOWN__");
        UNKNOWN__ = verticalAlignment4;
        VerticalAlignment[] verticalAlignmentArr = {verticalAlignment, verticalAlignment2, verticalAlignment3, verticalAlignment4};
        $VALUES = verticalAlignmentArr;
        $ENTRIES = a.a(verticalAlignmentArr);
        Companion = new ra31();
        scc.g("BOTTOM", "CENTER", "TOP");
        type = new p4o("VerticalAlignment");
    }

    public VerticalAlignment(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static VerticalAlignment valueOf(String str) {
        return (VerticalAlignment) Enum.valueOf(VerticalAlignment.class, str);
    }

    public static VerticalAlignment[] values() {
        return (VerticalAlignment[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
