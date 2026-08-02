package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import xsna.zcl;

/* compiled from: ViewPagerFixedSizeLayout.kt */
/* loaded from: classes7.dex */
public final class ViewPagerFixedSizeLayout extends FrameLayout {
    private int _collapsiblePaddingBottom;
    private boolean animateOnScroll;
    private HeightCalculator heightCalculator;
    private Integer lastHeightMeasureSpec;
    private Rect visibleRect;

    /* compiled from: ViewPagerFixedSizeLayout.kt */
    public interface HeightCalculator {
        void dropMeasureCache();

        int measureHeight(int i, int i2);

        void setPositionAndOffsetForMeasure(int i, float f);

        boolean shouldRequestLayoutOnScroll(int i, float f);
    }

    public /* synthetic */ ViewPagerFixedSizeLayout(Context context, AttributeSet attributeSet, int i, int i2, zcl zclVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final boolean getAnimateOnScroll() {
        return this.animateOnScroll;
    }

    public final int getCollapsiblePaddingBottom() {
        return this._collapsiblePaddingBottom;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        this.lastHeightMeasureSpec = Integer.valueOf(i2);
        HeightCalculator heightCalculator = this.heightCalculator;
        if (heightCalculator != null) {
            i2 = View.MeasureSpec.makeMeasureSpec(heightCalculator.measureHeight(i, i2), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public final void setAnimateOnScroll(boolean z) {
        this.animateOnScroll = z;
    }

    public final void setCollapsiblePaddingBottom(int i) {
        if (this._collapsiblePaddingBottom != i) {
            this._collapsiblePaddingBottom = i;
        }
    }

    public final void setHeightCalculator(HeightCalculator heightCalculator) {
        this.heightCalculator = heightCalculator;
    }

    public final boolean shouldRequestLayoutOnScroll(int i, float f) {
        HeightCalculator heightCalculator;
        if (this.animateOnScroll && (heightCalculator = this.heightCalculator) != null && heightCalculator.shouldRequestLayoutOnScroll(i, f)) {
            Rect rect = this.visibleRect;
            if (rect == null) {
                rect = new Rect();
                this.visibleRect = rect;
            }
            getLocalVisibleRect(rect);
            if (rect.height() == getHeight()) {
                return true;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824);
            Integer num = this.lastHeightMeasureSpec;
            int measureHeight = heightCalculator.measureHeight(makeMeasureSpec, num != null ? num.intValue() : View.MeasureSpec.makeMeasureSpec(0, 0));
            if (measureHeight != getHeight()) {
                int i2 = rect.top;
                if (measureHeight <= rect.bottom && i2 <= measureHeight) {
                    return true;
                }
            }
        }
        return false;
    }

    public ViewPagerFixedSizeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.animateOnScroll = true;
    }
}
