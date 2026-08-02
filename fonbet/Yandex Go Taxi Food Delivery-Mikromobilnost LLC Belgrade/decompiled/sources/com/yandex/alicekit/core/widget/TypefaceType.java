package com.yandex.alicekit.core.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class TypefaceType {
    private static final /* synthetic */ TypefaceType[] $VALUES;
    public static final TypefaceType BOLD;
    public static final TypefaceType LIGHT;
    public static final TypefaceType MEDIUM;
    public static final TypefaceType REGULAR;

    static {
        TypefaceType typefaceType = new TypefaceType("REGULAR", 0);
        REGULAR = typefaceType;
        TypefaceType typefaceType2 = new TypefaceType("MEDIUM", 1);
        MEDIUM = typefaceType2;
        TypefaceType typefaceType3 = new TypefaceType("BOLD", 2);
        BOLD = typefaceType3;
        TypefaceType typefaceType4 = new TypefaceType("LIGHT", 3);
        LIGHT = typefaceType4;
        $VALUES = new TypefaceType[]{typefaceType, typefaceType2, typefaceType3, typefaceType4};
    }

    public static TypefaceType valueOf(String str) {
        return (TypefaceType) Enum.valueOf(TypefaceType.class, str);
    }

    public static TypefaceType[] values() {
        return (TypefaceType[]) $VALUES.clone();
    }
}
