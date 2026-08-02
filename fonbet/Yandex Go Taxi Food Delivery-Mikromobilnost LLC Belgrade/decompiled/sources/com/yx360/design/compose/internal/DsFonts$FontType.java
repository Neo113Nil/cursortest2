package com.yx360.design.compose.internal;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/yx360/design/compose/internal/DsFonts$FontType", "", "Lcom/yx360/design/compose/internal/DsFonts$FontType;", "Display", "Regular", "Medium", "Monospace", "Bold", "Yango", "yx360-design-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DsFonts$FontType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DsFonts$FontType[] $VALUES;
    public static final DsFonts$FontType Bold;
    public static final DsFonts$FontType Display;
    public static final DsFonts$FontType Medium;
    public static final DsFonts$FontType Monospace;
    public static final DsFonts$FontType Regular;
    public static final DsFonts$FontType Yango;

    static {
        DsFonts$FontType dsFonts$FontType = new DsFonts$FontType("Display", 0);
        Display = dsFonts$FontType;
        DsFonts$FontType dsFonts$FontType2 = new DsFonts$FontType("Regular", 1);
        Regular = dsFonts$FontType2;
        DsFonts$FontType dsFonts$FontType3 = new DsFonts$FontType("Medium", 2);
        Medium = dsFonts$FontType3;
        DsFonts$FontType dsFonts$FontType4 = new DsFonts$FontType("Monospace", 3);
        Monospace = dsFonts$FontType4;
        DsFonts$FontType dsFonts$FontType5 = new DsFonts$FontType("Bold", 4);
        Bold = dsFonts$FontType5;
        DsFonts$FontType dsFonts$FontType6 = new DsFonts$FontType("Yango", 5);
        Yango = dsFonts$FontType6;
        DsFonts$FontType[] dsFonts$FontTypeArr = {dsFonts$FontType, dsFonts$FontType2, dsFonts$FontType3, dsFonts$FontType4, dsFonts$FontType5, dsFonts$FontType6};
        $VALUES = dsFonts$FontTypeArr;
        $ENTRIES = kotlin.enums.a.a(dsFonts$FontTypeArr);
    }

    public static DsFonts$FontType valueOf(String str) {
        return (DsFonts$FontType) Enum.valueOf(DsFonts$FontType.class, str);
    }

    public static DsFonts$FontType[] values() {
        return (DsFonts$FontType[]) $VALUES.clone();
    }
}
