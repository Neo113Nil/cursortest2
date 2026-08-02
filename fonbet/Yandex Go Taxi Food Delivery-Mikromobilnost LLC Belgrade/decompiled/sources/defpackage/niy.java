package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;

/* loaded from: classes11.dex */
public final class niy extends fcm {
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public boolean m;
    public float n;
    public final Pair o;

    public niy(gjy gjyVar) {
        super(gjyVar);
        this.f = 300.0f;
        this.o = new Pair(new ecm(), new ecm());
    }

    @Override // defpackage.fcm
    public final void a(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        if (this.f != rect.width()) {
            this.f = rect.width();
            g();
        }
        float e = e();
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - e) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        gjy gjyVar = (gjy) this.a;
        if (gjyVar.s) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f2 = this.f / 2.0f;
        float f3 = e / 2.0f;
        canvas.clipRect(-f2, -f3, f2, f3);
        this.g = gjyVar.a * f;
        this.h = Math.min(r0 / 2, gjyVar.a()) * f;
        this.j = gjyVar.l * f;
        this.i = Math.min(gjyVar.a / 2.0f, gjyVar.e()) * f;
        if (z || z2) {
            if ((z && gjyVar.g == 2) || (z2 && gjyVar.h == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z2 && gjyVar.h != 3)) {
                canvas.translate(0.0f, ((1.0f - f) * gjyVar.a) / 2.0f);
            }
        }
        if (z2 && gjyVar.h == 3) {
            this.n = f;
        } else {
            this.n = 1.0f;
        }
    }

    @Override // defpackage.fcm
    public final void b(int i, int i2, Canvas canvas, Paint paint) {
        int d = vez0.d(i, i2);
        this.m = false;
        gjy gjyVar = (gjy) this.a;
        int min = Math.min(gjyVar.t, gjyVar.a);
        if (min <= 0 || d == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(d);
        Integer num = gjyVar.u;
        float f = min;
        j(canvas, paint, new ecm(new float[]{(this.f / 2.0f) - (num != null ? (gjyVar.t / 2.0f) + num.floatValue() : this.g / 2.0f), 0.0f}, new float[]{1.0f, 0.0f}), f, f, (this.h * f) / this.g, null, 0.0f, 0.0f, 0.0f, false);
    }

    @Override // defpackage.fcm
    public final void c(Canvas canvas, Paint paint, dcm dcmVar, int i) {
        int d = vez0.d(dcmVar.c, i);
        this.m = dcmVar.h;
        float f = dcmVar.a;
        float f2 = dcmVar.b;
        int i2 = dcmVar.d;
        i(canvas, paint, f, f2, d, i2, i2, dcmVar.e, dcmVar.f, true);
    }

    @Override // defpackage.fcm
    public final void d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int d = vez0.d(i, i2);
        this.m = false;
        i(canvas, paint, f, f2, d, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // defpackage.fcm
    public final int e() {
        n85 n85Var = this.a;
        return (((gjy) n85Var).l * 2) + ((gjy) n85Var).a;
    }

    @Override // defpackage.fcm
    public final int f() {
        return -1;
    }

    @Override // defpackage.fcm
    public final void g() {
        Path path = this.b;
        path.rewind();
        gjy gjyVar = (gjy) this.a;
        if (gjyVar.b(this.m)) {
            int i = this.m ? gjyVar.j : gjyVar.k;
            float f = this.f;
            int i2 = (int) (f / i);
            this.k = f / i2;
            for (int i3 = 0; i3 <= i2; i3++) {
                int i4 = i3 * 2;
                float f2 = i4 + 1;
                path.cubicTo(i4 + 0.48f, 0.0f, f2 - 0.48f, 1.0f, f2, 1.0f);
                float f3 = f2 + 0.48f;
                float f4 = i4 + 2;
                path.cubicTo(f3, 1.0f, f4 - 0.48f, 0.0f, f4, 0.0f);
            }
            Matrix matrix = this.e;
            matrix.reset();
            matrix.setScale(this.k / 2.0f, -2.0f);
            matrix.postTranslate(0.0f, 1.0f);
            path.transform(matrix);
        } else {
            path.lineTo(this.f, 0.0f);
        }
        this.d.setPath(path, false);
    }

    public final void i(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        float f6;
        gjy gjyVar;
        float f7;
        Canvas canvas2;
        Pair pair;
        float j = sb2.j(f, 0.0f, 1.0f);
        float j2 = sb2.j(f2, 0.0f, 1.0f);
        float H = uh6.H(1.0f - this.n, 1.0f, j);
        float H2 = uh6.H(1.0f - this.n, 1.0f, j2);
        int j3 = (int) ((sb2.j(H, 0.0f, 0.01f) * i2) / 0.01f);
        int j4 = (int) (((1.0f - sb2.j(H2, 0.99f, 1.0f)) * i3) / 0.01f);
        float f8 = this.f;
        int i4 = (int) ((H * f8) + j3);
        int i5 = (int) ((H2 * f8) - j4);
        float f9 = this.h;
        float f10 = this.i;
        if (f9 != f10) {
            float max = Math.max(f9, f10);
            float f11 = this.f;
            float f12 = max / f11;
            f5 = uh6.H(this.h, this.i, sb2.j(i4 / f11, 0.0f, f12) / f12);
            float f13 = this.h;
            float f14 = this.i;
            float f15 = this.f;
            f6 = uh6.H(f13, f14, sb2.j((f15 - i5) / f15, 0.0f, f12) / f12);
        } else {
            f5 = f9;
            f6 = f5;
        }
        float f16 = (-this.f) / 2.0f;
        gjy gjyVar2 = (gjy) this.a;
        boolean z2 = gjyVar2.b(this.m) && z && f3 > 0.0f;
        if (i4 <= i5) {
            float f17 = i4 + f5;
            float f18 = i5 - f6;
            float f19 = f5 * 2.0f;
            float f20 = f6 * 2.0f;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.g);
            Pair pair2 = this.o;
            ((ecm) pair2.first).b();
            ((ecm) pair2.second).b();
            ((ecm) pair2.first).e(f17 + f16);
            ((ecm) pair2.second).e(f16 + f18);
            if (i4 == 0 && f18 + f6 < f17 + f5) {
                ecm ecmVar = (ecm) pair2.first;
                float f21 = this.g;
                j(canvas, paint, ecmVar, f19, f21, f5, (ecm) pair2.second, f20, f21, f6, true);
                return;
            }
            if (f17 - f5 > f18 - f6) {
                ecm ecmVar2 = (ecm) pair2.second;
                float f22 = this.g;
                j(canvas, paint, ecmVar2, f20, f22, f6, (ecm) pair2.first, f19, f22, f5, false);
                return;
            }
            float f23 = f6;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(gjyVar2.c() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z2) {
                float f24 = this.f;
                float f25 = f17 / f24;
                float f26 = f18 / f24;
                gjyVar = gjyVar2;
                int i6 = this.m ? gjyVar.j : gjyVar.k;
                if (i6 != this.l) {
                    this.l = i6;
                    g();
                }
                Path path = this.c;
                path.rewind();
                float f27 = (-this.f) / 2.0f;
                boolean b = gjyVar.b(this.m);
                if (b) {
                    float f28 = this.f;
                    float f29 = this.k;
                    float f30 = f28 / f29;
                    float f31 = f4 / f30;
                    float f32 = f30 / (f30 + 1.0f);
                    f25 = (f25 + f31) * f32;
                    f26 = (f26 + f31) * f32;
                    f27 -= f4 * f29;
                }
                PathMeasure pathMeasure = this.d;
                float length = pathMeasure.getLength() * f25;
                float length2 = pathMeasure.getLength() * f26;
                pathMeasure.getSegment(length, length2, path, true);
                ecm ecmVar3 = (ecm) pair2.first;
                ecmVar3.b();
                f7 = f19;
                pathMeasure.getPosTan(length, ecmVar3.a, ecmVar3.b);
                ecm ecmVar4 = (ecm) pair2.second;
                ecmVar4.b();
                pathMeasure.getPosTan(length2, ecmVar4.a, ecmVar4.b);
                Matrix matrix = this.e;
                matrix.reset();
                matrix.setTranslate(f27, 0.0f);
                ecmVar3.e(f27);
                ecmVar4.e(f27);
                if (b) {
                    float f33 = this.j * f3;
                    matrix.postScale(1.0f, f33);
                    ecmVar3.d(f33);
                    ecmVar4.d(f33);
                }
                path.transform(matrix);
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            } else {
                float[] fArr = ((ecm) pair2.first).a;
                float f34 = fArr[0];
                float f35 = fArr[1];
                float[] fArr2 = ((ecm) pair2.second).a;
                canvas.drawLine(f34, f35, fArr2[0], fArr2[1], paint);
                canvas2 = canvas;
                gjyVar = gjyVar2;
                f7 = f19;
            }
            if (gjyVar.c()) {
                return;
            }
            if (f17 <= 0.0f || f5 <= 0.0f) {
                pair = pair2;
            } else {
                pair = pair2;
                j(canvas2, paint, (ecm) pair2.first, f7, this.g, f5, null, 0.0f, 0.0f, 0.0f, false);
            }
            if (f18 >= this.f || f23 <= 0.0f) {
                return;
            }
            j(canvas, paint, (ecm) pair.second, f20, this.g, f23, null, 0.0f, 0.0f, 0.0f, false);
        }
    }

    public final void j(Canvas canvas, Paint paint, ecm ecmVar, float f, float f2, float f3, ecm ecmVar2, float f4, float f5, float f6, boolean z) {
        float f7;
        float f8;
        float min = Math.min(f2, this.g);
        float f9 = (-f) / 2.0f;
        float f10 = (-min) / 2.0f;
        float f11 = f / 2.0f;
        float f12 = min / 2.0f;
        RectF rectF = new RectF(f9, f10, f11, f12);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (ecmVar2 != null) {
            float[] fArr = ecmVar2.b;
            float[] fArr2 = ecmVar2.a;
            float min2 = Math.min(f5, this.g);
            float min3 = Math.min(f4 / 2.0f, (f6 * min2) / this.g);
            RectF rectF2 = new RectF();
            if (z) {
                float f13 = (fArr2[0] - min3) - (ecmVar.a[0] - f3);
                if (f13 > 0.0f) {
                    ecmVar2.e((-f13) / 2.0f);
                    f8 = f4 + f13;
                } else {
                    f8 = f4;
                }
                rectF2.set(0.0f, f10, f11, f12);
            } else {
                float f14 = (fArr2[0] + min3) - (ecmVar.a[0] + f3);
                if (f14 < 0.0f) {
                    ecmVar2.e((-f14) / 2.0f);
                    f7 = f4 - f14;
                } else {
                    f7 = f4;
                }
                rectF2.set(f9, f10, 0.0f, f12);
                f8 = f7;
            }
            RectF rectF3 = new RectF((-f8) / 2.0f, (-min2) / 2.0f, f8 / 2.0f, min2 / 2.0f);
            canvas.translate(fArr2[0], fArr2[1]);
            canvas.rotate(fcm.h(fArr));
            Path path = new Path();
            path.addRoundRect(rectF3, min3, min3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-fcm.h(fArr));
            canvas.translate(-fArr2[0], -fArr2[1]);
            float[] fArr3 = ecmVar.a;
            canvas.translate(fArr3[0], fArr3[1]);
            canvas.rotate(fcm.h(ecmVar.b));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f3, f3, paint);
        } else {
            float[] fArr4 = ecmVar.a;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(fcm.h(ecmVar.b));
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        canvas.restore();
    }
}
