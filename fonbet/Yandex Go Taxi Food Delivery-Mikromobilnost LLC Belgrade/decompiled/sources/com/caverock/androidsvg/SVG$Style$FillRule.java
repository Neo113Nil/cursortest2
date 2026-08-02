package com.caverock.androidsvg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class SVG$Style$FillRule {
    private static final /* synthetic */ SVG$Style$FillRule[] $VALUES;
    public static final SVG$Style$FillRule EvenOdd;
    public static final SVG$Style$FillRule NonZero;

    static {
        SVG$Style$FillRule sVG$Style$FillRule = new SVG$Style$FillRule("NonZero", 0);
        NonZero = sVG$Style$FillRule;
        SVG$Style$FillRule sVG$Style$FillRule2 = new SVG$Style$FillRule("EvenOdd", 1);
        EvenOdd = sVG$Style$FillRule2;
        $VALUES = new SVG$Style$FillRule[]{sVG$Style$FillRule, sVG$Style$FillRule2};
    }

    public static SVG$Style$FillRule valueOf(String str) {
        return (SVG$Style$FillRule) Enum.valueOf(SVG$Style$FillRule.class, str);
    }

    public static SVG$Style$FillRule[] values() {
        return (SVG$Style$FillRule[]) $VALUES.clone();
    }
}
