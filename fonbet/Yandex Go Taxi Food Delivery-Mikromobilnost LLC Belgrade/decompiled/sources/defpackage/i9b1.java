package defpackage;

import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.internal.measurement.zzlh;
import com.google.android.gms.internal.measurement.zzmq;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i9b1 {
    public static final i9b1 f = new i9b1(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public i9b1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static i9b1 a() {
        return new i9b1(0, new int[8], new Object[8], true);
    }

    public final void b(dxf0 dxf0Var) {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    ((y0) dxf0Var.a).g(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    ((y0) dxf0Var.a).h(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    ((y0) dxf0Var.a).i(i4, (zzlh) obj);
                } else if (i3 == 3) {
                    ((y0) dxf0Var.a).c(i4, 3);
                    ((i9b1) obj).b(dxf0Var);
                    ((y0) dxf0Var.a).c(i4, 4);
                } else {
                    if (i3 != 5) {
                        ny61.j(new zzmq());
                        return;
                    }
                    ((y0) dxf0Var.a).f(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int t;
        int a;
        int t2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    t2 = y0.t(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    zzlh zzlhVar = (zzlh) this.c[i3];
                    int t3 = y0.t(i7);
                    int f2 = zzlhVar.f();
                    i2 = oo31.b(f2, f2, t3, i2);
                } else if (i6 == 3) {
                    int t4 = y0.t(i5 << 3);
                    t = t4 + t4;
                    a = ((i9b1) this.c[i3]).c();
                } else {
                    if (i6 != 5) {
                        ny61.o(new zzmq());
                        return 0;
                    }
                    ((Integer) this.c[i3]).getClass();
                    t2 = y0.t(i5 << 3) + 4;
                }
                i2 = t2 + i2;
            } else {
                int i8 = i5 << 3;
                long longValue = ((Long) this.c[i3]).longValue();
                t = y0.t(i8);
                a = y0.a(longValue);
            }
            i2 = a + t + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void d(int i, Object obj) {
        if (!this.e) {
            w511.u();
            return;
        }
        e(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void e(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof i9b1)) {
            i9b1 i9b1Var = (i9b1) obj;
            int i = this.a;
            if (i == i9b1Var.a) {
                int[] iArr = this.b;
                int[] iArr2 = i9b1Var.b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.c;
                        Object[] objArr2 = i9b1Var.c;
                        int i3 = this.a;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (objArr[i4].equals(objArr2[i4])) {
                            }
                        }
                        return true;
                    }
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
