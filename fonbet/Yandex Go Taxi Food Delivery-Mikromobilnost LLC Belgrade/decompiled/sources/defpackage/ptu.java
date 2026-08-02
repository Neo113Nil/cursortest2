package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import okio.ByteString;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes9.dex */
public final class ptu {
    public final yp6 a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public y8u[] e = new y8u[8];
    public int f = 7;

    public ptu(yp6 yp6Var) {
        this.a = yp6Var;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.e[length].c;
                i -= i4;
                this.h -= i4;
                this.g--;
                i3++;
                length--;
            }
            y8u[] y8uVarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(y8uVarArr, i5, y8uVarArr, i5 + i3, this.g);
            y8u[] y8uVarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(y8uVarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(y8u y8uVar) {
        int i = y8uVar.c;
        int i2 = this.d;
        if (i > i2) {
            y8u[] y8uVarArr = this.e;
            Arrays.fill(y8uVarArr, 0, y8uVarArr.length, (Object) null);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        y8u[] y8uVarArr2 = this.e;
        if (i3 > y8uVarArr2.length) {
            y8u[] y8uVarArr3 = new y8u[y8uVarArr2.length * 2];
            System.arraycopy(y8uVarArr2, 0, y8uVarArr3, y8uVarArr2.length, y8uVarArr2.length);
            this.f = this.e.length - 1;
            this.e = y8uVarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = y8uVar;
        this.g++;
        this.h += i;
    }

    public final void c(ByteString byteString) {
        int[] iArr = l2v.a;
        int h = byteString.h();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < h; i++) {
            byte m = byteString.m(i);
            byte[] bArr = yf61.a;
            j2 += l2v.b[m & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int h2 = byteString.h();
        yp6 yp6Var = this.a;
        if (i2 >= h2) {
            e(byteString.h(), HProv.PP_VERSION_TIMESTAMP, 0);
            yp6Var.b0(byteString);
            return;
        }
        yp6 yp6Var2 = new yp6();
        int[] iArr2 = l2v.a;
        int h3 = byteString.h();
        int i3 = 0;
        for (int i4 = 0; i4 < h3; i4++) {
            byte m2 = byteString.m(i4);
            byte[] bArr2 = yf61.a;
            int i5 = m2 & 255;
            int i6 = l2v.a[i5];
            byte b = l2v.b[i5];
            j = (j << b) | i6;
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                yp6Var2.e0((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            yp6Var2.e0((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        ByteString l0 = yp6Var2.l0(yp6Var2.b);
        e(l0.h(), HProv.PP_VERSION_TIMESTAMP, 128);
        yp6Var.b0(l0);
    }

    public final void d(ArrayList arrayList) {
        int i;
        int i2;
        if (this.c) {
            int i3 = this.b;
            if (i3 < this.d) {
                e(i3, 31, 32);
            }
            this.c = false;
            this.b = Integer.MAX_VALUE;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            y8u y8uVar = (y8u) arrayList.get(i4);
            ByteString u = y8uVar.a.u();
            ByteString byteString = y8uVar.b;
            Integer num = (Integer) qtu.b.get(u);
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    y8u[] y8uVarArr = qtu.a;
                    if (jl40.l(y8uVarArr[intValue].b, byteString)) {
                        i = i2;
                    } else if (jl40.l(y8uVarArr[i2].b, byteString)) {
                        i2 = intValue + 2;
                        i = i2;
                    }
                }
                i = i2;
                i2 = -1;
            } else {
                i = -1;
                i2 = -1;
            }
            if (i2 == -1) {
                int i5 = this.f + 1;
                int length = this.e.length;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    if (jl40.l(this.e[i5].a, u)) {
                        if (jl40.l(this.e[i5].b, byteString)) {
                            i2 = qtu.a.length + (i5 - this.f);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.f) + qtu.a.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                e(i2, HProv.PP_VERSION_TIMESTAMP, 128);
            } else if (i == -1) {
                this.a.e0(64);
                c(u);
                c(byteString);
                b(y8uVar);
            } else {
                ByteString byteString2 = y8u.d;
                u.getClass();
                if (!u.q(byteString2, 0, byteString2.h()) || jl40.l(y8u.i, u)) {
                    e(i, 63, 64);
                    c(byteString);
                    b(y8uVar);
                } else {
                    e(i, 15, 0);
                    c(byteString);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        yp6 yp6Var = this.a;
        if (i < i2) {
            yp6Var.e0(i | i3);
            return;
        }
        yp6Var.e0(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            yp6Var.e0(128 | (i4 & HProv.PP_VERSION_TIMESTAMP));
            i4 >>>= 7;
        }
        yp6Var.e0(i4);
    }
}
