package com.caverock.androidsvg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class SVG$Style$TextAnchor {
    private static final /* synthetic */ SVG$Style$TextAnchor[] $VALUES;
    public static final SVG$Style$TextAnchor End;
    public static final SVG$Style$TextAnchor Middle;
    public static final SVG$Style$TextAnchor Start;

    static {
        SVG$Style$TextAnchor sVG$Style$TextAnchor = new SVG$Style$TextAnchor("Start", 0);
        Start = sVG$Style$TextAnchor;
        SVG$Style$TextAnchor sVG$Style$TextAnchor2 = new SVG$Style$TextAnchor("Middle", 1);
        Middle = sVG$Style$TextAnchor2;
        SVG$Style$TextAnchor sVG$Style$TextAnchor3 = new SVG$Style$TextAnchor("End", 2);
        End = sVG$Style$TextAnchor3;
        $VALUES = new SVG$Style$TextAnchor[]{sVG$Style$TextAnchor, sVG$Style$TextAnchor2, sVG$Style$TextAnchor3};
    }

    public static SVG$Style$TextAnchor valueOf(String str) {
        return (SVG$Style$TextAnchor) Enum.valueOf(SVG$Style$TextAnchor.class, str);
    }

    public static SVG$Style$TextAnchor[] values() {
        return (SVG$Style$TextAnchor[]) $VALUES.clone();
    }
}
