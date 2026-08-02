package xsna;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: RoundedBitmapDrawable.java */
/* loaded from: classes11.dex */
public abstract class nog0 extends Drawable {
    public final Bitmap a;
    public final int b;
    public final BitmapShader e;
    public float g;
    public boolean k;
    public final int l;
    public final int m;
    public final int c = Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
    public final Paint d = new Paint(3);
    public final Matrix f = new Matrix();
    public final Rect h = new Rect();
    public final RectF i = new RectF();
    public boolean j = true;

    public nog0(Resources resources, Bitmap bitmap) {
        this.b = 160;
        if (resources != null) {
            this.b = resources.getDisplayMetrics().densityDpi;
        }
        this.a = bitmap;
        if (bitmap == null) {
            this.m = -1;
            this.l = -1;
            this.e = null;
        } else {
            int i = this.b;
            this.l = bitmap.getScaledWidth(i);
            this.m = bitmap.getScaledHeight(i);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.e = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    public final void a() {
        this.k = true;
        this.j = true;
        this.g = Math.min(this.m, this.l) / 2;
        this.d.setShader(this.e);
        invalidateSelf();
    }

    public final void b(float f) {
        if (this.g == f) {
            return;
        }
        this.k = false;
        Paint paint = this.d;
        if (f > 0.05f) {
            paint.setShader(this.e);
        } else {
            paint.setShader(null);
        }
        this.g = f;
        invalidateSelf();
    }

    public final void c() {
        if (this.j) {
            boolean z = this.k;
            Rect rect = this.h;
            if (z) {
                int min = Math.min(this.l, this.m);
                Gravity.apply(this.c, min, min, getBounds(), this.h, 0);
                int min2 = Math.min(rect.width(), rect.height());
                rect.inset(Math.max(0, (rect.width() - min2) / 2), Math.max(0, (rect.height() - min2) / 2));
                this.g = min2 * 0.5f;
            } else {
                Gravity.apply(this.c, this.l, this.m, getBounds(), this.h, 0);
            }
            RectF rectF = this.i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.e;
            if (bitmapShader != null) {
                float f = rectF.left;
                float f2 = rectF.top;
                Matrix matrix = this.f;
                matrix.setTranslate(f, f2);
                float width = rectF.width();
                Bitmap bitmap = this.a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.d.setShader(bitmapShader);
            }
            this.j = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            return;
        }
        c();
        Paint paint = this.d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.h, paint);
            return;
        }
        RectF rectF = this.i;
        float f = this.g;
        canvas.drawRoundRect(rectF, f, f, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.m;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Bitmap bitmap;
        return (this.c != 119 || this.k || (bitmap = this.a) == null || bitmap.hasAlpha() || this.d.getAlpha() < 255 || this.g > 0.05f) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.k) {
            this.g = Math.min(this.m, this.l) / 2;
        }
        this.j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.d;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.d.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.d.setFilterBitmap(z);
        invalidateSelf();
    }
}
