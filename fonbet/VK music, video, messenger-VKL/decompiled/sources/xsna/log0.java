package xsna;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;

/* compiled from: RoundedBitmapDrawable.java */
/* loaded from: classes.dex */
public final class log0 extends epg0 {
    public static final /* synthetic */ int J = 0;
    public final Paint E;
    public final Paint F;
    public final Bitmap G;
    public WeakReference<Bitmap> H;
    public RectF I;

    public log0(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.E = paint2;
        Paint paint3 = new Paint(1);
        this.F = paint3;
        this.I = null;
        this.G = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override // xsna.epg0
    public final void d() {
        super.d();
        if (this.I == null) {
            this.I = new RectF();
        }
        this.y.mapRect(this.I, this.o);
    }

    @Override // xsna.epg0, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Shader shader;
        if (lhs.d()) {
            lhs.a("RoundedBitmapDrawable#draw");
        }
        if (!((this.c || this.d || this.e > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && this.G != null)) {
            super.draw(canvas);
            if (lhs.d()) {
                lhs.b();
                return;
            }
            return;
        }
        d();
        b();
        WeakReference<Bitmap> weakReference = this.H;
        Paint paint = this.E;
        Bitmap bitmap = this.G;
        if (weakReference == null || weakReference.get() != bitmap) {
            this.H = new WeakReference<>(bitmap);
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                this.g = true;
            }
        }
        if (this.g && (shader = paint.getShader()) != null) {
            shader.setLocalMatrix(this.y);
            this.g = false;
        }
        paint.setFilterBitmap(this.B);
        int save = canvas.save();
        canvas.concat(this.v);
        RectF rectF = this.I;
        Path path = this.f;
        if (rectF != null) {
            int save2 = canvas.save();
            canvas.clipRect(this.I);
            canvas.drawPath(path, paint);
            canvas.restoreToCount(save2);
        } else {
            canvas.drawPath(path, paint);
        }
        float f = this.e;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            Paint paint2 = this.F;
            paint2.setStrokeWidth(f);
            paint2.setColor(sko.b(this.h, paint.getAlpha()));
            canvas.drawPath(this.i, paint2);
        }
        canvas.restoreToCount(save);
        if (lhs.d()) {
            lhs.b();
        }
    }

    @Override // xsna.epg0, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        Paint paint = this.E;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // xsna.epg0, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.E.setColorFilter(colorFilter);
    }

    @Override // xsna.epg0, xsna.jog0
    public final void k() {
    }
}
