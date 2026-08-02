package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.a;
import yads.eb2;
import yads.f5;
import yads.f92;
import yads.im2;
import yads.j5;
import yads.jk3;
import yads.kc1;
import yads.mm;
import yads.nm;
import yads.qm;
import yads.x3;
import yads.yo;
import yads.za2;
import yads.zp1;

/* loaded from: classes7.dex */
public abstract class dj81 implements c071, ln61, g291 {
    public final cr71 A;
    public final fh71 B;
    public final c271 C;
    public final n191 D;
    public final m481 E;
    public final yc81 F;
    public final eb2 G;
    public final mj31 H;
    public final io61 I;
    public j5 J;
    public boolean K;
    public long L;
    public mj31 M;
    public d881 N;
    public final bq71 O;
    public final Context a;
    public final e971 b;
    public final fe81 c;
    public final ike w;
    public final j181 x;
    public final cp71 y;
    public final fw81 z;

    public dj81(Context context, e971 e971Var, fe81 fe81Var, v981 v981Var, ike ikeVar, io61 io61Var) {
        j181 j181Var = new j181(context, fe81Var, v981Var);
        cp71 cp71Var = new cp71();
        fw81 fw81Var = new fw81();
        cr71 cr71Var = new cr71(context, fe81Var);
        fh71 fh71Var = new fh71(context, v981Var, ikeVar, e971Var, null, null, 4194288);
        c271 c271Var = new c271(fe81Var, v981Var);
        n191 n191Var = new n191(fe81Var, v981Var);
        if (m481.b == null) {
            synchronized (m481.c) {
                if (m481.b == null) {
                    m481.b = new m481();
                }
            }
        }
        m481 m481Var = m481.b;
        if (m481Var == null) {
            ny61.r("Required value was null.");
            throw null;
        }
        yc81 yc81Var = new yc81();
        eb2 a = eb2.h.a(context);
        mj31 mj31Var = new mj31(context, 18);
        this.a = context;
        this.b = e971Var;
        this.c = fe81Var;
        this.w = ikeVar;
        this.x = j181Var;
        this.y = cp71Var;
        this.z = fw81Var;
        this.A = cr71Var;
        this.B = fh71Var;
        this.C = c271Var;
        this.D = n191Var;
        this.E = m481Var;
        this.F = yc81Var;
        this.G = a;
        this.H = mj31Var;
        this.I = io61Var;
        this.J = j5.c;
        this.O = new bq71(e971Var, fe81Var, v981Var, j181Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(yo yoVar, ContinuationImpl continuationImpl) {
        nm nmVar;
        int i;
        f5 f5Var;
        e971 e971Var;
        if (continuationImpl instanceof nm) {
            nmVar = (nm) continuationImpl;
            int i2 = nmVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nmVar.f = i2 - Integer.MIN_VALUE;
                Object obj = nmVar.d;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nmVar.f;
                if (i != 0) {
                    b.b(obj);
                    f5 f5Var2 = f5.g;
                    e971 e971Var2 = this.b;
                    e971Var2.b(f5Var2, null);
                    qm qmVar = new qm(this, yoVar, null);
                    nmVar.b = e971Var2;
                    nmVar.c = f5Var2;
                    nmVar.f = 1;
                    if (bvf0.n(qmVar, nmVar) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    f5Var = f5Var2;
                    e971Var = e971Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f5Var = nmVar.c;
                    e971Var = nmVar.b;
                    b.b(obj);
                }
                e971Var.a(f5Var);
                return zy11.a;
            }
        }
        nmVar = new nm(this, continuationImpl);
        Object obj2 = nmVar.d;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nmVar.f;
        if (i != 0) {
        }
        e971Var.a(f5Var);
        return zy11.a;
    }

    public synchronized void b(dl61 dl61Var) {
        mj31 mj31Var = this.M;
        if (mj31Var != null) {
            ((xrr) mj31Var.c).c(dl61Var.b, dl61Var.c);
            ((Handler) mj31Var.b).post(new bo31(23, mj31Var, dl61Var));
        }
    }

    public final void c(a271 a271Var) {
        h571 h571Var = this.c.d;
        if (a271Var == null) {
            h571Var.getClass();
            qc71.c("Ad size can't be null or empty.", new Object[0]);
            return;
        }
        a271 a271Var2 = h571Var.a;
        if (a271Var2 == null || a271Var2.equals(a271Var)) {
            h571Var.a = a271Var;
        } else {
            qc71.c("Ad size can't be set twice.", new Object[0]);
        }
    }

    public final void d(re81 re81Var) {
        boolean z;
        synchronized (this) {
            z = this.K;
        }
        if (z) {
            return;
        }
        String h = re81Var.h(this.c);
        if (h == null || h.length() == 0) {
            h(so61.j);
            return;
        }
        this.b.b(f5.s, null);
        this.c.g = re81Var.a();
        fe81 fe81Var = this.c;
        yc81 yc81Var = this.F;
        Context context = this.a;
        yc81Var.getClass();
        fe81Var.n = context.getResources().getConfiguration().orientation;
        in71 a = this.I.a(h, re81Var.s(this.a, this.c, this.z), this);
        mj31 mj31Var = this.H;
        a.setTag((String) mj31Var.w);
        ys81 ys81Var = (ys81) mj31Var.c;
        Context context2 = (Context) mj31Var.b;
        synchronized (ys81Var) {
            hba1.b(context2).b(a);
        }
    }

    public final synchronized void e(j5 j5Var) {
        Objects.toString(j5Var);
        this.J = j5Var;
    }

    public synchronized boolean f(nl61 nl61Var) {
        boolean z;
        try {
            d881 d881Var = this.N;
            z = true;
            if (this.J != j5.f) {
                if (d881Var != null) {
                    if (this.L > 0) {
                        if (SystemClock.elapsedRealtime() - this.L <= d881Var.E) {
                            if (nl61Var != null) {
                                if (nl61Var.equals(this.c.e)) {
                                }
                            }
                            int i = this.a.getResources().getConfiguration().orientation;
                            if ((i != 1 ? i != 2 ? f92.e : f92.c : f92.d).b == this.c.n) {
                                z = false;
                            }
                        }
                    }
                }
            }
        } finally {
        }
        return z;
    }

    public synchronized void g() {
        if (!a()) {
            this.K = true;
            getClass().toString();
            this.G.b(this);
            a.g(this.B.c.getCoroutineContext(), null);
            mj31 mj31Var = this.H;
            Object obj = mj31Var.c;
            ys81.a((String) mj31Var.w);
            this.E.a(kc1.b, this);
            this.N = null;
            this.x.a();
            bvf0.j(this.w, null);
            getClass().toString();
        }
    }

    public void h(dl61 dl61Var) {
        String str;
        qc71.c(dl61Var.c, new Object[0]);
        e(j5.f);
        im2 im2Var = im2.d;
        zp1 zp1Var = this.c.k;
        if (zp1Var == null || (str = zp1Var.b) == null) {
            str = g771.a;
        }
        cf71 cf71Var = new cf71(23, im2Var, str);
        f5 f5Var = f5.c;
        e971 e971Var = this.b;
        e971Var.c(f5Var, cf71Var, null);
        e971Var.a(f5.e);
        this.E.a(kc1.b, this);
        b(dl61Var);
    }

    public synchronized void i(nl61 nl61Var) {
        try {
            Objects.toString(this.J);
            if (this.J != j5.d) {
                if (f(nl61Var)) {
                    e971 e971Var = this.b;
                    synchronized (e971Var.a) {
                        e971Var.c.clear();
                        e971Var.d.clear();
                    }
                    this.b.b(f5.e, null);
                    this.E.b(kc1.b, this);
                    k(nl61Var);
                } else {
                    l();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.wf81
    public final void j(jk3 jk3Var) {
        if (jk3Var instanceof x3) {
            h(l8a1.b(this.c, ((x3) jk3Var).c));
        }
    }

    public final synchronized void k(nl61 nl61Var) {
        try {
            e(j5.d);
            this.c.e = nl61Var;
            dl61 o = o();
            if (o == null) {
                tje.N(this.w, null, null, new mm(this, null), 3);
            } else {
                h(o);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void l() {
        m();
    }

    public synchronized void m() {
        mj31 mj31Var = this.M;
        if (mj31Var != null) {
            ((xrr) mj31Var.c).a();
            ((Handler) mj31Var.b).post(new z071(mj31Var, 0));
        }
    }

    public final void n() {
        String str;
        im2 im2Var = im2.c;
        zp1 zp1Var = this.c.k;
        if (zp1Var == null || (str = zp1Var.b) == null) {
            str = g771.a;
        }
        cf71 cf71Var = new cf71(23, im2Var, str);
        f5 f5Var = f5.c;
        e971 e971Var = this.b;
        e971Var.c(f5Var, cf71Var, null);
        e971Var.a(f5.e);
        this.E.a(kc1.b, this);
        e(j5.e);
        this.L = SystemClock.elapsedRealtime();
    }

    public dl61 o() {
        cr71 cr71Var = this.A;
        List e = cr71Var.e();
        fe81 fe81Var = (fe81) cr71Var.b;
        ArrayList m0 = kotlin.collections.a.m0(scc.h(fe81Var.d.a == null ? so61.m : null), e);
        String str = fe81Var.a.b;
        ArrayList arrayList = new ArrayList(tcc.n(m0, 10));
        Iterator it = m0.iterator();
        while (it.hasNext()) {
            arrayList.add(((dl61) it.next()).c);
        }
        if (!arrayList.isEmpty()) {
            qc71.a(String.format("Found following errors for %s ad type: %s", Arrays.copyOf(new Object[]{str, kotlin.collections.a.X(arrayList, "\n - ", "\n - ", null, null, 60)}, 2)), new Object[0]);
        }
        return (dl61) kotlin.collections.a.R(m0);
    }

    @Override // defpackage.ln61
    public final synchronized boolean a() {
        return this.K;
    }

    @Override // defpackage.c071
    public void a(za2 za2Var) {
        Objects.toString(za2Var);
    }
}
