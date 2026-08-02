package defpackage;

import android.database.Cursor;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class pkw0 extends qkw0 {
    public byte[][] A;
    public Cursor B;
    public int[] w;
    public long[] x;
    public double[] y;
    public String[] z;

    public pkw0(hkw0 hkw0Var, String str) {
        super(hkw0Var, str);
        this.w = new int[0];
        this.x = new long[0];
        this.y = new double[0];
        this.z = new String[0];
        this.A = new byte[0][];
    }

    public static void e(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            vez0.Y(25, "column index out of range");
            throw null;
        }
    }

    @Override // defpackage.qkw0, defpackage.ull0
    public final void C() {
        a();
        this.w = new int[0];
        this.x = new long[0];
        this.y = new double[0];
        this.z = new String[0];
        this.A = new byte[0][];
    }

    @Override // defpackage.ull0
    public final String Y1(int i) {
        a();
        Cursor k = k();
        e(k, i);
        return k.getString(i);
    }

    @Override // defpackage.ull0
    public final void b(int i, long j) {
        a();
        c(1, i);
        this.w[i] = 1;
        this.x[i] = j;
    }

    public final void c(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.w;
        if (iArr.length < i3) {
            this.w = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.x;
            if (jArr.length < i3) {
                this.x = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.y;
            if (dArr.length < i3) {
                this.y = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.z;
            if (strArr.length < i3) {
                this.z = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.A;
        if (bArr.length < i3) {
            this.A = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.c) {
            C();
            reset();
        }
        this.c = true;
    }

    public final void d() {
        if (this.B == null) {
            this.B = this.a.U0(new yo40(this));
        }
    }

    @Override // defpackage.ull0
    public final void g1(int i, String str) {
        a();
        c(3, i);
        this.w[i] = 3;
        this.z[i] = str;
    }

    @Override // defpackage.ull0
    public final byte[] getBlob(int i) {
        a();
        Cursor k = k();
        e(k, i);
        return k.getBlob(i);
    }

    @Override // defpackage.ull0
    public final int getColumnCount() {
        a();
        d();
        Cursor cursor = this.B;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.ull0
    public final String getColumnName(int i) {
        a();
        d();
        Cursor cursor = this.B;
        if (cursor != null) {
            e(cursor, i);
            return cursor.getColumnName(i);
        }
        ny61.r("Required value was null.");
        return null;
    }

    @Override // defpackage.ull0
    public final double getDouble(int i) {
        a();
        Cursor k = k();
        e(k, i);
        return k.getDouble(i);
    }

    @Override // defpackage.ull0
    public final long getLong(int i) {
        a();
        Cursor k = k();
        e(k, i);
        return k.getLong(i);
    }

    @Override // defpackage.ull0
    public final boolean isNull(int i) {
        a();
        Cursor k = k();
        e(k, i);
        return k.isNull(i);
    }

    public final Cursor k() {
        Cursor cursor = this.B;
        if (cursor != null) {
            return cursor;
        }
        vez0.Y(21, "no row");
        throw null;
    }

    @Override // defpackage.ull0
    public final void m(int i, byte[] bArr) {
        a();
        c(4, i);
        this.w[i] = 4;
        this.A[i] = bArr;
    }

    @Override // defpackage.ull0
    public final void p(int i) {
        a();
        c(5, i);
        this.w[i] = 5;
    }

    @Override // defpackage.ull0
    public final boolean q() {
        a();
        d();
        Cursor cursor = this.B;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        ny61.r("Required value was null.");
        return false;
    }

    @Override // defpackage.qkw0, defpackage.ull0
    public final void reset() {
        a();
        Cursor cursor = this.B;
        if (cursor != null) {
            cursor.close();
        }
        this.B = null;
    }

    @Override // defpackage.ull0
    public final void z(double d, int i) {
        a();
        c(2, i);
        this.w[i] = 2;
        this.y[i] = d;
    }
}
