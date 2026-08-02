package com.caverock.androidsvg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class SVG$Style$TextDirection {
    private static final /* synthetic */ SVG$Style$TextDirection[] $VALUES;
    public static final SVG$Style$TextDirection LTR;
    public static final SVG$Style$TextDirection RTL;

    static {
        SVG$Style$TextDirection sVG$Style$TextDirection = new SVG$Style$TextDirection("LTR", 0);
        LTR = sVG$Style$TextDirection;
        SVG$Style$TextDirection sVG$Style$TextDirection2 = new SVG$Style$TextDirection("RTL", 1);
        RTL = sVG$Style$TextDirection2;
        $VALUES = new SVG$Style$TextDirection[]{sVG$Style$TextDirection, sVG$Style$TextDirection2};
    }

    public static SVG$Style$TextDirection valueOf(String str) {
        return (SVG$Style$TextDirection) Enum.valueOf(SVG$Style$TextDirection.class, str);
    }

    public static SVG$Style$TextDirection[] values() {
        return (SVG$Style$TextDirection[]) $VALUES.clone();
    }
}
