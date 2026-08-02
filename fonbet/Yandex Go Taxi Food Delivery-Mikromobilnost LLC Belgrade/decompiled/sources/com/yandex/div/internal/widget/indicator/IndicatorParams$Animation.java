package com.yandex.div.internal.widget.indicator;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/div/internal/widget/indicator/IndicatorParams$Animation", "", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Animation;", "SCALE", "WORM", "SLIDER", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IndicatorParams$Animation {
    private static final /* synthetic */ IndicatorParams$Animation[] $VALUES;
    public static final IndicatorParams$Animation SCALE;
    public static final IndicatorParams$Animation SLIDER;
    public static final IndicatorParams$Animation WORM;

    static {
        IndicatorParams$Animation indicatorParams$Animation = new IndicatorParams$Animation("SCALE", 0);
        SCALE = indicatorParams$Animation;
        IndicatorParams$Animation indicatorParams$Animation2 = new IndicatorParams$Animation("WORM", 1);
        WORM = indicatorParams$Animation2;
        IndicatorParams$Animation indicatorParams$Animation3 = new IndicatorParams$Animation("SLIDER", 2);
        SLIDER = indicatorParams$Animation3;
        $VALUES = new IndicatorParams$Animation[]{indicatorParams$Animation, indicatorParams$Animation2, indicatorParams$Animation3};
    }

    public static IndicatorParams$Animation valueOf(String str) {
        return (IndicatorParams$Animation) Enum.valueOf(IndicatorParams$Animation.class, str);
    }

    public static IndicatorParams$Animation[] values() {
        return (IndicatorParams$Animation[]) $VALUES.clone();
    }
}
