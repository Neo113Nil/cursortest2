package yads;

import android.net.Uri;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import xsna.xy9;

/* loaded from: classes10.dex */
public final class lu implements ot2, vy2, zg1, dh1 {
    public final int b;
    public final int[] c;
    public final nx0[] d;
    public final boolean[] e;
    public final b30 f;
    public final uy2 g;
    public final co1 h;
    public final ae0 i;
    public final gh1 j = new gh1("ChunkSampleStream");
    public final gu k = new gu();
    public final ArrayList l;
    public final List m;
    public final nt2 n;
    public final nt2[] o;
    public final lo p;
    public cu q;
    public nx0 r;
    public ku s;
    public long t;
    public long u;
    public int v;
    public jo w;
    public boolean x;

    public lu(int i, int[] iArr, nx0[] nx0VarArr, nc0 nc0Var, uy2 uy2Var, qe qeVar, long j, tk0 tk0Var, pk0 pk0Var, ae0 ae0Var, co1 co1Var) {
        this.b = i;
        this.c = iArr;
        this.d = nx0VarArr;
        this.f = nc0Var;
        this.g = uy2Var;
        this.h = co1Var;
        this.i = ae0Var;
        ArrayList arrayList = new ArrayList();
        this.l = arrayList;
        this.m = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.o = new nt2[length];
        this.e = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        nt2[] nt2VarArr = new nt2[i2];
        nt2 a = nt2.a(qeVar, tk0Var, pk0Var);
        this.n = a;
        int i3 = 0;
        iArr2[0] = i;
        nt2VarArr[0] = a;
        while (i3 < length) {
            nt2 a2 = nt2.a(qeVar);
            this.o[i3] = a2;
            int i4 = i3 + 1;
            nt2VarArr[i4] = a2;
            iArr2[i4] = this.c[i3];
            i3 = i4;
        }
        this.p = new lo(iArr2, nt2VarArr);
        this.t = j;
        this.u = j;
    }

    public final jo a(int i) {
        jo joVar = (jo) this.l.get(i);
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i2 = mc3.a;
        if (i < 0 || size > arrayList.size() || i > size) {
            throw new IllegalArgumentException();
        }
        if (i != size) {
            arrayList.subList(i, size).clear();
        }
        this.v = Math.max(this.v, this.l.size());
        int i3 = 0;
        this.n.c(joVar.a(0));
        while (true) {
            nt2[] nt2VarArr = this.o;
            if (i3 >= nt2VarArr.length) {
                return joVar;
            }
            nt2 nt2Var = nt2VarArr[i3];
            i3++;
            nt2Var.c(joVar.a(i3));
        }
    }

    public final boolean b(int i) {
        nt2 nt2Var;
        jo joVar = (jo) this.l.get(i);
        nt2 nt2Var2 = this.n;
        if (nt2Var2.q + nt2Var2.s > joVar.a(0)) {
            return true;
        }
        int i2 = 0;
        do {
            nt2[] nt2VarArr = this.o;
            if (i2 >= nt2VarArr.length) {
                return false;
            }
            nt2Var = nt2VarArr[i2];
            i2++;
        } while (nt2Var.q + nt2Var.s <= joVar.a(i2));
        return true;
    }

    public final boolean c() {
        return this.t != C.TIME_UNSET;
    }

    @Override // yads.vy2
    public final boolean continueLoading(long j) {
        List list;
        long j2;
        long j3;
        boolean z;
        long max;
        gu guVar;
        long max2;
        cu jzVar;
        boolean z2;
        int i;
        List list2;
        zk1[] zk1VarArr;
        int i2;
        long max3;
        long j4;
        lc0 lc0Var;
        if (this.x || this.j.b() || this.j.c != null) {
            return false;
        }
        boolean c = c();
        if (c) {
            list = Collections.EMPTY_LIST;
            j2 = this.t;
        } else {
            list = this.m;
            j2 = ((jo) xy9.b(1, this.l)).h;
        }
        List list3 = list;
        b30 b30Var = this.f;
        gu guVar2 = this.k;
        nc0 nc0Var = (nc0) b30Var;
        if (nc0Var.l != null) {
            z = c;
            j3 = -9223372036854775807L;
        } else {
            long j5 = j2 - j;
            long a = mc3.a(((gd2) nc0Var.j.m.get(nc0Var.k)).b) + mc3.a(nc0Var.j.a) + j2;
            uf2 uf2Var = nc0Var.g;
            if (uf2Var == null || !uf2Var.e.a(a)) {
                long j6 = nc0Var.f;
                long a2 = mc3.a(j6 == C.TIME_UNSET ? System.currentTimeMillis() : j6 + SystemClock.elapsedRealtime());
                c30 c30Var = nc0Var.j;
                j3 = -9223372036854775807L;
                long j7 = c30Var.a;
                long a3 = j7 == C.TIME_UNSET ? -9223372036854775807L : a2 - mc3.a(j7 + ((gd2) c30Var.m.get(nc0Var.k)).b);
                jo joVar = list3.isEmpty() ? null : (jo) xsna.ji.a(1, list3);
                int f = nc0Var.i.f();
                zk1[] zk1VarArr2 = new zk1[f];
                int i3 = 0;
                while (i3 < f) {
                    lc0 lc0Var2 = nc0Var.h[i3];
                    i30 i30Var = lc0Var2.d;
                    if (i30Var == null) {
                        zk1VarArr2[i3] = zk1.a;
                        z2 = c;
                        i = f;
                        i2 = i3;
                        list2 = list3;
                        zk1VarArr = zk1VarArr2;
                    } else {
                        z2 = c;
                        long c2 = i30Var.c(lc0Var2.e, a2) + lc0Var2.f;
                        i = f;
                        long e = (lc0Var2.d.e(lc0Var2.e, a2) + (lc0Var2.d.c(lc0Var2.e, a2) + lc0Var2.f)) - 1;
                        if (joVar != null) {
                            max3 = joVar.c();
                            i2 = i3;
                            list2 = list3;
                            zk1VarArr = zk1VarArr2;
                        } else {
                            list2 = list3;
                            zk1VarArr = zk1VarArr2;
                            i2 = i3;
                            long a4 = lc0Var2.d.a(j2, lc0Var2.e) + lc0Var2.f;
                            int i4 = mc3.a;
                            max3 = Math.max(c2, Math.min(a4, e));
                        }
                        long j8 = max3;
                        if (j8 < c2) {
                            zk1VarArr[i2] = zk1.a;
                        } else {
                            lc0 lc0Var3 = nc0Var.h[i2];
                            uo b = nc0Var.b.b(lc0Var3.b.b);
                            if (b == null || b.equals(lc0Var3.c)) {
                                j4 = e;
                                lc0Var = lc0Var3;
                            } else {
                                j4 = e;
                                lc0 lc0Var4 = new lc0(lc0Var3.e, lc0Var3.b, b, lc0Var3.a, lc0Var3.f, lc0Var3.d);
                                nc0Var.h[i2] = lc0Var4;
                                lc0Var = lc0Var4;
                            }
                            zk1VarArr[i2] = new mc0(lc0Var, j8, j4);
                        }
                    }
                    i3 = i2 + 1;
                    c = z2;
                    f = i;
                    list3 = list2;
                    zk1VarArr2 = zk1VarArr;
                }
                z = c;
                List list4 = list3;
                zk1[] zk1VarArr3 = zk1VarArr2;
                if (nc0Var.j.d) {
                    lc0 lc0Var5 = nc0Var.h[0];
                    long a5 = nc0Var.h[0].a((lc0Var5.d.e(lc0Var5.e, a2) + (lc0Var5.d.c(lc0Var5.e, a2) + lc0Var5.f)) - 1);
                    c30 c30Var2 = nc0Var.j;
                    long j9 = c30Var2.a;
                    max = Math.max(0L, Math.min(j9 == C.TIME_UNSET ? -9223372036854775807L : a2 - mc3.a(j9 + ((gd2) c30Var2.m.get(nc0Var.k)).b), a5) - j);
                } else {
                    max = -9223372036854775807L;
                }
                nc0Var.i.a(j, j5, max, list4, zk1VarArr3);
                int e2 = nc0Var.i.e();
                lc0 lc0Var6 = nc0Var.h[e2];
                uo b2 = nc0Var.b.b(lc0Var6.b.b);
                if (b2 == null || b2.equals(lc0Var6.c)) {
                    guVar = guVar2;
                } else {
                    guVar = guVar2;
                    lc0 lc0Var7 = new lc0(lc0Var6.e, lc0Var6.b, b2, lc0Var6.a, lc0Var6.f, lc0Var6.d);
                    nc0Var.h[e2] = lc0Var7;
                    lc0Var6 = lc0Var7;
                }
                fu fuVar = lc0Var6.a;
                if (fuVar != null) {
                    mp2 mp2Var = lc0Var6.b;
                    qm2 qm2Var = ((ar) fuVar).j == null ? mp2Var.e : null;
                    qm2 e3 = lc0Var6.d == null ? mp2Var.e() : null;
                    if (qm2Var != null || e3 != null) {
                        p30 p30Var = nc0Var.e;
                        nx0 c3 = nc0Var.i.c();
                        int d = nc0Var.i.d();
                        Object g = nc0Var.i.g();
                        mp2 mp2Var2 = lc0Var6.b;
                        if (qm2Var == null || (e3 = qm2Var.a(e3, lc0Var6.c.a)) != null) {
                            qm2Var = e3;
                        }
                        guVar.a = new u61(p30Var, j30.a(mp2Var2, lc0Var6.c.a, qm2Var, 0), c3, d, g, lc0Var6.a);
                    }
                }
                long j10 = lc0Var6.e;
                boolean z3 = j10 != C.TIME_UNSET;
                if (lc0Var6.d.c(j10) == 0) {
                    guVar.b = z3;
                } else {
                    long c4 = lc0Var6.d.c(lc0Var6.e, a2) + lc0Var6.f;
                    long e4 = (lc0Var6.d.e(lc0Var6.e, a2) + (lc0Var6.d.c(lc0Var6.e, a2) + lc0Var6.f)) - 1;
                    if (joVar != null) {
                        max2 = joVar.c();
                    } else {
                        long a6 = lc0Var6.d.a(j2, lc0Var6.e) + lc0Var6.f;
                        int i5 = mc3.a;
                        max2 = Math.max(c4, Math.min(a6, e4));
                    }
                    if (max2 < c4) {
                        nc0Var.l = new zo();
                    } else if (max2 > e4 || (nc0Var.m && max2 >= e4)) {
                        guVar.b = z3;
                    } else if (!z3 || lc0Var6.d.a(max2 - lc0Var6.f) < j10) {
                        int min = (int) Math.min(1, (e4 - max2) + 1);
                        if (j10 != C.TIME_UNSET) {
                            for (int i6 = 1; min > i6 && lc0Var6.d.a(((min + max2) - 1) - lc0Var6.f) >= j10; i6 = 1) {
                                min--;
                            }
                        }
                        long j11 = list4.isEmpty() ? j2 : -9223372036854775807L;
                        p30 p30Var2 = nc0Var.e;
                        int i7 = nc0Var.d;
                        nx0 c5 = nc0Var.i.c();
                        int d2 = nc0Var.i.d();
                        Object g2 = nc0Var.i.g();
                        mp2 mp2Var3 = lc0Var6.b;
                        long a7 = lc0Var6.d.a(max2 - lc0Var6.f);
                        qm2 b3 = lc0Var6.d.b(max2 - lc0Var6.f);
                        if (lc0Var6.a == null) {
                            jzVar = new u03(p30Var2, j30.a(mp2Var3, lc0Var6.c.a, b3, (lc0Var6.d.a() || a3 == C.TIME_UNSET || lc0Var6.a(max2) <= a3) ? 0 : 8), c5, d2, g2, a7, lc0Var6.a(max2), max2, i7, c5);
                        } else {
                            long j12 = max2;
                            int i8 = 1;
                            int i9 = 1;
                            while (i8 < min) {
                                qm2 a8 = b3.a(lc0Var6.d.b((j12 + i8) - lc0Var6.f), lc0Var6.c.a);
                                if (a8 == null) {
                                    break;
                                }
                                i9++;
                                i8++;
                                b3 = a8;
                            }
                            long j13 = (j12 + i9) - 1;
                            long a9 = lc0Var6.a(j13);
                            long j14 = lc0Var6.e;
                            jzVar = new jz(p30Var2, j30.a(mp2Var3, lc0Var6.c.a, b3, (lc0Var6.d.a() || a3 == C.TIME_UNSET || lc0Var6.a(j13) <= a3) ? 0 : 8), c5, d2, g2, a7, a9, j11, (j14 == C.TIME_UNSET || j14 > a9) ? -9223372036854775807L : j14, j12, i9, -mp2Var3.c, lc0Var6.a);
                        }
                        guVar.a = jzVar;
                    } else {
                        guVar.b = true;
                    }
                }
            } else {
                z = c;
                j3 = -9223372036854775807L;
            }
        }
        gu guVar3 = this.k;
        boolean z4 = guVar3.b;
        cu cuVar = guVar3.a;
        guVar3.a = null;
        guVar3.b = false;
        if (z4) {
            this.t = j3;
            this.x = true;
            return true;
        }
        if (cuVar == null) {
            return false;
        }
        this.q = cuVar;
        if (cuVar instanceof jo) {
            jo joVar2 = (jo) cuVar;
            if (z) {
                long j15 = joVar2.g;
                long j16 = this.t;
                if (j15 != j16) {
                    this.n.t = j16;
                    for (nt2 nt2Var : this.o) {
                        nt2Var.t = this.t;
                    }
                }
                this.t = C.TIME_UNSET;
            }
            lo loVar = this.p;
            joVar2.m = loVar;
            int[] iArr = new int[loVar.b.length];
            int i10 = 0;
            while (true) {
                nt2[] nt2VarArr = loVar.b;
                if (i10 >= nt2VarArr.length) {
                    break;
                }
                nt2 nt2Var2 = nt2VarArr[i10];
                iArr[i10] = nt2Var2.q + nt2Var2.p;
                i10++;
            }
            joVar2.n = iArr;
            this.l.add(joVar2);
        } else if (cuVar instanceof u61) {
            ((u61) cuVar).k = this.p;
        }
        this.j.a(cuVar, this, this.i.a(cuVar.c));
        co1 co1Var = this.h;
        Uri uri = cuVar.b.a;
        co1Var.c(new wg1(), new in1(cuVar.c, this.b, cuVar.d, cuVar.e, cuVar.f, co1Var.a(cuVar.g), co1Var.a(cuVar.h)));
        return true;
    }

    public final void d() {
        nt2 nt2Var = this.n;
        int a = a(nt2Var.q + nt2Var.s, this.v - 1);
        while (true) {
            int i = this.v;
            if (i > a) {
                return;
            }
            this.v = i + 1;
            jo joVar = (jo) this.l.get(i);
            nx0 nx0Var = joVar.d;
            if (!nx0Var.equals(this.r)) {
                co1 co1Var = this.h;
                co1Var.a(new in1(1, this.b, nx0Var, joVar.e, joVar.f, co1Var.a(joVar.g), C.TIME_UNSET));
            }
            this.r = nx0Var;
        }
    }

    @Override // yads.vy2
    public final long getBufferedPositionUs() {
        long j;
        if (this.x) {
            return Long.MIN_VALUE;
        }
        if (c()) {
            return this.t;
        }
        long j2 = this.u;
        jo joVar = (jo) xy9.b(1, this.l);
        if (!joVar.d()) {
            joVar = this.l.size() > 1 ? (jo) xy9.b(2, this.l) : null;
        }
        if (joVar != null) {
            j2 = Math.max(j2, joVar.h);
        }
        nt2 nt2Var = this.n;
        synchronized (nt2Var) {
            j = nt2Var.v;
        }
        return Math.max(j2, j);
    }

    @Override // yads.vy2
    public final long getNextLoadPositionUs() {
        if (c()) {
            return this.t;
        }
        if (this.x) {
            return Long.MIN_VALUE;
        }
        return ((jo) xy9.b(1, this.l)).h;
    }

    @Override // yads.vy2
    public final boolean isLoading() {
        return this.j.b();
    }

    @Override // yads.ot2
    public final boolean isReady() {
        return !c() && this.n.a(this.x);
    }

    @Override // yads.vy2
    public final void reevaluateBuffer(long j) {
        if (this.j.c == null && !c()) {
            if (this.j.b()) {
                cu cuVar = this.q;
                cuVar.getClass();
                boolean z = cuVar instanceof jo;
                if (z && b(this.l.size() - 1)) {
                    return;
                }
                b30 b30Var = this.f;
                List list = this.m;
                nc0 nc0Var = (nc0) b30Var;
                if (nc0Var.l == null && nc0Var.i.a(j, cuVar, list)) {
                    bh1 bh1Var = this.j.b;
                    if (bh1Var == null) {
                        throw new IllegalStateException();
                    }
                    bh1Var.a(false);
                    if (z) {
                        this.w = (jo) cuVar;
                        return;
                    }
                    return;
                }
                return;
            }
            b30 b30Var2 = this.f;
            List list2 = this.m;
            nc0 nc0Var2 = (nc0) b30Var2;
            int size = (nc0Var2.l != null || nc0Var2.i.f() < 2) ? list2.size() : nc0Var2.i.a(j, list2);
            if (size < this.l.size()) {
                if (this.j.b()) {
                    throw new IllegalStateException();
                }
                int size2 = this.l.size();
                while (true) {
                    if (size >= size2) {
                        size = -1;
                        break;
                    } else if (!b(size)) {
                        break;
                    } else {
                        size++;
                    }
                }
                if (size == -1) {
                    return;
                }
                long j2 = ((jo) xy9.b(1, this.l)).h;
                jo a = a(size);
                if (this.l.isEmpty()) {
                    this.t = this.u;
                }
                this.x = false;
                co1 co1Var = this.h;
                co1Var.b(new in1(1, this.b, null, 3, null, co1Var.a(a.g), co1Var.a(j2)));
            }
        }
    }

    @Override // yads.ot2
    public final void a() {
        this.j.a(Integer.MIN_VALUE);
        nt2 nt2Var = this.n;
        nk0 nk0Var = nt2Var.h;
        if (nk0Var != null && nk0Var.getState() == 1) {
            mk0 c = nt2Var.h.c();
            c.getClass();
            throw c;
        }
        if (this.j.b()) {
            return;
        }
        nc0 nc0Var = (nc0) this.f;
        zo zoVar = nc0Var.l;
        if (zoVar == null) {
            nc0Var.a.a();
            return;
        }
        throw zoVar;
    }

    @Override // yads.dh1
    public final void b() {
        nt2 nt2Var = this.n;
        nt2Var.b(true);
        nt2Var.d();
        for (nt2 nt2Var2 : this.o) {
            nt2Var2.b(true);
            nt2Var2.d();
        }
        for (lc0 lc0Var : ((nc0) this.f).h) {
            fu fuVar = lc0Var.a;
            if (fuVar != null) {
                ((ar) fuVar).b.release();
            }
        }
        ku kuVar = this.s;
        if (kuVar != null) {
            h30 h30Var = (h30) kuVar;
            synchronized (h30Var) {
                uf2 uf2Var = (uf2) h30Var.o.remove(this);
                if (uf2Var != null) {
                    nt2 nt2Var3 = uf2Var.a;
                    nt2Var3.b(true);
                    nt2Var3.d();
                }
            }
        }
    }

    @Override // yads.zg1
    public final void a(ch1 ch1Var, long j, long j2, boolean z) {
        cu cuVar = (cu) ch1Var;
        this.q = null;
        this.w = null;
        long j3 = cuVar.a;
        Uri uri = cuVar.i.c;
        wg1 wg1Var = new wg1();
        this.i.getClass();
        co1 co1Var = this.h;
        co1Var.a(wg1Var, new in1(cuVar.c, this.b, cuVar.d, cuVar.e, cuVar.f, co1Var.a(cuVar.g), co1Var.a(cuVar.h)));
        if (z) {
            return;
        }
        if (c()) {
            this.n.b(false);
            for (nt2 nt2Var : this.o) {
                nt2Var.b(false);
            }
        } else if (cuVar instanceof jo) {
            a(this.l.size() - 1);
            if (this.l.isEmpty()) {
                this.t = this.u;
            }
        }
        this.g.a(this);
    }

    @Override // yads.zg1
    public final void a(ch1 ch1Var, long j, long j2) {
        hu b;
        cu cuVar = (cu) ch1Var;
        this.q = null;
        nc0 nc0Var = (nc0) this.f;
        nc0Var.getClass();
        if (cuVar instanceof u61) {
            int a = nc0Var.i.a(((u61) cuVar).d);
            lc0 lc0Var = nc0Var.h[a];
            if (lc0Var.d == null && (b = ((ar) lc0Var.a).b()) != null) {
                lc0[] lc0VarArr = nc0Var.h;
                mp2 mp2Var = lc0Var.b;
                lc0VarArr[a] = new lc0(lc0Var.e, mp2Var, lc0Var.c, lc0Var.a, lc0Var.f, new k30(b, mp2Var.c));
            }
        }
        uf2 uf2Var = nc0Var.g;
        if (uf2Var != null) {
            long j3 = uf2Var.d;
            if (j3 == C.TIME_UNSET || cuVar.h > j3) {
                uf2Var.d = cuVar.h;
            }
            uf2Var.e.h = true;
        }
        long j4 = cuVar.a;
        Uri uri = cuVar.i.c;
        wg1 wg1Var = new wg1();
        this.i.getClass();
        co1 co1Var = this.h;
        co1Var.b(wg1Var, new in1(cuVar.c, this.b, cuVar.d, cuVar.e, cuVar.f, co1Var.a(cuVar.g), co1Var.a(cuVar.h)));
        this.g.a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x01e9, code lost:
    
        if (r3.a(r3.a(r2.d), r7.b) != false) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0268  */
    @Override // yads.zg1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ah1 a(ch1 ch1Var, long j, long j2, IOException iOException, int i) {
        long j3;
        boolean z;
        vg1 vg1Var;
        int i2;
        long j4;
        int i3;
        ah1 ah1Var;
        boolean z2;
        boolean z3;
        long j5;
        cu cuVar = (cu) ch1Var;
        long j6 = cuVar.i.b;
        boolean z4 = cuVar instanceof jo;
        int size = this.l.size() - 1;
        boolean z5 = (j6 != 0 && z4 && b(size)) ? false : true;
        Uri uri = cuVar.i.c;
        wg1 wg1Var = new wg1();
        long j7 = cuVar.g;
        int i4 = mc3.a;
        b30 b30Var = this.f;
        ae0 ae0Var = this.i;
        nc0 nc0Var = (nc0) b30Var;
        if (z5) {
            uf2 uf2Var = nc0Var.g;
            if (uf2Var != null) {
                long j8 = uf2Var.d;
                boolean z6 = j8 != C.TIME_UNSET && j8 < j7;
                vf2 vf2Var = uf2Var.e;
                if (vf2Var.g.d) {
                    if (!vf2Var.i) {
                        if (z6) {
                            if (vf2Var.h) {
                                vf2Var.i = true;
                                vf2Var.h = false;
                                com.monetization.ads.exo.source.dash.i iVar = ((com.monetization.ads.exo.source.dash.c) vf2Var.c).a;
                                iVar.D.removeCallbacks(iVar.w);
                                iVar.h();
                            }
                        }
                    }
                    j3 = -9223372036854775807L;
                    z = z5;
                    if (!z) {
                        ah1Var = gh1.d;
                        if (z4) {
                            if (a(size) == cuVar) {
                                if (this.l.isEmpty()) {
                                    this.t = this.u;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        if (ah1Var != null) {
                            this.i.getClass();
                            if (!(iOException instanceof pc2) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof r11) && !(iOException instanceof fh1)) {
                                int i5 = q30.c;
                                for (Throwable th = iOException; th != null; th = th.getCause()) {
                                    if (!(th instanceof q30) || ((q30) th).b != 2008) {
                                    }
                                }
                                j5 = Math.min((i - 1) * 1000, 5000);
                                if (j5 == j3) {
                                    z2 = false;
                                    ah1Var = new ah1(0, j5);
                                } else {
                                    z2 = false;
                                    ah1Var = gh1.e;
                                }
                            }
                            j5 = j3;
                            if (j5 == j3) {
                            }
                        } else {
                            z2 = false;
                        }
                        int i6 = ah1Var.a;
                        z3 = (i6 != 0 || i6 == 1) ? true : z2;
                        co1 co1Var = this.h;
                        ah1 ah1Var2 = ah1Var;
                        co1Var.a(wg1Var, new in1(cuVar.c, this.b, cuVar.d, cuVar.e, cuVar.f, co1Var.a(cuVar.g), co1Var.a(cuVar.h)), iOException, !z3);
                        if (!z3) {
                            this.q = null;
                            this.i.getClass();
                            this.g.a(this);
                        }
                        return ah1Var2;
                    }
                    ji1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                }
            }
            if (!nc0Var.j.d && z4 && (iOException instanceof u11) && ((u11) iOException).e == 404) {
                lc0 lc0Var = nc0Var.h[nc0Var.i.a(cuVar.d)];
                long c = lc0Var.d.c(lc0Var.e);
                if (c != -1 && c != 0) {
                    if (((jo) cuVar).c() > ((lc0Var.d.b() + lc0Var.f) + c) - 1) {
                        nc0Var.m = true;
                        j3 = -9223372036854775807L;
                        z = z5;
                        if (!z) {
                        }
                    }
                }
            }
            lc0 lc0Var2 = nc0Var.h[nc0Var.i.a(cuVar.d)];
            uo b = nc0Var.b.b(lc0Var2.b.b);
            if (b == null || lc0Var2.c.equals(b)) {
                pp0 pp0Var = nc0Var.i;
                s51 s51Var = lc0Var2.b.b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j3 = -9223372036854775807L;
                int f = pp0Var.f();
                int i7 = 0;
                for (int i8 = 0; i8 < f; i8++) {
                    if (pp0Var.b(i8, elapsedRealtime)) {
                        i7++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i9 = 0; i9 < s51Var.size(); i9++) {
                    hashSet.add(Integer.valueOf(((uo) s51Var.get(i9)).c));
                }
                int size2 = hashSet.size();
                vo voVar = nc0Var.b;
                voVar.getClass();
                HashSet hashSet2 = new HashSet();
                ArrayList a = voVar.a(s51Var);
                z = z5;
                for (int i10 = 0; i10 < a.size(); i10++) {
                    hashSet2.add(Integer.valueOf(((uo) a.get(i10)).c));
                }
                ug1 ug1Var = new ug1(size2, size2 - hashSet2.size(), f, i7);
                if (ug1Var.a(2) || ug1Var.a(1)) {
                    ae0Var.getClass();
                    if ((iOException instanceof u11) && ((i3 = ((u11) iOException).e) == 403 || i3 == 404 || i3 == 410 || i3 == 416 || i3 == 500 || i3 == 503)) {
                        if (ug1Var.a(1)) {
                            vg1Var = new vg1(1, 300000L);
                        } else if (ug1Var.a(2)) {
                            vg1Var = new vg1(2, 60000L);
                        }
                        if (vg1Var != null && ug1Var.a(vg1Var.a)) {
                            i2 = vg1Var.a;
                            if (i2 != 2) {
                                pp0 pp0Var2 = nc0Var.i;
                            } else if (i2 == 1) {
                                vo voVar2 = nc0Var.b;
                                uo uoVar = lc0Var2.c;
                                long j9 = vg1Var.b;
                                voVar2.getClass();
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() + j9;
                                String str = uoVar.b;
                                HashMap hashMap = voVar2.a;
                                if (hashMap.containsKey(str)) {
                                    Long l = (Long) hashMap.get(str);
                                    int i11 = mc3.a;
                                    j4 = Math.max(elapsedRealtime2, l.longValue());
                                } else {
                                    j4 = elapsedRealtime2;
                                }
                                hashMap.put(str, Long.valueOf(j4));
                                int i12 = uoVar.c;
                                if (i12 != Integer.MIN_VALUE) {
                                    Integer valueOf = Integer.valueOf(i12);
                                    HashMap hashMap2 = voVar2.b;
                                    if (hashMap2.containsKey(valueOf)) {
                                        Long l2 = (Long) hashMap2.get(valueOf);
                                        int i13 = mc3.a;
                                        elapsedRealtime2 = Math.max(elapsedRealtime2, l2.longValue());
                                    }
                                    hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                                }
                                if (!z) {
                                }
                            }
                        }
                    }
                    vg1Var = null;
                    if (vg1Var != null) {
                        i2 = vg1Var.a;
                        if (i2 != 2) {
                        }
                    }
                }
            }
            j3 = -9223372036854775807L;
            z = z5;
            if (!z) {
            }
        } else {
            nc0Var.getClass();
            j3 = -9223372036854775807L;
        }
        ah1Var = null;
        if (ah1Var != null) {
        }
        int i62 = ah1Var.a;
        if (i62 != 0) {
        }
        co1 co1Var2 = this.h;
        ah1 ah1Var22 = ah1Var;
        co1Var2.a(wg1Var, new in1(cuVar.c, this.b, cuVar.d, cuVar.e, cuVar.f, co1Var2.a(cuVar.g), co1Var2.a(cuVar.h)), iOException, !z3);
        if (!z3) {
        }
        return ah1Var22;
    }

    public final int a(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.l.size()) {
                return this.l.size() - 1;
            }
        } while (((jo) this.l.get(i2)).a(0) <= i);
        return i2 - 1;
    }

    @Override // yads.ot2
    public final int a(ox0 ox0Var, sa0 sa0Var, int i) {
        if (c()) {
            return -3;
        }
        jo joVar = this.w;
        if (joVar != null) {
            int a = joVar.a(0);
            nt2 nt2Var = this.n;
            if (a <= nt2Var.q + nt2Var.s) {
                return -3;
            }
        }
        d();
        return this.n.a(ox0Var, sa0Var, i, this.x);
    }

    @Override // yads.ot2
    public final int a(long j) {
        if (c()) {
            return 0;
        }
        int a = this.n.a(j, this.x);
        jo joVar = this.w;
        if (joVar != null) {
            int a2 = joVar.a(0);
            nt2 nt2Var = this.n;
            a = Math.min(a, a2 - (nt2Var.q + nt2Var.s));
        }
        nt2 nt2Var2 = this.n;
        synchronized (nt2Var2) {
            if (a >= 0) {
                int i = nt2Var2.s + a;
                if (i <= nt2Var2.p) {
                    nt2Var2.s = i;
                }
            }
            throw new IllegalArgumentException();
        }
        d();
        return a;
    }
}
