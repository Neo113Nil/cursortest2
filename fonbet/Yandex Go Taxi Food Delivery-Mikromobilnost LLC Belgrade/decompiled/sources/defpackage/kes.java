package defpackage;

import androidx.media3.common.a;

/* loaded from: classes10.dex */
public final class kes {
    public final g001 a;
    public k001 d;
    public kjh e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final String j;
    public boolean m;
    public final wzz0 b = new wzz0();
    public final ef90 c = new ef90();
    public final ef90 k = new ef90(1);
    public final ef90 l = new ef90();

    public kes(g001 g001Var, k001 k001Var, kjh kjhVar, String str) {
        this.a = g001Var;
        this.d = k001Var;
        this.e = kjhVar;
        this.j = str;
        e(k001Var, kjhVar);
    }

    public final int a() {
        int i = !this.m ? this.d.g[this.f] : this.b.j[this.f] ? 1 : 0;
        return b() != null ? 1073741824 | i : i;
    }

    public final vzz0 b() {
        if (this.m) {
            wzz0 wzz0Var = this.b;
            kjh kjhVar = wzz0Var.a;
            int i = tw21.a;
            int i2 = kjhVar.a;
            vzz0 vzz0Var = wzz0Var.m;
            if (vzz0Var == null) {
                vzz0[] vzz0VarArr = this.d.a.l;
                vzz0Var = vzz0VarArr == null ? null : vzz0VarArr[i2];
            }
            if (vzz0Var != null && vzz0Var.a) {
                return vzz0Var;
            }
        }
        return null;
    }

    public final boolean c() {
        this.f++;
        if (!this.m) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int d(int i, int i2) {
        ef90 ef90Var;
        vzz0 b = b();
        if (b == null) {
            return 0;
        }
        int i3 = b.d;
        wzz0 wzz0Var = this.b;
        if (i3 != 0) {
            ef90Var = wzz0Var.n;
        } else {
            byte[] bArr = b.e;
            int i4 = tw21.a;
            int length = bArr.length;
            ef90 ef90Var2 = this.l;
            ef90Var2.I(length, bArr);
            i3 = bArr.length;
            ef90Var = ef90Var2;
        }
        boolean z = wzz0Var.k && wzz0Var.l[this.f];
        boolean z2 = z || i2 != 0;
        ef90 ef90Var3 = this.k;
        ef90Var3.a[0] = (byte) ((z2 ? 128 : 0) | i3);
        ef90Var3.K(0);
        g001 g001Var = this.a;
        g001Var.a(ef90Var3, 1, 1);
        g001Var.a(ef90Var, i3, 1);
        if (!z2) {
            return i3 + 1;
        }
        ef90 ef90Var4 = this.c;
        if (!z) {
            ef90Var4.H(8);
            byte[] bArr2 = ef90Var4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            g001Var.a(ef90Var4, 8, 1);
            return i3 + 9;
        }
        ef90 ef90Var5 = wzz0Var.n;
        int E = ef90Var5.E();
        ef90Var5.L(-2);
        int i5 = (E * 6) + 2;
        if (i2 != 0) {
            ef90Var4.H(i5);
            byte[] bArr3 = ef90Var4.a;
            ef90Var5.i(0, i5, bArr3);
            int i6 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i6 >> 8) & 255);
            bArr3[3] = (byte) (i6 & 255);
        } else {
            ef90Var4 = ef90Var5;
        }
        g001Var.a(ef90Var4, i5, 1);
        return i3 + 1 + i5;
    }

    public final void e(k001 k001Var, kjh kjhVar) {
        this.d = k001Var;
        this.e = kjhVar;
        f7s a = k001Var.a.g.a();
        a.l = eh20.q(this.j);
        this.a.d(new a(a));
        f();
    }

    public final void f() {
        wzz0 wzz0Var = this.b;
        wzz0Var.d = 0;
        wzz0Var.p = 0L;
        wzz0Var.q = false;
        wzz0Var.k = false;
        wzz0Var.o = false;
        wzz0Var.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.m = false;
    }
}
