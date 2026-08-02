package xsna;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.eak0;

/* compiled from: Snapshot.kt */
/* loaded from: classes.dex */
public class uh50 extends dak0 {
    public static final int[] n = new int[0];
    public final izs<Object, s3q0> e;
    public final izs<Object, s3q0> f;
    public int g;
    public qh50<muk0> h;
    public ArrayList i;
    public kak0 j;
    public int[] k;
    public int l;
    public boolean m;

    public uh50(long j, kak0 kak0Var, izs<Object, s3q0> izsVar, izs<Object, s3q0> izsVar2) {
        super(j, kak0Var);
        this.e = izsVar;
        this.f = izsVar2;
        this.j = kak0.f;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (qak0.c) {
            this.j = this.j.e(j);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public void B(qh50<muk0> qh50Var) {
        this.h = qh50Var;
    }

    public uh50 C(izs<Object, s3q0> izsVar, izs<Object, s3q0> izsVar2) {
        if (this.c) {
            gxc0.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            gxc0.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = qak0.c;
        synchronized (obj) {
            try {
                long j = qak0.e;
                long j2 = 1;
                qak0.e = j + j2;
                qak0.d = qak0.d.e(j);
                kak0 d = d();
                r(d.e(j));
                try {
                    z060 z060Var = new z060(j, qak0.d(d, g() + j2, j), qak0.k(izsVar, e(), true), qak0.l(izsVar2, i()), this);
                    if (this.m || this.c) {
                        return z060Var;
                    }
                    long g = g();
                    synchronized (obj) {
                        long j3 = qak0.e;
                        qak0.e = j3 + j2;
                        s(j3);
                        qak0.d = qak0.d.e(g());
                        s3q0 s3q0Var = s3q0.a;
                    }
                    r(qak0.d(d(), g + j2, g()));
                    return z060Var;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // xsna.dak0
    public final void b() {
        qak0.d = qak0.d.b(g()).a(this.j);
    }

    @Override // xsna.dak0
    public void c() {
        if (this.c) {
            return;
        }
        super.c();
        l();
    }

    @Override // xsna.dak0
    public boolean f() {
        return false;
    }

    @Override // xsna.dak0
    public int h() {
        return this.g;
    }

    @Override // xsna.dak0
    public izs<Object, s3q0> i() {
        return this.f;
    }

    @Override // xsna.dak0
    public void k() {
        this.l++;
    }

    @Override // xsna.dak0
    public void l() {
        if (this.l <= 0) {
            gxc0.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        qh50<muk0> x = x();
        if (x != null) {
            if (this.m) {
                gxc0.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long g = g();
            Object[] objArr = x.b;
            long[] jArr = x.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (puk0 j2 = ((muk0) objArr[(i2 << 3) + i4]).j(); j2 != null; j2 = j2.b) {
                                    long j3 = j2.a;
                                    if (j3 == g || j5g.P(this.j, Long.valueOf(j3))) {
                                        lak0 lak0Var = qak0.a;
                                        j2.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        a();
    }

    @Override // xsna.dak0
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // xsna.dak0
    public void n(muk0 muk0Var) {
        qh50<muk0> x = x();
        if (x == null) {
            x = k5h0.a();
            B(x);
        }
        x.e(muk0Var);
    }

    @Override // xsna.dak0
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            qak0.u(this.k[i]);
        }
        o();
    }

    @Override // xsna.dak0
    public void t(int i) {
        this.g = i;
    }

    @Override // xsna.dak0
    public dak0 u(izs<Object, s3q0> izsVar) {
        if (this.c) {
            gxc0.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            gxc0.b("Unsupported operation on a disposed or applied snapshot");
        }
        long g = g();
        A(g());
        Object obj = qak0.c;
        synchronized (obj) {
            try {
                long j = qak0.e;
                long j2 = 1;
                qak0.e = j + j2;
                qak0.d = qak0.d.e(j);
                try {
                    c160 c160Var = new c160(j, qak0.d(d(), g + j2, j), qak0.k(izsVar, e(), true), this);
                    if (this.m || this.c) {
                        return c160Var;
                    }
                    long g2 = g();
                    synchronized (obj) {
                        long j3 = qak0.e;
                        qak0.e = j3 + j2;
                        s(j3);
                        qak0.d = qak0.d.e(g());
                        s3q0 s3q0Var = s3q0.a;
                    }
                    r(qak0.d(d(), g2 + j2, g()));
                    return c160Var;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void v() {
        long j;
        A(g());
        s3q0 s3q0Var = s3q0.a;
        if (this.m || this.c) {
            return;
        }
        long g = g();
        synchronized (qak0.c) {
            long j2 = qak0.e;
            j = 1;
            qak0.e = j2 + j;
            s(j2);
            qak0.d = qak0.d.e(g());
        }
        r(qak0.d(d(), g + j, g()));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3 A[LOOP:1: B:32:0x00b1->B:33:0x00b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011a A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:38:0x00c2, B:40:0x00d2, B:43:0x00de, B:45:0x00ea, B:47:0x00f4, B:49:0x00fa, B:51:0x0109, B:57:0x011a, B:60:0x0124, B:62:0x012e, B:64:0x0138, B:66:0x013e, B:68:0x0148, B:74:0x0150, B:76:0x0153, B:78:0x0157, B:80:0x015e, B:82:0x016a, B:88:0x0111), top: B:37:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0157 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:38:0x00c2, B:40:0x00d2, B:43:0x00de, B:45:0x00ea, B:47:0x00f4, B:49:0x00fa, B:51:0x0109, B:57:0x011a, B:60:0x0124, B:62:0x012e, B:64:0x0138, B:66:0x013e, B:68:0x0148, B:74:0x0150, B:76:0x0153, B:78:0x0157, B:80:0x015e, B:82:0x016a, B:88:0x0111), top: B:37:0x00c2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public eak0 w() {
        HashMap hashMap;
        List<? extends wzs<? super Set<? extends Object>, ? super dak0, s3q0>> list;
        qh50<muk0> qh50Var;
        long j;
        long j2;
        ArrayList arrayList;
        int size;
        int i;
        qh50<muk0> x = x();
        if (x != null) {
            long j3 = qak0.j.b;
            hashMap = qak0.b(j3, this, qak0.d.b(j3));
        } else {
            hashMap = null;
        }
        EmptyList emptyList = EmptyList.b;
        synchronized (qak0.c) {
            try {
                qak0.c(this);
                if (x != null && x.b() != 0) {
                    k2u k2uVar = qak0.j;
                    eak0 z = z(qak0.e, x, hashMap, qak0.d.b(k2uVar.b));
                    if (!epx.f(z, eak0.b.a)) {
                        return z;
                    }
                    b();
                    qh50Var = k2uVar.h;
                    qak0.v(k2uVar, qak0.a);
                    B(null);
                    k2uVar.h = null;
                    list = qak0.h;
                    s3q0 s3q0Var = s3q0.a;
                    this.m = true;
                    if (qh50Var != null) {
                        l5h0 B = qxm0.B(qh50Var);
                        if (!B.isEmpty()) {
                            int size2 = list.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                list.get(i2).invoke(B, this);
                            }
                        }
                    }
                    if (x != null && x.d()) {
                        l5h0 B2 = qxm0.B(x);
                        size = list.size();
                        for (i = 0; i < size; i++) {
                            list.get(i).invoke(B2, this);
                        }
                    }
                    synchronized (qak0.c) {
                        try {
                            p();
                            qak0.f();
                            if (qh50Var != null) {
                                Object[] objArr = qh50Var.b;
                                long[] jArr = qh50Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    j = 128;
                                    while (true) {
                                        long j4 = jArr[i3];
                                        j2 = 255;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                                            for (int i5 = 0; i5 < i4; i5++) {
                                                if ((j4 & 255) < 128) {
                                                    qak0.q((muk0) objArr[(i3 << 3) + i5]);
                                                }
                                                j4 >>= 8;
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
                                    if (x != null) {
                                        Object[] objArr2 = x.b;
                                        long[] jArr2 = x.a;
                                        int length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            int i6 = 0;
                                            while (true) {
                                                long j5 = jArr2[i6];
                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                                    for (int i8 = 0; i8 < i7; i8++) {
                                                        if ((j5 & j2) < j) {
                                                            qak0.q((muk0) objArr2[(i6 << 3) + i8]);
                                                        }
                                                        j5 >>= 8;
                                                    }
                                                    if (i7 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i6 == length2) {
                                                    break;
                                                }
                                                i6++;
                                            }
                                        }
                                    }
                                    arrayList = this.i;
                                    if (arrayList != null) {
                                        int size3 = arrayList.size();
                                        for (int i9 = 0; i9 < size3; i9++) {
                                            qak0.q((muk0) arrayList.get(i9));
                                        }
                                    }
                                    this.i = null;
                                    s3q0 s3q0Var2 = s3q0.a;
                                }
                            }
                            j = 128;
                            j2 = 255;
                            if (x != null) {
                            }
                            arrayList = this.i;
                            if (arrayList != null) {
                            }
                            this.i = null;
                            s3q0 s3q0Var22 = s3q0.a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return eak0.b.a;
                }
                b();
                k2u k2uVar2 = qak0.j;
                qh50<muk0> qh50Var2 = k2uVar2.h;
                qak0.v(k2uVar2, qak0.a);
                if (qh50Var2 == null || !qh50Var2.d()) {
                    list = emptyList;
                    qh50Var = null;
                } else {
                    list = qak0.h;
                    qh50Var = qh50Var2;
                }
                s3q0 s3q0Var3 = s3q0.a;
                this.m = true;
                if (qh50Var != null) {
                }
                if (x != null) {
                    l5h0 B22 = qxm0.B(x);
                    size = list.size();
                    while (i < size) {
                    }
                }
                synchronized (qak0.c) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public qh50<muk0> x() {
        return this.h;
    }

    @Override // xsna.dak0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public izs<Object, s3q0> e() {
        return this.e;
    }

    public final eak0 z(long j, qh50 qh50Var, HashMap hashMap, kak0 kak0Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        kak0 kak0Var2;
        Object[] objArr;
        long[] jArr;
        kak0 kak0Var3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList4;
        puk0 F;
        kak0 d = d().e(g()).d(this.j);
        Object[] objArr3 = qh50Var.b;
        long[] jArr3 = qh50Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            muk0 muk0Var = (muk0) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            puk0 j4 = muk0Var.j();
                            i = i4;
                            ArrayList arrayList5 = arrayList3;
                            puk0 s = qak0.s(j4, j, kak0Var);
                            if (s == null) {
                                kak0Var3 = d;
                                arrayList4 = arrayList2;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayList2;
                                j2 = j3;
                                puk0 s2 = qak0.s(j4, g(), d);
                                if (s2 == null) {
                                    kak0Var3 = d;
                                } else {
                                    kak0Var3 = d;
                                    if (s2.a != 1 && !s.equals(s2)) {
                                        puk0 s3 = qak0.s(j4, g(), d());
                                        if (s3 == null) {
                                            qak0.r();
                                            throw null;
                                        }
                                        if (hashMap == null || (F = (puk0) hashMap.get(s)) == null) {
                                            F = muk0Var.F(s2, s, s3);
                                        }
                                        if (F == null) {
                                            return new eak0.a(this);
                                        }
                                        if (!F.equals(s3)) {
                                            if (F.equals(s)) {
                                                ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList6.add(new Pair(muk0Var, s.c(g())));
                                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList2.add(muk0Var);
                                                arrayList3 = arrayList6;
                                            } else {
                                                arrayList3 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList3.add(!F.equals(s2) ? new Pair(muk0Var, F) : new Pair(muk0Var, s2.c(g())));
                                                arrayList2 = arrayList4;
                                            }
                                        }
                                    }
                                }
                            }
                            arrayList3 = arrayList5;
                            arrayList2 = arrayList4;
                        } else {
                            kak0Var3 = d;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        d = kak0Var3;
                    }
                    kak0Var2 = d;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    kak0Var2 = d;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList3;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                d = kak0Var2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            v();
            int size = arrayList3.size();
            for (int i5 = 0; i5 < size; i5++) {
                Pair pair = (Pair) arrayList3.get(i5);
                muk0 muk0Var2 = (muk0) pair.d();
                puk0 puk0Var = (puk0) pair.g();
                puk0Var.a = j;
                synchronized (qak0.c) {
                    puk0Var.b = muk0Var2.j();
                    muk0Var2.n(puk0Var);
                    s3q0 s3q0Var = s3q0.a;
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                qh50Var.m((muk0) arrayList2.get(i6));
            }
            ArrayList arrayList7 = this.i;
            if (arrayList7 != null) {
                arrayList2 = j5g.u0(arrayList2, arrayList7);
            }
            this.i = arrayList2;
        }
        return eak0.b.a;
    }
}
