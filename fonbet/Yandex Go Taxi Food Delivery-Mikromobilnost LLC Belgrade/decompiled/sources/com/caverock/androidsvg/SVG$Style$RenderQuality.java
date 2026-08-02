package com.caverock.androidsvg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class SVG$Style$RenderQuality {
    private static final /* synthetic */ SVG$Style$RenderQuality[] $VALUES;
    public static final SVG$Style$RenderQuality auto;
    public static final SVG$Style$RenderQuality optimizeQuality;
    public static final SVG$Style$RenderQuality optimizeSpeed;

    static {
        SVG$Style$RenderQuality sVG$Style$RenderQuality = new SVG$Style$RenderQuality("auto", 0);
        auto = sVG$Style$RenderQuality;
        SVG$Style$RenderQuality sVG$Style$RenderQuality2 = new SVG$Style$RenderQuality("optimizeQuality", 1);
        optimizeQuality = sVG$Style$RenderQuality2;
        SVG$Style$RenderQuality sVG$Style$RenderQuality3 = new SVG$Style$RenderQuality("optimizeSpeed", 2);
        optimizeSpeed = sVG$Style$RenderQuality3;
        $VALUES = new SVG$Style$RenderQuality[]{sVG$Style$RenderQuality, sVG$Style$RenderQuality2, sVG$Style$RenderQuality3};
    }

    public static SVG$Style$RenderQuality valueOf(String str) {
        return (SVG$Style$RenderQuality) Enum.valueOf(SVG$Style$RenderQuality.class, str);
    }

    public static SVG$Style$RenderQuality[] values() {
        return (SVG$Style$RenderQuality[]) $VALUES.clone();
    }
}
