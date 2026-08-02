package com.yandex.passport.internal.ui.challenge.vpn;

import android.net.http.SslError;
import com.yandex.passport.internal.report.reporters.q0;
import com.yandex.passport.internal.ui.bouncer.model.c1;
import com.yandex.passport.internal.ui.challenge.delete.b1;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.l0;
import com.yandex.passport.sloth.n0;
import com.yandex.passport.sloth.u0;
import com.yandex.passport.sloth.ui.p0;
import com.yandex.passport.sloth.ui.string.SlothString;
import com.yandex.passport.sloth.ui.t0;
import com.yandex.passport.sloth.v0;
import defpackage.cma1;
import defpackage.g2g;
import defpackage.i5m;
import defpackage.n3w;
import defpackage.npi;
import defpackage.q5z;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.usx0;
import defpackage.v7p;
import defpackage.w511;
import defpackage.xv8;
import defpackage.xvf0;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o {
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public g2g a() {
        q5z.f(SlothParams.class, (SlothParams) this.a);
        q5z.f(com.yandex.passport.sloth.dependencies.f.class, (com.yandex.passport.sloth.dependencies.f) this.b);
        q5z.f(com.yandex.passport.sloth.dependencies.b.class, (com.yandex.passport.sloth.dependencies.b) this.c);
        com.yandex.passport.sloth.dependencies.b bVar = (com.yandex.passport.sloth.dependencies.b) this.c;
        SlothParams slothParams = (SlothParams) this.a;
        com.yandex.passport.sloth.dependencies.f fVar = (com.yandex.passport.sloth.dependencies.f) this.b;
        g2g g2gVar = new g2g();
        g2gVar.a = n3w.a(slothParams);
        g2gVar.b = i5m.c(com.yandex.passport.sloth.command.l.a);
        g2gVar.c = n3w.a(fVar);
        g2gVar.d = i5m.c(com.yandex.passport.sloth.command.performers.u.a);
        int i = 4;
        xvf0 b = i5m.b(cma1.i(new com.yandex.passport.internal.ui.j(i, new com.yandex.passport.sloth.dependencies.c(bVar, 7))));
        g2gVar.e = b;
        xvf0 b2 = i5m.b(cma1.i(new b1(b, 5)));
        g2gVar.f = b2;
        int i2 = 6;
        g2gVar.g = i5m.b(cma1.i(new b1(b2, i2)));
        com.yandex.passport.sloth.dependencies.c cVar = new com.yandex.passport.sloth.dependencies.c(bVar, 6);
        g2gVar.i = cVar;
        int i3 = 3;
        com.yandex.passport.internal.ui.j jVar = new com.yandex.passport.internal.ui.j(i3, cVar);
        g2gVar.j = jVar;
        g2gVar.h = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.g((Object) g2gVar.a, (yvf0) g2gVar.f, (yvf0) g2gVar.e, (yvf0) jVar, 4)));
        g2gVar.k = i5m.b(cma1.i(new q0(g2gVar.f, g2gVar.e, 15)));
        g2gVar.l = i5m.b(cma1.i(new com.yandex.passport.sloth.command.performers.k(g2gVar.f, 2)));
        g2gVar.m = i5m.b(cma1.i(new q0(g2gVar.e, g2gVar.f, 16)));
        g2gVar.n = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(g2gVar.f, 24)));
        g2gVar.o = i5m.b(cma1.i(new com.yandex.passport.sloth.command.performers.k(g2gVar.f, 1)));
        int i4 = 0;
        com.yandex.passport.sloth.dependencies.c cVar2 = new com.yandex.passport.sloth.dependencies.c(bVar, 0);
        g2gVar.p = cVar2;
        g2gVar.q = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.i(cVar2, g2gVar.f, g2gVar.a)));
        g2gVar.r = i5m.b(cma1.i(new com.yandex.passport.sloth.command.performers.k(g2gVar.f, i)));
        g2gVar.s = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(g2gVar.f, 27)));
        g2gVar.t = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f((yvf0) g2gVar.f, (v7p) g2gVar.a, 18)));
        xvf0 xvf0Var = g2gVar.f;
        g2gVar.u = new com.yandex.passport.internal.ui.bouncer.error.e(xvf0Var, 28);
        g2gVar.v = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(xvf0Var, 26)));
        g2gVar.w = new com.yandex.passport.sloth.command.performers.k((com.yandex.passport.sloth.dependencies.c) g2gVar.p, i4);
        xvf0 b3 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(g2gVar.f, 29)));
        g2gVar.x = b3;
        g2gVar.y = i5m.b(cma1.i(new c1(g2gVar.f, b3, i2)));
        g2gVar.z = i5m.b(cma1.i(new com.yandex.passport.sloth.command.performers.x(g2gVar.a, i4)));
        xvf0 xvf0Var2 = g2gVar.f;
        g2gVar.A = new com.yandex.passport.internal.ui.bouncer.error.e(xvf0Var2, 25);
        g2gVar.B = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.roundabout.items.d((yvf0) g2gVar.b, i5m.b(cma1.i(new npi(g2gVar.a, g2gVar.c, g2gVar.d, g2gVar.g, g2gVar.h, g2gVar.k, g2gVar.l, g2gVar.m, g2gVar.n, g2gVar.o, g2gVar.q, g2gVar.r, g2gVar.s, g2gVar.t, (com.yandex.passport.internal.ui.bouncer.error.e) g2gVar.u, g2gVar.v, (com.yandex.passport.sloth.command.performers.k) g2gVar.w, g2gVar.x, g2gVar.y, g2gVar.z, (com.yandex.passport.internal.ui.bouncer.error.e) g2gVar.A, i5m.b(cma1.i(new com.yandex.passport.sloth.command.performers.k(xvf0Var2, i3)))))), (yvf0) g2gVar.e, 5)));
        g2gVar.C = new com.yandex.passport.sloth.dependencies.c(bVar, 3);
        g2gVar.D = new com.yandex.passport.internal.ui.bouncer.f((yvf0) com.yandex.passport.sloth.url.f.a, (v7p) new com.yandex.passport.sloth.dependencies.c(bVar, 9), 21);
        g2gVar.E = new com.yandex.passport.sloth.dependencies.c(bVar, 2);
        g2gVar.F = i5m.c(com.yandex.passport.sloth.f.a);
        xvf0 b4 = i5m.b(cma1.i(new com.yandex.passport.sloth.i(new com.yandex.passport.sloth.dependencies.c(bVar, 5), g2gVar.e)));
        g2gVar.G = b4;
        g2gVar.H = i5m.b(cma1.i(new l0(g2gVar.a, g2gVar.E, (yvf0) g2gVar.F, (yvf0) g2gVar.e, (yvf0) g2gVar.f, b4)));
        g2gVar.I = i5m.b(cma1.i(new l0(g2gVar.a, g2gVar.C, g2gVar.D, (yvf0) g2gVar.H, i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.fallback.d(g2gVar.e, g2gVar.f, g2gVar.G, 11))), (yvf0) g2gVar.e)));
        g2gVar.J = new com.yandex.passport.sloth.dependencies.c(bVar, 10);
        g2gVar.K = new com.yandex.passport.sloth.dependencies.c(bVar, 8);
        com.yandex.passport.sloth.dependencies.c cVar3 = new com.yandex.passport.sloth.dependencies.c(bVar, 11);
        g2gVar.L = cVar3;
        g2gVar.M = new com.yandex.passport.sloth.dependencies.c(bVar, 1);
        g2gVar.N = new com.yandex.passport.sloth.dependencies.c(bVar, 4);
        g2gVar.O = i5m.b(cma1.i(new xv8(g2gVar.a, (com.yandex.passport.sloth.dependencies.c) g2gVar.J, (com.yandex.passport.sloth.dependencies.c) g2gVar.K, (com.yandex.passport.sloth.dependencies.c) g2gVar.L, (com.yandex.passport.sloth.dependencies.c) g2gVar.C, g2gVar.f, (com.yandex.passport.internal.ui.j) g2gVar.j, (com.yandex.passport.sloth.dependencies.c) g2gVar.M, (com.yandex.passport.sloth.dependencies.c) g2gVar.N, g2gVar.F, (com.yandex.passport.sloth.dependencies.c) g2gVar.i, i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f((Object) g2gVar.a, (yvf0) cVar3, 20))), g2gVar.e)));
        g2gVar.P = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.i(g2gVar.e, g2gVar.f, g2gVar.a, 4)));
        g2gVar.Q = i5m.b(cma1.i(new usx0(g2gVar.a, (yvf0) g2gVar.B, (yvf0) g2gVar.f, (yvf0) g2gVar.I, (yvf0) g2gVar.G, (yvf0) g2gVar.O, (yvf0) g2gVar.P, i5m.b(cma1.i(new com.yandex.passport.sloth.command.performers.x(g2gVar.a, 1))), (yvf0) g2gVar.e)));
        return g2gVar;
    }

    public void b(final tse tseVar, final com.yandex.passport.sloth.ui.b1 b1Var, final com.yandex.passport.sloth.ui.webview.f fVar) {
        String str;
        Map f;
        com.yandex.passport.sloth.ui.webview.c cVar = com.yandex.passport.sloth.ui.webview.c.c;
        com.yandex.passport.sloth.ui.webview.c cVar2 = com.yandex.passport.sloth.ui.webview.c.b;
        t0 t0Var = (t0) this.a;
        com.yandex.passport.sloth.ui.webview.c cVar3 = com.yandex.passport.sloth.ui.webview.c.a;
        boolean equals = fVar.equals(cVar3);
        com.yandex.passport.sloth.ui.webview.b bVar = com.yandex.passport.sloth.ui.webview.b.a;
        if (equals) {
            ((com.yandex.passport.sloth.b1) b1Var).c();
            final int i = 0;
            sls slsVar = new sls() { // from class: com.yandex.passport.sloth.ui.webview.l
                @Override // defpackage.sls
                public final Object invoke() {
                    int i2 = i;
                    zy11 zy11Var = zy11.a;
                    com.yandex.passport.sloth.ui.b1 b1Var2 = b1Var;
                    tse tseVar2 = tseVar;
                    switch (i2) {
                        case 0:
                            tje.N(tseVar2, null, null, new WebViewErrorProcessor$onError$1$1(b1Var2, null), 3);
                            break;
                        case 1:
                            tje.N(tseVar2, null, null, new WebViewErrorProcessor$onError$2$1(b1Var2, null), 3);
                            break;
                        default:
                            tje.N(tseVar2, null, null, new WebViewErrorProcessor$onError$3$1(b1Var2, null), 3);
                            break;
                    }
                    return zy11Var;
                }
            };
            t0Var.getClass();
            t0Var.d(SlothString.ERROR_404, new p0(slsVar));
        } else if (fVar.equals(cVar2)) {
            ((com.yandex.passport.sloth.b1) b1Var).c();
            final int i2 = 1;
            t0Var.e(new sls() { // from class: com.yandex.passport.sloth.ui.webview.l
                @Override // defpackage.sls
                public final Object invoke() {
                    int i22 = i2;
                    zy11 zy11Var = zy11.a;
                    com.yandex.passport.sloth.ui.b1 b1Var2 = b1Var;
                    tse tseVar2 = tseVar;
                    switch (i22) {
                        case 0:
                            tje.N(tseVar2, null, null, new WebViewErrorProcessor$onError$1$1(b1Var2, null), 3);
                            break;
                        case 1:
                            tje.N(tseVar2, null, null, new WebViewErrorProcessor$onError$2$1(b1Var2, null), 3);
                            break;
                        default:
                            tje.N(tseVar2, null, null, new WebViewErrorProcessor$onError$3$1(b1Var2, null), 3);
                            break;
                    }
                    return zy11Var;
                }
            });
        } else if (fVar.equals(cVar)) {
            ((com.yandex.passport.sloth.b1) b1Var).c();
            final int i3 = 2;
            t0Var.e(new sls() { // from class: com.yandex.passport.sloth.ui.webview.l
                @Override // defpackage.sls
                public final Object invoke() {
                    int i22 = i3;
                    zy11 zy11Var = zy11.a;
                    com.yandex.passport.sloth.ui.b1 b1Var2 = b1Var;
                    tse tseVar2 = tseVar;
                    switch (i22) {
                        case 0:
                            tje.N(tseVar2, null, null, new WebViewErrorProcessor$onError$1$1(b1Var2, null), 3);
                            break;
                        case 1:
                            tje.N(tseVar2, null, null, new WebViewErrorProcessor$onError$2$1(b1Var2, null), 3);
                            break;
                        default:
                            tje.N(tseVar2, null, null, new WebViewErrorProcessor$onError$3$1(b1Var2, null), 3);
                            break;
                    }
                    return zy11Var;
                }
            });
        } else if (fVar instanceof com.yandex.passport.sloth.ui.webview.d) {
            ((com.yandex.passport.sloth.b1) b1Var).c();
            t0Var.e(new sls() { // from class: com.yandex.passport.sloth.ui.webview.m
                @Override // defpackage.sls
                public final Object invoke() {
                    tje.N(tse.this, null, null, new WebViewErrorProcessor$onError$4$1(b1Var, fVar, null), 3);
                    return zy11.a;
                }
            });
        } else if (fVar.equals(bVar)) {
            t0Var.c();
        } else if (fVar instanceof com.yandex.passport.sloth.ui.webview.e) {
            ((com.yandex.passport.sloth.b1) b1Var).c();
            t0Var.e(new com.yandex.passport.internal.ui.sloth.plusdevices.w(10, this));
        } else if (!(fVar instanceof com.yandex.passport.sloth.ui.webview.a)) {
            w511.b();
            return;
        } else {
            t0Var.getClass();
            t0Var.d(SlothString.BLOCKED_URL, com.yandex.passport.sloth.ui.q0.b);
        }
        com.yandex.passport.sloth.ui.c1 c1Var = (com.yandex.passport.sloth.ui.c1) this.c;
        if (fVar.equals(bVar)) {
            str = "Error.Connection";
        } else if (fVar.equals(cVar3)) {
            str = "Error.Http4xx";
        } else if (fVar.equals(cVar2)) {
            str = "Error.Http5xx";
        } else if (fVar.equals(cVar)) {
            str = "Error.OnRenderProcessGone";
        } else if (fVar.equals(com.yandex.passport.sloth.ui.webview.a.a)) {
            str = "Error.BlockedUrl";
        } else if (fVar instanceof com.yandex.passport.sloth.ui.webview.d) {
            str = toString();
        } else {
            if (!(fVar instanceof com.yandex.passport.sloth.ui.webview.e)) {
                w511.b();
                return;
            }
            str = "Error.Ssl";
        }
        if (fVar instanceof com.yandex.passport.sloth.ui.webview.e) {
            u0 u0Var = u0.c;
            SslError sslError = ((com.yandex.passport.sloth.ui.webview.e) fVar).a;
            u0Var.getClass();
            f = v0.a(sslError);
        } else {
            f = kotlin.collections.b.f();
        }
        c1Var.a(new n0(str, f));
    }
}
