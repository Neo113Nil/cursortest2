package com.caverock.androidsvg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
final class SVG$GradientSpread {
    private static final /* synthetic */ SVG$GradientSpread[] $VALUES;
    public static final SVG$GradientSpread pad;
    public static final SVG$GradientSpread reflect;
    public static final SVG$GradientSpread repeat;

    static {
        SVG$GradientSpread sVG$GradientSpread = new SVG$GradientSpread("pad", 0);
        pad = sVG$GradientSpread;
        SVG$GradientSpread sVG$GradientSpread2 = new SVG$GradientSpread("reflect", 1);
        reflect = sVG$GradientSpread2;
        SVG$GradientSpread sVG$GradientSpread3 = new SVG$GradientSpread("repeat", 2);
        repeat = sVG$GradientSpread3;
        $VALUES = new SVG$GradientSpread[]{sVG$GradientSpread, sVG$GradientSpread2, sVG$GradientSpread3};
    }

    public static SVG$GradientSpread valueOf(String str) {
        return (SVG$GradientSpread) Enum.valueOf(SVG$GradientSpread.class, str);
    }

    public static SVG$GradientSpread[] values() {
        return (SVG$GradientSpread[]) $VALUES.clone();
    }
}
