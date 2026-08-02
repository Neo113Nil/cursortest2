package yads;

import java.util.Arrays;

/* loaded from: classes10.dex */
public abstract class xv0 {
    public static bw0 a(kc2 kc2Var) {
        kc2Var.e(kc2Var.b + 1);
        int o = kc2Var.o();
        long j = kc2Var.b + o;
        int i = o / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long i3 = kc2Var.i();
            if (i3 == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = i3;
            jArr2[i2] = kc2Var.i();
            kc2Var.e(kc2Var.b + 2);
            i2++;
        }
        int i4 = kc2Var.b;
        kc2Var.e(i4 + ((int) (j - i4)));
        return new bw0(jArr, jArr2);
    }
}
