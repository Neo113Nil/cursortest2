package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.div.internal.Assert;
import xsna.x9;

/* compiled from: SeparatorView.kt */
/* loaded from: classes7.dex */
public class SeparatorView extends View {
    private int dividerGravity;
    private final Paint dividerPaint;
    private final Rect dividerRect;
    private int dividerThickness;
    private boolean isDividerRectChanged;
    private boolean isHorizontal;

    public SeparatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        paint.setColor(0);
        this.dividerPaint = paint;
        this.dividerRect = new Rect();
        this.isHorizontal = true;
        this.dividerGravity = 17;
    }

    private final int calcSize(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? i : size : Math.min(i, size);
    }

    private final boolean isDividerVisible() {
        return Color.alpha(this.dividerPaint.getColor()) > 0;
    }

    private final void updateDividerRect() {
        if (this.isDividerRectChanged) {
            int paddingTop = this.isHorizontal ? getPaddingTop() : getPaddingLeft();
            int paddingBottom = this.isHorizontal ? getPaddingBottom() : getPaddingRight();
            int height = this.isHorizontal ? getHeight() : getWidth();
            int i = (height - paddingTop) - paddingBottom;
            int i2 = this.dividerGravity;
            if (i2 == 17) {
                paddingTop = x9.b(i, this.dividerThickness, 2, paddingTop);
            } else if (i2 != 8388611) {
                if (i2 != 8388613) {
                    Assert.fail("Unknown divider gravity value");
                    paddingTop = 0;
                } else {
                    paddingTop = (height - paddingBottom) - this.dividerThickness;
                }
            }
            if (this.isHorizontal) {
                Rect rect = this.dividerRect;
                rect.top = paddingTop;
                rect.bottom = Math.min(i, this.dividerThickness) + paddingTop;
                this.dividerRect.left = getPaddingLeft();
                this.dividerRect.right = getWidth() - getPaddingRight();
            } else {
                Rect rect2 = this.dividerRect;
                rect2.left = paddingTop;
                rect2.right = Math.min(i, this.dividerThickness) + paddingTop;
                this.dividerRect.top = getPaddingTop();
                this.dividerRect.bottom = getHeight() - getPaddingBottom();
            }
            this.isDividerRectChanged = false;
        }
    }

    public final int getDividerColor() {
        return this.dividerPaint.getColor();
    }

    public final int getDividerGravity() {
        return this.dividerGravity;
    }

    public final int getDividerThickness() {
        return this.dividerThickness;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isDividerVisible()) {
            updateDividerRect();
            canvas.drawRect(this.dividerRect, this.dividerPaint);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.isHorizontal) {
            paddingBottom += this.dividerThickness;
        } else {
            paddingRight += this.dividerThickness;
        }
        setMeasuredDimension(calcSize(Math.max(paddingRight, getSuggestedMinimumWidth()), i), calcSize(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.isDividerRectChanged = true;
    }

    public final void setDividerColor(int i) {
        if (this.dividerPaint.getColor() != i) {
            this.dividerPaint.setColor(i);
            invalidate();
        }
    }

    public final void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public final void setDividerGravity(int i) {
        if (this.dividerGravity != i) {
            this.dividerGravity = i;
            this.isDividerRectChanged = true;
            invalidate();
        }
    }

    public final void setDividerHeightResource(int i) {
        setDividerThickness(getResources().getDimensionPixelSize(i));
    }

    public final void setDividerThickness(int i) {
        if (this.dividerThickness != i) {
            this.dividerThickness = i;
            this.isDividerRectChanged = true;
            requestLayout();
        }
    }

    public final void setHorizontal(boolean z) {
        if (this.isHorizontal != z) {
            this.isHorizontal = z;
            this.isDividerRectChanged = true;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        this.isDividerRectChanged = true;
    }

    public static /* synthetic */ void getDividerGravity$annotations() {
    }
}
