package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;
import yads.q91;
import yads.zp1;

/* loaded from: classes7.dex */
public final class cr71 implements wq71, sf81, cz71, ar81, id91, dma1, br91 {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public Object w;
    public Object x;

    public cr71(vi71 vi71Var, ArrayList arrayList) {
        int i;
        Integer num;
        this.a = 4;
        tx71 tx71Var = new tx71();
        Handler handler = new Handler(Looper.getMainLooper());
        pf81 pf81Var = new pf81();
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                Integer valueOf = Integer.valueOf(((qt81) it.next()).c);
                while (it.hasNext()) {
                    Integer valueOf2 = Integer.valueOf(((qt81) it.next()).c);
                    if (valueOf.compareTo(valueOf2) < 0) {
                        valueOf = valueOf2;
                    }
                }
                num = valueOf;
            } else {
                num = null;
            }
            if (num != null) {
                i = num.intValue();
                we6 we6Var = new we6(vi71Var, i, 15);
                this.b = tx71Var;
                this.c = handler;
                this.w = pf81Var;
                this.x = we6Var;
            }
        }
        i = 50;
        we6 we6Var2 = new we6(vi71Var, i, 15);
        this.b = tx71Var;
        this.c = handler;
        this.w = pf81Var;
        this.x = we6Var2;
    }

    @Override // defpackage.wq71
    public void a(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 10:
                ((xrr) this.c).a();
                cf71 cf71Var = (cf71) this.w;
                Context context = (Context) cf71Var.c;
                hn71 hn71Var = new hn71((cf71) cf71Var.b);
                context.getApplicationContext();
                new AtomicBoolean();
                new qm71();
                n581 n581Var = new n581();
                new AtomicBoolean(false);
                ((x371) obj).A = hn71Var;
                ((Handler) obj2).post(new fe71(11, this, n581Var));
                break;
            default:
                hj81 hj81Var = (hj81) obj;
                ((xrr) this.w).a();
                a441 a441Var = (a441) obj2;
                Context context2 = (Context) a441Var.c;
                gr81 gr81Var = (gr81) a441Var.b;
                context2.getApplicationContext();
                new AtomicBoolean();
                new qm71();
                o471 o471Var = new o471();
                new AtomicBoolean(false);
                hj81Var.A = gr81Var;
                hj81Var.B.a = gr81Var;
                ((Handler) this.c).post(new fe71(14, this, o471Var));
                break;
        }
    }

    @Override // defpackage.wq71
    public void b(dl61 dl61Var) {
        switch (this.a) {
            case 10:
                ((xrr) this.c).c(dl61Var.b, dl61Var.c);
                ((Handler) this.b).post(new p881(this, dl61Var, 3));
                break;
            default:
                ((xrr) this.w).c(dl61Var.b, dl61Var.c);
                ((Handler) this.c).post(new fe71(13, dl61Var, this));
                break;
        }
    }

    @Override // defpackage.sf81
    public void c(int i, v281 v281Var, nl81 nl81Var, pil0 pil0Var) {
        if (g(i, v281Var)) {
            ((sc81) this.c).f(nl81Var, pil0Var);
        }
    }

    @Override // defpackage.ar81
    public hn71 d(fe81 fe81Var, d881 d881Var, qb71 qb71Var) {
        yi61 yi61Var = (yi61) this.c;
        se71 se71Var = (se71) this.b;
        hn71 a = yi61Var.a(fe81Var, d881Var);
        if (qb71Var != null) {
            ArrayList a2 = yi61Var.b.a(qb71Var);
            if (!a2.isEmpty()) {
                a.j(a2, "image_sizes");
            }
        }
        a.r(se71Var.c, "ad_id");
        LinkedHashMap linkedHashMap = se71Var.k.a;
        if (linkedHashMap != null) {
            ((Map) a.b).putAll(linkedHashMap);
        }
        hn71 a3 = ((pf71) this.w).a(fe81Var.e);
        ((go71) this.x).getClass();
        return fga1.a(fga1.a(a, a3), go71.a(fe81Var));
    }

    public List e() {
        dl61 a;
        dl61 a2;
        try {
            ((cf71) this.w).l();
            a = null;
        } catch (q91 e) {
            dl61 dl61Var = so61.a;
            a = so61.a(1, e.getMessage(), e.c);
        }
        try {
            nq71 nq71Var = (nq71) this.x;
            Context context = (Context) this.c;
            if (nq71Var.b) {
                synchronized (nq71Var.a) {
                    try {
                        if (nq71Var.b) {
                            if (xga1.c(context)) {
                                nq71Var.c.a(context);
                                nq71Var.d.getClass();
                                d581.a(context);
                            }
                            nq71Var.b = false;
                        }
                    } finally {
                    }
                }
            }
            a2 = null;
        } catch (q91 e2) {
            dl61 dl61Var2 = so61.a;
            a2 = so61.a(1, e2.getMessage(), e2.c);
        }
        fe81 fe81Var = (fe81) this.b;
        return j73.A(new dl61[]{a, a2, fe81Var.c.a == null ? so61.l : null, fe81Var.e == null ? so61.i : null});
    }

    public hn71 f() {
        hn71 hn71Var;
        fe81 fe81Var = (fe81) this.b;
        hn71 hn71Var2 = new hn71(3, (HashMap) null);
        d881 d881Var = (d881) this.x;
        if (d881Var == null) {
            return hn71Var2;
        }
        hn71 a = fga1.a(hn71Var2, ((ai71) this.c).d(fe81Var, d881Var, (qb71) d881Var.q));
        zp1 zp1Var = fe81Var.k;
        cg81 cg81Var = (cg81) this.w;
        if (zp1Var != null) {
            cg81Var.getClass();
            hn71Var = cg81.a(zp1Var);
        } else {
            cg81Var.getClass();
            hn71Var = new hn71(2, new LinkedHashMap());
            hn71Var.r(g771.a, "adapter");
        }
        return fga1.a(a, hn71Var);
    }

    public boolean g(int i, v281 v281Var) {
        ov81 ov81Var = (ov81) this.x;
        vs81 vs81Var = (vs81) this.b;
        v281 v281Var2 = null;
        if (v281Var != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= vs81Var.c.size()) {
                    break;
                }
                if (((v281) vs81Var.c.get(i2)).d == v281Var.d) {
                    Object obj = v281Var.a;
                    Object obj2 = vs81Var.b;
                    int i3 = ii81.E;
                    v281Var2 = v281Var.b(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (v281Var2 == null) {
                return false;
            }
        }
        v281 v281Var3 = v281Var2;
        int i4 = i + vs81Var.d;
        sc81 sc81Var = (sc81) this.c;
        if (sc81Var.a != i4 || !rf71.o(sc81Var.b, v281Var3)) {
            this.c = new sc81(ov81Var.f.c, i4, v281Var3, 0L);
        }
        cw71 cw71Var = (cw71) this.w;
        if (cw71Var.a == i4 && rf71.o(cw71Var.b, v281Var3)) {
            return true;
        }
        this.w = new cw71(ov81Var.g.c, i4, v281Var3);
        return true;
    }

    public r691 h(r691 r691Var) {
        return ((p791) this.c).b(this, r691Var);
    }

    public r691 i(w491 w491Var) {
        r691 r691Var = r691.z5;
        Iterator i = w491Var.i();
        while (i.hasNext()) {
            r691Var = ((p791) this.c).b(this, w491Var.k(((Integer) i.next()).intValue()));
            if (r691Var instanceof g591) {
                break;
            }
        }
        return r691Var;
    }

    public cr71 j() {
        return new cr71(this, (p791) this.c);
    }

    @Override // defpackage.sf81
    public void k(int i, v281 v281Var, nl81 nl81Var, pil0 pil0Var) {
        if (g(i, v281Var)) {
            ((sc81) this.c).c(nl81Var, pil0Var);
        }
    }

    public boolean l(String str) {
        if (((HashMap) this.w).containsKey(str)) {
            return true;
        }
        cr71 cr71Var = (cr71) this.b;
        if (cr71Var != null) {
            return cr71Var.l(str);
        }
        return false;
    }

    @Override // defpackage.sf81
    public void m(int i, v281 v281Var, nl81 nl81Var, pil0 pil0Var) {
        if (g(i, v281Var)) {
            ((sc81) this.c).g(nl81Var, pil0Var);
        }
    }

    @Override // defpackage.sf81
    public void n(int i, v281 v281Var, nl81 nl81Var, pil0 pil0Var, IOException iOException, boolean z) {
        if (g(i, v281Var)) {
            ((sc81) this.c).d(nl81Var, pil0Var, iOException, z);
        }
    }

    public void o(String str, r691 r691Var) {
        cr71 cr71Var;
        HashMap hashMap = (HashMap) this.w;
        if (!hashMap.containsKey(str) && (cr71Var = (cr71) this.b) != null && cr71Var.l(str)) {
            cr71Var.o(str, r691Var);
        } else {
            if (((HashMap) this.x).containsKey(str)) {
                return;
            }
            if (r691Var == null) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, r691Var);
            }
        }
    }

    public void p(String str, r691 r691Var) {
        if (((HashMap) this.x).containsKey(str)) {
            return;
        }
        HashMap hashMap = (HashMap) this.w;
        if (r691Var == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, r691Var);
        }
    }

    public r691 q(String str) {
        HashMap hashMap = (HashMap) this.w;
        if (hashMap.containsKey(str)) {
            return (r691) hashMap.get(str);
        }
        cr71 cr71Var = (cr71) this.b;
        if (cr71Var != null) {
            return cr71Var.q(str);
        }
        ny61.g(b64.j(str, " is not defined"));
        return null;
    }

    @Override // defpackage.sf81
    public void s(int i, v281 v281Var, pil0 pil0Var) {
        if (g(i, v281Var)) {
            ((sc81) this.c).b(pil0Var);
        }
    }

    @Override // defpackage.sf81
    public void u(int i, v281 v281Var, pil0 pil0Var) {
        if (g(i, v281Var)) {
            ((sc81) this.c).e(pil0Var);
        }
    }

    @Override // defpackage.id91
    public Object zza() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 17:
                return new b491((x891) ((id91) obj).zza(), (tvb1) ((id91) this.c).zza(), (zmb1) ((id91) this.w).zza(), (d991) ((id91) this.x).zza());
            default:
                return new g9p(((s491) obj).b.a, (File) ((id91) this.c).zza(), (zmb1) ((id91) this.w).zza(), rb91.a((y491) this.x));
        }
    }

    @Override // defpackage.br91
    public void zzb(int i) {
        tvb1 tvb1Var = (tvb1) this.x;
        tvb1Var.g.post(new evb1(tvb1Var, (k391) this.b, 6, i));
    }

    @Override // defpackage.br91
    public void zzc() {
        Intent intent = (Intent) this.c;
        if (intent.getBooleanExtra("triggered_from_app_after_verification", false)) {
            ((tvb1) this.x).a.b("Splits copied and verified more than once.", new Object[0]);
        } else {
            intent.putExtra("triggered_from_app_after_verification", true);
            ((Context) this.w).sendBroadcast(intent);
        }
    }

    @Override // defpackage.br91
    /* renamed from: zza, reason: collision with other method in class */
    public void mo479zza() {
        tvb1 tvb1Var = (tvb1) this.x;
        tvb1Var.g.post(new evb1(tvb1Var, (k391) this.b, 5, 0));
    }

    public /* synthetic */ cr71(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }

    public cr71(Context context, int i) {
        this.a = i;
        switch (i) {
            case 3:
                lt71 lt71Var = new lt71();
                ix71 ix71Var = new ix71();
                i081 i081Var = new i081();
                this.b = lt71Var;
                this.c = ix71Var;
                this.w = i081Var;
                this.x = context.getApplicationContext();
                break;
            default:
                bi81 bi81Var = new bi81();
                xo71 xo71Var = new xo71();
                dv71 dv71Var = new dv71();
                this.b = bi81Var;
                this.c = xo71Var;
                this.w = dv71Var;
                this.x = context.getApplicationContext();
                break;
        }
    }

    public cr71(Context context, vi71 vi71Var, jl71 jl71Var) {
        a081 a081Var;
        this.a = 14;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        this.b = context;
        this.c = vi71Var;
        this.w = jl71Var;
        this.x = a081Var2;
    }

    public cr71(Context context, lq71 lq71Var) {
        ll61 ll61Var;
        this.a = 1;
        mj31 mj31Var = new mj31(context, lq71Var);
        ll61 ll61Var2 = ll61.d;
        if (ll61Var2 == null) {
            synchronized (ll61.c) {
                ll61Var = ll61.d;
                if (ll61Var == null) {
                    ll61Var = new ll61();
                    ll61.d = ll61Var;
                }
            }
            ll61Var2 = ll61Var;
        }
        zu71 zu71Var = new zu71();
        this.b = mj31Var;
        this.c = ll61Var2;
        this.w = zu71Var;
        this.x = context.getApplicationContext();
    }

    @Override // defpackage.dma1
    public void a(ZipFile zipFile, HashSet hashSet) {
        ((a3b1) this.x).c((a891) this.b, hashSet, new sl81(this));
    }

    public cr71(Context context, fe81 fe81Var) {
        this.a = 13;
        cf71 cf71Var = new cf71(context);
        rn71 rn71Var = nq71.e;
        nq71 nq71Var = nq71.f;
        if (nq71Var == null) {
            synchronized (rn71Var) {
                nq71Var = nq71.f;
                if (nq71Var == null) {
                    nq71Var = new nq71();
                    nq71.f = nq71Var;
                }
            }
        }
        this.c = context;
        this.b = fe81Var;
        this.w = cf71Var;
        this.x = nq71Var;
    }

    public cr71(Context context, fe81 fe81Var, v981 v981Var) {
        this.a = 8;
        rr41 rr41Var = new rr41(context, 13);
        mj31 mj31Var = new mj31(context, v981Var);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.b = fe81Var;
        this.c = rr41Var;
        this.w = mj31Var;
        this.x = newSingleThreadExecutor;
    }

    public cr71(Context context, fe81 fe81Var, v981 v981Var, e971 e971Var, a441 a441Var) {
        this.a = 16;
        Handler handler = new Handler(Looper.getMainLooper());
        xrr xrrVar = new xrr(context, fe81Var, e971Var, v981Var);
        this.b = a441Var;
        this.c = handler;
        this.w = xrrVar;
    }

    public cr71(Context context, fe81 fe81Var, v981 v981Var, e971 e971Var, cf71 cf71Var) {
        this.a = 10;
        Handler handler = new Handler(Looper.getMainLooper());
        xrr xrrVar = new xrr(context, fe81Var, e971Var, v981Var);
        cf71 cf71Var2 = new cf71(context, cf71Var);
        this.b = handler;
        this.c = xrrVar;
        this.w = cf71Var2;
    }

    public cr71(yp61 yp61Var, c971 c971Var) {
        this.a = 15;
        q981 q981Var = new q981();
        d291 d291Var = new d291(yp61Var, c971Var);
        em81 em81Var = new em81();
        this.b = yp61Var;
        this.c = q981Var;
        this.w = d291Var;
        this.x = em81Var;
    }

    public cr71(se71 se71Var) {
        this.a = 12;
        yi61 yi61Var = new yi61();
        pf71 pf71Var = new pf71();
        go71 go71Var = new go71();
        this.b = se71Var;
        this.c = yi61Var;
        this.w = pf71Var;
        this.x = go71Var;
    }

    public /* synthetic */ cr71(Object obj, Object obj2, Cloneable cloneable, Object obj3, int i) {
        this.a = i;
        this.x = obj;
        this.b = obj2;
        this.c = cloneable;
        this.w = obj3;
    }

    public cr71(cr71 cr71Var, p791 p791Var) {
        this.a = 18;
        this.w = new HashMap();
        this.x = new HashMap();
        this.b = cr71Var;
        this.c = p791Var;
    }

    public cr71(fe81 fe81Var) {
        this.a = 0;
        ai71 ai71Var = new ai71();
        cg81 cg81Var = new cg81();
        this.b = fe81Var;
        this.c = ai71Var;
        this.w = cg81Var;
    }

    public cr71(fe81 fe81Var, d881 d881Var, List list) {
        this.a = 5;
        v571 v571Var = new v571();
        this.b = fe81Var;
        this.x = d881Var;
        this.c = list;
        this.w = v571Var;
    }

    public cr71(fe81 fe81Var, v981 v981Var, nr41 nr41Var) {
        this.a = 7;
        vi71 vi71Var = new vi71(v981Var, 18);
        kn81 kn81Var = new kn81(v981Var);
        this.b = fe81Var;
        this.c = nr41Var;
        this.w = vi71Var;
        this.x = kn81Var;
    }

    public cr71(ov81 ov81Var, vs81 vs81Var) {
        this.a = 11;
        this.x = ov81Var;
        this.c = ov81Var.f;
        this.w = ov81Var.g;
        this.b = vs81Var;
    }
}
