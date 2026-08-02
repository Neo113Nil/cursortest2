package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.CouponUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.DeliveryBadgesUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.DialogueUiStateInteractor$dialogueUiStateFlow$$inlined$flatMapLatest$1;
import defpackage.b2k;
import defpackage.dex0;
import defpackage.gse;
import defpackage.igj;
import defpackage.ihp0;
import defpackage.jz8;
import defpackage.ltz0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ndx0;
import defpackage.ny61;
import defpackage.owh;
import defpackage.pjv0;
import defpackage.tpr;
import defpackage.viv0;
import defpackage.vpr;
import defpackage.vu30;
import defpackage.y7t0;
import defpackage.z1f;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.TariffCardUiStateInteractor$special$$inlined$flatMapLatest$1", f = "TariffCardUiStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class TariffCardUiStateInteractor$special$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ ltz0 $toolbarUiStateInteractor$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ dex0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffCardUiStateInteractor$special$$inlined$flatMapLatest$1(Continuation continuation, dex0 dex0Var, ltz0 ltz0Var) {
        super(3, continuation);
        this.this$0 = dex0Var;
        this.$toolbarUiStateInteractor$inlined = ltz0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TariffCardUiStateInteractor$special$$inlined$flatMapLatest$1 tariffCardUiStateInteractor$special$$inlined$flatMapLatest$1 = new TariffCardUiStateInteractor$special$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$toolbarUiStateInteractor$inlined);
        tariffCardUiStateInteractor$special$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        tariffCardUiStateInteractor$special$$inlined$flatMapLatest$1.L$1 = obj2;
        return tariffCardUiStateInteractor$special$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        dex0 dex0Var = this.this$0;
        jz8 jz8Var = dex0Var.l;
        z zVar = new z(new x(new v(new tpr[]{new com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.g(new com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.e(new com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.c(new com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.a(new tpr[]{new ru.yandex.taxi.requirements.utils.b(kotlinx.coroutines.flow.e.t(((com.yandex.go.taxi.tariffs.internal.repository.k) jz8Var.a).j.b())), jz8Var.d.a(jz8Var.c.b()), jz8Var.e.a()}, jz8Var))), jz8Var), dex0Var.c.a(), dex0Var.f.a}, dex0Var)));
        b bVar = dex0Var.b;
        tpr t = kotlinx.coroutines.flow.e.t(((com.yandex.go.taxi.tariffs.internal.repository.k) bVar.a).j.b());
        mth a = ((com.yandex.go.taxi.tariffs.internal.repository.k) bVar.c).j.a();
        kotlinx.coroutines.flow.r0 r0Var = bVar.i.b;
        tpr tprVar = bVar.k.b;
        viv0 viv0Var = bVar.d;
        viv0Var.getClass();
        g0 g0Var = new g0(kotlinx.coroutines.flow.e.t(new a(new tpr[]{t, a, r0Var, tprVar, kotlinx.coroutines.flow.e.t(new com.yandex.go.tariffcard.experiment.s(ru.yandex.taxi.experiments.d.a(viv0Var))), bVar.j.a(), ru.yandex.taxi.experiments.d.b(bVar.m)}, bVar)));
        tpr a2 = dex0Var.h.a();
        tpr a3 = dex0Var.j.a();
        z1f z1fVar = dex0Var.q;
        tpr t2 = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.s(((com.yandex.go.taxi.tariffs.internal.repository.k) z1fVar.a).j.b(), new gse(2)), new CouponUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1(null, z1fVar)));
        c cVar = dex0Var.d;
        b2k s = kotlinx.coroutines.flow.e.s(((com.yandex.go.taxi.tariffs.internal.repository.k) cVar.a).j.b(), new vu30(6));
        tpr t3 = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(s, cVar.c.a(s), com.yandex.go.coroutines.b.d(cVar.d.d(), new MultiTariffOptionsUiStateInteractor$uiStateFlow$$inlined$start$1(zy11Var, null)), new MultiTariffOptionsUiStateInteractor$uiStateFlow$1(cVar, null)));
        y7t0 y7t0Var = dex0Var.e;
        tpr t4 = kotlinx.coroutines.flow.e.t(new mth(new com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.m0(new com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.k0(new com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.i0(new tpr[]{y7t0Var.b.c, (tpr) y7t0Var.a.c}))), 6));
        tpr tprVar2 = dex0Var.g.c;
        ndx0 ndx0Var = dex0Var.k;
        kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.s(((com.yandex.go.taxi.tariffs.internal.repository.k) ndx0Var.a).j.b(), new pjv0(7)), new TariffCardSelectorUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1(null, ndx0Var));
        tpr tprVar3 = dex0Var.n.d;
        owh owhVar = dex0Var.o;
        tpr t5 = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.s(((com.yandex.go.taxi.tariffs.internal.repository.k) owhVar.a).j.b(), new gse(17)), new DeliveryBadgesUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1(owhVar, null)));
        igj igjVar = dex0Var.p;
        mth mthVar = new mth(new e0(new c0(new a0(new tpr[]{g0Var, zVar, a2, a3, t2, t3, t4, tprVar2, X, tprVar3, t5, kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.s(((com.yandex.go.taxi.tariffs.internal.repository.k) igjVar.a).j.b(), new gse(22)), new DialogueUiStateInteractor$dialogueUiStateFlow$$inlined$flatMapLatest$1(igjVar, null))), dex0Var.r.c, dex0Var.s.e, dex0Var.i.a()}, dex0Var, booleanValue))), 6);
        dex0 dex0Var2 = this.this$0;
        b2k s2 = kotlinx.coroutines.flow.e.s(new u(new s(new q(new tpr[]{mthVar, new i0(((com.yandex.go.taxi.tariffs.internal.repository.k) dex0Var2.t).j.b(), dex0Var2)}))), new pjv0(8));
        dex0 dex0Var3 = this.this$0;
        i0 i0Var = new i0(((com.yandex.go.taxi.tariffs.internal.repository.k) dex0Var3.t).j.b(), dex0Var3);
        ru.yandex.taxi.requirements.utils.b bVar2 = new ru.yandex.taxi.requirements.utils.b(this.$toolbarUiStateInteractor$inlined.b);
        ihp0 ihp0Var = this.this$0.m;
        tpr a4 = ru.yandex.taxi.experiments.d.a(ihp0Var.f);
        n0 n0Var = new n0(new l0(new j0(new tpr[]{i0Var, bVar2, mthVar, new ru.yandex.taxi.requirements.utils.b(kotlinx.coroutines.flow.e.t(com.yandex.go.coroutines.b.d(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(a4, ihp0Var.b.c, ihp0Var.c.c, new ScrollButtonUiStateInteractor$isScrollButtonEnabledFlow$1(4, null))), new ScrollButtonUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1(null, ihp0Var, s2, a4)), new ScrollButtonUiStateInteractor$uiStateFlow$$inlined$start$1(2, null))))})));
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        kotlinx.coroutines.flow.e.w(vprVar);
        Object collect = n0Var.collect(new kotlinx.coroutines.flow.h0(vprVar), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
