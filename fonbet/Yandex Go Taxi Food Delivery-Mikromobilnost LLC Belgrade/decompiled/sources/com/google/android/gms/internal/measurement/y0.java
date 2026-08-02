package com.google.android.gms.internal.measurement;

import defpackage.dxf0;
import defpackage.f1b1;
import defpackage.jab1;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.p5b1;
import defpackage.wra1;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class y0 extends wra1 {
    public static final Logger e = Logger.getLogger(y0.class.getName());
    public static final boolean f = jab1.e;
    public dxf0 a;
    public final byte[] b;
    public final int c;
    public int d;

    public y0(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            ny61.g(oyr.h(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
        this.b = bArr;
        this.d = 0;
        this.c = i;
    }

    public static int a(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int b(String str) {
        int length;
        try {
            length = f1.b(str);
        } catch (zzor unused) {
            length = str.getBytes(f1b1.a).length;
        }
        return t(length) + length;
    }

    public static int t(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void c(int i, int i2) {
        n((i << 3) | i2);
    }

    public final void d(int i, int i2) {
        n(i << 3);
        m(i2);
    }

    public final void e(int i, int i2) {
        n(i << 3);
        n(i2);
    }

    public final void f(int i, int i2) {
        n((i << 3) | 5);
        o(i2);
    }

    public final void g(int i, long j) {
        n(i << 3);
        p(j);
    }

    public final void h(int i, long j) {
        n((i << 3) | 1);
        q(j);
    }

    public final void i(int i, zzlh zzlhVar) {
        n((i << 3) | 2);
        j(zzlhVar);
    }

    public final void j(zzlh zzlhVar) {
        n(zzlhVar.f());
        zzlg zzlgVar = (zzlg) zzlhVar;
        r(zzlgVar.f(), zzlgVar.zza);
    }

    public final void k(p5b1 p5b1Var) {
        a1 a1Var = (a1) p5b1Var;
        n(a1Var.m());
        a1Var.c(this);
    }

    public final void l(byte b) {
        int i = this.d;
        try {
            int i2 = i + 1;
            try {
                this.b[i] = b;
                this.d = i2;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                i = i2;
                throw new zzll(i, this.c, 1, e);
            }
        } catch (IndexOutOfBoundsException e3) {
            e = e3;
        }
    }

    public final void m(int i) {
        if (i >= 0) {
            n(i);
        } else {
            p(i);
        }
    }

    public final void n(int i) {
        int i2;
        int i3 = this.d;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.b;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.d = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzll(i2, this.c, 1, e2);
                }
            }
            throw new zzll(i2, this.c, 1, e2);
        }
    }

    public final void o(int i) {
        int i2 = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.d = i2 + 4;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzll(i2, this.c, 4, e2);
        }
    }

    public final void p(long j) {
        int i;
        int i2 = this.d;
        byte[] bArr = this.b;
        int i3 = this.c;
        if (!f || i3 - i2 < 10) {
            while ((j & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i = i4;
                    throw new zzll(i, i3, 1, e);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j;
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
                throw new zzll(i, i3, 1, e);
            }
        } else {
            while ((j & (-128)) != 0) {
                jab1.c.b(bArr, jab1.f + i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            jab1.c.b(bArr, jab1.f + i2, (byte) j);
        }
        this.d = i;
    }

    public final void q(long j) {
        int i = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.d = i + 8;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzll(i, this.c, 8, e2);
        }
    }

    public final void r(int i, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.b, this.d, i);
            this.d += i;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzll(this.d, this.c, i, e2);
        }
    }

    public final void s(String str) {
        int i = this.d;
        try {
            int t = t(str.length() * 3);
            int t2 = t(str.length());
            int i2 = this.c;
            byte[] bArr = this.b;
            if (t2 != t) {
                n(f1.b(str));
                int i3 = this.d;
                this.d = f1.c(i3, i2 - i3, str, bArr);
            } else {
                int i4 = i + t2;
                this.d = i4;
                int c = f1.c(i4, i2 - i4, str, bArr);
                this.d = i;
                n((c - i) - t2);
                this.d = c;
            }
        } catch (zzor e2) {
            this.d = i;
            e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(f1b1.a);
            try {
                int length = bytes.length;
                n(length);
                r(length, bytes);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzll(e3);
            }
        } catch (IndexOutOfBoundsException e4) {
            throw new zzll(e4);
        }
    }
}
