package com.yandex.go.tariffcard.ui;

import com.yandex.go.tariffcard.interactor.TariffRedirectAnimationInteractor$isEnabledFlow$$inlined$flatMapLatest$1;
import defpackage.b2k;
import defpackage.gix0;
import defpackage.ha2;
import defpackage.hhs0;
import defpackage.hix0;
import defpackage.iix0;
import defpackage.jha1;
import defpackage.jqr;
import defpackage.mth;
import defpackage.mvg;
import defpackage.nw70;
import defpackage.ny61;
import defpackage.pjv0;
import defpackage.pwy0;
import defpackage.tix0;
import defpackage.tpr;
import defpackage.trx0;
import defpackage.tse;
import defpackage.u1n;
import defpackage.uyj;
import defpackage.viv0;
import defpackage.vlx0;
import defpackage.wiq0;
import defpackage.wls;
import defpackage.x1f;
import defpackage.x421;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tariffcard.ui.TariffOptionsCardPresenter$attachView$1", f = "TariffOptionsCardPresenter.kt", l = {246}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffOptionsCardPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ gix0 $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ iix0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffOptionsCardPresenter$attachView$1(iix0 iix0Var, gix0 gix0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iix0Var;
        this.$mvpView = gix0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffOptionsCardPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffOptionsCardPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        kotlin.b.b(obj);
        tix0 tix0Var = this.this$0.x;
        tpr b = tix0Var.v.b();
        wiq0 wiq0Var = tix0Var.c;
        trx0 trx0Var = ((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).j;
        m mVar = new m(new k(new i(new tpr[]{new ru.yandex.taxi.requirements.utils.b(kotlinx.coroutines.flow.e.t(trx0Var.b())), tix0Var.y.a(b), tix0Var.z.a()}, tix0Var)));
        x421 x421Var = tix0Var.o;
        z zVar = new z(new x(new v(new tpr[]{mVar, kotlinx.coroutines.flow.e.X(((com.yandex.go.taxi.tariffs.internal.repository.k) x421Var.c).j.b(), new UnsupportedRequirementsInteractor$uiStateFlow$$inlined$flatMapLatest$1(null, x421Var)), tix0Var.F.a(b)}, tix0Var)));
        ru.yandex.taxi.requirements.utils.b bVar = new ru.yandex.taxi.requirements.utils.b(kotlinx.coroutines.flow.e.t(trx0Var.b()));
        jqr jqrVar = new jqr(kotlinx.coroutines.flow.e.t(trx0Var.b()), new TariffOptionsCardStateInteractor$headerFlow$1(tix0Var, null), 3);
        mth a = ((com.yandex.go.taxi.tariffs.internal.repository.k) tix0Var.i).j.a();
        u1n u1nVar = tix0Var.u;
        viv0 viv0Var = (viv0) u1nVar.c;
        viv0Var.getClass();
        com.yandex.go.tariffcard.interactor.e eVar = new com.yandex.go.tariffcard.interactor.e(kotlinx.coroutines.flow.e.t(new com.yandex.go.tariffcard.interactor.c(new com.yandex.go.tariffcard.experiment.q(ru.yandex.taxi.experiments.d.a(viv0Var)), u1nVar)), u1nVar);
        pwy0 pwy0Var = tix0Var.j;
        tpr a2 = pwy0Var.a();
        viv0 viv0Var2 = tix0Var.p;
        viv0Var2.getClass();
        ha2 l = kotlinx.coroutines.flow.e.l(jqrVar, a, eVar, a2, kotlinx.coroutines.flow.e.t(new com.yandex.go.tariffcard.experiment.s(ru.yandex.taxi.experiments.d.a(viv0Var2))), new TariffOptionsCardStateInteractor$headerFlow$2(tix0Var, null));
        x1f x1fVar = tix0Var.k;
        com.yandex.go.taxi.tariffs.repository.c e = jha1.e(wiq0Var);
        x1fVar.getClass();
        ru.yandex.taxi.requirements.utils.b bVar2 = new ru.yandex.taxi.requirements.utils.b(kotlinx.coroutines.flow.e.t(new o(new ru.yandex.taxi.preorder.summary.tariffpage.badge.d(e, x1fVar), tix0Var)));
        ru.yandex.taxi.requirements.utils.b bVar3 = new ru.yandex.taxi.requirements.utils.b(pwy0Var.a());
        ru.yandex.taxi.requirements.utils.b bVar4 = new ru.yandex.taxi.requirements.utils.b(new l0(tix0Var.s.a(jha1.e(wiq0Var))));
        ru.yandex.taxi.requirements.utils.b bVar5 = new ru.yandex.taxi.requirements.utils.b(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(trx0Var.b(), new TariffOptionsCardStateInteractor$deliveryBadgesFlow$$inlined$flatMapLatest$1(tix0Var, null))));
        com.yandex.go.taxi.tariffs.repository.c e2 = jha1.e(wiq0Var);
        ru.yandex.taxi.requirements.utils.b bVar6 = new ru.yandex.taxi.requirements.utils.b(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(new kotlinx.coroutines.flow.m0(e2, pwy0Var.a(), new TariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$1(3, null)), new TariffOptionsCardStateInteractor$deliveryPromotionBadgesFlow$$inlined$flatMapLatest$1(null, tix0Var, e2))));
        mth a3 = tix0Var.D.a();
        hhs0 hhs0Var = tix0Var.H;
        com.yandex.go.tariffcard.interactor.d0 d0Var = new com.yandex.go.tariffcard.interactor.d0(((ru.yandex.taxi.summary.requirements.list.interactors.l0) hhs0Var.b).a(), hhs0Var);
        b2k s = kotlinx.coroutines.flow.e.s(trx0Var.b(), new pjv0(14));
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.m(s, tix0Var.A.a(s), ((ru.yandex.taxi.styling.g) tix0Var.J).d(), com.yandex.go.coroutines.b.d(tix0Var.C.d(), new TariffOptionsCardStateInteractor$multiTariffOptionsFlow$$inlined$start$1(zy11Var, null)), new TariffOptionsCardStateInteractor$multiTariffOptionsFlow$1(tix0Var, null)));
        u uVar = new u(kotlinx.coroutines.flow.e.t(trx0Var.b()), tix0Var);
        nw70 nw70Var = tix0Var.E;
        mth mthVar = new mth(new e0(new c0(new a0(new tpr[]{bVar, l, bVar2, zVar, bVar3, bVar4, bVar5, bVar6, a3, d0Var, t, uVar, new com.yandex.go.tariffcard.interactor.i(((ru.yandex.taxi.summary.requirements.list.interactors.y) nw70Var.b).a(), nw70Var)}, tix0Var))), 6);
        n0 n0Var = new n0(mthVar);
        kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(pwy0Var.a(), new TariffOptionsCardStateInteractor$orderButtonFlow$$inlined$flatMapLatest$1(tix0Var, null));
        kotlinx.coroutines.flow.n b2 = tix0Var.g.b();
        kotlinx.coroutines.flow.internal.g a4 = tix0Var.G.a(n0Var);
        vlx0 vlx0Var = tix0Var.I;
        ha2 l2 = kotlinx.coroutines.flow.e.l(mthVar, X, b2, a4, kotlinx.coroutines.flow.e.X(new com.yandex.go.tariffcard.interactor.b0(ru.yandex.taxi.experiments.d.a(vlx0Var.b)), new TariffRedirectAnimationInteractor$isEnabledFlow$$inlined$flatMapLatest$1(null, vlx0Var)), new TariffOptionsCardStateInteractor$stateFlow$1(tix0Var, null));
        tix0Var.b.getClass();
        mth mthVar2 = new mth(new kotlinx.coroutines.flow.j0(null, kotlinx.coroutines.flow.e.F(l2, uyj.a), new TariffOptionsCardPresenter$attachView$1$invokeSuspend$$inlined$withPreviousEmit$1(3, null)), 6);
        gix0 gix0Var = this.$mvpView;
        kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(mthVar2, new TariffOptionsCardPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
        hix0 hix0Var = new hix0(gix0Var, 0);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 1;
        return oVar.collect(hix0Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
