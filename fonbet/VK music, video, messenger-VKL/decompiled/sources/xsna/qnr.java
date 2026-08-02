package xsna;

import java.util.Arrays;
import xsna.tnr;

/* compiled from: FlacMetadataReader.java */
/* loaded from: classes12.dex */
public final class qnr {
    public static tnr.a a(xi90 xi90Var) {
        xi90Var.Q(1);
        int F = xi90Var.F();
        long j = xi90Var.b + F;
        int i = F / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long w = xi90Var.w();
            if (w == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = w;
            jArr2[i2] = xi90Var.w();
            xi90Var.Q(2);
            i2++;
        }
        xi90Var.Q((int) (j - xi90Var.b));
        return new tnr.a(jArr, jArr2);
    }
}
