package yads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class x01 {
    public final List a;
    public final int b;
    public final float c;
    public final String d;

    public x01(List list, int i, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = f;
        this.d = str;
    }

    public static x01 a(kc2 kc2Var) {
        boolean z;
        int i;
        boolean z2 = true;
        try {
            kc2Var.e(kc2Var.b + 21);
            int m = kc2Var.m() & 3;
            int m2 = kc2Var.m();
            int i2 = kc2Var.b;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < m2; i5++) {
                kc2Var.e(kc2Var.b + 1);
                int r = kc2Var.r();
                for (int i6 = 0; i6 < r; i6++) {
                    int r2 = kc2Var.r();
                    i4 += r2 + 4;
                    kc2Var.e(kc2Var.b + r2);
                }
            }
            kc2Var.e(i2);
            byte[] bArr = new byte[i4];
            float f = 1.0f;
            String str = null;
            int i7 = 0;
            int i8 = 0;
            while (i7 < m2) {
                int m3 = kc2Var.m() & 127;
                int r3 = kc2Var.r();
                int i9 = i3;
                while (i9 < r3) {
                    int r4 = kc2Var.r();
                    z = z2;
                    try {
                        System.arraycopy(ez1.a, i3, bArr, i8, 4);
                        int i10 = i8 + 4;
                        System.arraycopy(kc2Var.a, kc2Var.b, bArr, i10, r4);
                        if (m3 == 33 && i9 == 0) {
                            bz1 a = ez1.a(bArr, i10, i10 + r4);
                            f = a.g;
                            i = m;
                            str = jx.a(a.a, a.b, a.c, a.d, a.e, a.f);
                        } else {
                            i = m;
                        }
                        i8 = i10 + r4;
                        kc2Var.e(kc2Var.b + r4);
                        i9++;
                        z2 = z;
                        m = i;
                        i3 = 0;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        e = e;
                        boolean z3 = z;
                        throw new pc2("Error parsing HEVC config", e, z3, z3 ? 1 : 0);
                    }
                }
                i7++;
                i3 = 0;
            }
            z = z2;
            return new x01(i4 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), m + 1, f, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            e = e2;
            z = z2;
        }
    }
}
