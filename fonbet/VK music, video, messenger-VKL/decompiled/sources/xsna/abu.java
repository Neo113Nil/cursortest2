package xsna;

import java.util.Arrays;

/* compiled from: GradientColor.java */
/* loaded from: classes12.dex */
public final class abu {
    public final float[] a;
    public final int[] b;

    public abu(int[] iArr, float[] fArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public final void a(abu abuVar) {
        int i = 0;
        while (true) {
            int[] iArr = abuVar.b;
            if (i >= iArr.length) {
                return;
            }
            this.a[i] = abuVar.a[i];
            this.b[i] = iArr[i];
            i++;
        }
    }

    public final abu b(float[] fArr) {
        int p;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.a;
            int binarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.b;
            if (binarySearch >= 0) {
                p = iArr2[binarySearch];
            } else {
                int i2 = -(binarySearch + 1);
                if (i2 == 0) {
                    p = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    p = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    p = zq70.p((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                }
            }
            iArr[i] = p;
        }
        return new abu(iArr, fArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && abu.class == obj.getClass()) {
            abu abuVar = (abu) obj;
            if (Arrays.equals(this.a, abuVar.a) && Arrays.equals(this.b, abuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }
}
