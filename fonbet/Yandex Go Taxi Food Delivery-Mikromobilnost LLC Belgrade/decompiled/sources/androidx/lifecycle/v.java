package androidx.lifecycle;

import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import defpackage.avy;
import defpackage.bvy;
import defpackage.c43;
import defpackage.mbs;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pey;
import defpackage.pq60;
import defpackage.vol0;
import defpackage.wol0;
import defpackage.xol0;
import defpackage.yol0;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class v {
    public static final Object k = new Object();
    public final Object a;
    public final yol0 b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final mbs j;

    public v() {
        this.a = new Object();
        this.b = new yol0();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new mbs(6, this);
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        c43.a().a.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        ny61.r(oyr.p("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(bvy bvyVar) {
        if (bvyVar.b) {
            if (!bvyVar.d()) {
                bvyVar.a(false);
                return;
            }
            int i = bvyVar.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            bvyVar.c = i2;
            bvyVar.a.a(this.e);
        }
    }

    public final void c(bvy bvyVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (bvyVar != null) {
                b(bvyVar);
                bvyVar = null;
            } else {
                yol0 yol0Var = this.b;
                yol0Var.getClass();
                wol0 wol0Var = new wol0(yol0Var);
                yol0Var.c.put(wol0Var, Boolean.FALSE);
                while (wol0Var.hasNext()) {
                    b((bvy) ((Map.Entry) wol0Var.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public Object d() {
        Object obj = this.e;
        if (obj != k) {
            return obj;
        }
        return null;
    }

    public final boolean e() {
        return this.c > 0;
    }

    public final void f(pey peyVar, pq60 pq60Var) {
        Object obj;
        a("observe");
        if (peyVar.getLifecycle().b() == Lifecycle.State.DESTROYED) {
            return;
        }
        u uVar = new u(this, peyVar, pq60Var);
        yol0 yol0Var = this.b;
        vol0 a = yol0Var.a(pq60Var);
        if (a != null) {
            obj = a.b;
        } else {
            vol0 vol0Var = new vol0(pq60Var, uVar);
            yol0Var.w++;
            vol0 vol0Var2 = yol0Var.b;
            if (vol0Var2 == null) {
                yol0Var.a = vol0Var;
                yol0Var.b = vol0Var;
            } else {
                vol0Var2.c = vol0Var;
                vol0Var.w = vol0Var2;
                yol0Var.b = vol0Var;
            }
            obj = null;
        }
        bvy bvyVar = (bvy) obj;
        if (bvyVar != null && !bvyVar.c(peyVar)) {
            ny61.g("Cannot add the same observer with different lifecycles");
        } else {
            if (bvyVar != null) {
                return;
            }
            peyVar.getLifecycle().a(uVar);
        }
    }

    public final void g(pq60 pq60Var) {
        Object obj;
        a("observeForever");
        avy avyVar = new avy(this, pq60Var);
        yol0 yol0Var = this.b;
        vol0 a = yol0Var.a(pq60Var);
        if (a != null) {
            obj = a.b;
        } else {
            vol0 vol0Var = new vol0(pq60Var, avyVar);
            yol0Var.w++;
            vol0 vol0Var2 = yol0Var.b;
            if (vol0Var2 == null) {
                yol0Var.a = vol0Var;
                yol0Var.b = vol0Var;
            } else {
                vol0Var2.c = vol0Var;
                vol0Var.w = vol0Var2;
                yol0Var.b = vol0Var;
            }
            obj = null;
        }
        bvy bvyVar = (bvy) obj;
        if (bvyVar instanceof u) {
            ny61.g("Cannot add the same observer with different lifecycles");
        } else {
            if (bvyVar != null) {
                return;
            }
            avyVar.a(true);
        }
    }

    public void h() {
    }

    public void i() {
    }

    public void j(pq60 pq60Var) {
        a("removeObserver");
        bvy bvyVar = (bvy) this.b.b(pq60Var);
        if (bvyVar == null) {
            return;
        }
        bvyVar.b();
        bvyVar.a(false);
    }

    public final void k(pey peyVar) {
        a("removeObservers");
        Iterator it = this.b.iterator();
        while (true) {
            xol0 xol0Var = (xol0) it;
            if (!xol0Var.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) xol0Var.next();
            if (((bvy) entry.getValue()).c(peyVar)) {
                j((pq60) entry.getKey());
            }
        }
    }

    public void l(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public v(Object obj) {
        this.a = new Object();
        this.b = new yol0();
        this.c = 0;
        this.f = k;
        this.j = new mbs(6, this);
        this.e = obj;
        this.g = 0;
    }
}
