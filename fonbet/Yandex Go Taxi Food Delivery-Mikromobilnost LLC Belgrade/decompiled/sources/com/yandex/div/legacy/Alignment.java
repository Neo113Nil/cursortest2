package com.yandex.div.legacy;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class Alignment {
    private static final /* synthetic */ Alignment[] $VALUES;
    public static final Alignment CENTER;
    public static final Alignment LEFT;
    public static final Alignment RIGHT;

    static {
        Alignment alignment = new Alignment("LEFT", 0);
        LEFT = alignment;
        Alignment alignment2 = new Alignment("CENTER", 1);
        CENTER = alignment2;
        Alignment alignment3 = new Alignment("RIGHT", 2);
        RIGHT = alignment3;
        $VALUES = new Alignment[]{alignment, alignment2, alignment3};
    }

    public static Alignment valueOf(String str) {
        return (Alignment) Enum.valueOf(Alignment.class, str);
    }

    public static Alignment[] values() {
        return (Alignment[]) $VALUES.clone();
    }
}
