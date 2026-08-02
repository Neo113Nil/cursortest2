package defpackage;

import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class iwk0 implements nkw0, mkw0 {
    public static final TreeMap B = new TreeMap();
    public int A;
    public final int a;
    public volatile String b;
    public final long[] c;
    public final double[] w;
    public final String[] x;
    public final byte[][] y;
    public final int[] z;

    public iwk0(int i) {
        this.a = i;
        int i2 = i + 1;
        this.z = new int[i2];
        this.c = new long[i2];
        this.w = new double[i2];
        this.x = new String[i2];
        this.y = new byte[i2][];
    }

    public final void a() {
        TreeMap treeMap = B;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // defpackage.mkw0
    public final void b(int i, long j) {
        this.z[i] = 2;
        this.c[i] = j;
    }

    @Override // defpackage.nkw0
    public final String c() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        ny61.r("Required value was null.");
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.nkw0
    public final void d(mkw0 mkw0Var) {
        int i = this.A;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.z[i2];
            if (i3 == 1) {
                mkw0Var.p(i2);
            } else if (i3 == 2) {
                mkw0Var.b(i2, this.c[i2]);
            } else if (i3 == 3) {
                mkw0Var.z(this.w[i2], i2);
            } else if (i3 == 4) {
                String str = this.x[i2];
                if (str == null) {
                    ny61.g("Required value was null.");
                    return;
                }
                mkw0Var.m0(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.y[i2];
                if (bArr == null) {
                    ny61.g("Required value was null.");
                    return;
                }
                mkw0Var.m(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // defpackage.mkw0
    public final void m(int i, byte[] bArr) {
        this.z[i] = 5;
        this.y[i] = bArr;
    }

    @Override // defpackage.mkw0
    public final void m0(int i, String str) {
        this.z[i] = 4;
        this.x[i] = str;
    }

    @Override // defpackage.mkw0
    public final void p(int i) {
        this.z[i] = 1;
    }

    @Override // defpackage.mkw0
    public final void z(double d, int i) {
        this.z[i] = 3;
        this.w[i] = d;
    }
}
