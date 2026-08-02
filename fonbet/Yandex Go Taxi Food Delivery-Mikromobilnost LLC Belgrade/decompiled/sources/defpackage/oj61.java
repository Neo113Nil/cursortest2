package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.a;
import yads.f5;

/* loaded from: classes7.dex */
public final class oj61 implements ct71 {
    public final j471 a;
    public final bq71 b;
    public final cf71 c;
    public final hn71 d;
    public final nr41 e;
    public final mj31 f;
    public final nr41 g;
    public final Handler h;
    public final a081 i;
    public final ta71 j;
    public final fl71 k;
    public final gp51 l;
    public final xm71 m;
    public final Context n;
    public final uid o;
    public d881 p;
    public hk61 q;
    public boolean r;
    public lm71 s;

    public oj61(Context context, j471 j471Var, bq71 bq71Var, v981 v981Var) {
        a081 a081Var;
        cf71 cf71Var = new cf71(context, bq71Var.b, bq71Var.a, v981Var);
        hn71 hn71Var = new hn71(bq71Var.b, bq71Var.c);
        fe81 fe81Var = bq71Var.b;
        nr41 nr41Var = new nr41(12, fe81Var);
        mj31 mj31Var = new mj31(fe81Var, bq71Var.c);
        nr41 nr41Var2 = new nr41(22, j471Var);
        Handler handler = new Handler(Looper.getMainLooper());
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
        ta71 ta71Var = new ta71();
        fl71 fl71Var = new fl71();
        gp51 gp51Var = new gp51(5, j471Var);
        xm71 xm71Var = new xm71();
        this.a = j471Var;
        this.b = bq71Var;
        this.c = cf71Var;
        this.d = hn71Var;
        this.e = nr41Var;
        this.f = mj31Var;
        this.g = nr41Var2;
        this.h = handler;
        this.i = a081Var2;
        this.j = ta71Var;
        this.k = fl71Var;
        this.l = gp51Var;
        this.m = xm71Var;
        Context applicationContext = context.getApplicationContext();
        this.n = applicationContext != null ? applicationContext : context;
        this.o = new uid(6, this);
    }

    @Override // defpackage.ct71
    public final void a(Context context, d881 d881Var) {
        this.b.a.b(f5.c, null);
        gg81 a = this.i.a(context);
        boolean z = a != null ? a.E : false;
        j471 j471Var = this.a;
        if (!z) {
            j471Var.h(so61.a);
            return;
        }
        if (this.r) {
            return;
        }
        a271 a271Var = j471Var.c.d.a;
        jd81 a2 = d881Var.a();
        this.p = d881Var;
        if (a271Var != null && i9a1.a(context, d881Var, a2, this.j, a271Var)) {
            this.c.n(d881Var, new lm71(15, this), new vi71(this, context, d881Var));
            return;
        }
        int b = a271Var != null ? ((jd81) a271Var).b(context) : 0;
        int a3 = a271Var != null ? ((jd81) a271Var).a(context) : 0;
        int i = a2.b;
        int i2 = a2.c;
        int g = sj71.g(context);
        int d = sj71.d(context);
        dl61 dl61Var = so61.a;
        dl61 a4 = so61.a(1, "Ad was loaded successfully, but there is not enough space to display it", String.format(Locale.US, "Ad was loaded successfully, but there is not enough space to display it. Requested size: [%dx%d], Received size : [%dx%d], device screen size: [%dx%d].", Arrays.copyOf(new Object[]{Integer.valueOf(b), Integer.valueOf(a3), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(g), Integer.valueOf(d)}, 6)));
        qc71.a(a4.c, new Object[0]);
        j471Var.h(a4);
    }

    @Override // defpackage.ct71
    public final List b() {
        hk61 hk61Var = this.q;
        this.k.getClass();
        if (!(hk61Var instanceof mw81)) {
            return scc.h(hk61Var != null ? hk61Var.e() : null);
        }
        ArrayList p = ((mw81) hk61Var).p();
        ArrayList arrayList = new ArrayList();
        Iterator it = p.iterator();
        while (it.hasNext()) {
            xn61 e = ((hk61) it.next()).e();
            if (e != null) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    @Override // defpackage.ct71
    public final String c() {
        hk61 hk61Var = this.q;
        if (hk61Var != null) {
            return hk61Var.c();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    @Override // defpackage.ct71
    public final String getAdInfo() {
        ?? h;
        hk61 hk61Var = this.q;
        this.k.getClass();
        if (hk61Var instanceof mw81) {
            ArrayList p = ((mw81) hk61Var).p();
            h = new ArrayList();
            Iterator it = p.iterator();
            while (it.hasNext()) {
                String g = ((hk61) it.next()).g();
                if (g != null) {
                    h.add(g);
                }
            }
        } else {
            h = scc.h(hk61Var != null ? hk61Var.g() : null);
        }
        List list = h;
        if (list.isEmpty()) {
            return null;
        }
        return a.X(list, ",", "[", "]", null, 56);
    }

    @Override // defpackage.ct71
    public final void a(Context context) {
        lm71 lm71Var = this.s;
        if (lm71Var != null) {
            uf81 uf81Var = (uf81) ((fp71) lm71Var.b).w;
            r581 r581Var = uf81Var.d;
            kgx kgxVar = uf81.e[0];
            ViewGroup viewGroup = (ViewGroup) r581Var.a.get();
            if (viewGroup != null) {
                ViewParent parent = viewGroup.getParent();
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    if (jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
                        viewGroup2.removeView(viewGroup);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new fe71(5, viewGroup2, viewGroup));
                    }
                }
            }
            cv81 cv81Var = uf81Var.c;
            if (cv81Var != null) {
                cv81Var.c();
            }
        }
        ((w381) this.c.c).a();
        this.p = null;
        this.q = null;
        this.r = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    @Override // defpackage.ct71
    public final String a() {
        ?? h;
        hk61 hk61Var = this.q;
        this.k.getClass();
        if (hk61Var instanceof mw81) {
            ArrayList p = ((mw81) hk61Var).p();
            h = new ArrayList();
            Iterator it = p.iterator();
            while (it.hasNext()) {
                String a = ((hk61) it.next()).a();
                if (a != null) {
                    h.add(a);
                }
            }
        } else {
            h = scc.h(hk61Var != null ? hk61Var.a() : null);
        }
        List list = h;
        if (list.isEmpty()) {
            return null;
        }
        return a.X(list, ",", "[", "]", null, 56);
    }
}
