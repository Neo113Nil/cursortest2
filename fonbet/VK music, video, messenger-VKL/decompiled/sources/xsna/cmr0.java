package xsna;

import xsna.eg3;
import xsna.wq2;

/* compiled from: VectorizedAnimationSpec.kt */
/* loaded from: classes11.dex */
public final class cmr0<V extends wq2> implements wlr0<V> {
    public final ng50 a;
    public final f9x<bmr0<V>> b;
    public final int c;
    public final huo d;
    public int[] e = ulr0.a;
    public float[] f;
    public V g;
    public V h;
    public V i;
    public V j;
    public float[] k;
    public float[] l;
    public eg3 m;

    public cmr0(ng50 ng50Var, f9x f9xVar, int i, huo huoVar) {
        this.a = ng50Var;
        this.b = f9xVar;
        this.c = i;
        this.d = huoVar;
        float[] fArr = ulr0.b;
        this.f = fArr;
        this.k = fArr;
        this.l = fArr;
        this.m = ulr0.c;
    }

    @Override // xsna.wlr0
    public final int b() {
        return this.c;
    }

    @Override // xsna.tlr0
    public final V d(long j, V v, V v2, V v3) {
        int i;
        long a = ulr0.a(this, j / 1000000);
        if (a < 0) {
            return v3;
        }
        i(v, v2, v3);
        V v4 = this.h;
        int i2 = 0;
        if (this.m != ulr0.c) {
            int i3 = (int) a;
            ng50 ng50Var = this.a;
            int i4 = ng50Var.b;
            if (i4 <= 0) {
                alk.D("");
                throw null;
            }
            int i5 = i4 - 1;
            int i6 = 0;
            while (true) {
                if (i6 > i5) {
                    i = -(i6 + 1);
                    break;
                }
                i = (i6 + i5) >>> 1;
                int i7 = ng50Var.a[i];
                if (i7 >= i3) {
                    if (i7 <= i3) {
                        break;
                    }
                    i5 = i - 1;
                } else {
                    i6 = i + 1;
                }
            }
            if (i < -1) {
                i = -(i + 2);
            }
            float h = h(i, i3, false);
            float[] fArr = this.l;
            eg3.a[][] aVarArr = this.m.a;
            float f = aVarArr[0][0].a;
            float f2 = aVarArr[aVarArr.length - 1][0].b;
            if (h < f) {
                h = f;
            }
            if (h <= f2) {
                f2 = h;
            }
            int length = fArr.length;
            boolean z = false;
            for (eg3.a[] aVarArr2 : aVarArr) {
                int i8 = 0;
                int i9 = 0;
                while (i8 < length - 1) {
                    eg3.a aVar = aVarArr2[i9];
                    if (f2 <= aVar.b) {
                        if (aVar.p) {
                            fArr[i8] = aVar.q;
                            fArr[i8 + 1] = aVar.r;
                        } else {
                            aVar.c(f2);
                            fArr[i8] = aVar.a();
                            fArr[i8 + 1] = aVar.b();
                        }
                        z = true;
                    }
                    i8 += 2;
                    i9++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i2 < length2) {
                v4.e(fArr[i2], i2);
                i2++;
            }
        } else {
            V g = g((a - 1) * 1000000, v, v2, v3);
            V g2 = g(a * 1000000, v, v2, v3);
            int b = g.b();
            while (i2 < b) {
                v4.e((g.a(i2) - g2.a(i2)) * 1000.0f, i2);
                i2++;
            }
        }
        return v4;
    }

    @Override // xsna.wlr0
    public final int f() {
        return 0;
    }

    @Override // xsna.tlr0
    public final V g(long j, V v, V v2, V v3) {
        int i;
        V v4;
        V v5;
        int i2;
        float f;
        eg3.a[][] aVarArr;
        boolean z;
        V v6 = v;
        V v7 = v2;
        int a = (int) ulr0.a(this, j / 1000000);
        f9x<bmr0<V>> f9xVar = this.b;
        bmr0<V> b = f9xVar.b(a);
        if (b != null) {
            return b.a;
        }
        if (a >= this.c) {
            return v7;
        }
        if (a <= 0) {
            return v6;
        }
        i(v6, v7, v3);
        V v8 = this.g;
        eg3 eg3Var = this.m;
        eg3 eg3Var2 = ulr0.c;
        ng50 ng50Var = this.a;
        int i3 = 0;
        boolean z2 = true;
        if (eg3Var == eg3Var2) {
            int i4 = ng50Var.b;
            if (i4 <= 0) {
                alk.D("");
                throw null;
            }
            int i5 = i4 - 1;
            int i6 = 0;
            while (true) {
                if (i6 > i5) {
                    i = -(i6 + 1);
                    break;
                }
                i = (i6 + i5) >>> 1;
                int i7 = ng50Var.a[i];
                if (i7 >= a) {
                    if (i7 <= a) {
                        break;
                    }
                    i5 = i - 1;
                } else {
                    i6 = i + 1;
                }
            }
            if (i < -1) {
                i = -(i + 2);
            }
            float h = h(i, a, true);
            bmr0<V> b2 = f9xVar.b(ng50Var.a(i));
            if (b2 != null && (v5 = b2.a) != null) {
                v6 = v5;
            }
            bmr0<V> b3 = f9xVar.b(ng50Var.a(i + 1));
            if (b3 != null && (v4 = b3.a) != null) {
                v7 = v4;
            }
            int b4 = v8.b();
            for (int i8 = 0; i8 < b4; i8++) {
                v8.e((v7.a(i8) * h) + ((1 - h) * v6.a(i8)), i8);
            }
            return v8;
        }
        int i9 = ng50Var.b;
        if (i9 <= 0) {
            alk.D("");
            throw null;
        }
        int i10 = i9 - 1;
        int i11 = 0;
        while (true) {
            if (i11 > i10) {
                i2 = -(i11 + 1);
                break;
            }
            i2 = (i11 + i10) >>> 1;
            int i12 = ng50Var.a[i2];
            if (i12 >= a) {
                if (i12 <= a) {
                    break;
                }
                i10 = i2 - 1;
            } else {
                i11 = i2 + 1;
            }
        }
        if (i2 < -1) {
            i2 = -(i2 + 2);
        }
        float h2 = h(i2, a, false);
        float[] fArr = this.k;
        eg3.a[][] aVarArr2 = this.m.a;
        int length = aVarArr2.length - 1;
        float f2 = aVarArr2[0][0].a;
        float f3 = aVarArr2[length][0].b;
        int length2 = fArr.length;
        if (h2 < f2 || h2 > f3) {
            if (h2 > f3) {
                f2 = f3;
            } else {
                length = 0;
            }
            float f4 = h2 - f2;
            int i13 = 0;
            int i14 = 0;
            while (i13 < length2 - 1) {
                eg3.a aVar = aVarArr2[length][i14];
                boolean z3 = aVar.p;
                float f5 = aVar.r;
                float f6 = aVar.q;
                if (z3) {
                    float f7 = aVar.a;
                    float f8 = aVar.k;
                    f = f4;
                    float f9 = aVar.c;
                    aVarArr = aVarArr2;
                    fArr[i13] = (f * f6) + u11.b(aVar.e, f9, (f2 - f7) * f8, f9);
                    float f10 = (f2 - f7) * f8;
                    float f11 = aVar.d;
                    fArr[i13 + 1] = (f * f5) + u11.b(aVar.f, f11, f10, f11);
                } else {
                    f = f4;
                    aVarArr = aVarArr2;
                    aVar.c(f2);
                    fArr[i13] = (aVar.a() * f) + (aVar.n * aVar.h) + f6;
                    fArr[i13 + 1] = (aVar.b() * f) + (aVar.o * aVar.i) + f5;
                }
                i13 += 2;
                i14++;
                f4 = f;
                aVarArr2 = aVarArr;
            }
        } else {
            int length3 = aVarArr2.length;
            int i15 = 0;
            boolean z4 = false;
            while (i15 < length3) {
                int i16 = i3;
                int i17 = i16;
                while (i16 < length2 - 1) {
                    eg3.a aVar2 = aVarArr2[i15][i17];
                    if (h2 <= aVar2.b) {
                        if (aVar2.p) {
                            float f12 = aVar2.a;
                            float f13 = aVar2.k;
                            float f14 = aVar2.c;
                            z = z2;
                            fArr[i16] = u11.b(aVar2.e, f14, (h2 - f12) * f13, f14);
                            float f15 = aVar2.d;
                            fArr[i16 + 1] = u11.b(aVar2.f, f15, (h2 - f12) * f13, f15);
                        } else {
                            z = z2;
                            aVar2.c(h2);
                            fArr[i16] = (aVar2.n * aVar2.h) + aVar2.q;
                            fArr[i16 + 1] = (aVar2.o * aVar2.i) + aVar2.r;
                        }
                        z4 = z;
                    } else {
                        z = z2;
                    }
                    i16 += 2;
                    i17++;
                    z2 = z;
                }
                boolean z5 = z2;
                if (z4) {
                    break;
                }
                i15++;
                z2 = z5;
                i3 = 0;
            }
        }
        int length4 = fArr.length;
        for (int i18 = 0; i18 < length4; i18++) {
            v8.e(fArr[i18], i18);
        }
        return v8;
    }

    public final float h(int i, int i2, boolean z) {
        huo huoVar;
        float f;
        ng50 ng50Var = this.a;
        if (i >= ng50Var.b - 1) {
            f = i2;
        } else {
            int a = ng50Var.a(i);
            int a2 = ng50Var.a(i + 1);
            if (i2 == a) {
                f = a;
            } else {
                int i3 = a2 - a;
                bmr0<V> b = this.b.b(a);
                if (b == null || (huoVar = b.b) == null) {
                    huoVar = this.d;
                }
                float f2 = i3;
                float a3 = huoVar.a((i2 - a) / f2);
                if (z) {
                    return a3;
                }
                f = (f2 * a3) + a;
            }
        }
        return f / 1000;
    }

    public final void i(V v, V v2, V v3) {
        float[] fArr;
        boolean z = this.m != ulr0.c;
        V v4 = this.g;
        f9x<bmr0<V>> f9xVar = this.b;
        ng50 ng50Var = this.a;
        if (v4 == null) {
            this.g = (V) v.c();
            this.h = (V) v3.c();
            int i = ng50Var.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = ng50Var.a(i2) / 1000;
            }
            this.f = fArr2;
            int i3 = ng50Var.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                f9xVar.b(ng50Var.a(i4));
                iArr[i4] = 0;
            }
            this.e = iArr;
        }
        if (z) {
            if (this.m != ulr0.c && epx.f(this.i, v) && epx.f(this.j, v2)) {
                return;
            }
            this.i = v;
            this.j = v2;
            int b = v.b() + (v.b() % 2);
            this.k = new float[b];
            this.l = new float[b];
            int i5 = ng50Var.b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int a = ng50Var.a(i6);
                bmr0<V> b2 = f9xVar.b(a);
                if (a == 0 && b2 == null) {
                    fArr = new float[b];
                    for (int i7 = 0; i7 < b; i7++) {
                        fArr[i7] = v.a(i7);
                    }
                } else if (a == this.c && b2 == null) {
                    fArr = new float[b];
                    for (int i8 = 0; i8 < b; i8++) {
                        fArr[i8] = v2.a(i8);
                    }
                } else {
                    V v5 = b2.a;
                    float[] fArr4 = new float[b];
                    for (int i9 = 0; i9 < b; i9++) {
                        fArr4[i9] = v5.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.m = new eg3(this.e, this.f, fArr3);
        }
    }
}
