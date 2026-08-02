package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class LBlendMode {
    private static final /* synthetic */ LBlendMode[] $VALUES;
    public static final LBlendMode ADD;
    public static final LBlendMode COLOR;
    public static final LBlendMode COLOR_BURN;
    public static final LBlendMode COLOR_DODGE;
    public static final LBlendMode DARKEN;
    public static final LBlendMode DIFFERENCE;
    public static final LBlendMode EXCLUSION;
    public static final LBlendMode HARD_LIGHT;
    public static final LBlendMode HARD_MIX;
    public static final LBlendMode HUE;
    public static final LBlendMode LIGHTEN;
    public static final LBlendMode LUMINOSITY;
    public static final LBlendMode MULTIPLY;
    public static final LBlendMode NORMAL;
    public static final LBlendMode OVERLAY;
    public static final LBlendMode SATURATION;
    public static final LBlendMode SCREEN;
    public static final LBlendMode SOFT_LIGHT;

    static {
        LBlendMode lBlendMode = new LBlendMode("NORMAL", 0);
        NORMAL = lBlendMode;
        LBlendMode lBlendMode2 = new LBlendMode("MULTIPLY", 1);
        MULTIPLY = lBlendMode2;
        LBlendMode lBlendMode3 = new LBlendMode("SCREEN", 2);
        SCREEN = lBlendMode3;
        LBlendMode lBlendMode4 = new LBlendMode("OVERLAY", 3);
        OVERLAY = lBlendMode4;
        LBlendMode lBlendMode5 = new LBlendMode("DARKEN", 4);
        DARKEN = lBlendMode5;
        LBlendMode lBlendMode6 = new LBlendMode("LIGHTEN", 5);
        LIGHTEN = lBlendMode6;
        LBlendMode lBlendMode7 = new LBlendMode("COLOR_DODGE", 6);
        COLOR_DODGE = lBlendMode7;
        LBlendMode lBlendMode8 = new LBlendMode("COLOR_BURN", 7);
        COLOR_BURN = lBlendMode8;
        LBlendMode lBlendMode9 = new LBlendMode("HARD_LIGHT", 8);
        HARD_LIGHT = lBlendMode9;
        LBlendMode lBlendMode10 = new LBlendMode("SOFT_LIGHT", 9);
        SOFT_LIGHT = lBlendMode10;
        LBlendMode lBlendMode11 = new LBlendMode("DIFFERENCE", 10);
        DIFFERENCE = lBlendMode11;
        LBlendMode lBlendMode12 = new LBlendMode("EXCLUSION", 11);
        EXCLUSION = lBlendMode12;
        LBlendMode lBlendMode13 = new LBlendMode("HUE", 12);
        HUE = lBlendMode13;
        LBlendMode lBlendMode14 = new LBlendMode("SATURATION", 13);
        SATURATION = lBlendMode14;
        LBlendMode lBlendMode15 = new LBlendMode("COLOR", 14);
        COLOR = lBlendMode15;
        LBlendMode lBlendMode16 = new LBlendMode("LUMINOSITY", 15);
        LUMINOSITY = lBlendMode16;
        LBlendMode lBlendMode17 = new LBlendMode("ADD", 16);
        ADD = lBlendMode17;
        LBlendMode lBlendMode18 = new LBlendMode("HARD_MIX", 17);
        HARD_MIX = lBlendMode18;
        $VALUES = new LBlendMode[]{lBlendMode, lBlendMode2, lBlendMode3, lBlendMode4, lBlendMode5, lBlendMode6, lBlendMode7, lBlendMode8, lBlendMode9, lBlendMode10, lBlendMode11, lBlendMode12, lBlendMode13, lBlendMode14, lBlendMode15, lBlendMode16, lBlendMode17, lBlendMode18};
    }

    public static LBlendMode valueOf(String str) {
        return (LBlendMode) Enum.valueOf(LBlendMode.class, str);
    }

    public static LBlendMode[] values() {
        return (LBlendMode[]) $VALUES.clone();
    }
}
