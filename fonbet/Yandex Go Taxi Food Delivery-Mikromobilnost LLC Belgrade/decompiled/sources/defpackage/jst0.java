package defpackage;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* loaded from: classes10.dex */
public abstract class jst0 {
    public mif a;
    public int[] b = new int[10];
    public float[] c = new float[10];
    public int d;
    public String e;

    public final float a(float f) {
        return (float) this.a.b(f);
    }

    public void b(float f, int i) {
        int[] iArr = this.b;
        if (iArr.length < this.d + 1) {
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.c;
            this.c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.b;
        int i2 = this.d;
        iArr2[i2] = i;
        this.c[i2] = f;
        this.d = i2 + 1;
    }

    public void c(int i) {
        int i2;
        int i3 = this.d;
        if (i3 == 0) {
            return;
        }
        int[] iArr = this.b;
        float[] fArr = this.c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i3 - 1;
        iArr2[1] = 0;
        int i4 = 2;
        while (i4 > 0) {
            int i5 = i4 - 1;
            int i6 = iArr2[i5];
            int i7 = i4 - 2;
            int i8 = iArr2[i7];
            if (i6 < i8) {
                int i9 = iArr[i8];
                int i10 = i6;
                int i11 = i10;
                while (i10 < i8) {
                    int i12 = iArr[i10];
                    if (i12 <= i9) {
                        int i13 = iArr[i11];
                        iArr[i11] = i12;
                        iArr[i10] = i13;
                        float f = fArr[i11];
                        fArr[i11] = fArr[i10];
                        fArr[i10] = f;
                        i11++;
                    }
                    i10++;
                }
                int i14 = iArr[i11];
                iArr[i11] = iArr[i8];
                iArr[i8] = i14;
                float f2 = fArr[i11];
                fArr[i11] = fArr[i8];
                fArr[i8] = f2;
                iArr2[i7] = i11 - 1;
                iArr2[i5] = i6;
                int i15 = i4 + 1;
                iArr2[i4] = i8;
                i4 += 2;
                iArr2[i15] = i11 + 1;
            } else {
                i4 = i7;
            }
        }
        int i16 = 1;
        for (int i17 = 1; i17 < this.d; i17++) {
            int[] iArr3 = this.b;
            if (iArr3[i17 - 1] != iArr3[i17]) {
                i16++;
            }
        }
        double[] dArr = new double[i16];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i16, 1);
        int i18 = 0;
        for (0; i2 < this.d; i2 + 1) {
            if (i2 > 0) {
                int[] iArr4 = this.b;
                i2 = iArr4[i2] == iArr4[i2 - 1] ? i2 + 1 : 0;
            }
            dArr[i18] = this.b[i2] * 0.01d;
            dArr2[i18][0] = this.c[i2];
            i18++;
        }
        this.a = mif.a(i, dArr, dArr2);
    }

    public final String toString() {
        String str = this.e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.d; i++) {
            StringBuilder v = oyr.v(str, "[");
            v.append(this.b[i]);
            v.append(" , ");
            v.append(decimalFormat.format(this.c[i]));
            v.append("] ");
            str = v.toString();
        }
        return str;
    }
}
