package defpackage;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class ext {
    public final float[] a;
    public final int[] b;

    public ext(int[] iArr, float[] fArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public final void a(ext extVar) {
        int i = 0;
        while (true) {
            int[] iArr = extVar.b;
            if (i >= iArr.length) {
                return;
            }
            this.a[i] = extVar.a[i];
            this.b[i] = iArr[i];
            i++;
        }
    }

    public final ext b(float[] fArr) {
        int c;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.a;
            int binarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.b;
            if (binarySearch >= 0) {
                c = iArr2[binarySearch];
            } else {
                int i2 = -(binarySearch + 1);
                if (i2 == 0) {
                    c = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    c = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    c = xss.c((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                }
            }
            iArr[i] = c;
        }
        return new ext(iArr, fArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ext.class != obj.getClass()) {
            return false;
        }
        ext extVar = (ext) obj;
        return Arrays.equals(this.a, extVar.a) && Arrays.equals(this.b, extVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }
}
