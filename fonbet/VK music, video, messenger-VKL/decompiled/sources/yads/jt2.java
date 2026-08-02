package yads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class jt2 {
    public final qe a;
    public final int b;
    public final kc2 c;
    public it2 d;
    public it2 e;
    public it2 f;
    public long g;

    public jt2(qe qeVar) {
        this.a = qeVar;
        int b = ((ib0) qeVar).b();
        this.b = b;
        this.c = new kc2(32);
        it2 it2Var = new it2(b, 0L);
        this.d = it2Var;
        this.e = it2Var;
        this.f = it2Var;
    }

    public final void a(it2 it2Var) {
        if (it2Var.c == null) {
            return;
        }
        ib0 ib0Var = (ib0) this.a;
        synchronized (ib0Var) {
            it2 it2Var2 = it2Var;
            while (it2Var2 != null) {
                try {
                    pe[] peVarArr = ib0Var.g;
                    int i = ib0Var.f;
                    ib0Var.f = i + 1;
                    pe peVar = it2Var2.c;
                    peVar.getClass();
                    peVarArr[i] = peVar;
                    ib0Var.e--;
                    it2Var2 = it2Var2.d;
                    if (it2Var2 != null && it2Var2.c != null) {
                    }
                    it2Var2 = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ib0Var.notifyAll();
        }
        it2Var.c = null;
        it2Var.d = null;
    }

    public final void a(long j) {
        it2 it2Var;
        if (j == -1) {
            return;
        }
        while (true) {
            it2Var = this.d;
            if (j < it2Var.b) {
                break;
            }
            qe qeVar = this.a;
            pe peVar = it2Var.c;
            ib0 ib0Var = (ib0) qeVar;
            synchronized (ib0Var) {
                pe[] peVarArr = ib0Var.g;
                int i = ib0Var.f;
                ib0Var.f = i + 1;
                peVarArr[i] = peVar;
                ib0Var.e--;
                ib0Var.notifyAll();
            }
            it2 it2Var2 = this.d;
            it2Var2.c = null;
            it2 it2Var3 = it2Var2.d;
            it2Var2.d = null;
            this.d = it2Var3;
        }
        if (this.e.a < it2Var.a) {
            this.e = it2Var;
        }
    }

    public static it2 a(it2 it2Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= it2Var.b) {
            it2Var = it2Var.d;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (it2Var.b - j));
            pe peVar = it2Var.c;
            byteBuffer.put(peVar.a, ((int) (j - it2Var.a)) + peVar.b, min);
            i -= min;
            j += min;
            if (j == it2Var.b) {
                it2Var = it2Var.d;
            }
        }
        return it2Var;
    }

    public static it2 a(it2 it2Var, long j, byte[] bArr, int i) {
        while (j >= it2Var.b) {
            it2Var = it2Var.d;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (it2Var.b - j));
            pe peVar = it2Var.c;
            System.arraycopy(peVar.a, ((int) (j - it2Var.a)) + peVar.b, bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == it2Var.b) {
                it2Var = it2Var.d;
            }
        }
        return it2Var;
    }

    public static it2 a(it2 it2Var, sa0 sa0Var, kt2 kt2Var, kc2 kc2Var) {
        it2 it2Var2;
        if (sa0Var.b(1073741824)) {
            long j = kt2Var.b;
            int i = 1;
            kc2Var.c(1);
            it2 a = a(it2Var, j, kc2Var.a, 1);
            long j2 = j + 1;
            byte b = kc2Var.a[0];
            boolean z = (b & 128) != 0;
            int i2 = b & Byte.MAX_VALUE;
            m20 m20Var = sa0Var.c;
            byte[] bArr = m20Var.a;
            if (bArr == null) {
                m20Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            it2Var2 = a(a, j2, m20Var.a, i2);
            long j3 = j2 + i2;
            if (z) {
                kc2Var.c(2);
                it2Var2 = a(it2Var2, j3, kc2Var.a, 2);
                j3 += 2;
                i = kc2Var.r();
            }
            int i3 = i;
            int[] iArr = m20Var.d;
            if (iArr == null || iArr.length < i3) {
                iArr = new int[i3];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = m20Var.e;
            if (iArr3 == null || iArr3.length < i3) {
                iArr3 = new int[i3];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i4 = i3 * 6;
                kc2Var.c(i4);
                it2Var2 = a(it2Var2, j3, kc2Var.a, i4);
                j3 += i4;
                kc2Var.e(0);
                for (int i5 = 0; i5 < i3; i5++) {
                    iArr2[i5] = kc2Var.r();
                    iArr4[i5] = kc2Var.p();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = kt2Var.a - ((int) (j3 - kt2Var.b));
            }
            p83 p83Var = kt2Var.c;
            int i6 = mc3.a;
            m20Var.a(i3, iArr2, iArr4, p83Var.b, m20Var.a, p83Var.a, p83Var.c, p83Var.d);
            long j4 = kt2Var.b;
            int i7 = (int) (j3 - j4);
            kt2Var.b = j4 + i7;
            kt2Var.a -= i7;
        } else {
            it2Var2 = it2Var;
        }
        if (sa0Var.b(268435456)) {
            kc2Var.c(4);
            it2 a2 = a(it2Var2, kt2Var.b, kc2Var.a, 4);
            int p = kc2Var.p();
            kt2Var.b += 4;
            kt2Var.a -= 4;
            sa0Var.c(p);
            it2 a3 = a(a2, kt2Var.b, sa0Var.d, p);
            kt2Var.b += p;
            int i8 = kt2Var.a - p;
            kt2Var.a = i8;
            ByteBuffer byteBuffer = sa0Var.g;
            if (byteBuffer != null && byteBuffer.capacity() >= i8) {
                sa0Var.g.clear();
            } else {
                sa0Var.g = ByteBuffer.allocate(i8);
            }
            return a(a3, kt2Var.b, sa0Var.g, kt2Var.a);
        }
        sa0Var.c(kt2Var.a);
        return a(it2Var2, kt2Var.b, sa0Var.d, kt2Var.a);
    }
}
