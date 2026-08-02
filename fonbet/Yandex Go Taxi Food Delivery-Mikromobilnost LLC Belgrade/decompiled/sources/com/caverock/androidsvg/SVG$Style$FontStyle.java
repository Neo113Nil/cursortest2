package com.caverock.androidsvg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class SVG$Style$FontStyle {
    private static final /* synthetic */ SVG$Style$FontStyle[] $VALUES;
    public static final SVG$Style$FontStyle Italic;
    public static final SVG$Style$FontStyle Normal;
    public static final SVG$Style$FontStyle Oblique;

    static {
        SVG$Style$FontStyle sVG$Style$FontStyle = new SVG$Style$FontStyle("Normal", 0);
        Normal = sVG$Style$FontStyle;
        SVG$Style$FontStyle sVG$Style$FontStyle2 = new SVG$Style$FontStyle("Italic", 1);
        Italic = sVG$Style$FontStyle2;
        SVG$Style$FontStyle sVG$Style$FontStyle3 = new SVG$Style$FontStyle("Oblique", 2);
        Oblique = sVG$Style$FontStyle3;
        $VALUES = new SVG$Style$FontStyle[]{sVG$Style$FontStyle, sVG$Style$FontStyle2, sVG$Style$FontStyle3};
    }

    public static SVG$Style$FontStyle valueOf(String str) {
        return (SVG$Style$FontStyle) Enum.valueOf(SVG$Style$FontStyle.class, str);
    }

    public static SVG$Style$FontStyle[] values() {
        return (SVG$Style$FontStyle[]) $VALUES.clone();
    }
}
