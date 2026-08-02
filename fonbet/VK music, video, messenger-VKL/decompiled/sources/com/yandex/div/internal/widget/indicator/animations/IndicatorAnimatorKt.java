package com.yandex.div.internal.widget.indicator.animations;

import com.yandex.div.internal.widget.indicator.IndicatorParams$Animation;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Style;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: IndicatorAnimator.kt */
/* loaded from: classes7.dex */
public final class IndicatorAnimatorKt {

    /* compiled from: IndicatorAnimator.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IndicatorParams$Animation.values().length];
            try {
                iArr[IndicatorParams$Animation.SCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndicatorParams$Animation.WORM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IndicatorParams$Animation.SLIDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final IndicatorAnimator getIndicatorAnimator(IndicatorParams$Style indicatorParams$Style) {
        int i = WhenMappings.$EnumSwitchMapping$0[indicatorParams$Style.getAnimation().ordinal()];
        if (i == 1) {
            return new ScaleIndicatorAnimator(indicatorParams$Style);
        }
        if (i == 2) {
            return new WormIndicatorAnimator(indicatorParams$Style);
        }
        if (i == 3) {
            return new SliderIndicatorAnimator(indicatorParams$Style);
        }
        throw new NoWhenBranchMatchedException();
    }
}
