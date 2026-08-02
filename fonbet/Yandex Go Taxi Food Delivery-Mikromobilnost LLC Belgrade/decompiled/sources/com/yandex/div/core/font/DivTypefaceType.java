package com.yandex.div.core.font;

import android.graphics.Typeface;
import defpackage.lml;
import defpackage.pml;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class DivTypefaceType {
    private static final /* synthetic */ DivTypefaceType[] $VALUES;
    public static final DivTypefaceType BOLD;
    public static final DivTypefaceType LIGHT;
    public static final DivTypefaceType MEDIUM;
    public static final DivTypefaceType REGULAR;

    static {
        DivTypefaceType divTypefaceType = new DivTypefaceType("REGULAR", 0);
        REGULAR = divTypefaceType;
        DivTypefaceType divTypefaceType2 = new DivTypefaceType("MEDIUM", 1);
        MEDIUM = divTypefaceType2;
        DivTypefaceType divTypefaceType3 = new DivTypefaceType("BOLD", 2);
        BOLD = divTypefaceType3;
        DivTypefaceType divTypefaceType4 = new DivTypefaceType("LIGHT", 3);
        LIGHT = divTypefaceType4;
        $VALUES = new DivTypefaceType[]{divTypefaceType, divTypefaceType2, divTypefaceType3, divTypefaceType4};
    }

    public static DivTypefaceType valueOf(String str) {
        return (DivTypefaceType) Enum.valueOf(DivTypefaceType.class, str);
    }

    public static DivTypefaceType[] values() {
        return (DivTypefaceType[]) $VALUES.clone();
    }

    public final Typeface a(lml lmlVar) {
        int i = pml.a[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? lmlVar.a() : lmlVar.getLight() : lmlVar.b() : lmlVar.c();
    }
}
