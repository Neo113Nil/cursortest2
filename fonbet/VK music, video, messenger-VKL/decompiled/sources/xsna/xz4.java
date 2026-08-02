package xsna;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import xsna.swo0;

/* compiled from: AudioVoiceoverStubTrackDrawDelegate.kt */
/* loaded from: classes18.dex */
public final class xz4 extends jfp0 {
    public final oy4 A;
    public final zz4 B;
    public final gz4 C;
    public final LinearGradient D;
    public final Matrix E;
    public final Paint F;
    public final RectF G;

    public xz4(oy4 oy4Var, mwo0 mwo0Var, zz4 zz4Var) {
        super(mwo0Var, oy4Var.k);
        this.A = oy4Var;
        this.B = zz4Var;
        this.C = new gz4();
        LinearGradient a = gz4.a(oy4Var.l, oy4Var.m);
        this.D = a;
        this.E = new Matrix();
        Paint paint = new Paint(1);
        paint.setStrokeWidth(fz4.L);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShader(a);
        this.F = paint;
        this.G = new RectF();
    }

    @Override // xsna.jfp0, xsna.yc6
    public final void b() {
        super.b();
        this.C.getClass();
        RectF rectF = this.d;
        float width = rectF.width();
        RectF rectF2 = this.G;
        rectF2.right = width;
        float f = fz4.M;
        if (f <= width) {
            width = f;
        }
        rectF2.left = width;
        rectF2.top = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        rectF2.bottom = rectF.height();
    }

    @Override // xsna.yc6
    public final boolean c() {
        swo0 swo0Var = this.b.l;
        return (swo0Var instanceof swo0.c) && ((swo0.c) swo0Var).b;
    }

    @Override // xsna.jfp0
    public final void g() {
        super.g();
        this.B.b(this.A);
    }

    @Override // xsna.jfp0
    public final void h(Canvas canvas) {
        oy4 e;
        ywo0 ywo0Var = this.b;
        swo0 swo0Var = ywo0Var.l;
        if ((swo0Var instanceof swo0.c) && ((swo0.c) swo0Var).b && (e = ywo0Var.e()) != null) {
            RectF rectF = e.v;
            RectF rectF2 = this.d;
            rectF2.set(rectF);
            RectF rectF3 = this.G;
            yz4 a = this.B.a(e);
            if (a != null) {
                float d = ywo0Var.r.d(e.f);
                this.C.getClass();
                gz4.b(rectF2, d, this.E, this.D);
                int save = canvas.save();
                try {
                    if (!rectF3.isEmpty()) {
                        canvas.clipRect(rectF3);
                        canvas.translate(-d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        canvas.drawLines(a.b(), 0, a.a(), this.F);
                    }
                } finally {
                    canvas.restoreToCount(save);
                }
            }
            super.h(canvas);
        }
    }
}
