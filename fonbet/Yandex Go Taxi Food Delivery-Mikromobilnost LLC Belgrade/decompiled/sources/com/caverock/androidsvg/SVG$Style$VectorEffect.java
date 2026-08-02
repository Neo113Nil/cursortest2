package com.caverock.androidsvg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class SVG$Style$VectorEffect {
    private static final /* synthetic */ SVG$Style$VectorEffect[] $VALUES;
    public static final SVG$Style$VectorEffect NonScalingStroke;
    public static final SVG$Style$VectorEffect None;

    static {
        SVG$Style$VectorEffect sVG$Style$VectorEffect = new SVG$Style$VectorEffect("None", 0);
        None = sVG$Style$VectorEffect;
        SVG$Style$VectorEffect sVG$Style$VectorEffect2 = new SVG$Style$VectorEffect("NonScalingStroke", 1);
        NonScalingStroke = sVG$Style$VectorEffect2;
        $VALUES = new SVG$Style$VectorEffect[]{sVG$Style$VectorEffect, sVG$Style$VectorEffect2};
    }

    public static SVG$Style$VectorEffect valueOf(String str) {
        return (SVG$Style$VectorEffect) Enum.valueOf(SVG$Style$VectorEffect.class, str);
    }

    public static SVG$Style$VectorEffect[] values() {
        return (SVG$Style$VectorEffect[]) $VALUES.clone();
    }
}
