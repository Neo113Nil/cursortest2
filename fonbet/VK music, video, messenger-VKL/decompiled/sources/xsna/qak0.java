package xsna;

import androidx.compose.runtime.internal.AtomicInt;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;

/* compiled from: Snapshot.kt */
/* loaded from: classes.dex */
public final class qak0 {
    public static final lak0 a = new lak0(0);
    public static final jbk0<dak0> b = new jbk0<>();
    public static final Object c = new Object();
    public static kak0 d;
    public static long e;
    public static final fak0 f;
    public static final kbk0<muk0> g;
    public static List<? extends wzs<? super Set<? extends Object>, ? super dak0, s3q0>> h;
    public static List<? extends izs<Object, s3q0>> i;
    public static final k2u j;
    public static final AtomicInt k;

    static {
        kak0 kak0Var = kak0.f;
        d = kak0Var;
        long j2 = 1;
        e = j2 + j2;
        fak0 fak0Var = new fak0();
        fak0Var.b = new long[16];
        fak0Var.c = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        fak0Var.d = iArr;
        f = fak0Var;
        kbk0<muk0> kbk0Var = new kbk0<>();
        kbk0Var.b = new int[16];
        kbk0Var.c = new odx0[16];
        g = kbk0Var;
        EmptyList emptyList = EmptyList.b;
        h = emptyList;
        i = emptyList;
        long j3 = e;
        e = j2 + j3;
        k2u k2uVar = new k2u(j3, kak0Var, null, new j2u(0));
        d = d.e(k2uVar.b);
        j = k2uVar;
        k = new AtomicInt(0);
    }

    public static final void a() {
        e(a);
    }

    public static final HashMap b(long j2, uh50 uh50Var, kak0 kak0Var) {
        long[] jArr;
        kak0 kak0Var2;
        long[] jArr2;
        kak0 kak0Var3;
        int i2;
        int i3;
        puk0 s;
        qh50<muk0> x = uh50Var.x();
        if (x != null) {
            long g2 = uh50Var.g();
            kak0 d2 = uh50Var.d().e(g2).d(uh50Var.j);
            Object[] objArr = x.b;
            long[] jArr3 = x.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                muk0 muk0Var = (muk0) objArr[(i4 << 3) + i7];
                                puk0 j4 = muk0Var.j();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                puk0 s2 = s(j4, j2, kak0Var);
                                if (s2 == null || (s = s(j4, g2, d2)) == null || s2.equals(s)) {
                                    kak0Var3 = d2;
                                } else {
                                    kak0Var3 = d2;
                                    puk0 s3 = s(j4, g2, uh50Var.d());
                                    if (s3 == null) {
                                        r();
                                        throw null;
                                    }
                                    puk0 F = muk0Var.F(s, s2, s3);
                                    if (F == null) {
                                        return null;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(s2, F);
                                    hashMap = hashMap;
                                }
                            } else {
                                jArr2 = jArr3;
                                kak0Var3 = d2;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            d2 = kak0Var3;
                        }
                        jArr = jArr3;
                        kak0Var2 = d2;
                        if (i6 != i5) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        kak0Var2 = d2;
                    }
                    if (i4 == length) {
                        return hashMap;
                    }
                    i4++;
                    jArr3 = jArr;
                    d2 = kak0Var2;
                }
            }
        }
        return null;
    }

    public static final void c(dak0 dak0Var) {
        long j2;
        if (d.c(dak0Var.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(dak0Var.g());
        sb.append(", disposed=");
        sb.append(dak0Var.c);
        sb.append(", applied=");
        uh50 uh50Var = dak0Var instanceof uh50 ? (uh50) dak0Var : null;
        sb.append(uh50Var != null ? Boolean.valueOf(uh50Var.m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (c) {
            fak0 fak0Var = f;
            j2 = fak0Var.a > 0 ? fak0Var.b[0] : -1L;
        }
        sb.append(j2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final kak0 d(kak0 kak0Var, long j2, long j3) {
        while (epx.h(j2, j3) < 0) {
            kak0Var = kak0Var.e(j2);
            j2++;
        }
        return kak0Var;
    }

    public static final <T> T e(izs<? super kak0, ? extends T> izsVar) {
        qh50<muk0> qh50Var;
        T t;
        k2u k2uVar = j;
        synchronized (c) {
            try {
                qh50Var = k2uVar.h;
                if (qh50Var != null) {
                    k.addAndGet(1);
                }
                t = (T) v(k2uVar, izsVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (qh50Var != null) {
            try {
                List<? extends wzs<? super Set<? extends Object>, ? super dak0, s3q0>> list = h;
                l5h0 B = qxm0.B(qh50Var);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list.get(i2).invoke(B, k2uVar);
                }
            } finally {
                k.addAndGet(-1);
            }
        }
        synchronized (c) {
            try {
                f();
                if (qh50Var != null) {
                    Object[] objArr = qh50Var.b;
                    long[] jArr = qh50Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j2 = jArr[i3];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((255 & j2) < 128) {
                                        q((muk0) objArr[(i3 << 3) + i5]);
                                    }
                                    j2 >>= 8;
                                }
                                if (i4 != 8) {
                                    break;
                                }
                            }
                            if (i3 == length) {
                                break;
                            }
                            i3++;
                        }
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t;
    }

    public static final void f() {
        kbk0<muk0> kbk0Var = g;
        int i2 = kbk0Var.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            odx0<muk0> odx0Var = kbk0Var.c[i3];
            muk0 muk0Var = odx0Var != null ? odx0Var.get() : null;
            if (muk0Var != null && p(muk0Var)) {
                if (i4 != i3) {
                    kbk0Var.c[i4] = odx0Var;
                    int[] iArr = kbk0Var.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            kbk0Var.c[i5] = null;
            kbk0Var.b[i5] = 0;
        }
        if (i4 != i2) {
            kbk0Var.a = i4;
        }
    }

    public static final dak0 g(dak0 dak0Var, izs<Object, s3q0> izsVar, boolean z) {
        boolean z2 = dak0Var instanceof uh50;
        if (z2 || dak0Var == null) {
            return new mop0(z2 ? (uh50) dak0Var : null, izsVar, null, false, z);
        }
        return new nop0(dak0Var, izsVar, false, z);
    }

    public static final <T extends puk0> T h(T t) {
        T t2;
        dak0 j2 = j();
        T t3 = (T) s(t, j2.g(), j2.d());
        if (t3 != null) {
            return t3;
        }
        synchronized (c) {
            dak0 j3 = j();
            t2 = (T) s(t, j3.g(), j3.d());
        }
        if (t2 != null) {
            return t2;
        }
        r();
        throw null;
    }

    public static final <T extends puk0> T i(T t, dak0 dak0Var) {
        T t2;
        T t3 = (T) s(t, dak0Var.g(), dak0Var.d());
        if (t3 != null) {
            return t3;
        }
        synchronized (c) {
            t2 = (T) s(t, dak0Var.g(), dak0Var.d());
        }
        if (t2 != null) {
            return t2;
        }
        r();
        throw null;
    }

    public static final dak0 j() {
        dak0 a2 = b.a();
        return a2 == null ? j : a2;
    }

    public static final izs<Object, s3q0> k(izs<Object, s3q0> izsVar, izs<Object, s3q0> izsVar2, boolean z) {
        if (!z) {
            izsVar2 = null;
        }
        return (izsVar == null || izsVar2 == null || izsVar == izsVar2) ? izsVar == null ? izsVar2 : izsVar : new h57(23, izsVar, izsVar2);
    }

    public static final izs<Object, s3q0> l(izs<Object, s3q0> izsVar, izs<Object, s3q0> izsVar2) {
        return (izsVar == null || izsVar2 == null || izsVar == izsVar2) ? izsVar == null ? izsVar2 : izsVar : new kp5(25, izsVar, izsVar2);
    }

    public static final <T extends puk0> T m(T t, muk0 muk0Var) {
        puk0 j2 = muk0Var.j();
        long j3 = e;
        fak0 fak0Var = f;
        if (fak0Var.a > 0) {
            j3 = fak0Var.b[0];
        }
        long j4 = j3 - 1;
        T t2 = null;
        puk0 puk0Var = null;
        while (true) {
            if (j2 == null) {
                break;
            }
            long j5 = j2.a;
            if (j5 == 0) {
                break;
            }
            if (j5 != 0 && epx.h(j5, j4) <= 0 && !kak0.f.c(j5)) {
                if (puk0Var == null) {
                    puk0Var = j2;
                } else if (epx.h(j2.a, puk0Var.a) >= 0) {
                    t2 = (T) puk0Var;
                }
            }
            j2 = j2.b;
        }
        t2 = (T) j2;
        if (t2 != null) {
            t2.a = Long.MAX_VALUE;
            return t2;
        }
        T t3 = (T) t.c(Long.MAX_VALUE);
        t3.b = muk0Var.j();
        muk0Var.n(t3);
        return t3;
    }

    public static final void n(dak0 dak0Var, muk0 muk0Var) {
        dak0Var.t(dak0Var.h() + 1);
        izs<Object, s3q0> i2 = dak0Var.i();
        if (i2 != null) {
            i2.invoke(muk0Var);
        }
    }

    public static final puk0 o(puk0 puk0Var, nuk0 nuk0Var, dak0 dak0Var, puk0 puk0Var2) {
        puk0 m;
        if (dak0Var.f()) {
            dak0Var.n(nuk0Var);
        }
        long g2 = dak0Var.g();
        if (puk0Var2.a == g2) {
            return puk0Var2;
        }
        synchronized (c) {
            m = m(puk0Var, nuk0Var);
        }
        m.a = g2;
        if (puk0Var2.a != 1) {
            dak0Var.n(nuk0Var);
        }
        return m;
    }

    public static final boolean p(muk0 muk0Var) {
        puk0 puk0Var;
        long j2 = e;
        fak0 fak0Var = f;
        if (fak0Var.a > 0) {
            j2 = fak0Var.b[0];
        }
        puk0 puk0Var2 = null;
        puk0 puk0Var3 = null;
        int i2 = 0;
        for (puk0 j3 = muk0Var.j(); j3 != null; j3 = j3.b) {
            long j4 = j3.a;
            if (j4 != 0) {
                if (epx.h(j4, j2) >= 0) {
                    i2++;
                } else if (puk0Var2 == null) {
                    i2++;
                    puk0Var2 = j3;
                } else {
                    if (epx.h(j3.a, puk0Var2.a) < 0) {
                        puk0Var = puk0Var2;
                        puk0Var2 = j3;
                    } else {
                        puk0Var = j3;
                    }
                    if (puk0Var3 == null) {
                        puk0Var3 = muk0Var.j();
                        puk0 puk0Var4 = puk0Var3;
                        while (true) {
                            if (puk0Var3 == null) {
                                puk0Var3 = puk0Var4;
                                break;
                            }
                            if (epx.h(puk0Var3.a, j2) >= 0) {
                                break;
                            }
                            if (epx.h(puk0Var4.a, puk0Var3.a) < 0) {
                                puk0Var4 = puk0Var3;
                            }
                            puk0Var3 = puk0Var3.b;
                        }
                    }
                    puk0Var2.a = 0L;
                    puk0Var2.a(puk0Var3);
                    puk0Var2 = puk0Var;
                }
            }
        }
        return i2 > 1;
    }

    public static final void q(muk0 muk0Var) {
        if (p(muk0Var)) {
            kbk0<muk0> kbk0Var = g;
            int i2 = kbk0Var.a;
            int o = cvk.o(muk0Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = kbk0Var.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = kbk0Var.b[i6];
                    if (i7 < o) {
                        i5 = i6 + 1;
                    } else if (i7 > o) {
                        i4 = i6 - 1;
                    } else {
                        odx0<muk0> odx0Var = kbk0Var.c[i6];
                        if (muk0Var != (odx0Var != null ? odx0Var.get() : null)) {
                            for (int i8 = i6 - 1; -1 < i8 && kbk0Var.b[i8] == o; i8--) {
                                odx0<muk0> odx0Var2 = kbk0Var.c[i8];
                                if ((odx0Var2 != null ? odx0Var2.get() : null) == muk0Var) {
                                    i3 = i8;
                                    break;
                                }
                            }
                            i6++;
                            int i9 = kbk0Var.a;
                            while (true) {
                                if (i6 >= i9) {
                                    i3 = -(kbk0Var.a + 1);
                                    break;
                                } else {
                                    if (kbk0Var.b[i6] != o) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    odx0<muk0> odx0Var3 = kbk0Var.c[i6];
                                    if ((odx0Var3 != null ? odx0Var3.get() : null) == muk0Var) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                        }
                        i3 = i6;
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            odx0<muk0>[] odx0VarArr = kbk0Var.c;
            int length = odx0VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                odx0<T>[] odx0VarArr2 = new odx0[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(odx0VarArr, i10, odx0VarArr2, i12, i2 - i10);
                System.arraycopy(kbk0Var.c, 0, odx0VarArr2, 0, i10);
                jw5.e(i12, i10, i2, kbk0Var.b, iArr);
                jw5.i(0, i10, 6, kbk0Var.b, iArr);
                kbk0Var.c = odx0VarArr2;
                kbk0Var.b = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(odx0VarArr, i10, odx0VarArr, i13, i2 - i10);
                int[] iArr2 = kbk0Var.b;
                jw5.e(i13, i10, i2, iArr2, iArr2);
            }
            kbk0Var.c[i10] = new odx0<>(muk0Var);
            kbk0Var.b[i10] = o;
            kbk0Var.a++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final <T extends puk0> T s(T t, long j2, kak0 kak0Var) {
        T t2 = null;
        while (t != null) {
            long j3 = t.a;
            if (j3 != 0 && epx.h(j3, j2) <= 0 && !kak0Var.c(j3) && (t2 == null || epx.h(t2.a, t.a) < 0)) {
                t2 = t;
            }
            t = (T) t.b;
        }
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    public static final <T extends puk0> T t(T t, muk0 muk0Var) {
        T t2;
        dak0 j2 = j();
        izs<Object, s3q0> e2 = j2.e();
        if (e2 != null) {
            e2.invoke(muk0Var);
        }
        T t3 = (T) s(t, j2.g(), j2.d());
        if (t3 != null) {
            return t3;
        }
        synchronized (c) {
            dak0 j3 = j();
            t2 = (T) s(muk0Var.j(), j3.g(), j3.d());
            if (t2 == null) {
                r();
                throw null;
            }
        }
        return t2;
    }

    public static final void u(int i2) {
        fak0 fak0Var = f;
        int i3 = fak0Var.d[i2];
        fak0Var.b(i3, fak0Var.a - 1);
        fak0Var.a--;
        long[] jArr = fak0Var.b;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (epx.h(jArr[i5], j2) <= 0) {
                break;
            }
            fak0Var.b(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = fak0Var.b;
        int i6 = fak0Var.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < fak0Var.a && epx.h(jArr2[i7], jArr2[i8]) < 0) {
                if (epx.h(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                fak0Var.b(i7, i3);
                i3 = i7;
            } else {
                if (epx.h(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                fak0Var.b(i8, i3);
                i3 = i8;
            }
        }
        fak0Var.d[i2] = fak0Var.e;
        fak0Var.e = i2;
    }

    public static final <T> T v(k2u k2uVar, izs<? super kak0, ? extends T> izsVar) {
        long j2 = k2uVar.b;
        T invoke = izsVar.invoke(d.b(j2));
        long j3 = e;
        e = 1 + j3;
        kak0 b2 = d.b(j2);
        d = b2;
        k2uVar.b = j3;
        k2uVar.a = b2;
        k2uVar.g = 0;
        k2uVar.h = null;
        k2uVar.o();
        d = d.e(j3);
        return invoke;
    }

    public static final <T extends puk0> T w(T t, muk0 muk0Var, dak0 dak0Var) {
        T t2;
        if (dak0Var.f()) {
            dak0Var.n(muk0Var);
        }
        long g2 = dak0Var.g();
        T t3 = (T) s(t, g2, dak0Var.d());
        if (t3 == null) {
            r();
            throw null;
        }
        if (t3.a == dak0Var.g()) {
            return t3;
        }
        synchronized (c) {
            t2 = (T) s(muk0Var.j(), g2, dak0Var.d());
            if (t2 == null) {
                r();
                throw null;
            }
            if (t2.a != g2) {
                puk0 m = m(t2, muk0Var);
                m.a(t2);
                m.a = dak0Var.g();
                t2 = (T) m;
            }
        }
        if (t3.a != 1) {
            dak0Var.n(muk0Var);
        }
        return t2;
    }
}
