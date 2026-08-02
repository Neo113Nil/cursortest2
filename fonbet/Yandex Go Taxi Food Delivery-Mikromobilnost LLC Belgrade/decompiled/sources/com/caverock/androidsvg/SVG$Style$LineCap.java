package com.caverock.androidsvg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class SVG$Style$LineCap {
    private static final /* synthetic */ SVG$Style$LineCap[] $VALUES;
    public static final SVG$Style$LineCap Butt;
    public static final SVG$Style$LineCap Round;
    public static final SVG$Style$LineCap Square;

    static {
        SVG$Style$LineCap sVG$Style$LineCap = new SVG$Style$LineCap("Butt", 0);
        Butt = sVG$Style$LineCap;
        SVG$Style$LineCap sVG$Style$LineCap2 = new SVG$Style$LineCap("Round", 1);
        Round = sVG$Style$LineCap2;
        SVG$Style$LineCap sVG$Style$LineCap3 = new SVG$Style$LineCap("Square", 2);
        Square = sVG$Style$LineCap3;
        $VALUES = new SVG$Style$LineCap[]{sVG$Style$LineCap, sVG$Style$LineCap2, sVG$Style$LineCap3};
    }

    public static SVG$Style$LineCap valueOf(String str) {
        return (SVG$Style$LineCap) Enum.valueOf(SVG$Style$LineCap.class, str);
    }

    public static SVG$Style$LineCap[] values() {
        return (SVG$Style$LineCap[]) $VALUES.clone();
    }
}
