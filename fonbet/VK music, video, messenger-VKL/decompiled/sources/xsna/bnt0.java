package xsna;

import java.util.Arrays;

/* compiled from: VideoTrimmerMp4Parser.kt */
/* loaded from: classes3.dex */
public final class bnt0 {
    public static fye0 a(uep0 uep0Var, fye0 fye0Var, boolean z) {
        long[] Q3 = uep0Var.Q3();
        long[] B3 = uep0Var.B3();
        long j = uep0Var.i3().c;
        int length = uep0Var.B3().length;
        long[] jArr = new long[length];
        long j2 = 0;
        int i = 0;
        long j3 = 0;
        long j4 = 0;
        for (long j5 : Q3) {
            j3++;
            if (Arrays.binarySearch(B3, j3) >= 0) {
                jArr[Arrays.binarySearch(B3, j3)] = j4;
            }
            j4 += j5;
        }
        long j6 = jArr[length - 1];
        while (true) {
            if (i >= length) {
                break;
            }
            long j7 = jArr[i];
            if (fye0Var.a(j7, j) < 0) {
                j6 = z ? j7 : j2;
            } else {
                i++;
                j2 = j7;
            }
        }
        return new fye0(j6, j);
    }
}
