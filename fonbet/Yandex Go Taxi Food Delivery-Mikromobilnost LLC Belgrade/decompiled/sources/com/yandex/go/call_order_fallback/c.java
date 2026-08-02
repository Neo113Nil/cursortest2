package com.yandex.go.call_order_fallback;

import android.content.Context;
import com.yandex.go.call_order_fallback.domain.e;
import defpackage.agd;
import defpackage.g92;
import defpackage.le4;
import defpackage.lj7;
import defpackage.mj7;
import defpackage.mu5;
import defpackage.pgd;
import defpackage.rj7;
import defpackage.sj7;
import defpackage.tj7;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uj7;
import defpackage.uyj;
import defpackage.w030;
import defpackage.wfd;
import defpackage.x3d;
import defpackage.yfd;
import defpackage.zy11;

/* loaded from: classes12.dex */
public final class c extends pgd {
    public final Context F;
    public final w030 G;
    public final tt2 H;
    public final e I;
    public final com.yandex.go.call_order_fallback.analytics.a J;
    public final mu5 K;

    public c(final uj7 uj7Var, final sj7 sj7Var, Context context, w030 w030Var, tt2 tt2Var, e eVar, com.yandex.go.call_order_fallback.analytics.a aVar) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = tt2Var;
        this.I = eVar;
        this.J = aVar;
        this.K = new mu5(new tls() { // from class: com.yandex.go.call_order_fallback.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                final yfd yfdVar = (yfd) obj;
                final c cVar = c.this;
                final mj7 mj7Var = new mj7(cVar);
                lj7 lj7Var = (lj7) ((agd) yfdVar).a;
                uj7Var.getClass();
                g92 g92Var = new g92(2, new tj7(lj7Var.a, lj7Var.b, lj7Var.c));
                agd agdVar = (agd) yfdVar;
                agdVar.c = g92Var;
                final sj7 sj7Var2 = sj7Var;
                agdVar.e = new tls() { // from class: com.yandex.go.call_order_fallback.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        tje.N(c.this.o(), null, null, new CallOrderFallbackRouter$content$1$1$1(sj7Var2, (rj7) obj2, yfdVar, mj7Var, null), 3);
                        return zy11.a;
                    }
                };
                agdVar.f = new le4(new CallOrderFallbackRouter$content$1$2(0, cVar.J, com.yandex.go.call_order_fallback.analytics.a.class, "closedByBackButton", "closedByBackButton()V", 0));
                x3d.a.getClass();
                agdVar.g = x3d.b;
                return zy11.a;
            }
        });
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tse o = o();
        this.H.getClass();
        tje.N(o, uyj.a, null, new CallOrderFallbackRouter$onLaunch$1(this, null), 2);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.K;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
