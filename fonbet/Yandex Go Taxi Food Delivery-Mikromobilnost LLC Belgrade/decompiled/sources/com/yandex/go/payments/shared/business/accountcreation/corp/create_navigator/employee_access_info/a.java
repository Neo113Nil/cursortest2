package com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.employee_access_info;

import android.content.Context;
import defpackage.mdh;
import defpackage.o61;
import defpackage.p1b;
import defpackage.pgd;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vte;
import defpackage.w030;
import defpackage.wfd;
import defpackage.wte;

/* loaded from: classes13.dex */
public final class a extends pgd {
    public final Context F;
    public final w030 G;
    public final tt2 H;
    public final o61 I;
    public final com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.employee_access_info.domain.a J;
    public final p1b K;

    public a(Context context, w030 w030Var, tt2 tt2Var, o61 o61Var, com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.employee_access_info.domain.a aVar) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = tt2Var;
        this.I = o61Var;
        this.J = aVar;
        this.K = new p1b(aVar, new vte(this, 0));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tse o = o();
        this.H.getClass();
        sjh sjhVar = uyj.a;
        tje.N(o, mdh.b, null, new CorpAccountEmployeeAccessInfoModalRouter$onLaunch$1(this, (wte) obj, null), 2);
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
