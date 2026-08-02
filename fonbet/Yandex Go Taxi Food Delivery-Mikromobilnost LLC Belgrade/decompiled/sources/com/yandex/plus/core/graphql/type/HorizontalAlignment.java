package com.yandex.plus.core.graphql.type;

import defpackage.aqu;
import defpackage.k4o;
import defpackage.p4o;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/plus/core/graphql/type/HorizontalAlignment;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "aqu", "CENTER", "LEFT", "RIGHT", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HorizontalAlignment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HorizontalAlignment[] $VALUES;
    public static final HorizontalAlignment CENTER;
    public static final aqu Companion;
    public static final HorizontalAlignment LEFT;
    public static final HorizontalAlignment RIGHT;
    public static final HorizontalAlignment UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        HorizontalAlignment horizontalAlignment = new HorizontalAlignment("CENTER", 0, "CENTER");
        CENTER = horizontalAlignment;
        HorizontalAlignment horizontalAlignment2 = new HorizontalAlignment("LEFT", 1, "LEFT");
        LEFT = horizontalAlignment2;
        HorizontalAlignment horizontalAlignment3 = new HorizontalAlignment("RIGHT", 2, "RIGHT");
        RIGHT = horizontalAlignment3;
        HorizontalAlignment horizontalAlignment4 = new HorizontalAlignment("UNKNOWN__", 3, "UNKNOWN__");
        UNKNOWN__ = horizontalAlignment4;
        HorizontalAlignment[] horizontalAlignmentArr = {horizontalAlignment, horizontalAlignment2, horizontalAlignment3, horizontalAlignment4};
        $VALUES = horizontalAlignmentArr;
        $ENTRIES = a.a(horizontalAlignmentArr);
        Companion = new aqu();
        scc.g("CENTER", "LEFT", "RIGHT");
        type = new p4o("HorizontalAlignment");
    }

    public HorizontalAlignment(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static HorizontalAlignment valueOf(String str) {
        return (HorizontalAlignment) Enum.valueOf(HorizontalAlignment.class, str);
    }

    public static HorizontalAlignment[] values() {
        return (HorizontalAlignment[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
