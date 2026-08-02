package com.yandex.div.internal.widget.indicator.animations;

import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;

/* compiled from: IndicatorAnimator.kt */
/* loaded from: classes7.dex */
public interface IndicatorAnimator {
    int getBorderColorAt(int i);

    float getBorderWidthAt(int i);

    int getColorAt(int i);

    IndicatorParams$ItemSize getItemSizeAt(int i);

    RectF getSelectedItemRect(float f, float f2, float f3, boolean z);

    void onPageScrolled(int i, float f);

    default void onPageSelected(int i) {
    }

    default void overrideItemWidth(float f) {
    }

    default void setItemsCount(int i) {
    }

    default void updateSpaceBetweenCenters(float f) {
    }
}
