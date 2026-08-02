package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.yandex.go.design.widget.qr.QrTargetView;

/* loaded from: classes12.dex */
public final class egg0 {
    public final Matrix a = new Matrix();
    public final int b;
    public float c;
    public final Path d;
    public final float[] e;
    public final RectF f;
    public final Path g;
    public final Paint h;
    public int i;
    public final ValueAnimator j;
    public final /* synthetic */ QrTargetView k;

    public egg0(QrTargetView qrTargetView) {
        this.k = qrTargetView;
        int u = tje.u(24, qrTargetView.getContext());
        this.b = u;
        this.c = 0.2f;
        this.d = new Path();
        float f = u;
        this.e = new float[]{f, f, f, f, f, f, f, f};
        this.f = new RectF();
        this.g = new Path();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(tje.u(6, qrTargetView.getContext()));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.h = paint;
        this.i = qrTargetView.getContext().getColor(mqg0.component_fog_light);
        this.j = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(75L);
    }

    public final void a(Rect rect) {
        RectF rectF = this.f;
        rectF.set(rect);
        Path path = this.d;
        path.reset();
        path.addRoundRect(new RectF(rect), this.e, Path.Direction.CW);
        Path path2 = this.g;
        path2.reset();
        float min = Math.min(rectF.width(), rectF.height()) * this.c;
        float f = rectF.left;
        float f2 = rectF.top;
        int i = this.b;
        float f3 = i;
        path2.moveTo(f, f2 + f3 + min);
        path2.lineTo(rectF.left, rectF.top + f3);
        float f4 = rectF.left;
        float f5 = rectF.top;
        float f6 = i * 2;
        path2.arcTo(f4, f5, f4 + f6, f5 + f6, 180.0f, 90.0f, false);
        path2.lineTo(rectF.left + f3 + min, rectF.top);
        path2.moveTo((rectF.right - f3) - min, rectF.top);
        path2.lineTo(rectF.right - f3, rectF.top);
        float f7 = rectF.right;
        float f8 = rectF.top;
        path2.arcTo(f7 - f6, f8, f7, f8 + f6, -90.0f, 90.0f, false);
        path2.lineTo(rectF.right, rectF.top + f3 + min);
        path2.moveTo(rectF.right, (rectF.bottom - f3) - min);
        path2.lineTo(rectF.right, rectF.bottom - f3);
        float f9 = rectF.right;
        float f10 = rectF.bottom;
        path2.arcTo(f9 - f6, f10 - f6, f9, f10, 0.0f, 90.0f, false);
        path2.lineTo((rectF.right - f3) - min, rectF.bottom);
        path2.moveTo(rectF.left + f3 + min, rectF.bottom);
        path2.lineTo(rectF.left + f3, rectF.bottom);
        float f11 = rectF.left;
        float f12 = rectF.bottom;
        path2.arcTo(f11, f12 - f6, f11 + f6, f12, 90.0f, 90.0f, false);
        path2.lineTo(rectF.left, (rectF.bottom - f3) - min);
    }
}
