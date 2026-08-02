package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ThumbsGridCornersPainter.kt */
/* loaded from: classes17.dex */
public final class xso0 {
    public static final a6t i = new a6t(new uzt0(true, true, true, true), new bvj(true, true, true, true));
    public final float a;
    public final float b;
    public final Paint c;
    public final Paint d;
    public Bitmap e;
    public Bitmap f;
    public final Rect g;
    public final Rect h;

    public xso0(float f, float f2, float f3, int i2, int i3) {
        this.a = f;
        this.b = f2;
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.g = new Rect();
        this.h = new Rect();
        paint.setColor(i2);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(f3);
        paint2.setColor(i3);
        Bitmap a = a(f);
        this.e = a;
        this.f = f != f2 ? a(f2) : a;
    }

    public final Bitmap a(float f) {
        if (f < 1.0f) {
            return null;
        }
        int i2 = (int) ((2 * f) + 0.5f);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Path path = new Path();
        path.setFillType(Path.FillType.INVERSE_WINDING);
        float f2 = i2;
        path.addOval(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f2, Path.Direction.CW);
        canvas.drawPath(path, this.c);
        Paint paint = this.d;
        if (paint.getColor() != 0 && paint.getStrokeWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            canvas.drawCircle(f, f, f, paint);
        }
        createBitmap.prepareToDraw();
        return createBitmap;
    }

    public final void b(Canvas canvas, RectF rectF, a6t a6tVar) {
        Bitmap bitmap;
        int width = (int) (rectF.width() + 0.5f);
        int height = (int) (rectF.height() + 0.5f);
        for (int i2 = 0; i2 < 4; i2++) {
            boolean z = true;
            boolean z2 = i2 % 2 == 0;
            boolean z3 = i2 / 2 == 0;
            bvj bvjVar = a6tVar.b;
            if ((z2 && z3) ? bvjVar.a : (z2 || !z3) ? (z2 || z3) ? (!z2 || z3) ? true : bvjVar.d : bvjVar.c : bvjVar.b) {
                uzt0 uzt0Var = a6tVar.a;
                if (z2 && z3) {
                    z = uzt0Var.a;
                } else if (!z2 && z3) {
                    z = uzt0Var.b;
                } else if (!z2 && !z3) {
                    z = uzt0Var.c;
                } else if (z2 && !z3) {
                    z = uzt0Var.d;
                }
                bitmap = z ? this.e : this.f;
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                int width2 = bitmap.getWidth() / 2;
                Rect rect = this.g;
                rect.set(0, 0, width2, width2);
                Rect rect2 = this.h;
                rect2.set(rect);
                rect.offsetTo(z2 ? 0 : bitmap.getWidth() - width2, z3 ? 0 : bitmap.getHeight() - width2);
                rect2.offsetTo(z2 ? 0 : width - width2, z3 ? 0 : height - width2);
                rect2.offset((int) rectF.left, (int) rectF.top);
                canvas.drawBitmap(bitmap, rect, rect2, (Paint) null);
            }
        }
    }

    public final void c(int i2, int i3) {
        this.c.setColor(i2);
        this.d.setColor(i3);
        float f = this.a;
        Bitmap a = a(f);
        this.e = a;
        float f2 = this.b;
        if (f != f2) {
            a = a(f2);
        }
        this.f = a;
    }

    public /* synthetic */ xso0(float f, float f2, float f3, int i2, int i3, int i4) {
        this(f, (i4 & 2) != 0 ? f : f2, (i4 & 8) != 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f3, i2, (i4 & 16) != 0 ? 0 : i3);
    }
}
