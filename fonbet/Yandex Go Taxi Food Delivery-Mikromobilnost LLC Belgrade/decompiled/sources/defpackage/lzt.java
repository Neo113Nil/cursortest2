package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke$LineCapType;
import com.airbnb.lottie.model.content.ShapeStroke$LineJoinType;
import com.airbnb.lottie.utils.a;

/* loaded from: classes10.dex */
public final class lzt extends ra5 {
    public e131 A;
    public final String q;
    public final boolean r;
    public final rnz s;
    public final rnz t;
    public final RectF u;
    public final GradientType v;
    public final int w;
    public final fxt x;
    public final qud0 y;
    public final qud0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lzt(LottieDrawable lottieDrawable, l35 l35Var, kzt kztVar) {
        super(lottieDrawable, l35Var, r3, r0 != 1 ? r0 != 2 ? r0 != 3 ? null : Paint.Join.ROUND : Paint.Join.MITER : Paint.Join.BEVEL, kztVar.j, kztVar.d, kztVar.g, kztVar.k, kztVar.l);
        ShapeStroke$LineCapType shapeStroke$LineCapType = kztVar.h;
        shapeStroke$LineCapType.getClass();
        int i = pir0.a[shapeStroke$LineCapType.ordinal()];
        Paint.Cap cap = i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        ShapeStroke$LineJoinType shapeStroke$LineJoinType = kztVar.i;
        shapeStroke$LineJoinType.getClass();
        int i2 = pir0.b[shapeStroke$LineJoinType.ordinal()];
        this.s = new rnz();
        this.t = new rnz();
        this.u = new RectF();
        this.q = kztVar.a;
        this.v = kztVar.b;
        this.r = kztVar.m;
        this.w = (int) (lottieDrawable.getComposition().b() / 32.0f);
        i35 I = kztVar.c.I();
        this.x = (fxt) I;
        I.a(this);
        l35Var.c(I);
        i35 I2 = kztVar.e.I();
        this.y = (qud0) I2;
        I2.a(this);
        l35Var.c(I2);
        i35 I3 = kztVar.f.I();
        this.z = (qud0) I3;
        I3.a(this);
        l35Var.c(I3);
    }

    public final int[] c(int[] iArr) {
        e131 e131Var = this.A;
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

    @Override // defpackage.ra5, defpackage.ccm
    public final void f(Canvas canvas, Matrix matrix, int i, a aVar) {
        Shader shader;
        Shader radialGradient;
        if (this.r) {
            return;
        }
        b(this.u, matrix, false);
        GradientType gradientType = this.v;
        GradientType gradientType2 = GradientType.LINEAR;
        fxt fxtVar = this.x;
        qud0 qud0Var = this.z;
        qud0 qud0Var2 = this.y;
        if (gradientType == gradientType2) {
            long h = h();
            rnz rnzVar = this.s;
            shader = (LinearGradient) rnzVar.c(h);
            if (shader == null) {
                PointF pointF = (PointF) qud0Var2.f();
                PointF pointF2 = (PointF) qud0Var.f();
                ext extVar = (ext) fxtVar.f();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, c(extVar.b), extVar.a, Shader.TileMode.CLAMP);
                rnzVar.h(h, radialGradient);
                shader = radialGradient;
            }
            this.i.setShader(shader);
            super.f(canvas, matrix, i, aVar);
        }
        long h2 = h();
        rnz rnzVar2 = this.t;
        shader = (RadialGradient) rnzVar2.c(h2);
        if (shader == null) {
            PointF pointF3 = (PointF) qud0Var2.f();
            PointF pointF4 = (PointF) qud0Var.f();
            ext extVar2 = (ext) fxtVar.f();
            int[] c = c(extVar2.b);
            float[] fArr = extVar2.a;
            radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), c, fArr, Shader.TileMode.CLAMP);
            rnzVar2.h(h2, radialGradient);
            shader = radialGradient;
        }
        this.i.setShader(shader);
        super.f(canvas, matrix, i, aVar);
    }

    @Override // defpackage.ra5, defpackage.tix
    public final void g(puz puzVar, Object obj) {
        super.g(puzVar, obj);
        if (obj == cuz.J) {
            e131 e131Var = this.A;
            l35 l35Var = this.f;
            if (e131Var != null) {
                l35Var.m(e131Var);
            }
            if (puzVar == null) {
                this.A = null;
                return;
            }
            e131 e131Var2 = new e131(puzVar, null);
            this.A = e131Var2;
            e131Var2.a(this);
            l35Var.c(this.A);
        }
    }

    @Override // defpackage.uee
    public final String getName() {
        return this.q;
    }

    public final int h() {
        float f = this.y.d;
        float f2 = this.w;
        int round = Math.round(f * f2);
        int round2 = Math.round(this.z.d * f2);
        int round3 = Math.round(this.x.d * f2);
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }
}
