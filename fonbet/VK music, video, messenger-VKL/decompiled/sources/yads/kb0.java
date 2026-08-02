package yads;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.ironsource.Z3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import xsna.btg0;
import xsna.g8n;
import xsna.i1a;
import xsna.i1l0;
import xsna.i79;
import xsna.ie40;
import xsna.j1d;
import xsna.kfx;
import xsna.krw;
import xsna.m2o0;
import xsna.m3z0;
import xsna.n0p;
import xsna.nsn;
import xsna.o0p;
import xsna.o6y0;
import xsna.pi40;
import xsna.po9;
import xsna.qnh0;
import xsna.rff;
import xsna.ro9;
import xsna.sgw;
import xsna.sj7;
import xsna.t1j0;
import xsna.tj60;
import xsna.tkz;
import xsna.tnf;
import xsna.uyw;
import xsna.vvi0;
import xsna.xgz;
import xsna.xm8;
import xsna.y2x0;
import xsna.za6;
import xsna.zqg0;

/* loaded from: classes10.dex */
public final class kb0 implements se {
    public final xv a;
    public final t73 b;
    public final v73 c;
    public final jb0 d;
    public final SparseArray e;
    public qg1 f;
    public pf2 g;
    public m63 h;

    public kb0(xv xvVar) {
        this.a = (xv) ni.a(xvVar);
        this.f = new qg1(mc3.c(), xvVar, new m2o0(6));
        t73 t73Var = new t73();
        this.b = t73Var;
        this.c = new v73();
        this.d = new jb0(t73Var);
        this.e = new SparseArray();
    }

    public static /* synthetic */ void a(af afVar, ew0 ew0Var) {
    }

    public final ye b() {
        return a(this.d.f);
    }

    public final ye e(int i, zn1 zn1Var) {
        this.g.getClass();
        if (zn1Var != null) {
            return ((w73) this.d.c.get(zn1Var)) != null ? a(zn1Var) : a(w73.b, i, zn1Var);
        }
        ao0 ao0Var = (ao0) this.g;
        ao0Var.r();
        w73 w73Var = ao0Var.Z.a;
        if (i >= w73Var.b()) {
            w73Var = w73.b;
        }
        return a(w73Var, i, (zn1) null);
    }

    @Override // yads.nf2
    public final void onCues(List list) {
        ye a = a();
        a(a, 27, new krw(a, list));
    }

    @Override // yads.nf2
    public final void onIsLoadingChanged(final boolean z) {
        final ye a = a();
        a(a, 3, new ng1() { // from class: xsna.k3z0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                boolean z2 = z;
                yads.ye yeVar = yads.ye.this;
                ((yads.af) obj).getClass();
            }
        });
    }

    @Override // yads.nf2
    public final void onIsPlayingChanged(final boolean z) {
        final ye a = a();
        a(a, 7, new ng1() { // from class: xsna.e3z0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                boolean z2 = z;
                yads.ye yeVar = yads.ye.this;
                ((yads.af) obj).getClass();
            }
        });
    }

    @Override // yads.nf2
    public final void onPlayWhenReadyChanged(final boolean z, final int i) {
        final ye a = a();
        a(a, 5, new ng1() { // from class: xsna.h3z0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                int i2 = i;
                yads.ye yeVar = a;
                boolean z2 = z;
                ((yads.af) obj).getClass();
            }
        });
    }

    @Override // yads.nf2
    public final void onPlaybackStateChanged(final int i) {
        final ye a = a();
        a(a, 4, new ng1() { // from class: xsna.d3z0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                int i2 = i;
                yads.ye yeVar = yads.ye.this;
                ((yads.af) obj).getClass();
            }
        });
    }

    @Override // yads.nf2
    public final void onPlaybackSuppressionReasonChanged(final int i) {
        final ye a = a();
        a(a, 6, new ng1() { // from class: xsna.j3z0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                int i2 = i;
                yads.ye yeVar = yads.ye.this;
                ((yads.af) obj).getClass();
            }
        });
    }

    @Override // yads.nf2
    public final void onPlayerStateChanged(final boolean z, final int i) {
        final ye a = a();
        a(a, -1, new ng1() { // from class: xsna.u2z0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                int i2 = i;
                yads.ye yeVar = a;
                boolean z2 = z;
                ((yads.af) obj).getClass();
            }
        });
    }

    @Override // yads.nf2
    public final void onSkipSilenceEnabledChanged(final boolean z) {
        final ye b = b();
        a(b, 23, new ng1() { // from class: xsna.n3z0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                boolean z2 = z;
                yads.ye yeVar = yads.ye.this;
                ((yads.af) obj).getClass();
            }
        });
    }

    @Override // yads.nf2
    public final void onSurfaceSizeChanged(final int i, final int i2) {
        final ye b = b();
        a(b, 24, new ng1() { // from class: xsna.t2z0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                int i3 = i2;
                yads.ye yeVar = yads.ye.this;
                int i4 = i;
                ((yads.af) obj).getClass();
            }
        });
    }

    @Override // yads.nf2
    public final void onVolumeChanged(final float f) {
        final ye b = b();
        a(b, 22, new ng1() { // from class: xsna.y2z0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                float f2 = f;
                yads.ye yeVar = yads.ye.this;
                ((yads.af) obj).getClass();
            }
        });
    }

    public final ye a() {
        return a(this.d.d);
    }

    public final ye a(zn1 zn1Var) {
        this.g.getClass();
        w73 w73Var = zn1Var == null ? null : (w73) this.d.c.get(zn1Var);
        if (zn1Var != null && w73Var != null) {
            return a(w73Var, w73Var.a(zn1Var.a, this.b).d, zn1Var);
        }
        int e = ((ao0) this.g).e();
        ao0 ao0Var = (ao0) this.g;
        ao0Var.r();
        w73 w73Var2 = ao0Var.Z.a;
        if (e >= w73Var2.b()) {
            w73Var2 = w73.b;
        }
        return a(w73Var2, e, (zn1) null);
    }

    @Override // yads.qk0
    public final void d(int i, zn1 zn1Var) {
        ye e = e(i, zn1Var);
        a(e, IronSourceError.ERROR_RV_LOAD_DURING_LOAD, new pi40(e, 26));
    }

    public static void b(ye yeVar, int i, long j, long j2, af afVar) {
        String str;
        nn1 nn1Var = (nn1) afVar;
        nn1Var.getClass();
        zn1 zn1Var = yeVar.d;
        if (zn1Var != null) {
            oe0 oe0Var = nn1Var.b;
            w73 w73Var = yeVar.b;
            synchronized (oe0Var) {
                str = oe0Var.a(w73Var.a(zn1Var.a, oe0Var.b).d, zn1Var).a;
            }
            Long l = (Long) nn1Var.h.get(str);
            Long l2 = (Long) nn1Var.g.get(str);
            nn1Var.h.put(str, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            nn1Var.g.put(str, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    public static void c(ye yeVar, pa0 pa0Var, af afVar) {
        nn1 nn1Var = (nn1) afVar;
        nn1Var.x += pa0Var.g;
        nn1Var.y += pa0Var.e;
    }

    public final void d(pa0 pa0Var) {
        ye b = b();
        a(b, 1015, new i1a(b, pa0Var));
    }

    public final void d() {
        ye a = a();
        a(a, IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, new y2x0(a));
        qg1 qg1Var = this.f;
        Iterator it = qg1Var.d.iterator();
        while (it.hasNext()) {
            pg1 pg1Var = (pg1) it.next();
            og1 og1Var = qg1Var.c;
            pg1Var.d = true;
            if (pg1Var.c) {
                og1Var.a(pg1Var.a, pg1Var.b.a());
            }
        }
        qg1Var.d.clear();
        qg1Var.g = true;
    }

    @Override // yads.qk0
    public final void c(int i, zn1 zn1Var) {
        ye e = e(i, zn1Var);
        a(e, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, new ie40(e, 27));
    }

    @Override // yads.do1
    public final void c(int i, zn1 zn1Var, wg1 wg1Var, in1 in1Var) {
        ye e = e(i, zn1Var);
        a(e, 1002, new uyw(e, wg1Var, in1Var));
    }

    public final void c(Exception exc) {
        ye b = b();
        a(b, IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, new xsna.ex0(4, b, exc));
    }

    public final void c(pa0 pa0Var) {
        ye a = a(this.d.e);
        a(a, 1020, new t1j0(a, pa0Var));
    }

    public final ye a(w73 w73Var, int i, zn1 zn1Var) {
        zn1 zn1Var2 = w73Var.c() ? null : zn1Var;
        ((j63) this.a).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ao0 ao0Var = (ao0) this.g;
        ao0Var.r();
        boolean z = w73Var.equals(ao0Var.Z.a) && i == ((ao0) this.g).e();
        long j = 0;
        if (zn1Var2 == null || !zn1Var2.a()) {
            if (z) {
                j = ((ao0) this.g).b();
            } else if (!w73Var.c()) {
                j = mc3.b(w73Var.a(i, this.c, 0L).n);
            }
        } else if (z && ((ao0) this.g).c() == zn1Var2.b && ((ao0) this.g).d() == zn1Var2.c) {
            ao0 ao0Var2 = (ao0) this.g;
            ao0Var2.r();
            j = mc3.b(ao0Var2.a(ao0Var2.Z));
        }
        zn1 zn1Var3 = this.d.d;
        ao0 ao0Var3 = (ao0) this.g;
        ao0Var3.r();
        w73 w73Var2 = ao0Var3.Z.a;
        int e = ((ao0) this.g).e();
        ao0 ao0Var4 = (ao0) this.g;
        ao0Var4.r();
        long b = mc3.b(ao0Var4.a(ao0Var4.Z));
        ao0 ao0Var5 = (ao0) this.g;
        ao0Var5.r();
        return new ye(elapsedRealtime, w73Var, i, zn1Var2, j, w73Var2, e, zn1Var3, b, mc3.b(ao0Var5.Z.q));
    }

    public final void c() {
        m63 m63Var = this.h;
        if (m63Var != null) {
            m63Var.a.post(new tnf(this, 16));
            return;
        }
        throw new IllegalStateException();
    }

    public final void b(pa0 pa0Var) {
        ye b = b();
        a(b, 1007, new sgw(4, b, pa0Var));
    }

    public final void b(Exception exc) {
        ye b = b();
        a(b, Z3.j, new po9(b, exc));
    }

    public final void b(final int i, final long j, final long j2) {
        jb0 jb0Var = this.d;
        final ye a = a(jb0Var.b.isEmpty() ? null : (zn1) yd1.a(jb0Var.b));
        a(a, 1006, new ng1() { // from class: xsna.o3z0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                yads.kb0.b(yads.ye.this, i, j, j2, (yads.af) obj);
            }
        });
    }

    @Override // yads.do1
    public final void b(int i, zn1 zn1Var, in1 in1Var) {
        ye e = e(i, zn1Var);
        a(e, 1004, new xsna.yj0(e, in1Var));
    }

    @Override // yads.qk0
    public final void b(int i, zn1 zn1Var) {
        ye e = e(i, zn1Var);
        a(e, IronSourceError.ERROR_RV_LOAD_DURING_SHOW, new vvi0(e, 10));
    }

    @Override // yads.do1
    public final void b(int i, zn1 zn1Var, wg1 wg1Var, in1 in1Var) {
        ye e = e(i, zn1Var);
        a(e, 1000, new zqg0(e, wg1Var, in1Var));
    }

    @Override // yads.nf2
    public final void b(qn0 qn0Var) {
        ye a;
        sn1 sn1Var;
        if (qn0Var != null && (sn1Var = qn0Var.i) != null) {
            a = a(new zn1(sn1Var));
        } else {
            a = a();
        }
        a(a, 10, new btg0(a, qn0Var));
    }

    public final void b(final String str, final long j, final long j2) {
        final ye b = b();
        a(b, Z3.l, new ng1() { // from class: xsna.z2z0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                long j3 = j;
                yads.ye yeVar = yads.ye.this;
                String str2 = str;
                long j4 = j2;
                ((yads.af) obj).getClass();
            }
        });
    }

    public final void b(String str) {
        ye b = b();
        a(b, 1019, new nsn(3, b, str));
    }

    @Override // yads.nf2
    public final void onRenderedFirstFrame() {
    }

    public final void b(final int i, final long j) {
        final ye a = a(this.d.e);
        a(a, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, new ng1() { // from class: xsna.w2z0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                int i2 = i;
                yads.ye yeVar = a;
                long j2 = j;
                ((yads.af) obj).getClass();
            }
        });
    }

    public final void b(nx0 nx0Var, va0 va0Var) {
        ye b = b();
        a(b, 1017, new xgz(b, nx0Var, va0Var));
    }

    public static void a(ye yeVar, in1 in1Var, af afVar) {
        String str;
        nn1 nn1Var = (nn1) afVar;
        nn1Var.getClass();
        if (yeVar.d == null) {
            return;
        }
        nx0 nx0Var = in1Var.c;
        nx0Var.getClass();
        int i = in1Var.d;
        oe0 oe0Var = nn1Var.b;
        w73 w73Var = yeVar.b;
        zn1 zn1Var = yeVar.d;
        zn1Var.getClass();
        synchronized (oe0Var) {
            str = oe0Var.a(w73Var.a(zn1Var.a, oe0Var.b).d, zn1Var).a;
        }
        mn1 mn1Var = new mn1(nx0Var, i, str);
        int i2 = in1Var.b;
        if (i2 != 0) {
            if (i2 == 1) {
                nn1Var.p = mn1Var;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                nn1Var.q = mn1Var;
                return;
            }
        }
        nn1Var.o = mn1Var;
    }

    public static void a(ye yeVar, wg1 wg1Var, in1 in1Var, IOException iOException, boolean z, af afVar) {
        nn1 nn1Var = (nn1) afVar;
        nn1Var.getClass();
        nn1Var.v = in1Var.a;
    }

    public static void a(ye yeVar, cf2 cf2Var, af afVar) {
        ((nn1) afVar).n = cf2Var;
    }

    public static void a(ye yeVar, int i, of2 of2Var, of2 of2Var2, af afVar) {
        afVar.getClass();
        nn1 nn1Var = (nn1) afVar;
        if (i == 1) {
            nn1Var.u = true;
        }
        nn1Var.k = i;
    }

    public static void a(ye yeVar, sk3 sk3Var, af afVar) {
        nn1 nn1Var = (nn1) afVar;
        mn1 mn1Var = nn1Var.o;
        if (mn1Var != null) {
            nx0 nx0Var = mn1Var.a;
            if (nx0Var.s == -1) {
                mx0 mx0Var = new mx0(nx0Var);
                mx0Var.p = sk3Var.b;
                mx0Var.q = sk3Var.c;
                nn1Var.o = new mn1(new nx0(mx0Var), mn1Var.b, mn1Var.c);
            }
        }
        int i = sk3Var.b;
    }

    public final /* synthetic */ void a(pf2 pf2Var, af afVar, ew0 ew0Var) {
        ((nn1) afVar).a(pf2Var, new ze(ew0Var, this.e));
    }

    public final void a(Exception exc) {
        ye b = b();
        a(b, IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, new za6(b, exc));
    }

    public final void a(final String str, final long j, final long j2) {
        final ye b = b();
        a(b, 1008, new ng1() { // from class: xsna.v2z0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                long j3 = j;
                yads.ye yeVar = yads.ye.this;
                String str2 = str;
                long j4 = j2;
                ((yads.af) obj).getClass();
            }
        });
    }

    public final void a(String str) {
        ye b = b();
        a(b, 1012, new g8n(b, str));
    }

    public final void a(pa0 pa0Var) {
        ye a = a(this.d.e);
        a(a, Z3.i, new o0p(a, pa0Var));
    }

    public final void a(final nx0 nx0Var, final va0 va0Var) {
        final ye b = b();
        a(b, 1009, new ng1() { // from class: xsna.i3z0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                yads.va0 va0Var2 = va0Var;
                yads.ye yeVar = yads.ye.this;
                yads.nx0 nx0Var2 = nx0Var;
                ((yads.af) obj).getClass();
            }
        });
    }

    public final void a(final long j) {
        final ye b = b();
        a(b, 1010, new ng1() { // from class: xsna.f3z0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                long j2 = j;
                yads.ye yeVar = yads.ye.this;
                ((yads.af) obj).getClass();
            }
        });
    }

    public final void a(final int i, final long j, final long j2) {
        final ye b = b();
        a(b, 1011, new ng1() { // from class: xsna.x2z0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                long j3 = j2;
                yads.ye yeVar = yads.ye.this;
                int i2 = i;
                long j4 = j;
                ((yads.af) obj).getClass();
            }
        });
    }

    @Override // yads.nf2
    public final void a(mf2 mf2Var) {
        ye a = a();
        a(a, 13, new qnh0(a, mf2Var));
    }

    @Override // yads.nf2
    public final void a(q20 q20Var) {
        ye a = a();
        a(a, 27, new i79(a, q20Var));
    }

    @Override // yads.nf2
    public final void a(ig0 ig0Var) {
        ye a = a();
        a(a, 29, new i1l0(a, ig0Var));
    }

    @Override // yads.nf2
    public final void a(final boolean z, final int i) {
        final ye a = a();
        a(a, 30, new ng1() { // from class: xsna.b3z0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                boolean z2 = z;
                yads.ye yeVar = a;
                int i2 = i;
                ((yads.af) obj).getClass();
            }
        });
    }

    @Override // yads.qk0
    public final void a(int i, zn1 zn1Var) {
        ye e = e(i, zn1Var);
        a(e, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, new tj60(e, 26));
    }

    @Override // yads.qk0
    public final void a(int i, zn1 zn1Var, final int i2) {
        final ye e = e(i, zn1Var);
        a(e, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, new ng1() { // from class: xsna.s2z0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                int i3 = i2;
                yads.ye yeVar = yads.ye.this;
                ((yads.af) obj).getClass();
            }
        });
    }

    @Override // yads.qk0
    public final void a(int i, zn1 zn1Var, Exception exc) {
        ye e = e(i, zn1Var);
        a(e, 1024, new ro9(4, e, exc));
    }

    public final void a(final int i, final long j) {
        final ye a = a(this.d.e);
        a(a, 1018, new ng1() { // from class: xsna.g3z0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                long j2 = j;
                yads.ye yeVar = a;
                int i2 = i;
                ((yads.af) obj).getClass();
            }
        });
    }

    @Override // yads.do1
    public final void a(int i, zn1 zn1Var, final wg1 wg1Var, final in1 in1Var) {
        final ye e = e(i, zn1Var);
        a(e, 1001, new ng1() { // from class: xsna.q3z0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                yads.in1 in1Var2 = in1Var;
                yads.ye yeVar = yads.ye.this;
                yads.wg1 wg1Var2 = wg1Var;
                ((yads.af) obj).getClass();
            }
        });
    }

    @Override // yads.do1
    public final void a(int i, zn1 zn1Var, final wg1 wg1Var, final in1 in1Var, final IOException iOException, final boolean z) {
        final ye e = e(i, zn1Var);
        a(e, 1003, new ng1() { // from class: xsna.p3z0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                yads.kb0.a(yads.ye.this, wg1Var, in1Var, iOException, z, (yads.af) obj);
            }
        });
    }

    @Override // yads.nf2
    public final void a(final gn1 gn1Var, final int i) {
        final ye a = a();
        a(a, 1, new ng1() { // from class: xsna.a3z0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                int i2 = i;
                yads.ye yeVar = yads.ye.this;
                yads.gn1 gn1Var2 = gn1Var;
                ((yads.af) obj).getClass();
            }
        });
    }

    @Override // yads.nf2
    public final void a(kn1 kn1Var) {
        ye a = a();
        a(a, 14, new o6y0(a, kn1Var));
    }

    @Override // yads.nf2
    public final void a(ut1 ut1Var) {
        ye a = a();
        a(a, 28, new rff(a, ut1Var));
    }

    @Override // yads.nf2
    public final void a(ff2 ff2Var) {
        ye a = a();
        a(a, 12, new xm8(a, ff2Var));
    }

    @Override // yads.nf2
    public final void a(qn0 qn0Var) {
        ye a;
        sn1 sn1Var;
        if (qn0Var != null && (sn1Var = qn0Var.i) != null) {
            a = a(new zn1(sn1Var));
        } else {
            a = a();
        }
        a(a, 10, new kfx(a, qn0Var));
    }

    @Override // yads.nf2
    public final void a(final of2 of2Var, final of2 of2Var2, final int i) {
        jb0 jb0Var = this.d;
        pf2 pf2Var = this.g;
        pf2Var.getClass();
        jb0Var.d = jb0.a(pf2Var, jb0Var.b, jb0Var.e, jb0Var.a);
        final ye a = a();
        a(a, 11, new ng1() { // from class: xsna.c3z0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                yads.kb0.a(yads.ye.this, i, of2Var, of2Var2, (yads.af) obj);
            }
        });
    }

    public final void a(final Object obj, final long j) {
        final ye b = b();
        a(b, 26, new ng1() { // from class: xsna.l3z0
            @Override // yads.ng1
            public final void invoke(Object obj2) {
                long j2 = j;
                yads.ye yeVar = yads.ye.this;
                Object obj3 = obj;
                ((yads.af) obj2).getClass();
            }
        });
    }

    @Override // yads.nf2
    public final void a(int i) {
        jb0 jb0Var = this.d;
        pf2 pf2Var = this.g;
        pf2Var.getClass();
        jb0Var.d = jb0.a(pf2Var, jb0Var.b, jb0Var.e, jb0Var.a);
        ao0 ao0Var = (ao0) pf2Var;
        ao0Var.r();
        jb0Var.a(ao0Var.Z.a);
        ye a = a();
        a(a, 0, new tkz(a, i));
    }

    @Override // yads.nf2
    public final void a(s93 s93Var) {
        ye a = a();
        a(a, 2, new n0p(2, a, s93Var));
    }

    @Override // yads.do1
    public final void a(int i, zn1 zn1Var, in1 in1Var) {
        ye e = e(i, zn1Var);
        a(e, 1005, new sj7(5, e, in1Var));
    }

    @Override // yads.nf2
    public final void a(sk3 sk3Var) {
        ye b = b();
        a(b, 25, new m3z0(0, b, sk3Var));
    }

    public final void a(ye yeVar, int i, ng1 ng1Var) {
        this.e.put(i, yeVar);
        qg1 qg1Var = this.f;
        qg1Var.a(i, ng1Var);
        qg1Var.a();
    }

    public final void a(pf2 pf2Var, Looper looper) {
        if (this.g != null && !this.d.b.isEmpty()) {
            throw new IllegalStateException();
        }
        this.g = pf2Var;
        this.h = ((j63) this.a).a(looper, null);
        qg1 qg1Var = this.f;
        j1d j1dVar = new j1d(this, pf2Var);
        this.f = new qg1(qg1Var.d, looper, qg1Var.a, j1dVar);
    }
}
