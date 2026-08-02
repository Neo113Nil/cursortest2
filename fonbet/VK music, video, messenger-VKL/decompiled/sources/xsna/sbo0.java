package xsna;

import android.os.Trace;
import com.unity3d.services.UnityAdsConstants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.er9;
import xsna.o6j;
import xsna.obi0;
import xsna.q630;
import xsna.us2;
import xsna.v4s;

/* compiled from: TextAnnotatedStringNode.kt */
/* loaded from: classes11.dex */
public final class sbo0 extends q630.c implements noy, lio, fgi0 {
    public o7g A;
    public izs<? super a, s3q0> B;
    public Map<gt1, Integer> C;
    public o540 D;
    public qyi0 E;
    public a F;
    public us2 p;
    public nmo0 q;
    public v4s.a r;
    public izs<? super ljo0, s3q0> s;
    public int t;
    public boolean u;
    public int v;
    public int w;
    public List<us2.d<esa0>> x;
    public izs<? super List<zhf0>, s3q0> y;
    public jci0 z;

    /* compiled from: TextAnnotatedStringNode.kt */
    public static final class a {
        public final us2 a;
        public us2 b;
        public boolean c = false;
        public o540 d = null;

        public a(us2 us2Var, us2 us2Var2) {
            this.a = us2Var;
            this.b = us2Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int b = qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
            o540 o540Var = this.d;
            return b + (o540Var == null ? 0 : o540Var.hashCode());
        }

        public final String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) this.b) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ')';
        }
    }

    public sbo0() {
        throw null;
    }

    public sbo0(us2 us2Var, nmo0 nmo0Var, v4s.a aVar, izs izsVar, int i, boolean z, int i2, int i3, List list, izs izsVar2, jci0 jci0Var, o7g o7gVar, izs izsVar3) {
        this.p = us2Var;
        this.q = nmo0Var;
        this.r = aVar;
        this.s = izsVar;
        this.t = i;
        this.u = z;
        this.v = i2;
        this.w = i3;
        this.x = list;
        this.y = izsVar2;
        this.z = jci0Var;
        this.A = o7gVar;
        this.B = izsVar3;
    }

    @Override // xsna.q630.c
    public final boolean X1() {
        return false;
    }

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            o540 k2 = k2(ep10Var);
            boolean c = k2.c(j, ep10Var.getLayoutDirection());
            ljo0 ljo0Var = k2.n;
            if (ljo0Var == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + k2);
            }
            long j2 = ljo0Var.c;
            ljo0Var.b.a.b();
            if (c) {
                itl.d(this, 2).P1();
                izs<? super ljo0, s3q0> izsVar = this.s;
                if (izsVar != null) {
                    izsVar.invoke(ljo0Var);
                }
                jci0 jci0Var = this.z;
                if (jci0Var != null) {
                    ljo0 ljo0Var2 = (ljo0) jci0Var.e.c;
                    if (ljo0Var2 != null && !epx.f(ljo0Var2.a.a, ljo0Var.a.a)) {
                        jci0Var.c.e(jci0Var.b);
                    }
                    jci0Var.e = lyk0.a(jci0Var.e, null, ljo0Var, 1);
                }
                Map<gt1, Integer> map = this.C;
                if (map == null) {
                    map = new LinkedHashMap<>(2);
                }
                map.put(ht1.a, Integer.valueOf(Math.round(ljo0Var.d)));
                map.put(ht1.b, Integer.valueOf(Math.round(ljo0Var.e)));
                this.C = map;
            }
            izs<? super List<zhf0>, s3q0> izsVar2 = this.y;
            if (izsVar2 != null) {
                izsVar2.invoke(ljo0Var.f);
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            dp10 Q = ep10Var.Q(i, i2, this.C, new ape0(zo10Var.N(o6j.a.b(i, i, i2, i2)), 16));
            Trace.endSection();
            return Q;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void i2(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            o540 j2 = j2();
            us2 us2Var = this.p;
            nmo0 nmo0Var = this.q;
            v4s.a aVar = this.r;
            int i = this.t;
            boolean z5 = this.u;
            int i2 = this.v;
            int i3 = this.w;
            List<us2.d<esa0>> list = this.x;
            j2.a = us2Var;
            boolean c = nmo0Var.c(j2.k);
            j2.k = nmo0Var;
            if (!c) {
                j2.q <<= 2;
                j2.l = null;
                j2.n = null;
                j2.p = -1;
                j2.o = -1;
            }
            j2.b = aVar;
            j2.c = i;
            j2.d = z5;
            j2.e = i2;
            j2.f = i3;
            j2.g = list;
            j2.q = (j2.q << 2) | 2;
            j2.l = null;
            j2.n = null;
            j2.p = -1;
            j2.o = -1;
        }
        if (this.o) {
            if (z2 || (z && this.E != null)) {
                itl.f(this).R();
            }
            if (z2 || z3 || z4) {
                itl.f(this).Q();
                mio.a(this);
            }
            if (z) {
                mio.a(this);
            }
        }
    }

    public final o540 j2() {
        if (this.D == null) {
            this.D = new o540(this.p, this.q, this.r, this.t, this.u, this.v, this.w, this.x);
        }
        return this.D;
    }

    @Override // xsna.noy
    public final int k(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return k2(fVar).a(i, fVar.getLayoutDirection());
    }

    public final o540 k2(azl azlVar) {
        o540 o540Var;
        a aVar = this.F;
        if (aVar != null && aVar.c && (o540Var = aVar.d) != null) {
            o540Var.d(azlVar);
            return o540Var;
        }
        o540 j2 = j2();
        j2.d(azlVar);
        return j2;
    }

    @Override // xsna.fgi0
    public final void l1(tgi0 tgi0Var) {
        qyi0 qyi0Var = this.E;
        if (qyi0Var == null) {
            qyi0Var = new qyi0(this, 9);
            this.E = qyi0Var;
        }
        qgi0.s(tgi0Var, this.p);
        a aVar = this.F;
        if (aVar != null) {
            us2 us2Var = aVar.b;
            sgi0<us2> sgi0Var = ngi0.D;
            qcy<Object>[] qcyVarArr = qgi0.a;
            qcy<Object> qcyVar = qcyVarArr[16];
            tgi0Var.a(sgi0Var, us2Var);
            boolean z = aVar.c;
            sgi0<Boolean> sgi0Var2 = ngi0.E;
            qcy<Object> qcyVar2 = qcyVarArr[17];
            tgi0Var.a(sgi0Var2, Boolean.valueOf(z));
        }
        tgi0Var.a(wfi0.l, new ck(null, new ap30(this, 21)));
        tgi0Var.a(wfi0.m, new ck(null, new mmm0(this, 4)));
        tgi0Var.a(wfi0.n, new ck(null, new stg0(this, 10)));
        qgi0.b(tgi0Var, qyi0Var);
    }

    public final boolean l2(izs<? super ljo0, s3q0> izsVar, izs<? super List<zhf0>, s3q0> izsVar2, jci0 jci0Var, izs<? super a, s3q0> izsVar3) {
        boolean z;
        if (this.s != izsVar) {
            this.s = izsVar;
            z = true;
        } else {
            z = false;
        }
        if (this.y != izsVar2) {
            this.y = izsVar2;
            z = true;
        }
        if (!epx.f(this.z, jci0Var)) {
            this.z = jci0Var;
            z = true;
        }
        if (this.B == izsVar3) {
            return z;
        }
        this.B = izsVar3;
        return true;
    }

    public final boolean m2(nmo0 nmo0Var, List list, int i, int i2, boolean z, v4s.a aVar, int i3) {
        boolean z2 = !this.q.c(nmo0Var);
        this.q = nmo0Var;
        if (!epx.f(this.x, list)) {
            this.x = list;
            z2 = true;
        }
        if (this.w != i) {
            this.w = i;
            z2 = true;
        }
        if (this.v != i2) {
            this.v = i2;
            z2 = true;
        }
        if (this.u != z) {
            this.u = z;
            z2 = true;
        }
        if (!epx.f(this.r, aVar)) {
            this.r = aVar;
            z2 = true;
        }
        if (this.t == i3) {
            return z2;
        }
        this.t = i3;
        return true;
    }

    public final boolean n2(us2 us2Var) {
        boolean f = epx.f(this.p.c, us2Var.c);
        boolean z = (f && epx.f(this.p.b, us2Var.b)) ? false : true;
        if (z) {
            this.p = us2Var;
        }
        if (!f) {
            this.F = null;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    @Override // xsna.lio
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(toy toyVar) {
        long j;
        ljo0 ljo0Var;
        obi0 b;
        er9.b bVar;
        long j2;
        er9 er9Var = toyVar.b;
        if (!this.o) {
            return;
        }
        jci0 jci0Var = this.z;
        if (jci0Var != null && (b = jci0Var.c.i().b(jci0Var.b)) != null) {
            obi0.a aVar = b.b;
            obi0.a aVar2 = b.a;
            boolean z = b.c;
            int i = !z ? aVar2.b : aVar.b;
            int i2 = !z ? aVar.b : aVar2.b;
            if (i != i2) {
                cai0 cai0Var = jci0Var.f;
                int b2 = cai0Var != null ? cai0Var.b() : 0;
                if (i > b2) {
                    i = b2;
                }
                if (i2 > b2) {
                    i2 = b2;
                }
                ljo0 ljo0Var2 = (ljo0) jci0Var.e.c;
                androidx.compose.ui.graphics.a k = ljo0Var2 != null ? ljo0Var2.k(i, i2) : null;
                if (k != null) {
                    ljo0 ljo0Var3 = (ljo0) jci0Var.e.c;
                    if (ljo0Var3 == null || ljo0Var3.a.f == 3 || !ljo0Var3.e()) {
                        j = 4294967295L;
                        oio.C0(toyVar, k, jci0Var.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 60);
                    } else {
                        float intBitsToFloat = Float.intBitsToFloat((int) (er9Var.d() >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (er9Var.d() & 4294967295L));
                        er9.b bVar2 = er9Var.c;
                        long d = bVar2.d();
                        bVar2.a().e();
                        try {
                            bVar2.a.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat, intBitsToFloat2, 1);
                            bVar = bVar2;
                            try {
                                j = 4294967295L;
                                j2 = d;
                                try {
                                    oio.C0(toyVar, k, jci0Var.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 60);
                                    nq.b(bVar, j2);
                                } catch (Throwable th) {
                                    th = th;
                                    nq.b(bVar, j2);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                j2 = d;
                                nq.b(bVar, j2);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            bVar = bVar2;
                        }
                    }
                    yq9 a2 = er9Var.c.a();
                    o540 k2 = k2(toyVar);
                    ljo0Var = k2.n;
                    if (ljo0Var != null) {
                        throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + k2);
                    }
                    m540 m540Var = ljo0Var.b;
                    boolean z2 = ljo0Var.e() && this.t != 3;
                    if (z2) {
                        long j3 = ljo0Var.c;
                        zhf0 e = p490.e(0L, (Float.floatToRawIntBits((int) (j3 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j3 & j)) & j));
                        a2.e();
                        a2.b(e);
                    }
                    try {
                        hik0 hik0Var = this.q.a;
                        pdo0 pdo0Var = hik0Var.m;
                        if (pdo0Var == null) {
                            pdo0Var = pdo0.b;
                        }
                        pdo0 pdo0Var2 = pdo0Var;
                        v4j0 v4j0Var = hik0Var.n;
                        if (v4j0Var == null) {
                            v4j0Var = v4j0.d;
                        }
                        v4j0 v4j0Var2 = v4j0Var;
                        qio qioVar = hik0Var.p;
                        if (qioVar == null) {
                            qioVar = qbr.a;
                        }
                        qio qioVar2 = qioVar;
                        yk8 e2 = hik0Var.a.e();
                        if (e2 != null) {
                            m540Var.k(a2, e2, this.q.a.a.a(), v4j0Var2, pdo0Var2, qioVar2);
                        } else {
                            o7g o7gVar = this.A;
                            long a3 = o7gVar != null ? o7gVar.a() : l5g.k;
                            if (a3 == 16) {
                                a3 = this.q.b() != 16 ? this.q.b() : l5g.b;
                            }
                            m540Var.j(a2, a3, v4j0Var2, pdo0Var2, qioVar2);
                        }
                        if (z2) {
                            a2.a();
                        }
                        a aVar3 = this.F;
                        if (!((aVar3 == null || !aVar3.c) ? y000.g(this.p) : false)) {
                            List<us2.d<esa0>> list = this.x;
                            if (list == null || list.isEmpty()) {
                                return;
                            }
                        }
                        toyVar.s1();
                        return;
                    } catch (Throwable th4) {
                        if (z2) {
                            a2.a();
                        }
                        throw th4;
                    }
                }
            }
        }
        j = 4294967295L;
        yq9 a22 = er9Var.c.a();
        o540 k22 = k2(toyVar);
        ljo0Var = k22.n;
        if (ljo0Var != null) {
        }
    }

    @Override // xsna.noy
    public final int w(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return tdo0.a(k2(fVar).e(fVar.getLayoutDirection()).c());
    }

    @Override // xsna.noy
    public final int x(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return k2(fVar).a(i, fVar.getLayoutDirection());
    }

    @Override // xsna.noy
    public final int y(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return tdo0.a(k2(fVar).e(fVar.getLayoutDirection()).a());
    }
}
