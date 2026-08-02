package xsna;

import android.content.ClipDescription;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import xsna.b6u0;
import xsna.dak0;
import xsna.obi0;
import xsna.zbi0;

/* compiled from: TextFieldSelectionManager.kt */
/* loaded from: classes11.dex */
public final class gho0 {
    public final b A;
    public final a B;
    public boolean C;
    public final c3q0 a;
    public uv70 b;
    public izs<? super tho0, s3q0> c;
    public j1z d;
    public final wh50<tho0> e;
    public b6u0 f;
    public gzs<s3q0> g;
    public wfd h;
    public yvj i;
    public aua0 j;
    public ymo0 k;
    public vtu l;
    public rwr m;
    public final wh50 n;
    public final wh50 o;
    public long p;
    public qko0 q;
    public long r;
    public final wh50 s;
    public final wh50 t;
    public int u;
    public tho0 v;
    public yvj0 w;
    public qko0 x;
    public final wh50 y;
    public final pwi z;

    /* compiled from: TextFieldSelectionManager.kt */
    public static final class a implements ub30 {
        public boolean a = true;
        public qko0 b;

        public a() {
        }

        @Override // xsna.ub30
        public final void a() {
            if (this.a) {
                gho0.b(gho0.this, this.b);
            }
        }

        @Override // xsna.ub30
        public final boolean b(long j, zbi0 zbi0Var, int i) {
            j1z j1zVar;
            gho0 gho0Var = gho0.this;
            if (!gho0Var.m() || gho0Var.p().a.c.length() == 0 || (j1zVar = gho0Var.d) == null || j1zVar.d() == null) {
                return false;
            }
            rwr rwrVar = gho0Var.m;
            if (rwrVar != null) {
                rwr.b(rwrVar);
            }
            gho0Var.p = j;
            gho0Var.u = -1;
            gho0Var.j(true);
            long f = f(gho0Var.p(), gho0Var.p, true, zbi0Var);
            if (i >= 2) {
                this.a = true;
                this.b = new qko0(f);
            }
            return true;
        }

        @Override // xsna.ub30
        public final boolean c(long j) {
            gho0 gho0Var = gho0.this;
            j1z j1zVar = gho0Var.d;
            if (j1zVar == null || j1zVar.d() == null || !gho0Var.m()) {
                return false;
            }
            gho0Var.u = -1;
            rwr rwrVar = gho0Var.m;
            if (rwrVar != null) {
                rwr.b(rwrVar);
            }
            f(gho0Var.p(), j, false, zbi0.a.a);
            return true;
        }

        @Override // xsna.ub30
        public final boolean d(long j, zbi0 zbi0Var) {
            j1z j1zVar;
            gho0 gho0Var = gho0.this;
            if (!gho0Var.m() || gho0Var.p().a.c.length() == 0 || (j1zVar = gho0Var.d) == null || j1zVar.d() == null) {
                return false;
            }
            f(gho0Var.p(), j, false, zbi0Var);
            return true;
        }

        @Override // xsna.ub30
        public final boolean e(long j) {
            j1z j1zVar;
            gho0 gho0Var = gho0.this;
            if (!gho0Var.m() || gho0Var.p().a.c.length() == 0 || (j1zVar = gho0Var.d) == null || j1zVar.d() == null) {
                return false;
            }
            f(gho0Var.p(), j, false, zbi0.a.a);
            return true;
        }

        public final long f(tho0 tho0Var, long j, boolean z, zbi0 zbi0Var) {
            gho0 gho0Var = gho0.this;
            long e = gho0.e(gho0Var, tho0Var, j, z, false, zbi0Var, false, null);
            if (!qko0.a(e, this.b)) {
                this.a = false;
            }
            gho0Var.s(qko0.c(e) ? HandleState.Cursor : HandleState.Selection);
            return e;
        }
    }

    public gho0() {
        this(null);
    }

    public static final Pair a(gho0 gho0Var) {
        String str;
        qko0 qko0Var;
        us2 o = gho0Var.o();
        if (o == null || (str = o.c) == null || (qko0Var = gho0Var.x) == null) {
            return null;
        }
        long j = qko0Var.a;
        return new Pair(str, new qko0(jgz.c(gho0Var.b.b((int) (j >> 32)), gho0Var.b.b((int) (j & 4294967295L)))));
    }

    public static final void b(gho0 gho0Var, qko0 qko0Var) {
        us2 o;
        String str;
        yvj yvjVar;
        if (qko0Var == null) {
            return;
        }
        long j = qko0Var.a;
        aua0 aua0Var = gho0Var.j;
        if (aua0Var == null || (o = gho0Var.o()) == null || (str = o.c) == null) {
            return;
        }
        uv70 uv70Var = gho0Var.b;
        long c = jgz.c(uv70Var.b((int) (j >> 32)), uv70Var.b((int) (j & 4294967295L)));
        if (str.length() <= 0 || qko0.c(c) || (yvjVar = gho0Var.i) == null) {
            return;
        }
        myc0.h(yvjVar, null, null, new fho0(aua0Var, str, c, qko0Var, gho0Var, uv70Var, null), 3);
    }

    public static final void c(gho0 gho0Var, ov70 ov70Var) {
        ((zak0) gho0Var.t).setValue(ov70Var);
    }

    public static final void d(gho0 gho0Var, Handle handle) {
        ((zak0) gho0Var.s).setValue(handle);
    }

    public static final long e(gho0 gho0Var, tho0 tho0Var, long j, boolean z, boolean z2, zbi0 zbi0Var, boolean z3, xtu xtuVar) {
        mjo0 d;
        long j2;
        long j3;
        obi0 obi0Var;
        boolean z4;
        boolean z5;
        vtu vtuVar;
        int i;
        j1z j1zVar = gho0Var.d;
        if (j1zVar == null || (d = j1zVar.d()) == null) {
            return qko0.b;
        }
        uv70 uv70Var = gho0Var.b;
        long j4 = tho0Var.b;
        us2 us2Var = tho0Var.a;
        int i2 = qko0.c;
        long c = jgz.c(uv70Var.b((int) (j4 >> 32)), gho0Var.b.b((int) (j4 & 4294967295L)));
        int b2 = d.b(j, false);
        int i3 = (z2 || z) ? b2 : (int) (c >> 32);
        int i4 = (!z2 || z) ? b2 : (int) (c & 4294967295L);
        yvj0 yvj0Var = gho0Var.w;
        int i5 = (z || yvj0Var == null || (i = gho0Var.u) == -1) ? -1 : i;
        ljo0 ljo0Var = d.a;
        if (z) {
            j3 = j4;
            j2 = 4294967295L;
            obi0Var = null;
        } else {
            j2 = 4294967295L;
            int i6 = (int) (c >> 32);
            j3 = j4;
            obi0.a aVar = new obi0.a(a020.s(ljo0Var, i6), i6, 1L);
            int i7 = (int) (c & 4294967295L);
            obi0Var = new obi0(aVar, new obi0.a(a020.s(ljo0Var, i7), i7, 1L), qko0.g(c));
        }
        yvj0 yvj0Var2 = new yvj0(z2, 1, 1, obi0Var, new jai0(1L, 1, i3, i4, i5, ljo0Var));
        if (!yvj0Var2.e(yvj0Var)) {
            return j3;
        }
        gho0Var.w = yvj0Var2;
        gho0Var.u = b2;
        obi0 a2 = zbi0Var.a(yvj0Var2);
        long c2 = jgz.c(gho0Var.b.a(a2.a.b), gho0Var.b.a(a2.b.b));
        long j5 = j3;
        if (qko0.b(c2, j5)) {
            return j5;
        }
        boolean z6 = qko0.g(c2) != qko0.g(j5) && qko0.b(jgz.c((int) (c2 & j2), (int) (c2 >> 32)), j5);
        boolean z7 = qko0.c(c2) && qko0.c(j5);
        if (z3 && us2Var.c.length() > 0 && !z6 && !z7 && xtuVar != null && (vtuVar = gho0Var.l) != null) {
            vtuVar.a(xtuVar.a);
        }
        gho0Var.c.invoke(g(us2Var, c2));
        gho0Var.x = new qko0(c2);
        if (!z3) {
            gho0Var.v(!qko0.c(c2));
        }
        j1z j1zVar2 = gho0Var.d;
        if (j1zVar2 != null) {
            ((zak0) j1zVar2.q).setValue(Boolean.valueOf(z3));
        }
        j1z j1zVar3 = gho0Var.d;
        if (j1zVar3 != null) {
            ((zak0) j1zVar3.m).setValue(Boolean.valueOf(!qko0.c(c2) && pho0.a(gho0Var, true)));
        }
        j1z j1zVar4 = gho0Var.d;
        if (j1zVar4 != null) {
            if (qko0.c(c2)) {
                z4 = false;
            } else {
                z4 = false;
                if (pho0.a(gho0Var, false)) {
                    z5 = true;
                    ((zak0) j1zVar4.n).setValue(Boolean.valueOf(z5));
                }
            }
            z5 = z4;
            ((zak0) j1zVar4.n).setValue(Boolean.valueOf(z5));
        } else {
            z4 = false;
        }
        j1z j1zVar5 = gho0Var.d;
        if (j1zVar5 != null) {
            ((zak0) j1zVar5.o).setValue(Boolean.valueOf((qko0.c(c2) && pho0.a(gho0Var, true)) ? true : z4));
        }
        return c2;
    }

    public static tho0 g(us2 us2Var, long j) {
        return new tho0(us2Var, j, 4);
    }

    public final yok0 f(boolean z) {
        yvj yvjVar = this.i;
        if (yvjVar != null) {
            return myc0.h(yvjVar, null, CoroutineStart.UNDISPATCHED, new bho0(this, z, null), 1);
        }
        return null;
    }

    public final void h() {
        yvj yvjVar = this.i;
        if (yvjVar != null) {
            myc0.h(yvjVar, null, CoroutineStart.UNDISPATCHED, new dho0(this, null), 1);
        }
    }

    public final void i(ov70 ov70Var) {
        if (!qko0.c(p().b)) {
            j1z j1zVar = this.d;
            mjo0 d = j1zVar != null ? j1zVar.d() : null;
            int e = (ov70Var == null || d == null) ? qko0.e(p().b) : this.b.a(d.b(ov70Var.a, true));
            tho0 b2 = tho0.b(p(), null, jgz.c(e, e), 5);
            this.c.invoke(b2);
            this.x = new qko0(b2.b);
        }
        s((ov70Var == null || p().a.c.length() <= 0) ? HandleState.None : HandleState.Cursor);
        v(false);
    }

    public final void j(boolean z) {
        rwr rwrVar;
        j1z j1zVar = this.d;
        if (j1zVar != null && !j1zVar.b() && (rwrVar = this.m) != null) {
            rwr.b(rwrVar);
        }
        this.v = p();
        v(z);
        s(HandleState.Selection);
    }

    public final ov70 k() {
        return (ov70) ((zak0) this.t).getValue();
    }

    public final boolean l() {
        return ((Boolean) ((zak0) this.n).getValue()).booleanValue();
    }

    public final boolean m() {
        return ((Boolean) ((zak0) this.o).getValue()).booleanValue();
    }

    public final long n(boolean z) {
        mjo0 d;
        ljo0 ljo0Var;
        us2 o;
        long j;
        j1z j1zVar = this.d;
        if (j1zVar == null || (d = j1zVar.d()) == null || (ljo0Var = d.a) == null || (o = o()) == null) {
            return 9205357640488583168L;
        }
        if (!epx.f(o.c, ljo0Var.a.a.c)) {
            return 9205357640488583168L;
        }
        tho0 p = p();
        if (z) {
            long j2 = p.b;
            int i = qko0.c;
            j = j2 >> 32;
        } else {
            long j3 = p.b;
            int i2 = qko0.c;
            j = j3 & 4294967295L;
        }
        return cvk.m(ljo0Var, this.b.b((int) j), z, qko0.g(p().b));
    }

    public final us2 o() {
        sdo0 sdo0Var;
        j1z j1zVar = this.d;
        if (j1zVar == null || (sdo0Var = j1zVar.a) == null) {
            return null;
        }
        return sdo0Var.a;
    }

    public final tho0 p() {
        return (tho0) ((zak0) this.e).getValue();
    }

    public final void q() {
        yok0 yok0Var;
        ndo0 ndo0Var = (ndo0) this.z.b;
        if (ndo0Var == null || (yok0Var = ndo0Var.v) == null) {
            return;
        }
        yok0Var.b(null);
        ndo0Var.v = null;
    }

    public final void r() {
        yvj yvjVar = this.i;
        if (yvjVar != null) {
            myc0.h(yvjVar, null, CoroutineStart.UNDISPATCHED, new hho0(this, null), 1);
        }
    }

    public final void s(HandleState handleState) {
        j1z j1zVar = this.d;
        if (j1zVar != null) {
            if (j1zVar.a() == handleState) {
                j1zVar = null;
            }
            if (j1zVar != null) {
                ((zak0) j1zVar.k).setValue(handleState);
            }
        }
    }

    public final void t() {
        j1z j1zVar;
        dak0 a2 = dak0.a.a();
        izs<Object, s3q0> e = a2 != null ? a2.e() : null;
        dak0 b2 = dak0.a.b(a2);
        try {
            if (m() && ((j1zVar = this.d) == null || ((Boolean) ((zak0) j1zVar.q).getValue()).booleanValue())) {
                s3q0 s3q0Var = s3q0.a;
                dak0.a.d(a2, b2, e);
                this.z.c();
            }
        } finally {
            dak0.a.d(a2, b2, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(ContinuationImpl continuationImpl) {
        iho0 iho0Var;
        int i;
        gho0 gho0Var;
        if (continuationImpl instanceof iho0) {
            iho0Var = (iho0) continuationImpl;
            int i2 = iho0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iho0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = iho0Var.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = iho0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    wfd wfdVar = this.h;
                    if (wfdVar != null) {
                        iho0Var.L$0 = this;
                        iho0Var.label = 1;
                        ClipDescription primaryClipDescription = wfdVar.b().getPrimaryClipDescription();
                        obj = Boolean.valueOf(primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*"));
                        if (obj == obj2) {
                            return obj2;
                        }
                        gho0Var = this;
                    }
                    return s3q0.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gho0Var = (gho0) iho0Var.L$0;
                kotlin.a.a(obj);
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((zak0) gho0Var.y).setValue(bool);
                return s3q0.a;
            }
        }
        iho0Var = new iho0(this, continuationImpl);
        Object obj3 = iho0Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = iho0Var.label;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj3;
        bool2.getClass();
        ((zak0) gho0Var.y).setValue(bool2);
        return s3q0.a;
    }

    public final void v(boolean z) {
        j1z j1zVar = this.d;
        if (j1zVar != null) {
            ((zak0) j1zVar.l).setValue(Boolean.valueOf(z));
        }
        if (z) {
            t();
        } else {
            q();
        }
    }

    public gho0(c3q0 c3q0Var) {
        this.a = c3q0Var;
        this.b = yir0.a;
        this.c = new wql0(5);
        this.e = androidx.compose.runtime.k.b(new tho0((String) null, 0L, 7));
        this.f = b6u0.a.a;
        Boolean bool = Boolean.TRUE;
        this.n = androidx.compose.runtime.k.b(bool);
        this.o = androidx.compose.runtime.k.b(bool);
        this.p = 0L;
        this.r = 0L;
        this.s = androidx.compose.runtime.k.b(null);
        this.t = androidx.compose.runtime.k.b(null);
        this.u = -1;
        this.v = new tho0((String) null, 0L, 7);
        this.y = androidx.compose.runtime.k.b(Boolean.FALSE);
        this.z = new pwi(2);
        this.A = new b();
        this.B = new a();
    }

    /* compiled from: TextFieldSelectionManager.kt */
    public static final class b implements zdo0 {
        public qko0 b;
        public boolean a = true;
        public zbi0 c = zbi0.a.a;

        public b() {
        }

        @Override // xsna.zdo0
        public final void c(long j, zbi0 zbi0Var) {
            long j2;
            mjo0 d;
            mjo0 d2;
            gho0 gho0Var = gho0.this;
            wh50 wh50Var = gho0Var.s;
            if (gho0Var.m() && ((Handle) ((zak0) wh50Var).getValue()) == null) {
                ((zak0) wh50Var).setValue(Handle.SelectionEnd);
                gho0Var.u = -1;
                this.a = true;
                this.c = zbi0Var;
                gho0Var.q();
                j1z j1zVar = gho0Var.d;
                if (j1zVar == null || (d2 = j1zVar.d()) == null || !d2.c(j)) {
                    j2 = j;
                    j1z j1zVar2 = gho0Var.d;
                    if (j1zVar2 != null && (d = j1zVar2.d()) != null) {
                        int a = gho0Var.b.a(d.b(j2, true));
                        tho0 g = gho0.g(gho0Var.p().a, jgz.c(a, a));
                        gho0Var.j(false);
                        vtu vtuVar = gho0Var.l;
                        if (vtuVar != null) {
                            vtuVar.a(0);
                        }
                        gho0Var.c.invoke(g);
                        gho0Var.x = new qko0(g.b);
                    }
                    this.a = false;
                } else {
                    if (gho0Var.p().a.c.length() == 0) {
                        return;
                    }
                    gho0Var.j(false);
                    long e = gho0.e(gho0Var, tho0.b(gho0Var.p(), null, qko0.b, 5), j, true, false, this.c, true, new xtu(0));
                    j2 = j;
                    gho0Var.q = new qko0(e);
                    this.b = new qko0(e);
                }
                gho0Var.s(HandleState.None);
                gho0Var.p = j2;
                ((zak0) gho0Var.t).setValue(new ov70(j2));
                gho0Var.r = 0L;
            }
        }

        @Override // xsna.zdo0
        public final void d(long j) {
            mjo0 d;
            long e;
            gho0 gho0Var = gho0.this;
            if (!gho0Var.m() || gho0Var.p().a.c.length() == 0) {
                return;
            }
            gho0Var.r = ov70.f(gho0Var.r, j);
            j1z j1zVar = gho0Var.d;
            if (j1zVar != null && (d = j1zVar.d()) != null) {
                ((zak0) gho0Var.t).setValue(new ov70(ov70.f(gho0Var.p, gho0Var.r)));
                if (gho0Var.q != null || d.c(gho0Var.k().a)) {
                    qko0 qko0Var = gho0Var.q;
                    int b = qko0Var != null ? (int) (qko0Var.a >> 32) : d.b(gho0Var.p, false);
                    int b2 = d.b(gho0Var.k().a, false);
                    if (gho0Var.q == null && b == b2) {
                        return;
                    } else {
                        e = gho0.e(gho0Var, gho0Var.p(), gho0Var.k().a, false, false, this.c, true, new xtu(9));
                    }
                } else {
                    e = gho0.e(gho0Var, gho0Var.p(), gho0Var.k().a, false, false, gho0Var.b.a(d.b(gho0Var.p, true)) == gho0Var.b.a(d.b(gho0Var.k().a, true)) ? zbi0.a.a : zbi0.a.b, true, new xtu(9));
                }
                this.b = new qko0(e);
                if (!qko0.a(e, gho0Var.q)) {
                    this.a = false;
                }
            }
            gho0Var.v(false);
        }

        public final void e() {
            gho0 gho0Var = gho0.this;
            ((zak0) gho0Var.s).setValue(null);
            ((zak0) gho0Var.t).setValue(null);
            this.c = zbi0.a.a;
            gho0Var.v(true);
            qko0 qko0Var = this.b;
            boolean c = qko0.c(qko0Var != null ? qko0Var.a : gho0Var.p().b);
            gho0Var.s(c ? HandleState.Cursor : HandleState.Selection);
            j1z j1zVar = gho0Var.d;
            if (j1zVar != null) {
                ((zak0) j1zVar.m).setValue(Boolean.valueOf(!c && pho0.a(gho0Var, true)));
            }
            j1z j1zVar2 = gho0Var.d;
            if (j1zVar2 != null) {
                ((zak0) j1zVar2.n).setValue(Boolean.valueOf(!c && pho0.a(gho0Var, false)));
            }
            j1z j1zVar3 = gho0Var.d;
            if (j1zVar3 != null) {
                ((zak0) j1zVar3.o).setValue(Boolean.valueOf(c && pho0.a(gho0Var, true)));
            }
            if (this.a) {
                gho0.b(gho0Var, gho0Var.q);
            }
            gho0Var.q = null;
        }

        @Override // xsna.zdo0
        public final void onCancel() {
            e();
        }

        @Override // xsna.zdo0
        public final void onStop() {
            e();
        }

        @Override // xsna.zdo0
        public final void a() {
        }

        @Override // xsna.zdo0
        public final void b() {
        }
    }
}
