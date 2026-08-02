package com.yandex.go.taxi.order.tariff_upgrade.domain;

import defpackage.a3y0;
import defpackage.aqx0;
import defpackage.bqx0;
import defpackage.hst;
import defpackage.ist;
import defpackage.jl40;
import defpackage.jst;
import defpackage.ke00;
import defpackage.mpx0;
import defpackage.mvg;
import defpackage.npx0;
import defpackage.ny61;
import defpackage.w511;
import defpackage.wls;
import defpackage.wpx0;
import defpackage.xpx0;
import defpackage.ypx0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbqx0;", "tariffUpgrade", "Lzy11;", "<anonymous>", "(Lbqx0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.tariff_upgrade.domain.TariffUpgradeInteractor$tariffUpgradeFlow$3", f = "TariffUpgradeInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffUpgradeInteractor$tariffUpgradeFlow$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffUpgradeInteractor$tariffUpgradeFlow$3(l lVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TariffUpgradeInteractor$tariffUpgradeFlow$3 tariffUpgradeInteractor$tariffUpgradeFlow$3 = new TariffUpgradeInteractor$tariffUpgradeFlow$3(this.this$0, continuation);
        tariffUpgradeInteractor$tariffUpgradeFlow$3.L$0 = obj;
        return tariffUpgradeInteractor$tariffUpgradeFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TariffUpgradeInteractor$tariffUpgradeFlow$3 tariffUpgradeInteractor$tariffUpgradeFlow$3 = (TariffUpgradeInteractor$tariffUpgradeFlow$3) create((bqx0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        tariffUpgradeInteractor$tariffUpgradeFlow$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        bqx0 bqx0Var = (bqx0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        npx0 npx0Var = this.this$0.g;
        if (jl40.l(bqx0Var, xpx0.a)) {
            a3y0.e((a3y0) npx0Var.b.getValue(), new String[]{"TaxiOrder:TariffUpgrade", "Zone", "source"}, null, new mpx0(2), 2);
        } else if (bqx0Var instanceof ypx0) {
            Throwable th = ((ypx0) bqx0Var).a;
            a3y0 a3y0Var = (a3y0) npx0Var.b.getValue();
            String l = a3y0Var.l(new String[]{"TaxiOrder:TariffUpgrade", "Zone"});
            hst hstVar = jst.e;
            String str = a3y0Var.a;
            ist m = hstVar.m(l);
            ke00 a = m.b.a();
            if (a != null && a.b(15)) {
                a.a(15, str, th, "Failed to fetch zone to get tariff details info", m.a);
            }
        } else if (jl40.l(bqx0Var, wpx0.a)) {
            a3y0.d((a3y0) npx0Var.b.getValue(), "TaxiOrder:TariffUpgrade", null, new mpx0(1), 2);
        } else if (!(bqx0Var instanceof aqx0)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
