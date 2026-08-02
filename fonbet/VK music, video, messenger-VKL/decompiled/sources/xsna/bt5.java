package xsna;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import java.util.ArrayList;
import xsna.rt50;

/* compiled from: AvcConfig.java */
/* loaded from: classes12.dex */
public final class bt5 {
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

    @Nullable
    public final String l;

    public bt5(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, @Nullable String str) {
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

    public static bt5 a(xi90 xi90Var) throws ParserException {
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
            xi90Var.Q(4);
            int C = (xi90Var.C() & 3) + 1;
            if (C == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int C2 = xi90Var.C() & 31;
            for (int i9 = 0; i9 < C2; i9++) {
                int J = xi90Var.J();
                int i10 = xi90Var.b;
                xi90Var.Q(J);
                byte[] bArr = xi90Var.a;
                byte[] bArr2 = new byte[J + 4];
                System.arraycopy(tzf.a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i10, bArr2, 4, J);
                arrayList.add(bArr2);
            }
            int C3 = xi90Var.C();
            for (int i11 = 0; i11 < C3; i11++) {
                int J2 = xi90Var.J();
                int i12 = xi90Var.b;
                xi90Var.Q(J2);
                byte[] bArr3 = xi90Var.a;
                byte[] bArr4 = new byte[J2 + 4];
                System.arraycopy(tzf.a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i12, bArr4, 4, J2);
                arrayList.add(bArr4);
            }
            if (C2 > 0) {
                rt50.m k = rt50.k(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i13 = k.e;
                int i14 = k.f;
                int i15 = k.h + 8;
                int i16 = k.i + 8;
                int i17 = k.p;
                int i18 = k.q;
                int i19 = k.r;
                int i20 = k.s;
                float f2 = k.g;
                int i21 = k.a;
                int i22 = k.b;
                int i23 = k.c;
                byte[] bArr5 = tzf.a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23));
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
            return new bt5(arrayList, C, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing AVC config");
        }
    }
}
