package defpackage;

import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class fz71 {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;

    public fz71(ArrayList arrayList, int i, int i2, int i3, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.f = str;
    }

    public static fz71 a(dl81 dl81Var) {
        byte[] bArr;
        float f;
        int i;
        int i2;
        String str;
        try {
            dl81Var.m(dl81Var.b + 4);
            int s = (dl81Var.s() & 3) + 1;
            if (s == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int s2 = dl81Var.s() & 31;
            int i3 = 0;
            while (true) {
                bArr = qfa1.a;
                if (i3 >= s2) {
                    break;
                }
                int x = dl81Var.x();
                int i4 = dl81Var.b;
                dl81Var.m(i4 + x);
                byte[] bArr2 = dl81Var.a;
                byte[] bArr3 = new byte[x + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i4, bArr3, 4, x);
                arrayList.add(bArr3);
                i3++;
            }
            int s3 = dl81Var.s();
            for (int i5 = 0; i5 < s3; i5++) {
                int x2 = dl81Var.x();
                int i6 = dl81Var.b;
                dl81Var.m(i6 + x2);
                byte[] bArr4 = dl81Var.a;
                byte[] bArr5 = new byte[x2 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i6, bArr5, 4, x2);
                arrayList.add(bArr5);
            }
            if (s2 > 0) {
                e571 g = sba1.g(s, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i7 = g.e;
                int i8 = g.f;
                f = g.g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(g.a), Integer.valueOf(g.b), Integer.valueOf(g.c));
                i = i7;
                i2 = i8;
            } else {
                f = 1.0f;
                i = -1;
                i2 = -1;
                str = null;
            }
            return new fz71(arrayList, s, i, i2, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            dy31.g(e, "Error parsing AVC config");
            return null;
        }
    }
}
