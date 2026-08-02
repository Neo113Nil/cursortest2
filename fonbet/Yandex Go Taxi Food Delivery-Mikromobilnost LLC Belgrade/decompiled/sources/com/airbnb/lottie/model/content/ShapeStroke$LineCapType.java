package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class ShapeStroke$LineCapType {
    private static final /* synthetic */ ShapeStroke$LineCapType[] $VALUES;
    public static final ShapeStroke$LineCapType BUTT;
    public static final ShapeStroke$LineCapType ROUND;
    public static final ShapeStroke$LineCapType UNKNOWN;

    static {
        ShapeStroke$LineCapType shapeStroke$LineCapType = new ShapeStroke$LineCapType("BUTT", 0);
        BUTT = shapeStroke$LineCapType;
        ShapeStroke$LineCapType shapeStroke$LineCapType2 = new ShapeStroke$LineCapType("ROUND", 1);
        ROUND = shapeStroke$LineCapType2;
        ShapeStroke$LineCapType shapeStroke$LineCapType3 = new ShapeStroke$LineCapType("UNKNOWN", 2);
        UNKNOWN = shapeStroke$LineCapType3;
        $VALUES = new ShapeStroke$LineCapType[]{shapeStroke$LineCapType, shapeStroke$LineCapType2, shapeStroke$LineCapType3};
    }

    public static ShapeStroke$LineCapType valueOf(String str) {
        return (ShapeStroke$LineCapType) Enum.valueOf(ShapeStroke$LineCapType.class, str);
    }

    public static ShapeStroke$LineCapType[] values() {
        return (ShapeStroke$LineCapType[]) $VALUES.clone();
    }
}
