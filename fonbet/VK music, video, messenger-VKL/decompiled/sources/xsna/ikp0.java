package xsna;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;
import xsna.tf6;

/* compiled from: TransformKeyframeAnimation.java */
/* loaded from: classes12.dex */
public final class ikp0 {
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;

    @Nullable
    public tf6<PointF, PointF> l;

    @Nullable
    public tf6<?, PointF> m;

    @Nullable
    public tf6<b5h0, b5h0> n;

    @Nullable
    public tf6<Float, Float> o;

    @Nullable
    public tf6<Integer, Integer> p;

    @Nullable
    public hqr q;

    @Nullable
    public hqr r;

    @Nullable
    public hqr s;

    @Nullable
    public hqr t;

    @Nullable
    public hqr u;

    @Nullable
    public tf6<?, Float> v;

    @Nullable
    public tf6<?, Float> w;
    public final boolean x;
    public final Matrix a = new Matrix();
    public float f = Float.NaN;
    public float g = Float.NaN;
    public float h = Float.NaN;
    public float i = 1.0f;
    public float j = 1.0f;
    public boolean k = true;

    public ikp0(dg2 dg2Var) {
        sf2 sf2Var = dg2Var.a;
        this.l = sf2Var == null ? null : sf2Var.j();
        fg2<PointF, PointF> fg2Var = dg2Var.b;
        this.m = fg2Var == null ? null : fg2Var.j();
        vf2 vf2Var = dg2Var.c;
        this.n = vf2Var == null ? null : vf2Var.j();
        nf2 nf2Var = dg2Var.d;
        this.o = nf2Var == null ? null : nf2Var.j();
        nf2 nf2Var2 = dg2Var.f;
        this.q = nf2Var2 == null ? null : nf2Var2.j();
        this.x = dg2Var.m;
        nf2 nf2Var3 = dg2Var.h;
        this.s = nf2Var3 == null ? null : nf2Var3.j();
        nf2 nf2Var4 = dg2Var.i;
        this.t = nf2Var4 == null ? null : nf2Var4.j();
        nf2 nf2Var5 = dg2Var.j;
        this.u = nf2Var5 == null ? null : nf2Var5.j();
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
        nf2 nf2Var6 = dg2Var.g;
        this.r = nf2Var6 == null ? null : nf2Var6.j();
        pf2 pf2Var = dg2Var.e;
        if (pf2Var != null) {
            this.p = pf2Var.j();
        }
        nf2 nf2Var7 = dg2Var.k;
        if (nf2Var7 != null) {
            this.v = nf2Var7.j();
        } else {
            this.v = null;
        }
        nf2 nf2Var8 = dg2Var.l;
        if (nf2Var8 != null) {
            this.w = nf2Var8.j();
        } else {
            this.w = null;
        }
    }

    public final void a(com.airbnb.lottie.model.layer.a aVar) {
        aVar.h(this.p);
        aVar.h(this.v);
        aVar.h(this.w);
        aVar.h(this.l);
        aVar.h(this.m);
        aVar.h(this.n);
        aVar.h(this.o);
        aVar.h(this.q);
        aVar.h(this.r);
        aVar.h(this.s);
        aVar.h(this.t);
        aVar.h(this.u);
    }

    public final void b(tf6.a aVar) {
        tf6<Integer, Integer> tf6Var = this.p;
        if (tf6Var != null) {
            tf6Var.a(aVar);
        }
        tf6<?, Float> tf6Var2 = this.v;
        if (tf6Var2 != null) {
            tf6Var2.a(aVar);
        }
        tf6<?, Float> tf6Var3 = this.w;
        if (tf6Var3 != null) {
            tf6Var3.a(aVar);
        }
        tf6<PointF, PointF> tf6Var4 = this.l;
        if (tf6Var4 != null) {
            tf6Var4.a(aVar);
        }
        tf6<?, PointF> tf6Var5 = this.m;
        if (tf6Var5 != null) {
            tf6Var5.a(aVar);
        }
        tf6<b5h0, b5h0> tf6Var6 = this.n;
        if (tf6Var6 != null) {
            tf6Var6.a(aVar);
        }
        tf6<Float, Float> tf6Var7 = this.o;
        if (tf6Var7 != null) {
            tf6Var7.a(aVar);
        }
        hqr hqrVar = this.q;
        if (hqrVar != null) {
            hqrVar.a(aVar);
        }
        hqr hqrVar2 = this.r;
        if (hqrVar2 != null) {
            hqrVar2.a(aVar);
        }
        hqr hqrVar3 = this.s;
        if (hqrVar3 != null) {
            hqrVar3.a(aVar);
            this.s.a(new tf6.a() { // from class: xsna.fkp0
                @Override // xsna.tf6.a
                public final void i() {
                    ikp0.this.k = true;
                }
            });
        }
        hqr hqrVar4 = this.t;
        if (hqrVar4 != null) {
            hqrVar4.a(aVar);
            this.t.a(new tf6.a() { // from class: xsna.gkp0
                @Override // xsna.tf6.a
                public final void i() {
                    ikp0.this.k = true;
                }
            });
        }
        hqr hqrVar5 = this.u;
        if (hqrVar5 != null) {
            hqrVar5.a(aVar);
            this.u.a(new tf6.a() { // from class: xsna.hkp0
                @Override // xsna.tf6.a
                public final void i() {
                    ikp0.this.k = true;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> boolean c(T t, @Nullable a900<T> a900Var) {
        Float valueOf = Float.valueOf(100.0f);
        Float valueOf2 = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (t == t800.a) {
            tf6<PointF, PointF> tf6Var = this.l;
            if (tf6Var == null) {
                this.l = new pjr0(new PointF(), a900Var);
                return true;
            }
            tf6Var.k(a900Var);
            return true;
        }
        if (t == t800.b) {
            tf6<?, PointF> tf6Var2 = this.m;
            if (tf6Var2 == null) {
                this.m = new pjr0(new PointF(), a900Var);
                return true;
            }
            tf6Var2.k(a900Var);
            return true;
        }
        if (t == t800.c) {
            tf6<?, PointF> tf6Var3 = this.m;
            if (tf6Var3 instanceof llk0) {
                llk0 llk0Var = (llk0) tf6Var3;
                a900<Float> a900Var2 = llk0Var.m;
                llk0Var.m = a900Var;
                return true;
            }
        }
        if (t == t800.d) {
            tf6<?, PointF> tf6Var4 = this.m;
            if (tf6Var4 instanceof llk0) {
                llk0 llk0Var2 = (llk0) tf6Var4;
                a900<Float> a900Var3 = llk0Var2.n;
                llk0Var2.n = a900Var;
                return true;
            }
        }
        if (t == t800.j) {
            tf6<b5h0, b5h0> tf6Var5 = this.n;
            if (tf6Var5 == null) {
                this.n = new pjr0(new b5h0(), a900Var);
                return true;
            }
            tf6Var5.k(a900Var);
            return true;
        }
        if (t == t800.k) {
            tf6<Float, Float> tf6Var6 = this.o;
            if (tf6Var6 == null) {
                this.o = new pjr0(valueOf2, a900Var);
                return true;
            }
            tf6Var6.k(a900Var);
            return true;
        }
        if (t == 3) {
            tf6<Integer, Integer> tf6Var7 = this.p;
            if (tf6Var7 == null) {
                this.p = new pjr0(100, a900Var);
                return true;
            }
            tf6Var7.k(a900Var);
            return true;
        }
        if (t == t800.A) {
            tf6<?, Float> tf6Var8 = this.v;
            if (tf6Var8 == null) {
                this.v = new pjr0(valueOf, a900Var);
                return true;
            }
            tf6Var8.k(a900Var);
            return true;
        }
        if (t == t800.B) {
            tf6<?, Float> tf6Var9 = this.w;
            if (tf6Var9 == null) {
                this.w = new pjr0(valueOf, a900Var);
                return true;
            }
            tf6Var9.k(a900Var);
            return true;
        }
        if (t == t800.o) {
            if (this.q == null) {
                this.q = new hqr(Collections.singletonList(new nhy(valueOf2)));
            }
            this.q.k(a900Var);
            return true;
        }
        if (t == t800.p) {
            if (this.r == null) {
                this.r = new hqr(Collections.singletonList(new nhy(valueOf2)));
            }
            this.r.k(a900Var);
            return true;
        }
        if (t == t800.l) {
            if (this.s == null) {
                this.s = new hqr(Collections.singletonList(new nhy(valueOf2)));
            }
            this.s.k(a900Var);
            return true;
        }
        if (t == t800.m) {
            if (this.t == null) {
                this.t = new hqr(Collections.singletonList(new nhy(valueOf2)));
            }
            this.t.k(a900Var);
            return true;
        }
        if (t != t800.n) {
            return false;
        }
        if (this.u == null) {
            this.u = new hqr(Collections.singletonList(new nhy(valueOf2)));
        }
        this.u.k(a900Var);
        return true;
    }

    public final void d() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public final Matrix e() {
        hqr hqrVar;
        hqr hqrVar2;
        PointF f;
        b5h0 f2;
        PointF f3;
        Matrix matrix = this.a;
        matrix.reset();
        hqr hqrVar3 = this.s;
        if ((hqrVar3 == null || hqrVar3.m() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && (((hqrVar = this.t) == null || hqrVar.m() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && ((hqrVar2 = this.u) == null || hqrVar2.m() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
            tf6<?, PointF> tf6Var = this.m;
            if (tf6Var != null && (f3 = tf6Var.f()) != null) {
                float f4 = f3.x;
                if (f4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f3.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    matrix.preTranslate(f4, f3.y);
                }
            }
            if (!this.x) {
                tf6<Float, Float> tf6Var2 = this.o;
                if (tf6Var2 != null) {
                    float floatValue = tf6Var2 instanceof pjr0 ? tf6Var2.f().floatValue() : ((hqr) tf6Var2).m();
                    if (floatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        matrix.preRotate(floatValue);
                    }
                }
            } else if (tf6Var != null) {
                float f5 = tf6Var.d;
                PointF f6 = tf6Var.f();
                float f7 = f6.x;
                float f8 = f6.y;
                tf6Var.j(1.0E-4f + f5);
                PointF f9 = tf6Var.f();
                tf6Var.j(f5);
                matrix.preRotate((float) Math.toDegrees(Math.atan2(f9.y - f8, f9.x - f7)));
            }
            if (this.q != null) {
                float cos = this.r == null ? 0.0f : (float) Math.cos(Math.toRadians((-r5.m()) + 90.0f));
                float sin = this.r == null ? 1.0f : (float) Math.sin(Math.toRadians((-r7.m()) + 90.0f));
                float tan = (float) Math.tan(Math.toRadians(r1.m()));
                d();
                float[] fArr = this.e;
                fArr[0] = cos;
                fArr[1] = sin;
                float f10 = -sin;
                fArr[3] = f10;
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
                fArr[1] = f10;
                fArr[3] = sin;
                fArr[4] = cos;
                fArr[8] = 1.0f;
                Matrix matrix4 = this.d;
                matrix4.setValues(fArr);
                matrix3.preConcat(matrix2);
                matrix4.preConcat(matrix3);
                matrix.preConcat(matrix4);
            }
            tf6<b5h0, b5h0> tf6Var3 = this.n;
            if (tf6Var3 != null && (f2 = tf6Var3.f()) != null) {
                float f11 = f2.a;
                if (f11 != 1.0f || f2.b != 1.0f) {
                    matrix.preScale(f11, f2.b);
                }
            }
            tf6<PointF, PointF> tf6Var4 = this.l;
            if (tf6Var4 != null && (f = tf6Var4.f()) != null) {
                float f12 = f.x;
                if (f12 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    matrix.preTranslate(-f12, -f.y);
                }
            }
        } else {
            hqr hqrVar4 = this.s;
            float m = hqrVar4 != null ? hqrVar4.m() : 0.0f;
            hqr hqrVar5 = this.t;
            float m2 = hqrVar5 != null ? hqrVar5.m() : 0.0f;
            hqr hqrVar6 = this.u;
            float m3 = hqrVar6 != null ? hqrVar6.m() : 0.0f;
            if (this.k || m != this.f || m2 != this.g || m3 != this.h) {
                this.f = m;
                this.g = m2;
                this.h = m3;
                if (m != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.i = (float) Math.cos(Math.toRadians(m));
                } else {
                    this.i = 1.0f;
                }
                if (m2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.j = (float) Math.cos(Math.toRadians(m2));
                } else {
                    this.j = 1.0f;
                }
                this.k = false;
            }
            tf6<PointF, PointF> tf6Var5 = this.l;
            PointF f13 = tf6Var5 == null ? null : tf6Var5.f();
            tf6<?, PointF> tf6Var6 = this.m;
            PointF f14 = tf6Var6 == null ? null : tf6Var6.f();
            tf6<b5h0, b5h0> tf6Var7 = this.n;
            b5h0 f15 = tf6Var7 != null ? tf6Var7.f() : null;
            float f16 = f15 != null ? f15.a : 1.0f;
            float f17 = f15 != null ? f15.b : 1.0f;
            float f18 = this.i;
            float f19 = this.j;
            matrix.reset();
            if (f14 != null) {
                float f20 = f14.x;
                if (f20 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f14.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    matrix.preTranslate(f20, f14.y);
                }
            }
            if (m3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                matrix.preRotate(m3);
            }
            if (m2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                matrix.preScale(f19, 1.0f);
            }
            if (m != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                matrix.preScale(1.0f, f18);
            }
            if (f16 != 1.0f || f17 != 1.0f) {
                matrix.preScale(f16, f17);
            }
            if (f13 != null) {
                float f21 = f13.x;
                if (f21 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f13.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    matrix.preTranslate(-f21, -f13.y);
                    return matrix;
                }
            }
        }
        return matrix;
    }

    public final Matrix f(float f) {
        tf6<?, PointF> tf6Var = this.m;
        PointF f2 = tf6Var == null ? null : tf6Var.f();
        tf6<b5h0, b5h0> tf6Var2 = this.n;
        b5h0 f3 = tf6Var2 == null ? null : tf6Var2.f();
        tf6<PointF, PointF> tf6Var3 = this.l;
        PointF f4 = tf6Var3 != null ? tf6Var3.f() : null;
        Matrix matrix = this.a;
        matrix.reset();
        if (f2 != null) {
            matrix.preTranslate(f2.x * f, f2.y * f);
        }
        hqr hqrVar = this.s;
        float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float m = hqrVar != null ? hqrVar.m() * f : 0.0f;
        hqr hqrVar2 = this.t;
        float m2 = hqrVar2 != null ? hqrVar2.m() * f : 0.0f;
        hqr hqrVar3 = this.u;
        float m3 = hqrVar3 != null ? hqrVar3.m() * f : 0.0f;
        if (m == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && m2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && m3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            tf6<Float, Float> tf6Var4 = this.o;
            if (tf6Var4 != null) {
                float floatValue = tf6Var4.f().floatValue() * f;
                float f6 = f4 == null ? 0.0f : f4.x;
                if (f4 != null) {
                    f5 = f4.y;
                }
                matrix.preRotate(floatValue, f6, f5);
            }
        } else {
            float cos = m != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (float) Math.cos(Math.toRadians(m)) : 1.0f;
            float cos2 = m2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (float) Math.cos(Math.toRadians(m2)) : 1.0f;
            if (m3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float f7 = f4 == null ? 0.0f : f4.x;
                if (f4 != null) {
                    f5 = f4.y;
                }
                matrix.preRotate(m3, f7, f5);
            }
            if (m2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                matrix.preScale(cos2, 1.0f);
            }
            if (m != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                matrix.preScale(1.0f, cos);
            }
        }
        if (f3 != null) {
            double d = f;
            matrix.preScale((float) Math.pow(f3.a, d), (float) Math.pow(f3.b, d));
        }
        return matrix;
    }
}
