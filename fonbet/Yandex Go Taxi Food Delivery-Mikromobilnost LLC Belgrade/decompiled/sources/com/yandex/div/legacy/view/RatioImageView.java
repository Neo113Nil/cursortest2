package com.yandex.div.legacy.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import defpackage.f3i0;
import defpackage.gng0;
import defpackage.ydz;
import defpackage.z83;

/* loaded from: classes11.dex */
public class RatioImageView extends AppCompatImageView {
    public static final int APPLY_ON_HEIGHT = 1;
    public static final int APPLY_ON_WIDTH = 0;
    public static final float MINIMAL_RATIO = 0.0f;
    private static final int SCALE_TOP_CROP = 0;
    private static final String TAG = "[Y:RatioImageView]";
    private int mApplyOn;
    private boolean mHasFrame;
    private Float mRatio;
    private int mScaleType;

    public RatioImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int integer;
        this.mScaleType = 1;
        this.mApplyOn = 1;
        this.mHasFrame = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3i0.RatioImageView, i, 0);
        for (int i2 = 0; i2 < obtainStyledAttributes.getIndexCount(); i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == f3i0.RatioImageView_ratio) {
                this.mRatio = fixRatio(Float.valueOf(obtainStyledAttributes.getFloat(index, 0.0f)));
            } else if (index == f3i0.RatioImageView_customScaleType) {
                int i3 = obtainStyledAttributes.getInt(index, -1);
                this.mScaleType = i3;
                if (i3 == 0) {
                    setScaleType(ImageView.ScaleType.MATRIX);
                }
            } else if (index == f3i0.RatioImageView_direction && ((integer = obtainStyledAttributes.getInteger(index, 1)) == 1 || integer == 0)) {
                this.mApplyOn = integer;
            }
        }
        obtainStyledAttributes.recycle();
    }

    private int calcHeightMeasureSpecByRatio(int i, int i2, int i3) {
        int size = View.MeasureSpec.getSize(i);
        Float f = this.mRatio;
        if (f != null && size > i3) {
            size = Math.round((size - i3) / f.floatValue()) + i2;
        }
        return View.MeasureSpec.makeMeasureSpec(size, 1073741824);
    }

    private int calcWidthMeasureSpecByRatio(int i, int i2, int i3) {
        int size = View.MeasureSpec.getSize(i);
        Float f = this.mRatio;
        if (f != null && size > i2) {
            size = Math.round(f.floatValue() * (size - i2)) + i3;
        }
        return View.MeasureSpec.makeMeasureSpec(size, 1073741824);
    }

    private Float fixRatio(Float f) {
        if (f == null || f.floatValue() > 0.0f) {
            return f;
        }
        z83.j("Ratio must be greater than 0.0");
        return null;
    }

    private void topCropIfNeeded() {
        Drawable drawable;
        if (this.mHasFrame && this.mScaleType == 0 && (drawable = getDrawable()) != null) {
            Matrix matrix = new Matrix();
            matrix.set(getMatrix());
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float intrinsicWidth = drawable.getIntrinsicWidth();
            if (width <= 0.0f || intrinsicWidth <= 0.0f) {
                return;
            }
            float f = width / intrinsicWidth;
            matrix.setScale(f, f);
            setImageMatrix(matrix);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mRatio != null) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingRight = getPaddingRight() + getPaddingLeft();
            if (this.mApplyOn == 1) {
                i2 = calcHeightMeasureSpecByRatio(i, paddingBottom, paddingRight);
            } else {
                i = calcWidthMeasureSpecByRatio(i2, paddingBottom, paddingRight);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setApplyOn(int i) {
        this.mApplyOn = i;
        requestLayout();
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        this.mHasFrame = true;
        topCropIfNeeded();
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        topCropIfNeeded();
    }

    public void setRatio(Float f) {
        this.mRatio = fixRatio(f);
        requestLayout();
    }

    public void setRoundedImage(Bitmap bitmap, int i) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Float f = this.mRatio;
        if (f != null && f.floatValue() > 0.0f) {
            int i2 = this.mApplyOn;
            Float f2 = this.mRatio;
            if (i2 == 1) {
                height = Math.round(width / f2.floatValue());
                if (height > bitmap.getHeight()) {
                    height = bitmap.getHeight();
                }
            } else {
                width = Math.round(f2.floatValue() / height);
                if (width > bitmap.getWidth()) {
                    width = bitmap.getWidth();
                }
            }
        }
        if (width <= 0 || height <= 0) {
            width = bitmap.getWidth();
            height = bitmap.getHeight();
        }
        try {
            RoundedBitmapDrawable a = androidx.core.graphics.drawable.a.a(getResources(), Bitmap.createBitmap(bitmap, 0, 0, width, height));
            a.setCornerRadius(i);
            setImageDrawable(a);
        } catch (OutOfMemoryError e) {
            ydz.c(TAG, "Not enough memory to scale image", e);
            setImageBitmap(bitmap);
        }
    }

    public RatioImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gng0.ratioImageViewStyle);
    }

    public RatioImageView(Context context) {
        this(context, null);
    }
}
