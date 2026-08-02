package xsna;

import java.util.Arrays;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: ArcCurveFit.java */
/* loaded from: classes11.dex */
public final class bg3 extends emk {
    public final double[] a;
    public final a[] b;

    /* compiled from: ArcCurveFit.java */
    public static class a {
        public static final double[] s = new double[91];
        public double[] a;
        public double b;
        public double c;
        public double d;
        public double e;
        public double f;
        public double g;
        public double h;
        public double i;
        public double j;
        public double k;
        public double l;
        public double m;
        public double n;
        public double o;
        public double p;
        public boolean q;
        public boolean r;

        public final double a() {
            double d = this.j * this.p;
            double hypot = this.n / Math.hypot(d, (-this.k) * this.o);
            return this.q ? (-d) * hypot : d * hypot;
        }

        public final double b() {
            double d = this.j * this.p;
            double d2 = (-this.k) * this.o;
            double hypot = this.n / Math.hypot(d, d2);
            return this.q ? (-d2) * hypot : d2 * hypot;
        }

        public final double c(double d) {
            double d2 = (d - this.c) * this.i;
            double d3 = this.e;
            return ((this.f - d3) * d2) + d3;
        }

        public final double d(double d) {
            double d2 = (d - this.c) * this.i;
            double d3 = this.g;
            return ((this.h - d3) * d2) + d3;
        }

        public final double e() {
            return (this.j * this.o) + this.l;
        }

        public final double f() {
            return (this.k * this.p) + this.m;
        }

        public final void g(double d) {
            double d2 = (this.q ? this.d - d : d - this.c) * this.i;
            double d3 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            if (d2 > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                d3 = 1.0d;
                if (d2 < 1.0d) {
                    double[] dArr = this.a;
                    double length = d2 * (dArr.length - 1);
                    int i = (int) length;
                    double d4 = dArr[i];
                    d3 = ((dArr[i + 1] - d4) * (length - i)) + d4;
                }
            }
            double d5 = d3 * 1.5707963267948966d;
            this.o = Math.sin(d5);
            this.p = Math.cos(d5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0030, code lost:
    
        if (r5 == r3) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.bg3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bg3(int[] iArr, double[] dArr, double[][] dArr2) {
        double d;
        double d2;
        boolean z;
        int i;
        double[] dArr3;
        double d3;
        double[] dArr4 = dArr;
        ?? obj = new Object();
        obj.a = dArr4;
        int i2 = 1;
        obj.b = new a[dArr4.length - 1];
        char c = 0;
        int i3 = 0;
        int i4 = 1;
        int i5 = 1;
        bg3 bg3Var = obj;
        while (true) {
            a[] aVarArr = bg3Var.b;
            if (i3 >= aVarArr.length) {
                return;
            }
            int i6 = iArr[i3];
            if (i6 != 0) {
                if (i6 != i2) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 4) {
                                i5 = 4;
                            } else if (i6 == 5) {
                                i5 = 5;
                            }
                        }
                    }
                    i4 = 2;
                    i5 = i4;
                }
                i4 = i2;
                i5 = i4;
            } else {
                i5 = 3;
            }
            double d4 = dArr4[i3];
            int i7 = i3 + 1;
            double d5 = dArr4[i7];
            double[] dArr5 = dArr2[i3];
            double d6 = dArr5[c];
            int i8 = i2;
            int i9 = i3;
            double d7 = dArr5[i8];
            double[] dArr6 = dArr2[i7];
            boolean z2 = c;
            double d8 = dArr6[z2 ? 1 : 0];
            double d9 = dArr6[i8];
            a aVar = new a();
            aVar.r = z2;
            int i10 = i4;
            double d10 = d8 - d6;
            double d11 = d9 - d7;
            boolean z3 = i8;
            if (i5 != z3) {
                if (i5 == 4) {
                    aVar.q = d11 > ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                } else if (i5 != 5) {
                    aVar.q = false;
                } else {
                    aVar.q = d11 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                }
                d = d10;
                d2 = d4;
                z = true;
            } else {
                aVar.q = z3;
                d = d10;
                d2 = d4;
                z = z3;
            }
            aVar.c = d2;
            aVar.d = d5;
            double d12 = d5 - d2;
            double d13 = 1.0d / d12;
            aVar.i = d13;
            if (3 == i5) {
                aVar.r = z;
            }
            if (aVar.r || Math.abs(d) < 0.001d || Math.abs(d11) < 0.001d) {
                i = 1;
                aVar.r = true;
                aVar.e = d6;
                aVar.f = d8;
                aVar.g = d7;
                aVar.h = d9;
                double d14 = d;
                double hypot = Math.hypot(d11, d14);
                aVar.b = hypot;
                aVar.n = hypot * d13;
                aVar.l = d14 / d12;
                aVar.m = d11 / d12;
            } else {
                double[] dArr7 = new double[101];
                aVar.a = dArr7;
                boolean z4 = aVar.q;
                aVar.j = (z4 ? -1 : 1) * d;
                aVar.k = (z4 ? 1 : -1) * d11;
                aVar.l = z4 ? d8 : d6;
                aVar.m = z4 ? d7 : d9;
                double d15 = d7 - d9;
                double d16 = 0.0d;
                double d17 = 0.0d;
                double d18 = 0.0d;
                int i11 = 0;
                while (true) {
                    dArr3 = a.s;
                    if (i11 >= 91) {
                        break;
                    }
                    double[] dArr8 = dArr7;
                    double d19 = d15;
                    double radians = Math.toRadians((i11 * 90.0d) / 90);
                    double sin = d * Math.sin(radians);
                    double cos = Math.cos(radians) * d19;
                    if (i11 > 0) {
                        d3 = cos;
                        d16 += Math.hypot(sin - d17, d3 - d18);
                        dArr3[i11] = d16;
                    } else {
                        d3 = cos;
                    }
                    i11++;
                    d17 = sin;
                    d15 = d19;
                    d18 = d3;
                    dArr7 = dArr8;
                }
                double[] dArr9 = dArr7;
                aVar.b = d16;
                for (int i12 = 0; i12 < 91; i12++) {
                    dArr3[i12] = dArr3[i12] / d16;
                }
                for (int i13 = 0; i13 < 101; i13++) {
                    double d20 = i13 / 100;
                    int binarySearch = Arrays.binarySearch(dArr3, d20);
                    if (binarySearch >= 0) {
                        dArr9[i13] = binarySearch / 90;
                    } else if (binarySearch == -1) {
                        dArr9[i13] = 0.0d;
                    } else {
                        int i14 = -binarySearch;
                        int i15 = i14 - 2;
                        double d21 = dArr3[i15];
                        dArr9[i13] = (((d20 - d21) / (dArr3[i14 - 1] - d21)) + i15) / 90;
                    }
                }
                aVar.n = aVar.b * aVar.i;
                i = 1;
            }
            aVarArr[i9] = aVar;
            bg3Var = this;
            dArr4 = dArr;
            i2 = i;
            i3 = i7;
            i4 = i10;
            c = 0;
        }
    }

    @Override // xsna.emk
    public final double b(double d) {
        a[] aVarArr = this.b;
        a aVar = aVarArr[0];
        double d2 = aVar.c;
        if (d < d2) {
            double d3 = d - d2;
            if (aVar.r) {
                return (d3 * aVarArr[0].l) + aVar.c(d2);
            }
            aVar.g(d2);
            return (aVarArr[0].a() * d3) + aVarArr[0].e();
        }
        if (d > aVarArr[aVarArr.length - 1].d) {
            double d4 = aVarArr[aVarArr.length - 1].d;
            double d5 = d - d4;
            int length = aVarArr.length - 1;
            return (d5 * aVarArr[length].l) + aVarArr[length].c(d4);
        }
        for (int i = 0; i < aVarArr.length; i++) {
            a aVar2 = aVarArr[i];
            if (d <= aVar2.d) {
                if (aVar2.r) {
                    return aVar2.c(d);
                }
                aVar2.g(d);
                return aVarArr[i].e();
            }
        }
        return Double.NaN;
    }

    @Override // xsna.emk
    public final void c(double d, double[] dArr) {
        a[] aVarArr = this.b;
        a aVar = aVarArr[0];
        double d2 = aVar.c;
        if (d < d2) {
            double d3 = d - d2;
            if (aVar.r) {
                double c = aVar.c(d2);
                a aVar2 = aVarArr[0];
                dArr[0] = (aVar2.l * d3) + c;
                dArr[1] = (d3 * aVarArr[0].m) + aVar2.d(d2);
                return;
            }
            aVar.g(d2);
            dArr[0] = (aVarArr[0].a() * d3) + aVarArr[0].e();
            dArr[1] = (aVarArr[0].b() * d3) + aVarArr[0].f();
            return;
        }
        if (d <= aVarArr[aVarArr.length - 1].d) {
            for (int i = 0; i < aVarArr.length; i++) {
                a aVar3 = aVarArr[i];
                if (d <= aVar3.d) {
                    if (aVar3.r) {
                        dArr[0] = aVar3.c(d);
                        dArr[1] = aVarArr[i].d(d);
                        return;
                    } else {
                        aVar3.g(d);
                        dArr[0] = aVarArr[i].e();
                        dArr[1] = aVarArr[i].f();
                        return;
                    }
                }
            }
            return;
        }
        double d4 = aVarArr[aVarArr.length - 1].d;
        double d5 = d - d4;
        int length = aVarArr.length - 1;
        a aVar4 = aVarArr[length];
        if (aVar4.r) {
            double c2 = aVar4.c(d4);
            a aVar5 = aVarArr[length];
            dArr[0] = (aVar5.l * d5) + c2;
            dArr[1] = (d5 * aVarArr[length].m) + aVar5.d(d4);
            return;
        }
        aVar4.g(d);
        dArr[0] = (aVarArr[length].a() * d5) + aVarArr[length].e();
        dArr[1] = (aVarArr[length].b() * d5) + aVarArr[length].f();
    }

    @Override // xsna.emk
    public final void d(double d, float[] fArr) {
        a[] aVarArr = this.b;
        a aVar = aVarArr[0];
        double d2 = aVar.c;
        if (d < d2) {
            double d3 = d - d2;
            if (aVar.r) {
                double c = aVar.c(d2);
                a aVar2 = aVarArr[0];
                fArr[0] = (float) ((aVar2.l * d3) + c);
                fArr[1] = (float) ((d3 * aVarArr[0].m) + aVar2.d(d2));
                return;
            }
            aVar.g(d2);
            fArr[0] = (float) ((aVarArr[0].a() * d3) + aVarArr[0].e());
            fArr[1] = (float) ((aVarArr[0].b() * d3) + aVarArr[0].f());
            return;
        }
        if (d <= aVarArr[aVarArr.length - 1].d) {
            for (int i = 0; i < aVarArr.length; i++) {
                a aVar3 = aVarArr[i];
                if (d <= aVar3.d) {
                    if (aVar3.r) {
                        fArr[0] = (float) aVar3.c(d);
                        fArr[1] = (float) aVarArr[i].d(d);
                        return;
                    } else {
                        aVar3.g(d);
                        fArr[0] = (float) aVarArr[i].e();
                        fArr[1] = (float) aVarArr[i].f();
                        return;
                    }
                }
            }
            return;
        }
        double d4 = aVarArr[aVarArr.length - 1].d;
        double d5 = d - d4;
        int length = aVarArr.length - 1;
        a aVar4 = aVarArr[length];
        if (!aVar4.r) {
            aVar4.g(d);
            fArr[0] = (float) aVarArr[length].e();
            fArr[1] = (float) aVarArr[length].f();
        } else {
            double c2 = aVar4.c(d4);
            a aVar5 = aVarArr[length];
            fArr[0] = (float) ((aVar5.l * d5) + c2);
            fArr[1] = (float) ((d5 * aVarArr[length].m) + aVar5.d(d4));
        }
    }

    @Override // xsna.emk
    public final void e(double d, double[] dArr) {
        a[] aVarArr = this.b;
        double d2 = aVarArr[0].c;
        if (d < d2) {
            d = d2;
        } else if (d > aVarArr[aVarArr.length - 1].d) {
            d = aVarArr[aVarArr.length - 1].d;
        }
        for (int i = 0; i < aVarArr.length; i++) {
            a aVar = aVarArr[i];
            if (d <= aVar.d) {
                if (aVar.r) {
                    dArr[0] = aVar.l;
                    dArr[1] = aVar.m;
                    return;
                } else {
                    aVar.g(d);
                    dArr[0] = aVarArr[i].a();
                    dArr[1] = aVarArr[i].b();
                    return;
                }
            }
        }
    }

    @Override // xsna.emk
    public final double[] f() {
        return this.a;
    }
}
