package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class ShapeStroke$LineJoinType {
    private static final /* synthetic */ ShapeStroke$LineJoinType[] $VALUES;
    public static final ShapeStroke$LineJoinType BEVEL;
    public static final ShapeStroke$LineJoinType MITER;
    public static final ShapeStroke$LineJoinType ROUND;

    static {
        ShapeStroke$LineJoinType shapeStroke$LineJoinType = new ShapeStroke$LineJoinType("MITER", 0);
        MITER = shapeStroke$LineJoinType;
        ShapeStroke$LineJoinType shapeStroke$LineJoinType2 = new ShapeStroke$LineJoinType("ROUND", 1);
        ROUND = shapeStroke$LineJoinType2;
        ShapeStroke$LineJoinType shapeStroke$LineJoinType3 = new ShapeStroke$LineJoinType("BEVEL", 2);
        BEVEL = shapeStroke$LineJoinType3;
        $VALUES = new ShapeStroke$LineJoinType[]{shapeStroke$LineJoinType, shapeStroke$LineJoinType2, shapeStroke$LineJoinType3};
    }

    public static ShapeStroke$LineJoinType valueOf(String str) {
        return (ShapeStroke$LineJoinType) Enum.valueOf(ShapeStroke$LineJoinType.class, str);
    }

    public static ShapeStroke$LineJoinType[] values() {
        return (ShapeStroke$LineJoinType[]) $VALUES.clone();
    }
}
