package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class ShapeTrimPath$Type {
    private static final /* synthetic */ ShapeTrimPath$Type[] $VALUES;
    public static final ShapeTrimPath$Type INDIVIDUALLY;
    public static final ShapeTrimPath$Type SIMULTANEOUSLY;

    static {
        ShapeTrimPath$Type shapeTrimPath$Type = new ShapeTrimPath$Type("SIMULTANEOUSLY", 0);
        SIMULTANEOUSLY = shapeTrimPath$Type;
        ShapeTrimPath$Type shapeTrimPath$Type2 = new ShapeTrimPath$Type("INDIVIDUALLY", 1);
        INDIVIDUALLY = shapeTrimPath$Type2;
        $VALUES = new ShapeTrimPath$Type[]{shapeTrimPath$Type, shapeTrimPath$Type2};
    }

    public static ShapeTrimPath$Type valueOf(String str) {
        return (ShapeTrimPath$Type) Enum.valueOf(ShapeTrimPath$Type.class, str);
    }

    public static ShapeTrimPath$Type[] values() {
        return (ShapeTrimPath$Type[]) $VALUES.clone();
    }
}
