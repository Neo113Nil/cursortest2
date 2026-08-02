package com.yandex.plus.plaquesdk.plaque.api.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/plus/plaquesdk/plaque/api/models/FormattedText$FontWeight", "", "Lcom/yandex/plus/plaquesdk/plaque/api/models/FormattedText$FontWeight;", "THIN", "EXTRA_LIGHT", "LIGHT", "REGULAR", "MEDIUM", "SEMI_BOLD", "BOLD", "EXTRA_BOLD", "HEAVY", "plus-home-plaque-core-plaqueview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FormattedText$FontWeight {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FormattedText$FontWeight[] $VALUES;
    public static final FormattedText$FontWeight BOLD;
    public static final FormattedText$FontWeight EXTRA_BOLD;
    public static final FormattedText$FontWeight EXTRA_LIGHT;
    public static final FormattedText$FontWeight HEAVY;
    public static final FormattedText$FontWeight LIGHT;
    public static final FormattedText$FontWeight MEDIUM;
    public static final FormattedText$FontWeight REGULAR;
    public static final FormattedText$FontWeight SEMI_BOLD;
    public static final FormattedText$FontWeight THIN;

    static {
        FormattedText$FontWeight formattedText$FontWeight = new FormattedText$FontWeight("THIN", 0);
        THIN = formattedText$FontWeight;
        FormattedText$FontWeight formattedText$FontWeight2 = new FormattedText$FontWeight("EXTRA_LIGHT", 1);
        EXTRA_LIGHT = formattedText$FontWeight2;
        FormattedText$FontWeight formattedText$FontWeight3 = new FormattedText$FontWeight("LIGHT", 2);
        LIGHT = formattedText$FontWeight3;
        FormattedText$FontWeight formattedText$FontWeight4 = new FormattedText$FontWeight("REGULAR", 3);
        REGULAR = formattedText$FontWeight4;
        FormattedText$FontWeight formattedText$FontWeight5 = new FormattedText$FontWeight("MEDIUM", 4);
        MEDIUM = formattedText$FontWeight5;
        FormattedText$FontWeight formattedText$FontWeight6 = new FormattedText$FontWeight("SEMI_BOLD", 5);
        SEMI_BOLD = formattedText$FontWeight6;
        FormattedText$FontWeight formattedText$FontWeight7 = new FormattedText$FontWeight("BOLD", 6);
        BOLD = formattedText$FontWeight7;
        FormattedText$FontWeight formattedText$FontWeight8 = new FormattedText$FontWeight("EXTRA_BOLD", 7);
        EXTRA_BOLD = formattedText$FontWeight8;
        FormattedText$FontWeight formattedText$FontWeight9 = new FormattedText$FontWeight("HEAVY", 8);
        HEAVY = formattedText$FontWeight9;
        FormattedText$FontWeight[] formattedText$FontWeightArr = {formattedText$FontWeight, formattedText$FontWeight2, formattedText$FontWeight3, formattedText$FontWeight4, formattedText$FontWeight5, formattedText$FontWeight6, formattedText$FontWeight7, formattedText$FontWeight8, formattedText$FontWeight9};
        $VALUES = formattedText$FontWeightArr;
        $ENTRIES = a.a(formattedText$FontWeightArr);
    }

    public static FormattedText$FontWeight valueOf(String str) {
        return (FormattedText$FontWeight) Enum.valueOf(FormattedText$FontWeight.class, str);
    }

    public static FormattedText$FontWeight[] values() {
        return (FormattedText$FontWeight[]) $VALUES.clone();
    }
}
