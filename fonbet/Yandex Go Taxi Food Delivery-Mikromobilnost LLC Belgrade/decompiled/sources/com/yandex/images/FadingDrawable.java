package com.yandex.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;

/* loaded from: classes15.dex */
public class FadingDrawable extends BitmapDrawable {
    private static final float FADE_IN_DURATION = 200.0f;
    private static volatile boolean sSuppressAnimation;
    private int mAlpha;
    private boolean mAnimating;
    private Drawable mPlaceholder;
    private long mStartTimeMillis;

    public FadingDrawable(Context context, Bitmap bitmap, Drawable drawable, ImageManager$From imageManager$From, boolean z) {
        super(context.getResources(), bitmap);
        this.mAlpha = 255;
        if (imageManager$From == ImageManager$From.MEMORY || z || sSuppressAnimation) {
            return;
        }
        this.mPlaceholder = drawable;
        this.mAnimating = true;
        this.mStartTimeMillis = SystemClock.elapsedRealtime();
    }

    public static void setBitmap(ImageView imageView, Bitmap bitmap, boolean z, ImageManager$From imageManager$From) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        imageView.setImageDrawable(new FadingDrawable(imageView.getContext(), bitmap, drawable, imageManager$From, z));
    }

    public static void setPlaceholder(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    public static void setSuppressAnimation(boolean z) {
        sSuppressAnimation = z;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!this.mAnimating) {
            super.draw(canvas);
            return;
        }
        float elapsedRealtime = (SystemClock.elapsedRealtime() - this.mStartTimeMillis) / FADE_IN_DURATION;
        if (elapsedRealtime >= 1.0f) {
            this.mAnimating = false;
            this.mPlaceholder = null;
            super.draw(canvas);
        } else {
            Drawable drawable = this.mPlaceholder;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            super.setAlpha((int) (this.mAlpha * elapsedRealtime));
            super.draw(canvas);
            super.setAlpha(this.mAlpha);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.mPlaceholder;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.mAlpha = i;
        Drawable drawable = this.mPlaceholder;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.mPlaceholder;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
