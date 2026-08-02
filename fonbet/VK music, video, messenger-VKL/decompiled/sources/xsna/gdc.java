package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import xsna.qlo;

/* compiled from: CircularDrawingDelegate.java */
/* loaded from: classes13.dex */
public final class gdc extends qlo<qdc> {
    public float b;
    public float c;
    public float d;
    public boolean e;
    public float f;

    @Override // xsna.qlo
    public final void a(@NonNull Canvas canvas, @NonNull Rect rect, float f, boolean z, boolean z2) {
        float width = rect.width() / i();
        float height = rect.height() / i();
        qdc qdcVar = (qdc) this.a;
        float f2 = (qdcVar.h / 2.0f) + qdcVar.i;
        canvas.translate((f2 * width) + rect.left, (f2 * height) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(width, height);
        if (qdcVar.j != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        int i = qdcVar.a;
        this.e = i / 2 <= qdcVar.b;
        this.b = i * f;
        this.c = Math.min(i / 2, r1) * f;
        int i2 = qdcVar.h;
        int i3 = qdcVar.a;
        float f4 = (i2 - i3) / 2.0f;
        this.d = f4;
        if (z || z2) {
            if ((z && qdcVar.e == 2) || (z2 && qdcVar.f == 1)) {
                this.d = uq.a(1.0f - f, i3, 2.0f, f4);
            } else if ((z && qdcVar.e == 1) || (z2 && qdcVar.f == 2)) {
                this.d = f4 - (((1.0f - f) * i3) / 2.0f);
            }
        }
        if (z2 && qdcVar.f == 3) {
            this.f = f;
        } else {
            this.f = 1.0f;
        }
    }

    @Override // xsna.qlo
    public final void c(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull qlo.a aVar, int i) {
        int a = dm10.a(aVar.c, i);
        float f = aVar.a;
        float f2 = aVar.b;
        int i2 = aVar.d;
        g(canvas, paint, f, f2, a, i2, i2);
    }

    @Override // xsna.qlo
    public final void d(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f2, int i, int i2, int i3) {
        g(canvas, paint, f, f2, dm10.a(i, i2), i3, i3);
    }

    @Override // xsna.qlo
    public final int e() {
        return i();
    }

    @Override // xsna.qlo
    public final int f() {
        return i();
    }

    public final void g(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f2, int i, int i2, int i3) {
        float f3 = f2 >= f ? f2 - f : (f2 + 1.0f) - f;
        float f4 = f % 1.0f;
        if (this.f < 1.0f) {
            float f5 = f4 + f3;
            if (f5 > 1.0f) {
                g(canvas, paint, f4, 1.0f, i, i2, 0);
                g(canvas, paint, 1.0f, f5, i, 0, i3);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.c / this.d);
        if (f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f3 >= 0.99f) {
            f3 += (((degrees * 2.0f) / 360.0f) * (f3 - 0.99f)) / 0.01f;
        }
        float l = zjq.l(1.0f - this.f, 1.0f, f4);
        float l2 = zjq.l(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f, f3);
        float degrees2 = (float) Math.toDegrees(i2 / this.d);
        float degrees3 = ((l2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.d));
        float f6 = (l * 360.0f) + degrees2;
        if (degrees3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.b);
        float f7 = degrees * 2.0f;
        if (degrees3 < f7) {
            float f8 = degrees3 / f7;
            paint.setStyle(Paint.Style.FILL);
            h(canvas, paint, (degrees * f8) + f6, this.c * 2.0f, this.b, f8);
            return;
        }
        float f9 = this.d;
        float f10 = -f9;
        RectF rectF = new RectF(f10, f10, f9, f9);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f11 = f6 + degrees;
        canvas.drawArc(rectF, f11, degrees3 - f7, false, paint);
        if (this.e || this.c <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        h(canvas, paint, f11, this.c * 2.0f, this.b, 1.0f);
        h(canvas, paint, (f6 + degrees3) - degrees, this.c * 2.0f, this.b, 1.0f);
    }

    public final void h(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f2, float f3, float f4) {
        float min = (int) Math.min(f3, this.b);
        float f5 = f2 / 2.0f;
        float min2 = Math.min(f5, (this.c * min) / this.b);
        RectF rectF = new RectF((-min) / 2.0f, (-f2) / 2.0f, min / 2.0f, f5);
        canvas.save();
        double d = f;
        canvas.translate((float) (Math.cos(Math.toRadians(d)) * this.d), (float) (Math.sin(Math.toRadians(d)) * this.d));
        canvas.rotate(f);
        canvas.scale(f4, f4);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }

    public final int i() {
        S s = this.a;
        return (((qdc) s).i * 2) + ((qdc) s).h;
    }

    @Override // xsna.qlo
    public final void b(@NonNull Canvas canvas, int i, int i2, @NonNull Paint paint) {
    }
}
