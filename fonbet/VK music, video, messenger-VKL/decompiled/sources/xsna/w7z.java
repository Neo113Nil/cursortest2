package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import xsna.qlo;

/* compiled from: LinearDrawingDelegate.java */
/* loaded from: classes13.dex */
public final class w7z extends qlo<m8z> {
    public float b;
    public float c;
    public float d;
    public boolean e;
    public float f;

    @Override // xsna.qlo
    public final void a(@NonNull Canvas canvas, @NonNull Rect rect, float f, boolean z, boolean z2) {
        this.b = rect.width();
        m8z m8zVar = (m8z) this.a;
        float f2 = m8zVar.a;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (rect.height() - f2) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (m8zVar.j) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f3 = this.b / 2.0f;
        float f4 = f2 / 2.0f;
        canvas.clipRect(-f3, -f4, f3, f4);
        int i = m8zVar.a;
        this.e = i / 2 == m8zVar.b;
        this.c = i * f;
        this.d = Math.min(i / 2, r6) * f;
        if (z || z2) {
            if ((z && m8zVar.e == 2) || (z2 && m8zVar.f == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z2 && m8zVar.f != 3)) {
                canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((1.0f - f) * m8zVar.a) / 2.0f);
            }
        }
        if (z2 && m8zVar.f == 3) {
            this.f = f;
        } else {
            this.f = 1.0f;
        }
    }

    @Override // xsna.qlo
    public final void b(@NonNull Canvas canvas, int i, int i2, @NonNull Paint paint) {
        int a = dm10.a(i, i2);
        m8z m8zVar = (m8z) this.a;
        if (m8zVar.k <= 0 || a == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(a);
        PointF pointF = new PointF((this.b / 2.0f) - (this.c / 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int i3 = m8zVar.k;
        h(canvas, paint, pointF, null, i3, i3);
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
        return ((m8z) this.a).a;
    }

    @Override // xsna.qlo
    public final int f() {
        return -1;
    }

    public final void g(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f2, int i, int i2, int i3) {
        float f3;
        float a = xwk.a(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        float a2 = xwk.a(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        float l = zjq.l(1.0f - this.f, 1.0f, a);
        float l2 = zjq.l(1.0f - this.f, 1.0f, a2);
        int a3 = (int) ((xwk.a(l, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.01f) * i2) / 0.01f);
        float a4 = 1.0f - xwk.a(l2, 0.99f, 1.0f);
        float f4 = this.b;
        int i4 = (int) ((l * f4) + a3);
        int i5 = (int) ((l2 * f4) - ((int) ((a4 * i3) / 0.01f)));
        float f5 = (-f4) / 2.0f;
        if (i4 <= i5) {
            float f6 = this.d;
            float f7 = i4 + f6;
            float f8 = i5 - f6;
            float f9 = f6 * 2.0f;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.c);
            if (f7 >= f8) {
                h(canvas, paint, new PointF(f7 + f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new PointF(f8 + f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), f9, this.c);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(this.e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f10 = f7 + f5;
            float f11 = f8 + f5;
            canvas.drawLine(f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
            if (this.e || this.d <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            paint.setStyle(Paint.Style.FILL);
            if (f7 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f3 = f9;
                h(canvas, paint, new PointF(f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), null, f3, this.c);
            } else {
                f3 = f9;
            }
            if (f8 < this.b) {
                h(canvas, paint, new PointF(f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), null, f3, this.c);
            }
        }
    }

    public final void h(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull PointF pointF, @Nullable PointF pointF2, float f, float f2) {
        float min = Math.min(f2, this.c);
        float f3 = f / 2.0f;
        float min2 = Math.min(f3, (this.d * min) / this.c);
        RectF rectF = new RectF((-f) / 2.0f, (-min) / 2.0f, f3, min / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, min2, min2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }
}
