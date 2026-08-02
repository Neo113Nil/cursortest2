package com.yandex.div.core;

import defpackage.bay;
import defpackage.bd7;
import defpackage.btk;
import defpackage.c5l;
import defpackage.d5l;
import defpackage.fu11;
import defpackage.ngd0;
import defpackage.ppe0;
import defpackage.qpe0;
import defpackage.r8;
import defpackage.sls;
import defpackage.uqs;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class d extends btk implements qpe0 {
    public final c5l a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final bay c = new bay();
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicBoolean e = new AtomicBoolean();

    public d(c5l c5lVar) {
        this.a = c5lVar;
    }

    public static final void h(d dVar) {
        Map t;
        int i;
        int i2;
        dVar.getClass();
        ngd0.G.p();
        fu11 fu11Var = fu11.a;
        if (!fu11Var.a()) {
            fu11Var.b(new d5l(dVar, 3));
            return;
        }
        synchronized (dVar.b) {
            t = kotlin.collections.b.t(dVar.b);
        }
        int size = t.size();
        if (t.isEmpty()) {
            i = 0;
        } else {
            Iterator it = t.entrySet().iterator();
            i = 0;
            while (it.hasNext()) {
                if (((ppe0) ((Map.Entry) it.next()).getValue()).c) {
                    i++;
                }
            }
        }
        int i3 = size - i;
        int i4 = dVar.c.b;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = i4 + i3;
        if (t.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it2 = t.entrySet().iterator();
            i2 = 0;
            while (it2.hasNext()) {
                if (((ppe0) ((Map.Entry) it2.next()).getValue()).b) {
                    i2++;
                }
            }
        }
        int size2 = dVar.c.a.size() + i2;
        if (i5 == 0 && dVar.d.get() && dVar.e.compareAndSet(false, true)) {
            dVar.a.finish(size2 != 0);
        }
    }

    @Override // defpackage.btk
    public final void b() {
        i();
    }

    @Override // defpackage.btk
    public final void d(Throwable th) {
        ngd0.G.p();
        fu11 fu11Var = fu11.a;
        if (!fu11Var.a()) {
            fu11Var.b(new uqs(5, this, th));
            return;
        }
        if (th == null) {
            th = new UnknownError("No stack provided");
        }
        this.c.a.add(th);
        r0.b--;
        h(this);
    }

    @Override // defpackage.btk
    public final void f(r8 r8Var) {
        i();
    }

    @Override // defpackage.btk
    public final void g(bd7 bd7Var) {
        i();
    }

    public final void i() {
        ngd0.G.p();
        fu11 fu11Var = fu11.a;
        if (!fu11Var.a()) {
            fu11Var.b(new d5l(this, 0));
            return;
        }
        bay bayVar = this.c;
        bayVar.b--;
        h(this);
    }

    public final void j() {
        ngd0.G.p();
        fu11 fu11Var = fu11.a;
        if (!fu11Var.a()) {
            fu11Var.b(new d5l(this, 1));
        } else {
            this.d.set(true);
            h(this);
        }
    }

    public final void k() {
        ngd0.G.p();
        fu11 fu11Var = fu11.a;
        if (!fu11Var.a()) {
            fu11Var.b(new d5l(this, 2));
        } else {
            this.c.b++;
        }
    }

    public final ppe0 l(String str) {
        String str2 = "preload#" + new Object().hashCode() + '/' + str;
        ppe0 ppe0Var = new ppe0(new sls() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$registerPreloading$completion$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                d.h(d.this);
                return zy11.a;
            }
        }, str);
        synchronized (this.b) {
            this.b.put(str2, ppe0Var);
        }
        return ppe0Var;
    }
}
