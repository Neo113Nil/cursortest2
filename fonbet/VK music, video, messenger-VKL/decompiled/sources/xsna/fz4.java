package xsna;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AudioTrackDrawDelegate.kt */
/* loaded from: classes18.dex */
public final class fz4 extends jfp0 {
    public static final float I = dn70.a() * 4.0f;
    public static final float J = dn70.a() * 2.0f;
    public static final float K = dn70.a() * 4.0f;
    public static final float L = dn70.a() * 2.0f;
    public static final float M = (hip0.b + hip0.a) + dn70.b(4);
    public oy4 A;
    public final g05 B;
    public final gz4 C;
    public final LinearGradient D;
    public final Matrix E;
    public final Paint F;
    public final dkk0 G;
    public final RectF H;

    public fz4(oy4 oy4Var, mwo0 mwo0Var, g05 g05Var) {
        super(mwo0Var, oy4Var.k);
        this.A = oy4Var;
        this.B = g05Var;
        this.C = new gz4();
        LinearGradient a = gz4.a(oy4Var.l, oy4Var.m);
        this.D = a;
        this.E = new Matrix();
        Paint paint = new Paint(1);
        paint.setStrokeWidth(L);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShader(a);
        this.F = paint;
        this.G = new dkk0(mwo0Var);
        this.H = new RectF();
    }

    @Override // xsna.jfp0, xsna.yc6
    public final void b() {
        super.b();
        this.C.getClass();
        RectF rectF = this.d;
        float width = rectF.width();
        RectF rectF2 = this.H;
        rectF2.right = width;
        float f = M;
        if (f <= width) {
            width = f;
        }
        rectF2.left = width;
        rectF2.top = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        rectF2.bottom = rectF.height();
    }

    @Override // xsna.yc6
    public final boolean c() {
        String str = this.A.a;
        return !epx.f(str, this.b.e() != null ? r1.a : null);
    }

    @Override // xsna.jfp0
    public final void g() {
        super.g();
        this.B.b(this.A);
    }

    @Override // xsna.jfp0
    public final void h(Canvas canvas) {
        oy4 oy4Var = this.A;
        RectF rectF = this.H;
        b05 a = this.B.a(oy4Var);
        ywo0 ywo0Var = this.b;
        if (a != null) {
            float f = oy4Var.b;
            float f2 = oy4Var.t;
            a.c((long) (f * f2), (long) (oy4Var.c * f2), ywo0Var.r.d / f2);
            float d = ywo0Var.r.d(oy4Var.b);
            this.C.getClass();
            gz4.b(this.d, d, this.E, this.D);
            int save = canvas.save();
            try {
                if (!rectF.isEmpty()) {
                    canvas.clipRect(rectF);
                    canvas.translate(-d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    canvas.drawLines(a.c, 0, a.d, this.F);
                }
            } finally {
                canvas.restoreToCount(save);
            }
        }
        super.h(canvas);
        gp6 gp6Var = ywo0Var.j;
        if (epx.f(gp6Var != null ? gp6Var.m() : null, this.A.a)) {
            return;
        }
        this.G.a(canvas, this.A.t, new RectF(canvas.getClipBounds()), i().d.right, i().d.centerY());
    }
}
