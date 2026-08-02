package com.caverock.androidsvg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
final class SVG$Unit {
    private static final /* synthetic */ SVG$Unit[] $VALUES;
    public static final SVG$Unit cm;
    public static final SVG$Unit em;
    public static final SVG$Unit ex;
    public static final SVG$Unit in;
    public static final SVG$Unit mm;
    public static final SVG$Unit pc;
    public static final SVG$Unit percent;
    public static final SVG$Unit pt;
    public static final SVG$Unit px;

    static {
        SVG$Unit sVG$Unit = new SVG$Unit("px", 0);
        px = sVG$Unit;
        SVG$Unit sVG$Unit2 = new SVG$Unit("em", 1);
        em = sVG$Unit2;
        SVG$Unit sVG$Unit3 = new SVG$Unit("ex", 2);
        ex = sVG$Unit3;
        SVG$Unit sVG$Unit4 = new SVG$Unit("in", 3);
        in = sVG$Unit4;
        SVG$Unit sVG$Unit5 = new SVG$Unit("cm", 4);
        cm = sVG$Unit5;
        SVG$Unit sVG$Unit6 = new SVG$Unit("mm", 5);
        mm = sVG$Unit6;
        SVG$Unit sVG$Unit7 = new SVG$Unit("pt", 6);
        pt = sVG$Unit7;
        SVG$Unit sVG$Unit8 = new SVG$Unit("pc", 7);
        pc = sVG$Unit8;
        SVG$Unit sVG$Unit9 = new SVG$Unit("percent", 8);
        percent = sVG$Unit9;
        $VALUES = new SVG$Unit[]{sVG$Unit, sVG$Unit2, sVG$Unit3, sVG$Unit4, sVG$Unit5, sVG$Unit6, sVG$Unit7, sVG$Unit8, sVG$Unit9};
    }

    public static SVG$Unit valueOf(String str) {
        return (SVG$Unit) Enum.valueOf(SVG$Unit.class, str);
    }

    public static SVG$Unit[] values() {
        return (SVG$Unit[]) $VALUES.clone();
    }
}
