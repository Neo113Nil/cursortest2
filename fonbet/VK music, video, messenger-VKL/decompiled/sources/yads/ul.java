package yads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class ul {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;

    public ul(ArrayList arrayList, int i, int i2, int i3, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.f = str;
    }

    public static ul a(kc2 kc2Var) {
        float f;
        String str;
        int i;
        int i2;
        try {
            kc2Var.e(kc2Var.b + 4);
            int m = (kc2Var.m() & 3) + 1;
            if (m == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int m2 = kc2Var.m() & 31;
            for (int i3 = 0; i3 < m2; i3++) {
                int r = kc2Var.r();
                int i4 = kc2Var.b;
                kc2Var.e(i4 + r);
                byte[] bArr = kc2Var.a;
                byte[] bArr2 = new byte[r + 4];
                System.arraycopy(jx.a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i4, bArr2, 4, r);
                arrayList.add(bArr2);
            }
            int m3 = kc2Var.m();
            for (int i5 = 0; i5 < m3; i5++) {
                int r2 = kc2Var.r();
                int i6 = kc2Var.b;
                kc2Var.e(i6 + r2);
                byte[] bArr3 = kc2Var.a;
                byte[] bArr4 = new byte[r2 + 4];
                System.arraycopy(jx.a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i6, bArr4, 4, r2);
                arrayList.add(bArr4);
            }
            if (m2 > 0) {
                dz1 b = ez1.b((byte[]) arrayList.get(0), m, ((byte[]) arrayList.get(0)).length);
                int i7 = b.e;
                int i8 = b.f;
                f = b.g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(b.a), Integer.valueOf(b.b), Integer.valueOf(b.c));
                i = i7;
                i2 = i8;
            } else {
                f = 1.0f;
                str = null;
                i = -1;
                i2 = -1;
            }
            return new ul(arrayList, m, i, i2, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new pc2("Error parsing AVC config", e, true, 1);
        }
    }
}
