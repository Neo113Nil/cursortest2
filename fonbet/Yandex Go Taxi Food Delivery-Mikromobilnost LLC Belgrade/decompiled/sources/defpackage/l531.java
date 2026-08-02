package defpackage;

/* loaded from: classes10.dex */
public final class l531 implements h531 {
    public sj2 A;
    public sj2 B;
    public sj2 C;
    public float[] D;
    public float[] E;
    public vit F;
    public final vx40 a;
    public final wx40 b;
    public final int c;
    public final rbn w;
    public int[] x = g531.a;
    public float[] y;
    public sj2 z;

    public l531(vx40 vx40Var, wx40 wx40Var, int i, rbn rbnVar) {
        this.a = vx40Var;
        this.b = wx40Var;
        this.c = i;
        this.w = rbnVar;
        float[] fArr = g531.b;
        this.y = fArr;
        this.D = fArr;
        this.E = fArr;
        this.F = g531.c;
    }

    public final int a(int i) {
        int i2;
        vx40 vx40Var = this.a;
        int i3 = vx40Var.b;
        if (i3 <= 0) {
            xva1.d("");
            throw null;
        }
        int i4 = i3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = vx40Var.a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = -(i5 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    public final float c(int i, int i2, boolean z) {
        rbn rbnVar;
        float f;
        vx40 vx40Var = this.a;
        if (i >= vx40Var.b - 1) {
            f = i2;
        } else {
            int a = vx40Var.a(i);
            int a2 = vx40Var.a(i + 1);
            if (i2 != a) {
                int i3 = a2 - a;
                k531 k531Var = (k531) this.b.b(a);
                if (k531Var == null || (rbnVar = k531Var.b) == null) {
                    rbnVar = this.w;
                }
                float f2 = i3;
                float a3 = rbnVar.a((i2 - a) / f2);
                return z ? a3 : ((f2 * a3) + a) / 1000.0f;
            }
            f = a;
        }
        return f / 1000.0f;
    }

    public final void d(sj2 sj2Var, sj2 sj2Var2, sj2 sj2Var3) {
        float[] fArr;
        boolean z = this.F != g531.c;
        sj2 sj2Var4 = this.z;
        wx40 wx40Var = this.b;
        vx40 vx40Var = this.a;
        if (sj2Var4 == null) {
            this.z = sj2Var.c();
            this.A = sj2Var3.c();
            int i = vx40Var.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = vx40Var.a(i2) / 1000.0f;
            }
            this.y = fArr2;
            int i3 = vx40Var.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.x = iArr;
        }
        if (z) {
            if (this.F != g531.c && jl40.l(this.B, sj2Var) && jl40.l(this.C, sj2Var2)) {
                return;
            }
            this.B = sj2Var;
            this.C = sj2Var2;
            int b = sj2Var.b() + (sj2Var.b() % 2);
            this.D = new float[b];
            this.E = new float[b];
            int i5 = vx40Var.b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int a = vx40Var.a(i6);
                k531 k531Var = (k531) wx40Var.b(a);
                if (a == 0 && k531Var == null) {
                    fArr = new float[b];
                    for (int i7 = 0; i7 < b; i7++) {
                        fArr[i7] = sj2Var.a(i7);
                    }
                } else if (a == this.c && k531Var == null) {
                    fArr = new float[b];
                    for (int i8 = 0; i8 < b; i8++) {
                        fArr[i8] = sj2Var2.a(i8);
                    }
                } else {
                    sj2 sj2Var5 = k531Var.a;
                    float[] fArr4 = new float[b];
                    for (int i9 = 0; i9 < b; i9++) {
                        fArr4[i9] = sj2Var5.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.F = new vit(this.x, this.y, fArr3);
        }
    }

    @Override // defpackage.h531
    public final int f() {
        return this.c;
    }

    @Override // defpackage.f531
    public final sj2 k(long j, sj2 sj2Var, sj2 sj2Var2, sj2 sj2Var3) {
        long j2 = j / 1000000;
        int[] iArr = g531.a;
        long f = f();
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = j2 > f ? f : j2;
        if (j3 < 0) {
            return sj2Var3;
        }
        d(sj2Var, sj2Var2, sj2Var3);
        sj2 sj2Var4 = this.A;
        int i = 0;
        if (this.F != g531.c) {
            int i2 = (int) j3;
            float c = c(a(i2), i2, false);
            float[] fArr = this.E;
            a43[][] a43VarArr = (a43[][]) this.F.b;
            float f2 = a43VarArr[0][0].a;
            float f3 = a43VarArr[a43VarArr.length - 1][0].b;
            if (c < f2) {
                c = f2;
            }
            if (c <= f3) {
                f3 = c;
            }
            int length = fArr.length;
            boolean z = false;
            for (a43[] a43VarArr2 : a43VarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    a43 a43Var = a43VarArr2[i4];
                    if (f3 <= a43Var.b) {
                        if (a43Var.p) {
                            fArr[i3] = a43Var.q;
                            fArr[i3 + 1] = a43Var.r;
                        } else {
                            a43Var.c(f3);
                            fArr[i3] = a43Var.a();
                            fArr[i3 + 1] = a43Var.b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                sj2Var4.e(fArr[i], i);
                i++;
            }
        } else {
            sj2 n = n((j3 - 1) * 1000000, sj2Var, sj2Var2, sj2Var3);
            sj2 n2 = n(j3 * 1000000, sj2Var, sj2Var2, sj2Var3);
            int b = n.b();
            while (i < b) {
                sj2Var4.e((n.a(i) - n2.a(i)) * 1000.0f, i);
                i++;
            }
        }
        return sj2Var4;
    }

    @Override // defpackage.f531
    public final sj2 n(long j, sj2 sj2Var, sj2 sj2Var2, sj2 sj2Var3) {
        sj2 sj2Var4;
        sj2 sj2Var5;
        a43[][] a43VarArr;
        sj2 sj2Var6 = sj2Var;
        long j2 = j / 1000000;
        int[] iArr = g531.a;
        long f = f();
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= f) {
            f = j2;
        }
        int i = (int) f;
        wx40 wx40Var = this.b;
        k531 k531Var = (k531) wx40Var.b(i);
        if (k531Var != null) {
            return k531Var.a;
        }
        if (i >= this.c) {
            return sj2Var2;
        }
        if (i <= 0) {
            return sj2Var6;
        }
        d(sj2Var6, sj2Var2, sj2Var3);
        sj2 sj2Var7 = this.z;
        int i2 = 0;
        if (this.F != g531.c) {
            float c = c(a(i), i, false);
            float[] fArr = this.D;
            a43[][] a43VarArr2 = (a43[][]) this.F.b;
            int length = a43VarArr2.length - 1;
            float f2 = a43VarArr2[0][0].a;
            float f3 = a43VarArr2[length][0].b;
            int length2 = fArr.length;
            if (c < f2 || c > f3) {
                if (c > f3) {
                    f2 = f3;
                } else {
                    length = 0;
                }
                float f4 = c - f2;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length2 - 1) {
                    a43 a43Var = a43VarArr2[length][i4];
                    boolean z = a43Var.p;
                    float f5 = a43Var.r;
                    float f6 = a43Var.q;
                    if (z) {
                        float f7 = a43Var.a;
                        float f8 = a43Var.k;
                        float f9 = a43Var.c;
                        a43VarArr = a43VarArr2;
                        fArr[i3] = (f6 * f4) + g8e.b(a43Var.e, f9, (f2 - f7) * f8, f9);
                        float f10 = (f2 - f7) * f8;
                        float f11 = a43Var.d;
                        fArr[i3 + 1] = (f5 * f4) + g8e.b(a43Var.f, f11, f10, f11);
                    } else {
                        a43VarArr = a43VarArr2;
                        a43Var.c(f2);
                        fArr[i3] = (a43Var.a() * f4) + (a43Var.n * a43Var.h) + f6;
                        fArr[i3 + 1] = (a43Var.b() * f4) + (a43Var.o * a43Var.i) + f5;
                    }
                    i3 += 2;
                    i4++;
                    a43VarArr2 = a43VarArr;
                }
            } else {
                int length3 = a43VarArr2.length;
                int i5 = 0;
                boolean z2 = false;
                while (i5 < length3) {
                    int i6 = i2;
                    int i7 = i6;
                    while (i6 < length2 - 1) {
                        a43 a43Var2 = a43VarArr2[i5][i7];
                        if (c <= a43Var2.b) {
                            if (a43Var2.p) {
                                float f12 = a43Var2.a;
                                float f13 = a43Var2.k;
                                float f14 = a43Var2.c;
                                fArr[i6] = g8e.b(a43Var2.e, f14, (c - f12) * f13, f14);
                                float f15 = a43Var2.d;
                                fArr[i6 + 1] = g8e.b(a43Var2.f, f15, (c - f12) * f13, f15);
                            } else {
                                a43Var2.c(c);
                                fArr[i6] = (a43Var2.n * a43Var2.h) + a43Var2.q;
                                fArr[i6 + 1] = (a43Var2.o * a43Var2.i) + a43Var2.r;
                            }
                            z2 = true;
                        }
                        i6 += 2;
                        i7++;
                    }
                    if (z2) {
                        break;
                    }
                    i5++;
                    i2 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i8 = 0; i8 < length4; i8++) {
                sj2Var7.e(fArr[i8], i8);
            }
        } else {
            int a = a(i);
            float c2 = c(a, i, true);
            vx40 vx40Var = this.a;
            k531 k531Var2 = (k531) wx40Var.b(vx40Var.a(a));
            if (k531Var2 != null && (sj2Var5 = k531Var2.a) != null) {
                sj2Var6 = sj2Var5;
            }
            k531 k531Var3 = (k531) wx40Var.b(vx40Var.a(a + 1));
            if (k531Var3 == null || (sj2Var4 = k531Var3.a) == null) {
                sj2Var4 = sj2Var2;
            }
            int b = sj2Var7.b();
            for (int i9 = 0; i9 < b; i9++) {
                sj2Var7.e((sj2Var4.a(i9) * c2) + ((1.0f - c2) * sj2Var6.a(i9)), i9);
            }
        }
        return sj2Var7;
    }

    @Override // defpackage.h531
    public final int r() {
        return 0;
    }
}
