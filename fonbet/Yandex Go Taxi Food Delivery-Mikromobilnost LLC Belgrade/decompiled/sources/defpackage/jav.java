package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.utils.OffscreenLayer;
import com.airbnb.lottie.utils.a;

/* loaded from: classes.dex */
public final class jav extends l35 {
    public final LPaint C;
    public final Rect D;
    public final Rect E;
    public final RectF F;
    public final wtz G;
    public e131 H;
    public e131 I;
    public final bnm J;
    public OffscreenLayer K;
    public OffscreenLayer.a L;

    public jav(LottieDrawable lottieDrawable, mxx mxxVar) {
        super(lottieDrawable, mxxVar);
        this.C = new LPaint(3);
        this.D = new Rect();
        this.E = new Rect();
        this.F = new RectF();
        this.G = lottieDrawable.getLottieImageAssetForId(mxxVar.g);
        oo2 oo2Var = this.p.x;
        if (oo2Var != null) {
            this.J = new bnm(this, this, oo2Var);
        }
    }

    @Override // defpackage.l35, defpackage.ccm
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        super.b(rectF, matrix, z);
        wtz wtzVar = this.G;
        if (wtzVar != null) {
            int i = wtzVar.b;
            int i2 = wtzVar.a;
            float c = zw21.c();
            if (this.o.getMaintainOriginalImageBounds()) {
                rectF.set(0.0f, 0.0f, i2 * c, i * c);
            } else {
                if (q() != null) {
                    rectF.set(0.0f, 0.0f, r1.getWidth() * c, r1.getHeight() * c);
                } else {
                    rectF.set(0.0f, 0.0f, i2 * c, i * c);
                }
            }
            this.n.mapRect(rectF);
        }
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
        if (obj == cuz.L) {
            if (puzVar == null) {
                this.I = null;
                return;
            } else {
                this.I = new e131(puzVar, null);
                return;
            }
        }
        bnm bnmVar = this.J;
        if (obj == 5 && bnmVar != null) {
            bnmVar.b(puzVar);
            return;
        }
        if (obj == cuz.E && bnmVar != null) {
            bnmVar.f(puzVar);
            return;
        }
        if (obj == cuz.F && bnmVar != null) {
            bnmVar.c(puzVar);
            return;
        }
        if (obj == cuz.G && bnmVar != null) {
            bnmVar.e(puzVar);
        } else {
            if (obj != cuz.H || bnmVar == null) {
                return;
            }
            bnmVar.g(puzVar);
        }
    }

    @Override // defpackage.l35
    public final void i(Canvas canvas, Matrix matrix, int i, a aVar) {
        wtz wtzVar;
        Bitmap q = q();
        if (q == null || q.isRecycled() || (wtzVar = this.G) == null) {
            return;
        }
        float c = zw21.c();
        LPaint lPaint = this.C;
        lPaint.setAlpha(i);
        e131 e131Var = this.H;
        if (e131Var != null) {
            lPaint.setColorFilter((ColorFilter) e131Var.f());
        }
        bnm bnmVar = this.J;
        if (bnmVar != null) {
            aVar = bnmVar.a(matrix, i);
        }
        int width = q.getWidth();
        int height = q.getHeight();
        Rect rect = this.D;
        rect.set(0, 0, width, height);
        boolean maintainOriginalImageBounds = this.o.getMaintainOriginalImageBounds();
        Rect rect2 = this.E;
        if (maintainOriginalImageBounds) {
            rect2.set(0, 0, (int) (wtzVar.a * c), (int) (wtzVar.b * c));
        } else {
            rect2.set(0, 0, (int) (q.getWidth() * c), (int) (q.getHeight() * c));
        }
        boolean z = aVar != null;
        if (z) {
            if (this.K == null) {
                this.K = new OffscreenLayer();
            }
            if (this.L == null) {
                this.L = new OffscreenLayer.a();
            }
            OffscreenLayer.a aVar2 = this.L;
            aVar2.a = 255;
            aVar2.b = null;
            aVar.getClass();
            a aVar3 = new a(aVar);
            aVar2.b = aVar3;
            aVar3.b(i);
            float f = rect2.left;
            float f2 = rect2.top;
            float f3 = rect2.right;
            float f4 = rect2.bottom;
            RectF rectF = this.F;
            rectF.set(f, f2, f3, f4);
            matrix.mapRect(rectF);
            canvas = this.K.e(canvas, rectF, this.L);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(q, rect, rect2, lPaint);
        if (z) {
            this.K.c();
            if (this.K.c == OffscreenLayer.RenderStrategy.RENDER_NODE) {
                return;
            }
        }
        canvas.restore();
    }

    public final Bitmap q() {
        Bitmap bitmap;
        e131 e131Var = this.I;
        if (e131Var != null && (bitmap = (Bitmap) e131Var.f()) != null) {
            return bitmap;
        }
        Bitmap bitmapForId = this.o.getBitmapForId(this.p.g);
        if (bitmapForId != null) {
            return bitmapForId;
        }
        wtz wtzVar = this.G;
        if (wtzVar != null) {
            return wtzVar.f;
        }
        return null;
    }
}
