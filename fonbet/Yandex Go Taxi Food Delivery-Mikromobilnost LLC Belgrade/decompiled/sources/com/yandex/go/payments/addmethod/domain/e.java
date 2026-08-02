package com.yandex.go.payments.addmethod.domain;

import com.yandex.go.payments.experiments.AddPaymentMethodButtonInMenuExperimentProvider$experiment$$inlined$start$1;
import defpackage.fga0;
import defpackage.li0;
import defpackage.lw90;
import defpackage.si0;
import defpackage.syw;
import defpackage.tpr;
import defpackage.zuj0;
import ru.yandex.taxi.am.m;

/* loaded from: classes8.dex */
public final class e implements si0 {
    public final com.yandex.go.route.interactor.b a;
    public final fga0 b;
    public final syw c;
    public final li0 d;
    public final m e;
    public final lw90 f;
    public final zuj0 g;

    public e(com.yandex.go.route.interactor.b bVar, fga0 fga0Var, syw sywVar, li0 li0Var, m mVar, lw90 lw90Var, zuj0 zuj0Var) {
        this.a = bVar;
        this.b = fga0Var;
        this.c = sywVar;
        this.d = li0Var;
        this.e = mVar;
        this.f = lw90Var;
        this.g = zuj0Var;
    }

    public final tpr a() {
        tpr t = kotlinx.coroutines.flow.e.t(new b(com.yandex.go.coroutines.b.d(this.e.f, new AddPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$$inlined$start$1(this, null))));
        tpr t2 = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.I(this.b.z(), new AddPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$3(2, null)));
        d dVar = new d(this.a.k());
        li0 li0Var = this.d;
        return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.m(t, t2, dVar, com.yandex.go.coroutines.b.d(li0Var.a.a(), new AddPaymentMethodButtonInMenuExperimentProvider$experiment$$inlined$start$1(null, li0Var)), new AddPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$5(this, null)));
    }
}
