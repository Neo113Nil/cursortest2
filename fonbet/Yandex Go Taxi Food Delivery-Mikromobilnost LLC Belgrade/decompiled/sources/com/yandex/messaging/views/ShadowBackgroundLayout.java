package com.yandex.messaging.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.agr0;
import defpackage.k3i0;
import defpackage.yxk0;

/* loaded from: classes15.dex */
public class ShadowBackgroundLayout extends LinearLayout {
    private static final int AUTO_RADIUS = -1;
    private final yxk0 mBackgroundWithShadow;

    public ShadowBackgroundLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, k3i0.ShadowBackgroundLayout, 0, 0);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(k3i0.ShadowBackgroundLayout_shadowRadius, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(k3i0.ShadowBackgroundLayout_shadowY, 0);
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(k3i0.ShadowBackgroundLayout_shadowPadding, 0);
            int color = obtainStyledAttributes.getColor(k3i0.ShadowBackgroundLayout_shadowBackground, 0);
            int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(k3i0.ShadowBackgroundLayout_backgroundRadius, 0);
            int color2 = obtainStyledAttributes.getColor(k3i0.ShadowBackgroundLayout_shadowColor, 0);
            obtainStyledAttributes.recycle();
            this.mBackgroundWithShadow = new yxk0(this, dimensionPixelSize3, dimensionPixelSize4 <= 0 ? -1 : dimensionPixelSize4, color, new agr0(dimensionPixelSize, dimensionPixelSize2, color2));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        yxk0 yxk0Var = this.mBackgroundWithShadow;
        int i = yxk0Var.f;
        ShadowBackgroundLayout shadowBackgroundLayout = yxk0Var.d;
        if (shadowBackgroundLayout.getWidth() != 0 && shadowBackgroundLayout.getHeight() != 0) {
            int i2 = yxk0Var.g;
            if (i2 < 0) {
                i2 = (int) ((Math.min(shadowBackgroundLayout.getMeasuredWidth(), shadowBackgroundLayout.getMeasuredHeight()) / 2.0f) - i);
            }
            yxk0Var.h = i2;
            Bitmap bitmap = yxk0Var.i;
            if (bitmap == null || bitmap.getWidth() != shadowBackgroundLayout.getWidth() || yxk0Var.i.getHeight() != shadowBackgroundLayout.getHeight()) {
                yxk0Var.i = Bitmap.createBitmap(shadowBackgroundLayout.getWidth(), shadowBackgroundLayout.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(yxk0Var.i);
                RoundRectDrawableWithShadow roundRectDrawableWithShadow = yxk0Var.c;
                int i3 = yxk0Var.h;
                int i4 = yxk0Var.e.a;
                float f = i3 - i4;
                if (f >= 0.0f) {
                    roundRectDrawableWithShadow.setCornerRadius(f);
                    int i5 = i - i4;
                    roundRectDrawableWithShadow.setBounds(i5, i5, (shadowBackgroundLayout.getWidth() - i) + i4, (shadowBackgroundLayout.getHeight() - i) + i4);
                    roundRectDrawableWithShadow.draw(canvas2);
                }
                RectF rectF = yxk0Var.b;
                float f2 = i;
                rectF.left = f2;
                rectF.top = f2;
                rectF.right = shadowBackgroundLayout.getWidth() - i;
                rectF.bottom = shadowBackgroundLayout.getHeight() - i;
                float f3 = yxk0Var.h;
                canvas2.drawRoundRect(rectF, f3, f3, yxk0Var.a);
            }
            canvas.drawBitmap(yxk0Var.i, 0.0f, 0.0f, (Paint) null);
        }
        super.onDraw(canvas);
    }
}
