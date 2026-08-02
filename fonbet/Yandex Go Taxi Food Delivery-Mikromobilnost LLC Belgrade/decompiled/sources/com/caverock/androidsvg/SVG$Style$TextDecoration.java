package com.caverock.androidsvg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class SVG$Style$TextDecoration {
    private static final /* synthetic */ SVG$Style$TextDecoration[] $VALUES;
    public static final SVG$Style$TextDecoration Blink;
    public static final SVG$Style$TextDecoration LineThrough;
    public static final SVG$Style$TextDecoration None;
    public static final SVG$Style$TextDecoration Overline;
    public static final SVG$Style$TextDecoration Underline;

    static {
        SVG$Style$TextDecoration sVG$Style$TextDecoration = new SVG$Style$TextDecoration("None", 0);
        None = sVG$Style$TextDecoration;
        SVG$Style$TextDecoration sVG$Style$TextDecoration2 = new SVG$Style$TextDecoration("Underline", 1);
        Underline = sVG$Style$TextDecoration2;
        SVG$Style$TextDecoration sVG$Style$TextDecoration3 = new SVG$Style$TextDecoration("Overline", 2);
        Overline = sVG$Style$TextDecoration3;
        SVG$Style$TextDecoration sVG$Style$TextDecoration4 = new SVG$Style$TextDecoration("LineThrough", 3);
        LineThrough = sVG$Style$TextDecoration4;
        SVG$Style$TextDecoration sVG$Style$TextDecoration5 = new SVG$Style$TextDecoration("Blink", 4);
        Blink = sVG$Style$TextDecoration5;
        $VALUES = new SVG$Style$TextDecoration[]{sVG$Style$TextDecoration, sVG$Style$TextDecoration2, sVG$Style$TextDecoration3, sVG$Style$TextDecoration4, sVG$Style$TextDecoration5};
    }

    public static SVG$Style$TextDecoration valueOf(String str) {
        return (SVG$Style$TextDecoration) Enum.valueOf(SVG$Style$TextDecoration.class, str);
    }

    public static SVG$Style$TextDecoration[] values() {
        return (SVG$Style$TextDecoration[]) $VALUES.clone();
    }
}
