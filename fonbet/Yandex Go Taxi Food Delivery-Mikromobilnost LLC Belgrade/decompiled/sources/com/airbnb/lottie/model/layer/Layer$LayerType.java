package com.airbnb.lottie.model.layer;

import com.yandex.go.sql.BaseDatabaseHelper;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Layer$LayerType {
    private static final /* synthetic */ Layer$LayerType[] $VALUES;
    public static final Layer$LayerType IMAGE;
    public static final Layer$LayerType NULL;
    public static final Layer$LayerType PRE_COMP;
    public static final Layer$LayerType SHAPE;
    public static final Layer$LayerType SOLID;
    public static final Layer$LayerType TEXT;
    public static final Layer$LayerType UNKNOWN;

    static {
        Layer$LayerType layer$LayerType = new Layer$LayerType("PRE_COMP", 0);
        PRE_COMP = layer$LayerType;
        Layer$LayerType layer$LayerType2 = new Layer$LayerType("SOLID", 1);
        SOLID = layer$LayerType2;
        Layer$LayerType layer$LayerType3 = new Layer$LayerType("IMAGE", 2);
        IMAGE = layer$LayerType3;
        Layer$LayerType layer$LayerType4 = new Layer$LayerType("NULL", 3);
        NULL = layer$LayerType4;
        Layer$LayerType layer$LayerType5 = new Layer$LayerType("SHAPE", 4);
        SHAPE = layer$LayerType5;
        Layer$LayerType layer$LayerType6 = new Layer$LayerType(BaseDatabaseHelper.TYPE_TEXT, 5);
        TEXT = layer$LayerType6;
        Layer$LayerType layer$LayerType7 = new Layer$LayerType("UNKNOWN", 6);
        UNKNOWN = layer$LayerType7;
        $VALUES = new Layer$LayerType[]{layer$LayerType, layer$LayerType2, layer$LayerType3, layer$LayerType4, layer$LayerType5, layer$LayerType6, layer$LayerType7};
    }

    public static Layer$LayerType valueOf(String str) {
        return (Layer$LayerType) Enum.valueOf(Layer$LayerType.class, str);
    }

    public static Layer$LayerType[] values() {
        return (Layer$LayerType[]) $VALUES.clone();
    }
}
