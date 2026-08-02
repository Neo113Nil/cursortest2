package com.yandex.go.design.compose.plus.text;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/design/compose/plus/text/PlusNewType;", "", "Gradient", "GradientSign", "Color", "Disabled", "plus"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PlusNewType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusNewType[] $VALUES;
    public static final PlusNewType Color;
    public static final PlusNewType Disabled;
    public static final PlusNewType Gradient;
    public static final PlusNewType GradientSign;

    static {
        PlusNewType plusNewType = new PlusNewType("Gradient", 0);
        Gradient = plusNewType;
        PlusNewType plusNewType2 = new PlusNewType("GradientSign", 1);
        GradientSign = plusNewType2;
        PlusNewType plusNewType3 = new PlusNewType("Color", 2);
        Color = plusNewType3;
        PlusNewType plusNewType4 = new PlusNewType("Disabled", 3);
        Disabled = plusNewType4;
        PlusNewType[] plusNewTypeArr = {plusNewType, plusNewType2, plusNewType3, plusNewType4};
        $VALUES = plusNewTypeArr;
        $ENTRIES = a.a(plusNewTypeArr);
    }

    public static PlusNewType valueOf(String str) {
        return (PlusNewType) Enum.valueOf(PlusNewType.class, str);
    }

    public static PlusNewType[] values() {
        return (PlusNewType[]) $VALUES.clone();
    }
}
