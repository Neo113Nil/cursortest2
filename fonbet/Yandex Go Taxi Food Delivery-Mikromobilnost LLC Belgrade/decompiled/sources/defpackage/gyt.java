package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.utils.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class gyt implements ccm, e35, uix {
    public final String a;
    public final boolean b;
    public final l35 c;
    public final rnz d = new rnz();
    public final rnz e = new rnz();
    public final Path f;
    public final LPaint g;
    public final RectF h;
    public final ArrayList i;
    public final GradientType j;
    public final fxt k;
    public final lfc l;
    public final qud0 m;
    public final qud0 n;
    public e131 o;
    public e131 p;
    public final LottieDrawable q;
    public final int r;
    public i35 s;
    public float t;

    public gyt(LottieDrawable lottieDrawable, nsz nszVar, l35 l35Var, fyt fytVar) {
        Path path = new Path();
        this.f = path;
        this.g = new LPaint(1);
        this.h = new RectF();
        this.i = new ArrayList();
        this.t = 0.0f;
        this.c = l35Var;
        this.a = fytVar.g;
        this.b = fytVar.h;
        this.q = lottieDrawable;
        this.j = fytVar.a;
        path.setFillType(fytVar.b);
        this.r = (int) (nszVar.b() / 32.0f);
        i35 I = fytVar.c.I();
        this.k = (fxt) I;
        I.a(this);
        l35Var.c(I);
        i35 I2 = fytVar.d.I();
        this.l = (lfc) I2;
        I2.a(this);
        l35Var.c(I2);
        i35 I3 = fytVar.e.I();
        this.m = (qud0) I3;
        I3.a(this);
        l35Var.c(I3);
        i35 I4 = fytVar.f.I();
        this.n = (qud0) I4;
        I4.a(this);
        l35Var.c(I4);
        if (l35Var.j() != null) {
            kor I5 = ((be2) l35Var.j().b).I();
            this.s = I5;
            I5.a(this);
            l35Var.c(this.s);
        }
    }

    @Override // defpackage.tix
    public final void a(six sixVar, int i, ArrayList arrayList, six sixVar2) {
        ti20.g(sixVar, i, arrayList, sixVar2, this);
    }

    @Override // defpackage.ccm
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
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

    public final int[] c(int[] iArr) {
        e131 e131Var = this.p;
        if (e131Var != null) {
            Integer[] numArr = (Integer[]) e131Var.f();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.e35
    public final void d() {
        this.q.invalidateSelf();
    }

    @Override // defpackage.uee
    public final void e(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            uee ueeVar = (uee) list2.get(i);
            if (ueeVar instanceof vq90) {
                this.i.add((vq90) ueeVar);
            }
        }
    }

    @Override // defpackage.ccm
    public final void f(Canvas canvas, Matrix matrix, int i, a aVar) {
        float[] fArr;
        int[] iArr;
        Shader shader;
        int[] iArr2;
        if (this.b) {
            return;
        }
        AsyncUpdates asyncUpdates = upx.a;
        Path path = this.f;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((vq90) arrayList.get(i2)).getPath(), matrix);
            i2++;
        }
        path.computeBounds(this.h, false);
        GradientType gradientType = this.j;
        GradientType gradientType2 = GradientType.LINEAR;
        fxt fxtVar = this.k;
        qud0 qud0Var = this.n;
        qud0 qud0Var2 = this.m;
        if (gradientType == gradientType2) {
            long h = h();
            rnz rnzVar = this.d;
            shader = (LinearGradient) rnzVar.c(h);
            if (shader == null) {
                PointF pointF = (PointF) qud0Var2.f();
                PointF pointF2 = (PointF) qud0Var.f();
                ext extVar = (ext) fxtVar.f();
                int[] c = c(extVar.b);
                float[] fArr2 = extVar.a;
                if (c.length < 2) {
                    fArr2 = new float[]{0.0f, 1.0f};
                    iArr2 = new int[]{c[0], c[0]};
                } else {
                    iArr2 = c;
                }
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                rnzVar.h(h, shader);
            }
        } else {
            long h2 = h();
            rnz rnzVar2 = this.e;
            RadialGradient radialGradient = (RadialGradient) rnzVar2.c(h2);
            if (radialGradient != null) {
                shader = radialGradient;
            } else {
                PointF pointF3 = (PointF) qud0Var2.f();
                PointF pointF4 = (PointF) qud0Var.f();
                ext extVar2 = (ext) fxtVar.f();
                int[] c2 = c(extVar2.b);
                float[] fArr3 = extVar2.a;
                if (c2.length < 2) {
                    iArr = new int[]{c2[0], c2[0]};
                    fArr = new float[]{0.0f, 1.0f};
                } else {
                    fArr = fArr3;
                    iArr = c2;
                }
                float f = pointF3.x;
                float f2 = pointF3.y;
                float hypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f2);
                if (hypot <= 0.0f) {
                    hypot = 0.001f;
                }
                RadialGradient radialGradient2 = new RadialGradient(f, f2, hypot, iArr, fArr, Shader.TileMode.CLAMP);
                rnzVar2.h(h2, radialGradient2);
                shader = radialGradient2;
            }
        }
        shader.setLocalMatrix(matrix);
        LPaint lPaint = this.g;
        lPaint.setShader(shader);
        e131 e131Var = this.o;
        if (e131Var != null) {
            lPaint.setColorFilter((ColorFilter) e131Var.f());
        }
        i35 i35Var = this.s;
        if (i35Var != null) {
            float floatValue = ((Float) i35Var.f()).floatValue();
            if (floatValue == 0.0f) {
                lPaint.setMaskFilter(null);
            } else if (floatValue != this.t) {
                lPaint.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.t = floatValue;
        }
        float intValue = ((Integer) this.l.f()).intValue() / 100.0f;
        lPaint.setAlpha(ti20.c((int) (i * intValue)));
        if (aVar != null) {
            aVar.a((int) (intValue * 255.0f), lPaint);
        }
        canvas.drawPath(path, lPaint);
        AsyncUpdates asyncUpdates2 = upx.a;
    }

    @Override // defpackage.tix
    public final void g(puz puzVar, Object obj) {
        PointF pointF = cuz.a;
        if (obj == 4) {
            this.l.k(puzVar);
            return;
        }
        ColorFilter colorFilter = cuz.I;
        l35 l35Var = this.c;
        if (obj == colorFilter) {
            e131 e131Var = this.o;
            if (e131Var != null) {
                l35Var.m(e131Var);
            }
            if (puzVar == null) {
                this.o = null;
                return;
            }
            e131 e131Var2 = new e131(puzVar, null);
            this.o = e131Var2;
            e131Var2.a(this);
            l35Var.c(this.o);
            return;
        }
        if (obj != cuz.J) {
            if (obj == cuz.e) {
                i35 i35Var = this.s;
                if (i35Var != null) {
                    i35Var.k(puzVar);
                    return;
                }
                e131 e131Var3 = new e131(puzVar, null);
                this.s = e131Var3;
                e131Var3.a(this);
                l35Var.c(this.s);
                return;
            }
            return;
        }
        e131 e131Var4 = this.p;
        if (e131Var4 != null) {
            l35Var.m(e131Var4);
        }
        if (puzVar == null) {
            this.p = null;
            return;
        }
        this.d.clear();
        this.e.clear();
        e131 e131Var5 = new e131(puzVar, null);
        this.p = e131Var5;
        e131Var5.a(this);
        l35Var.c(this.p);
    }

    @Override // defpackage.uee
    public final String getName() {
        return this.a;
    }

    public final int h() {
        float f = this.m.d;
        float f2 = this.r;
        int round = Math.round(f * f2);
        int round2 = Math.round(this.n.d * f2);
        int round3 = Math.round(this.k.d * f2);
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }
}
