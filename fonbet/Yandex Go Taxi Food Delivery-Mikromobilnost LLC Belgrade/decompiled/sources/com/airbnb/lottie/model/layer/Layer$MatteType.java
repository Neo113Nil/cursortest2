package com.airbnb.lottie.model.layer;

import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Layer$MatteType {
    private static final /* synthetic */ Layer$MatteType[] $VALUES;
    public static final Layer$MatteType ADD;
    public static final Layer$MatteType INVERT;
    public static final Layer$MatteType LUMA;
    public static final Layer$MatteType LUMA_INVERTED;
    public static final Layer$MatteType NONE;
    public static final Layer$MatteType UNKNOWN;

    static {
        Layer$MatteType layer$MatteType = new Layer$MatteType(JCP.RAW_PREFIX, 0);
        NONE = layer$MatteType;
        Layer$MatteType layer$MatteType2 = new Layer$MatteType("ADD", 1);
        ADD = layer$MatteType2;
        Layer$MatteType layer$MatteType3 = new Layer$MatteType("INVERT", 2);
        INVERT = layer$MatteType3;
        Layer$MatteType layer$MatteType4 = new Layer$MatteType("LUMA", 3);
        LUMA = layer$MatteType4;
        Layer$MatteType layer$MatteType5 = new Layer$MatteType("LUMA_INVERTED", 4);
        LUMA_INVERTED = layer$MatteType5;
        Layer$MatteType layer$MatteType6 = new Layer$MatteType("UNKNOWN", 5);
        UNKNOWN = layer$MatteType6;
        $VALUES = new Layer$MatteType[]{layer$MatteType, layer$MatteType2, layer$MatteType3, layer$MatteType4, layer$MatteType5, layer$MatteType6};
    }

    public static Layer$MatteType valueOf(String str) {
        return (Layer$MatteType) Enum.valueOf(Layer$MatteType.class, str);
    }

    public static Layer$MatteType[] values() {
        return (Layer$MatteType[]) $VALUES.clone();
    }
}
