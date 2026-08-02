package com.yandex.div.internal.widget.indicator.animations;

import android.animation.ArgbEvaluator;
import android.graphics.RectF;
import android.util.SparseArray;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Shape;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Style;
import kotlin.NoWhenBranchMatchedException;
import xsna.u11;

/* compiled from: ScaleIndicatorAnimator.kt */
/* loaded from: classes7.dex */
public final class ScaleIndicatorAnimator implements IndicatorAnimator {
    private int itemsCount;
    private final IndicatorParams$Style styleParams;
    private final ArgbEvaluator colorEvaluator = new ArgbEvaluator();
    private final SparseArray<Float> itemsScale = new SparseArray<>();

    public ScaleIndicatorAnimator(IndicatorParams$Style indicatorParams$Style) {
        this.styleParams = indicatorParams$Style;
    }

    private final int calculateColor(float f, int i, int i2) {
        return ((Integer) this.colorEvaluator.evaluate(f, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }

    private final float getScaleAt(int i) {
        return this.itemsScale.get(i, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)).floatValue();
    }

    private final float interpolate(float f, float f2, float f3) {
        return u11.b(f2, f, f3, f);
    }

    private final void scaleIndicatorByOffset(int i, float f) {
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.itemsScale.remove(i);
        } else {
            this.itemsScale.put(i, Float.valueOf(Math.abs(f)));
        }
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public int getBorderColorAt(int i) {
        IndicatorParams$Shape activeShape = this.styleParams.getActiveShape();
        if (!(activeShape instanceof IndicatorParams$Shape.RoundedRect)) {
            return 0;
        }
        return calculateColor(getScaleAt(i), ((IndicatorParams$Shape.RoundedRect) this.styleParams.getInactiveShape()).getStrokeColor(), ((IndicatorParams$Shape.RoundedRect) activeShape).getStrokeColor());
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public float getBorderWidthAt(int i) {
        IndicatorParams$Shape activeShape = this.styleParams.getActiveShape();
        if (!(activeShape instanceof IndicatorParams$Shape.RoundedRect)) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        IndicatorParams$Shape.RoundedRect roundedRect = (IndicatorParams$Shape.RoundedRect) this.styleParams.getInactiveShape();
        return ((((IndicatorParams$Shape.RoundedRect) activeShape).getStrokeWidth() - roundedRect.getStrokeWidth()) * getScaleAt(i)) + roundedRect.getStrokeWidth();
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public int getColorAt(int i) {
        return calculateColor(getScaleAt(i), this.styleParams.getInactiveShape().getColor(), this.styleParams.getActiveShape().getColor());
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public IndicatorParams$ItemSize getItemSizeAt(int i) {
        IndicatorParams$Shape activeShape = this.styleParams.getActiveShape();
        if (activeShape instanceof IndicatorParams$Shape.Circle) {
            return new IndicatorParams$ItemSize.Circle(interpolate(((IndicatorParams$Shape.Circle) this.styleParams.getInactiveShape()).getItemSize().getRadius(), ((IndicatorParams$Shape.Circle) activeShape).getItemSize().getRadius(), getScaleAt(i)));
        }
        if (!(activeShape instanceof IndicatorParams$Shape.RoundedRect)) {
            throw new NoWhenBranchMatchedException();
        }
        IndicatorParams$Shape.RoundedRect roundedRect = (IndicatorParams$Shape.RoundedRect) this.styleParams.getInactiveShape();
        IndicatorParams$Shape.RoundedRect roundedRect2 = (IndicatorParams$Shape.RoundedRect) activeShape;
        return new IndicatorParams$ItemSize.RoundedRect(interpolate(roundedRect.getStrokeWidth() + roundedRect.getItemSize().getItemWidth(), roundedRect2.getStrokeWidth() + roundedRect2.getItemSize().getItemWidth(), getScaleAt(i)), interpolate(roundedRect.getStrokeWidth() + roundedRect.getItemSize().getItemHeight(), roundedRect2.getStrokeWidth() + roundedRect2.getItemSize().getItemHeight(), getScaleAt(i)), interpolate(roundedRect.getItemSize().getCornerRadius(), roundedRect2.getItemSize().getCornerRadius(), getScaleAt(i)));
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public RectF getSelectedItemRect(float f, float f2, float f3, boolean z) {
        return null;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void onPageScrolled(int i, float f) {
        scaleIndicatorByOffset(i, 1.0f - f);
        int i2 = this.itemsCount;
        if (i < i2 - 1) {
            scaleIndicatorByOffset(i + 1, f);
        } else if (i2 > 1) {
            scaleIndicatorByOffset(0, f);
        }
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void onPageSelected(int i) {
        this.itemsScale.clear();
        this.itemsScale.put(i, Float.valueOf(1.0f));
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void setItemsCount(int i) {
        this.itemsCount = i;
    }
}
