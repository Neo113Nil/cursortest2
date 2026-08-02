package com.vkontakte.android.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.app.shared.R$styleable;
import xsna.e3m;
import xsna.m33;

/* loaded from: classes7.dex */
public class RoundedImageView2 extends AppCompatImageView {
    public static final /* synthetic */ int f = 0;
    public final int b;
    public float c;
    public boolean d;

    @Nullable
    public Boolean e;

    public interface a {
    }

    public interface b {
    }

    public static class c extends Drawable {

        @Nullable
        public final RoundedImageView2 a;
        public final Paint b;
        public final RectF c = new RectF();
        public final int d;
        public final int e;

        public c(Bitmap bitmap, @Nullable RoundedImageView2 roundedImageView2) {
            this.a = roundedImageView2;
            Paint paint = new Paint();
            this.b = paint;
            paint.setAntiAlias(true);
            paint.setDither(true);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.d = bitmap.getWidth();
            this.e = bitmap.getHeight();
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            float width;
            RectF rectF = this.c;
            RoundedImageView2 roundedImageView2 = this.a;
            if (roundedImageView2 == null) {
                width = getIntrinsicWidth() / 2;
            } else {
                int i = RoundedImageView2.f;
                roundedImageView2.getClass();
                width = (rectF.width() * roundedImageView2.b) / roundedImageView2.getWidth();
            }
            canvas.drawRoundRect(rectF, width, width, this.b);
        }

        @Override // android.graphics.drawable.Drawable
        public final int getIntrinsicHeight() {
            return getIntrinsicWidth();
        }

        @Override // android.graphics.drawable.Drawable
        public final int getIntrinsicWidth() {
            return Math.min(this.d, this.e);
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public final void onBoundsChange(Rect rect) {
            super.onBoundsChange(rect);
            this.c.set(rect);
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
            Paint paint = this.b;
            if (paint.getAlpha() != i) {
                paint.setAlpha(i);
                invalidateSelf();
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
            this.b.setColorFilter(colorFilter);
        }

        @Override // android.graphics.drawable.Drawable
        public final void setDither(boolean z) {
            this.b.setDither(z);
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public final void setFilterBitmap(boolean z) {
            this.b.setFilterBitmap(z);
            invalidateSelf();
        }
    }

    public RoundedImageView2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.d = false;
        this.e = Boolean.TRUE;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b);
            this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.c = obtainStyledAttributes.getFloat(1, this.c);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.c != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.d) {
                i = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i2) * this.c), 1073741824);
            } else {
                i2 = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) * this.c), 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        Boolean bool = this.e;
        if (bool == null || bool.booleanValue()) {
            super.setImageDrawable(bitmap == null ? null : new c(bitmap, this));
        } else {
            super.setImageBitmap(bitmap);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        Boolean bool = this.e;
        if ((bool == null || bool.booleanValue()) && (drawable instanceof BitmapDrawable)) {
            setImageBitmap(((BitmapDrawable) drawable).getBitmap());
        } else {
            super.setImageDrawable(drawable);
        }
    }

    public void setImageRatio(float f2) {
        this.c = f2;
        requestLayout();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        Context context = getContext();
        e3m.a aVar = e3m.a;
        Drawable a2 = m33.a(i, context);
        Boolean bool = this.e;
        if ((bool == null || bool.booleanValue()) && (a2 instanceof BitmapDrawable)) {
            setImageBitmap(((BitmapDrawable) a2).getBitmap());
        } else {
            super.setImageResource(i);
        }
    }

    public void setIsHeight(boolean z) {
        this.d = z;
    }

    public void setRoundDrawableEnable(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    public void setFactory(a aVar) {
    }

    public void setOnBitmap(b bVar) {
    }
}
