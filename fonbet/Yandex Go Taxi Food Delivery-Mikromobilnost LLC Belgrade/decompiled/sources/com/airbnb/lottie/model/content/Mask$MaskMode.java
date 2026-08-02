package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Mask$MaskMode {
    private static final /* synthetic */ Mask$MaskMode[] $VALUES;
    public static final Mask$MaskMode MASK_MODE_ADD;
    public static final Mask$MaskMode MASK_MODE_INTERSECT;
    public static final Mask$MaskMode MASK_MODE_NONE;
    public static final Mask$MaskMode MASK_MODE_SUBTRACT;

    static {
        Mask$MaskMode mask$MaskMode = new Mask$MaskMode("MASK_MODE_ADD", 0);
        MASK_MODE_ADD = mask$MaskMode;
        Mask$MaskMode mask$MaskMode2 = new Mask$MaskMode("MASK_MODE_SUBTRACT", 1);
        MASK_MODE_SUBTRACT = mask$MaskMode2;
        Mask$MaskMode mask$MaskMode3 = new Mask$MaskMode("MASK_MODE_INTERSECT", 2);
        MASK_MODE_INTERSECT = mask$MaskMode3;
        Mask$MaskMode mask$MaskMode4 = new Mask$MaskMode("MASK_MODE_NONE", 3);
        MASK_MODE_NONE = mask$MaskMode4;
        $VALUES = new Mask$MaskMode[]{mask$MaskMode, mask$MaskMode2, mask$MaskMode3, mask$MaskMode4};
    }

    public static Mask$MaskMode valueOf(String str) {
        return (Mask$MaskMode) Enum.valueOf(Mask$MaskMode.class, str);
    }

    public static Mask$MaskMode[] values() {
        return (Mask$MaskMode[]) $VALUES.clone();
    }
}
