package com.yandex.plus.home.plaque.plugin.api.typeface;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/home/plaque/plugin/api/typeface/PlusPlaqueFontWeight;", "", "REGULAR", "LIGHT", "MEDIUM", "BOLD", "HEAVY", "plus-home-plaque-plugin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPlaqueFontWeight {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusPlaqueFontWeight[] $VALUES;
    public static final PlusPlaqueFontWeight BOLD;
    public static final PlusPlaqueFontWeight HEAVY;
    public static final PlusPlaqueFontWeight LIGHT;
    public static final PlusPlaqueFontWeight MEDIUM;
    public static final PlusPlaqueFontWeight REGULAR;

    static {
        PlusPlaqueFontWeight plusPlaqueFontWeight = new PlusPlaqueFontWeight("REGULAR", 0);
        REGULAR = plusPlaqueFontWeight;
        PlusPlaqueFontWeight plusPlaqueFontWeight2 = new PlusPlaqueFontWeight("LIGHT", 1);
        LIGHT = plusPlaqueFontWeight2;
        PlusPlaqueFontWeight plusPlaqueFontWeight3 = new PlusPlaqueFontWeight("MEDIUM", 2);
        MEDIUM = plusPlaqueFontWeight3;
        PlusPlaqueFontWeight plusPlaqueFontWeight4 = new PlusPlaqueFontWeight("BOLD", 3);
        BOLD = plusPlaqueFontWeight4;
        PlusPlaqueFontWeight plusPlaqueFontWeight5 = new PlusPlaqueFontWeight("HEAVY", 4);
        HEAVY = plusPlaqueFontWeight5;
        PlusPlaqueFontWeight[] plusPlaqueFontWeightArr = {plusPlaqueFontWeight, plusPlaqueFontWeight2, plusPlaqueFontWeight3, plusPlaqueFontWeight4, plusPlaqueFontWeight5};
        $VALUES = plusPlaqueFontWeightArr;
        $ENTRIES = a.a(plusPlaqueFontWeightArr);
    }

    public static PlusPlaqueFontWeight valueOf(String str) {
        return (PlusPlaqueFontWeight) Enum.valueOf(PlusPlaqueFontWeight.class, str);
    }

    public static PlusPlaqueFontWeight[] values() {
        return (PlusPlaqueFontWeight[]) $VALUES.clone();
    }
}
