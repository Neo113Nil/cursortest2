package com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator;

import android.content.Context;
import defpackage.ate;
import defpackage.dte;
import defpackage.fte;
import defpackage.mdh;
import defpackage.n3h;
import defpackage.o61;
import defpackage.p1b;
import defpackage.pgd;
import defpackage.r10;
import defpackage.rte;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w030;
import defpackage.wfd;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class a extends pgd {
    public final Context F;
    public final w030 G;
    public final tt2 H;
    public final n3h I;
    public final o61 J;
    public final com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.domain.a K;
    public final fte L;
    public final r10 M;
    public final p1b N;

    public a(Context context, w030 w030Var, tt2 tt2Var, n3h n3hVar, o61 o61Var, com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.domain.a aVar, fte fteVar, r10 r10Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = tt2Var;
        this.I = n3hVar;
        this.J = o61Var;
        this.K = aVar;
        this.L = fteVar;
        this.M = r10Var;
        this.N = new p1b(fteVar, new dte(this, 0));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        r0 r0Var = this.L.a;
        rte rteVar = new rte();
        r0Var.getClass();
        r0Var.m(null, rteVar);
        tse o = o();
        this.H.getClass();
        sjh sjhVar = uyj.a;
        tje.N(o, mdh.b, null, new CorpAccountCreateNavigatorModalRouter$onLaunch$1(this, (ate) obj, null), 2);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.N;
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
