package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.utils.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j3r implements ccm, e35, uix {
    public final Path a;
    public final LPaint b;
    public final l35 c;
    public final String d;
    public final boolean e;
    public final ArrayList f;
    public final lfc g;
    public final lfc h;
    public e131 i;
    public final LottieDrawable j;
    public i35 k;
    public float l;

    public j3r(LottieDrawable lottieDrawable, l35 l35Var, ohr0 ohr0Var) {
        Path path = new Path();
        this.a = path;
        this.b = new LPaint(1);
        this.f = new ArrayList();
        this.c = l35Var;
        String str = ohr0Var.c;
        ae2 ae2Var = ohr0Var.e;
        ae2 ae2Var2 = ohr0Var.d;
        this.d = str;
        this.e = ohr0Var.f;
        this.j = lottieDrawable;
        if (l35Var.j() != null) {
            kor I = ((be2) l35Var.j().b).I();
            this.k = I;
            I.a(this);
            l35Var.c(this.k);
        }
        if (ae2Var2 == null) {
            this.g = null;
            this.h = null;
            return;
        }
        path.setFillType(ohr0Var.b);
        i35 I2 = ae2Var2.I();
        this.g = (lfc) I2;
        I2.a(this);
        l35Var.c(I2);
        i35 I3 = ae2Var.I();
        this.h = (lfc) I3;
        I3.a(this);
        l35Var.c(I3);
    }

    @Override // defpackage.tix
    public final void a(six sixVar, int i, ArrayList arrayList, six sixVar2) {
        ti20.g(sixVar, i, arrayList, sixVar2, this);
    }

    @Override // defpackage.ccm
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((vq90) arrayList.get(i)).getPath(), matrix);
                i++;
            }
        }
    }

    @Override // defpackage.e35
    public final void d() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.uee
    public final void e(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            uee ueeVar = (uee) list2.get(i);
            if (ueeVar instanceof vq90) {
                this.f.add((vq90) ueeVar);
            }
        }
    }

    @Override // defpackage.ccm
    public final void f(Canvas canvas, Matrix matrix, int i, a aVar) {
        BlurMaskFilter blurMaskFilter;
        if (this.e) {
            return;
        }
        AsyncUpdates asyncUpdates = upx.a;
        lfc lfcVar = this.g;
        float intValue = ((Integer) this.h.f()).intValue() / 100.0f;
        int c = (ti20.c((int) (i * intValue)) << 24) | (lfcVar.m(lfcVar.b(), lfcVar.d()) & 16777215);
        LPaint lPaint = this.b;
        lPaint.setColor(c);
        e131 e131Var = this.i;
        if (e131Var != null) {
            lPaint.setColorFilter((ColorFilter) e131Var.f());
        }
        i35 i35Var = this.k;
        if (i35Var != null) {
            float floatValue = ((Float) i35Var.f()).floatValue();
            if (floatValue == 0.0f) {
                lPaint.setMaskFilter(null);
            } else if (floatValue != this.l) {
                l35 l35Var = this.c;
                if (l35Var.A == floatValue) {
                    blurMaskFilter = l35Var.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    l35Var.B = blurMaskFilter2;
                    l35Var.A = floatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                lPaint.setMaskFilter(blurMaskFilter);
            }
            this.l = floatValue;
        }
        if (aVar != null) {
            aVar.a((int) (intValue * 255.0f), lPaint);
        } else {
            lPaint.clearShadowLayer();
        }
        Path path = this.a;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i2 >= arrayList.size()) {
                canvas.drawPath(path, lPaint);
                AsyncUpdates asyncUpdates2 = upx.a;
                return;
            } else {
                path.addPath(((vq90) arrayList.get(i2)).getPath(), matrix);
                i2++;
            }
        }
    }

    @Override // defpackage.tix
    public final void g(puz puzVar, Object obj) {
        PointF pointF = cuz.a;
        if (obj == 1) {
            this.g.k(puzVar);
            return;
        }
        if (obj == 4) {
            this.h.k(puzVar);
            return;
        }
        ColorFilter colorFilter = cuz.I;
        l35 l35Var = this.c;
        if (obj == colorFilter) {
            e131 e131Var = this.i;
            if (e131Var != null) {
                l35Var.m(e131Var);
            }
            if (puzVar == null) {
                this.i = null;
                return;
            }
            e131 e131Var2 = new e131(puzVar, null);
            this.i = e131Var2;
            e131Var2.a(this);
            l35Var.c(this.i);
            return;
        }
        if (obj == cuz.e) {
            i35 i35Var = this.k;
            if (i35Var != null) {
                i35Var.k(puzVar);
                return;
            }
            e131 e131Var3 = new e131(puzVar, null);
            this.k = e131Var3;
            e131Var3.a(this);
            l35Var.c(this.k);
        }
    }

    @Override // defpackage.uee
    public final String getName() {
        return this.d;
    }
}
