package defpackage;

import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class pfu {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final int k;
    public final String l;
    public final dt20 m;

    public pfu(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, int i9, String str, dt20 dt20Var) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = f;
        this.k = i9;
        this.l = str;
        this.m = dt20Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static pfu a(ef90 ef90Var, boolean z, dt20 dt20Var) {
        boolean z2;
        dn60 g;
        int i;
        int i2 = 4;
        try {
            if (z) {
                ef90Var.L(4);
            } else {
                ef90Var.L(21);
            }
            int y = ef90Var.y() & 3;
            int y2 = ef90Var.y();
            int i3 = ef90Var.b;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                z2 = true;
                if (i5 >= y2) {
                    break;
                }
                ef90Var.L(1);
                int E = ef90Var.E();
                for (int i7 = 0; i7 < E; i7++) {
                    int E2 = ef90Var.E();
                    i6 += E2 + 4;
                    ef90Var.L(E2);
                }
                i5++;
            }
            ef90Var.K(i3);
            byte[] bArr = new byte[i6];
            dt20 dt20Var2 = dt20Var;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            float f = 1.0f;
            String str = null;
            int i16 = 0;
            int i17 = 0;
            while (i16 < y2) {
                int y3 = ef90Var.y() & 63;
                int E3 = ef90Var.E();
                int i18 = i4;
                dt20 dt20Var3 = dt20Var2;
                while (i18 < E3) {
                    boolean z3 = z2;
                    int E4 = ef90Var.E();
                    int i19 = y;
                    System.arraycopy(l150.a, i4, bArr, i17, i2);
                    int i20 = i17 + 4;
                    System.arraycopy(ef90Var.a, ef90Var.b, bArr, i20, E4);
                    if (y3 == 32 && i18 == 0) {
                        dt20Var3 = l150.i(i20, i20 + E4, bArr);
                    } else {
                        if (y3 == 33 && i18 == 0) {
                            h150 h = l150.h(bArr, i20, i20 + E4, dt20Var3);
                            i8 = h.a + 1;
                            i9 = h.c + 8;
                            i10 = h.d + 8;
                            int i21 = h.i;
                            int i22 = h.j;
                            i11 = i21;
                            int i23 = h.k;
                            float f2 = h.g;
                            int i24 = h.h;
                            e150 e150Var = h.b;
                            if (e150Var != null) {
                                i = i24;
                                str = bac.b(e150Var.a, e150Var.b, e150Var.c, e150Var.d, e150Var.e, e150Var.f);
                            } else {
                                i = i24;
                            }
                            i15 = i;
                            f = f2;
                            i13 = i23;
                            i12 = i22;
                        } else if (y3 == 39 && i18 == 0 && (g = l150.g(i20, i20 + E4, bArr)) != null && dt20Var3 != null) {
                            i4 = 0;
                            i14 = g.b == ((d150) ((ImmutableList) dt20Var3.b).get(0)).b ? 4 : 5;
                        }
                        i4 = 0;
                    }
                    i17 = i20 + E4;
                    ef90Var.L(E4);
                    i18++;
                    z2 = z3;
                    y = i19;
                    i2 = 4;
                }
                i16++;
                dt20Var2 = dt20Var3;
                i2 = 4;
            }
            return new pfu(i6 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), y + 1, i8, i9, i10, i11, i12, i13, i14, f, i15, str, dt20Var2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing".concat(z ? "L-HEVC config" : "HEVC config"));
        }
    }
}
