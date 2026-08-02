package com.yandex.alicekit.core.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import defpackage.b3i0;

/* loaded from: classes11.dex */
public class RoundedCornersWithStrokeLayout extends FrameLayout {
    private float mCornerRadius;
    private final RectF mRect;
    private final Paint mStrokePaint;
    private final RectF mStrokeRect;
    private int mStrokeWidth;

    public RoundedCornersWithStrokeLayout(Context context) {
        super(context);
        this.mStrokePaint = new Paint(1);
        this.mRect = new RectF();
        this.mStrokeRect = new RectF();
        init(context, null, 0, 0);
    }

    private void init(Context context, AttributeSet attributeSet, int i, int i2) {
        int i3 = -65536;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b3i0.RoundedCornersWithStrokeLayout, i, i2);
            this.mCornerRadius = obtainStyledAttributes.getDimensionPixelSize(b3i0.RoundedCornersWithStrokeLayout_roundedCornersLayoutCornerRadius, 0);
            this.mStrokeWidth = obtainStyledAttributes.getDimensionPixelSize(b3i0.RoundedCornersWithStrokeLayout_roundedCornersLayoutStrokeWidth, 0);
            i3 = obtainStyledAttributes.getColor(b3i0.RoundedCornersWithStrokeLayout_roundedCornersLayoutStrokeColor, -65536);
            obtainStyledAttributes.recycle();
        }
        this.mStrokePaint.setStyle(Paint.Style.STROKE);
        this.mStrokePaint.setColor(i3);
        this.mStrokePaint.setStrokeWidth(this.mStrokeWidth);
        setupClip();
    }

    private void setupClip() {
        setOutlineProvider(new ViewOutlineProvider() { // from class: com.yandex.alicekit.core.views.RoundedCornersWithStrokeLayout.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, RoundedCornersWithStrokeLayout.this.getWidth(), RoundedCornersWithStrokeLayout.this.getHeight(), RoundedCornersWithStrokeLayout.this.mCornerRadius);
            }
        });
        setClipToOutline(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        RectF rectF = this.mStrokeRect;
        float f = this.mCornerRadius;
        canvas.drawRoundRect(rectF, f, f, this.mStrokePaint);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.mRect.set(0.0f, 0.0f, getWidth(), getHeight());
        this.mStrokeRect.set(0.0f, 0.0f, getWidth(), getHeight());
        float ceil = (float) Math.ceil(this.mStrokeWidth / 2.0f);
        this.mStrokeRect.inset(ceil, ceil);
    }

    public void setCornerRadius(float f) {
        this.mCornerRadius = f;
    }

    public void setStrokeColor(int i) {
        this.mStrokePaint.setColor(i);
    }

    public void setStrokeWidth(int i) {
        this.mStrokeWidth = i;
        this.mStrokePaint.setStrokeWidth(i);
    }

    public RoundedCornersWithStrokeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mStrokePaint = new Paint(1);
        this.mRect = new RectF();
        this.mStrokeRect = new RectF();
        init(context, attributeSet, 0, 0);
    }

    public RoundedCornersWithStrokeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mStrokePaint = new Paint(1);
        this.mRect = new RectF();
        this.mStrokeRect = new RectF();
        init(context, attributeSet, i, 0);
    }

    public RoundedCornersWithStrokeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mStrokePaint = new Paint(1);
        this.mRect = new RectF();
        this.mStrokeRect = new RectF();
        init(context, attributeSet, i, i2);
    }
}
