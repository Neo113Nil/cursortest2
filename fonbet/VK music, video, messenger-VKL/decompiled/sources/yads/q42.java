package yads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.c5g;
import xsna.epx;

/* loaded from: classes10.dex */
public abstract class q42 {
    public final nj A;
    public final k93 B;
    public final b92 C;
    public final t20 D;
    public final v02 E;
    public final String F;
    public final ux1 G;
    public final e93 H;
    public final x3 I;
    public final gv J;
    public final vi K;
    public m22 L;
    public final n42 M;
    public final List N;
    public final e52 O;
    public final Context a;
    public final g02 b;
    public final l82 c;
    public final k62 d;
    public final n82 e;
    public final ov2 f;
    public final y02 g;
    public final d4 h;
    public final v9 i;
    public final e22 j;
    public final qz2 k;
    public final i42 l;
    public final i10 m;
    public final t63 n;
    public final a61 o;
    public final oq p;
    public final o22 q;
    public final bp1 r;
    public final cj s;
    public final f61 t;
    public final ko2 u;
    public final bq v;
    public final xp0 w;
    public final iz1 x;
    public final ln2 y;
    public final yp0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ q42(Context context, up upVar, g02 g02Var) {
        this(context, g02Var, r7, r8, r9, r2, r7, r11, r9, r13, r4, r5, r20, r6, r21, r14, r15, r22, r23, r20, r25, r22, r23, r24, r25, r0, r7, r0, new f52(r0), new f61(context, r5, r4, r2, r9.c()), new ko2(r6), new bq(r15, r16, r5, r18, ((mv3) r2).a()), new xp0(context, r2, r15, r16, r5, r18), new iz1(context, r2, r15, r16, r18), new ln2(context, r2, r15, r16, r5, r18), new yp0(r6), new nj(r6), new f5(new f12(r18)), new k93(), new b92(r4, r5, r6), new t20(context, r4, r2, r9 != null ? r9.a() : null));
        l82 h = upVar.h();
        k62 g = upVar.g();
        n82 i = upVar.i();
        sz1 d = upVar.d();
        ov2 j = upVar.j();
        y02 e = upVar.e();
        g42 c = upVar.c();
        u22 b = upVar.b();
        gz1 f = upVar.f();
        va a = upVar.a();
        d4 a2 = d.a();
        e00 a3 = a2.a();
        v9 b2 = d.b();
        e22 c2 = d.c();
        List b3 = i.b();
        String a4 = i.a();
        qz2 b4 = c2.b();
        i42 i42Var = new i42();
        i10 i10Var = new i10(i42Var);
        t63 t63Var = new t63();
        a61 a61Var = new a61();
        ha2 ha2Var = new ha2();
        xd2 a5 = xd2.h.a(context);
        lo2 lo2Var = new lo2();
        oq oqVar = new oq();
        d61 d61Var = new d61();
        o5 a6 = e.a();
        o22 a7 = n22.a();
        bp1 bp1Var = new bp1(context, a2, j);
        e9 e9Var = new e9(new x22(g), b);
        cj cjVar = new cj(b3);
    }

    public final e22 b() {
        return this.j;
    }

    public final e52 c() {
        return this.O;
    }

    public final List d() {
        return this.N;
    }

    public final void destroy() {
        m22 m22Var = this.L;
        if (m22Var != null) {
            for (pi piVar : m22Var.d.values()) {
                if (piVar != null) {
                    piVar.destroy();
                }
            }
        }
    }

    public final k62 e() {
        return this.d;
    }

    public final void f() {
        h();
        k93 k93Var = this.B;
        Context context = this.a;
        l93 l93Var = k93Var.d;
        if (l93Var != null) {
            ((z0) l93Var.b).b(context, l93Var);
        }
        k93Var.d = null;
        v22 v22Var = k93Var.e;
        if (v22Var != null) {
            v22Var.b();
        }
        k93Var.e = null;
        m22 m22Var = this.L;
        if (m22Var != null) {
            this.c.a(m22Var);
            this.H.a(m22Var);
            this.A.b = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r0.isAttachedToWindow() == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        m22 m22Var = this.L;
        boolean z = (m22Var == null || (r0 = m22Var.b()) == null) ? false : true;
        if (z) {
            this.H.a(this.a, this.M, this.L);
        }
    }

    public final void h() {
        this.H.a(this.M);
    }

    public abstract void loadImages();

    public final void a(View view, nj2 nj2Var, a32 a32Var) {
        q42 q42Var;
        o22 o22Var = this.q;
        o22Var.getClass();
        synchronized (o22.b) {
            q42Var = (q42) o22Var.a.get(view);
        }
        if (equals(q42Var)) {
            return;
        }
        if (q42Var != null) {
            q42Var.f();
        }
        a(this, this.q);
        this.q.a(view, this);
        a(new m22(a32Var, this.h, this.f, nj2Var, this.o, this.g, this.s, this.O, this.l, this.i, this.e, this.b, this.r, this.k, this.D, yf0.b));
        a(view);
    }

    public final void b(m22 m22Var) {
        this.c.a(m22Var, this.J);
        boolean z = epx.f(this.i.b(), s42.c.a()) || epx.f(this.i.b(), s42.d.a());
        if (this.C.a() && !z) {
            loadImages();
        }
        List list = this.u.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            pi a = m22Var.a((oi) obj);
            if (a != null && a.b()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((oi) it.next()).a);
        }
        this.x.a(arrayList2, dp2.y);
        g();
    }

    public final void a(m22 m22Var) {
        m22Var.a();
        this.y.a();
        this.p.getClass();
        Map map = m22Var.d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            pi piVar = (pi) entry.getValue();
            if (piVar != null && piVar.b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        this.x.a(arrayList, dp2.x);
        List list = this.z.a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!((oi) obj).f) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            pi a = m22Var.a((oi) next);
            if (a == null || !a.b()) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((oi) it3.next()).a);
        }
        if (!arrayList4.isEmpty()) {
            xp0 xp0Var = this.w;
            gp2 a2 = xp0Var.b.a();
            a2.b("no_view_for_asset", "reason");
            a2.b(arrayList4, "assets");
            Map map2 = xp0Var.a.u;
            if (map2 != null) {
                a2.a.putAll(map2);
            }
            c cVar = xp0Var.a.i;
            a2.b = cVar;
            xp0Var.c.a(new fp2(dp2.B.a(), new LinkedHashMap(a2.a), cVar));
        }
        this.L = m22Var;
        this.A.a(m22Var);
        ((l22) this.d).a(m22Var);
        lq2 b = ((l22) this.d).b();
        if (b.a()) {
            this.c.a(m22Var);
            b(m22Var);
            return;
        }
        String b2 = b.b();
        this.v.a(b2);
        throw new k12(String.format("Resource for required view " + b2 + " is not present", Arrays.copyOf(new Object[0], 0)));
    }

    public q42(Context context, g02 g02Var, l82 l82Var, k62 k62Var, n82 n82Var, ov2 ov2Var, y02 y02Var, g42 g42Var, gz1 gz1Var, va vaVar, d4 d4Var, v9 v9Var, e22 e22Var, List list, qz2 qz2Var, i42 i42Var, i10 i10Var, t63 t63Var, a61 a61Var, ha2 ha2Var, xd2 xd2Var, lo2 lo2Var, oq oqVar, d61 d61Var, o22 o22Var, bp1 bp1Var, e9 e9Var, cj cjVar, f52 f52Var, f61 f61Var, ko2 ko2Var, bq bqVar, xp0 xp0Var, iz1 iz1Var, ln2 ln2Var, yp0 yp0Var, nj njVar, f5 f5Var, k93 k93Var, b92 b92Var, t20 t20Var) {
        this.a = context;
        this.b = g02Var;
        this.c = l82Var;
        this.d = k62Var;
        this.e = n82Var;
        this.f = ov2Var;
        this.g = y02Var;
        this.h = d4Var;
        this.i = v9Var;
        this.j = e22Var;
        this.k = qz2Var;
        this.l = i42Var;
        this.m = i10Var;
        this.n = t63Var;
        this.o = a61Var;
        this.p = oqVar;
        this.q = o22Var;
        this.r = bp1Var;
        this.s = cjVar;
        this.t = f61Var;
        this.u = ko2Var;
        this.v = bqVar;
        this.w = xp0Var;
        this.x = iz1Var;
        this.y = ln2Var;
        this.z = yp0Var;
        this.A = njVar;
        this.B = k93Var;
        this.C = b92Var;
        this.D = t20Var;
        v02 a = y02Var.b().a(context, d4Var, v9Var);
        this.E = a;
        String a2 = tb.a(this);
        this.F = a2;
        this.M = new n42(this);
        o42 o42Var = new o42(this);
        this.N = e22Var.a();
        this.O = f52Var.a();
        d61Var.getClass();
        c61 a3 = d61.a(context, a, f61Var, f5Var, a61Var);
        List e = n82Var.e();
        a3.a(e, n82Var.c());
        x3 x3Var = new x3(context, ov2Var, v9Var, d4Var, a, t63Var);
        this.I = x3Var;
        this.J = new gv(x3Var, lo2Var, a61Var);
        ux1 a4 = ha2Var.a(context, d4Var, ov2Var, f61Var, o42Var, a2, vaVar);
        this.G = a4;
        g42Var.a(a61Var);
        a61Var.a(new fa2(a4));
        e93 a5 = y02Var.d().a(a4, new jo2(context, e9Var, v9Var, d4Var, ov2Var, vaVar, f5Var, a61Var, lo2Var, n82Var.d()), new o61(k62Var, e), xd2Var);
        this.H = a5;
        a5.a(a61Var);
        a5.a(v9Var, e);
        this.K = new vi(list, x3Var, lo2Var, a61Var, gz1Var != null ? gz1Var.a() : null);
    }

    public void a(z00 z00Var) {
        this.E.a.b = z00Var;
    }

    public final void a(j32 j32Var) {
        this.I.g.e = j32Var;
        this.t.h = j32Var;
        f1 f1Var = this.E.b;
        f1Var.g = j32Var;
        f1Var.f.b.k = j32Var;
        this.H.a(new n52(j32Var, this.A));
        this.v.c.e = j32Var;
        this.w.b.e = j32Var;
        this.x.b.e = j32Var;
        this.y.c.e = j32Var;
    }

    public final void a(View view) {
        z0 z0Var;
        k93 k93Var = this.B;
        p42 p42Var = new p42(this);
        k93Var.getClass();
        Context context = view.getContext();
        l93 l93Var = k93Var.d;
        if (l93Var != null) {
            ((z0) l93Var.b).b(context, l93Var);
        }
        Activity activity = null;
        k93Var.d = null;
        v22 v22Var = k93Var.e;
        if (v22Var != null) {
            v22Var.b();
        }
        k93Var.e = null;
        a1 a1Var = k93Var.a;
        Context context2 = view.getContext();
        a1Var.getClass();
        int i = 0;
        while (true) {
            if (!(context2 instanceof ContextWrapper)) {
                break;
            }
            int i2 = i + 1;
            if (i >= 10) {
                break;
            }
            if (context2 instanceof Activity) {
                activity = (Activity) context2;
                break;
            } else {
                context2 = ((ContextWrapper) context2).getBaseContext();
                i = i2;
            }
        }
        if (activity != null) {
            k93Var.c.getClass();
            z0 z0Var2 = z0.g;
            if (z0Var2 == null) {
                synchronized (z0.f) {
                    z0Var = z0.g;
                    if (z0Var == null) {
                        z0Var = new z0();
                        z0.g = z0Var;
                    }
                }
                z0Var2 = z0Var;
            }
            l93 l93Var2 = new l93(activity, p42Var, z0Var2);
            k93Var.d = l93Var2;
            z0Var2.a(activity, l93Var2);
        }
        k93Var.b.getClass();
        v22 v22Var2 = new v22(view, p42Var, new q22());
        k93Var.e = v22Var2;
        v22Var2.a();
    }

    public static void a(q42 q42Var, o22 o22Var) {
        boolean z;
        o22Var.getClass();
        synchronized (o22.b) {
            Iterator it = o22Var.a.entrySet().iterator();
            z = false;
            while (it.hasNext()) {
                if (((q42) ((Map.Entry) it.next()).getValue()) == q42Var) {
                    it.remove();
                    z = true;
                }
            }
        }
        if (z) {
            q42Var.f();
        }
    }

    public final void a(View view, nj2 nj2Var, a32 a32Var, pu puVar) {
        q42 q42Var;
        o22 a = n22.a();
        synchronized (o22.b) {
            q42Var = (q42) a.a.get(view);
        }
        if (equals(q42Var)) {
            return;
        }
        if (q42Var != null) {
            q42Var.f();
        }
        a(this, a);
        a.a(view, this);
        m22 m22Var = new m22(a32Var, this.h, this.f, nj2Var, this.o, this.g, this.s, this.O, this.l, this.i, this.e, this.b, this.r, this.k, this.D, puVar.a);
        m22Var.a();
        this.L = m22Var;
        this.A.b = m22Var;
        ((l22) this.d).a(m22Var);
        this.c.a(m22Var);
        vi viVar = this.K;
        puVar.b = new ui(viVar.a, viVar.b, m22Var, viVar.c, viVar.d, viVar.e);
        b(m22Var);
        a(view);
    }
}
