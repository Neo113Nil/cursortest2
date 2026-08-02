package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.utils.a;

/* loaded from: classes10.dex */
public final class c6t0 extends l35 {
    public final RectF C;
    public final LPaint D;
    public final float[] E;
    public final Path F;
    public final mxx G;
    public e131 H;
    public e131 I;

    public c6t0(LottieDrawable lottieDrawable, mxx mxxVar) {
        super(lottieDrawable, mxxVar);
        this.C = new RectF();
        LPaint lPaint = new LPaint();
        this.D = lPaint;
        this.E = new float[8];
        this.F = new Path();
        this.G = mxxVar;
        lPaint.setAlpha(0);
        lPaint.setStyle(Paint.Style.FILL);
        lPaint.setColor(mxxVar.l);
    }

    @Override // defpackage.l35, defpackage.ccm
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        super.b(rectF, matrix, z);
        mxx mxxVar = this.G;
        float f = mxxVar.j;
        float f2 = mxxVar.k;
        RectF rectF2 = this.C;
        rectF2.set(0.0f, 0.0f, f, f2);
        this.n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // defpackage.l35, defpackage.tix
    public final void g(puz puzVar, Object obj) {
        super.g(puzVar, obj);
        if (obj == cuz.I) {
            if (puzVar == null) {
                this.H = null;
                return;
            } else {
                this.H = new e131(puzVar, null);
                return;
            }
        }
        if (obj == 1) {
            if (puzVar != null) {
                this.I = new e131(puzVar, null);
                return;
            }
            this.I = null;
            this.D.setColor(this.G.l);
        }
    }

    @Override // defpackage.l35
    public final void i(Canvas canvas, Matrix matrix, int i, a aVar) {
        mxx mxxVar = this.G;
        int alpha = Color.alpha(mxxVar.l);
        if (alpha == 0) {
            return;
        }
        e131 e131Var = this.I;
        Integer num = e131Var == null ? null : (Integer) e131Var.f();
        LPaint lPaint = this.D;
        if (num != null) {
            lPaint.setColor(num.intValue());
        } else {
            lPaint.setColor(mxxVar.l);
        }
        int intValue = (int) ((((alpha / 255.0f) * (this.w.p == null ? 100 : ((Integer) r2.f()).intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        lPaint.setAlpha(intValue);
        if (aVar == null) {
            lPaint.clearShadowLayer();
        } else if (Color.alpha(aVar.d) > 0) {
            lPaint.setShadowLayer(Math.max(aVar.a, Float.MIN_VALUE), aVar.b, aVar.c, aVar.d);
        } else {
            lPaint.clearShadowLayer();
        }
        e131 e131Var2 = this.H;
        if (e131Var2 != null) {
            lPaint.setColorFilter((ColorFilter) e131Var2.f());
        }
        if (intValue > 0) {
            float[] fArr = this.E;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = mxxVar.j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = mxxVar.k;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.F;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, lPaint);
        }
    }
}
