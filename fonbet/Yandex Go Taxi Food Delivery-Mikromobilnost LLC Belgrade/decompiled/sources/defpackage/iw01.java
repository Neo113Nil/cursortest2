package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* loaded from: classes.dex */
public final class iw01 {
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public i35 l;
    public i35 m;
    public i35 n;
    public i35 o;
    public i35 p;
    public kor q;
    public kor r;
    public kor s;
    public kor t;
    public kor u;
    public i35 v;
    public i35 w;
    public final boolean x;
    public final Matrix a = new Matrix();
    public float f = Float.NaN;
    public float g = Float.NaN;
    public float h = Float.NaN;
    public float i = 1.0f;
    public float j = 1.0f;
    public boolean k = true;

    public iw01(ge2 ge2Var) {
        yvi0 yvi0Var = ge2Var.a;
        this.l = yvi0Var == null ? null : yvi0Var.I();
        ie2 ie2Var = ge2Var.b;
        this.m = ie2Var == null ? null : ie2Var.I();
        ae2 ae2Var = ge2Var.c;
        this.n = ae2Var == null ? null : ae2Var.I();
        be2 be2Var = ge2Var.d;
        this.o = be2Var == null ? null : be2Var.I();
        be2 be2Var2 = ge2Var.f;
        this.q = be2Var2 == null ? null : be2Var2.I();
        this.x = ge2Var.m;
        be2 be2Var3 = ge2Var.h;
        this.s = be2Var3 == null ? null : be2Var3.I();
        be2 be2Var4 = ge2Var.i;
        this.t = be2Var4 == null ? null : be2Var4.I();
        be2 be2Var5 = ge2Var.j;
        this.u = be2Var5 == null ? null : be2Var5.I();
        if (this.q != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        be2 be2Var6 = ge2Var.g;
        this.r = be2Var6 == null ? null : be2Var6.I();
        ae2 ae2Var2 = ge2Var.e;
        if (ae2Var2 != null) {
            this.p = ae2Var2.I();
        }
        be2 be2Var7 = ge2Var.k;
        if (be2Var7 != null) {
            this.v = be2Var7.I();
        } else {
            this.v = null;
        }
        be2 be2Var8 = ge2Var.l;
        if (be2Var8 != null) {
            this.w = be2Var8.I();
        } else {
            this.w = null;
        }
    }

    public final void a(l35 l35Var) {
        l35Var.c(this.p);
        l35Var.c(this.v);
        l35Var.c(this.w);
        l35Var.c(this.l);
        l35Var.c(this.m);
        l35Var.c(this.n);
        l35Var.c(this.o);
        l35Var.c(this.q);
        l35Var.c(this.r);
        l35Var.c(this.s);
        l35Var.c(this.t);
        l35Var.c(this.u);
    }

    public final void b(e35 e35Var) {
        i35 i35Var = this.p;
        if (i35Var != null) {
            i35Var.a(e35Var);
        }
        i35 i35Var2 = this.v;
        if (i35Var2 != null) {
            i35Var2.a(e35Var);
        }
        i35 i35Var3 = this.w;
        if (i35Var3 != null) {
            i35Var3.a(e35Var);
        }
        i35 i35Var4 = this.l;
        if (i35Var4 != null) {
            i35Var4.a(e35Var);
        }
        i35 i35Var5 = this.m;
        if (i35Var5 != null) {
            i35Var5.a(e35Var);
        }
        i35 i35Var6 = this.n;
        if (i35Var6 != null) {
            i35Var6.a(e35Var);
        }
        i35 i35Var7 = this.o;
        if (i35Var7 != null) {
            i35Var7.a(e35Var);
        }
        kor korVar = this.q;
        if (korVar != null) {
            korVar.a(e35Var);
        }
        kor korVar2 = this.r;
        if (korVar2 != null) {
            korVar2.a(e35Var);
        }
        kor korVar3 = this.s;
        if (korVar3 != null) {
            korVar3.a(e35Var);
            this.s.a(new hw01(0, this));
        }
        kor korVar4 = this.t;
        if (korVar4 != null) {
            korVar4.a(e35Var);
            this.t.a(new hw01(1, this));
        }
        kor korVar5 = this.u;
        if (korVar5 != null) {
            korVar5.a(e35Var);
            this.u.a(new hw01(2, this));
        }
    }

    public final boolean c(puz puzVar, Object obj) {
        Float valueOf = Float.valueOf(100.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        if (obj == cuz.a) {
            i35 i35Var = this.l;
            if (i35Var == null) {
                this.l = new e131(puzVar, new PointF());
                return true;
            }
            i35Var.k(puzVar);
            return true;
        }
        if (obj == cuz.b) {
            i35 i35Var2 = this.m;
            if (i35Var2 == null) {
                this.m = new e131(puzVar, new PointF());
                return true;
            }
            i35Var2.k(puzVar);
            return true;
        }
        if (obj == cuz.c) {
            i35 i35Var3 = this.m;
            if (i35Var3 instanceof hvt0) {
                ((hvt0) i35Var3).n(puzVar);
                return true;
            }
        }
        if (obj == cuz.d) {
            i35 i35Var4 = this.m;
            if (i35Var4 instanceof hvt0) {
                ((hvt0) i35Var4).o(puzVar);
                return true;
            }
        }
        if (obj == cuz.j) {
            i35 i35Var5 = this.n;
            if (i35Var5 == null) {
                this.n = new e131(puzVar, new dlm0());
                return true;
            }
            i35Var5.k(puzVar);
            return true;
        }
        if (obj == cuz.k) {
            i35 i35Var6 = this.o;
            if (i35Var6 == null) {
                this.o = new e131(puzVar, valueOf2);
                return true;
            }
            i35Var6.k(puzVar);
            return true;
        }
        if (obj == 3) {
            i35 i35Var7 = this.p;
            if (i35Var7 == null) {
                this.p = new e131(puzVar, 100);
                return true;
            }
            i35Var7.k(puzVar);
            return true;
        }
        if (obj == cuz.A) {
            i35 i35Var8 = this.v;
            if (i35Var8 == null) {
                this.v = new e131(puzVar, valueOf);
                return true;
            }
            i35Var8.k(puzVar);
            return true;
        }
        if (obj == cuz.B) {
            i35 i35Var9 = this.w;
            if (i35Var9 == null) {
                this.w = new e131(puzVar, valueOf);
                return true;
            }
            i35Var9.k(puzVar);
            return true;
        }
        if (obj == cuz.o) {
            if (this.q == null) {
                this.q = new kor(Collections.singletonList(new rkx(valueOf2)));
            }
            this.q.k(puzVar);
            return true;
        }
        if (obj == cuz.p) {
            if (this.r == null) {
                this.r = new kor(Collections.singletonList(new rkx(valueOf2)));
            }
            this.r.k(puzVar);
            return true;
        }
        if (obj == cuz.l) {
            if (this.s == null) {
                this.s = new kor(Collections.singletonList(new rkx(valueOf2)));
            }
            this.s.k(puzVar);
            return true;
        }
        if (obj == cuz.m) {
            if (this.t == null) {
                this.t = new kor(Collections.singletonList(new rkx(valueOf2)));
            }
            this.t.k(puzVar);
            return true;
        }
        if (obj != cuz.n) {
            return false;
        }
        if (this.u == null) {
            this.u = new kor(Collections.singletonList(new rkx(valueOf2)));
        }
        this.u.k(puzVar);
        return true;
    }

    public final void d() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public final Matrix e() {
        kor korVar;
        kor korVar2;
        PointF pointF;
        dlm0 dlm0Var;
        PointF pointF2;
        Matrix matrix = this.a;
        matrix.reset();
        kor korVar3 = this.s;
        if ((korVar3 != null && korVar3.m() != 0.0f) || (((korVar = this.t) != null && korVar.m() != 0.0f) || ((korVar2 = this.u) != null && korVar2.m() != 0.0f))) {
            kor korVar4 = this.s;
            float m = korVar4 != null ? korVar4.m() : 0.0f;
            kor korVar5 = this.t;
            float m2 = korVar5 != null ? korVar5.m() : 0.0f;
            kor korVar6 = this.u;
            float m3 = korVar6 != null ? korVar6.m() : 0.0f;
            if (this.k || m != this.f || m2 != this.g || m3 != this.h) {
                this.f = m;
                this.g = m2;
                this.h = m3;
                if (m != 0.0f) {
                    this.i = (float) Math.cos(Math.toRadians(m));
                } else {
                    this.i = 1.0f;
                }
                if (m2 != 0.0f) {
                    this.j = (float) Math.cos(Math.toRadians(m2));
                } else {
                    this.j = 1.0f;
                }
                this.k = false;
            }
            i35 i35Var = this.l;
            PointF pointF3 = i35Var == null ? null : (PointF) i35Var.f();
            i35 i35Var2 = this.m;
            PointF pointF4 = i35Var2 == null ? null : (PointF) i35Var2.f();
            i35 i35Var3 = this.n;
            dlm0 dlm0Var2 = i35Var3 != null ? (dlm0) i35Var3.f() : null;
            cw01.b(matrix, pointF3, pointF4, dlm0Var2 != null ? dlm0Var2.a : 1.0f, dlm0Var2 != null ? dlm0Var2.b : 1.0f, m, m2, m3, this.i, this.j);
            return matrix;
        }
        i35 i35Var4 = this.m;
        if (i35Var4 != null && (pointF2 = (PointF) i35Var4.f()) != null) {
            float f = pointF2.x;
            if (f != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(f, pointF2.y);
            }
        }
        if (!this.x) {
            i35 i35Var5 = this.o;
            if (i35Var5 != null) {
                float floatValue = i35Var5 instanceof e131 ? ((Float) i35Var5.f()).floatValue() : ((kor) i35Var5).m();
                if (floatValue != 0.0f) {
                    matrix.preRotate(floatValue);
                }
            }
        } else if (i35Var4 != null) {
            float f2 = i35Var4.d;
            PointF pointF5 = (PointF) i35Var4.f();
            float f3 = pointF5.x;
            float f4 = pointF5.y;
            i35Var4.j(1.0E-4f + f2);
            PointF pointF6 = (PointF) i35Var4.f();
            i35Var4.j(f2);
            matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF6.y - f4, pointF6.x - f3)));
        }
        if (this.q != null) {
            float cos = this.r == null ? 0.0f : (float) Math.cos(Math.toRadians((-r5.m()) + 90.0f));
            float sin = this.r == null ? 1.0f : (float) Math.sin(Math.toRadians((-r7.m()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(r1.m()));
            d();
            float[] fArr = this.e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f5 = -sin;
            fArr[3] = f5;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.b;
            matrix2.setValues(fArr);
            d();
            fArr[0] = 1.0f;
            fArr[3] = tan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.c;
            matrix3.setValues(fArr);
            d();
            fArr[0] = cos;
            fArr[1] = f5;
            fArr[3] = sin;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        i35 i35Var6 = this.n;
        if (i35Var6 != null && (dlm0Var = (dlm0) i35Var6.f()) != null) {
            float f6 = dlm0Var.a;
            if (f6 != 1.0f || dlm0Var.b != 1.0f) {
                matrix.preScale(f6, dlm0Var.b);
            }
        }
        i35 i35Var7 = this.l;
        if (i35Var7 != null && (pointF = (PointF) i35Var7.f()) != null) {
            float f7 = pointF.x;
            if (f7 != 0.0f || pointF.y != 0.0f) {
                matrix.preTranslate(-f7, -pointF.y);
            }
        }
        return matrix;
    }

    public final Matrix f(float f) {
        i35 i35Var = this.m;
        PointF pointF = i35Var == null ? null : (PointF) i35Var.f();
        i35 i35Var2 = this.n;
        dlm0 dlm0Var = i35Var2 == null ? null : (dlm0) i35Var2.f();
        i35 i35Var3 = this.l;
        PointF pointF2 = i35Var3 != null ? (PointF) i35Var3.f() : null;
        Matrix matrix = this.a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        kor korVar = this.s;
        float m = korVar != null ? korVar.m() * f : 0.0f;
        kor korVar2 = this.t;
        float m2 = korVar2 != null ? korVar2.m() * f : 0.0f;
        kor korVar3 = this.u;
        float m3 = korVar3 != null ? korVar3.m() * f : 0.0f;
        if (m == 0.0f && m2 == 0.0f && m3 == 0.0f) {
            i35 i35Var4 = this.o;
            if (i35Var4 != null) {
                matrix.preRotate(((Float) i35Var4.f()).floatValue() * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
        } else {
            float cos = m != 0.0f ? (float) Math.cos(Math.toRadians(m)) : 1.0f;
            float cos2 = m2 != 0.0f ? (float) Math.cos(Math.toRadians(m2)) : 1.0f;
            if (m3 != 0.0f) {
                matrix.preRotate(m3, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
            cw01.a(matrix, m, m2, cos, cos2);
        }
        if (dlm0Var != null) {
            double d = f;
            matrix.preScale((float) Math.pow(dlm0Var.a, d), (float) Math.pow(dlm0Var.b, d));
        }
        return matrix;
    }
}
