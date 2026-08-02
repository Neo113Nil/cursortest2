package defpackage;

import android.os.Trace;
import androidx.compose.runtime.f;
import androidx.compose.runtime.h;
import androidx.compose.runtime.internal.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public final class bts extends brw {
    public int A;
    public int B;
    public boolean C;
    public final ats D;
    public final ArrayList E;
    public boolean F;
    public dus0 G;
    public sus0 H;
    public ows0 I;
    public boolean J;
    public r1b0 K;
    public bb9 L;
    public final gid M;
    public yss N;
    public ver O;
    public d5s0 P;
    public final ytd Q;
    public final fse R;
    public boolean S;
    public long T;
    public cts U;
    public final dmw0 a;
    public final ttd b;
    public final sus0 c;
    public final kz40 d;
    public final bb9 e;
    public final bb9 f;
    public final gp50 g;
    public final bud h;
    public fts j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public ux40 p;
    public boolean q;
    public boolean r;
    public wx40 v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final m6w n = new m6w();
    public final ArrayList s = new ArrayList();
    public final m6w t = new m6w();
    public r1b0 u = r1b0.w;
    public final m6w x = new m6w();
    public int z = -1;

    public bts(dmw0 dmw0Var, ttd ttdVar, sus0 sus0Var, kz40 kz40Var, bb9 bb9Var, bb9 bb9Var2, gp50 gp50Var, bud budVar) {
        this.a = dmw0Var;
        this.b = ttdVar;
        this.c = sus0Var;
        this.d = kz40Var;
        this.e = bb9Var;
        this.f = bb9Var2;
        this.g = gp50Var;
        this.h = budVar;
        this.C = ttdVar.g() || ttdVar.e();
        this.D = new ats(0, this);
        this.E = new ArrayList();
        dus0 j = sus0Var.j();
        j.c();
        this.G = j;
        sus0 sus0Var2 = new sus0();
        if (ttdVar.g()) {
            sus0Var2.h();
        }
        if (ttdVar.e()) {
            sus0Var2.D = new wx40((Object) null);
        }
        this.H = sus0Var2;
        ows0 k = sus0Var2.k();
        k.e(true);
        this.I = k;
        this.M = new gid(this, bb9Var);
        dus0 j2 = this.H.j();
        try {
            yss a = j2.a(0);
            j2.c();
            this.N = a;
            this.O = new ver();
            this.Q = new ytd(this);
            fse k2 = ttdVar.k();
            fse D = D();
            this.R = k2.plus(D == null ? EmptyCoroutineContext.a : D);
        } catch (Throwable th) {
            j2.c();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kb30 S(bts btsVar, int i) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int o;
        int i2 = btsVar.G.i(i);
        dus0 dus0Var = btsVar.G;
        Object p = dus0Var.p(i, dus0Var.b);
        if (i2 != 126665345 || !(p instanceof ib30)) {
            return null;
        }
        if (btsVar.G.d(i)) {
            ArrayList arrayList3 = new ArrayList();
            T(btsVar, arrayList3, i);
            if (!arrayList3.isEmpty()) {
                arrayList = arrayList3;
                dus0 dus0Var2 = btsVar.G;
                ib30 ib30Var = (ib30) dus0Var2.p(i, dus0Var2.b);
                Object h = btsVar.G.h(i, 0);
                yss a = btsVar.G.a(i);
                int a2 = uus0.a(i, btsVar.G.b) + i;
                ArrayList arrayList4 = new ArrayList();
                arrayList2 = btsVar.s;
                o = wwg.o(i, arrayList2);
                if (o < 0) {
                    o = -(o + 1);
                }
                while (o < arrayList2.size()) {
                    zvw zvwVar = (zvw) arrayList2.get(o);
                    if (zvwVar.b >= a2) {
                        break;
                    }
                    arrayList4.add(new Pair(zvwVar.a, zvwVar.c));
                    o++;
                }
                return new kb30(ib30Var, h, btsVar.h, btsVar.c, a, arrayList4, btsVar.p(i), arrayList);
            }
        }
        arrayList = null;
        dus0 dus0Var22 = btsVar.G;
        ib30 ib30Var2 = (ib30) dus0Var22.p(i, dus0Var22.b);
        Object h2 = btsVar.G.h(i, 0);
        yss a3 = btsVar.G.a(i);
        int a22 = uus0.a(i, btsVar.G.b) + i;
        ArrayList arrayList42 = new ArrayList();
        arrayList2 = btsVar.s;
        o = wwg.o(i, arrayList2);
        if (o < 0) {
        }
        while (o < arrayList2.size()) {
        }
        return new kb30(ib30Var2, h2, btsVar.h, btsVar.c, a3, arrayList42, btsVar.p(i), arrayList);
    }

    public static final void T(bts btsVar, ArrayList arrayList, int i) {
        int a = uus0.a(i, btsVar.G.b) + i;
        int i2 = i + 1;
        while (i2 < a) {
            if (btsVar.G.j(i2)) {
                kb30 S = S(btsVar, i2);
                if (S != null) {
                    arrayList.add(S);
                }
            } else if (btsVar.G.d(i2)) {
                T(btsVar, arrayList, i2);
            }
            i2 += uus0.a(i2, btsVar.G.b);
        }
    }

    public static final int U(int i, int i2, int i3, bts btsVar, boolean z) {
        int i4;
        long[] jArr;
        Object[] objArr;
        int i5;
        long[] jArr2;
        Object[] objArr2;
        int i6;
        int i7;
        dus0 dus0Var = btsVar.G;
        int i8 = 0;
        if (dus0Var.j(i2)) {
            int i9 = dus0Var.i(i2);
            Object p = dus0Var.p(i2, dus0Var.b);
            if (i9 == 126665345 && (p instanceof ib30)) {
                kb30 S = S(btsVar, i2);
                if (S != null) {
                    btsVar.b.c(S);
                    btsVar.M.e();
                    gid gidVar = btsVar.M;
                    bud budVar = btsVar.h;
                    ttd ttdVar = btsVar.b;
                    wc70 wc70Var = gidVar.b.a;
                    wc70Var.d(ob70.c);
                    rzo.W(wc70Var, budVar, ttdVar, S);
                }
                if (!z || i2 == i) {
                    return dus0Var.o(i2);
                }
                gid gidVar2 = btsVar.M;
                gidVar2.c();
                gidVar2.b();
                bts btsVar2 = gidVar2.a;
                int o = btsVar2.G.l(i2) ? 1 : btsVar2.G.o(i2);
                if (o > 0) {
                    gidVar2.f(i3, o);
                }
                return 0;
            }
            if (i9 == 206 && jl40.l(p, lid.e)) {
                Object h = dus0Var.h(i2, 0);
                gts gtsVar = h instanceof gts ? (gts) h : null;
                Object obj = gtsVar != null ? gtsVar.a : null;
                zss zssVar = obj instanceof zss ? (zss) obj : null;
                if (zssVar != null) {
                    iz40 iz40Var = zssVar.a.e;
                    Object[] objArr3 = iz40Var.b;
                    long[] jArr3 = iz40Var.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j = jArr3[i10];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8;
                                int i12 = 8 - ((~(i10 - length)) >>> 31);
                                int i13 = i8;
                                while (i13 < i12) {
                                    if ((255 & j) < 128) {
                                        bts btsVar3 = (bts) objArr3[(i10 << 3) + i13];
                                        sus0 sus0Var = btsVar3.c;
                                        if (sus0Var.b <= 0 || (sus0Var.a[1] & SelfTester_JCP.DECRYPT_CBC) == 0) {
                                            jArr2 = jArr3;
                                            objArr2 = objArr3;
                                            i6 = i8;
                                            i7 = i11;
                                        } else {
                                            bud budVar2 = btsVar3.h;
                                            synchronized (budVar2.w) {
                                                budVar2.r();
                                                i7 = i11;
                                                hz40 hz40Var = budVar2.G;
                                                budVar2.G = cmm0.b();
                                                try {
                                                    budVar2.O.l0(hz40Var);
                                                } finally {
                                                }
                                            }
                                            bb9 bb9Var = new bb9();
                                            btsVar3.L = bb9Var;
                                            dus0 j2 = btsVar3.c.j();
                                            try {
                                                btsVar3.G = j2;
                                                gid gidVar3 = btsVar3.M;
                                                bb9 bb9Var2 = gidVar3.b;
                                                try {
                                                    gidVar3.b = bb9Var;
                                                    btsVar3.R(0);
                                                    gid gidVar4 = btsVar3.M;
                                                    gidVar4.b();
                                                    jArr2 = jArr3;
                                                    if (gidVar4.c) {
                                                        objArr2 = objArr3;
                                                        gidVar4.b.a.d(vb70.c);
                                                        if (gidVar4.c) {
                                                            gidVar4.d(false);
                                                            gidVar4.d(false);
                                                            gidVar4.b.a.d(eb70.c);
                                                            i6 = 0;
                                                            gidVar4.c = false;
                                                        }
                                                    } else {
                                                        objArr2 = objArr3;
                                                    }
                                                    i6 = 0;
                                                } finally {
                                                }
                                            } finally {
                                                j2.c();
                                            }
                                        }
                                        btsVar.b.u(btsVar3.h);
                                    } else {
                                        jArr2 = jArr3;
                                        objArr2 = objArr3;
                                        i6 = i8;
                                        i7 = i11;
                                    }
                                    j >>= i7;
                                    i13++;
                                    i11 = i7;
                                    objArr3 = objArr2;
                                    i8 = i6;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                objArr = objArr3;
                                i5 = i8;
                                if (i12 != i11) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                                objArr = objArr3;
                                i5 = i8;
                            }
                            if (i10 == length) {
                                break;
                            }
                            i10++;
                            objArr3 = objArr;
                            i8 = i5;
                            jArr3 = jArr;
                        }
                    }
                }
                return dus0Var.o(i2);
            }
            i4 = 1;
            if (!dus0Var.l(i2)) {
                return dus0Var.o(i2);
            }
        } else {
            i4 = 1;
            if (dus0Var.d(i2)) {
                int a = uus0.a(i2, dus0Var.b) + i2;
                int i14 = 0;
                for (int i15 = i2 + 1; i15 < a; i15 += uus0.a(i15, dus0Var.b)) {
                    boolean l = dus0Var.l(i15);
                    if (l) {
                        btsVar.M.c();
                        gid gidVar5 = btsVar.M;
                        Object n = dus0Var.n(i15);
                        gidVar5.c();
                        gidVar5.h.add(n);
                    }
                    i14 += U(i, i15, l ? 0 : i3 + i14, btsVar, l || z);
                    if (l) {
                        btsVar.M.c();
                        btsVar.M.a();
                    }
                }
                if (!dus0Var.l(i2)) {
                    return i14;
                }
            } else if (!dus0Var.l(i2)) {
                return dus0Var.o(i2);
            }
        }
        return i4;
    }

    public final vtd A() {
        cts ctsVar = this.U;
        if (ctsVar != null) {
            return ctsVar;
        }
        cts ctsVar2 = new cts(this.h);
        this.U = ctsVar2;
        return ctsVar2;
    }

    public final aii0 B() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (aii0) unr0.k(1, arrayList);
    }

    public final boolean C() {
        if (!E() || this.w) {
            return true;
        }
        aii0 B = B();
        return (B == null || (B.b & 4) == 0) ? false : true;
    }

    public final ytd D() {
        if (this.b.l()) {
            return this.Q;
        }
        return null;
    }

    public final boolean E() {
        aii0 B;
        return (this.S || this.y || this.w || (B = B()) == null || (B.b & 8) != 0) ? false : true;
    }

    public final void F(ArrayList arrayList) {
        yss a;
        yss yssVar;
        dus0 dus0Var;
        wx40 wx40Var;
        int[] iArr;
        bb9 bb9Var;
        ttd ttdVar;
        int i;
        int i2;
        dus0 dus0Var2;
        bts btsVar = this;
        ttd ttdVar2 = btsVar.b;
        bb9 bb9Var2 = btsVar.f;
        if (bb9Var2 == null) {
            bb9Var2 = null;
        }
        if (bb9Var2 == null) {
            lid.b("Inconsistent composition");
            ny61.A();
            return;
        }
        gid gidVar = btsVar.M;
        bb9 bb9Var3 = gidVar.b;
        try {
            gidVar.b = bb9Var2;
            bb9Var2.a.d(tb70.c);
            int size = arrayList.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                Pair pair = (Pair) arrayList.get(i4);
                kb30 kb30Var = (kb30) pair.getFirst();
                kb30 kb30Var2 = (kb30) pair.getSecond();
                yss e = uh6.e(kb30Var.a());
                sus0 f = uus0.f(kb30Var.g());
                int g = f.g(e);
                g6w g6wVar = new g6w(i3);
                gidVar.b();
                wc70 wc70Var = gidVar.b.a;
                wc70Var.d(bb70.c);
                rzo.V(wc70Var, i3, g6wVar, 1, e);
                if (kb30Var2 == null) {
                    if (f == btsVar.H) {
                        if (!btsVar.I.w) {
                            lid.a("Check failed");
                        }
                        btsVar.z();
                    }
                    dus0 j = f.j();
                    try {
                        j.r(g);
                        gidVar.f = g;
                        bb9 bb9Var4 = new bb9();
                        jo0 jo0Var = new jo0(btsVar, bb9Var4, j, kb30Var, 11);
                        dus0Var2 = j;
                        try {
                            btsVar = this;
                            btsVar.L(null, null, null, EmptyList.a, jo0Var);
                            bb9 bb9Var5 = gidVar.b;
                            bb9Var5.getClass();
                            if (!bb9Var4.c()) {
                                wc70 wc70Var2 = bb9Var5.a;
                                wc70Var2.d(wa70.c);
                                rzo.V(wc70Var2, i3, bb9Var4, 1, g6wVar);
                            }
                            dus0Var2.c();
                            ttdVar = ttdVar2;
                            i = size;
                            i2 = i4;
                        } catch (Throwable th) {
                            th = th;
                            dus0Var2.c();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        dus0Var2 = j;
                    }
                } else {
                    jb30 p = ttdVar2.p(kb30Var2);
                    sus0 f2 = p != null ? uus0.f(p.a()) : null;
                    sus0 f3 = f2 == null ? uus0.f(kb30Var2.g()) : f2;
                    if (f2 == null || (a = f2.f(i3)) == null) {
                        a = kb30Var2.a();
                    }
                    yss e2 = uh6.e(a);
                    ArrayList arrayList2 = new ArrayList();
                    dus0 j2 = f3.j();
                    sus0 sus0Var = f3;
                    try {
                        wwg.h(j2, arrayList2, sus0Var.g(e2));
                        j2.c();
                        if (arrayList2.isEmpty()) {
                            yssVar = e2;
                        } else {
                            bb9 bb9Var6 = gidVar.b;
                            bb9Var6.getClass();
                            if (arrayList2.isEmpty()) {
                                yssVar = e2;
                            } else {
                                wc70 wc70Var3 = bb9Var6.a;
                                wc70Var3.d(xa70.c);
                                yssVar = e2;
                                rzo.V(wc70Var3, 1, arrayList2, 0, g6wVar);
                            }
                            sus0 sus0Var2 = btsVar.c;
                            if (f == sus0Var2) {
                                int g2 = sus0Var2.g(e);
                                btsVar.m0(g2, btsVar.q0(g2) + arrayList2.size());
                            }
                        }
                        wc70 wc70Var4 = gidVar.b.a;
                        wc70Var4.d(ya70.c);
                        int i5 = wc70Var4.f - wc70Var4.a[wc70Var4.b - 1].b;
                        Object[] objArr = wc70Var4.e;
                        objArr[i5] = p;
                        objArr[i5 + 1] = ttdVar2;
                        objArr[i5 + 3] = kb30Var;
                        objArr[i5 + 2] = kb30Var2;
                        dus0 j3 = sus0Var.j();
                        try {
                            dus0 dus0Var3 = btsVar.G;
                            int[] iArr2 = btsVar.o;
                            wx40 wx40Var2 = btsVar.v;
                            btsVar.o = null;
                            btsVar.v = null;
                            try {
                                btsVar.G = j3;
                                int g3 = sus0Var.g(uh6.e(yssVar));
                                j3.r(g3);
                                gidVar.f = g3;
                                bb9 bb9Var7 = new bb9();
                                bb9 bb9Var8 = gidVar.b;
                                try {
                                    gidVar.b = bb9Var7;
                                    ttdVar = ttdVar2;
                                    boolean z = gidVar.e;
                                    try {
                                        gidVar.e = false;
                                        try {
                                            bud b = kb30Var2.b();
                                            try {
                                                bud b2 = kb30Var.b();
                                                Integer valueOf = Integer.valueOf(j3.g);
                                                try {
                                                    dus0Var = j3;
                                                    i = size;
                                                    wx40Var = wx40Var2;
                                                    iArr = iArr2;
                                                    i2 = i4;
                                                    bb9Var = bb9Var8;
                                                    try {
                                                        btsVar.L(b, b2, valueOf, kb30Var2.d(), new bdp(17, btsVar, kb30Var));
                                                        try {
                                                            gidVar.e = z;
                                                            try {
                                                                gidVar.b = bb9Var;
                                                                bb9Var.getClass();
                                                                if (!bb9Var7.c()) {
                                                                    wc70 wc70Var5 = bb9Var.a;
                                                                    wc70Var5.d(wa70.c);
                                                                    rzo.V(wc70Var5, 0, bb9Var7, 1, g6wVar);
                                                                }
                                                                try {
                                                                    btsVar.G = dus0Var3;
                                                                    btsVar.o = iArr;
                                                                    btsVar.v = wx40Var;
                                                                    dus0Var.c();
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    dus0Var.c();
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                btsVar.G = dus0Var3;
                                                                btsVar.o = iArr;
                                                                btsVar.v = wx40Var;
                                                                throw th;
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            gidVar.b = bb9Var;
                                                            throw th;
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        gidVar.e = z;
                                                        throw th;
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    dus0Var = j3;
                                                    wx40Var = wx40Var2;
                                                    bb9Var = bb9Var8;
                                                    iArr = iArr2;
                                                    gidVar.e = z;
                                                    throw th;
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                                bb9Var = bb9Var8;
                                                dus0Var = j3;
                                                wx40Var = wx40Var2;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            wx40Var = wx40Var2;
                                            bb9Var = bb9Var8;
                                            dus0Var = j3;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        wx40Var = wx40Var2;
                                        bb9Var = bb9Var8;
                                        dus0Var = j3;
                                        iArr = iArr2;
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    wx40Var = wx40Var2;
                                    bb9Var = bb9Var8;
                                    dus0Var = j3;
                                    iArr = iArr2;
                                }
                            } catch (Throwable th12) {
                                th = th12;
                                wx40Var = wx40Var2;
                                dus0Var = j3;
                                iArr = iArr2;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            dus0Var = j3;
                        }
                    } catch (Throwable th14) {
                        j2.c();
                        throw th14;
                    }
                }
                gidVar.b.a.d(vb70.c);
                i4 = i2 + 1;
                ttdVar2 = ttdVar;
                size = i;
                i3 = 0;
            }
            gidVar.b();
            gidVar.b.a.d(fb70.c);
            gidVar.f = 0;
            gidVar.b = bb9Var3;
        } catch (Throwable th15) {
            gidVar.b = bb9Var3;
            throw th15;
        }
    }

    public final void G(ib30 ib30Var, r1b0 r1b0Var, Object obj, boolean z) {
        c0(126665345, ib30Var);
        I();
        p0(obj);
        long j = this.T;
        int i = 17;
        try {
            this.T = 126665345L;
            if (this.S) {
                ows0.z(this.I);
            }
            boolean z2 = (this.S || jl40.l(this.G.f(), r1b0Var)) ? false : true;
            if (z2) {
                O(r1b0Var);
            }
            Z(202, lid.c, r1b0Var, 0);
            this.K = null;
            if (!this.S || z) {
                boolean z3 = this.w;
                this.w = z2;
                a aVar = new a(-59194059, new a6n(i, ib30Var, obj), true);
                ym11.e(2, aVar);
                aVar.invoke(this, 1);
                this.w = z3;
            } else {
                this.J = true;
                ows0 ows0Var = this.I;
                this.b.m(new kb30(ib30Var, obj, this.h, this.H, ows0Var.b(ows0Var.G(ows0Var.v, ows0Var.b)), EmptyList.a, o(), null));
            }
        } catch (Throwable th) {
            try {
                kpb1.b(th, new dnr(i, this));
                throw th;
            } finally {
                t(false);
                this.K = null;
                this.T = j;
                t(false);
            }
        }
    }

    public final Object H(Object obj, Object obj2) {
        dus0 dus0Var = this.G;
        int i = dus0Var.g;
        Object t = wwg.t(i < dus0Var.h ? dus0Var.p(i, dus0Var.b) : null, obj, obj2);
        return t == null ? new s9x(obj, obj2) : t;
    }

    public final Object I() {
        boolean z = this.S;
        o430 o430Var = did.a;
        if (!z) {
            Object m = this.G.m();
            if (!this.y || (m instanceof l2k0)) {
                return m;
            }
        } else if (this.r) {
            lid.a("A call to createNode(), emitNode() or useNode() expected");
            return o430Var;
        }
        return o430Var;
    }

    public final List J() {
        ttd ttdVar = this.b;
        rtd i = ttdVar.i();
        bud budVar = i != null ? (bud) i : null;
        if (budVar != null) {
            sus0 sus0Var = budVar.y;
            Integer e = ipb1.e(uus0.f(sus0Var), ttdVar);
            if (e != null) {
                dus0 j = uus0.f(sus0Var).j();
                try {
                    ArrayList h = ipb1.h(j, e.intValue(), 0);
                    j.c();
                    return kotlin.collections.a.m0(budVar.O.J(), h);
                } catch (Throwable th) {
                    j.c();
                    throw th;
                }
            }
        }
        return EmptyList.a;
    }

    public final int K(int i) {
        int q = this.G.q(i) + 1;
        int i2 = 0;
        while (q < i) {
            if (!this.G.k(q)) {
                i2++;
            }
            q += uus0.a(q, this.G.b);
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (r10 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object L(bud budVar, bud budVar2, Integer num, List list, sls slsVar) {
        Object invoke;
        boolean z = this.F;
        int i = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair = (Pair) list.get(i2);
                aii0 aii0Var = (aii0) pair.getFirst();
                Object second = pair.getSecond();
                if (second != null) {
                    k0(aii0Var, second);
                } else {
                    k0(aii0Var, null);
                }
            }
            if (budVar != null) {
                int intValue = num != null ? num.intValue() : -1;
                if (budVar2 == null || budVar2.equals(budVar) || intValue < 0) {
                    invoke = slsVar.invoke();
                } else {
                    budVar.K = budVar2;
                    budVar.L = intValue;
                    try {
                        invoke = slsVar.invoke();
                        budVar.K = null;
                        budVar.L = 0;
                    } catch (Throwable th) {
                        budVar.K = null;
                        budVar.L = 0;
                        throw th;
                    }
                }
            }
            invoke = slsVar.invoke();
            this.F = z;
            this.k = i;
            return invoke;
        } catch (Throwable th2) {
            this.F = z;
            this.k = i;
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0039, code lost:
    
        if (r11.b < r4) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x034c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M() {
        zvw zvwVar;
        int i;
        int i2;
        long j;
        ArrayList arrayList;
        aii0 aii0Var;
        int i3;
        Object[] objArr;
        int i4;
        Object[] objArr2;
        long j2;
        long j3;
        qy40 qy40Var;
        int i5;
        ArrayList arrayList2;
        int o;
        int i6;
        long j4;
        int hashCode;
        Object b;
        int hashCode2;
        ngd0 ngd0Var = ngd0.F;
        boolean z = this.F;
        this.F = true;
        dus0 dus0Var = this.G;
        int i7 = dus0Var.i;
        int a = uus0.a(i7, dus0Var.b) + i7;
        int i8 = this.k;
        long j5 = this.T;
        int i9 = this.l;
        int i10 = this.m;
        int i11 = this.G.g;
        ArrayList arrayList3 = this.s;
        int o2 = wwg.o(i11, arrayList3);
        if (o2 < 0) {
            o2 = -(o2 + 1);
        }
        if (o2 < arrayList3.size()) {
            zvwVar = (zvw) arrayList3.get(o2);
        }
        zvwVar = null;
        int i12 = 1;
        int i13 = i7;
        int i14 = 0;
        while (zvwVar != null) {
            aii0 aii0Var2 = zvwVar.a;
            int i15 = zvwVar.b;
            ngd0 ngd0Var2 = ngd0Var;
            int o3 = wwg.o(i15, arrayList3);
            if (o3 >= 0) {
            }
            Object obj = zvwVar.c;
            if (obj == null) {
                aii0Var2.getClass();
                i = i8;
                j = j5;
                i2 = i9;
            } else {
                int i16 = 8;
                hz40 hz40Var = aii0Var2.g;
                if (hz40Var == null) {
                    i = i8;
                    j = j5;
                    i2 = i9;
                } else {
                    i = i8;
                    if (obj instanceof qxi) {
                        qxi qxiVar = (qxi) obj;
                        e3t0 e3t0Var = qxiVar.b;
                        if (e3t0Var == null) {
                            e3t0Var = ngd0Var2;
                        }
                        i2 = i9;
                        i3 = !e3t0Var.f(qxiVar.d().f, hz40Var.d(qxiVar)) ? 1 : 0;
                        j = j5;
                        arrayList = arrayList3;
                        aii0Var = aii0Var2;
                    } else {
                        i2 = i9;
                        if (obj instanceof iz40) {
                            iz40 iz40Var = (iz40) obj;
                            if (iz40Var.h()) {
                                Object[] objArr3 = iz40Var.b;
                                long[] jArr = iz40Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    arrayList = arrayList3;
                                    aii0Var = aii0Var2;
                                    int i17 = 0;
                                    while (true) {
                                        long j6 = jArr[i17];
                                        j = j5;
                                        Object[] objArr4 = objArr3;
                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i18 = 8 - ((~(i17 - length)) >>> 31);
                                            int i19 = 0;
                                            while (i19 < i18) {
                                                if ((j6 & 255) < 128) {
                                                    i4 = i19;
                                                    Object obj2 = objArr4[(i17 << 3) + i19];
                                                    objArr2 = objArr4;
                                                    if (!(obj2 instanceof qxi)) {
                                                        break;
                                                    }
                                                    qxi qxiVar2 = (qxi) obj2;
                                                    e3t0 e3t0Var2 = qxiVar2.b;
                                                    if (e3t0Var2 == null) {
                                                        e3t0Var2 = ngd0Var2;
                                                    }
                                                    j2 = j6;
                                                    if (!e3t0Var2.f(qxiVar2.d().f, hz40Var.d(qxiVar2))) {
                                                        break;
                                                    }
                                                } else {
                                                    i4 = i19;
                                                    objArr2 = objArr4;
                                                    j2 = j6;
                                                }
                                                j6 = j2 >> i16;
                                                i19 = i4 + 1;
                                                objArr4 = objArr2;
                                            }
                                            objArr = objArr4;
                                            if (i18 != i16) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr4;
                                        }
                                        if (i17 == length) {
                                            break;
                                        }
                                        i17++;
                                        j5 = j;
                                        objArr3 = objArr;
                                        i16 = 8;
                                    }
                                    i3 = i12;
                                }
                            }
                            j = j5;
                            arrayList = arrayList3;
                            aii0Var = aii0Var2;
                            i3 = 0;
                        } else {
                            j = j5;
                        }
                    }
                    if (i3 == 0) {
                        this.G.r(i15);
                        int i20 = this.G.g;
                        P(i13, i20, i7);
                        int q = this.G.q(i20);
                        while (q != i7 && !this.G.l(q)) {
                            q = this.G.q(q);
                        }
                        int i21 = this.G.l(q) ? 0 : i;
                        if (q != i20) {
                            int q0 = (q0(q) - this.G.o(i20)) + i21;
                            while (i21 < q0 && q != i15) {
                                q++;
                                while (q < i15) {
                                    int a2 = uus0.a(q, this.G.b) + q;
                                    if (i15 >= a2) {
                                        i21 += this.G.l(q) ? i12 : q0(q);
                                        q = a2;
                                    }
                                }
                                break;
                            }
                        }
                        this.k = i21;
                        this.m = K(i20);
                        int q2 = this.G.q(i20);
                        int i22 = 3;
                        long j7 = 0;
                        int i23 = 0;
                        while (true) {
                            if (q2 < 0) {
                                i6 = i20;
                                j4 = j;
                                break;
                            }
                            if (q2 == i7) {
                                j4 = j;
                                j7 ^= Long.rotateLeft(j4, i23);
                                i6 = i20;
                                break;
                            }
                            j4 = j;
                            dus0 dus0Var2 = this.G;
                            boolean k = dus0Var2.k(q2);
                            int[] iArr = dus0Var2.b;
                            i6 = i20;
                            if (k) {
                                Object p = dus0Var2.p(q2, iArr);
                                if (p != null) {
                                    if (p instanceof Enum) {
                                        hashCode2 = ((Enum) p).ordinal();
                                    } else if (p instanceof ib30) {
                                        hashCode = 126665345;
                                    } else {
                                        hashCode2 = p.hashCode();
                                    }
                                    hashCode = hashCode2;
                                } else {
                                    hashCode = 0;
                                }
                            } else {
                                int i24 = dus0Var2.i(q2);
                                hashCode = (i24 != 207 || (b = dus0Var2.b(q2, iArr)) == null || b.equals(did.a)) ? i24 : b.hashCode();
                            }
                            if (hashCode == 126665345) {
                                j7 ^= Long.rotateLeft(hashCode, i23);
                                break;
                            }
                            j7 = (j7 ^ Long.rotateLeft(hashCode, i22)) ^ Long.rotateLeft(this.G.k(q2) ? 0 : K(q2), i23);
                            i22 = (i22 + 6) % 64;
                            i23 = (i23 + 6) % 64;
                            q2 = this.G.q(q2);
                            j = j4;
                            i20 = i6;
                        }
                        this.T = j7;
                        this.K = null;
                        wls wlsVar = aii0Var.d;
                        if (wlsVar == null) {
                            ny61.r("Invalid restart scope");
                            return;
                        }
                        wlsVar.invoke(this, Integer.valueOf(i12));
                        this.K = null;
                        dus0 dus0Var3 = this.G;
                        int a3 = uus0.a(i7, dus0Var3.b) + i7;
                        int i25 = dus0Var3.g;
                        if (i25 < i7 || i25 > a3) {
                            lid.a("Index " + i7 + " is not a parent of " + i25);
                        }
                        dus0Var3.i = i7;
                        dus0Var3.h = a3;
                        dus0Var3.l = 0;
                        dus0Var3.m = 0;
                        j3 = j4;
                        i14 = i12;
                        i13 = i6;
                    } else {
                        aii0 aii0Var3 = aii0Var;
                        long j8 = j;
                        ArrayList arrayList4 = this.E;
                        arrayList4.add(aii0Var3);
                        this.g.B();
                        bii0 bii0Var = aii0Var3.a;
                        if (bii0Var == null || (qy40Var = aii0Var3.f) == null) {
                            j3 = j8;
                        } else {
                            aii0Var3.d(i12);
                            try {
                                Object[] objArr5 = qy40Var.b;
                                int[] iArr2 = qy40Var.c;
                                long[] jArr2 = qy40Var.a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i26 = 0;
                                    while (true) {
                                        long j9 = jArr2[i26];
                                        j3 = j8;
                                        if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i27 = 8 - ((~(i26 - length2)) >>> 31);
                                            for (int i28 = 0; i28 < i27; i28 = i5 + 1) {
                                                if ((j9 & 255) < 128) {
                                                    int i29 = (i26 << 3) + i28;
                                                    i5 = i28;
                                                    Object obj3 = objArr5[i29];
                                                    int i30 = iArr2[i29];
                                                    bii0Var.c(obj3);
                                                } else {
                                                    i5 = i28;
                                                }
                                                j9 >>= 8;
                                            }
                                            if (i27 != 8) {
                                                break;
                                            }
                                        }
                                        if (i26 == length2) {
                                            break;
                                        }
                                        i26++;
                                        j8 = j3;
                                    }
                                } else {
                                    j3 = j8;
                                }
                                aii0Var3.d(false);
                            } catch (Throwable th) {
                                aii0Var3.d(false);
                                throw th;
                            }
                        }
                        i12 = 1;
                        arrayList4.remove(arrayList4.size() - 1);
                    }
                    arrayList2 = arrayList;
                    o = wwg.o(this.G.g, arrayList2);
                    if (o < 0) {
                        o = -(o + 1);
                    }
                    if (o < arrayList2.size()) {
                        zvw zvwVar2 = (zvw) arrayList2.get(o);
                        if (zvwVar2.b < a) {
                            zvwVar = zvwVar2;
                            arrayList3 = arrayList2;
                            ngd0Var = ngd0Var2;
                            i8 = i;
                            i9 = i2;
                            j5 = j3;
                        }
                    }
                    zvwVar = null;
                    arrayList3 = arrayList2;
                    ngd0Var = ngd0Var2;
                    i8 = i;
                    i9 = i2;
                    j5 = j3;
                }
            }
            arrayList = arrayList3;
            aii0Var = aii0Var2;
            i3 = i12;
            if (i3 == 0) {
            }
            arrayList2 = arrayList;
            o = wwg.o(this.G.g, arrayList2);
            if (o < 0) {
            }
            if (o < arrayList2.size()) {
            }
            zvwVar = null;
            arrayList3 = arrayList2;
            ngd0Var = ngd0Var2;
            i8 = i;
            i9 = i2;
            j5 = j3;
        }
        int i31 = i8;
        long j10 = j5;
        int i32 = i9;
        if (i14 != 0) {
            P(i13, i7, i7);
            this.G.t();
            int q02 = q0(i7);
            this.k = i31 + q02;
            this.l = i32 + q02;
            this.m = i10;
        } else {
            X();
        }
        this.T = j10;
        this.F = z;
    }

    public final void N() {
        R(this.G.g);
        gid gidVar = this.M;
        gidVar.d(false);
        gidVar.e();
        gidVar.b.a.d(rb70.c);
        int i = gidVar.f;
        dus0 dus0Var = gidVar.a.G;
        gidVar.f = uus0.a(dus0Var.g, dus0Var.b) + i;
    }

    public final void O(r1b0 r1b0Var) {
        wx40 wx40Var = this.v;
        if (wx40Var == null) {
            wx40Var = new wx40((Object) null);
            this.v = wx40Var;
        }
        wx40Var.i(this.G.g, r1b0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(int i, int i2, int i3) {
        dus0 dus0Var = this.G;
        if (i != i2) {
            if (i != i3 && i2 != i3) {
                if (dus0Var.q(i) == i2) {
                    i3 = i2;
                } else if (dus0Var.q(i2) != i) {
                    if (dus0Var.q(i) == dus0Var.q(i2)) {
                        i3 = dus0Var.q(i);
                    } else {
                        int i4 = i;
                        int i5 = 0;
                        while (i4 > 0 && i4 != i3) {
                            i4 = dus0Var.q(i4);
                            i5++;
                        }
                        int i6 = i2;
                        int i7 = 0;
                        while (i6 > 0 && i6 != i3) {
                            i6 = dus0Var.q(i6);
                            i7++;
                        }
                        int i8 = i5 - i7;
                        int i9 = i;
                        for (int i10 = 0; i10 < i8; i10++) {
                            i9 = dus0Var.q(i9);
                        }
                        int i11 = i7 - i5;
                        int i12 = i2;
                        for (int i13 = 0; i13 < i11; i13++) {
                            i12 = dus0Var.q(i12);
                        }
                        i3 = i9;
                        for (int i14 = i12; i3 != i14; i14 = dus0Var.q(i14)) {
                            i3 = dus0Var.q(i3);
                        }
                    }
                }
            }
            while (i > 0 && i != i3) {
                if (!dus0Var.l(i)) {
                    this.M.a();
                }
                i = dus0Var.q(i);
            }
            s(i2, i3);
        }
        i3 = i;
        while (i > 0) {
            if (!dus0Var.l(i)) {
            }
            i = dus0Var.q(i);
        }
        s(i2, i3);
    }

    public final Object Q() {
        boolean z = this.S;
        o430 o430Var = did.a;
        if (!z) {
            Object m = this.G.m();
            if (!this.y || (m instanceof l2k0)) {
                return m instanceof gts ? ((gts) m).a : m;
            }
        } else if (this.r) {
            lid.a("A call to createNode(), emitNode() or useNode() expected");
            return o430Var;
        }
        return o430Var;
    }

    public final void R(int i) {
        boolean l = this.G.l(i);
        gid gidVar = this.M;
        if (l) {
            gidVar.c();
            Object n = this.G.n(i);
            gidVar.c();
            gidVar.h.add(n);
        }
        U(i, i, 0, this, l);
        gidVar.c();
        if (l) {
            gidVar.a();
        }
    }

    public final boolean V(int i, boolean z) {
        aii0 B;
        if ((i & 1) == 0 && (this.S || this.y)) {
            d5s0 d5s0Var = this.P;
            if (d5s0Var != null && (B = B()) != null && d5s0Var.d()) {
                int i2 = B.b;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                B.b = i3;
                B.b = (this.y ? i2 | HProv.PP_SECURITY_LEVEL : i3 & (-129)) | 256;
                wc70 wc70Var = this.M.b.a;
                wc70Var.d(qb70.c);
                rzo.U(wc70Var, 0, B);
                this.b.t(B);
                return false;
            }
        } else if (!z && E()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        long rotateLeft;
        if (this.s.isEmpty()) {
            this.l = this.G.s() + this.l;
            return;
        }
        dus0 dus0Var = this.G;
        int g = dus0Var.g();
        int[] iArr = dus0Var.b;
        int i = dus0Var.g;
        Object p = i < dus0Var.h ? dus0Var.p(i, iArr) : null;
        Object f = dus0Var.f();
        int i2 = this.m;
        o430 o430Var = did.a;
        if (p != null) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ (p instanceof Enum ? ((Enum) p).ordinal() : p.hashCode()), 3);
        } else {
            if (f != null && g == 207 && !f.equals(o430Var)) {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ f.hashCode(), 3) ^ i2;
                d0(null, (iArr[(dus0Var.g * 5) + 1] & 1073741824) != 0);
                M();
                dus0Var.e();
                if (p == null) {
                    if (p instanceof Enum) {
                        this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((Enum) p).ordinal(), 3);
                        return;
                    } else {
                        this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ p.hashCode(), 3);
                        return;
                    }
                }
                if (f == null || g != 207 || f.equals(o430Var)) {
                    this.T = Long.rotateRight(g ^ Long.rotateRight(this.T ^ i2, 3), 3);
                    return;
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T ^ i2, 3) ^ f.hashCode(), 3);
                    return;
                }
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ g, 3) ^ i2;
        }
        this.T = rotateLeft;
        d0(null, (iArr[(dus0Var.g * 5) + 1] & 1073741824) != 0);
        M();
        dus0Var.e();
        if (p == null) {
        }
    }

    public final void X() {
        dus0 dus0Var = this.G;
        int i = dus0Var.i;
        this.l = i >= 0 ? dus0Var.b[(i * 5) + 1] & 67108863 : 0;
        dus0Var.t();
    }

    public final void Y() {
        if (this.l != 0) {
            lid.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        aii0 B = B();
        if (B != null) {
            int i = B.b;
            if ((i & 128) == 0) {
                B.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            X();
        } else {
            M();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(int i, Object obj, Object obj2, int i2) {
        long rotateLeft;
        boolean z;
        fts ftsVar;
        fts ftsVar2;
        int i3;
        int i4;
        Object[] objArr;
        Object[] objArr2;
        int i5;
        int i6;
        boolean z2;
        int i7;
        Object obj3 = obj;
        if (this.r) {
            lid.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i8 = this.m;
        Object obj4 = did.a;
        if (obj3 != null) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ (obj3 instanceof Enum ? ((Enum) obj3).ordinal() : obj3.hashCode()), 3);
        } else {
            if (obj2 != null && i == 207 && !obj2.equals(obj4)) {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ obj2.hashCode(), 3) ^ i8;
                if (obj3 == null) {
                    this.m++;
                }
                boolean z3 = i2 == 0;
                if (!this.S) {
                    this.G.k++;
                    ows0 ows0Var = this.I;
                    int i9 = ows0Var.t;
                    if (z3) {
                        ows0Var.S(obj4, obj4, true, i);
                    } else if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        ows0Var.S(obj3, obj2, false, i);
                    } else {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        ows0Var.S(obj3, obj4, false, i);
                    }
                    fts ftsVar3 = this.j;
                    if (ftsVar3 != null) {
                        int i10 = (-2) - i9;
                        jix jixVar = new jix(i, -1, i10, -1);
                        ftsVar3.e.i(i10, new r2u(-1, this.k - ftsVar3.b, 0));
                        ftsVar3.d.add(jixVar);
                    }
                    y(z3, null);
                    return;
                }
                boolean z4 = i2 == 1 && this.y;
                if (this.j == null) {
                    int g = this.G.g();
                    if (!z4 && g == i) {
                        dus0 dus0Var = this.G;
                        int i11 = dus0Var.g;
                        if (jl40.l(obj3, i11 < dus0Var.h ? dus0Var.p(i11, dus0Var.b) : null)) {
                            d0(obj2, z3);
                        }
                    }
                    dus0 dus0Var2 = this.G;
                    int[] iArr = dus0Var2.b;
                    ArrayList arrayList = new ArrayList();
                    if (dus0Var2.k <= 0) {
                        int i12 = dus0Var2.g;
                        while (i12 < dus0Var2.h) {
                            int i13 = i12 * 5;
                            int i14 = iArr[i13];
                            Object p = dus0Var2.p(i12, iArr);
                            int i15 = iArr[i13 + 1];
                            if ((i15 & 1073741824) != 0) {
                                z2 = z4;
                                i7 = 1;
                            } else {
                                z2 = z4;
                                i7 = i15 & 67108863;
                            }
                            arrayList.add(new jix(i14, p, i12, i7));
                            i12 += iArr[i13 + 3];
                            z4 = z2;
                        }
                    }
                    z = z4;
                    this.j = new fts(arrayList, this.k);
                    ftsVar = this.j;
                    if (ftsVar != null) {
                        ArrayList arrayList2 = ftsVar.d;
                        wx40 wx40Var = ftsVar.e;
                        int i16 = ftsVar.b;
                        Object s9xVar = obj3 != null ? new s9x(Integer.valueOf(i), obj3) : Integer.valueOf(i);
                        hz40 hz40Var = ((do40) ftsVar.f.getValue()).a;
                        Object d = hz40Var.d(s9xVar);
                        if (d == null) {
                            d = null;
                        } else if (d instanceof xy40) {
                            xy40 xy40Var = (xy40) d;
                            Object m = xy40Var.m(0);
                            if (xy40Var.d()) {
                                hz40Var.m(s9xVar);
                            }
                            if (xy40Var.b == 1) {
                                hz40Var.o(s9xVar, xy40Var.a());
                            }
                            d = m;
                        } else {
                            hz40Var.m(s9xVar);
                        }
                        jix jixVar2 = (jix) d;
                        if (z || jixVar2 == null) {
                            this.G.k++;
                            this.S = true;
                            this.K = null;
                            if (this.I.w) {
                                ows0 k = this.H.k();
                                this.I = k;
                                k.O();
                                this.J = false;
                                this.K = null;
                            }
                            this.I.d();
                            ows0 ows0Var2 = this.I;
                            int i17 = ows0Var2.t;
                            if (z3) {
                                ows0Var2.S(obj4, obj4, true, i);
                                i3 = 0;
                            } else if (obj2 != null) {
                                if (obj != null) {
                                    obj4 = obj;
                                }
                                i3 = 0;
                                ows0Var2.S(obj4, obj2, false, i);
                            } else {
                                i3 = 0;
                                ows0Var2.S(obj == null ? obj4 : obj, obj4, false, i);
                            }
                            this.N = this.I.b(i17);
                            int i18 = (-2) - i17;
                            jix jixVar3 = new jix(i, -1, i18, -1);
                            wx40Var.i(i18, new r2u(-1, this.k - i16, i3));
                            arrayList2.add(jixVar3);
                            ftsVar2 = new fts(new ArrayList(), z3 ? i3 : this.k);
                            y(z3, ftsVar2);
                            return;
                        }
                        int i19 = jixVar2.c;
                        arrayList2.add(jixVar2);
                        r2u r2uVar = (r2u) wx40Var.b(i19);
                        this.k = (r2uVar != null ? r2uVar.b : -1) + i16;
                        r2u r2uVar2 = (r2u) wx40Var.b(i19);
                        int i20 = r2uVar2 != null ? r2uVar2.a : -1;
                        int i21 = ftsVar.c;
                        int i22 = i20 - i21;
                        int i23 = 8;
                        if (i20 > i21) {
                            Object[] objArr3 = wx40Var.c;
                            long[] jArr = wx40Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i24 = 0;
                                while (true) {
                                    long j = jArr[i24];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i25 = 8 - ((~(i24 - length)) >>> 31);
                                        int i26 = 0;
                                        while (i26 < i25) {
                                            if ((j & 255) < 128) {
                                                i6 = i23;
                                                r2u r2uVar3 = (r2u) objArr3[(i24 << 3) + i26];
                                                i5 = i22;
                                                int i27 = r2uVar3.a;
                                                if (i27 == i20) {
                                                    r2uVar3.a = i21;
                                                } else if (i21 <= i27 && i27 < i20) {
                                                    r2uVar3.a = i27 + 1;
                                                }
                                            } else {
                                                i5 = i22;
                                                i6 = i23;
                                            }
                                            j >>= i6;
                                            i26++;
                                            i23 = i6;
                                            i22 = i5;
                                        }
                                        i4 = i22;
                                        if (i25 != i23) {
                                            break;
                                        }
                                    } else {
                                        i4 = i22;
                                    }
                                    if (i24 == length) {
                                        break;
                                    }
                                    i24++;
                                    i22 = i4;
                                    i23 = 8;
                                }
                            } else {
                                i4 = i22;
                            }
                        } else {
                            i4 = i22;
                            if (i21 > i20) {
                                Object[] objArr4 = wx40Var.c;
                                long[] jArr2 = wx40Var.a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i28 = 0;
                                    while (true) {
                                        long j2 = jArr2[i28];
                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i29 = 8 - ((~(i28 - length2)) >>> 31);
                                            int i30 = 0;
                                            while (i30 < i29) {
                                                if ((j2 & 255) < 128) {
                                                    r2u r2uVar4 = (r2u) objArr4[(i28 << 3) + i30];
                                                    int i31 = r2uVar4.a;
                                                    if (i31 == i20) {
                                                        r2uVar4.a = i21;
                                                    } else {
                                                        objArr2 = objArr4;
                                                        if (i20 + 1 <= i31 && i31 < i21) {
                                                            r2uVar4.a = i31 - 1;
                                                        }
                                                        j2 >>= 8;
                                                        i30++;
                                                        objArr4 = objArr2;
                                                    }
                                                }
                                                objArr2 = objArr4;
                                                j2 >>= 8;
                                                i30++;
                                                objArr4 = objArr2;
                                            }
                                            objArr = objArr4;
                                            if (i29 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr4;
                                        }
                                        if (i28 == length2) {
                                            break;
                                        }
                                        i28++;
                                        objArr4 = objArr;
                                    }
                                }
                            }
                        }
                        gid gidVar = this.M;
                        gidVar.f = (i19 - gidVar.a.G.g) + gidVar.f;
                        this.G.r(i19);
                        if (i4 > 0) {
                            gidVar.d(false);
                            gidVar.e();
                            wc70 wc70Var = gidVar.b.a;
                            wc70Var.d(mb70.c);
                            wc70Var.c[wc70Var.d - wc70Var.a[wc70Var.b - 1].a] = i4;
                        }
                        d0(obj2, z3);
                    }
                    ftsVar2 = null;
                    y(z3, ftsVar2);
                    return;
                }
                z = z4;
                ftsVar = this.j;
                if (ftsVar != null) {
                }
                ftsVar2 = null;
                y(z3, ftsVar2);
                return;
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i, 3) ^ i8;
        }
        this.T = rotateLeft;
        if (obj3 == null) {
        }
        if (i2 == 0) {
        }
        if (!this.S) {
        }
    }

    @Override // defpackage.fid
    public final boolean a(boolean z) {
        Object I = I();
        if ((I instanceof Boolean) && z == ((Boolean) I).booleanValue()) {
            return false;
        }
        p0(Boolean.valueOf(z));
        return true;
    }

    public final void a0() {
        Z(-127, null, null, 0);
    }

    @Override // defpackage.fid
    public final boolean b(float f) {
        Object I = I();
        if ((I instanceof Float) && f == ((Number) I).floatValue()) {
            return false;
        }
        p0(Float.valueOf(f));
        return true;
    }

    public final void b0(int i, s370 s370Var) {
        Z(i, s370Var, null, 0);
    }

    @Override // defpackage.fid
    public final boolean c(int i) {
        Object I = I();
        if ((I instanceof Integer) && i == ((Number) I).intValue()) {
            return false;
        }
        p0(Integer.valueOf(i));
        return true;
    }

    public final void c0(int i, Object obj) {
        Z(i, obj, null, 0);
    }

    @Override // defpackage.fid
    public final boolean d(long j) {
        Object I = I();
        if ((I instanceof Long) && j == ((Number) I).longValue()) {
            return false;
        }
        p0(Long.valueOf(j));
        return true;
    }

    public final void d0(Object obj, boolean z) {
        if (z) {
            dus0 dus0Var = this.G;
            if (dus0Var.k <= 0) {
                if ((dus0Var.b[(dus0Var.g * 5) + 1] & 1073741824) == 0) {
                    khe0.a("Expected a node group");
                }
                dus0Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            gid gidVar = this.M;
            gidVar.getClass();
            gidVar.d(false);
            wc70 wc70Var = gidVar.b.a;
            wc70Var.d(ac70.c);
            rzo.U(wc70Var, 0, obj);
        }
        this.G.u();
    }

    @Override // defpackage.fid
    public final boolean e(Object obj) {
        if (I() == obj) {
            return false;
        }
        p0(obj);
        return true;
    }

    public final void e0(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            Z(i, null, null, 0);
            return;
        }
        if (this.r) {
            lid.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i, 3) ^ this.m;
        this.m++;
        dus0 dus0Var = this.G;
        boolean z = this.S;
        o430 o430Var = did.a;
        if (z) {
            dus0Var.k++;
            this.I.S(o430Var, o430Var, false, i);
            y(false, null);
            return;
        }
        if (dus0Var.g() == i && ((i3 = dus0Var.g) >= dus0Var.h || (dus0Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            dus0Var.u();
            y(false, null);
            return;
        }
        if (dus0Var.k <= 0 && (i2 = dus0Var.g) != dus0Var.h) {
            int i4 = this.k;
            N();
            this.M.f(i4, dus0Var.s());
            wwg.c(i2, dus0Var.g, this.s);
        }
        dus0Var.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            ows0 k = this.H.k();
            this.I = k;
            k.O();
            this.J = false;
            this.K = null;
        }
        ows0 ows0Var = this.I;
        ows0Var.d();
        int i5 = ows0Var.t;
        ows0Var.S(o430Var, o430Var, false, i);
        this.N = ows0Var.b(i5);
        y(false, null);
    }

    @Override // defpackage.brw
    public final void f() {
        if (this.F || this.z != 0) {
            khe0.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.z = -1;
        this.y = false;
    }

    public final void f0(int i) {
        Z(i, null, null, 0);
    }

    @Override // defpackage.brw
    public final void g() {
        this.z = 0;
        this.y = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bts g0(int i) {
        aii0 aii0Var;
        boolean z;
        int i2;
        e0(i);
        boolean z2 = this.S;
        gp50 gp50Var = this.g;
        ArrayList arrayList = this.E;
        bud budVar = this.h;
        if (z2) {
            aii0 aii0Var2 = new aii0(budVar);
            arrayList.add(aii0Var2);
            p0(aii0Var2);
            aii0Var2.e = this.B;
            aii0Var2.b &= -17;
            gp50Var.B();
            return this;
        }
        int i3 = this.G.i;
        ArrayList arrayList2 = this.s;
        int o = wwg.o(i3, arrayList2);
        zvw zvwVar = o >= 0 ? (zvw) arrayList2.remove(o) : null;
        Object m = this.G.m();
        if (jl40.l(m, did.a)) {
            aii0Var = new aii0(budVar);
            p0(aii0Var);
        } else {
            aii0Var = (aii0) m;
        }
        if (zvwVar == null) {
            int i4 = aii0Var.b;
            boolean z3 = (i4 & 64) != 0;
            if (z3) {
                aii0Var.b = i4 & (-65);
            }
            if (!z3) {
                z = false;
                int i5 = aii0Var.b;
                aii0Var.b = !z ? i5 | 8 : i5 & (-9);
                arrayList.add(aii0Var);
                aii0Var.e = this.B;
                aii0Var.b &= -17;
                gp50Var.B();
                i2 = aii0Var.b;
                if ((i2 & 256) != 0) {
                    aii0Var.b = (i2 & (-257)) | 512;
                    wc70 wc70Var = this.M.b.a;
                    wc70Var.d(wb70.c);
                    rzo.U(wc70Var, 0, aii0Var);
                    if (!this.y) {
                        int i6 = aii0Var.b;
                        if ((i6 & 128) != 0) {
                            this.y = true;
                            this.z = this.G.i;
                            aii0Var.b = i6 | 1024;
                        }
                    }
                }
                return this;
            }
        }
        z = true;
        int i52 = aii0Var.b;
        aii0Var.b = !z ? i52 | 8 : i52 & (-9);
        arrayList.add(aii0Var);
        aii0Var.e = this.B;
        aii0Var.b &= -17;
        gp50Var.B();
        i2 = aii0Var.b;
        if ((i2 & 256) != 0) {
        }
        return this;
    }

    public final void h() {
        l();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        ver verVar = this.O;
        verVar.b.a();
        verVar.a.a();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        dus0 dus0Var = this.G;
        if (!dus0Var.f) {
            dus0Var.c();
        }
        if (this.I.w) {
            return;
        }
        z();
    }

    public final void h0(Object obj) {
        if (!this.S && this.G.g() == 207 && !jl40.l(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        Z(207, null, obj, 0);
    }

    public final void i(Object obj, wls wlsVar) {
        if (this.S) {
            wc70 wc70Var = this.O.a;
            wc70Var.d(bc70.c);
            rzo.U(wc70Var, 0, obj);
            ym11.e(2, wlsVar);
            rzo.U(wc70Var, 1, wlsVar);
            return;
        }
        gid gidVar = this.M;
        gidVar.b();
        wc70 wc70Var2 = gidVar.b.a;
        wc70Var2.d(bc70.c);
        ym11.e(2, wlsVar);
        rzo.V(wc70Var2, 0, obj, 1, wlsVar);
    }

    public final void i0() {
        Z(HProv.PP_DELETE_KEYSET, null, null, 2);
        this.r = true;
    }

    public final boolean j(double d) {
        Object I = I();
        if ((I instanceof Double) && d == ((Number) I).doubleValue()) {
            return false;
        }
        p0(Double.valueOf(d));
        return true;
    }

    public final void j0() {
        this.m = 0;
        this.G = this.c.j();
        Z(100, null, null, 0);
        ttd ttdVar = this.b;
        ttdVar.w();
        r1b0 j = ttdVar.j();
        this.x.c(this.w ? 1 : 0);
        this.w = k(j);
        this.K = null;
        if (!this.q) {
            this.q = ttdVar.f();
        }
        if (!this.C) {
            this.C = ttdVar.g();
        }
        if (this.C) {
            j = j.d(ztd.a(), new i7u0(D()));
        }
        this.u = j;
        Set set = (Set) uh6.L(j, u2w.a);
        if (set != null) {
            set.add(A());
            ttdVar.r(set);
        }
        Z(Long.hashCode(ttdVar.h()), null, null, 0);
    }

    public final boolean k(Object obj) {
        if (jl40.l(I(), obj)) {
            return false;
        }
        p0(obj);
        return true;
    }

    public final boolean k0(aii0 aii0Var, Object obj) {
        yss yssVar = aii0Var.c;
        if (yssVar == null) {
            return false;
        }
        int g = this.G.a.g(uh6.e(yssVar));
        if (!this.F || g < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int o = wwg.o(g, arrayList);
        if (o < 0) {
            int i = -(o + 1);
            if (!(obj instanceof qxi)) {
                obj = null;
            }
            arrayList.add(i, new zvw(aii0Var, g, obj));
            return true;
        }
        zvw zvwVar = (zvw) arrayList.get(o);
        if (!(obj instanceof qxi)) {
            zvwVar.c = null;
            return true;
        }
        Object obj2 = zvwVar.c;
        if (obj2 == null) {
            zvwVar.c = obj;
            return true;
        }
        if (obj2 instanceof iz40) {
            ((iz40) obj2).a(obj);
            return true;
        }
        iz40 iz40Var = dmm0.a;
        iz40 iz40Var2 = new iz40(2);
        iz40Var2.k(obj2);
        iz40Var2.k(obj);
        zvwVar.c = iz40Var2;
        return true;
    }

    public final void l() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        gid gidVar = this.M;
        gidVar.c = false;
        gidVar.d.b = 0;
        gidVar.f = 0;
        gidVar.e = true;
        gidVar.g = 0;
        gidVar.h.clear();
        gidVar.i = -1;
        gidVar.j = -1;
        gidVar.k = -1;
        gidVar.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final void l0(hz40 hz40Var) {
        ArrayList arrayList = this.s;
        for (int f = scc.f(arrayList); -1 < f; f--) {
            zvw zvwVar = (zvw) arrayList.get(f);
            yss yssVar = zvwVar.a.c;
            yss e = yssVar != null ? uh6.e(yssVar) : null;
            if (e == null || !e.a()) {
                arrayList.remove(f);
            } else {
                int i = zvwVar.b;
                int i2 = e.a;
                if (i != i2) {
                    zvwVar.b = i2;
                }
            }
        }
        Object[] objArr = hz40Var.b;
        Object[] objArr2 = hz40Var.c;
        long[] jArr = hz40Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            aii0 aii0Var = (aii0) obj;
                            yss yssVar2 = aii0Var.c;
                            if (yssVar2 != null) {
                                int i7 = uh6.e(yssVar2).a;
                                if (obj2 == kl40.F) {
                                    obj2 = null;
                                }
                                arrayList.add(new zvw(aii0Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        xcc.q(arrayList, wwg.b);
    }

    public final Object m(h hVar) {
        return uh6.L(o(), hVar);
    }

    public final void m0(int i, int i2) {
        if (q0(i) != i2) {
            if (i < 0) {
                ux40 ux40Var = this.p;
                if (ux40Var == null) {
                    ux40Var = new ux40((Object) null);
                    this.p = ux40Var;
                }
                ux40Var.g(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                int i3 = this.G.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final void n(sls slsVar) {
        if (!this.r) {
            lid.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            lid.a("createNode() can only be called when inserting");
        }
        m6w m6wVar = this.n;
        int i = m6wVar.a[m6wVar.b - 1];
        ows0 ows0Var = this.I;
        yss b = ows0Var.b(ows0Var.v);
        this.l++;
        ver verVar = this.O;
        wc70 wc70Var = verVar.a;
        wc70Var.d(jb70.d);
        rzo.U(wc70Var, 0, slsVar);
        wc70Var.c[wc70Var.d - wc70Var.a[wc70Var.b - 1].a] = i;
        rzo.U(wc70Var, 1, b);
        wc70 wc70Var2 = verVar.b;
        wc70Var2.d(jb70.e);
        wc70Var2.c[wc70Var2.d - wc70Var2.a[wc70Var2.b - 1].a] = i;
        rzo.U(wc70Var2, 0, b);
    }

    public final void n0(int i, int i2) {
        int q0 = q0(i);
        if (q0 != i2) {
            int i3 = i2 - q0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int q02 = q0(i) + i3;
                m0(i, q02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        fts ftsVar = (fts) arrayList.get(i4);
                        if (ftsVar != null && ftsVar.a(i, q02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                dus0 dus0Var = this.G;
                if (i < 0) {
                    i = dus0Var.i;
                } else if (dus0Var.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final r1b0 o() {
        r1b0 r1b0Var = this.K;
        return r1b0Var != null ? r1b0Var : p(this.G.i);
    }

    public final void o0(Object obj) {
        if (obj instanceof dui0) {
            gts gtsVar = new gts((dui0) obj, this.m - 1);
            if (this.S) {
                wc70 wc70Var = this.M.b.a;
                wc70Var.d(pb70.c);
                rzo.U(wc70Var, 0, gtsVar);
            }
            this.d.add(obj);
            obj = gtsVar;
        }
        p0(obj);
    }

    public final r1b0 p(int i) {
        r1b0 r1b0Var;
        boolean z = this.S;
        s370 s370Var = lid.c;
        if (z && this.J) {
            int i2 = this.I.v;
            while (i2 > 0) {
                if (this.I.s(i2) == 202 && jl40.l(this.I.t(i2), s370Var)) {
                    r1b0 r1b0Var2 = (r1b0) this.I.q(i2);
                    this.K = r1b0Var2;
                    return r1b0Var2;
                }
                ows0 ows0Var = this.I;
                i2 = ows0Var.G(i2, ows0Var.b);
            }
        }
        if (this.G.c > 0) {
            while (i > 0) {
                if (this.G.i(i) == 202) {
                    dus0 dus0Var = this.G;
                    if (jl40.l(dus0Var.p(i, dus0Var.b), s370Var)) {
                        wx40 wx40Var = this.v;
                        if (wx40Var == null || (r1b0Var = (r1b0) wx40Var.b(i)) == null) {
                            dus0 dus0Var2 = this.G;
                            r1b0Var = (r1b0) dus0Var2.b(i, dus0Var2.b);
                        }
                        this.K = r1b0Var;
                        return r1b0Var;
                    }
                }
                i = this.G.q(i);
            }
        }
        r1b0 r1b0Var3 = this.u;
        this.K = r1b0Var3;
        return r1b0Var3;
    }

    public final void p0(Object obj) {
        if (this.S) {
            this.I.U(obj);
            return;
        }
        dus0 dus0Var = this.G;
        boolean z = dus0Var.n;
        gid gidVar = this.M;
        if (!z) {
            yss a = dus0Var.a(dus0Var.i);
            wc70 wc70Var = gidVar.b.a;
            wc70Var.d(va70.c);
            rzo.V(wc70Var, 0, a, 1, obj);
            return;
        }
        int d = (dus0Var.l - uus0.d(dus0Var.i, dus0Var.b)) - 1;
        if (gidVar.a.G.i - gidVar.f >= 0) {
            gidVar.d(true);
            wc70 wc70Var2 = gidVar.b.a;
            wc70Var2.d(jb70.g);
            rzo.U(wc70Var2, 0, obj);
            wc70Var2.c[wc70Var2.d - wc70Var2.a[wc70Var2.b - 1].a] = d;
            return;
        }
        dus0 dus0Var2 = this.G;
        yss a2 = dus0Var2.a(dus0Var2.i);
        wc70 wc70Var3 = gidVar.b.a;
        wc70Var3.d(jb70.f);
        rzo.V(wc70Var3, 0, obj, 1, a2);
        wc70Var3.c[wc70Var3.d - wc70Var3.a[wc70Var3.b - 1].a] = d;
    }

    public final zgd q() {
        if (!this.b.l()) {
            return null;
        }
        ListBuilder a = rcc.a();
        a.addAll(ipb1.d(this.I));
        a.addAll(ipb1.b(this.G));
        a.addAll(J());
        return new zgd(a.j(), this.C);
    }

    public final int q0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        ux40 ux40Var = this.p;
        if (ux40Var == null || ux40Var.c(i) < 0) {
            return 0;
        }
        return ux40Var.d(i);
    }

    public final void r(hz40 hz40Var, wls wlsVar) {
        ArrayList arrayList = this.s;
        if (this.F) {
            lid.a("Reentrant composition is not supported");
        }
        this.g.B();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(q2t0.j().g());
            this.v = null;
            l0(hz40Var);
            this.k = 0;
            this.F = true;
            try {
                j0();
                Object I = I();
                if (I != wlsVar && wlsVar != null) {
                    p0(wlsVar);
                }
                ats atsVar = this.D;
                wz40 c = f.c();
                try {
                    c.b(atsVar);
                    s370 s370Var = lid.a;
                    if (wlsVar != null) {
                        b0(200, s370Var);
                        ym11.e(2, wlsVar);
                        wlsVar.invoke(this, 1);
                        t(false);
                    } else if (!this.w || I == null || I.equals(did.a)) {
                        W();
                    } else {
                        b0(200, s370Var);
                        ym11.e(2, I);
                        wls wlsVar2 = (wls) I;
                        ym11.e(2, wlsVar2);
                        wlsVar2.invoke(this, 1);
                        t(false);
                    }
                    c.k(c.c - 1);
                    w();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        lid.a("Check failed");
                    }
                    z();
                } catch (Throwable th) {
                    c.k(c.c - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void r0() {
        if (!this.r) {
            lid.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            lid.a("useNode() called while inserting");
        }
        dus0 dus0Var = this.G;
        Object n = dus0Var.n(dus0Var.i);
        gid gidVar = this.M;
        gidVar.c();
        gidVar.h.add(n);
        if (this.y && (n instanceof qgd)) {
            gidVar.b();
            gidVar.b.a.d(dc70.c);
        }
    }

    public final void s(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        s(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object n = this.G.n(i);
            gid gidVar = this.M;
            gidVar.c();
            gidVar.h.add(n);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04c7  */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(boolean z) {
        long rotateRight;
        m6w m6wVar;
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        int i3;
        dus0 dus0Var;
        fts ftsVar;
        ?? r5;
        int i4;
        m6w m6wVar2;
        int i5;
        int i6;
        ArrayList arrayList2;
        iz40 iz40Var;
        int i7;
        ArrayList arrayList3;
        ArrayList arrayList4;
        HashSet hashSet;
        int i8;
        int i9;
        fts ftsVar2;
        int i10;
        Object[] objArr;
        long[] jArr;
        int i11;
        Object[] objArr2;
        long[] jArr2;
        int i12;
        Object[] objArr3;
        long[] jArr3;
        int i13;
        Object[] objArr4;
        long[] jArr4;
        long rotateRight2;
        m6w m6wVar3 = this.n;
        int i14 = m6wVar3.a[m6wVar3.b - 2] - 1;
        boolean z3 = this.S;
        o430 o430Var = did.a;
        if (z3) {
            ows0 ows0Var = this.I;
            int i15 = ows0Var.v;
            int s = ows0Var.s(i15);
            Object t = this.I.t(i15);
            Object q = this.I.q(i15);
            if (t != null) {
                rotateRight2 = Long.rotateRight(this.T, 3) ^ (t instanceof Enum ? ((Enum) t).ordinal() : t.hashCode());
            } else if (q == null || s != 207 || q.equals(o430Var)) {
                rotateRight2 = Long.rotateRight(this.T ^ i14, 3) ^ s;
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ i14, 3) ^ q.hashCode(), 3);
            }
            this.T = Long.rotateRight(rotateRight2, 3);
        } else {
            dus0 dus0Var2 = this.G;
            int i16 = dus0Var2.i;
            int i17 = dus0Var2.i(i16);
            dus0 dus0Var3 = this.G;
            Object p = dus0Var3.p(i16, dus0Var3.b);
            dus0 dus0Var4 = this.G;
            Object b = dus0Var4.b(i16, dus0Var4.b);
            if (p != null) {
                rotateRight = Long.rotateRight(this.T, 3) ^ (p instanceof Enum ? ((Enum) p).ordinal() : p.hashCode());
            } else if (b == null || i17 != 207 || b.equals(o430Var)) {
                rotateRight = Long.rotateRight(this.T ^ i14, 3) ^ i17;
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ i14, 3) ^ b.hashCode(), 3);
            }
            this.T = Long.rotateRight(rotateRight, 3);
        }
        int i18 = this.l;
        fts ftsVar3 = this.j;
        ArrayList arrayList5 = this.s;
        gid gidVar = this.M;
        if (ftsVar3 != null) {
            wx40 wx40Var = ftsVar3.e;
            int i19 = ftsVar3.b;
            ArrayList arrayList6 = ftsVar3.a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = ftsVar3.d;
                HashSet hashSet2 = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i20 = 0; i20 < size; i20++) {
                    hashSet2.add(arrayList7.get(i20));
                }
                i2 = -1;
                iz40 a = dmm0.a();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                i = 1;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                while (i21 < size3) {
                    jix jixVar = (jix) arrayList6.get(i21);
                    if (hashSet2.contains(jixVar)) {
                        m6wVar2 = m6wVar3;
                        i5 = i21;
                        if (!a.c(jixVar)) {
                            int i24 = i22;
                            if (i24 < size2) {
                                jix jixVar2 = (jix) arrayList7.get(i24);
                                if (jixVar2 != jixVar) {
                                    r2u r2uVar = (r2u) wx40Var.b(jixVar2.c);
                                    int i25 = r2uVar != null ? r2uVar.b : -1;
                                    a.a(jixVar2);
                                    i6 = i24;
                                    i9 = i23;
                                    ftsVar2 = ftsVar3;
                                    if (i25 != i9) {
                                        r2u r2uVar2 = (r2u) wx40Var.b(jixVar2.c);
                                        int i26 = r2uVar2 != null ? r2uVar2.c : jixVar2.d;
                                        iz40Var = a;
                                        int i27 = i25 + i19;
                                        i7 = i19;
                                        int i28 = i9 + i7;
                                        if (i26 > 0) {
                                            arrayList3 = arrayList6;
                                            int i29 = gidVar.l;
                                            if (i29 > 0) {
                                                arrayList4 = arrayList7;
                                                if (gidVar.j == i27 - i29 && gidVar.k == i28 - i29) {
                                                    gidVar.l = i29 + i26;
                                                }
                                            } else {
                                                arrayList4 = arrayList7;
                                            }
                                            gidVar.c();
                                            gidVar.j = i27;
                                            gidVar.k = i28;
                                            gidVar.l = i26;
                                        } else {
                                            arrayList3 = arrayList6;
                                            arrayList4 = arrayList7;
                                            gidVar.getClass();
                                        }
                                        if (i25 > i9) {
                                            Object[] objArr5 = wx40Var.c;
                                            long[] jArr5 = wx40Var.a;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                hashSet = hashSet2;
                                                i8 = size2;
                                                int i30 = 0;
                                                while (true) {
                                                    long j = jArr5[i30];
                                                    int i31 = i26;
                                                    arrayList2 = arrayList5;
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i32 = 8 - ((~(i30 - length)) >>> 31);
                                                        int i33 = 0;
                                                        while (i33 < i32) {
                                                            if ((j & 255) < 128) {
                                                                i13 = i33;
                                                                r2u r2uVar3 = (r2u) objArr5[(i30 << 3) + i33];
                                                                objArr4 = objArr5;
                                                                int i34 = r2uVar3.b;
                                                                jArr4 = jArr5;
                                                                if (i25 <= i34 && i34 < i25 + i31) {
                                                                    r2uVar3.b = (i34 - i25) + i9;
                                                                } else if (i9 <= i34 && i34 < i25) {
                                                                    r2uVar3.b = i34 + i31;
                                                                }
                                                            } else {
                                                                i13 = i33;
                                                                objArr4 = objArr5;
                                                                jArr4 = jArr5;
                                                            }
                                                            j >>= 8;
                                                            i33 = i13 + 1;
                                                            objArr5 = objArr4;
                                                            jArr5 = jArr4;
                                                        }
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                        if (i32 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                    }
                                                    if (i30 == length) {
                                                        break;
                                                    }
                                                    i30++;
                                                    arrayList5 = arrayList2;
                                                    i26 = i31;
                                                    objArr5 = objArr3;
                                                    jArr5 = jArr3;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                        } else {
                                            int i35 = i26;
                                            arrayList2 = arrayList5;
                                            hashSet = hashSet2;
                                            i8 = size2;
                                            if (i9 > i25) {
                                                Object[] objArr6 = wx40Var.c;
                                                long[] jArr6 = wx40Var.a;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    int i36 = 0;
                                                    while (true) {
                                                        long j2 = jArr6[i36];
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i37 = 8 - ((~(i36 - length2)) >>> 31);
                                                            int i38 = 0;
                                                            while (i38 < i37) {
                                                                if ((j2 & 255) < 128) {
                                                                    objArr2 = objArr6;
                                                                    r2u r2uVar4 = (r2u) objArr6[(i36 << 3) + i38];
                                                                    jArr2 = jArr6;
                                                                    int i39 = r2uVar4.b;
                                                                    i12 = i25;
                                                                    if (i25 <= i39 && i39 < i12 + i35) {
                                                                        r2uVar4.b = (i39 - i12) + i9;
                                                                    } else if (i12 + 1 <= i39 && i39 < i9) {
                                                                        r2uVar4.b = i39 - i35;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr6;
                                                                    jArr2 = jArr6;
                                                                    i12 = i25;
                                                                }
                                                                j2 >>= 8;
                                                                i38++;
                                                                jArr6 = jArr2;
                                                                objArr6 = objArr2;
                                                                i25 = i12;
                                                            }
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i11 = i25;
                                                            if (i37 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i11 = i25;
                                                        }
                                                        if (i36 == length2) {
                                                            break;
                                                        }
                                                        i36++;
                                                        jArr6 = jArr;
                                                        objArr6 = objArr;
                                                        i25 = i11;
                                                    }
                                                }
                                            }
                                        }
                                        i10 = i5;
                                    } else {
                                        arrayList2 = arrayList5;
                                        iz40Var = a;
                                        i7 = i19;
                                        arrayList3 = arrayList6;
                                        arrayList4 = arrayList7;
                                    }
                                    hashSet = hashSet2;
                                    i8 = size2;
                                    i10 = i5;
                                } else {
                                    i6 = i24;
                                    arrayList2 = arrayList5;
                                    iz40Var = a;
                                    i7 = i19;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i8 = size2;
                                    i9 = i23;
                                    ftsVar2 = ftsVar3;
                                    i10 = i5 + 1;
                                }
                                i22 = i6 + 1;
                                r2u r2uVar5 = (r2u) wx40Var.b(jixVar2.c);
                                int i40 = i9 + (r2uVar5 != null ? r2uVar5.c : jixVar2.d);
                                i21 = i10;
                                ftsVar3 = ftsVar2;
                                a = iz40Var;
                                i19 = i7;
                                arrayList6 = arrayList3;
                                arrayList7 = arrayList4;
                                hashSet2 = hashSet;
                                size2 = i8;
                                arrayList5 = arrayList2;
                                i23 = i40;
                                m6wVar3 = m6wVar2;
                            } else {
                                i22 = i24;
                                m6wVar3 = m6wVar2;
                                i21 = i5;
                            }
                        }
                    } else {
                        m6wVar2 = m6wVar3;
                        r2u r2uVar6 = (r2u) wx40Var.b(jixVar.c);
                        int i41 = r2uVar6 != null ? r2uVar6.b : -1;
                        int i42 = jixVar.c;
                        i5 = i21;
                        gidVar.f(i41 + i19, jixVar.d);
                        ftsVar3.a(i42, 0);
                        gidVar.f = (i42 - gidVar.a.G.g) + gidVar.f;
                        this.G.r(i42);
                        N();
                        this.G.s();
                        wwg.c(i42, uus0.a(i42, this.G.b) + i42, arrayList5);
                    }
                    i21 = i5 + 1;
                    m6wVar3 = m6wVar2;
                }
                m6wVar = m6wVar3;
                arrayList = arrayList5;
                gidVar.c();
                if (arrayList6.size() > 0) {
                    dus0 dus0Var5 = this.G;
                    gidVar.f = (dus0Var5.h - gidVar.a.G.g) + gidVar.f;
                    dus0Var5.t();
                }
                z2 = this.S;
                if (!z2) {
                    dus0 dus0Var6 = this.G;
                    int i43 = dus0Var6.m - dus0Var6.l;
                    if (i43 > 0) {
                        if (i43 > 0) {
                            gidVar.d(false);
                            gidVar.e();
                            wc70 wc70Var = gidVar.b.a;
                            wc70Var.d(zb70.c);
                            wc70Var.c[wc70Var.d - wc70Var.a[wc70Var.b - 1].a] = i43;
                        } else {
                            gidVar.getClass();
                        }
                    }
                }
                i3 = this.k;
                while (true) {
                    dus0Var = this.G;
                    if (dus0Var.k > 0 && (i4 = dus0Var.g) != dus0Var.h) {
                        N();
                        gidVar.f(i3, this.G.s());
                        wwg.c(i4, this.G.g, arrayList);
                    }
                }
                if (z2) {
                    if (z) {
                        gidVar.a();
                    }
                    int i44 = gidVar.a.G.i;
                    m6w m6wVar4 = gidVar.d;
                    int i45 = i2;
                    if (m6wVar4.a(i45) > i44) {
                        lid.a("Missed recording an endGroup");
                    }
                    if (m6wVar4.a(i45) == i44) {
                        gidVar.d(false);
                        m6wVar4.b();
                        gidVar.b.a.d(eb70.c);
                    }
                    int i46 = this.G.i;
                    if (i18 != q0(i46)) {
                        n0(i46, i18);
                    }
                    if (z) {
                        i18 = 1;
                    }
                    this.G.e();
                    gidVar.c();
                } else {
                    if (z) {
                        ver verVar = this.O;
                        wc70 wc70Var2 = verVar.b;
                        if (wc70Var2.b == 0) {
                            lid.a("Cannot end node insertion, there are no pending operations that can be realized.");
                        }
                        wc70 wc70Var3 = verVar.a;
                        gc70[] gc70VarArr = wc70Var2.a;
                        int i47 = wc70Var2.b - 1;
                        wc70Var2.b = i47;
                        gc70 gc70Var = gc70VarArr[i47];
                        gc70VarArr[i47] = null;
                        wc70Var3.d(gc70Var);
                        Object[] objArr7 = wc70Var2.e;
                        Object[] objArr8 = wc70Var3.e;
                        int i48 = wc70Var3.f;
                        int i49 = gc70Var.b;
                        int i50 = wc70Var2.f;
                        int i51 = i50 - i49;
                        System.arraycopy(objArr7, i51, objArr8, i48 - i49, i50 - i51);
                        Object[] objArr9 = wc70Var2.e;
                        int i52 = wc70Var2.f;
                        Arrays.fill(objArr9, i52 - i49, i52, (Object) null);
                        int[] iArr = wc70Var2.c;
                        int[] iArr2 = wc70Var3.c;
                        int i53 = wc70Var3.d;
                        int i54 = gc70Var.a;
                        int i55 = wc70Var2.d;
                        f73.d(i53 - i54, i55 - i54, i55, iArr, iArr2);
                        wc70Var2.f -= i49;
                        wc70Var2.d -= i54;
                        i18 = i;
                    }
                    if (this.G.k <= 0) {
                        khe0.a("Unbalanced begin/end empty");
                    }
                    r3.k--;
                    ows0 ows0Var2 = this.I;
                    int i56 = ows0Var2.v;
                    ows0Var2.j();
                    if (this.G.k <= 0) {
                        int i57 = (-2) - i56;
                        this.I.k();
                        this.I.e(i);
                        yss yssVar = this.N;
                        boolean c = this.O.a.c();
                        sus0 sus0Var = this.H;
                        if (c) {
                            gidVar.b();
                            r5 = 0;
                            gidVar.d(false);
                            gidVar.e();
                            gidVar.c();
                            wc70 wc70Var4 = gidVar.b.a;
                            wc70Var4.d(kb70.c);
                            rzo.V(wc70Var4, 0, yssVar, 1, sus0Var);
                        } else {
                            ver verVar2 = this.O;
                            gidVar.b();
                            gidVar.d(false);
                            gidVar.e();
                            gidVar.c();
                            wc70 wc70Var5 = gidVar.b.a;
                            wc70Var5.d(lb70.c);
                            rzo.W(wc70Var5, yssVar, sus0Var, verVar2);
                            this.O = new ver();
                            r5 = 0;
                        }
                        this.S = r5;
                        if (this.c.b != 0) {
                            m0(i57, r5);
                            n0(i57, i18);
                        }
                    }
                }
                ftsVar = (fts) this.i.remove(r3.size() - 1);
                if (ftsVar != null && !z2) {
                    ftsVar.c++;
                }
                this.j = ftsVar;
                this.k = m6wVar.b() + i18;
                this.m = m6wVar.b();
                this.l = m6wVar.b() + i18;
            }
        }
        m6wVar = m6wVar3;
        i = 1;
        arrayList = arrayList5;
        i2 = -1;
        z2 = this.S;
        if (!z2) {
        }
        i3 = this.k;
        while (true) {
            dus0Var = this.G;
            if (dus0Var.k > 0) {
                break;
            }
            N();
            gidVar.f(i3, this.G.s());
            wwg.c(i4, this.G.g, arrayList);
        }
        if (z2) {
        }
        ftsVar = (fts) this.i.remove(r3.size() - 1);
        if (ftsVar != null) {
            ftsVar.c++;
        }
        this.j = ftsVar;
        this.k = m6wVar.b() + i18;
        this.m = m6wVar.b();
        this.l = m6wVar.b() + i18;
    }

    public final void u() {
        t(false);
        aii0 B = B();
        if (B != null) {
            int i = B.b;
            if ((i & 1) != 0) {
                B.b = i | 2;
            }
        }
    }

    public final aii0 v() {
        aii0 aii0Var;
        yss a;
        n2w n2wVar;
        ArrayList arrayList = this.E;
        int i = 1;
        aii0 aii0Var2 = !arrayList.isEmpty() ? (aii0) arrayList.remove(arrayList.size() - 1) : null;
        if (aii0Var2 != null) {
            aii0Var2.b &= -9;
            this.g.B();
            int i2 = this.B;
            qy40 qy40Var = aii0Var2.f;
            if (qy40Var != null && (aii0Var2.b & 16) == 0) {
                Object[] objArr = qy40Var.b;
                int[] iArr = qy40Var.c;
                long[] jArr = qy40Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    loop0: while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((j & 255) < 128) {
                                    int i6 = (i3 << 3) + i5;
                                    Object obj = objArr[i6];
                                    if (iArr[i6] != i2) {
                                        n2wVar = new n2w(aii0Var2, i2, qy40Var, i);
                                        break loop0;
                                    }
                                }
                                j >>= 8;
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
            }
            n2wVar = null;
            gid gidVar = this.M;
            if (n2wVar != null) {
                wc70 wc70Var = gidVar.b.a;
                wc70Var.d(db70.c);
                rzo.V(wc70Var, 0, n2wVar, 1, this.h);
            }
            int i7 = aii0Var2.b;
            if ((i7 & 512) != 0) {
                aii0Var2.b = i7 & (-513);
                wc70 wc70Var2 = gidVar.b.a;
                wc70Var2.d(gb70.c);
                rzo.U(wc70Var2, 0, aii0Var2);
                int i8 = aii0Var2.b;
                aii0Var2.b = i8 & (-129);
                if ((i8 & 1024) != 0) {
                    aii0Var2.b = i8 & (-1153);
                    if (this.z == this.G.i) {
                        this.y = false;
                        this.z = -1;
                    }
                }
            }
        }
        if (aii0Var2 != null) {
            int i9 = aii0Var2.b;
            if ((i9 & 16) == 0 && ((i9 & 1) != 0 || this.q)) {
                if (aii0Var2.c == null) {
                    if (this.S) {
                        ows0 ows0Var = this.I;
                        a = ows0Var.b(ows0Var.v);
                    } else {
                        dus0 dus0Var = this.G;
                        a = dus0Var.a(dus0Var.i);
                    }
                    aii0Var2.c = a;
                }
                aii0Var2.b &= -5;
                aii0Var = aii0Var2;
                t(false);
                return aii0Var;
            }
        }
        aii0Var = null;
        t(false);
        return aii0Var;
    }

    public final void w() {
        t(false);
        this.b.d();
        t(false);
        gid gidVar = this.M;
        if (gidVar.c) {
            gidVar.d(false);
            gidVar.d(false);
            gidVar.b.a.d(eb70.c);
            gidVar.c = false;
        }
        gidVar.b();
        if (gidVar.d.b != 0) {
            lid.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            lid.a("Start/end imbalance");
        }
        l();
        this.G.c();
        this.w = this.x.b() != 0;
    }

    public final void x(int i) {
        if (i < 0) {
            int i2 = -i;
            ows0 ows0Var = this.I;
            while (true) {
                int i3 = ows0Var.v;
                if (i3 <= i2) {
                    return;
                } else {
                    t(ows0Var.y(i3));
                }
            }
        } else {
            if (this.S) {
                ows0 ows0Var2 = this.I;
                while (this.S) {
                    t(ows0Var2.y(ows0Var2.v));
                }
            }
            dus0 dus0Var = this.G;
            while (true) {
                int i4 = dus0Var.i;
                if (i4 <= i) {
                    return;
                } else {
                    t(dus0Var.l(i4));
                }
            }
        }
    }

    public final void y(boolean z, fts ftsVar) {
        this.i.add(this.j);
        this.j = ftsVar;
        int i = this.l;
        m6w m6wVar = this.n;
        m6wVar.c(i);
        m6wVar.c(this.m);
        m6wVar.c(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void z() {
        sus0 sus0Var = new sus0();
        if (this.C) {
            sus0Var.h();
        }
        if (this.b.e()) {
            sus0Var.D = new wx40((Object) null);
        }
        this.H = sus0Var;
        ows0 k = sus0Var.k();
        k.e(true);
        this.I = k;
    }
}
