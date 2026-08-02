package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class avb extends fcm {
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public boolean n;
    public float o;
    public final RectF p;
    public final Pair q;

    public avb(pvb pvbVar) {
        super(pvbVar);
        this.p = new RectF();
        this.q = new Pair(new ecm(), new ecm());
    }

    @Override // defpackage.fcm
    public final void a(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        float width = rect.width() / k();
        float height = rect.height() / k();
        pvb pvbVar = (pvb) this.a;
        float f2 = (pvbVar.r / 2.0f) + pvbVar.s;
        canvas.translate((f2 * width) + rect.left, (f2 * height) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(width, height);
        if (pvbVar.t != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        this.f = pvbVar.a * f;
        this.g = Math.min(r9 / 2, pvbVar.a()) * f;
        this.h = pvbVar.l * f;
        int i = pvbVar.r;
        int i2 = pvbVar.a;
        float f4 = (i - i2) / 2.0f;
        this.i = f4;
        if (z || z2) {
            float f5 = ((1.0f - f) * i2) / 2.0f;
            if ((z && pvbVar.g == 2) || (z2 && pvbVar.h == 1)) {
                this.i = f4 + f5;
            } else if ((z && pvbVar.g == 1) || (z2 && pvbVar.h == 2)) {
                this.i = f4 - f5;
            }
        }
        if (z2 && pvbVar.h == 3) {
            this.o = f;
        } else {
            this.o = 1.0f;
        }
    }

    @Override // defpackage.fcm
    public final void b(int i, int i2, Canvas canvas, Paint paint) {
    }

    @Override // defpackage.fcm
    public final void c(Canvas canvas, Paint paint, dcm dcmVar, int i) {
        int d = vez0.d(dcmVar.c, i);
        canvas.save();
        canvas.rotate(dcmVar.g);
        this.n = dcmVar.h;
        float f = dcmVar.a;
        float f2 = dcmVar.b;
        int i2 = dcmVar.d;
        i(canvas, paint, f, f2, d, i2, i2, dcmVar.e, dcmVar.f, true);
        canvas.restore();
    }

    @Override // defpackage.fcm
    public final void d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int d = vez0.d(i, i2);
        this.n = false;
        i(canvas, paint, f, f2, d, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // defpackage.fcm
    public final int e() {
        return k();
    }

    @Override // defpackage.fcm
    public final int f() {
        return k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcm
    public final void g() {
        int i;
        Path path = this.b;
        path.rewind();
        path.moveTo(1.0f, 0.0f);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = 2;
            if (i3 >= 2) {
                break;
            }
            path.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            path.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            path.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            path.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
            i3++;
        }
        Matrix matrix = this.e;
        matrix.reset();
        float f = this.i;
        matrix.setScale(f, f);
        path.transform(matrix);
        boolean b = ((pvb) this.a).b(this.n);
        PathMeasure pathMeasure = this.d;
        if (b) {
            pathMeasure.setPath(path, false);
            float f2 = this.k;
            path.rewind();
            float length = pathMeasure.getLength();
            float f3 = 2.0f;
            int max = Math.max(3, (int) ((length / (this.n ? r2.j : r2.k)) / 2.0f)) * 2;
            this.j = length / max;
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < max; i4++) {
                ecm ecmVar = new ecm();
                float f4 = i4;
                pathMeasure.getPosTan(this.j * f4, ecmVar.a, ecmVar.b);
                ecm ecmVar2 = new ecm();
                float f5 = this.j;
                pathMeasure.getPosTan((f5 / 2.0f) + (f4 * f5), ecmVar2.a, ecmVar2.b);
                arrayList.add(ecmVar);
                ecmVar2.a(f2 * 2.0f);
                arrayList.add(ecmVar2);
            }
            arrayList.add((ecm) arrayList.get(0));
            ecm ecmVar3 = (ecm) arrayList.get(0);
            float[] fArr = ecmVar3.a;
            char c = 1;
            path.moveTo(fArr[0], fArr[1]);
            int i5 = 1;
            while (i5 < arrayList.size()) {
                ecm ecmVar4 = (ecm) arrayList.get(i5);
                float f6 = (this.j / f3) * 0.48f;
                float[] fArr2 = ecmVar3.a;
                float[] fArr3 = new float[i];
                System.arraycopy(fArr2, i2, fArr3, i2, i);
                System.arraycopy(ecmVar3.b, i2, new float[i], i2, i);
                new Matrix();
                float[] fArr4 = ecmVar4.a;
                float[] fArr5 = new float[i];
                System.arraycopy(fArr4, i2, fArr5, i2, i);
                System.arraycopy(ecmVar4.b, i2, new float[i], i2, i);
                new Matrix();
                char c2 = c;
                float atan2 = (float) Math.atan2(r6[c], r6[i2]);
                double d = fArr3[i2];
                double d2 = f6;
                int i6 = i2;
                double d3 = atan2;
                fArr3[i6] = (float) ((Math.cos(d3) * d2) + d);
                fArr3[c2] = (float) ((Math.sin(d3) * d2) + fArr3[c2]);
                double d4 = -f6;
                double atan22 = (float) Math.atan2(r11[c2], r11[i6]);
                fArr5[i6] = (float) ((Math.cos(atan22) * d4) + fArr5[i6]);
                float sin = (float) ((Math.sin(atan22) * d4) + fArr5[c2]);
                fArr5[c2] = sin;
                float f7 = fArr3[i6];
                float f8 = fArr3[c2];
                float f9 = fArr5[i6];
                float[] fArr6 = ecmVar4.a;
                path.cubicTo(f7, f8, f9, sin, fArr6[i6], fArr6[c2]);
                i5++;
                ecmVar3 = ecmVar4;
                c = c2;
                i2 = i6;
                pathMeasure = pathMeasure;
                i = 2;
                f3 = 2.0f;
            }
        }
        pathMeasure.setPath(path, i2);
    }

    public final void i(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        float f6;
        Canvas canvas2;
        float f7 = f2 >= f ? f2 - f : (f2 + 1.0f) - f;
        float f8 = f % 1.0f;
        if (f8 < 0.0f) {
            f8 += 1.0f;
        }
        if (this.o < 1.0f) {
            float f9 = f8 + f7;
            if (f9 > 1.0f) {
                i(canvas, paint, f8, 1.0f, i, i2, 0, f3, f4, z);
                i(canvas, paint, 1.0f, f9, i, 0, i3, f3, f4, z);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.g / this.i);
        float f10 = f7 - 0.99f;
        if (f10 >= 0.0f) {
            float f11 = ((f10 * degrees) / 180.0f) / 0.01f;
            f7 += f11;
            if (!z) {
                f8 -= f11 / 2.0f;
            }
        }
        float H = uh6.H(1.0f - this.o, 1.0f, f8);
        float H2 = uh6.H(0.0f, this.o, f7);
        float degrees2 = (float) Math.toDegrees(i2 / this.i);
        float degrees3 = ((H2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.i));
        float f12 = (H * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        pvb pvbVar = (pvb) this.a;
        boolean z2 = pvbVar.b(this.n) && z && f3 > 0.0f;
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f);
        float f13 = this.g * 2.0f;
        float f14 = degrees * 2.0f;
        PathMeasure pathMeasure = this.d;
        if (degrees3 < f14) {
            float f15 = degrees3 / f14;
            float f16 = (degrees * f15) + f12;
            ecm ecmVar = new ecm();
            if (z2) {
                float length = (pathMeasure.getLength() * (f16 / 360.0f)) / 2.0f;
                float f17 = this.h * f3;
                float f18 = this.i;
                if (f18 != this.m || f17 != this.k) {
                    this.k = f17;
                    this.m = f18;
                    g();
                }
                pathMeasure.getPosTan(length, ecmVar.a, ecmVar.b);
            } else {
                ecmVar.c(f16 + 90.0f);
                ecmVar.a(-this.i);
            }
            paint.setStyle(Paint.Style.FILL);
            j(canvas, paint, ecmVar, f13, this.f, f15);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(pvbVar.c() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f19 = f12 + degrees;
        float f20 = degrees3 - f14;
        Pair pair = this.q;
        ((ecm) pair.first).b();
        ((ecm) pair.second).b();
        if (z2) {
            float f21 = f19 / 360.0f;
            float f22 = f20 / 360.0f;
            float f23 = this.h * f3;
            int i4 = this.n ? pvbVar.j : pvbVar.k;
            float f24 = this.i;
            if (f24 != this.m || f23 != this.k || i4 != this.l) {
                this.k = f23;
                this.l = i4;
                this.m = f24;
                g();
            }
            Path path = this.c;
            path.rewind();
            float j = sb2.j(f22, 0.0f, 1.0f);
            if (pvbVar.b(this.n)) {
                f5 = 1.0f;
                float f25 = f4 / ((float) ((this.i * 6.283185307179586d) / this.j));
                f21 += f25;
                f6 = 0.0f - (f25 * 360.0f);
            } else {
                f5 = 1.0f;
                f6 = 0.0f;
            }
            float f26 = f21 % f5;
            float length2 = (pathMeasure.getLength() * f26) / 2.0f;
            float length3 = (pathMeasure.getLength() * (f26 + j)) / 2.0f;
            pathMeasure.getSegment(length2, length3, path, true);
            ecm ecmVar2 = (ecm) pair.first;
            ecmVar2.b();
            pathMeasure.getPosTan(length2, ecmVar2.a, ecmVar2.b);
            ecm ecmVar3 = (ecm) pair.second;
            ecmVar3.b();
            pathMeasure.getPosTan(length3, ecmVar3.a, ecmVar3.b);
            Matrix matrix = this.e;
            matrix.reset();
            matrix.setRotate(f6);
            ecmVar2.c(f6);
            ecmVar3.c(f6);
            path.transform(matrix);
            canvas2 = canvas;
            canvas2.drawPath(path, paint);
        } else {
            ((ecm) pair.first).c(f19 + 90.0f);
            ((ecm) pair.first).a(-this.i);
            ((ecm) pair.second).c(f19 + f20 + 90.0f);
            ((ecm) pair.second).a(-this.i);
            float f27 = this.i;
            float f28 = -f27;
            RectF rectF = this.p;
            rectF.set(f28, f28, f27, f27);
            canvas.drawArc(rectF, f19, f20, false, paint);
            canvas2 = canvas;
        }
        if (pvbVar.c() || this.g <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        j(canvas2, paint, (ecm) pair.first, f13, this.f, 1.0f);
        j(canvas, paint, (ecm) pair.second, f13, this.f, 1.0f);
    }

    public final void j(Canvas canvas, Paint paint, ecm ecmVar, float f, float f2, float f3) {
        float min = Math.min(f2, this.f);
        float f4 = f / 2.0f;
        float min2 = Math.min(f4, (this.g * min) / this.f);
        RectF rectF = new RectF((-f) / 2.0f, (-min) / 2.0f, f4, min / 2.0f);
        canvas.save();
        float[] fArr = ecmVar.a;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(fcm.h(ecmVar.b));
        canvas.scale(f3, f3);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }

    public final int k() {
        n85 n85Var = this.a;
        return (((pvb) n85Var).s * 2) + ((pvb) n85Var).r;
    }
}
