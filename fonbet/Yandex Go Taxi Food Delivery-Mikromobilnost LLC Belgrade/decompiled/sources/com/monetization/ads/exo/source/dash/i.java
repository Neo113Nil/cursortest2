package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.monetization.ads.exo.source.dash.i;
import defpackage.bp61;
import defpackage.c981;
import defpackage.ca71;
import defpackage.cw71;
import defpackage.d981;
import defpackage.dh81;
import defpackage.di81;
import defpackage.ed81;
import defpackage.ey71;
import defpackage.g391;
import defpackage.i981;
import defpackage.ig71;
import defpackage.jv71;
import defpackage.k881;
import defpackage.ll81;
import defpackage.lm71;
import defpackage.mn71;
import defpackage.mr81;
import defpackage.n881;
import defpackage.nba1;
import defpackage.ng61;
import defpackage.nl81;
import defpackage.ny61;
import defpackage.oaa1;
import defpackage.op81;
import defpackage.pil0;
import defpackage.q581;
import defpackage.qh71;
import defpackage.qj61;
import defpackage.ql61;
import defpackage.qv81;
import defpackage.qw81;
import defpackage.ra71;
import defpackage.rf71;
import defpackage.sc81;
import defpackage.sj8;
import defpackage.sn61;
import defpackage.t671;
import defpackage.u571;
import defpackage.u871;
import defpackage.v281;
import defpackage.w511;
import defpackage.w581;
import defpackage.wl61;
import defpackage.x281;
import defpackage.xc81;
import defpackage.xi71;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import yads.po;
import yads.x20;
import yads.yc2;

/* loaded from: classes7.dex */
public final class i extends qv81 {
    public t671 A;
    public mr81 B;
    public x20 C;
    public Handler D;
    public q581 E;
    public Uri F;
    public final Uri G;
    public dh81 H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public final op81 h;
    public final boolean i;
    public final u571 j;
    public final n881 k;
    public final jv71 l;
    public final c981 m;
    public final ll81 n;
    public final mn71 o;
    public final long p;
    public final sc81 q;
    public final ql61 r;
    public final e s;
    public final Object t;
    public final SparseArray u;
    public final Runnable v;
    public final Runnable w;
    public final c x;
    public final ca71 y;
    public u871 z;

    static {
        xc81.a("goog.exo.dash");
    }

    public i(op81 op81Var, u571 u571Var, ql61 ql61Var, n881 n881Var, jv71 jv71Var, c981 c981Var, ll81 ll81Var, long j) {
        this.h = op81Var;
        this.E = op81Var.c;
        d981 d981Var = op81Var.b;
        d981Var.getClass();
        Uri uri = d981Var.a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.j = u571Var;
        this.r = ql61Var;
        this.k = n881Var;
        this.m = c981Var;
        this.n = ll81Var;
        this.p = j;
        this.l = jv71Var;
        this.o = new mn71();
        final int i = 0;
        this.i = false;
        this.q = new sc81(this.c.c, 0, null, 0L);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new c(this);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.s = new e(this);
        this.y = new f(this);
        this.v = new Runnable(this) { // from class: xe71
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                i iVar = this.b;
                switch (i2) {
                    case 0:
                        iVar.h();
                        break;
                    default:
                        iVar.f();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.w = new Runnable(this) { // from class: xe71
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                i iVar = this.b;
                switch (i22) {
                    case 0:
                        iVar.h();
                        break;
                    default:
                        iVar.f();
                        break;
                }
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0550, code lost:
    
        if (r8 > r24) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0553, code lost:
    
        if (r11 > 0) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0556, code lost:
    
        if (r11 < 0) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d3, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:288:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0440  */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31, types: [int] */
    /* JADX WARN: Type inference failed for: r10v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        long j;
        boolean z2;
        long j2;
        long j3;
        long j4;
        boolean z3;
        long j5;
        boolean z4;
        dh81 dh81Var;
        long j6;
        long j7;
        ng61 e;
        long j8;
        float f;
        float f2;
        qh71 qh71Var;
        long j9;
        int i;
        int i2;
        boolean z5;
        int i3;
        boolean z6 = false;
        int i4 = 0;
        while (i4 < this.u.size()) {
            int keyAt = this.u.keyAt(i4);
            if (keyAt >= this.O) {
                qw81 qw81Var = (qw81) this.u.valueAt(i4);
                dh81 dh81Var2 = this.H;
                int i5 = keyAt - this.O;
                qw81Var.N = dh81Var2;
                qw81Var.O = i5;
                yc2 yc2Var = qw81Var.F;
                yc2Var.i = z6;
                yc2Var.g = dh81Var2;
                Iterator it = yc2Var.f.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < yc2Var.g.h) {
                        it.remove();
                    }
                }
                qj61[] qj61VarArr = qw81Var.K;
                if (qj61VarArr != null) {
                    int length = qj61VarArr.length;
                    for (?? r10 = z6; r10 < length; r10++) {
                        di81 di81Var = qj61VarArr[r10].x;
                        sj8[] sj8VarArr = di81Var.i;
                        try {
                            di81Var.k = dh81Var2;
                            di81Var.l = i5;
                            long g = rf71.g(dh81Var2.a(i5));
                            List list = ((ey71) di81Var.k.m.get(di81Var.l)).c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                int[] iArr = di81Var.c;
                                int length2 = iArr.length;
                                i3 = i4;
                                int i6 = 0;
                                while (i6 < length2) {
                                    int i7 = length2;
                                    try {
                                        arrayList.addAll(((k881) list.get(iArr[i6])).c);
                                        i6++;
                                        length2 = i7;
                                    } catch (po e2) {
                                        e = e2;
                                        di81Var.m = e;
                                        i4 = i3;
                                    }
                                }
                                for (int i8 = 0; i8 < sj8VarArr.length; i8++) {
                                    sj8VarArr[i8] = sj8VarArr[i8].b(g, (x281) arrayList.get(di81Var.j.e(i8)));
                                }
                            } catch (po e3) {
                                e = e3;
                                i3 = i4;
                            }
                        } catch (po e4) {
                            e = e4;
                            i3 = i4;
                        }
                        i4 = i3;
                    }
                    i2 = i4;
                    z5 = true;
                    qw81Var.J.a((sn61) qw81Var);
                } else {
                    i2 = i4;
                    z5 = true;
                }
                qw81Var.P = ((ey71) dh81Var2.m.get(i5)).d;
                for (w581 w581Var : qw81Var.L) {
                    Iterator it2 = qw81Var.P.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            i981 i981Var = (i981) it2.next();
                            String str = i981Var.c + "/" + i981Var.d;
                            i981 i981Var2 = w581Var.x;
                            if (str.equals(i981Var2.c + "/" + i981Var2.d)) {
                                w581Var.c(i981Var, (dh81Var2.d && i5 == dh81Var2.m.size() + (-1)) ? z5 : false);
                            }
                        }
                    }
                }
            } else {
                i2 = i4;
            }
            i4 = i2 + 1;
            z6 = false;
        }
        int i9 = 1;
        ey71 ey71Var = (ey71) this.H.m.get(0);
        int size = this.H.m.size() - 1;
        ey71 ey71Var2 = (ey71) this.H.m.get(size);
        long g2 = rf71.g(this.H.a(size));
        long j10 = this.L;
        long j11 = -9223372036854775807L;
        long g3 = rf71.g(j10 == -9223372036854775807L ? System.currentTimeMillis() : j10 + SystemClock.elapsedRealtime());
        long g4 = rf71.g(this.H.a(0));
        long j12 = ey71Var.b;
        List list2 = ey71Var.c;
        long g5 = rf71.g(j12);
        int i10 = 0;
        while (true) {
            j = j11;
            if (i10 >= list2.size()) {
                z2 = false;
                break;
            }
            int i11 = ((k881) list2.get(i10)).b;
            if (i11 == i9 || i11 == 2) {
                break;
            }
            i10++;
            j11 = j;
            i9 = 1;
        }
        boolean z7 = z2;
        long j13 = g5;
        int i12 = 0;
        while (true) {
            j2 = g5;
            if (i12 >= list2.size()) {
                j3 = 0;
                j4 = j13;
                break;
            }
            k881 k881Var = (k881) list2.get(i12);
            j3 = 0;
            List list3 = k881Var.c;
            if ((z7 && k881Var.b == 3) || list3.isEmpty()) {
                i = i12;
            } else {
                ng61 e5 = ((x281) list3.get(0)).e();
                if (e5 != null && e5.q(g4, g3) != 0) {
                    i = i12;
                    j13 = Math.max(j13, e5.a(e5.n(g4, g3)) + j2);
                }
            }
            i12 = i + 1;
            g5 = j2;
        }
        j4 = j2;
        long j14 = ey71Var2.b;
        List list4 = ey71Var2.c;
        long g6 = rf71.g(j14);
        for (int i13 = 0; i13 < list4.size(); i13++) {
            int i14 = ((k881) list4.get(i13)).b;
            if (i14 == 1 || i14 == 2) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        long j15 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        int i15 = 0;
        while (true) {
            if (i15 >= list4.size()) {
                j5 = j15;
                break;
            }
            k881 k881Var2 = (k881) list4.get(i15);
            boolean z8 = z3;
            List list5 = k881Var2.c;
            if (z8) {
                j9 = g6;
                if (k881Var2.b == 3) {
                    continue;
                    i15++;
                    z3 = z8;
                    g6 = j9;
                }
            } else {
                j9 = g6;
            }
            if (list5.isEmpty()) {
                continue;
            } else {
                ng61 e6 = ((x281) list5.get(0)).e();
                if (e6 == null) {
                    j5 = j9 + g2;
                    break;
                }
                long q = e6.q(g2, g3);
                if (q == j3) {
                    j5 = j9;
                    break;
                } else {
                    long n = (e6.n(g2, g3) + q) - 1;
                    j15 = Math.min(j15, e6.m(n, g2) + e6.a(n) + j9);
                }
            }
            i15++;
            z3 = z8;
            g6 = j9;
        }
        if (this.H.d) {
            for (int i16 = 0; i16 < list4.size(); i16++) {
                ng61 e7 = ((x281) ((k881) list4.get(i16)).c.get(0)).e();
                if (e7 != null && !e7.mo485a()) {
                }
            }
            z4 = true;
            if (z4) {
                long j16 = this.H.f;
                if (j16 != j) {
                    j4 = Math.max(j4, j5 - rf71.g(j16));
                }
            }
            long j17 = j5 - j4;
            dh81Var = this.H;
            if (dh81Var.d) {
                j6 = j;
                j7 = j3;
            } else {
                long j18 = dh81Var.a;
                if (j18 == j) {
                    ny61.k();
                    return;
                }
                long g7 = (g3 - rf71.g(j18)) - j4;
                long u = rf71.u(g7);
                long j19 = this.h.c.c;
                if (j19 != j) {
                    j8 = Math.min(u, j19);
                } else {
                    qh71 qh71Var2 = this.H.j;
                    if (qh71Var2 != null) {
                        long j20 = qh71Var2.c;
                        if (j20 != j) {
                            j8 = Math.min(u, j20);
                        }
                    }
                    j8 = u;
                }
                long u2 = rf71.u(g7 - j17);
                if (u2 < j3 && j8 > j3) {
                    u2 = j3;
                }
                long j21 = this.H.c;
                if (j21 != j) {
                    u2 = Math.min(u2 + j21, u);
                }
                long j22 = this.h.c.b;
                if (j22 != j) {
                    u2 = Math.max(u2, Math.min(j22, u));
                } else {
                    qh71 qh71Var3 = this.H.j;
                    if (qh71Var3 != null) {
                        long j23 = qh71Var3.b;
                        if (j23 != j) {
                            u2 = Math.max(u2, Math.min(j23, u));
                        }
                    }
                }
                if (u2 > j8) {
                    j8 = u2;
                }
                long j24 = this.E.a;
                if (j24 == j) {
                    dh81 dh81Var3 = this.H;
                    qh71 qh71Var4 = dh81Var3.j;
                    if (qh71Var4 != null) {
                        long j25 = qh71Var4.a;
                        if (j25 != j) {
                            j24 = j25;
                        }
                    }
                    j24 = dh81Var3.g;
                    if (j24 == j) {
                        j24 = this.p;
                    }
                }
                if (j24 < u2) {
                    j24 = u2;
                }
                if (j24 > j8) {
                    j24 = Math.max(u2, Math.min(rf71.u(g7 - Math.min(5000000L, j17 / 2)), j8));
                }
                long j26 = j24;
                q581 q581Var = this.h.c;
                float f3 = q581Var.w;
                if (f3 == -3.4028235E38f) {
                    qh71 qh71Var5 = this.H.j;
                    f3 = qh71Var5 != null ? qh71Var5.d : -3.4028235E38f;
                }
                float f4 = q581Var.x;
                if (f4 == -3.4028235E38f) {
                    qh71 qh71Var6 = this.H.j;
                    f4 = qh71Var6 != null ? qh71Var6.e : -3.4028235E38f;
                }
                if (f3 == -3.4028235E38f && f4 == -3.4028235E38f && ((qh71Var = this.H.j) == null || qh71Var.a == j)) {
                    f2 = 1.0f;
                    f = 1.0f;
                } else {
                    f = f4;
                    f2 = f3;
                }
                this.E = new q581(f2, f, j26, u2, j8);
                long u3 = rf71.u(j4) + this.H.a;
                long g8 = g7 - rf71.g(this.E.a);
                long min = Math.min(5000000L, j17 / 2);
                j7 = g8 < min ? min : g8;
                j6 = u3;
            }
            long g9 = j4 - rf71.g(ey71Var.b);
            dh81 dh81Var4 = this.H;
            a(new b(dh81Var4.a, j6, this.L, this.O, g9, j17, j7, dh81Var4, this.h, !dh81Var4.d ? this.E : null));
            if (this.i) {
                this.D.removeCallbacks(this.w);
                if (z4) {
                    Handler handler = this.D;
                    Runnable runnable = this.w;
                    dh81 dh81Var5 = this.H;
                    long j27 = this.L;
                    long currentTimeMillis = j27 == j ? System.currentTimeMillis() : j27 + SystemClock.elapsedRealtime();
                    int size2 = dh81Var5.m.size() - 1;
                    ey71 ey71Var3 = (ey71) dh81Var5.m.get(size2);
                    long j28 = ey71Var3.b;
                    List list6 = ey71Var3.c;
                    long g10 = rf71.g(j28);
                    long g11 = rf71.g(dh81Var5.a(size2));
                    long g12 = rf71.g(currentTimeMillis);
                    long g13 = rf71.g(dh81Var5.a);
                    long g14 = rf71.g(5000L);
                    for (int i17 = 0; i17 < list6.size(); i17++) {
                        List list7 = ((k881) list6.get(i17)).c;
                        if (!list7.isEmpty() && (e = ((x281) list7.get(0)).e()) != null) {
                            long o = (e.o(g11, g12) + (g13 + g10)) - g12;
                            if (o < g14 - 100000 || (o > g14 && o < g14 + 100000)) {
                                g14 = o;
                            }
                        }
                    }
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    roundingMode.getClass();
                    long j29 = g14 / 1000;
                    long j30 = g14 - (j29 * 1000);
                    if (j30 != j3) {
                        int i18 = ((int) ((g14 ^ 1000) >> 63)) | 1;
                        switch (ig71.a[roundingMode.ordinal()]) {
                            case 1:
                                if (j30 != j3) {
                                    w511.w("mode was UNNECESSARY, but rounding was necessary");
                                    break;
                                }
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                j29 += i18;
                                break;
                            case 5:
                                break;
                            case 6:
                            case 7:
                            case 8:
                                long abs = Math.abs(j30);
                                long abs2 = abs - (Math.abs(1000L) - abs);
                                if (abs2 == j3) {
                                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                                    break;
                                }
                                break;
                            default:
                                ny61.w();
                                break;
                        }
                        return;
                    }
                    handler.postDelayed(runnable, j29);
                }
                if (this.I) {
                    h();
                    return;
                }
                if (z) {
                    dh81 dh81Var6 = this.H;
                    if (dh81Var6.d) {
                        long j31 = dh81Var6.e;
                        if (j31 != j) {
                            this.D.postDelayed(this.v, Math.max(j3, (this.J + (j31 == j3 ? 5000L : j31)) - SystemClock.elapsedRealtime()));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        z4 = false;
        if (z4) {
        }
        long j172 = j5 - j4;
        dh81Var = this.H;
        if (dh81Var.d) {
        }
        long g92 = j4 - rf71.g(ey71Var.b);
        dh81 dh81Var42 = this.H;
        a(new b(dh81Var42.a, j6, this.L, this.O, g92, j172, j7, dh81Var42, this.h, !dh81Var42.d ? this.E : null));
        if (this.i) {
        }
    }

    @Override // defpackage.qv81
    public final op81 c() {
        return this.h;
    }

    @Override // defpackage.qv81
    public final void d() {
        this.y.a();
    }

    @Override // defpackage.qv81
    public final void e() {
        this.I = false;
        this.z = null;
        t671 t671Var = this.A;
        if (t671Var != null) {
            t671Var.d(null);
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.H = this.i ? this.H : null;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.O = 0;
        this.u.clear();
        mn71 mn71Var = this.o;
        mn71Var.a.clear();
        mn71Var.b.clear();
        mn71Var.c.clear();
        this.m.getClass();
    }

    public final /* synthetic */ void f() {
        a(false);
    }

    public final void g() {
        boolean z;
        t671 t671Var = this.A;
        a aVar = new a(this);
        synchronized (oaa1.b) {
            z = oaa1.c;
        }
        if (z) {
            aVar.a();
            return;
        }
        if (t671Var == null) {
            t671Var = new t671("SntpClient");
        }
        t671Var.c(new g391(), new lm71(16, aVar), 1);
    }

    public final void h() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        t671 t671Var = this.A;
        if (t671Var.c != null) {
            return;
        }
        if (t671Var.e()) {
            this.I = true;
            return;
        }
        synchronized (this.t) {
            uri = this.F;
        }
        this.I = false;
        bp61 bp61Var = new bp61(this.z, uri, 4, this.r);
        e eVar = this.s;
        this.n.getClass();
        this.A.c(bp61Var, eVar, 3);
        sc81 sc81Var = this.q;
        sc81Var.g(new nl81(bp61Var.b), new pil0(bp61Var.c, -1, null, 0, null, sc81Var.a(-9223372036854775807L), sc81Var.a(-9223372036854775807L)));
    }

    @Override // defpackage.qv81
    public final ra71 a(v281 v281Var, xi71 xi71Var, long j) {
        int intValue = ((Integer) v281Var.a).intValue() - this.O;
        sc81 sc81Var = new sc81(this.c.c, 0, v281Var, ((ey71) this.H.m.get(intValue)).b);
        cw71 cw71Var = new cw71(this.d.c, 0, v281Var);
        int i = this.O + intValue;
        dh81 dh81Var = this.H;
        mn71 mn71Var = this.o;
        n881 n881Var = this.k;
        mr81 mr81Var = this.B;
        c981 c981Var = this.m;
        ll81 ll81Var = this.n;
        long j2 = this.L;
        ca71 ca71Var = this.y;
        jv71 jv71Var = this.l;
        c cVar = this.x;
        wl61 wl61Var = this.g;
        if (wl61Var != null) {
            qw81 qw81Var = new qw81(i, dh81Var, mn71Var, intValue, n881Var, mr81Var, c981Var, cw71Var, ll81Var, sc81Var, j2, ca71Var, xi71Var, jv71Var, cVar, wl61Var);
            this.u.put(i, qw81Var);
            return qw81Var;
        }
        ny61.k();
        return null;
    }

    @Override // defpackage.qv81
    public final void a(ra71 ra71Var) {
        qw81 qw81Var = (qw81) ra71Var;
        yc2 yc2Var = qw81Var.F;
        yc2Var.j = true;
        yc2Var.e.removeCallbacksAndMessages(null);
        for (qj61 qj61Var : qw81Var.K) {
            qj61Var.K = qw81Var;
            ed81 ed81Var = qj61Var.F;
            ed81Var.g();
            ed81Var.r();
            for (ed81 ed81Var2 : qj61Var.G) {
                ed81Var2.g();
                ed81Var2.r();
            }
            qj61Var.B.d(qj61Var);
        }
        qw81Var.J = null;
        this.u.remove(qw81Var.a);
    }

    public final void a(IOException iOException) {
        nba1.c("DashMediaSource", nba1.b("Failed to resolve time offset.", iOException));
        a(true);
    }

    @Override // defpackage.qv81
    public final void a(mr81 mr81Var) {
        this.B = mr81Var;
        this.m.getClass();
        c981 c981Var = this.m;
        Looper.myLooper();
        if (this.g != null) {
            c981Var.getClass();
            if (this.i) {
                a(false);
                return;
            }
            this.z = this.j.a();
            this.A = new t671("DashMediaSource");
            this.D = rf71.i(null);
            h();
            return;
        }
        ny61.k();
    }
}
