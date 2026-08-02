package com.yandex.div.internal.widget.indicator.animations;

import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Shape;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Style;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SliderIndicatorAnimator.kt */
/* loaded from: classes7.dex */
public final class SliderIndicatorAnimator implements IndicatorAnimator {
    private final IndicatorParams$ItemSize inactiveItemSizeWithBorders;
    private final RectF itemRect = new RectF();
    private float itemWidthOverride;
    private float selectedPositionOffset;
    private float spaceBetweenCenters;
    private final IndicatorParams$Style styleParams;

    public SliderIndicatorAnimator(IndicatorParams$Style indicatorParams$Style) {
        IndicatorParams$ItemSize copy$default;
        this.styleParams = indicatorParams$Style;
        IndicatorParams$Shape inactiveShape = indicatorParams$Style.getInactiveShape();
        if (inactiveShape instanceof IndicatorParams$Shape.Circle) {
            copy$default = ((IndicatorParams$Shape.Circle) inactiveShape).getItemSize();
        } else {
            if (!(inactiveShape instanceof IndicatorParams$Shape.RoundedRect)) {
                throw new NoWhenBranchMatchedException();
            }
            IndicatorParams$Shape.RoundedRect roundedRect = (IndicatorParams$Shape.RoundedRect) inactiveShape;
            copy$default = IndicatorParams$ItemSize.RoundedRect.copy$default(roundedRect.getItemSize(), roundedRect.getItemSize().getItemWidth() + roundedRect.getStrokeWidth(), roundedRect.getItemSize().getItemHeight() + roundedRect.getStrokeWidth(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, null);
        }
        this.inactiveItemSizeWithBorders = copy$default;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public int getBorderColorAt(int i) {
        return this.styleParams.getInactiveShape().getBorderColor();
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public float getBorderWidthAt(int i) {
        return this.styleParams.getInactiveShape().getBorderWidth();
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public int getColorAt(int i) {
        return this.styleParams.getInactiveShape().getColor();
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public IndicatorParams$ItemSize getItemSizeAt(int i) {
        return this.inactiveItemSizeWithBorders;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public RectF getSelectedItemRect(float f, float f2, float f3, boolean z) {
        float f4 = this.itemWidthOverride;
        if (f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f4 = this.styleParams.getActiveShape().getItemSize().getWidth();
        }
        if (z) {
            RectF rectF = this.itemRect;
            float f5 = this.spaceBetweenCenters;
            float f6 = this.selectedPositionOffset;
            float f7 = f5 * f6;
            if (f7 > f5) {
                f7 = f5;
            }
            float f8 = f4 / 2.0f;
            rectF.left = (f - f7) - f8;
            float f9 = f5 * f6;
            if (f9 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f9 = 0.0f;
            }
            rectF.right = (f - f9) + f8;
        } else {
            RectF rectF2 = this.itemRect;
            float f10 = this.spaceBetweenCenters;
            float f11 = this.selectedPositionOffset;
            float f12 = f10 * f11;
            if (f12 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f12 = 0.0f;
            }
            float f13 = f4 / 2.0f;
            rectF2.left = (f12 + f) - f13;
            float f14 = f11 * f10;
            if (f14 <= f10) {
                f10 = f14;
            }
            rectF2.right = f + f10 + f13;
        }
        this.itemRect.top = f2 - (this.styleParams.getActiveShape().getItemSize().getHeight() / 2.0f);
        this.itemRect.bottom = (this.styleParams.getActiveShape().getItemSize().getHeight() / 2.0f) + f2;
        RectF rectF3 = this.itemRect;
        float f15 = rectF3.left;
        if (f15 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            rectF3.offset(-f15, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        RectF rectF4 = this.itemRect;
        float f16 = rectF4.right;
        if (f16 > f3) {
            rectF4.offset(-(f16 - f3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        return this.itemRect;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void onPageScrolled(int i, float f) {
        this.selectedPositionOffset = f;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void overrideItemWidth(float f) {
        this.itemWidthOverride = f;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void updateSpaceBetweenCenters(float f) {
        this.spaceBetweenCenters = f;
    }
}
