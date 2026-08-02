package xsna;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.List;
import xsna.rt50;

/* compiled from: HevcConfig.java */
/* loaded from: classes12.dex */
public final class f2v {
    public final List<byte[]> a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;

    @Nullable
    public final String n;

    @Nullable
    public final rt50.k o;

    public f2v(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, @Nullable String str, @Nullable rt50.k kVar) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = f;
        this.m = i11;
        this.n = str;
        this.o = kVar;
    }

    public static f2v a(xi90 xi90Var, boolean z, @Nullable rt50.k kVar) throws ParserException {
        boolean z2;
        rt50.g h;
        int i;
        int i2 = 4;
        try {
            if (z) {
                xi90Var.Q(4);
            } else {
                xi90Var.Q(21);
            }
            int C = xi90Var.C() & 3;
            int C2 = xi90Var.C();
            int i3 = xi90Var.b;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                z2 = true;
                if (i5 >= C2) {
                    break;
                }
                xi90Var.Q(1);
                int J = xi90Var.J();
                for (int i7 = 0; i7 < J; i7++) {
                    int J2 = xi90Var.J();
                    i6 += J2 + 4;
                    xi90Var.Q(J2);
                }
                i5++;
            }
            xi90Var.P(i3);
            byte[] bArr = new byte[i6];
            rt50.k kVar2 = kVar;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            float f = 1.0f;
            String str = null;
            int i18 = 0;
            int i19 = 0;
            while (i18 < C2) {
                int C3 = xi90Var.C() & 63;
                int J3 = xi90Var.J();
                int i20 = i4;
                rt50.k kVar3 = kVar2;
                while (i20 < J3) {
                    boolean z3 = z2;
                    int J4 = xi90Var.J();
                    int i21 = C;
                    System.arraycopy(rt50.a, i4, bArr, i19, i2);
                    int i22 = i19 + 4;
                    System.arraycopy(xi90Var.a, xi90Var.b, bArr, i22, J4);
                    if (C3 == 32 && i20 == 0) {
                        kVar3 = rt50.j(i22, i22 + J4, bArr);
                    } else {
                        if (C3 == 33 && i20 == 0) {
                            rt50.h i23 = rt50.i(bArr, i22, i22 + J4, kVar3);
                            i8 = i23.a + 1;
                            i9 = i23.h;
                            int i24 = i23.i;
                            i11 = i23.d + 8;
                            i12 = i23.e + 8;
                            int i25 = i23.l;
                            i10 = i24;
                            int i26 = i23.m;
                            int i27 = i23.n;
                            float f2 = i23.j;
                            int i28 = i23.k;
                            rt50.c cVar = i23.b;
                            if (cVar != null) {
                                i = i28;
                                str = tzf.a(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, cVar.f);
                            } else {
                                i = i28;
                            }
                            i17 = i;
                            f = f2;
                            i15 = i27;
                            i14 = i26;
                            i13 = i25;
                        } else if (C3 == 39 && i20 == 0 && (h = rt50.h(i22, i22 + J4, bArr)) != null && kVar3 != null) {
                            i4 = 0;
                            i16 = h.a == kVar3.a.get(0).b ? 4 : 5;
                        }
                        i4 = 0;
                    }
                    i19 = i22 + J4;
                    xi90Var.Q(J4);
                    i20++;
                    z2 = z3;
                    C = i21;
                    i2 = 4;
                }
                i18++;
                kVar2 = kVar3;
                i2 = 4;
            }
            return new f2v(i6 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), C + 1, i8, i9, i10, i11, i12, i13, i14, i15, i16, f, i17, str, kVar2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing".concat(z ? "L-HEVC config" : "HEVC config"));
        }
    }
}
