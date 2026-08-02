package com.vkontakte.android.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSpinner;
import com.vk.imageloader.R$styleable;
import xsna.m33;

/* loaded from: classes7.dex */
public class OverlaySpinner extends AppCompatSpinner {
    public Drawable k;
    public boolean l;
    public boolean m;

    public OverlaySpinner(Context context) {
        super(context);
        this.l = false;
        this.m = false;
    }

    public final void b(AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.b, i, 0);
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId != 0) {
                setOverlay(resourceId);
            }
            this.l = obtainStyledAttributes.getBoolean(3, false);
            this.m = obtainStyledAttributes.getBoolean(2, false);
        }
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        float[] fArr = new float[9];
        canvas.getMatrix().getValues(fArr);
        canvas.translate(-fArr[2], -fArr[5]);
        Drawable drawable = this.k;
        if (drawable != null) {
            if (this.l) {
                drawable.setBounds(getPaddingLeft(), getPaddingTop(), canvas.getWidth() - getPaddingRight(), canvas.getHeight() - getPaddingBottom());
            } else if (this.m) {
                Rect rect = new Rect();
                if (getBackground() != null && !getBackground().getPadding(rect)) {
                    rect.set(0, 0, 0, 0);
                }
                this.k.setBounds(rect.left, rect.top, canvas.getWidth() - rect.right, canvas.getHeight() - rect.bottom);
            } else {
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            }
            this.k.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.k;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.k.setState(getDrawableState());
        postInvalidate();
    }

    public void setOverlay(int i) {
        setOverlay(m33.a(i, getContext()));
    }

    public void setPadOverlay(boolean z) {
        this.l = z;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.k;
    }

    public void setOverlay(Drawable drawable) {
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.k = drawable;
        drawable.setCallback(this);
        invalidate();
    }

    public OverlaySpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = false;
        this.m = false;
        b(attributeSet, 0);
    }

    public OverlaySpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = false;
        this.m = false;
        b(attributeSet, i);
    }

    public OverlaySpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.l = false;
        this.m = false;
        b(attributeSet, i);
    }
}
