package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* compiled from: FontScaleConverterTable.android.kt */
/* loaded from: classes11.dex */
public final class s5s implements q5s {
    public final float[] a;
    public final float[] b;

    /* compiled from: FontScaleConverterTable.android.kt */
    public static final class a {
        public static final float a(float[] fArr, float[] fArr2, float f) {
            float f2;
            float f3;
            float f4;
            float f5;
            float abs = Math.abs(f);
            float signum = Math.signum(f);
            int binarySearch = Arrays.binarySearch(fArr, abs);
            if (binarySearch >= 0) {
                return signum * fArr2[binarySearch];
            }
            int i = -(binarySearch + 1);
            int i2 = i - 1;
            if (i2 >= fArr.length - 1) {
                float f6 = fArr[fArr.length - 1];
                return f6 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (fArr2[fArr.length - 1] / f6) * f;
            }
            if (i2 == -1) {
                f3 = fArr[0];
                f5 = fArr2[0];
                f2 = 0.0f;
                f4 = 0.0f;
            } else {
                f2 = fArr[i2];
                f3 = fArr[i];
                f4 = fArr2[i2];
                f5 = fArr2[i];
            }
            return (((f5 - f4) * Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(1.0f, f2 == f3 ? 0.0f : (abs - f2) / (f3 - f2)))) + f4) * signum;
        }
    }

    public s5s(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.a = fArr;
        this.b = fArr2;
    }

    @Override // xsna.q5s
    public final float a(float f) {
        return a.a(this.a, this.b, f);
    }

    @Override // xsna.q5s
    public final float b(float f) {
        return a.a(this.b, this.a, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s5s)) {
            return false;
        }
        s5s s5sVar = (s5s) obj;
        return Arrays.equals(this.a, s5sVar.a) && Arrays.equals(this.b, s5sVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FontScaleConverter{fromSpValues=" + Arrays.toString(this.a) + ", toDpValues=" + Arrays.toString(this.b) + '}';
    }
}
