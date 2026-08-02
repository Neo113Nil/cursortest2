package com.yandex.go.tariffcard.interactor;

import com.yandex.go.tariffcard.ui.n0;
import defpackage.avj0;
import defpackage.jqr;
import defpackage.kyh0;
import defpackage.pjv0;
import defpackage.tpr;
import defpackage.wiq0;
import defpackage.wpj0;
import defpackage.y7r;
import defpackage.ypj0;
import defpackage.ytx;
import defpackage.zuj0;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;

/* loaded from: classes14.dex */
public final class x {
    public final zuj0 a;
    public final SummaryStateTracker b;
    public final wiq0 c;
    public final ypj0 d;
    public final wpj0 e;
    public final ytx f;
    public final y7r g;
    public final com.yandex.go.tariffcard.experiment.n h;

    public x(zuj0 zuj0Var, SummaryStateTracker summaryStateTracker, wiq0 wiq0Var, ypj0 ypj0Var, wpj0 wpj0Var, ytx ytxVar, y7r y7rVar, com.yandex.go.tariffcard.experiment.n nVar) {
        this.a = zuj0Var;
        this.b = summaryStateTracker;
        this.c = wiq0Var;
        this.d = ypj0Var;
        this.e = wpj0Var;
        this.f = ytxVar;
        this.g = y7rVar;
        this.h = nVar;
    }

    public final kotlinx.coroutines.flow.internal.g a(n0 n0Var) {
        tpr a = ru.yandex.taxi.experiments.d.a(this.h);
        String h = ((avj0) this.a).h(kyh0.tariff_requirements_scroll_button_title);
        r rVar = new r(n0Var, this);
        com.yandex.go.taxi.tariffs.internal.repository.k kVar = (com.yandex.go.taxi.tariffs.internal.repository.k) this.c;
        return kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.n(a, this.d.c, this.e.c, new TariffCardScrollButtonInteractor$isButtonEnabledFlow$1(4, null)), new TariffCardScrollButtonInteractor$stateFlow$$inlined$flatMapLatest$1(new jqr(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.l(rVar, kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.s(kVar.j.b(), new pjv0(6)), new TariffCardScrollButtonInteractor$getTariffCardStateFlow$$inlined$flatMapLatest$1(null, this)), a, kVar.j.b(), this.f.b, new TariffCardScrollButtonInteractor$getEnabledButtonStateFlow$1(h, null))), new TariffCardScrollButtonInteractor$getEnabledButtonStateFlow$2(2, this, x.class, "onScrollButtonStateChanged", "onScrollButtonStateChanged(Lcom/yandex/go/tariffcard/ui/model/TariffCardScrollButtonViewState;)V", 4), 3), null));
    }
}
