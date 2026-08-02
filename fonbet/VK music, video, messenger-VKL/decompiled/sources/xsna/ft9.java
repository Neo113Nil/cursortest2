package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: CardDrawable.java */
/* loaded from: classes17.dex */
public final class ft9 extends Drawable {
    public static final float o = iah0.a(2.0f);
    public static final float[] p = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f};
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final RadialGradient d;
    public final LinearGradient e;
    public final RectF f;
    public final RectF g;
    public final RectF h;
    public final RectF i;
    public final float j;
    public final float k;
    public final Path l;
    public final boolean m;
    public boolean n;

    public ft9(float f, float f2, int i, boolean z) {
        this.f = new RectF();
        this.g = new RectF();
        this.h = new RectF();
        this.l = new Path();
        this.n = true;
        float f3 = f2 * 1.0f;
        this.k = f3;
        int[] iArr = {268435456, 268435456, 0};
        Paint paint = new Paint(5);
        this.a = paint;
        paint.setColor(i);
        Paint paint2 = new Paint(5);
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setDither(true);
        this.j = f;
        this.c = new Paint(paint2);
        this.m = z;
        this.i = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3);
        float f4 = f + f3;
        float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f / f4, 1.0f};
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.d = new RadialGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, iArr, fArr, tileMode);
        float f5 = -f;
        this.e = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5 + f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5 - f3, iArr, p, tileMode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        boolean z;
        boolean z2 = this.n;
        Paint paint = this.c;
        Paint paint2 = this.b;
        Path path = this.l;
        float f = this.j;
        float f2 = this.k;
        RectF rectF = this.f;
        if (z2) {
            Rect bounds = getBounds();
            rectF.set(bounds.left + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = -f;
            RectF rectF2 = this.g;
            rectF2.set(f3, f3, f, f);
            RectF rectF3 = this.h;
            rectF3.set(rectF2);
            float f4 = -f2;
            rectF3.inset(f4, f4);
            path.reset();
            path.setFillType(Path.FillType.EVEN_ODD);
            path.moveTo(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            path.rLineTo(f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            path.arcTo(rectF3, 180.0f, 90.0f, false);
            path.arcTo(rectF2, 270.0f, -90.0f, false);
            path.close();
            paint2.setShader(this.d);
            paint.setShader(this.e);
            this.n = false;
        }
        int save = canvas.save();
        float f5 = (f + f2) * 2.0f;
        float f6 = -f;
        float f7 = f6 - f2;
        Rect bounds2 = getBounds();
        boolean z3 = this.m;
        if (z3) {
            z = z3;
            canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rectF.top + f);
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f7, bounds2.width(), f6, paint);
            canvas.rotate(180.0f);
            canvas.translate(-bounds2.right, (-bounds2.height()) + f5);
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f7, bounds2.width(), f6 + f2, paint);
        } else {
            canvas.translate(rectF.left + f, rectF.top + f);
            canvas.drawPath(path, paint2);
            z = z3;
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f7, bounds2.width() - f5, f6, paint);
            canvas.rotate(180.0f);
            canvas.translate((-bounds2.width()) + f5, (-bounds2.height()) + f5);
            canvas.drawPath(path, paint2);
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f7, bounds2.width() - f5, f6 + f2, paint);
            canvas.rotate(90.0f);
            canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (-bounds2.width()) + f5);
            canvas.drawPath(path, paint2);
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f7, bounds2.height() - f5, f6, paint);
            canvas.rotate(180.0f);
            canvas.translate((-bounds2.height()) + f5, (-bounds2.width()) + f5);
            canvas.drawPath(path, paint2);
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f7, bounds2.height() - f5, f6, paint);
        }
        canvas.restoreToCount(save);
        Paint paint3 = this.a;
        if (z) {
            float f8 = getBounds().left;
            RectF rectF4 = this.i;
            canvas.drawRect(f8 + rectF4.left, (r2.top + rectF4.top) - (f2 * 0.5f), r2.right - rectF4.right, r2.bottom - rectF4.bottom, paint3);
            return;
        }
        int save2 = canvas.save();
        float f9 = 0.5f * f2;
        float f10 = f2 - f9;
        canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -f9);
        rectF.bottom += f9;
        rectF.left -= f10;
        rectF.right += f10;
        rectF.top = Math.round(rectF.top);
        rectF.bottom = Math.round(rectF.bottom);
        canvas.drawRoundRect(rectF, f, f, paint3);
        rectF.bottom -= f9;
        rectF.left += f10;
        rectF.right -= f10;
        canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f9);
        canvas.restoreToCount(save2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(@NonNull Rect rect) {
        float f = this.k;
        int ceil = (int) Math.ceil(0.5f * f);
        int ceil2 = this.m ? 0 : (int) Math.ceil(f - ceil);
        rect.set(ceil2, ceil, ceil2, (int) Math.ceil(f));
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.n = true;
    }

    public ft9(float f, int i, boolean z) {
        this(f, o, i, z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
