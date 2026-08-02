package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.c5g;
import xsna.e43;
import xsna.iyx;
import xsna.j5g;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.yvj;
import xsna.zvj;

/* loaded from: classes10.dex */
public abstract class zn implements wd2, mu, oo, vp2 {
    public final Context a;
    public final w5 b;
    public final d4 c;
    public final ov2 d;
    public final yvj e;
    public final t8 f;
    public final Handler g;
    public final vb3 h;
    public final sy2 i;
    public final xg1 j;
    public final dw2 k;
    public final t01 l;
    public final gi2 m;
    public final r53 n;
    public final tq2 o;
    public final xd2 p;
    public final o4 q;
    public z5 r;
    public boolean s;
    public long t;
    public jm u;
    public v9 v;

    public /* synthetic */ zn(Context context, w5 w5Var, d4 d4Var, ov2 ov2Var, yvj yvjVar) {
        this(context, w5Var, d4Var, ov2Var, yvjVar, new t8(d4Var, ov2Var, context), new Handler(Looper.getMainLooper()), new sb(), new sy2(), new xg1(context, d4Var), new dw2(context, ov2Var, yvjVar, w5Var, null, null, 4194288), new t01(ov2Var, d4Var), new gi2(ov2Var, d4Var), q53.a(), new tq2(), xd2.h.a(context), new o4(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(zn znVar, vb3 vb3Var, spj spjVar) {
        rn rnVar;
        int i;
        uv2 uv2Var;
        znVar.getClass();
        if (spjVar instanceof rn) {
            rnVar = (rn) spjVar;
            int i2 = rnVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rnVar.f = i2 - Integer.MIN_VALUE;
                Object obj = rnVar.d;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rnVar.f;
                if (i != 0) {
                    kotlin.a.a(obj);
                    dw2 dw2Var = znVar.k;
                    t61 t61Var = t61.d;
                    rnVar.b = znVar;
                    rnVar.c = vb3Var;
                    rnVar.f = 1;
                    obj = dw2Var.a(t61Var, rnVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vb3Var = rnVar.c;
                    znVar = rnVar.b;
                    kotlin.a.a(obj);
                }
                uv2Var = (uv2) obj;
                if (!(uv2Var instanceof tv2)) {
                    d4 d4Var = znVar.c;
                    tv2 tv2Var = (tv2) uv2Var;
                    rd rdVar = tv2Var.a;
                    qx qxVar = d4Var.b;
                    qxVar.b = rdVar;
                    qxVar.a = tv2Var.b;
                    qu2 a = gx2.a().a(znVar.a);
                    hp hpVar = a != null ? a.d0 : null;
                    if (hpVar != null) {
                        znVar.b.a(v5.g, null);
                        myc0.h(znVar.e, null, null, new un(znVar, vb3Var, hpVar, null), 3);
                    } else {
                        synchronized (znVar) {
                            myc0.h(znVar.e, null, null, new qn(znVar, vb3Var, null), 3);
                        }
                    }
                } else if (uv2Var instanceof sv2) {
                    znVar.b(((sv2) uv2Var).a);
                }
                return s3q0.a;
            }
        }
        rnVar = new rn(znVar, spjVar);
        Object obj2 = rnVar.d;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rnVar.f;
        if (i != 0) {
        }
        uv2Var = (uv2) obj2;
        if (!(uv2Var instanceof tv2)) {
        }
        return s3q0.a;
    }

    public abstract pn a(String str, String str2);

    public synchronized void b(g9 g9Var) {
        try {
            Objects.toString(this.r);
            if (this.r != z5.d) {
                if (a(g9Var)) {
                    this.b.a();
                    this.b.b(v5.e);
                    this.n.b(le1.b, this);
                    c(g9Var);
                } else {
                    i();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void c() {
        if (!a()) {
            this.s = true;
            n();
            iyx.d(this.k.c.getCoroutineContext());
            o4 o4Var = this.q;
            yp2 yp2Var = o4Var.a;
            String str = o4Var.b;
            yp2Var.getClass();
            yp2.a(str);
            this.g.removeCallbacksAndMessages(null);
            this.n.a(le1.b, this);
            this.v = null;
            this.f.a();
            zvj.c(this.e, null);
            getClass().toString();
        }
    }

    public void d() {
        c();
        getClass().toString();
    }

    public final d4 e() {
        return this.c;
    }

    public final w5 f() {
        return this.b;
    }

    public final Context g() {
        return this.a;
    }

    public final ov2 h() {
        return this.d;
    }

    public void i() {
        j();
    }

    public synchronized void j() {
        jm jmVar = this.u;
        if (jmVar != null) {
            jmVar.b();
        }
    }

    public final void k() {
        String str;
        ep2 ep2Var = ep2.c;
        rr1 rr1Var = this.c.k;
        if (rr1Var == null || (str = rr1Var.b) == null) {
            str = cp2.a;
        }
        this.b.a(v5.c, new ac(ep2Var, str), null);
        this.b.a(v5.e);
        this.n.a(le1.b, this);
        a(z5.e);
        this.t = SystemClock.elapsedRealtime();
    }

    public void l() {
        p4.a(this.c.a.b);
        k();
        j();
    }

    public final void m() {
        getClass().toString();
        this.p.a(this);
    }

    public final void n() {
        getClass().toString();
        this.p.b(this);
    }

    public l4 o() {
        xg1 xg1Var = this.j;
        ArrayList u0 = j5g.u0(e43.m(xg1Var.b.d.a == null ? h9.m : null), xg1Var.a());
        String str = xg1Var.b.a.b;
        ArrayList arrayList = new ArrayList(c5g.u(u0, 10));
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            arrayList.add(((l4) it.next()).c);
        }
        p4.a(str, arrayList);
        return (l4) j5g.a0(u0);
    }

    public void b(l4 l4Var) {
        String str;
        oc1.c(l4Var.c, new Object[0]);
        a(z5.f);
        ep2 ep2Var = ep2.d;
        rr1 rr1Var = this.c.k;
        if (rr1Var == null || (str = rr1Var.b) == null) {
            str = cp2.a;
        }
        this.b.a(v5.c, new ac(ep2Var, str), null);
        this.b.a(v5.e);
        this.n.a(le1.b, this);
        a(l4Var);
    }

    public zn(Context context, w5 w5Var, d4 d4Var, ov2 ov2Var, yvj yvjVar, t8 t8Var, Handler handler, vb3 vb3Var, sy2 sy2Var, xg1 xg1Var, dw2 dw2Var, t01 t01Var, gi2 gi2Var, r53 r53Var, tq2 tq2Var, xd2 xd2Var, o4 o4Var) {
        this.a = context;
        this.b = w5Var;
        this.c = d4Var;
        this.d = ov2Var;
        this.e = yvjVar;
        this.f = t8Var;
        this.g = handler;
        this.h = vb3Var;
        this.i = sy2Var;
        this.j = xg1Var;
        this.k = dw2Var;
        this.l = t01Var;
        this.m = gi2Var;
        this.n = r53Var;
        this.o = tq2Var;
        this.p = xd2Var;
        this.q = o4Var;
        this.r = z5.c;
    }

    public final synchronized void c(g9 g9Var) {
        a(g9Var, this.h);
    }

    @Override // yads.vp2
    public final void b() {
        this.b.a(v5.r);
        this.b.a(v5.s, null);
    }

    public final synchronized void a(z5 z5Var) {
        Objects.toString(z5Var);
        this.r = z5Var;
    }

    @Override // yads.mu
    public final synchronized boolean a() {
        return this.s;
    }

    public synchronized boolean a(g9 g9Var) {
        boolean z;
        try {
            v9 v9Var = this.v;
            if (this.r != z5.f) {
                if (v9Var != null) {
                    if (this.t > 0) {
                        if (SystemClock.elapsedRealtime() - this.t <= v9Var.J) {
                            if (g9Var != null) {
                                if (g9Var.equals(this.c.e)) {
                                }
                            }
                            z = uz.b(this.a).b != this.c.n;
                        }
                    }
                }
            }
        } finally {
        }
        return z;
    }

    public synchronized void a(l4 l4Var) {
        jm jmVar = this.u;
        if (jmVar != null) {
            jmVar.a(l4Var);
        }
    }

    @Override // yads.uq2
    public final void a(mn3 mn3Var) {
        if (mn3Var instanceof h4) {
            b(n4.a(this.c, ((h4) mn3Var).c));
        }
    }

    @Override // yads.wd2
    public void a(sd2 sd2Var) {
        Objects.toString(sd2Var);
    }

    public final void a(e13 e13Var) {
        f13 f13Var = this.c.d;
        if (e13Var == null) {
            f13Var.getClass();
            oc1.c("Ad size can't be null or empty.", new Object[0]);
            return;
        }
        e13 e13Var2 = f13Var.a;
        if (e13Var2 != null && !e13Var2.equals(e13Var)) {
            oc1.c("Ad size can't be set twice.", new Object[0]);
        } else {
            f13Var.a = e13Var;
        }
    }

    public final synchronized void a(g9 g9Var, vb3 vb3Var) {
        try {
            a(z5.d);
            this.c.e = g9Var;
            l4 o = o();
            if (o == null) {
                myc0.h(this.e, null, null, new yn(this, vb3Var, null), 3);
            } else {
                b(o);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
