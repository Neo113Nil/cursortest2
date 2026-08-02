package com.yandex.go.preorder.lifecycle;

import defpackage.dqe0;
import defpackage.ffx;
import defpackage.jqr;
import defpackage.pft0;
import defpackage.sjh;
import defpackage.tft0;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vld0;
import defpackage.vng;
import defpackage.wiq0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;

/* loaded from: classes13.dex */
public final class d implements pft0 {
    public final wiq0 a;
    public final com.yandex.go.route.interactor.c b;
    public final dqe0 c;
    public final RequirementsChangedNotifier d;
    public final tft0 e;
    public final tt2 f;
    public final n0 g = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public d(wiq0 wiq0Var, com.yandex.go.route.interactor.c cVar, dqe0 dqe0Var, RequirementsChangedNotifier requirementsChangedNotifier, tft0 tft0Var, tt2 tt2Var) {
        this.a = wiq0Var;
        this.b = cVar;
        this.c = dqe0Var;
        this.d = requirementsChangedNotifier;
        this.e = tft0Var;
        this.f = tt2Var;
    }

    @Override // defpackage.pft0
    public final void a(tse tseVar) {
        jqr jqrVar = new jqr(this.d.a, new PreorderParamsChangeLifecycleListener$requirementsChangedFlow$1(this, null), 3);
        this.f.getClass();
        sjh sjhVar = uyj.a;
        com.yandex.go.coroutines.b.h(tseVar, kotlinx.coroutines.flow.e.F(jqrVar, sjhVar));
        com.yandex.go.coroutines.b.h(tseVar, kotlinx.coroutines.flow.e.F(new jqr(vng.l(((com.yandex.go.taxi.tariffs.internal.repository.k) this.a).j.b(), new vld0(17), vng.c), new PreorderParamsChangeLifecycleListener$selectedTariffChangedFlow$2(this, null), 3), sjhVar));
    }

    @Override // defpackage.pft0
    public final void d(tse tseVar) {
        jqr jqrVar = new jqr(this.g, new PreorderParamsChangeLifecycleListener$invokeSuggestFlow$1(this, null), 3);
        this.f.getClass();
        com.yandex.go.coroutines.b.h(tseVar, kotlinx.coroutines.flow.e.F(jqrVar, uyj.a));
    }
}
