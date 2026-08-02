package defpackage;

import java.util.ArrayList;
import okio.ByteString;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes9.dex */
public final class otu {
    public final jci0 c;
    public int f;
    public int g;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public y8u[] d = new y8u[8];
    public int e = 7;

    public otu(guu guuVar) {
        this.c = new jci0(guuVar);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.e;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.d[length].c;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
            }
            y8u[] y8uVarArr = this.d;
            System.arraycopy(y8uVarArr, i2 + 1, y8uVarArr, i2 + 1 + i3, this.f);
            this.e += i3;
        }
        return i3;
    }

    public final ByteString b(int i) {
        if (i >= 0) {
            y8u[] y8uVarArr = qtu.a;
            if (i <= y8uVarArr.length - 1) {
                return y8uVarArr[i].a;
            }
        }
        int length = this.e + 1 + (i - qtu.a.length);
        if (length >= 0) {
            y8u[] y8uVarArr2 = this.d;
            if (length < y8uVarArr2.length) {
                return y8uVarArr2[length].a;
            }
        }
        yci0.s(i + 1, "Header index too large ");
        return null;
    }

    public final void c(y8u y8uVar) {
        this.b.add(y8uVar);
        int i = y8uVar.c;
        int i2 = this.a;
        if (i > i2) {
            f73.q(this.d, null);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i) - i2);
        int i3 = this.f + 1;
        y8u[] y8uVarArr = this.d;
        if (i3 > y8uVarArr.length) {
            y8u[] y8uVarArr2 = new y8u[y8uVarArr.length * 2];
            System.arraycopy(y8uVarArr, 0, y8uVarArr2, y8uVarArr.length, y8uVarArr.length);
            this.e = this.d.length - 1;
            this.d = y8uVarArr2;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.d[i4] = y8uVar;
        this.f++;
        this.g += i;
    }

    public final ByteString d() {
        jci0 jci0Var = this.c;
        byte readByte = jci0Var.readByte();
        byte[] bArr = yf61.a;
        int i = readByte & 255;
        int i2 = 0;
        boolean z = (readByte & DerValue.TAG_CONTEXT) == 128;
        long e = e(i, HProv.PP_VERSION_TIMESTAMP);
        if (!z) {
            return jci0Var.l0(e);
        }
        yp6 yp6Var = new yp6();
        k2v k2vVar = l2v.c;
        k2v k2vVar2 = k2vVar;
        int i3 = 0;
        for (long j = 0; j < e; j++) {
            byte readByte2 = jci0Var.readByte();
            byte[] bArr2 = yf61.a;
            i2 = (i2 << 8) | (readByte2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                k2vVar2 = k2vVar2.a[(i2 >>> (i3 - 8)) & 255];
                if (k2vVar2.a == null) {
                    yp6Var.e0(k2vVar2.b);
                    i3 -= k2vVar2.c;
                    k2vVar2 = k2vVar;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            k2v k2vVar3 = k2vVar2.a[(i2 << (8 - i3)) & 255];
            int i4 = k2vVar3.c;
            if (k2vVar3.a != null || i4 > i3) {
                break;
            }
            yp6Var.e0(k2vVar3.b);
            i3 -= i4;
            k2vVar2 = k2vVar;
        }
        return yp6Var.l0(yp6Var.b);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte readByte = this.c.readByte();
            byte[] bArr = yf61.a;
            int i5 = readByte & 255;
            if ((readByte & DerValue.TAG_CONTEXT) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (readByte & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
