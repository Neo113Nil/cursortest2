package defpackage;

import androidx.media3.common.ParserException;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class nb4 {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public nb4(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static nb4 a(ef90 ef90Var) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            ef90Var.L(4);
            int y = (ef90Var.y() & 3) + 1;
            if (y == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int y2 = ef90Var.y() & 31;
            for (int i9 = 0; i9 < y2; i9++) {
                int E = ef90Var.E();
                int i10 = ef90Var.b;
                ef90Var.L(E);
                byte[] bArr = ef90Var.a;
                byte[] bArr2 = new byte[E + 4];
                System.arraycopy(bac.a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i10, bArr2, 4, E);
                arrayList.add(bArr2);
            }
            int y3 = ef90Var.y();
            for (int i11 = 0; i11 < y3; i11++) {
                int E2 = ef90Var.E();
                int i12 = ef90Var.b;
                ef90Var.L(E2);
                byte[] bArr3 = ef90Var.a;
                byte[] bArr4 = new byte[E2 + 4];
                System.arraycopy(bac.a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i12, bArr4, 4, E2);
                arrayList.add(bArr4);
            }
            if (y2 > 0) {
                k150 j = l150.j(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i13 = j.e;
                int i14 = j.f;
                int i15 = j.h + 8;
                int i16 = j.i + 8;
                int i17 = j.p;
                int i18 = j.q;
                int i19 = j.r;
                int i20 = j.s;
                float f2 = j.g;
                str = bac.a(j.a, j.b, j.c);
                i4 = i18;
                i5 = i19;
                i6 = i20;
                f = f2;
                i2 = i14;
                i3 = i15;
                i7 = i16;
                i8 = i17;
                i = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new nb4(arrayList, y, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing AVC config");
        }
    }
}
