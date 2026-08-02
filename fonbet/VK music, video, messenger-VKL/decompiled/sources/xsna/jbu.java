package xsna;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: GradientStrokeContent.java */
/* loaded from: classes12.dex */
public final class jbu extends ro6 {

    @Nullable
    public pjr0 A;
    public final String q;
    public final boolean r;
    public final x500<LinearGradient> s;
    public final x500<RadialGradient> t;
    public final RectF u;
    public final GradientType v;
    public final int w;
    public final cbu x;
    public final llb0 y;
    public final llb0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jbu(k800 k800Var, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.a aVar2) {
        super(k800Var, aVar, r3, r0 != 1 ? r0 != 2 ? r0 != 3 ? null : Paint.Join.ROUND : Paint.Join.MITER : Paint.Join.BEVEL, aVar2.j, aVar2.d, aVar2.g, aVar2.k, aVar2.l);
        ShapeStroke.LineCapType lineCapType = aVar2.h;
        lineCapType.getClass();
        int i = ShapeStroke.a.a[lineCapType.ordinal()];
        Paint.Cap cap = i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        ShapeStroke.LineJoinType lineJoinType = aVar2.i;
        lineJoinType.getClass();
        int i2 = ShapeStroke.a.b[lineJoinType.ordinal()];
        this.s = new x500<>();
        this.t = new x500<>();
        this.u = new RectF();
        this.q = aVar2.a;
        this.v = aVar2.b;
        this.r = aVar2.m;
        this.w = (int) (k800Var.b.b() / 32.0f);
        tf6<abu, abu> j = aVar2.c.j();
        this.x = (cbu) j;
        j.a(this);
        aVar.h(j);
        tf6<PointF, PointF> j2 = aVar2.e.j();
        this.y = (llb0) j2;
        j2.a(this);
        aVar.h(j2);
        tf6<PointF, PointF> j3 = aVar2.f.j();
        this.z = (llb0) j3;
        j3.a(this);
        aVar.h(j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ro6, xsna.plo
    public final void e(Canvas canvas, Matrix matrix, int i, com.airbnb.lottie.utils.a aVar) {
        Shader shader;
        Shader radialGradient;
        if (this.r) {
            return;
        }
        g(this.u, matrix, false);
        GradientType gradientType = this.v;
        GradientType gradientType2 = GradientType.LINEAR;
        cbu cbuVar = this.x;
        llb0 llb0Var = this.z;
        llb0 llb0Var2 = this.y;
        if (gradientType == gradientType2) {
            long j = j();
            x500<LinearGradient> x500Var = this.s;
            shader = (LinearGradient) x500Var.get(j);
            if (shader == null) {
                PointF f = llb0Var2.f();
                PointF f2 = llb0Var.f();
                abu f3 = cbuVar.f();
                radialGradient = new LinearGradient(f.x, f.y, f2.x, f2.y, h(f3.b), f3.a, Shader.TileMode.CLAMP);
                x500Var.put(j, radialGradient);
                shader = radialGradient;
            }
            this.i.setShader(shader);
            super.e(canvas, matrix, i, aVar);
        }
        long j2 = j();
        x500<RadialGradient> x500Var2 = this.t;
        shader = (RadialGradient) x500Var2.get(j2);
        if (shader == null) {
            PointF f4 = llb0Var2.f();
            PointF f5 = llb0Var.f();
            abu f6 = cbuVar.f();
            int[] h = h(f6.b);
            float[] fArr = f6.a;
            radialGradient = new RadialGradient(f4.x, f4.y, (float) Math.hypot(f5.x - r10, f5.y - r11), h, fArr, Shader.TileMode.CLAMP);
            x500Var2.put(j2, radialGradient);
            shader = radialGradient;
        }
        this.i.setShader(shader);
        super.e(canvas, matrix, i, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ro6, xsna.vdy
    public final <T> void f(T t, @Nullable a900<T> a900Var) {
        super.f(t, a900Var);
        if (t == t800.J) {
            pjr0 pjr0Var = this.A;
            com.airbnb.lottie.model.layer.a aVar = this.f;
            if (pjr0Var != null) {
                aVar.o(pjr0Var);
            }
            if (a900Var == null) {
                this.A = null;
                return;
            }
            pjr0 pjr0Var2 = new pjr0(null, a900Var);
            this.A = pjr0Var2;
            pjr0Var2.a(this);
            aVar.h(this.A);
        }
    }

    @Override // xsna.gfj
    public final String getName() {
        return this.q;
    }

    public final int[] h(int[] iArr) {
        pjr0 pjr0Var = this.A;
        if (pjr0Var != null) {
            Integer[] numArr = (Integer[]) pjr0Var.f();
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

    public final int j() {
        float f = this.y.d;
        float f2 = this.w;
        int round = Math.round(f * f2);
        int round2 = Math.round(this.z.d * f2);
        int round3 = Math.round(this.x.d * f2);
        int i = round != 0 ? IronSourceError.ERROR_NON_EXISTENT_INSTANCE * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }
}
