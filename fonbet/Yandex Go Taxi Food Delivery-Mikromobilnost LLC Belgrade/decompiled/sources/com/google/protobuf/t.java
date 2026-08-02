package com.google.protobuf;

import defpackage.eac;
import defpackage.gp50;
import defpackage.ny61;
import defpackage.w511;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class t {
    public static final t f = new t(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public t(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static t e(t tVar, t tVar2) {
        int i = tVar.a + tVar2.a;
        int[] copyOf = Arrays.copyOf(tVar.b, i);
        System.arraycopy(tVar2.b, 0, copyOf, tVar.a, tVar2.a);
        Object[] copyOf2 = Arrays.copyOf(tVar.c, i);
        System.arraycopy(tVar2.c, 0, copyOf2, tVar.a, tVar2.a);
        return new t(i, copyOf, copyOf2, true);
    }

    public final void a() {
        if (this.e) {
            return;
        }
        w511.u();
    }

    public final void b(int i) {
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

    public final int c() {
        int f2;
        int h;
        int f3;
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
                    f3 = l.f(i5) + 8;
                } else if (i6 == 2) {
                    f3 = l.b(i5, (ByteString) this.c[i3]);
                } else if (i6 == 3) {
                    f2 = l.f(i5) * 2;
                    h = ((t) this.c[i3]).c();
                } else {
                    if (i6 != 5) {
                        ny61.o(InvalidProtocolBufferException.g());
                        return 0;
                    }
                    ((Integer) this.c[i3]).getClass();
                    f3 = l.f(i5) + 4;
                }
                i2 = f3 + i2;
            } else {
                long longValue = ((Long) this.c[i3]).longValue();
                f2 = l.f(i5);
                h = l.h(longValue);
            }
            i2 = h + f2 + i2;
        }
        this.d = i2;
        return i2;
    }

    public final boolean d(int i, eac eacVar) {
        int z;
        a();
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            f(i, Long.valueOf(eacVar.r()));
            return true;
        }
        if (i3 == 1) {
            f(i, Long.valueOf(eacVar.o()));
            return true;
        }
        if (i3 == 2) {
            f(i, eacVar.k());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                if (eacVar.b == 0) {
                    eacVar.a(0);
                }
                return false;
            }
            if (i3 != 5) {
                throw InvalidProtocolBufferException.g();
            }
            f(i, Integer.valueOf(eacVar.n()));
            return true;
        }
        t tVar = new t();
        do {
            z = eacVar.z();
            if (z == 0) {
                break;
            }
        } while (tVar.d(z, eacVar));
        eacVar.a((i2 << 3) | 4);
        f(i, tVar);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        int i = this.a;
        if (i == tVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = tVar.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = tVar.c;
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
        return false;
    }

    public final void f(int i, Object obj) {
        a();
        b(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void g(gp50 gp50Var) {
        if (this.a == 0) {
            return;
        }
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            l lVar = (l) gp50Var.b;
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                gp50Var.T(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                gp50Var.Q(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                gp50Var.O(i3, (ByteString) obj);
            } else if (i4 == 3) {
                lVar.v(i3, 3);
                ((t) obj).g(gp50Var);
                lVar.v(i3, 4);
            } else {
                if (i4 != 5) {
                    ny61.j(InvalidProtocolBufferException.g());
                    return;
                }
                gp50Var.P(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public t() {
        this(0, new int[8], new Object[8], true);
    }
}
