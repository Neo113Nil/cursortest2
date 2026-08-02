package com.caverock.androidsvg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class SVG$Style$LineJoin {
    private static final /* synthetic */ SVG$Style$LineJoin[] $VALUES;
    public static final SVG$Style$LineJoin Bevel;
    public static final SVG$Style$LineJoin Miter;
    public static final SVG$Style$LineJoin Round;

    static {
        SVG$Style$LineJoin sVG$Style$LineJoin = new SVG$Style$LineJoin("Miter", 0);
        Miter = sVG$Style$LineJoin;
        SVG$Style$LineJoin sVG$Style$LineJoin2 = new SVG$Style$LineJoin("Round", 1);
        Round = sVG$Style$LineJoin2;
        SVG$Style$LineJoin sVG$Style$LineJoin3 = new SVG$Style$LineJoin("Bevel", 2);
        Bevel = sVG$Style$LineJoin3;
        $VALUES = new SVG$Style$LineJoin[]{sVG$Style$LineJoin, sVG$Style$LineJoin2, sVG$Style$LineJoin3};
    }

    public static SVG$Style$LineJoin valueOf(String str) {
        return (SVG$Style$LineJoin) Enum.valueOf(SVG$Style$LineJoin.class, str);
    }

    public static SVG$Style$LineJoin[] values() {
        return (SVG$Style$LineJoin[]) $VALUES.clone();
    }
}
