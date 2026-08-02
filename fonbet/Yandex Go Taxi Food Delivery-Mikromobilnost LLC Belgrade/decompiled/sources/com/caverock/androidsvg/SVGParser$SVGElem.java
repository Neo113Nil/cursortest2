package com.caverock.androidsvg;

import com.yandex.div.state.db.StateEntry;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
final class SVGParser$SVGElem {
    private static final /* synthetic */ SVGParser$SVGElem[] $VALUES;
    public static final SVGParser$SVGElem SWITCH;
    public static final SVGParser$SVGElem UNSUPPORTED;
    public static final SVGParser$SVGElem a;
    private static final Map<String, SVGParser$SVGElem> cache;
    public static final SVGParser$SVGElem circle;
    public static final SVGParser$SVGElem clipPath;
    public static final SVGParser$SVGElem defs;
    public static final SVGParser$SVGElem desc;
    public static final SVGParser$SVGElem ellipse;
    public static final SVGParser$SVGElem g;
    public static final SVGParser$SVGElem image;
    public static final SVGParser$SVGElem line;
    public static final SVGParser$SVGElem linearGradient;
    public static final SVGParser$SVGElem marker;
    public static final SVGParser$SVGElem mask;
    public static final SVGParser$SVGElem path;
    public static final SVGParser$SVGElem pattern;
    public static final SVGParser$SVGElem polygon;
    public static final SVGParser$SVGElem polyline;
    public static final SVGParser$SVGElem radialGradient;
    public static final SVGParser$SVGElem rect;
    public static final SVGParser$SVGElem solidColor;
    public static final SVGParser$SVGElem stop;
    public static final SVGParser$SVGElem style;
    public static final SVGParser$SVGElem svg;
    public static final SVGParser$SVGElem symbol;
    public static final SVGParser$SVGElem text;
    public static final SVGParser$SVGElem textPath;
    public static final SVGParser$SVGElem title;
    public static final SVGParser$SVGElem tref;
    public static final SVGParser$SVGElem tspan;
    public static final SVGParser$SVGElem use;
    public static final SVGParser$SVGElem view;

    static {
        SVGParser$SVGElem sVGParser$SVGElem = new SVGParser$SVGElem("svg", 0);
        svg = sVGParser$SVGElem;
        SVGParser$SVGElem sVGParser$SVGElem2 = new SVGParser$SVGElem("a", 1);
        a = sVGParser$SVGElem2;
        SVGParser$SVGElem sVGParser$SVGElem3 = new SVGParser$SVGElem("circle", 2);
        circle = sVGParser$SVGElem3;
        SVGParser$SVGElem sVGParser$SVGElem4 = new SVGParser$SVGElem("clipPath", 3);
        clipPath = sVGParser$SVGElem4;
        SVGParser$SVGElem sVGParser$SVGElem5 = new SVGParser$SVGElem("defs", 4);
        defs = sVGParser$SVGElem5;
        SVGParser$SVGElem sVGParser$SVGElem6 = new SVGParser$SVGElem("desc", 5);
        desc = sVGParser$SVGElem6;
        SVGParser$SVGElem sVGParser$SVGElem7 = new SVGParser$SVGElem("ellipse", 6);
        ellipse = sVGParser$SVGElem7;
        SVGParser$SVGElem sVGParser$SVGElem8 = new SVGParser$SVGElem("g", 7);
        g = sVGParser$SVGElem8;
        SVGParser$SVGElem sVGParser$SVGElem9 = new SVGParser$SVGElem("image", 8);
        image = sVGParser$SVGElem9;
        SVGParser$SVGElem sVGParser$SVGElem10 = new SVGParser$SVGElem("line", 9);
        line = sVGParser$SVGElem10;
        SVGParser$SVGElem sVGParser$SVGElem11 = new SVGParser$SVGElem("linearGradient", 10);
        linearGradient = sVGParser$SVGElem11;
        SVGParser$SVGElem sVGParser$SVGElem12 = new SVGParser$SVGElem("marker", 11);
        marker = sVGParser$SVGElem12;
        SVGParser$SVGElem sVGParser$SVGElem13 = new SVGParser$SVGElem("mask", 12);
        mask = sVGParser$SVGElem13;
        SVGParser$SVGElem sVGParser$SVGElem14 = new SVGParser$SVGElem(StateEntry.COLUMN_PATH, 13);
        path = sVGParser$SVGElem14;
        SVGParser$SVGElem sVGParser$SVGElem15 = new SVGParser$SVGElem("pattern", 14);
        pattern = sVGParser$SVGElem15;
        SVGParser$SVGElem sVGParser$SVGElem16 = new SVGParser$SVGElem("polygon", 15);
        polygon = sVGParser$SVGElem16;
        SVGParser$SVGElem sVGParser$SVGElem17 = new SVGParser$SVGElem("polyline", 16);
        polyline = sVGParser$SVGElem17;
        SVGParser$SVGElem sVGParser$SVGElem18 = new SVGParser$SVGElem("radialGradient", 17);
        radialGradient = sVGParser$SVGElem18;
        SVGParser$SVGElem sVGParser$SVGElem19 = new SVGParser$SVGElem("rect", 18);
        rect = sVGParser$SVGElem19;
        SVGParser$SVGElem sVGParser$SVGElem20 = new SVGParser$SVGElem("solidColor", 19);
        solidColor = sVGParser$SVGElem20;
        SVGParser$SVGElem sVGParser$SVGElem21 = new SVGParser$SVGElem("stop", 20);
        stop = sVGParser$SVGElem21;
        SVGParser$SVGElem sVGParser$SVGElem22 = new SVGParser$SVGElem("style", 21);
        style = sVGParser$SVGElem22;
        SVGParser$SVGElem sVGParser$SVGElem23 = new SVGParser$SVGElem("SWITCH", 22);
        SWITCH = sVGParser$SVGElem23;
        SVGParser$SVGElem sVGParser$SVGElem24 = new SVGParser$SVGElem("symbol", 23);
        symbol = sVGParser$SVGElem24;
        SVGParser$SVGElem sVGParser$SVGElem25 = new SVGParser$SVGElem("text", 24);
        text = sVGParser$SVGElem25;
        SVGParser$SVGElem sVGParser$SVGElem26 = new SVGParser$SVGElem("textPath", 25);
        textPath = sVGParser$SVGElem26;
        SVGParser$SVGElem sVGParser$SVGElem27 = new SVGParser$SVGElem("title", 26);
        title = sVGParser$SVGElem27;
        SVGParser$SVGElem sVGParser$SVGElem28 = new SVGParser$SVGElem("tref", 27);
        tref = sVGParser$SVGElem28;
        SVGParser$SVGElem sVGParser$SVGElem29 = new SVGParser$SVGElem("tspan", 28);
        tspan = sVGParser$SVGElem29;
        SVGParser$SVGElem sVGParser$SVGElem30 = new SVGParser$SVGElem("use", 29);
        use = sVGParser$SVGElem30;
        SVGParser$SVGElem sVGParser$SVGElem31 = new SVGParser$SVGElem("view", 30);
        view = sVGParser$SVGElem31;
        SVGParser$SVGElem sVGParser$SVGElem32 = new SVGParser$SVGElem("UNSUPPORTED", 31);
        UNSUPPORTED = sVGParser$SVGElem32;
        $VALUES = new SVGParser$SVGElem[]{sVGParser$SVGElem, sVGParser$SVGElem2, sVGParser$SVGElem3, sVGParser$SVGElem4, sVGParser$SVGElem5, sVGParser$SVGElem6, sVGParser$SVGElem7, sVGParser$SVGElem8, sVGParser$SVGElem9, sVGParser$SVGElem10, sVGParser$SVGElem11, sVGParser$SVGElem12, sVGParser$SVGElem13, sVGParser$SVGElem14, sVGParser$SVGElem15, sVGParser$SVGElem16, sVGParser$SVGElem17, sVGParser$SVGElem18, sVGParser$SVGElem19, sVGParser$SVGElem20, sVGParser$SVGElem21, sVGParser$SVGElem22, sVGParser$SVGElem23, sVGParser$SVGElem24, sVGParser$SVGElem25, sVGParser$SVGElem26, sVGParser$SVGElem27, sVGParser$SVGElem28, sVGParser$SVGElem29, sVGParser$SVGElem30, sVGParser$SVGElem31, sVGParser$SVGElem32};
        cache = new HashMap();
        for (SVGParser$SVGElem sVGParser$SVGElem33 : values()) {
            if (sVGParser$SVGElem33 == SWITCH) {
                cache.put("switch", sVGParser$SVGElem33);
            } else if (sVGParser$SVGElem33 != UNSUPPORTED) {
                cache.put(sVGParser$SVGElem33.name(), sVGParser$SVGElem33);
            }
        }
    }

    public static SVGParser$SVGElem a(String str) {
        SVGParser$SVGElem sVGParser$SVGElem = cache.get(str);
        return sVGParser$SVGElem != null ? sVGParser$SVGElem : UNSUPPORTED;
    }

    public static SVGParser$SVGElem valueOf(String str) {
        return (SVGParser$SVGElem) Enum.valueOf(SVGParser$SVGElem.class, str);
    }

    public static SVGParser$SVGElem[] values() {
        return (SVGParser$SVGElem[]) $VALUES.clone();
    }
}
