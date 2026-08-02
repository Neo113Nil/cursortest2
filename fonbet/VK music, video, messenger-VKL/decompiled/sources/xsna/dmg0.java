package xsna;

import android.annotation.SuppressLint;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: RoomSQLiteQuery.android.kt */
@SuppressLint({"WrongConstant"})
/* loaded from: classes.dex */
public final class dmg0 implements xin0, win0 {
    public static final TreeMap<Integer, dmg0> j = new TreeMap<>();
    public final int b;
    public volatile String c;
    public final long[] d;
    public final double[] e;
    public final String[] f;
    public final byte[][] g;
    public final int[] h;
    public int i;

    public dmg0(int i) {
        this.b = i;
        int i2 = i + 1;
        this.h = new int[i2];
        this.d = new long[i2];
        this.e = new double[i2];
        this.f = new String[i2];
        this.g = new byte[i2][];
    }

    public static final dmg0 c(int i, String str) {
        TreeMap<Integer, dmg0> treeMap = j;
        synchronized (treeMap) {
            Map.Entry<Integer, dmg0> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                dmg0 value = ceilingEntry.getValue();
                value.c = str;
                value.i = i;
                return value;
            }
            s3q0 s3q0Var = s3q0.a;
            dmg0 dmg0Var = new dmg0(i);
            dmg0Var.c = str;
            dmg0Var.i = i;
            return dmg0Var;
        }
    }

    @Override // xsna.xin0
    public final void b(win0 win0Var) {
        int i = this.i;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.h[i2];
            if (i3 == 1) {
                win0Var.bindNull(i2);
            } else if (i3 == 2) {
                win0Var.bindLong(i2, this.d[i2]);
            } else if (i3 == 3) {
                win0Var.bindDouble(i2, this.e[i2]);
            } else if (i3 == 4) {
                String str = this.f[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                win0Var.bindString(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.g[i2];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                win0Var.bindBlob(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // xsna.win0
    public final void bindBlob(int i, byte[] bArr) {
        this.h[i] = 5;
        this.g[i] = bArr;
    }

    @Override // xsna.win0
    public final void bindDouble(int i, double d) {
        this.h[i] = 3;
        this.e[i] = d;
    }

    @Override // xsna.win0
    public final void bindLong(int i, long j2) {
        this.h[i] = 2;
        this.d[i] = j2;
    }

    @Override // xsna.win0
    public final void bindNull(int i) {
        this.h[i] = 1;
    }

    @Override // xsna.win0
    public final void bindString(int i, String str) {
        this.h[i] = 4;
        this.f[i] = str;
    }

    @Override // xsna.xin0
    public final String m() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void n() {
        TreeMap<Integer, dmg0> treeMap = j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.b), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
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
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
