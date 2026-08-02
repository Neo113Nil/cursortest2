package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.rgw;
import defpackage.sgw;
import defpackage.tgw;
import defpackage.tse;
import defpackage.ugw;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ltgw;", "<anonymous>", "(Ltse;)Ltgw;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$points$1$newDestinationPoint$1", f = "IntercityDashboardInteractor.kt", l = {210}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$points$1$newDestinationPoint$1 extends SuspendLambda implements wls {
    final /* synthetic */ ugw $points;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$points$1$newDestinationPoint$1(ugw ugwVar, f fVar, Continuation continuation) {
        super(2, continuation);
        this.$points = ugwVar;
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$points$1$newDestinationPoint$1(this.$points, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$points$1$newDestinationPoint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tgw tgwVar = this.$points.b;
            if (!(tgwVar instanceof rgw)) {
                return tgwVar;
            }
            rgw rgwVar = (rgw) tgwVar;
            zzs zzsVar = new zzs(rgwVar.a, rgwVar.b, 0, null, null, 28);
            ru.yandex.taxi.deeplinks.e eVar = this.this$0.m;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = ru.yandex.taxi.deeplinks.e.b(eVar, zzsVar, this, 30);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        pv0 pv0Var = (pv0) obj;
        this.this$0.i.l(pv0Var.a);
        return new sgw(pv0Var.a);
    }
}
