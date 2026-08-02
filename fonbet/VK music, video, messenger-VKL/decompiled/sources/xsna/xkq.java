package xsna;

/* compiled from: FastFloatMath.java */
/* loaded from: classes12.dex */
public final class xkq {
    public static final float[] a = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};

    public static float a(int i, long j, boolean z) {
        if (-10 <= i && i <= 10 && Long.compareUnsigned(j, 16777215L) <= 0) {
            float f = j;
            float[] fArr = a;
            float f2 = i < 0 ? f / fArr[-i] : f * fArr[i];
            return z ? -f2 : f2;
        }
        long j2 = wkq.a[i + 325];
        long j3 = ((i * 217706) >> 16) + 191;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j);
        long j4 = alq.d(j << numberOfLeadingZeros, j2).a;
        long j5 = j4 >>> 63;
        long j6 = j4 >>> ((int) (38 + j5));
        int i2 = numberOfLeadingZeros + ((int) (j5 ^ 1));
        long j7 = j4 & 274877906943L;
        if (j7 != 274877906943L) {
            if (j7 != 0 || (3 & j6) != 1) {
                long j8 = (j6 + 1) >>> 1;
                if (j8 >= 16777216) {
                    i2--;
                    j8 = 8388608;
                }
                long j9 = j8 & (-8388609);
                long j10 = j3 - i2;
                if (j10 >= 1 && j10 <= 254) {
                    return Float.intBitsToFloat((int) (j9 | (j10 << 23) | (z ? 2147483648L : 0L)));
                }
            }
        }
        return Float.NaN;
    }
}
