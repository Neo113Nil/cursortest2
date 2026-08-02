package defpackage;

/* loaded from: classes10.dex */
public final class miy extends mif {
    public double[] a;
    public double[][] b;
    public boolean c;
    public double[] d;

    @Override // defpackage.mif
    public final double b(double d) {
        double d2;
        double d3;
        double e;
        double[][] dArr = this.b;
        double[] dArr2 = this.a;
        int length = dArr2.length;
        if (this.c) {
            double d4 = dArr2[0];
            if (d <= d4) {
                d2 = dArr[0][0];
                d3 = d - d4;
                e = e(d4);
            } else {
                int i = length - 1;
                double d5 = dArr2[i];
                if (d >= d5) {
                    d2 = dArr[i][0];
                    d3 = d - d5;
                    e = e(d5);
                }
            }
            return (e * d3) + d2;
        }
        if (d <= dArr2[0]) {
            return dArr[0][0];
        }
        int i2 = length - 1;
        if (d >= dArr2[i2]) {
            return dArr[i2][0];
        }
        int i3 = 0;
        while (i3 < length - 1) {
            double d6 = dArr2[i3];
            if (d == d6) {
                return dArr[i3][0];
            }
            int i4 = i3 + 1;
            double d7 = dArr2[i4];
            if (d < d7) {
                double d8 = (d - d6) / (d7 - d6);
                return (dArr[i4][0] * d8) + ((1.0d - d8) * dArr[i3][0]);
            }
            i3 = i4;
        }
        return 0.0d;
    }

    @Override // defpackage.mif
    public final void c(double d, double[] dArr) {
        double[] dArr2 = this.d;
        double[] dArr3 = this.a;
        int length = dArr3.length;
        double[][] dArr4 = this.b;
        int i = 0;
        int length2 = dArr4[0].length;
        if (this.c) {
            double d2 = dArr3[0];
            if (d <= d2) {
                f(d2, dArr2);
                for (int i2 = 0; i2 < length2; i2++) {
                    dArr[i2] = ((d - dArr3[0]) * dArr2[i2]) + dArr4[0][i2];
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr3[i3];
            if (d >= d3) {
                f(d3, dArr2);
                while (i < length2) {
                    dArr[i] = ((d - dArr3[i3]) * dArr2[i]) + dArr4[i3][i];
                    i++;
                }
                return;
            }
        } else {
            if (d <= dArr3[0]) {
                for (int i4 = 0; i4 < length2; i4++) {
                    dArr[i4] = dArr4[0][i4];
                }
                return;
            }
            int i5 = length - 1;
            if (d >= dArr3[i5]) {
                while (i < length2) {
                    dArr[i] = dArr4[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == dArr3[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    dArr[i7] = dArr4[i6][i7];
                }
            }
            int i8 = i6 + 1;
            double d4 = dArr3[i8];
            if (d < d4) {
                double d5 = dArr3[i6];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    dArr[i] = (dArr4[i8][i] * d6) + ((1.0d - d6) * dArr4[i6][i]);
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    @Override // defpackage.mif
    public final void d(double d, float[] fArr) {
        double[] dArr = this.d;
        double[] dArr2 = this.a;
        int length = dArr2.length;
        double[][] dArr3 = this.b;
        int i = 0;
        int length2 = dArr3[0].length;
        if (this.c) {
            double d2 = dArr2[0];
            if (d <= d2) {
                f(d2, dArr);
                for (int i2 = 0; i2 < length2; i2++) {
                    fArr[i2] = (float) (((d - dArr2[0]) * dArr[i2]) + dArr3[0][i2]);
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr2[i3];
            if (d >= d3) {
                f(d3, dArr);
                while (i < length2) {
                    fArr[i] = (float) (((d - dArr2[i3]) * dArr[i]) + dArr3[i3][i]);
                    i++;
                }
                return;
            }
        } else {
            if (d <= dArr2[0]) {
                for (int i4 = 0; i4 < length2; i4++) {
                    fArr[i4] = (float) dArr3[0][i4];
                }
                return;
            }
            int i5 = length - 1;
            if (d >= dArr2[i5]) {
                while (i < length2) {
                    fArr[i] = (float) dArr3[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == dArr2[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    fArr[i7] = (float) dArr3[i6][i7];
                }
            }
            int i8 = i6 + 1;
            double d4 = dArr2[i8];
            if (d < d4) {
                double d5 = dArr2[i6];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    fArr[i] = (float) ((dArr3[i8][i] * d6) + ((1.0d - d6) * dArr3[i6][i]));
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0012, code lost:
    
        if (r9 >= r3) goto L4;
     */
    @Override // defpackage.mif
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final double e(double d) {
        double[] dArr = this.a;
        int length = dArr.length;
        double d2 = dArr[0];
        if (d >= d2) {
            d2 = dArr[length - 1];
        }
        d = d2;
        int i = 0;
        while (i < length - 1) {
            int i2 = i + 1;
            double d3 = dArr[i2];
            if (d <= d3) {
                double d4 = d3 - dArr[i];
                double[][] dArr2 = this.b;
                return (dArr2[i2][0] - dArr2[i][0]) / d4;
            }
            i = i2;
        }
        return 0.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0017, code lost:
    
        if (r10 >= r4) goto L4;
     */
    @Override // defpackage.mif
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(double d, double[] dArr) {
        double[] dArr2 = this.a;
        int length = dArr2.length;
        double[][] dArr3 = this.b;
        int length2 = dArr3[0].length;
        double d2 = dArr2[0];
        if (d > d2) {
            d2 = dArr2[length - 1];
        }
        d = d2;
        int i = 0;
        while (i < length - 1) {
            int i2 = i + 1;
            double d3 = dArr2[i2];
            if (d <= d3) {
                double d4 = d3 - dArr2[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    dArr[i3] = (dArr3[i2][i3] - dArr3[i][i3]) / d4;
                }
                return;
            }
            i = i2;
        }
    }

    @Override // defpackage.mif
    public final double[] g() {
        return this.a;
    }
}
