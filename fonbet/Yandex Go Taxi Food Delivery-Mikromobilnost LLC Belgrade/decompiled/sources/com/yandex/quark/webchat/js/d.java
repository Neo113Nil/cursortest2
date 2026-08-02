package com.yandex.quark.webchat.js;

import com.yandex.quark.js.QuarkJsState;
import com.yandex.quark.webchat.js.d;
import defpackage.bvf0;
import defpackage.d4h;
import defpackage.dsw;
import defpackage.e38;
import defpackage.ike;
import defpackage.ks1;
import defpackage.mih;
import defpackage.nfh;
import defpackage.olw0;
import defpackage.pzt0;
import defpackage.tc41;
import defpackage.thg0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.uc41;
import defpackage.uhg0;
import defpackage.yt1;
import defpackage.zhg0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class d implements thg0, yt1, olw0 {
    public final r0 A;
    public final d4h B;
    public final r0 C;
    public final r0 D;
    public final dsw a;
    public final tc41 b;
    public final ike c;
    public com.yandex.quark.lite.js.a y;
    public final LinkedHashSet w = new LinkedHashSet();
    public final LinkedHashSet x = new LinkedHashSet();
    public Set z = EmptySet.a;

    public d(dsw dswVar, tc41 tc41Var, ike ikeVar) {
        this.a = dswVar;
        this.b = tc41Var;
        this.c = ikeVar;
        r0 c = bvf0.c(kotlin.collections.b.f());
        this.A = c;
        this.B = new d4h(c, 1);
        this.C = bvf0.c(kotlin.collections.b.f());
        this.D = bvf0.c(kotlin.collections.b.f());
    }

    public static final void a(d dVar, e38 e38Var) {
        synchronized (dVar) {
            try {
                Iterator it = dVar.w.iterator();
                while (it.hasNext()) {
                    ((mih) ((uhg0) it.next())).c(e38Var);
                }
                Iterator it2 = dVar.x.iterator();
                while (it2.hasNext()) {
                    ((mih) ((uhg0) it2.next())).c(e38Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ks1 b(uc41 uc41Var) {
        QuarkJsFacadeRegistryImpl$registerWebCapabilities$1 quarkJsFacadeRegistryImpl$registerWebCapabilities$1 = new QuarkJsFacadeRegistryImpl$registerWebCapabilities$1(this, uc41Var, null);
        ike ikeVar = this.c;
        return new ks1(5, tje.N(ikeVar, null, null, quarkJsFacadeRegistryImpl$registerWebCapabilities$1, 3), tje.N(ikeVar, null, null, new QuarkJsFacadeRegistryImpl$registerNativeCapabilities$1(this, null), 3));
    }

    public final synchronized void c(final mih mihVar, nfh nfhVar) {
        d dVar;
        Throwable th;
        Throwable th2;
        try {
            try {
                if (kotlin.collections.a.G(this.x, mihVar) || kotlin.collections.a.G(this.w, mihVar)) {
                    return;
                }
                com.yandex.quark.lite.js.a aVar = this.y;
                if (aVar == null) {
                    try {
                        this.w.add(mihVar);
                    } catch (Throwable th3) {
                        th2 = th3;
                        dVar = this;
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        aVar.h(mihVar);
                        this.x.add(mihVar);
                    } catch (Throwable th4) {
                        dVar = this;
                        th2 = th4;
                        th = th2;
                        throw th;
                    }
                }
                mihVar.g(this.a);
                mihVar.k(this.z);
                final pzt0 N = tje.N(this.c, null, null, new QuarkJsFacadeRegistryImpl$observeSupportedFeatures$1(mihVar, this, null), 3);
                final pzt0 N2 = tje.N(this.c, null, null, new QuarkJsFacadeRegistryImpl$observeWebCapabilities$1(mihVar, this, null), 3);
                final pzt0 N3 = tje.N(this.c, null, null, new QuarkJsFacadeRegistryImpl$observeNativeCapabilities$1(nfhVar, this, mihVar, null), 3);
                mihVar.e(new zhg0() { // from class: vhg0
                    @Override // defpackage.zhg0
                    public final void d(QuarkJsState quarkJsState) {
                        d dVar2 = d.this;
                        mih mihVar2 = mihVar;
                        pzt0 pzt0Var = N;
                        pzt0 pzt0Var2 = N2;
                        pzt0 pzt0Var3 = N3;
                        int i = whg0.a[quarkJsState.ordinal()];
                        if (i != 1) {
                            if (i == 2 || i == 3 || i == 4) {
                                return;
                            }
                            w511.b();
                            return;
                        }
                        synchronized (dVar2) {
                            dVar2.w.remove(mihVar2);
                            dVar2.x.remove(mihVar2);
                        }
                        pzt0Var.a(null);
                        pzt0Var2.a(null);
                        pzt0Var3.a(null);
                    }
                });
            } catch (Throwable th5) {
                th = th5;
                th = th;
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            dVar = this;
            th = th;
            throw th;
        }
    }

    @Override // defpackage.thg0
    public final synchronized void f(com.yandex.quark.lite.js.a aVar) {
        try {
            this.y = aVar;
            for (uhg0 uhg0Var : this.w) {
                aVar.h(uhg0Var);
                this.x.add(uhg0Var);
            }
            this.w.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.olw0
    public final tpr j() {
        return this.B;
    }

    @Override // defpackage.yt1
    public final synchronized void k(Set set) {
        try {
            this.z = set;
            Iterator it = this.w.iterator();
            while (it.hasNext()) {
                ((mih) ((uhg0) it.next())).k(set);
            }
            Iterator it2 = this.x.iterator();
            while (it2.hasNext()) {
                ((mih) ((uhg0) it2.next())).k(set);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
