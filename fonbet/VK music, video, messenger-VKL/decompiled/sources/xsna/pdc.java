package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: CircularProgressDrawable.java */
/* loaded from: classes17.dex */
public final class pdc extends Drawable {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public float j;
    public float k;
    public long l;
    public long m;
    public Path n;
    public final Path o;
    public final boolean p;
    public boolean q;
    public final boolean r;
    public long s;
    public boolean e = true;
    public boolean f = true;
    public final DecelerateInterpolator g = new DecelerateInterpolator();
    public final AccelerateInterpolator h = new AccelerateInterpolator();
    public final OvershootInterpolator i = new OvershootInterpolator();
    public final Matrix t = new Matrix();
    public final RectF u = new RectF();
    public final Rect v = new Rect();
    public final int w = 70;

    public pdc(boolean z) {
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(1342177280);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setColor(1090519039);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        float f = 3;
        paint2.setStrokeWidth(iah0.a(f));
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.setColor(-1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(iah0.a(f));
        paint3.setAntiAlias(true);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        Paint paint4 = new Paint();
        this.d = paint4;
        paint4.setColor(-1);
        paint4.setAntiAlias(true);
        Paint paint5 = new Paint();
        paint5.setColor(-16777216);
        paint5.setAntiAlias(true);
        paint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.p = z;
        if (z) {
            Path path = new Path();
            this.o = path;
            path.setFillType(Path.FillType.EVEN_ODD);
            this.r = true;
        }
    }

    public final void a(int i, int i2) {
        this.b.setColor(i);
        this.c.setColor(i2);
    }

    public final void b() {
        this.c.setStrokeWidth(iah0.a(2.0f));
        this.b.setStrokeWidth(iah0.a(2.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        double d;
        float level = getLevel() / 10000.0f;
        Rect bounds = getBounds();
        RectF rectF = this.u;
        rectF.set(bounds);
        Rect bounds2 = getBounds();
        Rect rect = this.v;
        rect.set(bounds2);
        boolean z = this.f;
        Paint paint = this.c;
        int min = z ? (int) Math.min(Math.min(rect.height(), rect.width()) / 2.0f, iah0.a(this.w)) : Math.min(rect.height(), rect.width()) - ((int) paint.getStrokeWidth());
        if (this.e) {
            float f = 2;
            canvas.drawRoundRect(rectF, iah0.a(f), iah0.a(f), this.a);
        }
        int i = min / 2;
        rectF.set(((rect.width() / 2) + rect.left) - i, ((rect.height() / 2) + rect.top) - i, (rect.width() / 2) + rect.left + i, (rect.height() / 2) + rect.top + i);
        if (!this.p || !this.q) {
            Paint paint2 = this.b;
            canvas.drawArc(rectF, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f, false, paint2);
            float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint.getStrokeWidth() - paint2.getStrokeWidth()) / 2.0f;
            rectF.set(rectF.left + max, rectF.top + max, rectF.right - max, rectF.bottom - max);
            canvas.drawArc(rectF, 270.0f, this.k * 360.0f, false, paint);
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.m;
            this.m = currentTimeMillis;
            float f2 = this.j;
            float f3 = level - f2;
            if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                long j2 = this.l + j;
                this.l = j2;
                if (j2 >= 300) {
                    this.k = level;
                    this.j = level;
                    this.l = 0L;
                } else {
                    this.k = (this.g.getInterpolation(j2 / 300.0f) * f3) + f2;
                }
                invalidateSelf();
                return;
            }
            return;
        }
        float currentTimeMillis2 = (System.currentTimeMillis() - this.s) / 500.0f;
        rectF.inset((-paint.getStrokeWidth()) / 2.0f, (-paint.getStrokeWidth()) / 2.0f);
        double d2 = currentTimeMillis2;
        Paint paint3 = this.d;
        Path path = this.o;
        if (d2 <= 0.5d) {
            path.reset();
            path.addArc(rectF, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f);
            float width = rectF.width() / 2.0f;
            float f4 = currentTimeMillis2 * 2.0f;
            d = 0.5d;
            AccelerateInterpolator accelerateInterpolator = this.h;
            rectF.inset(Math.max(accelerateInterpolator.getInterpolation(f4) * width, paint.getStrokeWidth()), Math.max(accelerateInterpolator.getInterpolation(f4) * (rectF.height() / 2.0f), paint.getStrokeWidth()));
            path.addArc(rectF, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f);
            canvas.drawPath(path, paint3);
        } else {
            d = 0.5d;
        }
        if (this.n != null && d2 > d) {
            float interpolation = this.i.getInterpolation((currentTimeMillis2 - 0.5f) * 2.0f);
            path.reset();
            path.addArc(rectF, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f);
            Matrix matrix = this.t;
            matrix.reset();
            matrix.setTranslate(rectF.centerX(), rectF.centerY());
            if (this.r) {
                matrix.postScale(interpolation, interpolation, rectF.centerX(), rectF.centerY());
            }
            path.addPath(this.n, matrix);
            canvas.drawPath(path, paint3);
        }
        if (currentTimeMillis2 < 1.0f) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.p) {
            Path path = new Path();
            this.n = path;
            path.moveTo(0.36233333f, -0.21821874f);
            this.n.lineTo(0.3191875f, -0.26139584f);
            this.n.lineTo(-0.12597917f, 0.18776041f);
            this.n.lineTo(-0.3294375f, -0.014427084f);
            this.n.lineTo(-0.3726146f, 0.028729167f);
            this.n.lineTo(-0.12564583f, 0.27414584f);
            this.n.lineTo(-0.08248958f, 0.231f);
            this.n.lineTo(-0.0826875f, 0.23079167f);
            this.n.close();
            this.n.toggleInverseFillType();
            int min = this.f ? (int) Math.min(Math.min(rect.height(), rect.width()) / 2.0f, iah0.a(this.w)) : Math.min(rect.height(), rect.width()) - ((int) this.c.getStrokeWidth());
            Matrix matrix = new Matrix();
            float f = min * 0.7f;
            matrix.setScale(f, f);
            this.n.transform(matrix);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        this.j = this.k;
        this.l = 0L;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
