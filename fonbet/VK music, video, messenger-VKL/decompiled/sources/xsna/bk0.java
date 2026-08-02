package xsna;

import com.ironsource.B5;
import java.util.Arrays;
import xsna.ck0;

/* compiled from: AdaptingCircularBufferCounter.java */
/* loaded from: classes8.dex */
public final class bk0 {
    public int a;
    public int b;
    public int c;
    public final ck0 d;

    public bk0(int i) {
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        ck0 ck0Var = new ck0();
        ck0Var.e = ck0.a.BYTE;
        ck0Var.a = new byte[i];
        this.d = ck0Var;
    }

    public final void a() {
        ck0 ck0Var = this.d;
        int ordinal = ck0Var.e.ordinal();
        if (ordinal == 0) {
            Arrays.fill(ck0Var.a, (byte) 0);
        } else if (ordinal == 1) {
            Arrays.fill(ck0Var.b, (short) 0);
        } else if (ordinal == 2) {
            Arrays.fill(ck0Var.c, 0);
        } else if (ordinal == 3) {
            Arrays.fill(ck0Var.d, 0L);
        }
        this.c = Integer.MIN_VALUE;
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
    }

    public final long b(int i) {
        if (i < this.b || i > this.a) {
            return 0L;
        }
        int i2 = i - this.c;
        ck0 ck0Var = this.d;
        if (i2 >= ck0Var.b()) {
            i2 -= ck0Var.b();
        } else if (i2 < 0) {
            i2 += ck0Var.b();
        }
        int ordinal = ck0Var.e.ordinal();
        if (ordinal == 0) {
            return ck0Var.a[i2];
        }
        if (ordinal == 1) {
            return ck0Var.b[i2];
        }
        if (ordinal == 2) {
            return ck0Var.c[i2];
        }
        if (ordinal != 3) {
            return 0L;
        }
        return ck0Var.d[i2];
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i, long j) {
        int i2;
        int i3 = this.c;
        ck0 ck0Var = this.d;
        if (i3 == Integer.MIN_VALUE) {
            this.b = i;
            this.a = i;
            this.c = i;
            ck0Var.a(0, j);
            return true;
        }
        int i4 = this.a;
        if (i <= i4) {
            if (i < this.b) {
                if ((i4 - i) + 1 <= ck0Var.b()) {
                    this.b = i;
                }
                return false;
            }
            i2 = i - this.c;
            if (i2 < ck0Var.b()) {
            }
            ck0Var.a(i2, j);
            return true;
        }
        if ((i - this.b) + 1 <= ck0Var.b()) {
            this.a = i;
            i2 = i - this.c;
            if (i2 < ck0Var.b()) {
                i2 -= ck0Var.b();
            } else if (i2 < 0) {
                i2 += ck0Var.b();
            }
            ck0Var.a(i2, j);
            return true;
        }
        return false;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder("{");
        for (int i2 = this.b; i2 <= this.a && (i = this.b) != Integer.MIN_VALUE; i2++) {
            if (i2 != i) {
                sb.append(',');
            }
            sb.append(i2);
            sb.append(B5.U);
            sb.append(b(i2));
        }
        sb.append("}");
        return sb.toString();
    }

    public bk0(bk0 bk0Var) {
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        ck0 ck0Var = bk0Var.d;
        ck0 ck0Var2 = new ck0();
        ck0.a aVar = ck0Var.e;
        ck0Var2.e = aVar;
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            byte[] bArr = ck0Var.a;
            ck0Var2.a = Arrays.copyOf(bArr, bArr.length);
        } else if (ordinal == 1) {
            short[] sArr = ck0Var.b;
            ck0Var2.b = Arrays.copyOf(sArr, sArr.length);
        } else if (ordinal == 2) {
            int[] iArr = ck0Var.c;
            ck0Var2.c = Arrays.copyOf(iArr, iArr.length);
        } else if (ordinal == 3) {
            long[] jArr = ck0Var.d;
            ck0Var2.d = Arrays.copyOf(jArr, jArr.length);
        }
        this.d = ck0Var2;
        this.b = bk0Var.b;
        this.a = bk0Var.a;
        this.c = bk0Var.c;
    }
}
